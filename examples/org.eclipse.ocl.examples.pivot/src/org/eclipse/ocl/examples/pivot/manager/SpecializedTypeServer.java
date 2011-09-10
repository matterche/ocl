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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * A SpecializedTypeServer adapts the primary Type to coordinate the coherent behaviour of a primary and one or more
 * secondary Types as required for Complete OCL type extension.
 */
public class SpecializedTypeServer extends TypeServer
{	
	static SpecializedTypeServer install(SpecializeableTypeServer specializeableClassServer, List<? extends ParameterableElement> templateArguments) {
		Type unspecializedType = specializeableClassServer.getTarget();
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
		resolveSuperClasses(specializeableClassServer.getTypeCaches(), specializedType, unspecializedType, allBindings);
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
		specializeableClassServer.metaModelManager.addOrphanClass(specializedType);
		return new SpecializedTypeServer(specializeableClassServer, specializedType, templateArguments);
	}

	static void resolveSuperClasses(MetaModelManager metaModelManager, Type specializedClass,
			Type libraryClass, Map<TemplateParameter, ParameterableElement> allBindings) {
		for (Type superType : libraryClass.getSuperClasses()) {
			Map<TemplateParameter, ParameterableElement> superTemplateArguments = null;
			List<TemplateBinding> superTemplateBindings = superType.getTemplateBindings();
			if (superTemplateBindings.size() > 0) {
				superTemplateArguments = new HashMap<TemplateParameter, ParameterableElement>();
				for (TemplateBinding superTemplateBinding : superTemplateBindings) {
					for (TemplateParameterSubstitution superTemplateParameterSubstitution : superTemplateBinding.getParameterSubstitutions()) {
						ParameterableElement superActual = superTemplateParameterSubstitution.getActual();
						TemplateParameter superFormal = superTemplateParameterSubstitution.getFormal();
						TemplateParameter templateParameter = superActual.getTemplateParameter();
						ParameterableElement actualActual = allBindings.get(templateParameter);
						superTemplateArguments.put(superFormal, actualActual);
					}
				}
			}
			Type unspecializedSuperType = PivotUtil.getUnspecializedTemplateableElement(superType);
			Type specializedSuperType = metaModelManager.getSpecializedType(unspecializedSuperType, superTemplateArguments);
			specializedClass.getSuperClasses().add(specializedSuperType);
		}
	}

	private final SpecializeableTypeServer unspecializedClassServer;
	private final List<? extends ParameterableElement> templateArguments;
	
	private SpecializedTypeServer(SpecializeableTypeServer unspecializedClassServer, Type specializedType, List<? extends ParameterableElement> templateArguments) {
		super(unspecializedClassServer.metaModelManager, specializedType);
		this.unspecializedClassServer = unspecializedClassServer;
		this.templateArguments = templateArguments;
	}
	
	@Override
	public Operation getOperation(Operation pivotOperation) {
		return unspecializedClassServer.getOperation(pivotOperation);
	}

	@Override
	public Iterable<Operation> getOperations(Operation pivotOperation) {
		return unspecializedClassServer.getOperations(pivotOperation);
	}

	@Override
	public Iterable<Property> getProperties(Property pivotProperty) {
		return unspecializedClassServer.getProperties(pivotProperty);
	}

	@Override
	public Property getProperty(String propertyName) {
		return unspecializedClassServer.getProperty(propertyName);
	}

	List<? extends ParameterableElement> getTemplateArguments() {
		return templateArguments;
	}
}