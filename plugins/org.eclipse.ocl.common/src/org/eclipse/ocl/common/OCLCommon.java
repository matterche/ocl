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

import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.ocl.common.preferences.PreferenceableOption;


/**
 * The Facade for common Eclipse OCL facilities.
 */
public class OCLCommon implements OCLConstants
{
	public static final String PLUGIN_ID = OCLCommon.class.getPackage().getName();

	/**
	 * Return the OCL Delegate EAnnotation, which is an EAnnotation with {@link #OCL_DELEGATE_URI}
	 * as its source, or if no such EAnnotation is present, then the first EAnnotation with a source
	 * whose URI starts with {@link #OCL_DELEGATE_URI} and a / character/
	 */
	public static EAnnotation getDelegateAnnotation(EModelElement eModelElement) {
		List<EAnnotation> eAnnotations = eModelElement.getEAnnotations();
		for (EAnnotation eAnnotation : eAnnotations) {
			String source = eAnnotation.getSource();
			if ((source != null) && source.equals(OCL_DELEGATE_URI)) {
				return eAnnotation;
			}
		}
		for (EAnnotation eAnnotation : eAnnotations) {
			String source = eAnnotation.getSource();
			if ((source != null) && source.startsWith(OCL_DELEGATE_URI_SLASH)) {
				return eAnnotation;
			}
		}
		return null;
	}

	/**
	 * Return the keyed detail of an OCL Delegate EAnnotation, which is an EAnnotation with {@link #OCL_DELEGATE_URI}
	 * as its source, or if no such EAnnotation is present, then the first EAnnotation with a source
	 * whose URI starts with {@link #OCL_DELEGATE_URI} and a / character/
	 */
	public static String getDelegateAnnotation(EModelElement eModelElement, String key) {
	    EAnnotation eAnnotation = getDelegateAnnotation(eModelElement);
	    return eAnnotation == null ? null : (String)eAnnotation.getDetails().get(key);
	}
	
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

	/**
	 * Return true if string denotes an OCL Delegate, which is the string {@link #OCL_DELEGATE_URI},
	 * or a string starting with {@link #OCL_DELEGATE_URI} and a / character.
	 */
	public static boolean isDelegateURI(String string) {
		if (string != null) {
			if (string.equals(OCL_DELEGATE_URI)) {
				return true;
			}
			if (string.startsWith(OCL_DELEGATE_URI_SLASH)) {
				return true;
			}
		}
		return false;
	}
}
