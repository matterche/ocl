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

import org.eclipse.ocl.examples.pivot.LambdaType;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * LambdaTypeManager encapsulates the knowledge about known lambda types.
 */
public class LambdaTypeManager
{
	protected final MetaModelManager metaModelManager;
	
	/**
	 * Map from from context type via first parameter type, which may be null, to list of lambda types sharing context and first parameter types. 
	 */
	private final Map<Type, Map<Type, List<LambdaType>>> lambdaTypes = new HashMap<Type, Map<Type, List<LambdaType>>>();
	
	protected LambdaTypeManager(MetaModelManager metaModelManager) {
		this.metaModelManager = metaModelManager;
	}

	public void dispose() {
		lambdaTypes.clear();
	}
	   
	public LambdaType getLambdaType(String typeName, Type contextType, List<? extends Type> parameterTypes, Type resultType) {
		if (contextType == null) {
			return null;
		}
		Map<Type, List<LambdaType>> contextMap = lambdaTypes.get(contextType);
		if (contextMap == null) {
			contextMap = new HashMap<Type, List<LambdaType>>();
			lambdaTypes.put(contextType, contextMap);
		}
		int iMax = parameterTypes.size();
		Type firstParameterType = iMax > 0 ? parameterTypes.get(0) : null;
		List<LambdaType> lambdasList = contextMap.get(firstParameterType);
		if (lambdasList == null) {
			lambdasList = new ArrayList<LambdaType>();
			contextMap.put(firstParameterType, lambdasList);
		}
		for (LambdaType candidateLambda : lambdasList) {
			List<? extends Type> candidateTypes = candidateLambda.getParameterType();
			if (iMax == candidateTypes.size()) {
			boolean gotIt = true;
			for (int i = 1; i < iMax; i++) {
					Type requiredType = parameterTypes.get(i);
					Type candidateType = candidateTypes.get(i);
					if (requiredType != candidateType) {
						gotIt = false;
						break;
					}
				}
				if (gotIt) {
					return candidateLambda;
				}
			}
		}			
		LambdaType lambdaType = PivotFactory.eINSTANCE.createLambdaType();
		lambdaType.setName(typeName);
		lambdaType.setContextType(contextType);
		lambdaType.getParameterType().addAll(parameterTypes);
		lambdaType.setResultType(resultType);
		lambdaType.getSuperClass().add(metaModelManager.getOclLambdaType());
		metaModelManager.addOrphanClass(lambdaType);
		return lambdaType;
	}
	   
	public LambdaType getLambdaType(String typeName, Type contextType, List<? extends Type> parameterTypes, Type resultType,
			Map<TemplateParameter, ParameterableElement> bindings) {
		if (contextType == null) {
			return null;
		}
		if (bindings == null) {
			return getLambdaType(typeName, contextType, parameterTypes, resultType);
		}
		else {
			Type specializedContextType = metaModelManager.getSpecializedType(contextType, bindings);
			List<Type> specializedParameterTypes = new ArrayList<Type>();
			for (Type parameterType : parameterTypes) {
				specializedParameterTypes.add(metaModelManager.getSpecializedType(parameterType, bindings));
			}
			Type specializedResultType = resultType != null ? metaModelManager.getSpecializedType(resultType, bindings) : null;
			return getLambdaType(typeName, specializedContextType, specializedParameterTypes, specializedResultType);
		}
	}
}