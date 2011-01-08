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
 * $Id: PivotStandardLibrary.java,v 1.1.2.5 2011/01/08 15:35:07 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OrderedSetType;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.SequenceType;
import org.eclipse.ocl.examples.pivot.SetType;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.model.OclMetaModel;

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
	private Type oclInvalidType = null;
	private Type oclVoidType = null;
	
	org.eclipse.ocl.examples.pivot.Package pivotPackage = null;
	
	private Map<String, Type> nameToLibraryTypeMap = null;

	public InvalidLiteralExp createInvalidValue(Object object,
			OclExpression expression, String reason, Throwable throwable) {
		InvalidLiteralExp invalidValue = PivotFactory.eINSTANCE.createInvalidLiteralExp();
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

	public Type getBagTypeType() {
		return getRequiredLibraryType("BagType");
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

	public Type getCollectionTypeType() {
		return getRequiredLibraryType("CollectionType");
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

	public Type getOclInvalidType() {
		if (oclInvalidType == null) {
			oclInvalidType = getRequiredLibraryType("OclInvalid");
		}
		return oclInvalidType;
	}

	public Type getOclMessageType() {
		return getRequiredLibraryType("OclMessage");
	}

	public Type getOclVoidType() {
		if (oclVoidType == null) {
			oclVoidType = getRequiredLibraryType("OclVoid");
		}
		return oclVoidType;
	}

	public Type getOrderedSetType() {
		return getRequiredLibraryType("OrderedSet");
	}

	public Type getOrderedSetTypeType() {
		return getRequiredLibraryType("OrderedSetType");
	}
	
	public org.eclipse.ocl.examples.pivot.Package getPivotPackage() {
		if (pivotPackage == null) {
			pivotPackage = OclMetaModel.create((org.eclipse.ocl.examples.pivot.Class)getClassifierType());
		}
		return pivotPackage;
	}

	/**
	 * Return the pivot model class for className with the Pivot Model.
	 */
	public Type getPivotType(String className) {
		return PivotUtil.getNamedElement(getPivotPackage().getOwnedTypes(), className);
	}	

	public Type getPrimitiveTypeType() {
		return getRequiredLibraryType("PrimitiveType");
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
			if ((nameToLibraryTypeMap == null) || nameToLibraryTypeMap.isEmpty()) {
				logger.error("No OCL Standard Library available");
			}
			else {
				logger.error("No '" + typeName + "' type in the OCL Standard Library");
			}
		}
		return type;
	}

	public Type getSequenceType() {
		return getRequiredLibraryType("Sequence");
	}

	public Type getSequenceTypeType() {
		return getRequiredLibraryType("SequenceType");
	}

	public Type getSetType() {
		return getRequiredLibraryType("Set");
	}

	public Type getSetTypeType() {
		return getRequiredLibraryType("SetType");
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

	public boolean isOrdered(Type sourceType) {
		if (sourceType instanceof OrderedSetType) {
			return true;
		}
		if (sourceType instanceof SequenceType) {
			return true;
		}
		return false;
	}

	public boolean isUnique(Type sourceType) {
		if (sourceType instanceof OrderedSetType) {
			return true;
		}
		if (sourceType instanceof SetType) {
			return true;
		}
		return false;
	}
	
	protected abstract Resource loadDefaultLibrary(String uri);
}