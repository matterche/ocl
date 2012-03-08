/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */

package org.eclipse.ocl.ui.messages;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class for externalized strings.
 */
public class EcoreAndUMLUIMessages
{	
	static {
		NLS.initializeMessages(EcoreAndUMLUIMessages.class.getName(), EcoreAndUMLUIMessages.class);
	}

	public static String PageTitle;

	public static String Preference_Severity_ByAlias;
	public static String Preference_Severity_ByAliasThenName;
	public static String Preference_Severity_ByName;
	
	public static String Preference_Severity_Error;
	public static String Preference_Severity_Info;
	public static String Preference_Severity_Ok;
	public static String Preference_Severity_Warning;	
}
