/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: TypedMultiplicityElement.java,v 1.3 2011/01/24 20:49:35 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getTypedMultiplicityElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedMultiplicityElement
		extends TypedElement, MultiplicityElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.ocl.examples.pivot.Boolean" required="true" ordered="false" bodySpecificationRequired="true" bodySpecificationOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nlet bodyType : Type = bodySpecification.type\nin\n  if bodyType.oclIsKindOf(CollectionType)\n  then\n    let\n      bodyCollectionType : CollectionType = bodyType.oclAsType(CollectionType)\n    in\n      let bodyElementType : Type = bodyCollectionType.elementType\n      in\n        bodyElementType.conformsTo(self.type) and self.isOrdered =\n        (\n          bodyCollectionType.conformsTo(OrderedSet(OclAny)) or\n          bodyCollectionType.conformsTo(Sequence(OclAny))\n        ) and self.isUnique =\n        (\n          bodyCollectionType.conformsTo(OrderedSet(OclAny)) or\n          bodyCollectionType.conformsTo(Set(OclAny))\n        )\n  else bodyType.conformsTo(self.type)\n  endif\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.TypedMultiplicityElementBodies%>._CompatibleBody_body_.INSTANCE.evaluate(evaluator, returnType, self, valueFactory.valueOf(bodySpecification));\n\treturn (Boolean) result.asEcoreObject();\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.TypedMultiplicityElementBodies\", e);\n}\n'"
	 * @generated
	 */
	boolean CompatibleBody(ValueSpecification bodySpecification);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nParameter{name = \'name\'}\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Pivot_ecore__pivot__Parameter = <%org.eclipse.ocl.examples.pivot.PivotTables%>.Types._Parameter;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Pivot_ecore__pivot__Parameter;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.TypedMultiplicityElementBodies%>._makeParameter_body_.INSTANCE.evaluate(evaluator, returnType, self);\n\treturn (Parameter) result.asEcoreObject();\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.TypedMultiplicityElementBodies\", e);\n}\n'"
	 * @generated
	 */
	Parameter makeParameter();
} // TypedMultiplicityElement
