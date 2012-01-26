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

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.library.executor.ReflectiveType;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.executor.PivotReflectivePackage;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

/**
 * A TypeServer adapts the primary Type to coordinate the coherent behaviour of a primary and one or more
 * secondary Types as required for Complete OCL type extension.
 * 
 * For specializeable types, a TypeServer keeps track of zero or more specializations
 * using WeakReferences so that the specializations vanish once no longer required.
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
	
	/**
	 * Compiled inheritance relationships used by compiled expressions.
	 */
	private ReflectiveType executorType = null;
	
	/**
	 * Map from first actual type to list of specialized types for further actual types. 
	 */
	private Map<ParameterableElement, List<WeakReference<Type>>> firstActual2specializations = null;
	
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
		List<Operation> overload = findOverload(overloads, pivotOperation);
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
	
	protected Type createSpecialization(List<? extends ParameterableElement> templateArguments) {
		Type unspecializedType = getTarget();
		String typeName = unspecializedType.getName();
		TemplateSignature templateSignature = unspecializedType.getOwnedTemplateSignature();
		List<TemplateParameter> templateParameters = templateSignature.getOwnedParameters();
		EClass eClass = unspecializedType.eClass();
		EFactory eFactoryInstance = eClass.getEPackage().getEFactoryInstance();
		Type specializedType = (Type) eFactoryInstance.create(eClass);		
		specializedType.setName(typeName);
		TemplateBinding templateBinding = PivotFactory.eINSTANCE.createTemplateBinding();
		templateBinding.setSignature(templateSignature);
		Map<TemplateParameter, ParameterableElement> allBindings = new HashMap<TemplateParameter, ParameterableElement>();
		for (int i = 0; i < templateParameters.size(); i++) {
			TemplateParameter formalParameter = templateParameters.get(i);
			ParameterableElement actualType = templateArguments.get(i);
			allBindings.put(formalParameter, templateArguments.get(i));
			TemplateParameterSubstitution templateParameterSubstitution = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
			templateParameterSubstitution.setFormal(formalParameter);
			if ((actualType != null) && (actualType.eResource() == null)) {
				templateParameterSubstitution.setOwnedActual(actualType);
			}
			else {
				templateParameterSubstitution.setActual(actualType);
			}
			templateBinding.getParameterSubstitutions().add(templateParameterSubstitution);
		}
		specializedType.getTemplateBindings().add(templateBinding);
		resolveSuperClasses(specializedType, unspecializedType, allBindings);
		if (specializedType instanceof CollectionType) {
			ParameterableElement templateArgument = templateArguments.get(0);
			CollectionType specializedCollectionType = (CollectionType)specializedType;
			specializedCollectionType.setElementType((Type) templateArgument);
		}
		else if (specializedType instanceof ClassifierType) {
			ParameterableElement templateArgument = templateArguments.get(0);
			ClassifierType specializedClassifierType = (ClassifierType)specializedType;
			specializedClassifierType.setInstanceType((Type)templateArgument);
		}
		specializedType.setUnspecializedElement(unspecializedType);
		Orphanage.getOrphanage(getMetaModelManager().getPivotResourceSet()).add(specializedType);
//		specializeableClassServer.metaModelManager.addOrphanClass(specializedType);
		return specializedType;
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
		if (executorType != null) {
			executorType.dispose();
			executorType = null;
		}
		super.dispose();
	}
	
	private List<Operation> findOverload(List<List<Operation>> overloads, Operation requiredOperation) {
		List<? extends TypedElement> requiredParameters;
		if (requiredOperation instanceof Iteration) {
			requiredParameters = ((Iteration)requiredOperation).getOwnedIterators();
		}
		else {
			requiredParameters = requiredOperation.getOwnedParameters();
		}
		int requiredSize = requiredParameters.size();
		for (List<Operation> overload : overloads) {
			if (overload.size() > 0) {
				Operation operation = overload.get(0);
				List<? extends TypedElement> actualParameters;
				if (operation instanceof Iteration) {
					actualParameters = ((Iteration)operation).getOwnedIterators();
				}
				else {
					actualParameters = operation.getOwnedParameters();
				}
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

	protected Type findSpecialization(List<WeakReference<Type>> partialSpecializations, List<? extends ParameterableElement> templateArguments) {
		for (int j = partialSpecializations.size(); --j >= 0; ) {
			Type specializedType = partialSpecializations.get(j).get();
			if (specializedType == null) {
				partialSpecializations.remove(j);
			}
			else {
				int i = 0;
				boolean gotIt = true;
				for (TemplateBinding templateBinding : specializedType.getTemplateBindings()) {
					for (TemplateParameterSubstitution parameterSubstitution : templateBinding.getParameterSubstitutions()) {
						if (i > 0) {
							ParameterableElement requiredTemplateArgument = templateArguments.get(i);
							ParameterableElement actualTemplateArgument = parameterSubstitution.getActual();
							if (requiredTemplateArgument != actualTemplateArgument) {			// WIP isEquals ???
								gotIt = false;
								break;
							}
						}
						i++;
					}
					if (!gotIt) {
						break;
					}
				}
				if (gotIt) {
					return specializedType;
				}
			}
		}
		return null;
	}

	public synchronized Type findSpecializedType(List<? extends ParameterableElement> templateArguments) {
		TemplateSignature templateSignature = getTarget().getOwnedTemplateSignature();
		List<TemplateParameter> templateParameters = templateSignature.getParameters();
		int iMax = templateParameters.size();
		if (templateArguments.size() != iMax) {
			return null;
		}
		if (firstActual2specializations == null) {
			return null;
		}
		ParameterableElement firstTemplateArgument = templateArguments.get(0);
		List<WeakReference<Type>> partialSpecializations = firstActual2specializations.get(firstTemplateArgument);
		if (partialSpecializations == null) {
			return null;
		}
		return findSpecialization(partialSpecializations, templateArguments);
	}

	protected PivotReflectivePackage getExecutorPackage() {
		MetaModelManager metaModelManager = getMetaModelManager();
		return metaModelManager.getPackageTracker(target.getPackage()).getPackageServer().getExecutorPackage();
	}

	public ReflectiveType getExecutorType() {
		if (executorType == null) {
			PivotReflectivePackage executorPackage = getExecutorPackage();
			executorType = executorPackage.getInheritance(target);
		}
		return executorType;
	}

	public Operation getOperation(Operation pivotOperation) {
		String operationName = pivotOperation.getName();
		List<List<Operation>> overloads = operation2operations.get(operationName);
		if (overloads == null) {
			return null;
		}
		List<Operation> overload = findOverload(overloads, pivotOperation);
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
		return findOverload(overloads, pivotOperation);
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

	public synchronized Type getSpecializedType(List<? extends ParameterableElement> templateArguments) {
		TemplateSignature templateSignature = getTarget().getOwnedTemplateSignature();
		List<TemplateParameter> templateParameters = templateSignature.getParameters();
		int iMax = templateParameters.size();
		if (templateArguments.size() != iMax) {
			return null;
		}
		if (firstActual2specializations == null) {
			firstActual2specializations = new HashMap<ParameterableElement, List<WeakReference<Type>>>();
		}
		ParameterableElement firstTemplateArgument = templateArguments.get(0);
		List<WeakReference<Type>> partialSpecializations = firstActual2specializations.get(firstTemplateArgument);
		if (partialSpecializations == null) {
			partialSpecializations = new ArrayList<WeakReference<Type>>();
			firstActual2specializations.put(firstTemplateArgument, partialSpecializations);
		}
		Type specializedType = findSpecialization(partialSpecializations, templateArguments);
		if (specializedType == null) {
			specializedType = createSpecialization(templateArguments);
			partialSpecializations.add(new WeakReference<Type>(specializedType));
		}
		return specializedType;
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

	public List<TypeTracker> getTypeTrackers() {
		return trackers;
	}

	/**
	 * Observe any superclass changes and uninstall all affected Inheritances.
	 */
	@Override
	public void notifyChanged(Notification msg) {
		if ((executorType != null) && (msg.getNotifier() == target)) {
			if (msg.getFeature() == PivotPackage.Literals.TYPE__SUPER_CLASS) {
				switch (msg.getEventType()) {
					case Notification.ADD:
					case Notification.ADD_MANY:
					case Notification.REMOVE:
					case Notification.REMOVE_MANY:
					case Notification.RESOLVE:
					case Notification.SET:
					case Notification.UNSET:
						executorType.uninstall();
						executorType = null;
						break;
				}
			}
		}
		super.notifyChanged(msg);
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
			List<Operation> overload = findOverload(overloads, pivotOperation);
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

	protected void resolveSuperClasses(Type specializedClass, Type libraryClass, Map<TemplateParameter, ParameterableElement> allBindings) {
		for (Type superType : libraryClass.getSuperClasses()) {
			List<TemplateBinding> superTemplateBindings = superType.getTemplateBindings();
			if (superTemplateBindings.size() > 0) {
//				Map<TemplateParameter, ParameterableElement> superTemplateArgumentMap = new HashMap<TemplateParameter, ParameterableElement>();
				List<ParameterableElement> superTemplateArgumentList = new ArrayList<ParameterableElement>();
				for (TemplateBinding superTemplateBinding : superTemplateBindings) {
					for (TemplateParameterSubstitution superParameterSubstitution : superTemplateBinding.getParameterSubstitutions()) {
						ParameterableElement superActual = superParameterSubstitution.getActual();
//						TemplateParameter superFormal = superParameterSubstitution.getFormal();
						TemplateParameter superTemplateParameter = superActual.getTemplateParameter();
						ParameterableElement actualActual = allBindings.get(superTemplateParameter);
//						superTemplateArgumentMap.put(superFormal, actualActual);
						superTemplateArgumentList.add(actualActual);
					}
				}
				Type unspecializedSuperType = PivotUtil.getUnspecializedTemplateableElement(superType);
				TypeServer superTypeServer = getMetaModelManager().getTypeServer(unspecializedSuperType);
/*				List<ParameterableElement> superTemplateArgumentList = new ArrayList<ParameterableElement>();
				for (TemplateBinding templateBinding : superTemplateBindings) {
					for (TemplateParameterSubstitution parameterSubstitution : templateBinding.getParameterSubstitutions()) {
						ParameterableElement templateArgument = parameterSubstitution.getActual();
						superTemplateArgumentList.add(templateArgument);
					}
				} */
				Type specializedSuperType = superTypeServer.getSpecializedType(superTemplateArgumentList);
				specializedClass.getSuperClasses().add(specializedSuperType);
			}
			else {
				specializedClass.getSuperClasses().add(superType);
			}
		}
	}
}