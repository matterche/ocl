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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.SelfType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintTypeVisitor;
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
	
	protected int getAllSuperClasses(Map<Type, Integer> results, Type aClass) {
		Integer depth = results.get(aClass);
		if (depth != null) {
			return depth;
		}
		int myDepth = 0;
		for (Type superClass : aClass.getSuperClasses()) {
			int superDepth = getAllSuperClasses(results, superClass);
			if (superDepth >= myDepth) {
				myDepth = superDepth+1;
			}
		}
		results.put(aClass, myDepth);
		return myDepth;
	}
	
	public Type getBehavioralType(Type type) {
		if (type instanceof DataType) {
			DataType dataType = (DataType) type;
			return dataType.getBehavioralType();
		}
		return null;
	}
	
	public int getDepth(Type aClass) {
		Map<Type, Integer> results = new HashMap<Type, Integer>();
		return getAllSuperClasses(results, aClass);
	}

	public static ExpressionInOcl getExpressionInOcl(NamedElement contextElement, OpaqueExpression specification) {
		Resource resource = contextElement.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		MetaModelManager metaModelManager = MetaModelManager.getAdapter(resourceSet);
		String expression = PivotUtil.getBody(specification);
		URI uri = metaModelManager.getResourceIdentifier(specification, null);
		ExpressionInOcl expressionInOcl = null;
		try {
			expressionInOcl = PivotUtil.resolveSpecification(metaModelManager, uri, contextElement, expression);
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		if (expressionInOcl != null) {
			String messageExpression = PivotUtil.getMessage(specification);
			if ((messageExpression != null) && (messageExpression.trim().length() > 0)) {
				try {
					PivotUtil.resolveSpecification(metaModelManager, uri, expressionInOcl, messageExpression);
				} catch (ParserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return expressionInOcl;
	}

	public static String getFragmentURI(Element element) {
		return EcoreUtil.getURI(element).fragment().toString();
	}

	public static String getMoniker(Element element) {
		return Pivot2Moniker.toString(element);
	}
	
	public String getSignature(Operation anOperation) {
		if (anOperation == null) {
			return "null";
		}
		String qualifiedSignature = PrettyPrintTypeVisitor.prettyPrint(anOperation, (Namespace)anOperation.getOwningType());	// FIXME cast
		int index = qualifiedSignature.indexOf("::");
		return index > 0 ? qualifiedSignature.substring(index+2) : qualifiedSignature;	// FIXME with PrettyPrintOptions
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
