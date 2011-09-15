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
 * $Id: NameQueries.java,v 1.2 2011/01/24 20:54:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.build.acceleo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.SelfType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintTypeVisitor;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.pivot.utilities.Pivot2Moniker;

public class NameQueries
{
	private static Map<String, Integer> counters = new HashMap<String, Integer>();
	private static Map<Object, String> definedSymbols = new HashMap<Object, String>();
	
	public static String encodeName(NamedElement element) {
		String rawEncodeName = rawEncodeName(element);
		if (element instanceof Operation) {
			int sameNames = 0;
			int myIndex = 0;
			for (Operation operation : ((Operation)element).getClass_().getOwnedOperations()) {
				String rawName = rawEncodeName(operation);
				if (rawName.equals(rawEncodeName)) {
					if (operation == element) {
						myIndex = sameNames;
					}
					sameNames++;
				}
			}
			if (sameNames > 1) {
				return myIndex + "_" + rawEncodeName;
			}
		}
		return rawEncodeName;
	}
	
	public static String printClasses(Object classes) {
		System.out.println("");
		List<?> list = new ArrayList<Object>((Collection<?>)classes);
		for (Object object : list) {
			System.out.println(((NamedElement)object).eClass().getName() + " " + object.hashCode() + " " + ((NamedElement)object).getName());
		}
		return "null";
	}

	protected static String rawEncodeName(NamedElement element) {
		StringBuffer s = new StringBuffer();
		String name = element.getName();
//		boolean prevCharIsLower = true;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
//			boolean charIsLowerCase = Character.isLowerCase(ch);
			/*if (charIsLowerCase) {
				s.append(Character.toUpperCase(ch));
			}
			else if (Character.isUpperCase(ch)) {
				if (prevCharIsLower) {
					s.append('_');
				}
				s.append(ch);
			}
			else if (Character.isJavaIdentifierPart(ch)) {
				s.append(ch);
			}
			else*/ if (ch == '<') {
				s.append("_lt_");
			}
			else if (ch == '>') {
				s.append("_gt_");
			}
			else if (ch == '=') {
				s.append("_eq_");
			}
			else if (ch == '+') {
				s.append("_add_");
			}
			else if (ch == '-') {
				s.append("_sub_");
			}
			else if (ch == '*') {
				s.append("_mul_");
			}
			else if (ch == '/') {
				s.append("_div_");
			}
			else {
				s.append(ch);
			}
//			if ((''))
//			prevCharIsLower = charIsLowerCase;
		}
		return s.toString();
	}
	
	/**
	 * Return a symbol name for an eObject. This method is invoked from an
	 * Acceleo script and so there is only one call per distinct object. Acceleo
	 * maintains the cache that returns the symbol for old objects.
	 * 
	 * @param eObject the object in question
	 * @return the symbol name
	 */
	public static String getClassName(Class<?> javaClass) {
		return javaClass.getCanonicalName();
	}
	
	public static String getMoniker(Element element) {
		return Pivot2Moniker.toString(element);
	}
	
	/**
	 * Return a symbol name for an eObject. This method is invoked from an
	 * Acceleo script and so there is only one call per distinct object. Acceleo
	 * maintains the cache that returns the symbol for old objects.
	 * 
	 * @param eObject the object in question
	 * @return the symbol name
	 */
	public static String getSymbolName(Object elem) {
		return getPrefixedSymbolName("symbol_", elem);
	}

	public static String getPrefixedSymbolName(String prefix, Object elem) {
		String symbol = definedSymbols.get(elem);
		if (symbol == null) {
			Integer count = counters.get(prefix);
			Integer newCount = count != null ? count+1 : 0;
			counters.put(prefix, newCount);
			symbol = prefix + newCount.toString();
			definedSymbols.put(elem, symbol);
		}
		return symbol;
	}

	public static String defineSymbolName(Object elem, String symbol) {
		definedSymbols.put(elem, symbol);
		return symbol;
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
	
	public List<Type> getAllSuperClasses(Type aClass) {
		Map<Type, Integer> results = new HashMap<Type, Integer>();
		getAllSuperClasses(results, aClass);
		return new ArrayList<Type>(results.keySet());
	}
	
	public int getAllSuperClasses(Map<Type, Integer> results, Type aClass) {
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
	
	public int getDepth(Type aClass) {
		Map<Type, Integer> results = new HashMap<Type, Integer>();
		return getAllSuperClasses(results, aClass);
	}
	
	public String getSignature(Operation anOperation) {
		if (anOperation == null) {
			return "null";
		}
		String qualifiedSignature = PrettyPrintTypeVisitor.prettyPrint(anOperation, anOperation.getClass_());
		int index = qualifiedSignature.indexOf("::");
		return index > 0 ? qualifiedSignature.substring(index+2) : qualifiedSignature;	// FIXME with PrettyPrintOptions
	}
	
	/**
	 * Workaround Acceleo's lack of BigInteger support
	 */
	public String asIntegerStringOrNull(Element element) {
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
	public String asRealStringOrNull(Element element) {
		if (element instanceof RealLiteralExp) {
			return element.toString();
		}
		return null;
	}
	
	public org.eclipse.ocl.examples.pivot.Package getPivotPackage(EPackage ePackage) {
		Resource resource = ePackage.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		MetaModelManagerResourceSetAdapter resourceSetAdapter = MetaModelManagerResourceSetAdapter.getAdapter(resourceSet, null);
		Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(resource, resourceSetAdapter.getMetaModelManager());
		org.eclipse.ocl.examples.pivot.Package pivotPackage = ecore2Pivot.getCreated(org.eclipse.ocl.examples.pivot.Package.class, ePackage);
		if (pivotPackage.getNsURI().equals(PivotPackage.eNS_URI)) {
			mergeLibrary(resourceSetAdapter.getMetaModelManager(), pivotPackage);
		}
//		else if (pivotPackage.getNsURI().equals(OCLPackage.eNS_URI)) {
//			mergeLibrary(resourceSetAdapter.getMetaModelManager(), pivotPackage);
//		}
//		else if (pivotPackage.getNsURI().equals(OCLPackage.eNS_URI + ".oclstdlib")) {
//			mergeLibrary(resourceSetAdapter.getMetaModelManager(), pivotPackage);
//		}
		return pivotPackage;
	}

	public ExpressionInOcl getExpressionInOcl(NamedElement contextElement, OpaqueExpression specification) {
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
	
	public void mergeLibrary(MetaModelManager metaModelManager, org.eclipse.ocl.examples.pivot.Package primaryPackage) {
//		primaryPackage.setName("ocl");
		List<Type> primaryTypes = primaryPackage.getOwnedTypes();
		for (Library library : metaModelManager.getLibraries()) {
			Map<Type,Type> typeMap = new HashMap<Type,Type>();
			ArrayList<Type> libraryTypes = new ArrayList<Type>(library.getOwnedTypes());
			for (Type secondaryType : libraryTypes) {
				Type primaryType = PivotUtil.getNamedElement(primaryTypes, secondaryType.getName());
				if (primaryType != null) {
					typeMap.put(secondaryType, primaryType);
				}
				else {
					primaryTypes.add(secondaryType);
				}
			}
			for (Type secondaryType : libraryTypes) {
				Type primaryType = typeMap.get(secondaryType);
				if (primaryType != null) {
					List<Type> primarySuperClasses = primaryType.getSuperClasses();
					for (Type secondarySuperClass : secondaryType.getSuperClasses()) {
						Type primarySuperClass = typeMap.get(secondarySuperClass);
						if (primarySuperClass == null) {
							primarySuperClasses.add(secondarySuperClass);
						}
						else if (!primarySuperClasses.contains(primarySuperClass)) {
							primarySuperClasses.add(primarySuperClass);
						}
					}
					primaryType.getOwnedOperations().addAll(secondaryType.getOwnedOperations());
					primaryType.getOwnedAttributes().addAll(secondaryType.getOwnedAttributes());
				}
			}
		}
		for (Type primaryType : primaryTypes) {
			if (primaryType instanceof Type) {
				List<Type> primarySuperClasses = primaryType.getSuperClasses();
				Type classType = PivotUtil.getNamedElement(primarySuperClasses, "Class");
				Type classifierType = PivotUtil.getNamedElement(primarySuperClasses, "Classifier");
				if ((classType != null) && (classifierType != null)) {
					primarySuperClasses.remove(classType);		// WIP FIXME fix at source
				}
			}
		}
	}  
	
	public Boolean hasEcore(GenPackage genPackage, Property property) {
		GenClass genClass = getNamedElement1(genPackage.getGenClasses(), property.getClass_().getName());
		if (genClass == null) {
			return false;
		}
		GenFeature genFeature = getNamedElement2(genClass.getAllGenFeatures(), property.getName());
		if (genFeature == null) {
			return false;
		}
		return true;
	}

	private <T extends GenClassifier> T getNamedElement1(List<T> genClasses, String name) {
		for (T genClass : genClasses) {
			if (genClass.getName().equals(name)) {
				return genClass;
			}
		}
		return null;
	}

	private <T extends GenFeature> T getNamedElement2(List<T> genClasses, String name) {
		for (T genClass : genClasses) {
			if (genClass.getName().equals(name)) {
				return genClass;
			}
		}
		return null;
	}

	private <T extends GenPackage> T getNamedElementByNsURI(List<T> genPackages, String nsURI) {
		for (T genPackage : genPackages) {
			if (genPackage.getEcorePackage().getNsURI().equals(nsURI)) {
				return genPackage;
			}
		}
		return null;
	}
	
	public GenPackage getGenPackage(GenPackage genPackage, org.eclipse.ocl.examples.pivot.Package pivotPackage) {
//		pivotPackage.getOwnedTypes()
		if (genPackage.getEcorePackage().getName().equals(pivotPackage.getName())) {
			return genPackage;
		}
		GenModel genModel = genPackage.getGenModel();
		List<GenPackage> usedGenPackages = genModel.getUsedGenPackages();
		String nsURI = pivotPackage.getNsURI();
		GenPackage usedGenPackage = getNamedElementByNsURI(usedGenPackages, nsURI);
		if (usedGenPackage != null) {
			return usedGenPackage;
		}
		if (nsURI.endsWith(".oclstdlib")) {
			nsURI = nsURI.substring(0, nsURI.length() - 10);
			usedGenPackage = getNamedElementByNsURI(usedGenPackages, nsURI);
			if (usedGenPackage != null) {
				return usedGenPackage;
			}
		}
		return genPackage;	// FIXME
	}
}
