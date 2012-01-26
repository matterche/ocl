/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PrimitiveTypeImpl.java,v 1.2 2011/01/24 20:42:32 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getSelfType()
 * @model
 * @generated
 */
public interface SelfType extends org.eclipse.ocl.examples.pivot.Class
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" selfTypeRequired="true" selfTypeOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nselfType\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, null, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Pivot_ecore__pivot__Type = <%org.eclipse.ocl.examples.pivot.PivotTables%>.Types._Type;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Pivot_ecore__pivot__Type;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.SelfTypeBodies%>._resolveSelfType_body_.INSTANCE.evaluate(evaluator, returnType, self, valueFactory.valueOf(selfType));\n\treturn (Type) result.asEcoreObject();\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.SelfTypeBodies\", e);\n}\n'"
	 * @generated
	 */
	Type resolveSelfType(Type selfType);
} // SelfType
