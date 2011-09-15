/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
 * $Id: SortedByIteration.java,v 1.9 2011/05/20 15:26:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.library.validators;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ocl.examples.domain.elements.DomainCallExp;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryValidator;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.validation.ValidationWarning;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * ValidateSortedByIteration validates the Collection::sortedBy() library iteration.
 */
public class ValidateSortedByIteration implements LibraryValidator
{
	public Diagnostic validate(DomainStandardLibrary standardLibrary, DomainCallExp callExp) {
		Type type = ((LoopExp)callExp).getBody().getType();
		TemplateParameter templateParameter = type.getOwningTemplateParameter();
		if (templateParameter != null) {
			Map<TemplateParameter, ParameterableElement> templateParameterSubstitutions = PivotUtil.getAllTemplateParameterSubstitutions(null, (TemplateableElement) callExp.getSource().getType());
			type = (Type) templateParameterSubstitutions.get(templateParameter);
		}
		type = PivotUtil.getBehavioralType(type);			// FIXME make this a general facility
		try {
			DomainType comparableType = standardLibrary.getOclComparableType();
			DomainOperation staticOperation = standardLibrary.lookupOperation(comparableType, EvaluatorMessages.CompareToOperation, comparableType);
			if (staticOperation == null) {
				return new ValidationWarning(OCLMessages.UnresolvedOperation_ERROR_, EvaluatorMessages.CompareToOperation, String.valueOf(comparableType));
			}
			DomainOperation dynamicOperation = standardLibrary.lookupDynamicOperation(type, staticOperation);
			if (dynamicOperation == null) {
				return new ValidationWarning(OCLMessages.UnresolvedOperation_ERROR_, EvaluatorMessages.CompareToOperation, String.valueOf(type));
			}
			LibraryBinaryOperation implementation = (LibraryBinaryOperation) standardLibrary.lookupImplementation(dynamicOperation);
			if (implementation == null) {
				return new ValidationWarning(OCLMessages.UnresolvedOperation_ERROR_, EvaluatorMessages.CompareToOperation, String.valueOf(type));
			}
			return null;
		} catch (Exception e) {
			return new ValidationWarning(e.getLocalizedMessage());
		}
	}
}
