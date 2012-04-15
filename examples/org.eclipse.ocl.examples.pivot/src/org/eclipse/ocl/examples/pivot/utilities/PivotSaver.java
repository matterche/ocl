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
 * $Id: PivotSaver.java,v 1.8 2011/04/25 09:49:15 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.LambdaType;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeTemplateParameter;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;

/**
 * PivotSaver ensures that all references to specialized types are terminated
 * by local copies of the specialization.
 */
public class PivotSaver extends AbstractPivotSaver
{
	private static final class Factory implements AbstractPivotSaver.Factory
{
		private Factory() {
			addFactory(this);
		}

		public LocateVisitor createLocateVisitor(AbstractPivotSaver saver) {
			return new LocateVisitor(saver);
		}

		public ResolveVisitor createResolveVisitor(AbstractPivotSaver saver) {
			return new ResolveVisitor(saver);
		}

		public EPackage getEPackage() {
			return PivotPackage.eINSTANCE;
		}
	}

	public static AbstractPivotSaver.Factory FACTORY = new Factory();
	
	/**
	 * LocateVisitor locates references to shared specializations, so that 
	 * local copies can be created and then replaced by the ResolveVisitor.
	 */
	public static class LocateVisitor extends AbstractExtendingVisitor<Object, AbstractPivotSaver> implements AbstractPivotSaver.LocateVisitor
	{
		protected LocateVisitor(AbstractPivotSaver context) {
			super(context);
		}

		@Override
		public Object visitClass(org.eclipse.ocl.examples.pivot.Class object) {
			for (Type superClass : object.getSuperClass()) {
				if (superClass.getTemplateBinding().size() > 0) {
					context.addSpecializingElement(object);
					break;
				}
			}
			return null;
		}

		@Override
		public Object visitCollectionType(CollectionType object) {
			Type referredType = object.getElementType();
			context.addSpecializingElement(object, referredType);
			return super.visitCollectionType(object);
		}

		@Override
		public Object visitLambdaType(LambdaType object) {
			boolean doneIt = false;
			Type referredType = object.getContextType();
			if (context.addSpecializingElement(object, referredType)) {
				doneIt = true;
			}
			if (!doneIt) {
				referredType = object.getResultType();
				if (context.addSpecializingElement(object, referredType)) {
					doneIt = true;
				}
				if (!doneIt) {
					for (Type parameterType : object.getParameterType()) {
						if (context.addSpecializingElement(object, parameterType)) {
							break;
						}
					}
				}
			}
			return super.visitLambdaType(object);
		}

		@Override
		public Object visitLoopExp(LoopExp object) {
			Iteration referredIteration = object.getReferredIteration();
			context.addSpecializingElement(object, referredIteration);
			return super.visitLoopExp(object);
		}

		@Override
		public Object visitOperationCallExp(OperationCallExp object) {
			Operation referredOperation = object.getReferredOperation();
			context.addSpecializingElement(object, referredOperation);
			return super.visitOperationCallExp(object);
		}

		@Override
		public Object visitProperty(Property object) {
			Property opposite = object.getOpposite();
			if (opposite != null) {
				Resource eResource = opposite.eResource();
				assert eResource != null;
			}
			return super.visitProperty(object);
		}

		@Override
		public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution object) {
			ParameterableElement actual = object.getActual();
			if (actual instanceof Type) {
				context.addSpecializingElement(object, (Type) actual);
			}
			return null;
		}

		@Override
		public Object visitTypedElement(TypedElement object) {
			Type referredType = object.getType();
			context.addSpecializingElement(object, referredType);
			return null;
		}

		@Override
		public Object visitTypeTemplateParameter(TypeTemplateParameter object) {
			for (Type constrainingType : object.getConstrainingType()) {
				if (context.addSpecializingElement(object, constrainingType)) {
					break;
				}
			}
			return null;
		}

		public Object visiting(Visitable visitable) {
			return null;
		}
	}
	
	/**
	 * ResolveVisitor converts references to shared specializations
	 * to references to local copies.
	 */
	public static class ResolveVisitor extends AbstractExtendingVisitor<Object, AbstractPivotSaver> implements AbstractPivotSaver.ResolveVisitor
	{
		protected ResolveVisitor(AbstractPivotSaver saver) {
			super(saver);
		}

		@Override
		public Object visitClass(org.eclipse.ocl.examples.pivot.Class object) {
			List<Type> superClasses = object.getSuperClass();
			for (int i = 0; i < superClasses.size(); i++) {
				Type referredClass = superClasses.get(i);
				Type resolvedClass = context.resolveType(referredClass);
				if (resolvedClass != null) {
					superClasses.set(i, resolvedClass);
				}
			}
			return null;
		}

		@Override
		public Object visitClassifierType(ClassifierType object) {
			Type referredType = object.getInstanceType();
			Type resolvedType = context.resolveType(referredType);
			if (resolvedType != null) {
				object.setInstanceType(resolvedType);
			}
			return super.visitClassifierType(object);
		}

		@Override
		public Object visitCollectionType(CollectionType object) {
			Type referredType = object.getElementType();
			Type resolvedType = context.resolveType(referredType);
			if ((resolvedType != null) && (resolvedType != referredType)) {
				object.setElementType(resolvedType);
			}
			return super.visitCollectionType(object);
		}

		@Override
		public Object visitLambdaType(LambdaType object) {
			Type referredType = object.getContextType();
			Type resolvedType = context.resolveType(referredType);
			if (resolvedType != null) {
				object.setContextType(resolvedType);
			}
			referredType = object.getResultType();
			resolvedType = context.resolveType(referredType);
			if (resolvedType != null) {
				object.setResultType(resolvedType);
			}
			List<Type> parameterTypes = object.getParameterType();
			for (int i = 0; i < parameterTypes.size(); i++) {
				referredType = parameterTypes.get(i);
				resolvedType = context.resolveType(referredType);
				if (resolvedType != null) {
					parameterTypes.set(i, resolvedType);
				}
			}
			return super.visitLambdaType(object);
		}

		@Override
		public Object visitLoopExp(LoopExp object) {
			Iteration referredIteration = object.getReferredIteration();
			Iteration resolvedIteration = context.resolveOperation(referredIteration);
			if (resolvedIteration != null) {
				object.setReferredIteration(resolvedIteration);
			}
			return null;
		}

		@Override
		public Object visitOperationCallExp(OperationCallExp object) {	// FIXME Obsolete once referredOperation is not a specialization
			Operation referredOperation = object.getReferredOperation();
			Operation resolvedOperation = context.resolveOperation(referredOperation);
			if (resolvedOperation != null) {
				object.setReferredOperation(resolvedOperation);
			}
			return null;
		}

		@Override
		public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution object) {
			Type referredType = (Type) object.getActual();
			Type resolvedType = context.resolveType(referredType);
			if (resolvedType != null) {
				object.setActual(resolvedType);
			}
			return null;
		}

		@Override
		public Object visitTypeTemplateParameter(TypeTemplateParameter object) {
			List<Type> constrainingTypes = object.getConstrainingType();
			for (int i = 0; i < constrainingTypes.size(); i++) {
				Type referredType = constrainingTypes.get(i);
				Type resolvedType = context.resolveType(referredType);
				if (resolvedType != null) {
					constrainingTypes.set(i, resolvedType);
				}
			}
			return null;
		}

		@Override
		public Object visitTypedElement(TypedElement object) {
			Type referredType = object.getType();
			Type resolvedType = context.resolveType(referredType);
			if (resolvedType != null) {
				object.setType(resolvedType);
			}
			return null;
		}

		public Object visiting(Visitable visitable) {
			throw new IllegalArgumentException("Unsupported " + visitable.eClass().getName() + " for PivotSaver Resolve pass");
		}
	}
	
	protected final Resource resource;
	
	/**
	 * The moniker to type map for types defined with the saved resource.
	 */
//	private Map<String, Type> types = new HashMap<String, Type>();

	/**
	 * The moniker to operation map for operations defined with the saved resource.
	 */
	private Map<String, Operation> operations = new HashMap<String, Operation>();

	/**
	 * TypedElements that refer to specializations.
	 */
	private List<Element> specializingElements = new ArrayList<Element>();

	/**
	 * The extra package for copies of specializations.
	 */
	private org.eclipse.ocl.examples.pivot.Package orphanage = null;

	/**
	 * Map of original specialization to local specialization
	 */
	private Map<Type, Type> specializations = new HashMap<Type, Type>();

	/**
	 * The extra package for copies of specializations.
	 */
	private org.eclipse.ocl.examples.pivot.Class orphanageClass = null;
	
	public PivotSaver(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void addSpecializingElement(Element object) {
		specializingElements.add(object);
	}

	@Override
	public boolean addSpecializingElement(Element object, Operation referredOperation) {
		if (referredOperation == null) {
			return false;
		}
		else if (!isOrphanOperation(referredOperation)) {
			return false;
		}
		else {
			specializingElements.add(object);
			return true;
		}
	}

	@Override
	public boolean addSpecializingElement(Element object, Type referredType) {
		if (referredType == null) {
			return false;
		}
		else if (PivotUtil.isLibraryType(referredType)) {
			return false;
		}
		else {
			specializingElements.add(object);
			return true;
		}
	}

	protected org.eclipse.ocl.examples.pivot.Package getOrphanPackage(Resource resource) {
		if (orphanage == null) {
			orphanage = PivotFactory.eINSTANCE.createPackage();
			orphanage.setName(PivotConstants.ORPHANAGE_NAME);
			resource.getContents().add(orphanage);
			orphanageClass = PivotFactory.eINSTANCE.createAnyType();		// No superclasses
			orphanageClass.setName(PivotConstants.ORPHANAGE_NAME);
			orphanage.getOwnedType().add(orphanageClass);
		}
		return orphanage;
	}

	protected boolean isOrphanOperation(Operation operation) {		// FIXME Non-static PivotUtils
		// FIXME surely an orphan is one for which eResource() is null,
		//  or one that is in the orphanage.
		if (operation.getTemplateBinding().size() > 0) {
			return true;
		}
		return false;
	}

	/**
	 * Prepare a pivot resource for save by redirecting all type references to
	 * specializations to local copies of the specializations.
	 */
	public org.eclipse.ocl.examples.pivot.Package localizeSpecializations() {
		locateSpecializations(resource.getContents());
		if (specializingElements.size() > 0) {
			orphanage = getOrphanPackage(resource);
			for (int i = 0; i < specializingElements.size(); i++) {	// Domain may grow
				Element element = specializingElements.get(i);
				AbstractPivotSaver.ResolveVisitor resolveVisitor = getResolveVisitor(element);
				if (resolveVisitor != null) {
				resolveVisitor.safeVisit(element);
			}
			}
//			List<Type> ownedTypes = orphanage.getOwnedType();
//			List<Type> sorted = ownedTypes; //WIP PivotUtil.sortByMoniker(new ArrayList<Type>(ownedTypes));
//			ownedTypes.clear();
//			ownedTypes.addAll(sorted);
		}
		return orphanage;
	}

	protected void locateSpecializations(List<? extends EObject> eObjects) {
		for (EObject eObject : eObjects) {
			if (eObject instanceof Visitable) {
				AbstractPivotSaver.LocateVisitor locateVisitor = getLocateVisitor(eObject);
				if (locateVisitor != null) {
				locateVisitor.safeVisit((Visitable) eObject);
			}
			}
			locateSpecializations(eObject.eContents());
		}
	}

	/**
	 * Return the resolved variant of referredType, which may require creation
	 * of a local copy of a specialization.
	 */
	@Override
	public <T extends Operation> T resolveOperation(T referredOperation) {
		if (!isOrphanOperation(referredOperation)) {
			return referredOperation;
		}
		String moniker = Pivot2Moniker.toString(referredOperation);
		Operation operation = operations.get(moniker);
		if (operation != null) {
			@SuppressWarnings("unchecked") 
			T castOperation = (T) operation;
			return castOperation;
		}
		T resolvedOperation = EcoreUtil.copy(referredOperation);
		orphanageClass.getOwnedOperation().add(resolvedOperation);
		operations.put(moniker, resolvedOperation);
		String newMoniker = Pivot2Moniker.toString(resolvedOperation);
		assert moniker.equals(newMoniker);
		locateSpecializations(Collections.singletonList(resolvedOperation));
		return resolvedOperation;
	}

	/**
	 * Return the resolved variant of referredType, which may require creation
	 * of a local copy of a specialization.
	 */
	@Override
	public <T extends Type> T resolveType(T referredType) {
		if (PivotUtil.isLibraryType(referredType)) {
			return referredType;
		}
		@SuppressWarnings("unchecked")
		T resolvedType = (T) specializations.get(referredType);
		if (resolvedType == null) {
			resolvedType = EcoreUtil.copy(referredType);
			specializations.put(referredType, resolvedType);
			orphanage.getOwnedType().add(resolvedType);
		}
/*			String moniker = Pivot2Moniker.toString(referredType);
		Type type = types.get(moniker);
		if (type != null) {
			@SuppressWarnings("unchecked") 
			T castType = (T) type;
			return castType;
		}
		T resolvedType = EcoreUtil.copy(referredType);
		orphanage.getOwnedType().add(resolvedType);
		types.put(moniker, resolvedType);
		String newMoniker = Pivot2Moniker.toString(resolvedType);
//		assert moniker.equals(newMoniker) : newMoniker + " is not equal to " + moniker;
		if (!moniker.equals(newMoniker)) {
			String moniker2 = Pivot2Moniker.toString(referredType);
			String newMoniker2 = Pivot2Moniker.toString(resolvedType);
			assert moniker.equals(newMoniker) : newMoniker + " is not equal to " + moniker;
		} */
		locateSpecializations(Collections.singletonList(resolvedType));
		return resolvedType;
	}
}