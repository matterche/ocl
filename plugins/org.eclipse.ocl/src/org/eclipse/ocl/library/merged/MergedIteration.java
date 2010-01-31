/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedIteration.java,v 1.1.2.1 2010/01/31 22:23:42 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Iteration</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedIteration()
 * @model abstract="true"
 * @generated
 */
public interface MergedIteration extends OCLElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OCLType getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor, Object sourceVal, IteratorExp<C, PM> iteratorExp);

} // MergedIteration
