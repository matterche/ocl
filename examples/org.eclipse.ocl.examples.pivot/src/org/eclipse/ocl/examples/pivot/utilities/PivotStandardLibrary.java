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
 * $Id: PivotStandardLibrary.java,v 1.1.2.1 2010/12/11 10:44:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;

public abstract class PivotStandardLibrary implements StandardLibrary
{
	private static final Logger logger = Logger.getLogger(PivotStandardLibrary.class);

	/**
	 * The URI used by default for the MDT/OCL Standard Library. NB. This
	 * constant is repeated in GenersateOCLstdlibModel.mwe2 an in
	 * org.eclipse.ocl.examples.library/plugin.xml.
	 */
	public static final String DEFAULT_OCL_STDLIB_URI = "http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib";

	/**
	 * The URI to provide the default Standard Library. This value may be
	 * reassigned pior to any OCL analysis or evaluation to select a different
	 * default. Alternatively the need for default may be bypassed by explicitly
	 * invoking loadLibrary().
	 */
	protected String defaultStandardLibraryURI = DEFAULT_OCL_STDLIB_URI;

	private Type booleanType = null;
	private Type classifierType = null;
	private Type integerType = null;
	private Type invalidType = null;
	private InvalidLiteralExp invalidValue = null;
	private Type nullType = null;
	private NullLiteralExp nullValue = null;
	private Type realType = null;
	private Type stringType = null;
	private Type tupleType = null;
	private Type unlimitedNaturalType = null;
	private UnlimitedNaturalLiteralExp unlimitedValue = null;
	
	private boolean allowExplanatoryInvalids = false;
	private Map<String, Type> nameToLibraryTypeMap = null;

	public InvalidLiteralExp createInvalidValue(Object object,
			OclExpression expression, String reason, Throwable throwable) {
		if (!allowExplanatoryInvalids) {
			return getInvalidValue();
		}
		InvalidLiteralExp invalidValue = PivotFactory.eINSTANCE
			.createInvalidLiteralExp();
		invalidValue.setType(getInvalidType());
		invalidValue.setObject(object);
		invalidValue.setExpression(expression);
		invalidValue.setReason(reason);
		invalidValue.setThrowable(throwable);
		return invalidValue;
	}

	protected void defineLibraryType(Type pivotType) {
		if (nameToLibraryTypeMap == null) {
			nameToLibraryTypeMap = new HashMap<String, Type>();
		}
		String name = pivotType.getName();
		Type oldType = nameToLibraryTypeMap.put(name, pivotType);
		if ((oldType != null) && (oldType != pivotType)) {
			logger.warn("Conflicting pivot type '" + name + "'");
		}
	}

	public Type getBagType() {
		return getRequiredLibraryType("Bag");
	}

	public Type getBooleanType() {
		if (booleanType == null) {
			booleanType = getRequiredLibraryType("Boolean");
		}
		return booleanType;
	}

	public Type getClassifierType() {
		if (classifierType == null) {
			classifierType = getRequiredLibraryType("Classifier");
		}
		return classifierType;
	}

	public Type getCollectionType() {
		return getRequiredLibraryType("Collection");
	}

	public Type getIntegerType() {
		if (integerType == null) {
			integerType = getRequiredLibraryType("Integer");
		}
		return integerType;
	}

	public Type getInvalidType() {
		if (invalidType == null) {
			invalidType = getRequiredLibraryType("OclInvalid");
		}
		return invalidType;
	}

	public InvalidLiteralExp getInvalidValue() {
		if (invalidValue == null) {
			invalidValue = PivotFactory.eINSTANCE.createInvalidLiteralExp();
			invalidValue.setType(getInvalidType());
		}
		return invalidValue;
	}

	public Type getLibraryType(String typeName) {
		if (nameToLibraryTypeMap == null) {
			nameToLibraryTypeMap = new HashMap<String, Type>();
			loadDefaultLibrary(defaultStandardLibraryURI);
		}
		return nameToLibraryTypeMap.get(typeName);
	}

	public Type getNullType() {
		if (nullType == null) {
			nullType = getRequiredLibraryType("OclVoid");
		}
		return nullType;
	}

	public Object getNullValue() {
		if (nullValue == null) {
			nullValue = PivotFactory.eINSTANCE.createNullLiteralExp();
			nullValue.setType(getNullType());
		}
		return nullValue;
	}

	public Type getOclAnyType() {
		return getRequiredLibraryType("OclAny");
	}

	public Type getOclMessageType() {
		return getRequiredLibraryType("OclMessage");
	}

	public Type getOrderedSetType() {
		return getRequiredLibraryType("OrderedSet");
	}

	public Type getRealType() {
		if (realType == null) {
			realType = getRequiredLibraryType("Real");
		}
		return realType;
	}

	public Type getRequiredLibraryType(String typeName) {
		Type type = getLibraryType(typeName);
		if (type == null) {
			logger.error("No '" + typeName + "' type in the OCL Standard Library");
		}
		return type;
	}

	public Type getSequenceType() {
		return getRequiredLibraryType("Sequence");
	}

	public Type getSetType() {
		return getRequiredLibraryType("Set");
	}

	public Type getStringType() {
		if (stringType == null) {
			stringType = getRequiredLibraryType("String");
		}
		return stringType;
	}

	@Deprecated
	public Type getT() {
		throw new UnsupportedOperationException(getClass().getName() + ".getT");
	}

	@Deprecated
	public Type getT2() {
		throw new UnsupportedOperationException(getClass().getName() + ".getT2");
	}

	public Type getTupleType() {
		if (tupleType == null) {
			tupleType = getRequiredLibraryType("Tuple");
		}
		return tupleType;
	}

	public Type getUnlimitedNaturalType() {
		if (unlimitedNaturalType == null) {
			unlimitedNaturalType = getRequiredLibraryType("UnlimitedNatural");
		}
		return unlimitedNaturalType;
	}

	public Object getUnlimitedValue() {
		if (unlimitedValue == null) {
			unlimitedValue = PivotFactory.eINSTANCE.createUnlimitedNaturalLiteralExp();
		}
		return unlimitedValue;
	}

	public boolean isAllowExplanatoryInvalids() {
		return allowExplanatoryInvalids;
	}
	
	protected abstract Resource loadDefaultLibrary(String uri);

	public void setAllowExplanatoryInvalids(boolean allowExplanatoryInvalids) {
		this.allowExplanatoryInvalids = allowExplanatoryInvalids;
	}
}