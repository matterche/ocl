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
 * $Id$
 */
package org.eclipse.ocl.examples.codegen.common;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.SelfType;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.Pivot2Moniker;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

public class PivotQueries
{	
	/**
	 * Workaround Acceleo's lack of BigInteger support
	 */
	public static String asIntegerStringOrNull(Element element) {
		if (element instanceof IntegerLiteralExp) {
			return element.toString();
		}
		if ((element instanceof UnlimitedNaturalLiteralExp) && ((UnlimitedNaturalLiteralExp)element).getUnlimitedNaturalSymbol().signum() >= 0) {
			return element.toString();
		}
		return null;
	}
	
	/**
	 * Workaround Acceleo's lack of BigDecimal support
	 */
	public static String asRealStringOrNull(Element element) {
		if (element instanceof RealLiteralExp) {
			return element.toString();
		}
		return null;
	}

	public static ExpressionInOcl getExpressionInOcl(NamedElement contextElement, OpaqueExpression specification) {
		Resource resource = contextElement.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		MetaModelManager metaModelManager = MetaModelManager.getAdapter(resourceSet);
		String expression = PivotUtil.getBody(specification);
		URI uri = metaModelManager.getResourceIdentifier(contextElement, null);
		try {
			return PivotUtil.resolveSpecification(metaModelManager, uri, contextElement, expression);
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static String getFragmentURI(Element element) {
		return EcoreUtil.getURI(element).fragment().toString();
	}

	public static String getMoniker(Element element) {
		return Pivot2Moniker.toString(element);
	}
	
	public static Boolean isBinarySelf(OperationCallExp callExp) {
		if (callExp == null) {
			return false;
		}
		Operation operation = callExp.getReferredOperation();
		if (operation == null) {
			return false;
		}
		List<Parameter> parameters = operation.getOwnedParameters();
		if (parameters.size() != 1) {
			return false;
		}
		return parameters.get(0).getType() instanceof SelfType;
	}
}
