/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   E.D.Willink - Initial API and implementation
 * 	 E.D.Willink - Bug 306079
 *
 * </copyright>
 *
 * $Id: AbstractDelegatedBehavior.java,v 1.5 2011/04/20 19:02:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.delegate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.examples.domain.validation.DomainSubstitutionLabelProvider;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * A basic implementation of a delegated behavior.
 */
public abstract class AbstractDelegatedBehavior<E extends EModelElement, R, F>
		implements DelegatedBehavior<E, R, F> {

	private static List<DelegatedBehavior<?, ?, ?>> delegatedBehaviors = null;

	public static List<DelegatedBehavior<?, ?, ?>> getDelegatedBehaviors() {
		// FIXME Maybe use an extension point here (but need a common
		//  Factory, Registry supertype for a user-defined fourth behavior)
		if (delegatedBehaviors == null) {
			delegatedBehaviors = new ArrayList<DelegatedBehavior<?, ?, ?>>();
			delegatedBehaviors.add(InvocationBehavior.INSTANCE);
			delegatedBehaviors.add(SettingBehavior.INSTANCE);
			delegatedBehaviors.add(ValidationBehavior.INSTANCE);
		}
		return delegatedBehaviors;
	};

	public Constraint getConstraintForStereotype(NamedElement namedElement, String name) {
		for (Constraint constraint : namedElement.getOwnedRules()) {
			String stereotype = constraint.getStereotype();
			if (name.equals(stereotype)) {
				return constraint;
			}
		}
		return null;
	}
	
	public List<DelegateDomain> getDelegateDomains(E eObject) {
		EPackage ePackage = getEPackage(eObject);
		DelegateEPackageAdapter adapter = DelegateEPackageAdapter.getAdapter(ePackage);
		List<DelegateDomain> delegateDomains = new ArrayList<DelegateDomain>();
		for (DelegateDomain delegateDomain : adapter.getDelegateDomains(this)) {
			String uri = delegateDomain.getURI();
			if (eObject.getEAnnotation(uri) != null) {
				delegateDomains.add(delegateDomain);
			}
		}
		return delegateDomains;
	}

	public List<F> getFactories(E eObject) {
		EPackage ePackage = getEPackage(eObject);
		DelegateEPackageAdapter adapter = DelegateEPackageAdapter.getAdapter(ePackage);
		List<F> factories = new ArrayList<F>();
		for (DelegateDomain delegateDomain : adapter.getDelegateDomains(this)) {
			String uri = delegateDomain.getURI();
			if (eObject.getEAnnotation(uri) != null) {
				F factory = getFactory(delegateDomain, eObject);
				if (factory == null) {
					factory = getDefaultFactory();
				}
				if ((factory != null) && !factories.contains(factory)) {
					factories.add(factory);
				}
			}
		}
		return factories;
	}

	protected abstract F getFactory(DelegateDomain delegateDomain, E eObject);

	public F getFactory(E eObject) {
		EPackage ePackage = getEPackage(eObject);
		DelegateEPackageAdapter adapter = DelegateEPackageAdapter.getAdapter(ePackage);
		for (DelegateDomain delegateDomain : adapter.getDelegateDomains(this)) {
			String uri = delegateDomain.getURI();
			if (eObject.getEAnnotation(uri) != null) {
				F factory = getFactory(delegateDomain, eObject);
				if (factory == null) {
					factory = getDefaultFactory();
				}
				return factory;
			}
		}
		return null;
	}

	protected ExpressionInOcl getExpressionInOcl(MetaModelManager metaModelManager, NamedElement namedElement, Constraint constraint) {
		ValueSpecification valueSpecification = constraint.getSpecification();
		if (valueSpecification instanceof ExpressionInOcl) {
			return (ExpressionInOcl) valueSpecification;
		}
		else if (valueSpecification instanceof OpaqueExpression ){
			OpaqueExpression opaqueExpression = (OpaqueExpression)valueSpecification;
			ExpressionInOcl expressionInOcl = opaqueExpression.getValueExpression();
			if (expressionInOcl != null) {
				constraint.setSpecification(expressionInOcl);
				return expressionInOcl;
			}
			try {
				String expression = PivotUtil.getBody(opaqueExpression);
				if (expression != null) {
					URI uriBody = metaModelManager.getResourceIdentifier(constraint, "body");
					expressionInOcl = PivotUtil.resolveSpecification(metaModelManager, uriBody, namedElement, expression);
					if (expressionInOcl != null) {
						opaqueExpression.setValueExpression(expressionInOcl);
//						opaqueExpression.setType(expressionInOcl.getType());
						constraint.setSpecification(expressionInOcl);
						String message = PivotUtil.getMessage(opaqueExpression);
						if ((message != null) && (message.length() > 0)) {
							URI uriMessage = metaModelManager.getResourceIdentifier(constraint, "message");
							ExpressionInOcl resolveSpecification = PivotUtil.resolveSpecification(metaModelManager, uriMessage, namedElement, message);
							OclExpression messageExpression = resolveSpecification.getBodyExpression();
							for (TreeIterator<EObject> tit = messageExpression.eAllContents(); tit.hasNext(); ) {
								EObject eObject = tit.next();
								if (eObject instanceof VariableExp) {
									VariableExp variable = (VariableExp)eObject;
									if (variable.getReferredVariable() == resolveSpecification.getContextVariable()) {
										variable.setReferredVariable(expressionInOcl.getContextVariable());
									}
								}
							}
							expressionInOcl.setMessageExpression(messageExpression);
						}
					}
					return expressionInOcl;
				}
			} catch (ParserException e) {
				throw new OCLDelegateException(e.getLocalizedMessage(), e);
			}
		}
		return null;
	}

	public void setDelegates(EPackage ePackage, List<String> delegateURIs) {
		final String name = getName();
		EAnnotation eAnnotation = ePackage.getEAnnotation(EcorePackage.eNS_URI);
		if (delegateURIs == null || delegateURIs.isEmpty()) {
			if (eAnnotation != null) {
				eAnnotation.getDetails().remove(name);
			}
		} else {
			if (eAnnotation == null) {
				eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
				eAnnotation.setSource(EcorePackage.eNS_URI);
				ePackage.getEAnnotations().add(eAnnotation);
			}
			StringBuilder value = new StringBuilder();
			for (Iterator<String> i = delegateURIs.iterator(); i.hasNext();) {
				value.append(i.next());
				if (i.hasNext()) {
					value.append(' ');
				}
			}
			eAnnotation.getDetails().put(name, value.toString());
		}
	}

	@Override
	public String toString() {
		return getName() + " => " + getFactoryClass().getName(); //$NON-NLS-1$
	}

	public void validate(EObject eObject) {
		Map<Object, Object> validationContext = DomainSubstitutionLabelProvider.createDefaultContext(Diagnostician.INSTANCE);
		BasicDiagnostic diagnostics = Diagnostician.INSTANCE.createDefaultDiagnostic(eObject);
		if (!Diagnostician.INSTANCE.validate(eObject, diagnostics, validationContext)) {
			StringBuilder s = null;
			for (Diagnostic diagnostic : diagnostics.getChildren()) {
				if (s == null) {
					s = new StringBuilder();
				}
				else {
					s.append("\n");
				}
				s.append(diagnostic.getMessage());
			}
			if (s != null) {
				throw new OCLDelegateException(s.toString());
			}
		}
	}
}
