/**
 * <copyright>
 * 
 * Copyright (c) 2010 Eclipse Modeling Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * E.D.Willink - initial API and implementation
 * 
 * </copyright>
 *
 * $Id: LibraryMessages.java,v 1.1.2.1 2010/01/30 07:49:38 ewillink Exp $
 */
package org.eclipse.ocl.library.util;

import org.eclipse.osgi.util.NLS;

/**
 * @since 3.0
 */
public class LibraryMessages extends NLS
{
	public static String _UI_BoundType_MissingBinding;
	public static String _UI_CollectionType_TooFewTypeParameters;
	public static String _UI_CollectionType_TooManyTypeParameters;
	public static String _UI_Type_ConformsTypeParameterIsNotBound;
	public static String _UI_TypeBinding_TypeParameterIsNotBoundByParent;
	public static String _UI_TypedElement_ReferencedTypeIsDeprecated;
	public static String _UI_TypedElement_ReferencedTypeParameterIsNotBound;

	static {
		NLS.initializeMessages(LibraryMessages.class.getName(), LibraryMessages.class);
	}
}