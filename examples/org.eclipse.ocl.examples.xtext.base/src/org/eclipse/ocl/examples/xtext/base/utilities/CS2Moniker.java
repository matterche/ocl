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
 * $Id: CS2Moniker.java,v 1.1.2.1 2010/10/01 14:13:00 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.utilities.Abstract2Moniker;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateableElementCS;

public class CS2Moniker extends Abstract2Moniker
{	
	public static abstract class Factory implements Abstract2Moniker.Factory
	{
		public abstract Switch create(CS2Moniker moniker);

		public Switch create(Abstract2Moniker moniker) {
			return create((CS2Moniker)moniker);
		}
	}

	public static String toString(ElementCS csElement) {
//		if (csElement instanceof NamedElementCS) {
//			System.out.println(((NamedElementCS)csElement).getName() + " : " + csElement.eClass().getName());
//		}
//		else {
//			System.out.println(csElement.eClass().getName());
//		}
		CS2Moniker moniker = new CS2Moniker();
		moniker.computeTemplateParameters(csElement);
		moniker.appendElement(csElement);
		String string = moniker.toString();
//		System.out.println(csElement.eClass().getName() + " ==> " + string);
		assert !"".equals(string);
		return string;
	}
	
	private List<TemplateParameterCS> templateParameters = null;
	private List<TemplateParameterCS> emittedParameters = null;
	private List<TemplateParameterSubstitutionCS> substitutions = null;

	public void appendName(NamedElementCS csNamedElement) {
		append(csNamedElement != null ? csNamedElement.getName() : null);
	}
	
	public void appendParameters(List<ParameterCS> iterators, List<ParameterCS> parameters) {
		s.append(PARAMETER_PREFIX);
		String prefix = ""; //$NON-NLS-1$
		for (ParameterCS csIterator : iterators) {
			s.append(prefix);
			appendElement(csIterator.getOwnedType());
			prefix = ITERATOR_SEPARATOR;
		}
		for (ParameterCS csParameter : parameters) {
			s.append(prefix);
			appendElement(csParameter.getOwnedType());
			prefix = PARAMETER_SEPARATOR;
		}
		s.append(PARAMETER_SUFFIX);
	}

	public void appendParent(ElementCS csElement, String parentSeparator) {
		EObject parent = csElement != null ? csElement.eContainer() : null;
		if (parent instanceof MonikeredElementCS) {
			append(((MonikeredElementCS) parent).getMoniker());	
		}
		else if (parent != null) {
			appendElement(parent);	
		}
		append(parentSeparator);
	}

	public void appendRole(ElementCS object) {
		EStructuralFeature eFeature = object.eContainmentFeature();
		appendParent(object, SCOPE_SEPARATOR);
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
	
	public void appendTemplateBindings(TemplateBindableElementCS typeRef) {
		TemplateBindingCS templateBinding = typeRef.getOwnedTemplateBinding();
		if (templateBinding != null) {
			s.append(TEMPLATE_PREFIX);
			List<TemplateParameterSubstitutionCS> templateParameterSubstitutions = templateBinding.getOwnedParameterSubstitution();
			if (!templateParameterSubstitutions.isEmpty()) {
				String prefix = ""; //$NON-NLS-1$
				for (TemplateParameterSubstitutionCS templateParameterSubstitution : templateParameterSubstitutions) {
					s.append(prefix);
					appendElement(templateParameterSubstitution);
					prefix = TEMPLATE_SEPARATOR;
				}
			}
			s.append(TEMPLATE_SUFFIX);
		}
	}

	protected void appendTemplateParameter(TemplateParameterCS csTemplateParameter) {
		if (emittedParameters == null) {
			emittedParameters = new ArrayList<TemplateParameterCS>();
		}
		emittedParameters.add(csTemplateParameter);
/*		if (substitutions != null) {
			for (int i = substitutions.size(); --i >= 0; ) {
				TemplateParameterSubstitutionCS templateParameterSubstitution = substitutions.get(i);
				TemplateParameter formalTemplateParameter = ElementUtil.getFormalTemplateParameter(templateParameterSubstitution);
				if (formalTemplateParameter == templateParameter) {
					ParameterableElementCS ownedActualParameter = templateParameterSubstitution.getOwnedActualParameter();
					appendElement(ownedActualParameter);
					return;
				}			
			}
		} */
		appendElement(csTemplateParameter);
	}

/*	protected void appendTemplateParameter(TemplateParameter templateParameter) {
		if (emittedParameters == null) {
			emittedParameters = new ArrayList<TemplateParameter>();
		}
		emittedParameters.add(templateParameter);
		if (substitutions != null) {
			for (int i = substitutions.size(); --i >= 0; ) {
				TemplateParameterSubstitutionCS templateParameterSubstitution = substitutions.get(i);
				TemplateParameter formalTemplateParameter = ElementUtil.getFormalTemplateParameter(templateParameterSubstitution);
				if (formalTemplateParameter == templateParameter) {
					ParameterableElementCS ownedActualParameter = templateParameterSubstitution.getOwnedActualParameter();
					appendElement(ownedActualParameter);
					return;
				}			
			}
		}
		appendElement(templateParameter);
	} */

	public void appendTemplateParameters(TemplateableElementCS csTemplateableElement) {
		TemplateSignatureCS csTemplateSignature = csTemplateableElement.getOwnedTemplateSignature();
		if (csTemplateSignature != null) {
			List<TemplateParameterCS> csTemplateParameters = csTemplateSignature.getOwnedTemplateParameter();
			if (!csTemplateParameters.isEmpty()) {
				s.append(TEMPLATE_PREFIX);
				String prefix = ""; //$NON-NLS-1$
				for (TemplateParameterCS csTemplateParameter : csTemplateParameters) {
					s.append(prefix);
					appendTemplateParameter(csTemplateParameter);
					prefix = TEMPLATE_SEPARATOR;
				}
				s.append(TEMPLATE_SUFFIX);
			}
		}
	}
/*
	public void appendTemplateParameters(TemplateableElementCS csTemplateableElement) {
		TemplateableElement templateableElement = (TemplateableElement) csTemplateableElement.getPivot();
		List<TemplateParameter> templateParameters = ElementUtil.getTemplateParameters(templateableElement);
		if (!templateParameters.isEmpty()) {
			s.append(TEMPLATE_PREFIX);
			String prefix = ""; //$NON-NLS-1$
			for (TemplateParameter templateParameter : templateParameters) {
				s.append(prefix);
				appendTemplateParameter(templateParameter);
				prefix = TEMPLATE_SEPARATOR;
			}
			s.append(TEMPLATE_SUFFIX);
		}
	} */
	
	protected void computeTemplateParameters(ElementCS csElement) {
		if (templateParameters != null) {
			return;
		}
		EObject parent = csElement != null ? csElement.eContainer() : null;
		if (parent != null) {
			computeTemplateParameters((ElementCS) parent);
		}
		else {
			templateParameters = new ArrayList<TemplateParameterCS>();
		}
		if (csElement instanceof TemplateableElementCS) {
			TemplateSignatureCS ownedTemplateSignature = ((TemplateableElementCS)csElement).getOwnedTemplateSignature();
			if (ownedTemplateSignature != null) {
				templateParameters.addAll(ownedTemplateSignature.getOwnedTemplateParameter());
			}
		}
	}

	public TemplateParameterCS getTemplateParameter(String text) {
		if (templateParameters != null) {
			for (TemplateParameterCS templateParameter : templateParameters) {
				if (templateParameter.getName().equals(text)) {
					return templateParameter;
				}
			}
		}
		return null;
	}

	public boolean hasEmitted(TemplateParameterCS templateParameter) {
		return (emittedParameters != null) && emittedParameters.contains(templateParameter);
	}
	
	public void popBindings(int oldSize) {
		while (substitutions.size() > oldSize) {
			substitutions.remove(substitutions.size()-1);
		}	
	}

	public int pushBindings(TemplateBindableElementCS templateBindable) {
		if (substitutions == null) {
			substitutions = new ArrayList<TemplateParameterSubstitutionCS>();
		}
		int size = substitutions.size();
		TemplateBindingCS ownedTemplateBinding = templateBindable.getOwnedTemplateBinding();
		if (ownedTemplateBinding != null) {
			substitutions.addAll(ownedTemplateBinding.getOwnedParameterSubstitution());
		}
		return size;
	}
}