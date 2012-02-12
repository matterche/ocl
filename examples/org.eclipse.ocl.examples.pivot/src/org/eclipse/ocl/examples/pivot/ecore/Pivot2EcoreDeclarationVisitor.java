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
 * $Id: Pivot2EcoreDeclarationVisitor.java,v 1.9 2011/05/13 18:43:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.ecore;

import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.examples.common.utils.StringUtils;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Enumeration;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeTemplateParameter;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;

public class Pivot2EcoreDeclarationVisitor
	extends AbstractExtendingVisitor<EObject, Pivot2Ecore>
{

	public Pivot2EcoreDeclarationVisitor(Pivot2Ecore context) {
		super(context);
	}

	protected void copyClassifier(EClassifier eClassifier, Type pivotType) {
		copyNamedElement(eClassifier, pivotType);
		copyTemplateSignature(eClassifier.getETypeParameters(), pivotType);
		safeVisitAll(eClassifier.getEAnnotations(), pivotType.getOwnedAnnotation());
		if (pivotType.eIsSet(PivotPackage.Literals.TYPE__INSTANCE_CLASS_NAME)) {
			eClassifier.setInstanceClassName(pivotType.getInstanceClassName());
		}
		else {
			eClassifier.eUnset(EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS_NAME);
		}
//		visitAll(eClassifier.getETypeParameters(), pivotType.getTypeParameters());
		for (Constraint pivotConstraint : pivotType.getOwnedRule()) {
			if (!pivotConstraint.isCallable()) {
				safeVisit(pivotConstraint);		// Results are inserted directly
			}
		}
		MetaModelManager metaModelManager = context.getMetaModelManager();
		if (metaModelManager != null) {
			Pivot2Ecore.installDelegates(metaModelManager, eClassifier, pivotType);
		}
	}


	protected void copyDataTypeOrEnum(EDataType eDataType, DataType pivotDataType) {
		copyClassifier(eDataType, pivotDataType);
		eDataType.setSerializable(pivotDataType.isSerializable());
	}

	protected void copyDetails(EAnnotation eAnnotation, Annotation pivotAnnotation) {
		copyModelElement(eAnnotation, pivotAnnotation);
		safeVisitAll(eAnnotation.getEAnnotations(), pivotAnnotation.getOwnedAnnotation());
		for (Detail pivotDetail : pivotAnnotation.getOwnedDetail()) {
			String name = pivotDetail.getName();
			String value = StringUtils.splice(pivotDetail.getValue(), "");
			eAnnotation.getDetails().put(name, value);
		}
	}

	protected void copyModelElement(EModelElement eModelElement, Element pivotModelElement) {
		context.putCreated(pivotModelElement, eModelElement);
		Pivot2Ecore.copyComments(eModelElement, pivotModelElement);
	}

	protected void copyNamedElement(ENamedElement eNamedElement, NamedElement pivotNamedElement) {
		copyModelElement(eNamedElement, pivotNamedElement);
		eNamedElement.setName(pivotNamedElement.getName());
	}

	protected void copyTemplateSignature(List<ETypeParameter> eTypeParameters, TemplateableElement pivotElement) {
		TemplateSignature templateSignature = pivotElement.getOwnedTemplateSignature();
		if (templateSignature != null) {
			List<TemplateParameter> parameters = templateSignature.getParameter();
			safeVisitAll(eTypeParameters, parameters);
		}
	}

	protected void copyTypedElement(ETypedElement eTypedElement, TypedMultiplicityElement pivotTypedElement) {
		copyNamedElement(eTypedElement, pivotTypedElement);
		safeVisitAll(eTypedElement.getEAnnotations(), pivotTypedElement.getOwnedAnnotation());
		context.defer(pivotTypedElement);		// Defer type setting
		eTypedElement.setLowerBound(pivotTypedElement.getLower().intValue());
		eTypedElement.setUpperBound(pivotTypedElement.getUpper().intValue());
		eTypedElement.setUnique(pivotTypedElement.isUnique());
		eTypedElement.setOrdered(pivotTypedElement.isOrdered());
	}

	public <T extends EObject> void safeVisitAll(List<T> eObjects, List<? extends Element> pivotObjects) {
		for (Element pivotObject : pivotObjects) {
			@SuppressWarnings("unchecked")
			T eObject = (T) safeVisit(pivotObject);
			if (eObject != null) {
				eObjects.add(eObject);
			}
			// else error
		}
	}

	public EObject visiting(Visitable visitable) {
		throw new IllegalArgumentException("Unsupported " + visitable.eClass().getName() + " for Pivot2Ecore Declaration pass");
	}

	@Override
	public EObject visitAnnotation(Annotation pivotAnnotation) {
		EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		copyDetails(eAnnotation, pivotAnnotation);
		eAnnotation.setSource(pivotAnnotation.getName());
		safeVisitAll(eAnnotation.getContents(), pivotAnnotation.getOwnedContent());
		if (!pivotAnnotation.getReference().isEmpty()) {
			context.defer(pivotAnnotation);
		}
		return eAnnotation;
	}

	@Override
	public EObject visitClass(Class pivotClass) {
		if (pivotClass.getTemplateBinding().size() > 0) {
			return null;
		}
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		copyClassifier(eClass, pivotClass);
		eClass.setAbstract(pivotClass.isAbstract());
		eClass.setInterface(pivotClass.isInterface());
		context.defer(pivotClass);		// Defer superclass resolution
		safeVisitAll(eClass.getEOperations(), pivotClass.getOwnedOperation());
		safeVisitAll(eClass.getEStructuralFeatures(), pivotClass.getOwnedAttribute());
		for (Constraint pivotConstraint : pivotClass.getOwnedRule()) {
			if (pivotConstraint.isCallable()) {
				EOperation eOperation = Pivot2Ecore.createConstraintEOperation(pivotConstraint, pivotConstraint.getName());
				eClass.getEOperations().add(eOperation);
				context.putCreated(pivotConstraint, eOperation);
				Pivot2Ecore.installDelegate(eOperation, pivotConstraint, context.getEcoreURI());
			}
		}
		return eClass;
	}

	@Override
	public EObject visitConstraint(Constraint pivotConstraint) {
		EModelElement eModelElement = context.getCreated(EModelElement.class, (Element)pivotConstraint.eContainer());
		Pivot2Ecore.installDelegate(eModelElement, pivotConstraint, context.getEcoreURI());
		return null;
	}

	@Override
	public EObject visitDataType(DataType pivotDataType) {
		if (pivotDataType.getTemplateBinding().size() > 0) {
			return null;
		}
		EDataType eDataType = EcoreFactory.eINSTANCE.createEDataType();
		copyDataTypeOrEnum(eDataType, pivotDataType);
		return eDataType;
	}

	@Override
	public EObject visitDetail(Detail object) {
		// TODO Auto-generated method stub
		return super.visitDetail(object);
	}

	@Override
	public EObject visitEnumeration(Enumeration pivotEnumeration) {
		if (pivotEnumeration.getTemplateBinding().size() > 0) {
			return null;
		}
		EEnum eEnum = EcoreFactory.eINSTANCE.createEEnum();
		copyDataTypeOrEnum(eEnum, pivotEnumeration);
		safeVisitAll(eEnum.getELiterals(), pivotEnumeration.getOwnedLiteral());
		return eEnum;
	}

	@Override
	public EObject visitEnumerationLiteral(EnumerationLiteral pivotEnumLiteral) {
		EEnumLiteral eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
		copyNamedElement(eEnumLiteral, pivotEnumLiteral);
		if (pivotEnumLiteral.eIsSet(PivotPackage.Literals.ENUMERATION_LITERAL__VALUE)) {
			eEnumLiteral.setValue(pivotEnumLiteral.getValue().intValue());
		}
		else {
			eEnumLiteral.eUnset(EcorePackage.Literals.EENUM_LITERAL__VALUE);
		}
		return eEnumLiteral;
	}

	@Override
	public EObject visitOperation(Operation pivotOperation) {
		if (pivotOperation.getTemplateBinding().size() > 0) {
			return null;
		}
		EOperation eOperation = EcoreFactory.eINSTANCE.createEOperation();
		copyTypedElement(eOperation, pivotOperation);
		copyTemplateSignature(eOperation.getETypeParameters(), pivotOperation);
		safeVisitAll(eOperation.getEParameters(), pivotOperation.getOwnedParameter());
//		safeVisitAll(eOperation.getEGenericExceptions(), pivotOperation.getRaisedException());
		for (Constraint pivotConstraint : pivotOperation.getOwnedRule()) {
			safeVisit(pivotConstraint);		// Results are inserted directly
		}
		return eOperation;
	}

	@Override
	public EObject visitPackage(Package pivotPackage) {
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		copyNamedElement(ePackage, pivotPackage);
		safeVisitAll(ePackage.getEAnnotations(), pivotPackage.getOwnedAnnotation());
		context.defer(pivotPackage);		// Defer delegate annotation analysis
		if (pivotPackage.eIsSet(PivotPackage.Literals.PACKAGE__NS_PREFIX)) {
			ePackage.setNsPrefix(pivotPackage.getNsPrefix());
		}
		if (pivotPackage.eIsSet(PivotPackage.Literals.PACKAGE__NS_URI)) {
			ePackage.setNsURI(pivotPackage.getNsURI());
		}
		safeVisitAll(ePackage.getESubpackages(), pivotPackage.getNestedPackage());
		safeVisitAll(ePackage.getEClassifiers(), pivotPackage.getOwnedType());
		return ePackage;
	}

	@Override
	public EObject visitParameter(Parameter pivotParameter) {
		EParameter eParameter = EcoreFactory.eINSTANCE.createEParameter();
		copyTypedElement(eParameter, pivotParameter);
		return eParameter;
	}

	@Override
	public EObject visitProperty(Property pivotProperty) {
		if (pivotProperty.isImplicit()) {
			return null;
		}
		EStructuralFeature eStructuralFeature;
		Type type = pivotProperty.getType();
		if (type instanceof DataType) {
			EAttribute eAttribute = EcoreFactory.eINSTANCE.createEAttribute();
			eAttribute.setID(pivotProperty.isID());
			eStructuralFeature = eAttribute;
		}
		else {
			EReference eReference = EcoreFactory.eINSTANCE.createEReference();
			if ((pivotProperty.getOpposite() != null) || !pivotProperty.getKeys().isEmpty()) {
				context.defer(pivotProperty);
			}
			eReference.setContainment(pivotProperty.isComposite());
			eReference.setResolveProxies(pivotProperty.isResolveProxies());
			eStructuralFeature = eReference;
		}
		copyTypedElement(eStructuralFeature, pivotProperty);
		eStructuralFeature.setChangeable(!pivotProperty.isReadOnly());
		eStructuralFeature.setDerived(pivotProperty.isDerived());
		eStructuralFeature.setTransient(pivotProperty.isTransient());
		eStructuralFeature.setUnsettable(pivotProperty.isUnsettable());
		eStructuralFeature.setVolatile(pivotProperty.isVolatile());
		if (pivotProperty.eIsSet(PivotPackage.Literals.PROPERTY__DEFAULT)) {
			eStructuralFeature.setDefaultValueLiteral(pivotProperty.getDefault());
		}
		else {
			eStructuralFeature.eUnset(EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL);
		}
		for (Constraint pivotConstraint : pivotProperty.getOwnedRule()) {
			safeVisit(pivotConstraint);		// Results are inserted directly
		}
		return eStructuralFeature;
	}

	@Override
	public EObject visitTypeTemplateParameter(TypeTemplateParameter pivotTypeTemplateParameter) {
		ETypeParameter eTypeParameter = EcoreFactory.eINSTANCE.createETypeParameter();
		eTypeParameter.setName(((Type) pivotTypeTemplateParameter.getParameteredElement()).getName());
		context.putCreated(pivotTypeTemplateParameter, eTypeParameter);
		if (!pivotTypeTemplateParameter.getConstrainingType().isEmpty()) {
			context.defer(pivotTypeTemplateParameter);
		}
		return eTypeParameter;
	}
}
