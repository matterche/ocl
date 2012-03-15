/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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

package org.eclipse.ocl.common.internal.messages;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class for externalized strings.
 */
public class CommonMessages
{	
	static {
		NLS.initializeMessages(CommonMessages.class.getName(), CommonMessages.class);
	}
	
	public static String LPG_AmbiguousAssociationEnds;
	public static String LPG_ClosureIterator;
	public static String LPG_ConceptualOperationName;
	public static String LPG_DefinitionConstrainsFeature;
	public static String LPG_ElementNameQuoteEscape;
	public static String LPG_ImplicitRootClass;
	public static String LPG_InheritedFeatureContext;
	public static String LPG_LaxNullHandling;
	public static String LPG_PackageLookupStrategy;
	public static String LPG_StringCaseConversion;
	public static String LPG_StringSingleQuoteEscape;
	public static String LPG_SupportStaticFeatures;
	public static String LPG_UseBackslashEscapeProcessing;
	public static String LPG_UseCompareToOperation;
	public static String LPG_WarnOfXorOrAndPrecedenceChange;
}
