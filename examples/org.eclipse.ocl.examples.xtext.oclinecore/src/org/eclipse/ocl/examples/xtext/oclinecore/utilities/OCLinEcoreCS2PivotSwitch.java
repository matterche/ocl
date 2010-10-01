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
 * $Id: OCLinEcoreCS2PivotSwitch.java,v 1.1.2.1 2010/10/01 14:48:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.utilities;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCS2PivotSwitch;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Pivot;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreCSTPackage;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreConstraintCS;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.util.OCLinEcoreCSTSwitch;

public class OCLinEcoreCS2PivotSwitch implements CS2Pivot.Switch
{	
	private static final class Factory implements CS2Pivot.Factory
	{
		private Factory() {
			BaseCS2PivotSwitch.FACTORY.getClass();
			CS2Pivot.addFactory(this);
		}
		
		public CS2Pivot.Switch create(CS2Pivot converter) {
			return new OCLinEcoreCS2PivotSwitch(converter);
		}

		public EPackage getEPackage() {
			return OCLinEcoreCSTPackage.eINSTANCE;
		}
	}

	public static CS2Pivot.Factory FACTORY = new Factory();
	
	public class DeclarationPass extends OCLinEcoreCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.DeclarationPass baseSwitch;
		
		public DeclarationPass() {
			baseSwitch = (BaseCS2PivotSwitch.DeclarationPass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getDeclarationPass();
		}

/*		@Override
		public Element caseLibIterationCS(LibIterationCS csElement) {
			Iteration pivotElement = converter.defineOperation(Iteration.class, PivotPackage.Literals.ITERATION, csElement);
			converter.defineElements(Parameter.class, pivotElement.getOwnedIterators(), csElement.getOwnedIterator());
//			converter.queueReferencers(csElement.getOwnedIterator());	// For type
			return pivotElement;
		}

		@Override
		public Element caseLibOperationCS(LibOperationCS csElement) {
			return converter.defineOperation(Operation.class, PivotPackage.Literals.OPERATION, csElement);
		}

		@Override
		public Element caseLibPropertyCS(LibPropertyCS csElement) {
			Property pivotElement = converter.defineNamedElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
			converter.queueReferencer(csElement);	// For type
			return pivotElement;
		} */

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
	
	public class DefinitionPass extends OCLinEcoreCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.DefinitionPass baseSwitch;
		
		public DefinitionPass() {
			baseSwitch = (BaseCS2PivotSwitch.DefinitionPass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getDefinitionPass();
		}

/*		@Override
		public Element caseLibIterationCS(LibIterationCS csElement) {
			Iteration pivotElement = converter.defineOperation(Iteration.class, PivotPackage.Literals.ITERATION, csElement);
			converter.defineElements(Parameter.class, pivotElement.getOwnedIterators(), csElement.getOwnedIterator());
//			converter.queueReferencers(csElement.getOwnedIterator());	// For type
			return pivotElement;
		}

		@Override
		public Element caseLibOperationCS(LibOperationCS csElement) {
			return converter.defineOperation(Operation.class, PivotPackage.Literals.OPERATION, csElement);
		}

		@Override
		public Element caseLibPropertyCS(LibPropertyCS csElement) {
			Property pivotElement = converter.defineNamedElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
			converter.queueReferencer(csElement);	// For type
			return pivotElement;
		} */

		@Override
		public Element caseOCLinEcoreConstraintCS(OCLinEcoreConstraintCS csElement) {
			Constraint pivotElement = converter.defineNamedElement(Constraint.class, PivotPackage.Literals.CONSTRAINT, csElement);
			pivotElement.setStereotype(csElement.getStereotype());
			converter.defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
			converter.queueReferencer(csElement); // For specification
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
	
	public class ReferencePass extends OCLinEcoreCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.ReferencePass baseSwitch;
		
		public ReferencePass() {
			baseSwitch = (BaseCS2PivotSwitch.ReferencePass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getReferencePass();
		}

		@Override
		public Element caseOCLinEcoreConstraintCS(OCLinEcoreConstraintCS csElement) {
			Constraint pivotElement = converter.getPivotElement(Constraint.class, csElement);
			OclExpression expression = converter.referenceElement(OclExpression.class, csElement.getOwnedExpression());
			ExpressionInOcl specification = PivotFactory.eINSTANCE.createExpressionInOcl();
			specification.setBodyExpression(expression);
			pivotElement.setSpecification(specification);
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
			return baseSwitch.doSwitch(csElement);
		}
	}
	
	public class ResolutionPass extends OCLinEcoreCSTSwitch<Element> implements CS2Pivot.Switch.Pass
	{	
		protected final BaseCS2PivotSwitch.ResolutionPass baseSwitch;
		
		public ResolutionPass() {
			baseSwitch = (BaseCS2PivotSwitch.ResolutionPass) converter.getSwitch(BaseCS2PivotSwitch.FACTORY).getResolutionPass();
		}

/*		@Override
		public Element caseLibIterationCS(LibIterationCS csElement) {
			Iteration pivotElement = converter.resolveOperation(Iteration.class, csElement);
			refreshJavaClass(pivotElement, csElement);
			return null;
		}

		@Override
		public Element caseLibOperationCS(LibOperationCS csElement) {
			Operation pivotElement = converter.resolveOperation(Operation.class, csElement);
			refreshJavaClass(pivotElement, csElement);
			return null;
		}

		@Override
		public Element caseLibPropertyCS(LibPropertyCS csElement) {
			Property pivotElement = converter.getPivotElement(Property.class, csElement);
			refreshJavaClass(pivotElement, csElement);
			return null;
		} */

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
		
	protected final CS2Pivot converter;
	protected final Pass declaration;
	protected final DefinitionPass definition;
	protected final ReferencePass reference;
	protected final ResolutionPass resolution;
	
	public OCLinEcoreCS2PivotSwitch(CS2Pivot converter) {
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
