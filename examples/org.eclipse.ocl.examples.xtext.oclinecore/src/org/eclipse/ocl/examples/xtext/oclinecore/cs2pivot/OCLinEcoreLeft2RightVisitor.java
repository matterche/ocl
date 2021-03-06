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
 * $Id: OCLinEcoreLeft2RightVisitor.java,v 1.9 2011/05/23 05:51:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.cs2pivot;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpSpecificationCS;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreConstraintCS;

public class OCLinEcoreLeft2RightVisitor extends AbstractOCLinEcoreLeft2RightVisitor
{
	public OCLinEcoreLeft2RightVisitor(CS2PivotConversion context) {
		super(context);
	}

	@Override
	public Element visitOCLinEcoreConstraintCS(OCLinEcoreConstraintCS csConstraint) {
		Constraint pivotConstraint = PivotUtil.getPivot(Constraint.class, csConstraint);
		ExpSpecificationCS csSpecification = (ExpSpecificationCS) csConstraint.getSpecification();
		pivotConstraint.setIsCallable(csConstraint.isCallable());
		ExpCS csExpression = csSpecification.getOwnedExpression();
		if (csExpression != null) {
			ExpressionInOcl pivotSpecification = PivotUtil.getPivot(ExpressionInOcl.class, csSpecification);
			pivotConstraint.setSpecification(pivotSpecification);
	
			Variable contextVariable = pivotSpecification.getContextVariable();
			if (contextVariable == null) {
				contextVariable = PivotFactory.eINSTANCE.createVariable();
				pivotSpecification.setContextVariable(contextVariable);
			}
			context.refreshName(contextVariable, Environment.SELF_VARIABLE_NAME);
			EObject eContainer = csConstraint.eContainer();
			if (eContainer instanceof TypeCS) {
				Type contextType = PivotUtil.getPivot(Type.class, (TypeCS)eContainer);
				context.setType(contextVariable, contextType);
			}
			else if (eContainer instanceof StructuralFeatureCS) {
				Property contextProperty = PivotUtil.getPivot(Property.class, (StructuralFeatureCS)eContainer);
				context.setType(contextVariable, contextProperty.getOwningType());
			}
			else if (eContainer instanceof OperationCS) {
				Operation contextOperation = PivotUtil.getPivot(Operation.class, (OperationCS)eContainer);
				context.setType(contextVariable, contextOperation.getOwningType());
		        pivotSpecification.getParameterVariable().clear();
		        for (Parameter parameter : contextOperation.getOwnedParameter()) {
			        Variable param = PivotFactory.eINSTANCE.createVariable();
			        param.setName(parameter.getName());
					context.setTypeWithMultiplicity(param, parameter);
			        param.setRepresentedParameter(parameter);
			        pivotSpecification.getParameterVariable().add(param);
		        }
		        if (UMLReflection.POSTCONDITION.equals(csConstraint.getStereotype())) {		// FIXME constant
					Variable resultVariable = pivotSpecification.getResultVariable();
					if (resultVariable == null) {
						resultVariable = PivotFactory.eINSTANCE.createVariable();
					}
					resultVariable.setName(Environment.RESULT_VARIABLE_NAME);
					context.setTypeWithMultiplicity(resultVariable, contextOperation);
					pivotSpecification.setResultVariable(resultVariable);
		        }
			}
			
			
			OclExpression bodyExpression = context.visitLeft2Right(OclExpression.class, csExpression);		
			pivotSpecification.setBodyExpression(bodyExpression);
			if (bodyExpression != null) {
				pivotSpecification.setType(bodyExpression.getType());
			}
			ExpSpecificationCS csMessageSpecification = (ExpSpecificationCS) csConstraint.getMessageSpecification();
			if (csMessageSpecification != null) {
				context.installPivotUsage(csMessageSpecification, pivotSpecification);
				ExpCS csMessageExpression = csMessageSpecification.getOwnedExpression();
				if (csMessageExpression != null) {
					OclExpression messageExpression = context.visitLeft2Right(OclExpression.class, csMessageExpression);		
					pivotSpecification.setMessageExpression(messageExpression);
				}
			}
		}
		return pivotConstraint;
	}
}