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
 * $Id: BaseCS2PivotSwitch.java,v 1.1.2.1 2010/10/01 14:13:00 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.xtext.base.baseCST.AbstractPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AttributeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DataTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DetailCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DocumentationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationLiteralCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.FeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterizedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCSRef;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.util.BaseCSTSwitch;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Pivot.Switch;

public class BaseCS2PivotSwitch implements CS2Pivot.Switch
{	
	private static final class Factory implements CS2Pivot.Factory
	{
		private Factory() {
			CS2Pivot.addFactory(this);
		}
		
		public Switch create(CS2Pivot converter) {
			return new BaseCS2PivotSwitch(converter);
		}

		public EPackage getEPackage() {
			return BaseCSTPackage.eINSTANCE;
		}
	}

	public static CS2Pivot.Factory FACTORY = new Factory();
	
	public class DeclarationPass extends BaseCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		@Override
		public org.eclipse.ocl.examples.pivot.Package caseAbstractPackageCS(AbstractPackageCS csElement) {
			org.eclipse.ocl.examples.pivot.Package pivotElement = converter.refreshMonikeredElement(org.eclipse.ocl.examples.pivot.Package.class,
				PivotPackage.Literals.PACKAGE, csElement.getMoniker());
			converter.installPivotElement(csElement, pivotElement);
			converter.refreshName(pivotElement, csElement.getName());
			converter.declareElements(org.eclipse.ocl.examples.pivot.Package.class,
				pivotElement.getNestedPackages(), csElement.getOwnedNestedPackage());
			converter.declareAlias(pivotElement, csElement);
			String newNsPrefix = csElement.getNsPrefix();
			String oldNsPrefix = pivotElement.getNsPrefix();
			if ((newNsPrefix != oldNsPrefix) && ((newNsPrefix == null) || !newNsPrefix.equals(oldNsPrefix))) {
				pivotElement.setNsPrefix(newNsPrefix);
			}
			String newNsURI = csElement.getNsURI();
			String oldNsURI = pivotElement.getNsURI();
			if ((newNsURI != oldNsURI) && ((newNsURI == null) || !newNsURI.equals(oldNsURI))) {
				pivotElement.setNsURI(newNsURI);
			}
			converter.queueDefiner(csElement);	// To define annotations
			return pivotElement;
		}

		@Override
		public Element caseClassCS(ClassCS csElement) {
			org.eclipse.ocl.examples.pivot.Class pivotElement = converter.refreshMonikeredElement(org.eclipse.ocl.examples.pivot.Class.class,
				PivotPackage.Literals.CLASS, csElement.getMoniker());
			converter.installPivotElement(csElement, pivotElement);
			converter.refreshName(pivotElement, csElement.getName());
			converter.refreshTemplateSignature(pivotElement, csElement, true);
			refreshInstanceClassName(pivotElement, csElement);
			converter.queueDefiner(csElement);	// To define features, supertypes
			return pivotElement;
		}

		@Override
		public Element caseDataTypeCS(DataTypeCS csElement) {
			DataType pivotElement = converter.refreshMonikeredElement(DataType.class,
				PivotPackage.Literals.DATA_TYPE, csElement.getMoniker());
			converter.installPivotElement(csElement, pivotElement);
			converter.refreshName(pivotElement, csElement.getName());
			converter.refreshTemplateSignature(pivotElement, csElement, true);
			refreshInstanceClassName(pivotElement, csElement);
			return pivotElement;
		}

		@Override
		public Element caseEnumerationCS(EnumerationCS csElement) {
			org.eclipse.ocl.examples.pivot.Enumeration pivotElement = converter.refreshMonikeredElement(org.eclipse.ocl.examples.pivot.Enumeration.class,
				PivotPackage.Literals.ENUMERATION, csElement.getMoniker());
			converter.installPivotElement(csElement, pivotElement);
			converter.refreshName(pivotElement, csElement.getName());
			converter.refreshTemplateSignature(pivotElement, csElement, true);
			converter.declareElements(EnumerationLiteral.class, pivotElement.getOwnedLiterals(), csElement.getOwnedLiterals());
			refreshInstanceClassName(pivotElement, csElement);
			converter.queueDefiner(csElement);	// To define literals
			return pivotElement;
		}

		@Override
		public Element caseEnumerationLiteralCS(EnumerationLiteralCS csElement) {
			EnumerationLiteral pivotElement = converter.refreshMonikeredElement(EnumerationLiteral.class,
				PivotPackage.Literals.ENUMERATION_LITERAL, csElement.getMoniker());
			converter.installPivotElement(csElement, pivotElement);
			converter.refreshName(pivotElement, csElement.getName());
			return pivotElement;
		}

		@Override
		public Element casePackageCS(PackageCS csElement) {
			org.eclipse.ocl.examples.pivot.Package pivotElement = caseAbstractPackageCS(csElement);
			converter.declareElements(Type.class, pivotElement.getOwnedTypes(), csElement.getOwnedType());
			return pivotElement;
		}

		@Override
		public Element caseTypeParameterCS(TypeParameterCS csElement) {
			org.eclipse.ocl.examples.pivot.Class pivotElement = converter.refreshMonikeredElement(org.eclipse.ocl.examples.pivot.Class.class,
				PivotPackage.Literals.CLASS, csElement.getMoniker());
			converter.installPivotElement(csElement, pivotElement);
			converter.refreshName(pivotElement, csElement.getName());
			TemplateParameter pivotTemplateParameter = pivotElement.getOwningTemplateParameter();
			if (pivotTemplateParameter == null) {
				pivotTemplateParameter = PivotFactory.eINSTANCE.createTypeTemplateParameter();
				pivotTemplateParameter.setOwnedParameteredElement(pivotElement);
			}
			converter.queueDefiner(csElement);	// To define bounds
			return pivotTemplateParameter;
		}

		@Override
		public Element defaultCase(EObject csElement) {
			return super.defaultCase(csElement);
		}

		public Element doInPackageSwitch(EObject csElement) {
			int classifierID = csElement.eClass().getClassifierID();
			return doSwitch(classifierID, csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			EClass eClass = csElement.eClass();
			return doSwitch(eClass, csElement);
		}
	}
	
	public class DefinitionPass extends BaseCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		@Override
		public org.eclipse.ocl.examples.pivot.Package caseAbstractPackageCS(AbstractPackageCS csElement) {
			org.eclipse.ocl.examples.pivot.Package pivotElement = converter.getPivotElement(org.eclipse.ocl.examples.pivot.Package.class, csElement);
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			return pivotElement;
		}

		@Override
		public Annotation caseAnnotationCS(AnnotationCS csElement) {
			Annotation pivotElement = converter.defineNamedElement(Annotation.class,
				PivotPackage.Literals.ANNOTATION, csElement);
//			refreshDefault(pivotElement, csElement);
			converter.defineElements(Detail.class, pivotElement.getOwnedDetails(), csElement.getOwnedDetail());
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());  // FIXME Duplicate 'source's replace not merge
			converter.queueReferencer(csElement);	// For type
			return pivotElement;
		}

		@Override
		public Property caseAttributeCS(AttributeCS csElement) {
			Property pivotElement = converter.defineNamedElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
			refreshDefault(pivotElement, csElement);
			converter.defineElement(csElement.getOwnedType());
			converter.defineElements(Constraint.class, pivotElement.getOwnedRules(), csElement.getOwnedConstraint());
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			converter.queueReferencer(csElement);	// For type
			return pivotElement;
		}

		@Override
		public Element caseClassCS(ClassCS csElement) {
			org.eclipse.ocl.examples.pivot.Class pivotElement = converter.getPivotElement(org.eclipse.ocl.examples.pivot.Class.class, csElement);
			converter.defineElements(Property.class, pivotElement.getOwnedAttributes(), csElement.getOwnedProperty());
			converter.defineElements(Operation.class, pivotElement.getOwnedOperations(), csElement.getOwnedOperation());
			converter.defineTemplateBinding(csElement); //  FIXME Can this happen ?
			converter.defineElements(csElement.getOwnedSuperType());
			converter.defineElements(Constraint.class, pivotElement.getOwnedRules(), csElement.getOwnedConstraint());
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			converter.queueResolver(csElement);	// To resolve superTypes
			return pivotElement;
		}

		@Override
		public Detail caseDetailCS(DetailCS csElement) {
			Detail pivotElement = converter.defineNamedElement(Detail.class, PivotPackage.Literals.DETAIL, csElement);
//			refreshDefault(pivotElement, csElement);
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			List<String> newValues = csElement.getValue();
			List<String> pivotValues = pivotElement.getValues();
			pivotValues.clear();
			pivotValues.addAll(newValues);
			converter.queueReferencer(csElement);	// For type
			return pivotElement;
		}

		@Override
		public Annotation caseDocumentationCS(DocumentationCS csElement) {
			Annotation pivotElement = converter.defineNamedElement(Annotation.class, PivotPackage.Literals.ANNOTATION, csElement);
//			refreshDefault(pivotElement, csElement);
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			converter.queueReferencer(csElement);	// For type
			return pivotElement;
		}

		@Override
		public Operation caseOperationCS(OperationCS csElement) {
			return converter.defineOperation(Operation.class, PivotPackage.Literals.OPERATION, csElement);
		}

		@Override
		public Element caseParameterCS(ParameterCS csElement) {
			Parameter pivotElement = converter.defineNamedElement(Parameter.class, PivotPackage.Literals.PARAMETER, csElement);
			converter.defineElement(csElement.getOwnedType());
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			converter.queueReferencer(csElement);	// For type
			return pivotElement;
		}

		@Override
		public Element caseParameterizedTypeRefCS(ParameterizedTypeRefCS csElement) {
			converter.defineTemplateBinding(csElement);
			converter.queueResolver(csElement);
			return null;
		}

		@Override
		public Property caseReferenceCS(ReferenceCS csElement) {
			Property pivotElement = converter.defineNamedElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
			refreshDefault(pivotElement, csElement);
			converter.defineElement(csElement.getOwnedType());
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			converter.queueReferencer(csElement);	// For type, opposite
			return pivotElement;
		}

		@Override
		public Element caseTypeParameterCS(TypeParameterCS csElement) {
			Type pivotElement = converter.getPivotElement(Type.class, csElement);
			if (pivotElement == null) {
				pivotElement = converter.refreshMonikeredElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, csElement.getMoniker());
				converter.installPivotElement(csElement, pivotElement);
				converter.refreshName(pivotElement, csElement.getName());
				TemplateParameter pivotTemplateParameter = pivotElement.getOwningTemplateParameter();
				if (pivotTemplateParameter == null) {
					pivotTemplateParameter = PivotFactory.eINSTANCE.createTypeTemplateParameter();
					pivotTemplateParameter.setOwnedParameteredElement(pivotElement);
				}
			}
			converter.defineElements(csElement.getOwnedExtends());
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			return pivotElement.getTemplateParameter();
		}

		public Element doInPackageSwitch(EObject csElement) {
			int classifierID = csElement.eClass().getClassifierID();
			return doSwitch(classifierID, csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			EClass eClass = csElement.eClass();
			return doSwitch(eClass, csElement);
		}
	}
	
	public class ReferencePass extends BaseCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		@Override
		public Element caseFeatureCS(FeatureCS csElement) {
			TypedElement pivotElement = converter.getPivotElement(TypedElement.class, csElement);
			converter.referenceElement(csElement.getOwnedType());
			converter.queueResolver(csElement);	// For type
			return pivotElement;
		}

		@Override
		public Element caseParameterCS(ParameterCS csElement) {
			TypedElement pivotElement = converter.getPivotElement(TypedElement.class, csElement);
			converter.referenceElement(csElement.getOwnedType());
			converter.queueResolver(csElement);	// For type
			return pivotElement;
		}
		
		@Override
		public Element casePrimitiveTypeRefCS(PrimitiveTypeRefCS csElement) {
			String name = csElement.getName();
			Type type = converter.getPivotManager().getLibraryType(name, null);
			csElement.setPivot(type);
//			converter.queueResolver(csElement);	// For type
			return type;
		}

		@Override
		public Element caseQualifiedTypeRefCS(QualifiedTypeRefCS csElement) {
			converter.referenceElement(csElement.getElement());
			return null;
		}

		public Element doInPackageSwitch(EObject csElement) {
			int classifierID = csElement.eClass().getClassifierID();
			return doSwitch(classifierID, csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			EClass eClass = csElement.eClass();
			return doSwitch(eClass, csElement);
		}
	}
	
	public class ResolutionPass extends BaseCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		@Override
		public Element caseClassCS(ClassCS csClass) {
			org.eclipse.ocl.examples.pivot.Class pivotClass = converter.getPivotElement(org.eclipse.ocl.examples.pivot.Class.class, csClass);
			if (pivotClass != null) {
				List<org.eclipse.ocl.examples.pivot.Class> pivotElements = pivotClass.getSuperClasses();
				List<TypedRefCS> csElements = csClass.getOwnedSuperType();
				converter.refreshList(org.eclipse.ocl.examples.pivot.Class.class, pivotElements, csElements);
			}
			return null;
		}

		@Override
		public Element caseOperationCS(OperationCS csElement) {
			converter.resolveOperation(Operation.class, csElement);
			converter.resolveElements(csElement.getOwnedParameter());
			return null;
		}

		@Override
		public Element caseParameterizedTypeRefCS(ParameterizedTypeRefCS csElement) {
			converter.resolvePivotElement(csElement);
			converter.resolveElement(csElement.getOwnedTemplateBinding());
			return null;
		}

		@Override
		public <E extends ElementCS> Element caseQualifiedRefCS(QualifiedRefCS<E> csElement) {
			converter.resolveElement(csElement.getElement());
			return null;
		}

		@Override
		public Element caseReferenceCS(ReferenceCS csElement) {
			Property pivotProperty = converter.getPivotElement(Property.class, csElement);
			if (pivotProperty != null) {
				Property pivotOpposite = null;
				ReferenceCSRef csOppositeRef = csElement.getOpposite();
				if (csOppositeRef != null) {
					pivotOpposite = csOppositeRef.getRef();
				}
				if (pivotOpposite != pivotProperty.getOpposite()) {
					pivotProperty.setOpposite(pivotOpposite);
				}
			}
			return null;
		}

		@Override
		public Element caseTemplateBindingCS(TemplateBindingCS csElement) {
			converter.resolveElements(csElement.getOwnedParameterSubstitution());
			return null;
		}

		@Override
		public Element caseTemplateParameterSubstitutionCS(TemplateParameterSubstitutionCS csElement) {
			converter.resolveActualParameter(csElement);
			return null;
		}

		@Override
		public Element caseTypedElementCS(TypedElementCS csElement) {
			converter.resolveTypedElementType(csElement);
			return null;
		}

		public Element doInPackageSwitch(EObject csElement) {
			int classifierID = csElement.eClass().getClassifierID();
			return doSwitch(classifierID, csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			EClass eClass = csElement.eClass();
			return doSwitch(eClass, csElement);
		}
	}
		
	protected final CS2Pivot converter;
	protected final DeclarationPass declaration;
	protected final DefinitionPass definition;
	protected final ReferencePass reference;
	protected final ResolutionPass resolution;
	
	public BaseCS2PivotSwitch(CS2Pivot converter) {
		this.converter = converter;			
		this.declaration = new DeclarationPass();
		this.definition = new DefinitionPass();
		this.reference = new ReferencePass();
		this.resolution = new ResolutionPass();
	}

	public DeclarationPass getDeclarationPass() {
		return declaration;
	}

	public DefinitionPass getDefinitionPass() {
		return definition;
	}

	public ReferencePass getReferencePass() {
		return reference;
	}	

	public ResolutionPass getResolutionPass() {
		return resolution;
	}	

	public void refreshDefault(Property pivotElement, StructuralFeatureCS csElement) {
		String newDefault = csElement.getDefault();
		String oldDefault = pivotElement.getDefault();
		if ((newDefault != oldDefault) && ((newDefault == null) || !newDefault.equals(oldDefault))) {
			pivotElement.setDefault(newDefault);
		}
	}

	public void refreshInstanceClassName(org.eclipse.ocl.examples.pivot.Class pivotElement, ClassifierCS csElement) {
		String newInstanceClassName = csElement.getInstanceClassName();
		String oldInstanceClassName = pivotElement.getInstanceClassName();
		if ((newInstanceClassName != oldInstanceClassName) && ((newInstanceClassName == null) || !newInstanceClassName.equals(oldInstanceClassName))) {
			pivotElement.setInstanceClassName(newInstanceClassName);
		}
	}
}
