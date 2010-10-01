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
 * $Id: PivotConstants.java,v 1.1.2.1 2010/10/01 13:49:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface PivotConstants
{	
	static final String ANNOTATION_QUOTE = "'"; //$NON-NLS-1$
	static final String BINDINGS_PREFIX = "/"; //$NON-NLS-1$ // FIXME Rename
	static final String ITERATOR_SEPARATOR = ";"; //$NON-NLS-1$
	static final String ACCUMULATOR_SEPARATOR = "|"; //$NON-NLS-1$
	static final String OVERFLOW_MARKER = "##"; //$NON-NLS-1$
	static final String SCOPE_SEPARATOR = "."; //"::"; //$NON-NLS-1$
	static final String OPERATOR_SEPARATOR = "~"; //$NON-NLS-1$
	static final String PARAMETER_PREFIX = "("; //$NON-NLS-1$
	static final String PARAMETER_SEPARATOR = ","; //$NON-NLS-1$
	static final String PARAMETER_SUFFIX = ")"; //$NON-NLS-1$
	static final String TEMPLATE_PREFIX = "{"; //$NON-NLS-1$
	static final String TEMPLATE_SEPARATOR = ","; //$NON-NLS-1$
	static final String TEMPLATE_SUFFIX = "}"; //$NON-NLS-1$
	static final String WILDCARD_INDICATOR = "?"; //$NON-NLS-1$
	
	public static Map<EStructuralFeature,String> roleNames = new HashMap<EStructuralFeature,String>();
}
