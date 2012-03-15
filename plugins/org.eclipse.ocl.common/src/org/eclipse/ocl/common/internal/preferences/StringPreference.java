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
package org.eclipse.ocl.common.internal.preferences;

/**
 * A configurable preference with a String value.
 */
public class StringPreference extends Preference<String>
{
	public StringPreference(String pluginId, String key, String defaultValue) {
		super(pluginId, key, defaultValue);
	}

	public String getValueOf(String string) {
		return string;
	}
}
