/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: EssentialOCLLinkingService.java,v 1.8 2011/05/20 15:27:00 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.examples.pivot.utilities.IllegalLibraryException;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.ExceptionAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.BaseScopeProvider;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Inject;

public class EssentialOCLLinkingService extends DefaultLinkingService
{
	private static int depth = -1;
	
	@Inject
	private IValueConverterService valueConverterService;

	@Inject
	private IGlobalScopeProvider globalScopeProvider;
	
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
		try {
			depth++;
			String text = getText(node);
			boolean traceLookup = BaseScopeProvider.LOOKUP.isActive();
			if (text == null) {			
				if (traceLookup) {
					BaseScopeProvider.LOOKUP.println("" + depth + " Lookup null");
				}
				return Collections.emptyList();
			}
			IScope scope = null;
			String uri = TypesPackage.eNS_URI;
//			if (ref.getEReferenceType().getEPackage() == TypesPackage.eINSTANCE) {	// FIXME this is costly; don't inflict it when not needed
			if (ref.getEReferenceType().getEPackage().getNsURI().equals(uri)) {
				scope = globalScopeProvider.getScope(context.eResource(), ref, null);
			}
			else {
				scope = getScope(context, ref);
				if (traceLookup) {
//					EObject target = ((ScopeView)scope).getTarget();
//					String inString = target instanceof ElementCS ? ((ElementCS)target).getSignature() : target.toString();
//					BaseScopeProvider.LOOKUP.println("" + depth + " Lookup " + text + " in " + inString);
					BaseScopeProvider.LOOKUP.println("" + depth + " Lookup " + text);
				}
			}
			if (scope == null) {
				return Collections.emptyList();
			}
			QualifiedName qualifiedName = QualifiedName.create(text);	// FIXME use IQualifiedNameConverter
			List<EObject> linkedObjects = new ArrayList<EObject>();
			for (IEObjectDescription eObjectDescription : scope.getElements(qualifiedName)) {
				EObject eObjectOrProxy = eObjectDescription.getEObjectOrProxy();
				linkedObjects.add(eObjectOrProxy);
				if (traceLookup) {
					if (eObjectOrProxy instanceof ModelElementCS) {
						BaseScopeProvider.LOOKUP.println("" + depth + " Lookup " + text + " => " + CS2Moniker.toString((ModelElementCS)eObjectOrProxy));
					}
					else {
						BaseScopeProvider.LOOKUP.println("" + depth + " Lookup " + text + " => " + eObjectOrProxy);									
					}
				}
			}
			if (traceLookup) {
				BaseScopeProvider.LOOKUP.println("" + depth + " Lookup " + text + " failed");
			}
			if (linkedObjects.size() > 1) {
				scope.getElements(qualifiedName);	// FIXME conditionalise this retry for debug
				return Collections.emptyList();		// BUG FIXME return some form of ambiguity
			}
			if (linkedObjects.size() <= 0) {
				scope.getElements(qualifiedName);	// FIXME conditionalise this retry for debug
			}
			return linkedObjects;
		}
		catch (IllegalLibraryException e) {
			context.eAdapters().add(new ExceptionAdapter(e));
			return Collections.emptyList();
		}
		finally {
			depth--;
		}
	}

	@Override
	protected IScope getScope(EObject context, EReference reference) {
		IScopeProvider scopeProvider = getScopeProvider();
		if (scopeProvider == null)
			throw new IllegalStateException("scopeProvider must not be null.");
//		try {
//			registerImportedNamesAdapter(context);
			return scopeProvider.getScope(context, reference);
//		} finally {
//			unRegisterImportedNamesAdapter();
//		}
	}

	public String getText(INode node) {
		ILeafNode leafNode = ElementUtil.getLeafNode(node);
		if (leafNode == null) {
			return null;
		}
		EObject grammarElement = leafNode.getGrammarElement();
		String ruleName = getLinkingHelper().getRuleNameFrom(grammarElement);
		return (String) valueConverterService.toValue(leafNode.getText(), ruleName, leafNode);
	}
}
