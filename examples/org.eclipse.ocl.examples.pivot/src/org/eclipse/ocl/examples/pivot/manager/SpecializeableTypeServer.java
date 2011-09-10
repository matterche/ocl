/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * A SpecializeableTypeServer adapts the primary Type to coordinate the coherent behaviour of a primary and one or more
 * secondary Types as required for Complete OCL type extension.
 */
public class SpecializeableTypeServer extends TypeServer
{
	/**
	 * Map from first actual type to list of type servers for specialized types for further actual types. 
	 */
	private Map<ParameterableElement, List<SpecializedTypeServer>> firstActual2specializations = null;

	SpecializeableTypeServer(MetaModelManager metaModelManager, Type primaryType) {
		super(metaModelManager, primaryType);
		assert target.getOwnedTemplateSignature() != null;
		initializeContents();
	}

	public SpecializedTypeServer findSpecializedTypeServer(List<? extends ParameterableElement> templateArguments) {
		TemplateSignature templateSignature = target.getOwnedTemplateSignature();
		List<TemplateParameter> templateParameters = templateSignature.getParameters();
		int iMax = templateParameters.size();
		if (templateArguments.size() != iMax) {
			return null;
		}
		if (firstActual2specializations == null) {
			return null;
		}
		ParameterableElement firstTemplateArgument = templateArguments.get(0);
		List<SpecializedTypeServer> partialSpecializations = firstActual2specializations.get(firstTemplateArgument);
		if (partialSpecializations == null) {
			return null;
		}
		for (SpecializedTypeServer specializedTypeServer : partialSpecializations) {
			List<? extends ParameterableElement> actualTemplateArguments = specializedTypeServer.getTemplateArguments();
			boolean gotIt = true;
			for (int i = 1; i < iMax; i++) {
				ParameterableElement requiredTemplateArgument = templateArguments.get(i);
				ParameterableElement actualTemplateArgument = actualTemplateArguments.get(i);
				if (requiredTemplateArgument != actualTemplateArgument) {			// WIP isEquals ???
					gotIt = false;
					break;
				}
			}
			if (gotIt) {
				return specializedTypeServer;
			}
		}
		return null;
	}

	public SpecializedTypeServer getSpecializedTypeServer(List<? extends ParameterableElement> templateArguments) {
		TemplateSignature templateSignature = target.getOwnedTemplateSignature();
		List<TemplateParameter> templateParameters = templateSignature.getParameters();
		int iMax = templateParameters.size();
		if (templateArguments.size() != iMax) {
			return null;
		}
		if (firstActual2specializations == null) {
			firstActual2specializations = new HashMap<ParameterableElement, List<SpecializedTypeServer>>();
		}
		ParameterableElement firstTemplateArgument = templateArguments.get(0);
		List<SpecializedTypeServer> partialSpecializations = firstActual2specializations.get(firstTemplateArgument);
		if (partialSpecializations == null) {
			partialSpecializations = new ArrayList<SpecializedTypeServer>();
			firstActual2specializations.put(firstTemplateArgument, partialSpecializations);
		}
		for (SpecializedTypeServer specializedTypeServer : partialSpecializations) {
			List<? extends ParameterableElement> actualTemplateArguments = specializedTypeServer.getTemplateArguments();
			boolean gotIt = true;
			for (int i = 1; i < iMax; i++) {
				ParameterableElement requiredTemplateArgument = templateArguments.get(i);
				ParameterableElement actualTemplateArgument = actualTemplateArguments.get(i);
				if (requiredTemplateArgument != actualTemplateArgument) {			// WIP isEquals ???
					gotIt = false;
					break;
				}
			}
			if (gotIt) {
				return specializedTypeServer;
			}
		}
		SpecializedTypeServer specializedTypeServer = SpecializedTypeServer.install(this, templateArguments);
		partialSpecializations.add(specializedTypeServer);
		return specializedTypeServer;
	}
}