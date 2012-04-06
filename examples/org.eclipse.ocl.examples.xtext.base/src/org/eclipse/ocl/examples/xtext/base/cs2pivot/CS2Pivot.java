/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: CS2Pivot.java,v 1.13 2011/05/20 15:27:24 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagedAdapter;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.utilities.AbstractConversion;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.Pivot2CS;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.CSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.utilities.CSI2PivotMapping;
import org.eclipse.osgi.util.NLS;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * CS2Pivot manages the equivalence between a Concrete Syntax Resources
 * and their corresponding Pivot Resources creating a CS2PivotConversion
 * to update.
 */
public class CS2Pivot extends AbstractConversion implements MetaModelManagedAdapter
{	
	private static final Logger logger = Logger.getLogger(CS2Pivot.class);

	public static interface Factory {
		BaseCSVisitor<Element, CS2PivotConversion> createLeft2RightVisitor(CS2PivotConversion cs2PivotConversion);
		BaseCSVisitor<Continuation<?>, CS2PivotConversion> createPostOrderVisitor(CS2PivotConversion converter);
		BaseCSVisitor<Continuation<?>, CS2PivotConversion> createPreOrderVisitor(CS2PivotConversion converter);
		BaseCSVisitor<CSScopeAdapter, Object> createScopeVisitor();
		EPackage getEPackage();
	}
	
	private static Map<EPackage, Factory> factoryMap = new HashMap<EPackage, Factory>();
	
	public static void addFactory(Factory factory) {
		factoryMap.put(factory.getEPackage(), factory);
	}

	public static abstract class UnresolvedProxyMessageProvider
	{
		protected final EReference eReference;
		
		public UnresolvedProxyMessageProvider(EReference eReference) {
			this.eReference = eReference;
		}
		public EReference getEReference() {
			return eReference;
		}
		
		public abstract String getMessage(EObject context, String linkText);
	}
	
	private static Map<EReference, UnresolvedProxyMessageProvider> unresolvedProxyMessageProviderMap = new HashMap<EReference, UnresolvedProxyMessageProvider>();

	/**
	 * Whether to show file and line number context at the start of messages.
	 */
	public static boolean showContext = false;

	/**
	 * Interface for an optional message binder that may be used to affix additional context
	 * for standalone and command line applications.
	 */
	public static interface MessageBinder
	{
		String bind(EObject csContext, String messageTemplate, Object... bindings);	
	}

	/**
	 * Default message binder that just invokes {@link NLS.bind}.
	 */
	public static class DefaultMessageBinder implements CS2Pivot.MessageBinder
	{
		public static final MessageBinder INSTANCE = new DefaultMessageBinder();

		public String bind(EObject csContext, String messageTemplate, Object... bindings) {
			return NLS.bind(messageTemplate, bindings);
		}
	}

	/**
	 * Message binder that prefixes the uri and line number to the return from {@link NLS.bind}.
	 */
	public static class MessageBinderWithLineContext implements CS2Pivot.MessageBinder
	{
		public static final MessageBinder INSTANCE = new MessageBinderWithLineContext();

		public String bind(EObject csContext, String messageTemplate, Object... bindings) {
			String message = NLS.bind(messageTemplate, bindings);
			if (csContext != null) {
				ICompositeNode node = NodeModelUtils.getNode(csContext);
				if (node != null) {
					int startLine = node.getStartLine();
					String uri = csContext.eResource().getURI().toString();
					return uri + ":" + startLine + " " + message;
				}
			}
			return message;
		}
	}
	
	private static MessageBinder messageBinder = DefaultMessageBinder.INSTANCE;

	public static void addUnresolvedProxyMessageProvider(UnresolvedProxyMessageProvider unresolvedProxyMessageProvider) {
		unresolvedProxyMessageProviderMap.put(unresolvedProxyMessageProvider.getEReference(), unresolvedProxyMessageProvider);
	}

	public static Element basicGetType(TypedTypeRefCS csTypedRef) {
		List<PathElementCS> path = csTypedRef.getPathName().getPath();
		int iLast = path.size()-1;
		for (int i = 0; i < iLast; i++) {
			Element element = path.get(i).basicGetElement();
			if (element == null) {
				return null;
			}
		}
		Element element = path.get(iLast).basicGetElement();
		if (element == null) {
			return null;
		}
		return element;
	}

	public static DiagnosticMessage getUnresolvedProxyMessage(EReference eReference, EObject csContext, String linkText) {
		String message = getUnresolvedProxyText(eReference, csContext, linkText);
		return message != null ? new DiagnosticMessage(message, Severity.ERROR, Diagnostic.LINKING_DIAGNOSTIC) : null;
	}	

	public static String getUnresolvedProxyText(EReference eReference, EObject csContext, String linkText) {
		ExceptionAdapter exceptionAdapter = PivotUtil.getAdapter(ExceptionAdapter.class, csContext);
		if (exceptionAdapter != null) {
			return exceptionAdapter.getException().getLocalizedMessage();
		}
		UnresolvedProxyMessageProvider unresolvedProxyMessageProvider = unresolvedProxyMessageProviderMap.get(eReference);
		if (unresolvedProxyMessageProvider != null) {
			return unresolvedProxyMessageProvider.getMessage(csContext, linkText);
		}
		String messageTemplate = OCLMessages.Unresolved_ERROR_;
		String errorContext = "Unknown";
		if (eReference != null) {
			EClass referenceType = eReference.getEReferenceType();
			if (referenceType != null) {
				errorContext = referenceType.getName();
			}
		}
		return messageBinder.bind(csContext, messageTemplate, errorContext, linkText);
	}	
	
	public static CS2Pivot findAdapter(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return null;
		}
		return PivotUtil.getAdapter(CS2Pivot.class, resourceSet);
	}

	public static List<ILeafNode> getDocumentationNodes(ICompositeNode node) {
		List<ILeafNode> documentationNodes = null;
		for (INode childNode : node.getChildren()) {
			if (!(childNode instanceof ILeafNode)) {
				break;
			}
			ILeafNode leafNode = (ILeafNode) childNode;
			EObject grammarElement = leafNode.getGrammarElement();
			if (!(grammarElement instanceof TerminalRule)) {
				break;
			}
			TerminalRule terminalRule = (TerminalRule) grammarElement;
			String name = terminalRule.getName();
			if ("WS".equals(name)) {
			}
			else if ("SL_COMMENT".equals(name)) {
			}
			else if ("ML_COMMENT".equals(name)) {
				String text = NodeModelUtils.getTokenText(leafNode);
				if (text.startsWith("/**")) {
					if (documentationNodes == null) {
						documentationNodes = new ArrayList<ILeafNode>();
					}
					documentationNodes.add(leafNode);
				}
			}
			else {
				break;
			}
		}
		return documentationNodes;
	}
	
	public static MessageBinder getMessageBinder() {
		return messageBinder;
	}

	public static void setElementType(PathNameCS pathNameCS, EClass elementType, ElementCS csContext) {
		pathNameCS.setContext(csContext);
		List<PathElementCS> path = pathNameCS.getPath();
		int iMax = path.size()-1;
		path.get(iMax).setElementType(elementType);
		if (PivotPackage.Literals.FEATURE.isSuperTypeOf(elementType) && (iMax > 0)) {
			path.get(--iMax).setElementType(PivotPackage.Literals.TYPE);
		}
		for (int i = 0; i < iMax; i++) {
			path.get(i).setElementType(PivotPackage.Literals.NAMESPACE);
		}
	}
	
	/**
	 * Define an alternative message binder. THe default null messageBinder uses
	 * {@link NLS.bind} 
	 */
	public static MessageBinder setMessageBinder(MessageBinder messageBinder) {
		MessageBinder savedMessageBinder = CS2Pivot.messageBinder;
		CS2Pivot.messageBinder = messageBinder;
		return savedMessageBinder;
	}
	
	protected final MetaModelManager metaModelManager;
	
	/**
	 * Mapping of each CS resource to its corresponding pivot Resource.
	 */
	protected final Map<? extends Resource, ? extends Resource> cs2pivotResourceMap;

	/**
	 * CS to Pivot mapping controller for aliases and CSIs.
	 */
	protected final CSI2PivotMapping cs2PivotMapping;

	private final Map<EPackage, BaseCSVisitor<CSScopeAdapter, Object>> scopeVisitorMap = new HashMap<EPackage, BaseCSVisitor<CSScopeAdapter, Object>>();

	/**
	 * A lazily created inverse map that may be required for navigation from an outline.
	 */
	private Map<Element, ModelElementCS> pivot2cs = null;

	public CS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, MetaModelManager metaModelManager) {
		Pivot2CS pivot2cs = Pivot2CS.findAdapter(metaModelManager.getPivotResourceSet());
		if (pivot2cs != null) {
			this.cs2PivotMapping = pivot2cs.getCs2PivotMapping();
		}
		else {
			this.cs2PivotMapping = new CSI2PivotMapping(cs2pivotResourceMap.keySet());
		}
		this.cs2pivotResourceMap = cs2pivotResourceMap;
		this.metaModelManager = metaModelManager;
		metaModelManager.addListener(this);
		metaModelManager.getPivotResourceSet().eAdapters().add(this);
	}
	
	public CS2Pivot(CS2Pivot aConverter) {
		this.cs2pivotResourceMap = aConverter.cs2pivotResourceMap;
		this.cs2PivotMapping = new CSI2PivotMapping(aConverter.cs2PivotMapping);
		this.metaModelManager = aConverter.metaModelManager;
	}

	public String bind(EObject csContext, String messageTemplate, Object... bindings) {
		return messageBinder.bind(csContext, messageTemplate, bindings);
	}

	public Map<Element, ModelElementCS> computePivot2CSMap() {
		Map<Element, ModelElementCS> map = new HashMap<Element, ModelElementCS>();
		for (Resource csResource : cs2pivotResourceMap.keySet()) {
			for (Iterator<EObject> it = csResource.getAllContents(); it.hasNext(); ) {
				EObject eObject = it.next();
				if (eObject instanceof ModelElementCS) {
					ModelElementCS csElement = (ModelElementCS)eObject;
					Element pivotElement = csElement.getPivot();
					map.put(pivotElement, csElement);
				}
			}
		}
		return map;
	}

	public void dispose() {
		cs2pivotResourceMap.clear();
		cs2PivotMapping.clear();
		scopeVisitorMap.clear();
		pivot2cs = null;
		metaModelManager.getPivotResourceSet().eAdapters().remove(this);
	}

	public ModelElementCS getCSElement(Element pivotElement) {
		if (pivot2cs == null) {
			pivot2cs = computePivot2CSMap();
		}
		return pivot2cs.get(pivotElement);
	}

	public Collection<? extends Resource> getCSResources() {
		return cs2pivotResourceMap.keySet();
	}

	public Factory getFactory(EPackage ePackage) {
		return factoryMap.get(ePackage);
	}

	public Element getPivotElement(ModelElementCS csElement) {
//		String csi = cs2PivotMapping.getCSI(csElement);
//		return csi2pivot.get(csi);
		return cs2PivotMapping.get(csElement);
	}

	public <T extends Element> T getPivotElement(Class<T> pivotClass, ModelElementCS csElement) {
//		String csi = cs2PivotMapping.getCSI(csElement);
//		Element pivotElement = csi2pivot.get(csi);
		Element pivotElement = cs2PivotMapping.get(csElement);
		if (pivotElement == null) {
			return null;
		}
		if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			throw new ClassCastException(pivotElement.getClass().getName() + " is not assignable to " + pivotClass.getName());
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
		return castElement;
	}

	public Resource getPivotResource(Resource csResource) {
		return cs2pivotResourceMap.get(csResource);
	}

	public Collection<? extends Resource> getPivotResources() {
		return metaModelManager.getPivotResourceSet().getResources();//cs2pivotResourceMap.values();
	}

	public BaseCSVisitor<CSScopeAdapter, Object> getScopeVisitor(EPackage ePackage) {
		BaseCSVisitor<CSScopeAdapter, Object> scopeVisitor = scopeVisitorMap.get(ePackage);
		if ((scopeVisitor == null) && !scopeVisitorMap.containsKey(ePackage)) {
			Factory factory = getFactory(ePackage);
			if (factory != null) {
				scopeVisitor = factory.createScopeVisitor();
				if (scopeVisitor == null) {
					logger.error("No Scope Visitor created for " + ePackage.getName());
				}
			}
			else {
				logger.error("No Scope Visitor Factory registered for " + ePackage.getName());
			}
			scopeVisitorMap.put(ePackage, scopeVisitor);
		}
		return scopeVisitor;
	}

	public Notifier getTarget() {
		return metaModelManager.getPivotResourceSet();
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}
	
	/**
	 * Install the mapping from a CS element that defines a pivot element to the defined pivot element. The definition
	 * is 'owned' by the CS element, so if the CS element vanishes, so does the pivot element.
	 */
	public void installPivotDefinition(ModelElementCS csElement, Element newPivotElement) {
	//	logger.trace("Installing " + csElement.getDescription()); //$NON-NLS-1$ //$NON-NLS-2$	
		EObject oldPivotElement = csElement.getPivot();	
		if (oldPivotElement != newPivotElement) {
			assert !newPivotElement.eIsProxy();
			csElement.setPivot(newPivotElement);
			if (oldPivotElement != null) {
				// WIP Queue dead element
			}
		}
//		String csi = cs2PivotMapping.getCSI(csElement);
//		csi2pivot.put(csi, newPivotElement);
		cs2PivotMapping.put(csElement, newPivotElement);
	}
	
	/**
	 * Install the mapping from a CS element to a completely independent pivot element. If the pivot element vanishes, the
	 * reference is stale, if the CS element the pivot element is less referenced.
	 */
	public void installPivotReference(ElementRefCS csElement, Element newPivotElement, EReference eReference) {
		assert eReference.getEContainingClass().isSuperTypeOf(csElement.eClass());
	//	logger.trace("Installing " + csElement.getDescription()); //$NON-NLS-1$ //$NON-NLS-2$	
		EObject oldPivotElement = csElement.getPivot();	
		if (oldPivotElement != newPivotElement) {
			assert !newPivotElement.eIsProxy();
			csElement.setPivot(newPivotElement);
		}
	}
	
	/**
	 * Install the mapping from a CS element to a related pivot element. This normally arises when more than one CS element
	 * are associated with a single pivot element. In this case one of the CS elements is the defining CS element and the
	 * others are users.
	 */
	public void installPivotUsage(ModelElementCS csElement, Element newPivotElement) {
	//	logger.trace("Installing " + csElement.getDescription()); //$NON-NLS-1$ //$NON-NLS-2$	
		EObject oldPivotElement = csElement.getPivot();	
		if (oldPivotElement != newPivotElement) {
			assert !newPivotElement.eIsProxy();
			csElement.setPivot(newPivotElement);
		}
	}

	public boolean isAdapterForType(Object type) {
		if (type instanceof Class<?>) {
			return ((Class<?>)type).isAssignableFrom(getClass());
		}
		else {
			return false;
		}
	}

	public boolean isAdapterFor(MetaModelManager metaModelManager) {
		return this.metaModelManager == metaModelManager;
	}

	public void metaModelManagerDisposed(MetaModelManager metaModelManager) {
		dispose();
	}

	public void notifyChanged(Notification notification) {
		// Do nothing.
	}
	
	public <T extends Element> T refreshModelElement(Class<T> pivotClass, EClass pivotEClass, ModelElementCS csElement) {
		Element pivotElement = csElement != null ? getPivotElement(csElement) : null;
		if (pivotElement == null) {
//			logger.trace("Creating " + pivotEClass.getName() + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
			pivotElement = (Element) pivotEClass.getEPackage().getEFactoryInstance().create(pivotEClass);
		}
		else if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
//			logger.trace("Recreating " + pivotEClass.getName() + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
			pivotElement = (Element) pivotEClass.getEPackage().getEFactoryInstance().create(pivotEClass);
		}
		if (csElement != null) {
			installPivotDefinition(csElement, pivotElement);
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
		return castElement;
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == metaModelManager.getPivotResourceSet();
	}

	public void unsetTarget(Notifier oldTarget) {
		assert oldTarget == metaModelManager.getPivotResourceSet();
	}
	
	public synchronized void update(IDiagnosticConsumer diagnosticsConsumer) {
		Map<String, Element> oldCSI2Pivot = cs2PivotMapping.getMapping();
		Set<String> newCSIs = cs2PivotMapping.computeCSIs(cs2pivotResourceMap.keySet());
//		System.out.println("==========================================================================");
		Collection<? extends Resource> csResources = getCSResources();
//		for (Resource csResource : csResources) {
//			System.out.println("CS " + csResource.getClass().getName() + "@" + csResource.hashCode() + " " + csResource.getURI());
//		}
		CS2PivotConversion conversion = new CS2PivotConversion(this, diagnosticsConsumer, csResources);
		conversion.update();
//		System.out.println("---------------------------------------------------------------------------");
//		Collection<? extends Resource> pivotResources = cs2pivotResourceMap.values();
//		for (Entry<? extends Resource, ? extends Resource> entry : cs2pivotResourceMap.entrySet()) {
//			Resource csResource = entry.getKey();
//			Resource pivotResource = entry.getValue();
//			System.out.println("CS " + csResource.getClass().getName() + "@" + csResource.hashCode() + " => " + pivotResource.getClass().getName() + "@" + pivotResource.hashCode());
//		}
/*		Set<String> deadCSIs = new HashSet<String>(oldCSI2Pivot.keySet());
		deadCSIs.removeAll(newCSIs);
		for (String deadCSI : deadCSIs) {
			Element deadPivot = oldCSI2Pivot.get(deadCSI);	// WIP
//			metaModelManager.kill(deadPivot);
		} */
		conversion.garbageCollect(cs2pivotResourceMap);
		cs2PivotMapping.update(cs2pivotResourceMap.keySet());
		pivot2cs = null;
	}
}
