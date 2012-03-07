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
 */
package org.eclipse.ocl.common;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.ocl.common.preferences.PreferenceableOption;


/**
 * The Facade for common Eclipse OCL facilities.
 */
public class OCLCommon implements CommonConstants
{
	public static final String PLUGIN_ID = OCLCommon.class.getPackage().getName();
	
	/**
	 * Return the preference value for 
	 * @param localKey
	 * @param defaultValue
	 * @param contexts
	 * @return
	 */
	public static <T> T getPreference(PreferenceableOption<T> option, IScopeContext[] contexts) {
		IPreferencesService preferencesService = Platform.getPreferencesService();
		if (preferencesService == null) {			// Null standalone
			return option.getDefaultValue();
		}
		else {
			String qualifier = option.getPluginId();
			String key = option.getKey();
			T defaultValue = option.getDefaultValue();
			String string = preferencesService.getString(qualifier, key, defaultValue != null ? defaultValue.toString() : "", contexts); //$NON-NLS-1$
			return option.getValueOf(string);
		}
	}
}
