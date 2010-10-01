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
 * $Id: OCLstdlibCS2PivotSwitch.java,v 1.1.2.1 2010/10/01 14:34:05 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.utilities;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.AssociativityKind;
import org.eclipse.ocl.examples.pivot.CallableImplementation;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.ImplementableElement;
import org.eclipse.ocl.examples.pivot.Iterate;
import org.eclipse.ocl.examples.pivot.Iterator;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCS2PivotSwitch;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.JavaImplementationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibConstraintCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibIterationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibOperationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibPropertyCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibRootPackageCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTPackage;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.PrecedenceCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.util.OCLstdlibCSTSwitch;
import org.eclipse.xtext.parsetree.CompositeNode;

public class OCLstdlibCS2PivotSwitch implements CS2Pivot.Switch
{	
	private static final class Factory implements CS2Pivot.Factory
	{
		private Factory() {
			BaseCS2PivotSwitch.FACTORY.getClass();
			CS2Pivot.addFactory(this);
		}
		
		public CS2Pivot.Switch create(CS2Pivot converter) {
			return new OCLstdlibCS2PivotSwitch(converter);
		}

		public EPackage getEPackage() {
			return OCLstdlibCSTPackage.eINSTANCE;
		}
	}

	public static CS2Pivot.Factory FACTORY = new Factory();
	
	public class DeclarationPass extends OCLstdlibCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.DeclarationPass baseSwitch;
		
		public DeclarationPass() {
			baseSwitch = (BaseCS2PivotSwitch.DeclarationPass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getDeclarationPass();
		}

		@Override
		public Element caseLibRootPackageCS(LibRootPackageCS csElement) {
			org.eclipse.ocl.examples.pivot.Package pivotElement = (Package) baseSwitch.doSwitch(csElement);
			for (PrecedenceCS csPrecedence : csElement.getOwnedPrecedence()) {
				Precedence pivotPrecedence = converter.refreshMonikeredElement(Precedence.class,
					PivotPackage.Literals.PRECEDENCE, csPrecedence.getMoniker());
				converter.installPivotElement(csPrecedence, pivotPrecedence);
				converter.refreshName(pivotPrecedence, csPrecedence.getName());
				pivotPrecedence.setAssociativity(csPrecedence.isRightAssociative() ? AssociativityKind.RIGHT : AssociativityKind.LEFT);
				pivotElement.getOwnedPrecedences().add(pivotPrecedence);
			}
			return pivotElement;
		}

		public Element doInPackageSwitch(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
		}
	}
	
	public class DefinitionPass extends OCLstdlibCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.DefinitionPass baseSwitch;
		
		public DefinitionPass() {
			baseSwitch = (BaseCS2PivotSwitch.DefinitionPass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getDefinitionPass();
		}

		@Override
		public Element caseLibConstraintCS(LibConstraintCS csElement) {
			Constraint pivotElement = converter.defineNamedElement(Constraint.class, PivotPackage.Literals.CONSTRAINT, csElement);
			pivotElement.setStereotype(csElement.getStereotype());
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			converter.queueReferencer(csElement); // For specification
			return pivotElement;
		}

		@Override
		public Element caseLibIterationCS(LibIterationCS csElement) {
			Iterator pivotElement;
			List<ParameterCS> accumulators = csElement.getOwnedAccumulator();
			if (accumulators.isEmpty()) {
				pivotElement = converter.defineOperation(Iterator.class, PivotPackage.Literals.ITERATOR, csElement);
			}
			else {
				Iterate iterate = converter.defineOperation(Iterate.class, PivotPackage.Literals.ITERATE, csElement);
				converter.defineElements(Parameter.class, iterate.getOwnedAccumulators(), accumulators);
				pivotElement = iterate;
			}
			converter.defineElements(Parameter.class, pivotElement.getOwnedIterators(), csElement.getOwnedIterator());
			converter.defineElements(Constraint.class, pivotElement.getOwnedRules(), csElement.getOwnedConstraint());
			return pivotElement;
		}

		@Override
		public Element caseLibOperationCS(LibOperationCS csElement) {
			Operation pivotElement = converter.defineOperation(Operation.class, PivotPackage.Literals.OPERATION, csElement);
			converter.defineElements(Constraint.class, pivotElement.getOwnedRules(), csElement.getOwnedConstraint());
			return pivotElement;
		}

		@Override
		public Element caseLibPropertyCS(LibPropertyCS csElement) {
			Property pivotElement = converter.defineNamedElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
			converter.queueReferencer(csElement);	// For type
			return pivotElement;
		}

		@Override
		public Element caseLibRootPackageCS(LibRootPackageCS csElement) {
			org.eclipse.ocl.examples.pivot.Package pivotElement = (Package) baseSwitch.doSwitch(csElement);
			for (PrecedenceCS csPrecedence : csElement.getOwnedPrecedence()) {
				Precedence pivotPrecedence = converter.refreshMonikeredElement(Precedence.class,
					PivotPackage.Literals.PRECEDENCE, csPrecedence.getMoniker());
				converter.installPivotElement(csPrecedence, pivotPrecedence);
				converter.refreshName(pivotPrecedence, csPrecedence.getName());
				pivotPrecedence.setAssociativity(csPrecedence.isRightAssociative() ? AssociativityKind.RIGHT : AssociativityKind.LEFT);
				pivotElement.getOwnedPrecedences().add(pivotPrecedence);
			}
			return pivotElement;
		}

		@Override
		public Element defaultCase(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
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
	
	public class ReferencePass extends OCLstdlibCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.ReferencePass baseSwitch;
		
		public ReferencePass() {
			baseSwitch = (BaseCS2PivotSwitch.ReferencePass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getReferencePass();
		}

		@Override
		public Element caseLibConstraintCS(LibConstraintCS csElement) {
			Constraint pivotElement = converter.getPivotElement(Constraint.class, csElement);
//			OclExpression expression = converter.referenceElement(OclExpression.class, csElement.getOwnedExpression());
			ExpressionInOcl specification = PivotFactory.eINSTANCE.createExpressionInOcl();
//			specification.setBodyExpression(expression);
			CompositeNode parserNode = ElementUtil.getParserNode(csElement.getOwnedExpression());
			if (parserNode != null) {
				specification.getLanguages().add("OCL");
				specification.getBodies().add(parserNode.serialize().trim());
			}
			pivotElement.setSpecification(specification);
			return pivotElement;
		}

		@Override
		public Element caseLibOperationCS(LibOperationCS csElement) {
			Operation pivotElement = converter.getPivotElement(Operation.class, csElement);
			pivotElement.setPrecedence(csElement.getPrecedence());
			return null;
		}

		@Override
		public Element defaultCase(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
		}

		public Element doInPackageSwitch(EObject csElement) {
			int classifierID = csElement.eClass().getClassifierID();
			return doSwitch(classifierID, csElement);
		}

		@Override
		public Element doSwitch(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
		}
	}
	
	public class ResolutionPass extends OCLstdlibCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.ResolutionPass baseSwitch;
		
		public ResolutionPass() {
			baseSwitch = (BaseCS2PivotSwitch.ResolutionPass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getResolutionPass();
		}

		@Override
		public Element caseLibIterationCS(LibIterationCS csElement) {
			Iterator pivotElement = converter.resolveOperation(Iterator.class, csElement);
			refreshJavaClass(pivotElement, csElement);
			return null;
		}

		@Override
		public Element caseLibOperationCS(LibOperationCS csElement) {
			Operation pivotElement = converter.resolveOperation(Operation.class, csElement);
			pivotElement.setPrecedence(csElement.getPrecedence());
			refreshJavaClass(pivotElement, csElement);
			return null;
		}

		@Override
		public Element caseLibPropertyCS(LibPropertyCS csElement) {
			Property pivotElement = converter.getPivotElement(Property.class, csElement);
			refreshJavaClass(pivotElement, csElement);
			return null;
		}

//		@Override
//		public Element caseLibRootPackageCS(LibRootPackageCS csElement) {
//			return baseSwitch.doSwitch(csElement);
//		}

		@Override
		public Element defaultCase(EObject csElement) {
			return baseSwitch.doSwitch(csElement);
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

		public void refreshJavaClass(ImplementableElement pivotElement, JavaImplementationCS csElement) {
			String newClass = csElement.getImplementation().getCanonicalName();
			CallableImplementation oldImplementation = pivotElement.getImplementation();
			String oldClass;
			if (oldImplementation != null) {
				oldClass = oldImplementation.getClass().getCanonicalName();
			}
			else {
				oldClass = pivotElement.getImplementationClass();
			}
			if (!newClass.equals(oldClass)) {
				pivotElement.setImplementationClass(newClass);
				pivotElement.setImplementation(null);
			}
		}
	}
		
	protected final CS2Pivot converter;
	protected final Pass declaration;
	protected final DefinitionPass definition;
	protected final ReferencePass reference;
	protected final ResolutionPass resolution;
	
	public OCLstdlibCS2PivotSwitch(CS2Pivot converter) {
		this.converter = converter;
		this.declaration = new DeclarationPass();
		this.definition = new DefinitionPass();
		this.reference =  new ReferencePass();
		this.resolution = new ResolutionPass();
	}

	public Pass getDeclarationPass() {
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
}
