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
 * $Id: Signature.java,v 1.1 2010/05/16 19:18:04 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.util;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeBindingsCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;

public class Signature
{
	private StringBuffer s = new StringBuffer();

	public void append(char c) {
		s.append(c);
	}
	
	public void append(int i) {
		s.append(i);
	}
	
	public void append(String string) {
		s.append(string != null ? string : "null"); //$NON-NLS-1$
	}
	
	public void appendElement(ElementCS csElement) {
		if (csElement != null) {
			csElement.getSignature(this);
		}
		else {
			s.append("null"); //$NON-NLS-1$
		}
	}

	public void appendIndex(EObject eObject) {
		if (eObject != null) {
			EObject parent = eObject.eContainer();
			if (parent != null) {
				Object objects = parent.eGet(eObject.eContainingFeature());
				if (objects instanceof List<?>) {
					append(((List<?>)objects).indexOf(eObject));
					return;
				}
			}
		}
		append(0);
	}

	public void appendName(NamedElementCS csNamedElement) {
		append(csNamedElement != null ? csNamedElement.getName() : null);
	}
	
	public void appendParameters(List<ParameterCS> parameters) {
		s.append('(');
		String prefix = ""; //$NON-NLS-1$
		for (ParameterCS csParameter : parameters) {
			s.append(prefix);
			csParameter.getType().getSignature(this);
			prefix = ","; //$NON-NLS-1$
		}
		s.append(')');
	}

	public void appendParent(ElementCS csElement, String parentSeparator) {
		EObject parent = csElement != null ? csElement.eContainer() : null;
		appendElement((ElementCS) parent);
		append(parentSeparator);
	}

	public void appendTypeArguments(List<TypeRefCS> typeArguments) {
		if (!typeArguments.isEmpty()) {
			s.append('<');
			String prefix = ""; //$NON-NLS-1$
			for (TypeRefCS csTypeArgument : typeArguments) {
				s.append(prefix);
				csTypeArgument.getSignature(this);
				prefix = ","; //$NON-NLS-1$
			}
			s.append('>');
		}
	}

	public void appendTypeBindings(TypeBindingsCS typeBindings) {
		s.append('<');
		if (typeBindings != null) {
			String prefix = ""; //$NON-NLS-1$
			for (TypeBindingCS csTypeBinding : typeBindings.getBindings()) {
				s.append(prefix);
				s.append(csTypeBinding.toString());
				prefix = ","; //$NON-NLS-1$
			}
		}
		s.append("> "); //$NON-NLS-1$
	}

	public void appendTypeParameters(List<TypeParameterCS> typeParameters) {
		if (!typeParameters.isEmpty()) {
			s.append('<');
			String prefix = ""; //$NON-NLS-1$
			for (TypeParameterCS csTypeParameter : typeParameters) {
				s.append(prefix);
				s.append(csTypeParameter.getName());
				prefix = ","; //$NON-NLS-1$
			}
			s.append('>');
		}
	}

	@Override
	public String toString() {
		return s.toString();
	}
}