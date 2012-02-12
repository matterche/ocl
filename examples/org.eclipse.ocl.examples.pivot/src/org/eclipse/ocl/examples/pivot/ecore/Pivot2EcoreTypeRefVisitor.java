/**
 * <copyright>
 *
 * Copyright (c) 2010,2012 E.D.Willink and others.
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
 * $Id: Pivot2EcoreTypeRefVisitor.java,v 1.4 2011/04/20 19:02:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.ecore;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.InvalidType;
import org.eclipse.ocl.examples.pivot.PrimitiveType;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.VoidType;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.TypeTracker;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

public class Pivot2EcoreTypeRefVisitor
	extends AbstractExtendingVisitor<EObject, Pivot2Ecore>
{
	protected final MetaModelManager metaModelManager;
	
	public Pivot2EcoreTypeRefVisitor(Pivot2Ecore context) {
		super(context);
		this.metaModelManager = context.getMetaModelManager();
	}

	public EGenericType resolveEGenericType(Type type) {
		EObject eType = safeVisit(type);
		if (eType instanceof EGenericType) {
			return (EGenericType) eType;
		}
		else {
			EGenericType eGenericType = EcoreFactory.eINSTANCE.createEGenericType();
			eGenericType.setEClassifier((EClassifier) eType);
			return eGenericType;
		}
	}

	@Override
	public EObject safeVisit(Visitable v) {
		if (v instanceof Type) {
			v = metaModelManager.getPrimaryType((Type)v);
		}
		return (v == null) ? null : v.accept(this);
	}

	public <T extends EObject> void safeVisitAll(List<T> eObjects, List<? extends Element> pivotObjects) {
		for (Element pivotObject : pivotObjects) {
			@SuppressWarnings("unchecked")
			T eObject = (T) safeVisit(pivotObject);
			if (eObject != null) {
				eObjects.add(eObject);
			}
			// else error
		}
	}

	public EClassifier visiting(Visitable visitable) {
		throw new IllegalArgumentException("Unsupported " + visitable.eClass().getName() + " for Pivot2Ecore TypeRef pass");
	}

	@Override
	public EObject visitAnyType(AnyType object) {
		return EcorePackage.Literals.EOBJECT;			// FIXME Something more reversible
	}	

	@Override
	public EObject visitCollectionType(CollectionType object) {
		// TODO Auto-generated method stub
		return super.visitCollectionType(object);
	}

	@Override
	public EObject visitInvalidType(InvalidType object) {
		return EcorePackage.Literals.EOBJECT;			// FIXME Something more reversible
	}	

	@Override
	public EObject visitPrimitiveType(PrimitiveType pivotType) {
		String uri = context.getPrimitiveTypesUriPrefix();
		if (uri != null) {
			EDataType eClassifier = context.getCreated(EDataType.class, pivotType);
			if (eClassifier == null) {
				URI proxyURI = URI.createURI(uri + pivotType.getName());
				eClassifier = EcoreFactory.eINSTANCE.createEDataType();
				((InternalEObject) eClassifier).eSetProxyURI(proxyURI);
				context.putCreated(pivotType, eClassifier);
			}
			return eClassifier;
		}
		TypeTracker typeTracker = metaModelManager.findTypeTracker(pivotType);
		if (typeTracker != null) {
			for (Type aType : typeTracker.getTypeServer().getTypes()) {
				if (!(aType instanceof PrimitiveType)) {
					EDataType eClassifier = context.getCreated(EDataType.class, pivotType);
					if (eClassifier != null) {
						return eClassifier;
					}
				}
			}
		}
		if (pivotType == metaModelManager.getBooleanType()) {
			return EcorePackage.Literals.EBOOLEAN;
		}
		else if (pivotType == metaModelManager.getIntegerType()) {
			return EcorePackage.Literals.EBIG_INTEGER;
		}
		else if (pivotType == metaModelManager.getRealType()) {
			return EcorePackage.Literals.EBIG_DECIMAL;
		}
		else if (pivotType == metaModelManager.getStringType()) {
			return EcorePackage.Literals.ESTRING;
		}
		else if (pivotType == metaModelManager.getUnlimitedNaturalType()) {
			return EcorePackage.Literals.EBIG_INTEGER;
		}
		else {
			throw new IllegalArgumentException("Unsupported primitive type '" + pivotType + "' in Pivot2Ecore TypeRef pass");
		}
	}

	@Override
	public EObject visitTemplateBinding(TemplateBinding object) {
		EGenericType eGenericType = EcoreFactory.eINSTANCE.createEGenericType();
		return eGenericType;
	}

	@Override
	public EObject visitTemplateParameterSubstitution(TemplateParameterSubstitution pivotTemplateParameterSubstitution) {
		EObject actualType = safeVisit(pivotTemplateParameterSubstitution.getActual());
		if (actualType instanceof EGenericType) {
			return actualType;
		}
		EGenericType eGenericType = EcoreFactory.eINSTANCE.createEGenericType();
		eGenericType.setEClassifier((EClassifier) actualType);
		return eGenericType;
	}

	@Override
	public EObject visitType(Type pivotType) {
		TemplateParameter templateParameter = pivotType.getTemplateParameter();
		if (templateParameter != null) {
			ETypeParameter eTypeParameter = context.getCreated(ETypeParameter.class, templateParameter);
			EGenericType eGenericType = EcoreFactory.eINSTANCE.createEGenericType();
			eGenericType.setETypeParameter(eTypeParameter);
			return eGenericType;
		}
		List<TemplateBinding> templateBindings = pivotType.getTemplateBinding();
		if (templateBindings.size() == 0) {
			EClassifier eClassifier = context.getCreated(EClassifier.class, pivotType);
			if (eClassifier != null) {
				return eClassifier;
			}
			return pivotType.getETarget();		// FIXME may be null if not from Ecore
		}
		EGenericType eGenericType = EcoreFactory.eINSTANCE.createEGenericType();
		EObject rawType = safeVisit(PivotUtil.getUnspecializedTemplateableElement(pivotType));
		eGenericType.setEClassifier((EClassifier) rawType);
		// FIXME signature ordering, multiple bindings
		safeVisitAll(eGenericType.getETypeArguments(), templateBindings.get(0).getParameterSubstitution());
		return eGenericType;
	}

	@Override
	public EObject visitVoidType(VoidType object) {
		return EcorePackage.Literals.EOBJECT;			// FIXME Something more reversible
	}	
}