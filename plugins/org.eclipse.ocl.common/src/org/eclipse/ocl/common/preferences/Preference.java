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
package org.eclipse.ocl.common.preferences;


/**
 * Abstract implementation of a configurable preference option. Derived classes support specific types.
 * 
 * @see BooleanPreference
 * @see ClassPreference
 * @see EnumerationPreference
 * @see IntegerPreference
 * 
 * @param <T> the type of the option's value
 */
public abstract class Preference<T> implements PreferenceableOption<T>
{	
	public final String pluginId;
	public final String key;
	public T defaultValue;

	public Preference(String pluginId, String key, T defaultValue) {
		this.pluginId = pluginId;
		this.key = key;
		this.defaultValue = defaultValue;
	}

	/**
	 * Obtains my string key, which may be used for persistence in a
	 * preference store.
	 * 
	 * @return my key.  Is never <code>null</code>
	 */
	public String getKey() {
		return key;
	}

	public String getPluginId() {
		return pluginId;
	}

	/**
	 * Obtains the option's default value.
	 * 
	 * @return my default value, which default-default is <code>null</code>
	 */
	public T getDefaultValue() {
		return defaultValue;
	}
	
	public void setDefaultValue(T defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	@Override
	public String toString() {
		return String.valueOf(pluginId) + " / " + String.valueOf(key) + " = " + String.valueOf(defaultValue); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
