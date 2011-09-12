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
package org.eclipse.ocl.examples.pivot.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

/**
 * A TypeServer adapts the primary Type to coordinate the coherent behaviour of a primary and one or more
 * secondary Types as required for Complete OCL type extension.
 */
public class TypeServer extends TypeTracker
{
	public static Function<TypeTracker, Type> tracker2class = new Function<TypeTracker, Type>()
	{
		public Type apply(TypeTracker typeTracker) {
			return typeTracker.getTarget();
		}
	};
	
	private final List<TypeTracker> trackers = new ArrayList<TypeTracker>();

	/**
	 * Map from operation name to the overload list of operation or a list of operations to be treated as merged. 
	 */
	private final Map<String, List<List<Operation>>> operation2operations = new HashMap<String, List<List<Operation>>>();

	/**
	 * Map from property name to the list of properties to be treated as merged. 
	 */
	private final Map<String, List<Property>> property2properties = new HashMap<String, List<Property>>();
	
	protected TypeServer(PackageManager packageManager, Type primaryType) {
		super(packageManager, primaryType);
		trackers.add(this);
		initializeContents();
	}

	void addOperation(Operation pivotOperation) {
		String operationName = pivotOperation.getName();
		List<List<Operation>> overloads = operation2operations.get(operationName);
		if (overloads == null) {
			overloads = new ArrayList<List<Operation>>();
			operation2operations.put(operationName, overloads);
		}
		List<Operation> overload = findOverload(overloads, pivotOperation.getOwnedParameters());
		if (overload == null) {
			overload = new ArrayList<Operation>();
			overloads.add(overload);
		}
		if (!overload.contains(pivotOperation)) {
			overload.add(pivotOperation);
		}
	}

	void addProperty(Property pivotProperty) {
		String propertyName = pivotProperty.getName();
		List<Property> properties = property2properties.get(propertyName);
		if (properties == null) {
			properties = new ArrayList<Property>();
			property2properties.put(propertyName, properties);
		}
		if (!properties.contains(pivotProperty)) {
			properties.add(pivotProperty);
		}
	}
	
	public TypeClient addSecondaryType(Type secondaryType) {
		TypeClient typeClient = (TypeClient) EcoreUtil.getAdapter(secondaryType.eAdapters(), packageManager);
		if (typeClient == null) {
			typeClient = new TypeClient(this, secondaryType);
		}
		if (!trackers.contains(typeClient)) {
			trackers.add(typeClient);
		}
		return typeClient;
	}

	void addedOperation(Object object) {
		if (object instanceof Operation) {
			Operation pivotOperation = (Operation)object;
			addOperation(pivotOperation);
		}
	}

	void addedProperty(Object object) {
		if (object instanceof Property) {
			Property pivotProperty = (Property)object;
			addProperty(pivotProperty);
		}
	}

	@Override
	public void dispose() {
		if (!trackers.isEmpty()) {
			Collection<TypeTracker> savedTypeTrackers = new ArrayList<TypeTracker>(trackers);
			trackers.clear();
			for (TypeTracker typeTracker : savedTypeTrackers) {
				if (typeTracker instanceof TypeClient) {
					typeTracker.dispose();
				}
			}
		}
		property2properties.clear();
		operation2operations.clear();
		super.dispose();
	}
	
	private List<Operation> findOverload(List<List<Operation>> overloads, List<? extends TypedElement> requiredParameters) {
		int requiredSize = requiredParameters.size();
		for (List<Operation> overload : overloads) {
			if (overload.size() > 0) {
				Operation operation = overload.get(0);
				List<? extends TypedElement> actualParameters = operation.getOwnedParameters();
				if (requiredSize == actualParameters.size()) {
					boolean gotIt = true;
					for (int i = 0; i < requiredSize; i++) {
						TypedElement requiredParameter = requiredParameters.get(i);
						TypedElement actualParameter = actualParameters.get(i);
						Type requiredType = requiredParameter.getType();
						Type actualType = actualParameter.getType();
						if (requiredType != actualType) {
							gotIt = false;
							break;
						}
					}
					if (gotIt) {
						return overload;
					}
				}
			}
		}			
		return null;
	}

	public Iterable<Type> getTypes() {
		return Iterables.transform(trackers, tracker2class);
	}
	
	@Override
	public TypeServer getTypeServer() {
		return this;
	}

	public TypeTracker getTypeTracker(Type pivotType) {
		for (TypeTracker typeTracker : trackers) {
			if (typeTracker.getTarget() == pivotType) {
				return typeTracker;
			}
		}
		return addSecondaryType(pivotType);
	}

	public Operation getOperation(Operation pivotOperation) {
		String operationName = pivotOperation.getName();
		List<List<Operation>> overloads = operation2operations.get(operationName);
		if (overloads == null) {
			return null;
		}
		List<Operation> overload = findOverload(overloads, pivotOperation.getOwnedParameters());
		if (overload == null) {
			return null;
		}
		return overload.isEmpty() ? null : overload.get(0);
	}

	public Iterable<Operation> getOperations(Operation pivotOperation) {
		String operationName = pivotOperation.getName();
		List<List<Operation>> overloads = operation2operations.get(operationName);
		if (overloads == null) {
			return null;
		}
		return findOverload(overloads, pivotOperation.getOwnedParameters());
	}

	public Iterable<Property> getProperties(Property pivotProperty) {
		String propertyName = pivotProperty.getName();
		return property2properties.get(propertyName);
	}

	public Property getProperty(String propertyName) {
		List<Property> properties = property2properties.get(propertyName);
		if (properties == null) {
			return null;
		}
		return properties.isEmpty() ? null : properties.get(0);
	}

	void removedType(Type pivotType) {
		TypeTracker typeTracker = packageManager.findTypeTracker(pivotType);
		if (typeTracker == this) {
			dispose();
		}
		else {
			trackers.remove(typeTracker);
		}
	}
	
	void removedClient(TypeClient classClient) {
		trackers.remove(classClient);
	}

	void removedOperation(Object object) {
		if (object instanceof Operation) {
			Operation pivotOperation = (Operation)object;
			String operationName = pivotOperation.getName();
			List<List<Operation>> overloads = operation2operations.get(operationName);
			if (overloads == null) {
				overloads = new ArrayList<List<Operation>>();
				operation2operations.put(operationName, overloads);
			}
			List<Operation> overload = findOverload(overloads, pivotOperation.getOwnedParameters());
			if (overload != null) {
				overload.remove(pivotOperation);
				if (overload.isEmpty()) {
					overloads.remove(overload);
					if (overloads.isEmpty()) {
						operation2operations.remove(operationName);
					}
				}
			}
//			removeOrphan(pivotOperation);
		}
	}

	void removedProperty(Object object) {
		if (object instanceof Property) {
			Property pivotProperty = (Property)object;
			String propertyName = pivotProperty.getName();
			List<Property> properties = property2properties.get(propertyName);
			if (properties != null) {
				properties.remove(propertyName);
				if (properties.isEmpty()) {
					property2properties.remove(propertyName);
				}
			}
//			removeOrphan(pivotProperty);
		}
	}
}