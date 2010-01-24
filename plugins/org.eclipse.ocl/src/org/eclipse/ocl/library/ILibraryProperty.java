/**
 * <copyright>
 * </copyright>
 *
 * $Id: ILibraryProperty.java,v 1.1.2.1 2010/01/24 07:40:56 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.PropertyCallExp;


/**
 * @since 3.0
 */
public interface ILibraryProperty {
	/**
	 */
	<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor, Object sourceVal, PropertyCallExp<C, P> propertyCall);

}
