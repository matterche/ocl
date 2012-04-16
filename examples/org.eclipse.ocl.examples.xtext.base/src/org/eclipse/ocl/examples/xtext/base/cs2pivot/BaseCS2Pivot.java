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
 * $Id: BaseCS2Pivot.java,v 1.4 2011/05/20 15:27:24 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.xtext.base.attributes.ImportCSAttribution;
import org.eclipse.ocl.examples.xtext.base.attributes.LibraryCSAttribution;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;

/**
 * BaseCST2Pivot provides an extensible conversion from CS models to the pivot model.
 * <p>
 * Conversion/update occurs in five passes.
 * <p>
 * Pass 1: updateDeclarers()
 * <br>the package/class/property/template parameter CS composition hierarchy is replicated in the pivot hierarchy
 * <br>requests for unreferable declarations are accumulated in <tt>queuedDefiners</tt>. 
 * <br>requests for specialization are accumulated in <tt>queuedBindings</tt>. 
 * <br>requests for references are accumulated in <tt>queuedReferencers</tt>. 
 * <br>all unspecialized pivot elements have correct attributes and composed children
 * <br>all unspecialized pivot nameable elements appear in moniker2pivotMap.
 * <p>
 * Pass 2: updateDefiners()
 * <br>the feature/annotation/detail CS composition hierarchy is replicated in the pivot hierarchy
 * <br>requests for specialization are accumulated in <tt>queuedBindings</tt>. 
 * <br>requests for references are accumulated in <tt>queuedReferencers</tt>. 
 * <br>all unspecialized pivot elements have correct attributes and composed children
 * <br>all unspecialized pivot nameable elements appear in moniker2pivotMap.
 * <p>
 * Pass 3: updateReferencers()
 * <br>the expression CS composition hierarchy is replicated in the pivot hierarchy
 * <br>requests for resolvers are accumulated in <tt>queuedResolvers</tt>. 
 * <p>
 * Pass 4: updateSpecializations()
 * <br>a unique pivot specialization is created/updated from each distinct CS specialization. 
 * <br>further requests for references are accumulated in <tt>queuedReferencers</tt>. 
 * <br>all pivot elements have correct attributes and composed children
 * <br>all pivot nameable elements appear in moniker2pivotMap.
 * <br>all specialized elements have correct signature, formal references
 * <p>
 * Pass 5: updateResolvers()
 * <br>cross-tree references are resolved in the pivot model.
 * <br>- pivot specialization actual arguments
 * <br>- TypedElementCS.type, TypedTypeRefCS.type, ...
 * <p>
 * Correlation between the CS and pivot is achieved by monikers which are unique for all
 * NameableElements. The old pivot model's monikers initialize the moniker2PivotMap so
 * the the subsequent refresh can discover a pre-existing pivot element for each
 * required CS element. The moniker2PivotMap is updated as pivot elements are created.
 * pivot monikers are not used during conversion since it may not be possible to
 * create the correct moniker for a partially converted specialization.
 */
public class BaseCS2Pivot extends CS2Pivot
{	
	private static final class Factory implements CS2Pivot.Factory
	{
		private Factory() {
			CS2Pivot.addFactory(this);
			addUnresolvedProxyMessageProvider(ImportCSAttribution.INSTANCE);			
			addUnresolvedProxyMessageProvider(LibraryCSAttribution.INSTANCE);			
			addUnresolvedProxyMessageProvider(new SimpleNamedElementRefCSTypeUnresolvedProxyMessageProvider());			
			addUnresolvedProxyMessageProvider(new TypedTypeRefCSTypeUnresolvedProxyMessageProvider());			
		}

		public BaseContainmentVisitor createContainmentVisitor(CS2PivotConversion converter) {
			return new BaseContainmentVisitor(converter);
		}

		public BaseLeft2RightVisitor createLeft2RightVisitor(CS2PivotConversion converter) {
			return new BaseLeft2RightVisitor(converter);
		}

		public BasePostOrderVisitor createPostOrderVisitor(CS2PivotConversion converter) {
			return new BasePostOrderVisitor(converter);
		}

		public BasePreOrderVisitor createPreOrderVisitor(CS2PivotConversion converter) {
			return new BasePreOrderVisitor(converter);
		}

		public EPackage getEPackage() {
			return BaseCSTPackage.eINSTANCE;
		}
	}
	
	private static final class SimpleNamedElementRefCSTypeUnresolvedProxyMessageProvider extends AbstractUnresolvedProxyMessageProvider
	{		
		private SimpleNamedElementRefCSTypeUnresolvedProxyMessageProvider() {
			super(BaseCSTPackage.Literals.PATH_ELEMENT_CS__ELEMENT);
		}
		
		@Override
		public String getMessage(EObject context, String linkText) {
			PathElementCS pathElement = (PathElementCS)context;
			EClassifier elementType = pathElement.getElementType();
			PathNameCS pathName = pathElement.getPathName();
			List<PathElementCS> path = pathName.getPath();
			int index = path.indexOf(pathElement);
			if (index > 0) {
				Element pathScope = path.get(index-1).getElement();
				if ((pathScope == null) || pathScope.eIsProxy()) {
					return null;		// Suppress message for child when parent has error
				}
			}
			String element = elementType != null ? elementType.getName() : "unknown";
			return getMessageBinder().bind(context, OCLMessages.Unresolved_ERROR_, element, linkText);
		}
	}
	
	private static final class TypedTypeRefCSTypeUnresolvedProxyMessageProvider extends AbstractUnresolvedProxyMessageProvider
	{		
		private TypedTypeRefCSTypeUnresolvedProxyMessageProvider() {
			super(BaseCSTPackage.Literals.TYPED_TYPE_REF_CS__TYPE);
		}
		
		@Override
		public String getMessage(EObject context, String linkText) {
			return getMessageBinder().bind(context, OCLMessages.UnresolvedType_ERROR_, linkText);
		}
	}

	public static CS2Pivot.Factory FACTORY = new Factory();

	public BaseCS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap,
			MetaModelManager metaModelManager) {
		super(cs2pivotResourceMap, metaModelManager);
	}
}
