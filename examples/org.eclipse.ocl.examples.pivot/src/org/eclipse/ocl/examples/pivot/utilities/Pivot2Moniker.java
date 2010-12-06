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
 * $Id: Pivot2Moniker.java,v 1.1.2.3 2010/12/06 17:20:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.List;

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.ParameterableElement;

public class Pivot2Moniker extends Abstract2Moniker
{
	public static String toString(MonikeredElement pivotElement) {
		Pivot2Moniker moniker = new Pivot2Moniker(pivotElement);
		moniker.appendElement(pivotElement);
		String string = moniker.toString();
		System.out.println(pivotElement.eClass().getName() + " ==> " + string);
		assert !"".equals(string);
		return string;
	}
	
//	private List<TemplateParameter> templateParameters = null;
//	private List<TemplateParameter> emittedParameters = null;
//	private List<TemplateParameterSubstitution> substitutions = null;

	public Pivot2Moniker(Element target) {
		super(target);
//		computeTemplateParameters(target, 0);
	}

	public void appendTemplateArguments(List<? extends ParameterableElement> templateArguments) {
		if (!templateArguments.isEmpty()) {
			append(TEMPLATE_BINDING_PREFIX);
			String prefix = ""; //$NON-NLS-1$
			for (ParameterableElement templateArgument : templateArguments) {
				append(prefix);
				appendElement(templateArgument);
				prefix = TEMPLATE_BINDING_SEPARATOR;
			}
			append(TEMPLATE_BINDING_SUFFIX);
		}
	}

/*	protected void appendTemplateParameter(TemplateParameter templateParameter) {
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
	} */
	
/*	protected void computeTemplateParameters(Element csElement, int depth) {
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
			templateParameters = Collections.emptyList();
		}
		if (csElement instanceof TemplateableElement) {
			TemplateSignature ownedTemplateSignature = ((TemplateableElement)csElement).getOwnedTemplateSignature();
			if (ownedTemplateSignature != null) {
				if (templateParameters.size() <= 0) {
					templateParameters = new ArrayList<TemplateParameter>();					
				}
				templateParameters.addAll(ownedTemplateSignature.getOwnedParameters());
			}
		}
	} */
	
//	public boolean hasEmitted(TemplateParameter templateParameter) {
//		return (emittedParameters != null) && emittedParameters.contains(templateParameter);
//	}
	
//	protected void popBindings(int oldSize) {
//		while (substitutions.size() > oldSize) {
//			substitutions.remove(substitutions.size()-1);
//		}	
//	}

//	protected int pushBindings(TemplateBinding templateBinding) {
//		if (substitutions == null) {
//			substitutions = new ArrayList<TemplateParameterSubstitution>();
//		}
//		int size = substitutions.size();
//		substitutions.addAll(templateBinding.getParameterSubstitutions());
//		return size;
//	}

//	protected int pushBindings(TemplateableElement templateBindable) {
//		if (substitutions == null) {
//			substitutions = new ArrayList<TemplateParameterSubstitution>();
//		}
//		int size = substitutions.size();
//		for (TemplateBinding templateBinding : templateBindable.getTemplateBindings()) {
//			substitutions.addAll(templateBinding.getParameterSubstitutions());
//		}
//		return size;
//	}
}