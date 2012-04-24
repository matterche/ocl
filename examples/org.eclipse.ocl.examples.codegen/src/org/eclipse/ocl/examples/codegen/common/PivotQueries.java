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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.SelfType;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrinter;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintOptions;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.Pivot2Moniker;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLLeft2RightVisitor;

public class PivotQueries
{
	private static final Logger logger = Logger.getLogger(EssentialOCLLeft2RightVisitor.class);
	
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

	protected static ExpressionInOcl createExpressionInOclError(String string) {
		ExpressionInOcl expressionInOcl = PivotFactory.eINSTANCE.createExpressionInOcl();
		StringLiteralExp stringLiteral = PivotFactory.eINSTANCE.createStringLiteralExp();
		stringLiteral.setStringSymbol(string);
		expressionInOcl.setMessageExpression(stringLiteral);
		return expressionInOcl;
	}

	protected static PrettyPrintOptions.Global createOptions(Visitable element) {
		Namespace scope = null;
		if (element instanceof ExpressionInOcl) {
			scope = PivotUtil.getNamespace(((ExpressionInOcl)element).getContextVariable().getType());
		}
		else if (element instanceof EObject) {
			scope = PivotUtil.getNamespace((EObject)element);
		}
		PrettyPrintOptions.Global createOptions = PrettyPrinter.createOptions(scope);
		createOptions.setLinelength(80);
		if (element instanceof EObject) {
			Resource resource = EcoreUtil.getRootContainer((EObject)element).eResource();
			if (resource != null) {
				MetaModelManager metaModelManager = MetaModelManager.getAdapter(resource.getResourceSet());
				if (metaModelManager != null) {
					createOptions.setMetaModelManager(metaModelManager);
				}
			}
		}
		return createOptions;
	}
	
	protected int getAllSuperClasses(Map<Type, Integer> results, Type aClass) {
		Integer depth = results.get(aClass);
		if (depth != null) {
			return depth;
		}
		int myDepth = 0;
		for (Type superClass : aClass.getSuperClass()) {
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

	/**
	 * Return an OCL AST from a ValueSpecification in the context of a NamedElement. If it is necessary
	 * to parse OCL concrete syntax and errors result an ExpressionInOcl is returned with a null
	 * contextVariable, a null bodyExpression, and a StringLiteral messageExpression
	 * containing the error messages.
	 */
	public static ExpressionInOcl getExpressionInOcl(NamedElement contextElement, ValueSpecification specification) {
		if (specification instanceof ExpressionInOcl) {
			return (ExpressionInOcl) specification;
		}
		else if (specification instanceof OpaqueExpression) {
			Resource resource = contextElement.eResource();
			ResourceSet resourceSet = resource.getResourceSet();
			MetaModelManager metaModelManager = MetaModelManager.getAdapter(resourceSet);
			OpaqueExpression opaqueExpression = (OpaqueExpression) specification;
			String expression = PivotUtil.getBody(opaqueExpression);
			if (expression == null) {
				return createExpressionInOclError("Missing expression");
			}
			URI uri = metaModelManager.getResourceIdentifier(specification, null);
			ExpressionInOcl expressionInOcl = null;
			try {
				expressionInOcl = PivotUtil.resolveSpecification(metaModelManager, uri, contextElement, expression);
			} catch (ParserException e) {
				logger.error(e.getMessage());
				return createExpressionInOclError(e.getMessage());
			}
			if (expressionInOcl != null) {
				String messageExpression = PivotUtil.getMessage(opaqueExpression);
				if ((messageExpression != null) && (messageExpression.trim().length() > 0)) {
					try {
						PivotUtil.resolveSpecification(metaModelManager, uri, expressionInOcl, messageExpression);
					} catch (ParserException e) {
						logger.error("Failed to parse \"" + messageExpression + "\"", e);
					}
				}
			}
			return expressionInOcl;
		}
		else {
			Resource resource = contextElement.eResource();
			ResourceSet resourceSet = resource.getResourceSet();
			MetaModelManager metaModelManager = MetaModelManager.getAdapter(resourceSet);
			ExpressionInOcl expressionInOcl = PivotFactory.eINSTANCE.createExpressionInOcl();
			expressionInOcl.setBodyExpression(metaModelManager.createInvalidExpression());
			return expressionInOcl;
		}
	}

	public static String getFragmentURI(Element element) {
		return EcoreUtil.getURI(element).fragment().toString();
	}

	public static String getMoniker(Element element) {
		return Pivot2Moniker.toString(element);
	}
	
	public LinkedHashSet<Operation> getOperations(Type type) {
		ResourceSet resourceSet = type.eResource().getResourceSet();
		MetaModelManager metaModelManager = MetaModelManager.getAdapter(resourceSet);
		LinkedHashSet<Operation> operations = new LinkedHashSet<Operation>();
		for (Operation operation : metaModelManager.getLocalOperations(type, null)) {
			operations.add(operation);
		}
//		if (type.getName().equals("MultiplicityElement")) {
//			System.out.println("here " + operations.size());
//		}
		return operations;
	}
	
	public LinkedHashSet<Property> getProperties(Type type) {
		ResourceSet resourceSet = type.eResource().getResourceSet();
		MetaModelManager metaModelManager = MetaModelManager.getAdapter(resourceSet);
		LinkedHashSet<Property> properties = new LinkedHashSet<Property>();
		for (Property property : metaModelManager.getLocalProperties(type, null)) {
			properties.add(property);
		}
		return properties;
	}
	
	public String getSignature(Operation anOperation) {
		if (anOperation == null) {
			return "null";
		}
		String qualifiedSignature = PrettyPrinter.printType(anOperation, (Namespace)anOperation.getOwningType());	// FIXME cast
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
		List<Parameter> parameters = operation.getOwnedParameter();
		if (parameters.size() != 1) {
			return false;
		}
		return parameters.get(0).getType() instanceof SelfType;
	}
	
	public static String prettyPrint(Element element) {
		PrettyPrintOptions.Global createOptions = createOptions(element);
		return PrettyPrinter.print(element, createOptions);
	}
	
	public static String prettyPrintName(Element element) {
		PrettyPrintOptions.Global createOptions = createOptions(element);
		return PrettyPrinter.printName(element, createOptions);
	}
	
}
