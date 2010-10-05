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
 * $Id: CompleteEnvironmentManager.java,v 1.1.2.1 2010/10/05 17:38:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.ocl.examples.pivot.CompleteClass;
import org.eclipse.ocl.examples.pivot.CompleteOperation;
import org.eclipse.ocl.examples.pivot.CompletePackage;
import org.eclipse.ocl.examples.pivot.CompleteProperty;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.internal.impl.CompleteEnvironmentImpl;

public class CompleteEnvironmentManager extends CompleteEnvironmentImpl
{	
	private static final Logger logger = Logger.getLogger(CompleteEnvironmentManager.class);

	protected final PivotManager pivotManager;
	private Map<org.eclipse.ocl.examples.pivot.Package, CompletePackage> completePackageMap = new HashMap<org.eclipse.ocl.examples.pivot.Package, CompletePackage>();
	private Map<Operation, CompleteOperation> completeOperationMap = new HashMap<Operation, CompleteOperation>();
	private Map<org.eclipse.ocl.examples.pivot.Class, CompleteClass> completeClassMap = new HashMap<org.eclipse.ocl.examples.pivot.Class, CompleteClass>();
	private Map<Property, CompleteProperty> completePropertyMap = new HashMap<Property, CompleteProperty>();

	public CompleteEnvironmentManager(PivotManager pivotManager) {
		this.pivotManager = pivotManager;
	}
	
	protected CompleteClass createCompleteClass(org.eclipse.ocl.examples.pivot.Class cls) {
		CompleteClass completeClass;
		completeClass = PivotFactory.eINSTANCE.createCompleteClass();
		completeClass.setModel(cls);
		completeClass.setCompleteEnvironment(this);
		completeClassMap.put(cls, completeClass);
		completeClass.setName(cls.getName());
		completeClass.setPackage(getCompletePackage(cls.getPackage()));
		return completeClass;
	}
	
	protected CompleteOperation createCompleteOperation(Operation operation) {
		CompleteOperation completeOperation;
		completeOperation = PivotFactory.eINSTANCE.createCompleteOperation();
		completeOperation.setModel(operation);
		completeOperation.setCompleteEnvironment(this);
		completeOperationMap.put(operation, completeOperation);
		completeOperation.setClass_(getCompleteClass(operation.getClass_()));
		completeOperation.setName(operation.getName());
		completeOperation.setImplementation(operation.getImplementation());
		completeOperation.setImplementationClass(operation.getImplementationClass());
		return completeOperation;
	}
	
	protected CompletePackage createCompletePackage(org.eclipse.ocl.examples.pivot.Package pkg) {
		CompletePackage completePackage;
		completePackage = PivotFactory.eINSTANCE.createCompletePackage();
		completePackage.setModel(pkg);
		completePackage.setCompleteEnvironment(this);
		completePackageMap.put(pkg, completePackage);
		completePackage.setName(pkg.getName());
		Package nestingPackage = pkg.getNestingPackage();
		if (nestingPackage != null) {
			completePackage.setNestingPackage(getCompletePackage(nestingPackage));
		}
		return completePackage;
	}
	
	protected CompleteProperty createCompleteProperty(Property property) {
		CompleteProperty completeProperty;
		completeProperty = PivotFactory.eINSTANCE.createCompleteProperty();
		completeProperty.setModel(property);
		completeProperty.setCompleteEnvironment(this);
		completePropertyMap.put(property, completeProperty);
		completeProperty.setName(property.getName());
		completeProperty.setClass_(getCompleteClass(property.getClass_()));
		return completeProperty;
	}

	@Override
	public CompleteClass getCompleteClass(org.eclipse.ocl.examples.pivot.Class cls) {
		if (cls == null) {
			logger.warn("getCompleteClass for null");
			return null;
		}
		if (cls instanceof CompleteClass) {
			CompleteClass completeClass = (CompleteClass) cls;
			if (completeClass.getCompleteEnvironment() == this) {
				return completeClass;
			}
			logger.warn("getCompleteClass for a CompleteClass " + cls);
			return getCompleteClass(((CompleteClass)cls).getModel());
		}
		CompleteClass completeClass = completeClassMap.get(cls);
		if (completeClass == null) {
			completeClass = createCompleteClass(cls);
		}
		return completeClass;
	}

	@Override
	public CompleteOperation getCompleteOperation(Operation operation) {
		if (operation == null) {
			logger.warn("getCompleteOperation for null");
			return null;
		}
		if (operation instanceof CompleteOperation) {
			CompleteOperation completeOperation = (CompleteOperation) operation;
			if (completeOperation.getCompleteEnvironment() == this) {
				return completeOperation;
			}
			logger.warn("getCompleteOperation for a CompleteOperation " + operation);
			return getCompleteOperation(((CompleteOperation)operation).getModel());
		}
		CompleteOperation completeOperation = completeOperationMap.get(operation);
		if (completeOperation == null) {
			completeOperation = createCompleteOperation(operation);
		}
		return completeOperation;
	}

	@Override
	public CompletePackage getCompletePackage(org.eclipse.ocl.examples.pivot.Package pkg) {
		if (pkg == null) {
			logger.warn("getCompletePackage for null");
			return null;
		}
		if (pkg instanceof CompletePackage) {
			CompletePackage completePackage = (CompletePackage) pkg;
			if (completePackage.getCompleteEnvironment() == this) {
				return completePackage;
			}
			logger.warn("getCompletePackage for a CompletePackage " + pkg);
			return getCompletePackage(((CompletePackage)pkg).getModel());
		}
		CompletePackage completePackage = completePackageMap.get(pkg);
		if (completePackage == null) {
			completePackage = createCompletePackage(pkg);
		}
		return completePackage;
	}

	@Override
	public CompleteProperty getCompleteProperty(Property property) {
		if (property == null) {
			logger.warn("getCompleteProperty for null");
			return null;
		}
		if (property instanceof CompleteProperty) {
			CompleteProperty completeProperty = (CompleteProperty) property;
			if (completeProperty.getCompleteEnvironment() == this) {
				return completeProperty;
			}
			logger.warn("getCompleteProperty for a CompleteProperty " + property);
			return getCompleteProperty(((CompleteProperty)property).getModel());
		}
		CompleteProperty completeProperty = completePropertyMap.get(property);
		if (completeProperty == null) {
			completeProperty = createCompleteProperty(property);
		}
		return completeProperty;
	}
}