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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * A TypeSpecializationAdapter adapts an unspecialized type to keep track of zero or more specializations
 * using WeakReferences so that the specializations vanish once no longer required.
 */
public class TypeSpecializationAdapter implements Adapter.Internal
{
	public static TypeSpecializationAdapter findAdapter(Type type) {
		if (type == null) {
			return null;
		}
		return PivotUtil.getAdapter(TypeSpecializationAdapter.class, type);
	}

	public static TypeSpecializationAdapter getAdapter(Type type) {
		if (type == null) {
			return null;
		}
		List<Adapter> eAdapters = type.eAdapters();
		synchronized (eAdapters) {
			TypeSpecializationAdapter adapter = PivotUtil.getAdapter(TypeSpecializationAdapter.class, eAdapters);
			if (adapter == null) {
				adapter = new TypeSpecializationAdapter(type);
				eAdapters.add(adapter);
			}
			return adapter;
		}
	}	
	
	protected final Type unspecializedType;
	
	/**
	 * Map from first actual type to list of specialized types for further actual types. 
	 */
	private Map<ParameterableElement, List<WeakReference<Type>>> firstActual2specializations = null;

	protected TypeSpecializationAdapter(Type type) {
		assert type.getOwnedTemplateSignature() != null;
		assert type.getTemplateBindings().isEmpty();
		this.unspecializedType = type;
	}
	
	protected Type createSpecialization(List<? extends ParameterableElement> templateArguments) {
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
		Orphanage.getOrphanage(unspecializedType).add(specializedType);
//		specializeableClassServer.metaModelManager.addOrphanClass(specializedType);
		return specializedType;
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
		TemplateSignature templateSignature = unspecializedType.getOwnedTemplateSignature();
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

	public synchronized Type getSpecializedType(List<? extends ParameterableElement> templateArguments) {
		TemplateSignature templateSignature = unspecializedType.getOwnedTemplateSignature();
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

	public Type getTarget() {
		return unspecializedType;
	}

	public boolean isAdapterForType(Object type) {
		return type == TypeSpecializationAdapter.class;
	}

	public void notifyChanged(Notification notification) {}

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
				TypeSpecializationAdapter superTypeSpecializationAdapter = getAdapter(unspecializedSuperType);
/*				List<ParameterableElement> superTemplateArgumentList = new ArrayList<ParameterableElement>();
				for (TemplateBinding templateBinding : superTemplateBindings) {
					for (TemplateParameterSubstitution parameterSubstitution : templateBinding.getParameterSubstitutions()) {
						ParameterableElement templateArgument = parameterSubstitution.getActual();
						superTemplateArgumentList.add(templateArgument);
					}
				} */
				Type specializedSuperType = superTypeSpecializationAdapter.getSpecializedType(superTemplateArgumentList);
				specializedClass.getSuperClasses().add(specializedSuperType);
			}
			else {
				specializedClass.getSuperClasses().add(superType);
			}
		}
	}

	public void setTarget(Notifier newTarget) {
		assert unspecializedType == newTarget;
	}

	public void unsetTarget(Notifier oldTarget) {
		assert unspecializedType == oldTarget;
	}
}