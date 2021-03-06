/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id: BinaryOperationFilter.java,v 1.3 2011/04/25 19:39:51 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.attributes;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.SelfType;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

public class BinaryOperationFilter extends AbstractOperationFilter
{
	protected final Type argumentType;
	
	public BinaryOperationFilter(MetaModelManager metaModelManager, Type sourceType, Type argumentType) {
		super(metaModelManager, sourceType);
		this.argumentType = PivotUtil.getBehavioralType(argumentType);
	}

	public boolean matches(EnvironmentView environmentView, Type forType, EObject eObject) {
		if (eObject instanceof Iteration) {		
			return false;
		}
		else if (eObject instanceof Operation) {
			Operation candidateOperation = (Operation)eObject;
			List<Parameter> candidateParameters = candidateOperation.getOwnedParameter();
			if (candidateParameters.size() != 1) {
				return false;
			}
			Parameter candidateParameter = candidateParameters.get(0);
			Type candidateType = candidateParameter.getType();
			if (candidateType instanceof SelfType) {
				candidateType = candidateOperation.getOwningType();
			}
			if (!metaModelManager.conformsTo(argumentType, candidateType, null)) {
				return false;
			}
			Map<TemplateParameter, ParameterableElement> bindings = getOperationBindings(candidateOperation);
			if (bindings != null) {
				installBindings(environmentView, forType, eObject, bindings);
			}
			return true;
		}
		else {
			return false;
		}
	}
}