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
 * $Id: Pivot2BaseCSSwitch.java,v 1.1.2.1 2010/10/01 14:13:00 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeTemplateParameter;
import org.eclipse.ocl.examples.pivot.util.PivotSwitch;
import org.eclipse.ocl.examples.xtext.base.baseCST.AttributeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamespaceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeParameterCS;
import org.eclipse.ocl.examples.xtext.base.utilities.Pivot2CS.Switch;

public class Pivot2BaseCSSwitch extends PivotSwitch<ElementCS> implements Pivot2CS.Switch
{	
	private static final class Factory implements Pivot2CS.Factory
	{
		private Factory() {
			Pivot2CS.addFactory(this);
		}
		
		public Switch create(Pivot2CS converter) {
			return new Pivot2BaseCSSwitch(converter);
		}

		public EPackage getEPackage() {
			return PivotPackage.eINSTANCE;
		}
	}

	public static Pivot2CS.Factory FACTORY = new Factory();
	protected final Pivot2CS converter;
	
	public Pivot2BaseCSSwitch(Pivot2CS converter) {
		this.converter = converter;			
	}
	
	@Override
	public ElementCS caseClass(org.eclipse.ocl.examples.pivot.Class pivotElement) {
		ClassCS csElement = converter.refreshNamedElement(ClassCS.class, BaseCSTPackage.Literals.CLASS_CS, pivotElement);
		converter.refreshName(csElement, pivotElement);
		converter.refreshOwnedList(OperationCS.class, csElement.getOwnedOperation(), pivotElement.getOwnedOperations());
		converter.refreshOwnedList(StructuralFeatureCS.class, csElement.getOwnedProperty(), pivotElement.getOwnedAttributes());
		converter.refreshTemplateSignature(csElement, pivotElement);
		converter.refreshTypeRefList(csElement.getOwnedSuperType(), pivotElement.getSuperClasses());
		return csElement;
	}

	@Override
	public OperationCS caseOperation(Operation pivotElement) {
		OperationCS csElement = converter.refreshTypedElement(OperationCS.class, BaseCSTPackage.Literals.OPERATION_CS, pivotElement);
		converter.refreshOwnedList(ParameterCS.class, csElement.getOwnedParameter(), pivotElement.getOwnedParameters());
		converter.refreshTemplateSignature(csElement, pivotElement);
//FIXME			converter.refreshTypeRefList(csElement.getOwnedException(), pivotElement.getRaisedExceptions());
		return csElement;
	}

	@Override
	public NamespaceCS casePackage(org.eclipse.ocl.examples.pivot.Package pivotElement) {
		if (pivotElement.eContainer() == null) {
			RootPackageCS csElement = converter.refreshNamedElement(RootPackageCS.class, BaseCSTPackage.Literals.ROOT_PACKAGE_CS, pivotElement);
			converter.refreshName(csElement, pivotElement);
			converter.refreshOwnedList(PackageCS.class, csElement.getOwnedNestedPackage(), pivotElement.getNestedPackages());
			return csElement;
		}
		else {
			PackageCS csElement = converter.refreshNamedElement(PackageCS.class, BaseCSTPackage.Literals.PACKAGE_CS, pivotElement);
			converter.refreshName(csElement, pivotElement);
			converter.refreshOwnedList(PackageCS.class, csElement.getOwnedNestedPackage(), pivotElement.getNestedPackages());
			converter.refreshOwnedList(ClassifierCS.class, csElement.getOwnedType(), pivotElement.getOwnedTypes());
	//		converter.refreshTemplateSignature(pivotPackage, pivotElement);
			return csElement;
		}
	}

	@Override
	public ParameterCS caseParameter(Parameter pivotElement) {
		ParameterCS csElement = converter.refreshTypedElement(ParameterCS.class, BaseCSTPackage.Literals.PARAMETER_CS, pivotElement);
		return csElement;
	}
	
	@Override
	public StructuralFeatureCS caseProperty(Property pivotElement) {
		Type type = pivotElement.getType();
		StructuralFeatureCS csElement;
		if (type instanceof DataType) {
			csElement = converter.refreshTypedElement(AttributeCS.class, BaseCSTPackage.Literals.ATTRIBUTE_CS, pivotElement);
		}
		else {
			csElement = converter.refreshTypedElement(ReferenceCS.class, BaseCSTPackage.Literals.REFERENCE_CS, pivotElement);
		}
		return csElement;
	}

	@Override
	public TypeParameterCS caseTypeTemplateParameter(TypeTemplateParameter pivotElement) {
		NamedElement parameteredElement = (NamedElement) pivotElement.getParameteredElement();
		TypeParameterCS csElement = converter.refreshNamedElement(TypeParameterCS.class, BaseCSTPackage.Literals.TYPE_PARAMETER_CS, parameteredElement);
		converter.refreshName(csElement, parameteredElement);
//		converter.convertCompositions(pivotElement.getOwnedExtends());
		return csElement;
	}
	
	@Override
	public ElementCS defaultCase(EObject pivotElement) {
		return super.defaultCase(pivotElement);
	}

	public ElementCS doInPackageSwitch(EObject pivotElement) {
		int classifierID = pivotElement.eClass().getClassifierID();
		return doSwitch(classifierID, pivotElement);
	}

	@Override
	public ElementCS doSwitch(EObject pivotElement) {
		EClass eClass = pivotElement.eClass();
		return doSwitch(eClass, pivotElement);
	}
}
