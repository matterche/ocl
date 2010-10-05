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
 * $Id: Pivot2Moniker.java,v 1.1.2.2 2010/10/05 17:38:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;

public class Pivot2Moniker extends Abstract2Moniker
{
	public static String toString(MonikeredElement pivotElement) {
		Pivot2MonikerSwitch.FACTORY.getClass();
		Pivot2Moniker moniker = new Pivot2Moniker();
		moniker.computeTemplateParameters(pivotElement, 0);
		moniker.appendElement(pivotElement);
		String string = moniker.toString();
		System.out.println(pivotElement.eClass().getName() + " ==> " + string);
		assert !"".equals(string);
		return string;
	}
	
	private List<TemplateParameter> templateParameters = null;
	private List<TemplateParameter> emittedParameters = null;
	private List<TemplateParameterSubstitution> substitutions = null;

	public void appendName(MonikeredElement csNamedElement) {
		if (csNamedElement instanceof org.eclipse.ocl.examples.pivot.Package) {
			String alias = AliasAdapter.getAlias(csNamedElement);
			if (alias != null) {
				append(alias);
				return;
			}
		}
		if (csNamedElement instanceof TemplateableElement) {
			List<TemplateBinding> templateBindings = ((TemplateableElement)csNamedElement).getTemplateBindings();
			if (!templateBindings.isEmpty()) {
				appendName(templateBindings.get(0).getSignature().getTemplate());
				return;
			}
		}
		if (csNamedElement instanceof NamedElement) {
			append(((NamedElement) csNamedElement).getName());
		}
		else if (csNamedElement == null) {
			Logger.getLogger(Pivot2Moniker.class).warn("null for PivotMoniker.appendName()");
			append("/null/");
		}
		else {
			Logger.getLogger(Pivot2Moniker.class).warn("Unsupported PivotMoniker.appendName() for " + csNamedElement.eClass().getName());
			append("/anon/");
		}
	}
	
	public void appendParameters(List<Parameter> iterators, List<Parameter> accumulators, List<Parameter> parameters) {
		s.append(PARAMETER_PREFIX);
		String prefix = ""; //$NON-NLS-1$
		for (Parameter iterator : iterators) {
			s.append(prefix);
			appendElement(iterator.getType());
			prefix = ITERATOR_SEPARATOR;
		}
		for (Parameter accumulator : accumulators) {
			s.append(prefix);
			appendElement(accumulator.getType());
			prefix = ACCUMULATOR_SEPARATOR;
		}
		for (Parameter parameter : parameters) {
			s.append(prefix);
			appendElement(parameter.getType());
			prefix = PARAMETER_SEPARATOR;
		}
		s.append(PARAMETER_SUFFIX);
	}

	public void appendParent(Element element, String parentSeparator) {
		if (element == null) {
			append("<<null-element>>");	
		}
		else {
			EObject parent = element.eContainer();
			if (parent instanceof MonikeredElement) {
				append(((MonikeredElement) parent).getMoniker());	
			}
			else if (parent != null) {
				appendElement(parent);	
			}
			else if (element.eIsProxy()) {
				append("<<unresolved-proxy>>");	
			}
			else  {
				assert element instanceof org.eclipse.ocl.examples.pivot.Package;	
			}
		}
		append(parentSeparator);
	}

	public void appendRole(Element object) {
		EStructuralFeature eFeature = object.eContainmentFeature();
		appendParent(object, SCOPE_SEPARATOR);
		if (eFeature != null) {
			String roleName = roleNames.get(eFeature);
			if (roleName == null) {
				roleName = eFeature.getName();
			}
			append(roleName);
			if (eFeature.isMany()) {
				int index = ((List<?>)object.eContainer().eGet(object.eContainingFeature())).indexOf(object);
				append(index);
			}
		}
	}
	
	public void appendSignature(TemplateSignature signature, TemplateableElement object) {
		if (signature != null) {
			TemplateableElement template = signature.getTemplate();
//			assert template != object;			// Infinite recursion
			int savedContext = pushBindings((TemplateableElement) object);
			try {
				appendElement(template);
			}
			finally {
				popBindings(savedContext);
			}
		}
	}

	public void appendSignature(TemplateSignature signature, TemplateBinding object) {
		if (signature != null) {
			TemplateableElement template = signature.getTemplate();
			int savedContext = pushBindings(object);
			try {
				appendElement(template);
			}
			finally {
				popBindings(savedContext);
			}
		}
	}
	
	public void appendTemplateBindings(TemplateableElement typeRef) {
		List<TemplateBinding> templateBindings = typeRef.getTemplateBindings();
		if (!templateBindings.isEmpty()) {
			s.append(TEMPLATE_PREFIX);
			String prefix = ""; //$NON-NLS-1$
			for (TemplateBinding templateBinding : templateBindings) {
				for (TemplateParameterSubstitution templateParameterSubstitution : templateBinding.getParameterSubstitutions()) {
					s.append(prefix);
					appendElement(templateParameterSubstitution);
					prefix = TEMPLATE_SEPARATOR;
				}
			}
			s.append(TEMPLATE_SUFFIX);
		}
	}

	protected void appendTemplateParameter(TemplateParameter templateParameter) {
		if (emittedParameters == null) {
			emittedParameters = new ArrayList<TemplateParameter>();
		}
		emittedParameters.add(templateParameter);
		if (substitutions != null) {
			for (int i = substitutions.size(); --i >= 0; ) {
				TemplateParameterSubstitution templateParameterSubstitution = substitutions.get(i);
				TemplateParameter formalTemplateParameter = templateParameterSubstitution.getFormal();
				if (formalTemplateParameter == templateParameter) {
					ParameterableElement actualParameter = templateParameterSubstitution.getActual();
					if (actualParameter != null) {
						appendElement(actualParameter);
					}
					else {
						append(WILDCARD_INDICATOR);
					}
					return;
				}			
			}
		}
		appendName(templateParameter.getParameteredElement());
	}

	public void appendTemplateParameters(TemplateableElement templateableElement) {
		TemplateSignature templateSignature = templateableElement.getOwnedTemplateSignature();
		if (templateSignature != null) {
			List<TemplateParameter> templateParameters = templateSignature.getOwnedParameters();
			if (!templateParameters.isEmpty()) {
				s.append(TEMPLATE_PREFIX);
				String prefix = ""; //$NON-NLS-1$
				for (TemplateParameter csTypeParameter : templateParameters) {
					s.append(prefix);
					appendTemplateParameter(csTypeParameter);
					prefix = TEMPLATE_SEPARATOR;
				}
				s.append(TEMPLATE_SUFFIX);
			}
		}
	}
	
	protected void computeTemplateParameters(Element csElement, int depth) {
		if (templateParameters != null) {
			return;
		}
		EObject parent = csElement != null ? csElement.eContainer() : null;
		if (parent != null) {
			if (depth > 20) {
				templateParameters = null;
			}
			computeTemplateParameters((Element) parent, depth+1);
		}
		else {
			templateParameters = new ArrayList<TemplateParameter>();
		}
		if (csElement instanceof TemplateableElement) {
			TemplateSignature ownedTemplateSignature = ((TemplateableElement)csElement).getOwnedTemplateSignature();
			if (ownedTemplateSignature != null) {
				templateParameters.addAll(ownedTemplateSignature.getOwnedParameters());
			}
		}
	}

	public boolean hasEmitted(TemplateParameter templateParameter) {
		return (emittedParameters != null) && emittedParameters.contains(templateParameter);
	}
	
	protected void popBindings(int oldSize) {
		while (substitutions.size() > oldSize) {
			substitutions.remove(substitutions.size()-1);
		}	
	}

	protected int pushBindings(TemplateBinding templateBinding) {
		if (substitutions == null) {
			substitutions = new ArrayList<TemplateParameterSubstitution>();
		}
		int size = substitutions.size();
		substitutions.addAll(templateBinding.getParameterSubstitutions());
		return size;
	}

	protected int pushBindings(TemplateableElement templateBindable) {
		if (substitutions == null) {
			substitutions = new ArrayList<TemplateParameterSubstitution>();
		}
		int size = substitutions.size();
		for (TemplateBinding templateBinding : templateBindable.getTemplateBindings()) {
			substitutions.addAll(templateBinding.getParameterSubstitutions());
		}
		return size;
	}
}