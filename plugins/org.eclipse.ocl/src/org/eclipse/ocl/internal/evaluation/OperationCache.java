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

package org.eclipse.ocl.internal.evaluation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.TypeChecker;
import org.eclipse.ocl.utilities.UMLReflection;

public class OperationCache<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
{  
	private final UMLReflection<PK, C, O, P, EL, PM, S, COA, SSA, CT> uml;
	private final TypeChecker<C, O, P> typeChecker;
	private final Map<C, Map<String, List<O>>> type2name2operations = new HashMap<C, Map<String, List<O>>>();
	private final Map<C, Map<O, O>> type2static2dynamic = new HashMap<C, Map<O, O>>();
	
	public OperationCache(UMLReflection<PK, C, O, P, EL, PM, S, COA, SSA, CT> uml, TypeChecker<C, O, P> typeChecker) {
		this.uml = uml;
		this.typeChecker = typeChecker;
	}
	
    public O getDynamicOperation(C dynamicType, O staticOperation) {
    	//
    	//	Use class2dynamic2static to return known dynamic operation for static operation on a source type. 
    	//
		Map<O, O> typeOperations = type2static2dynamic.get(dynamicType);
		if (typeOperations == null) {
			typeOperations = new HashMap<O, O>();
			type2static2dynamic.put(dynamicType, typeOperations);
		}
		O dynamicOperation = typeOperations.get(staticOperation);
		if (dynamicOperation != null) {
			return dynamicOperation;
		}
		if (typeOperations.containsKey(staticOperation)) {
			return null;		// Cached ambiguity
		}
		//
		//	Prepare the type-specific name2operations lazily.
		//
    	Map<String, List<O>> name2operations = type2name2operations.get(dynamicType);
    	if (name2operations == null) {
    		name2operations = new HashMap<String, List<O>>();
    		type2name2operations.put(dynamicType, name2operations);
        	List<O> allOperations = typeChecker.getOperations(dynamicType);
        	for (O candidateOperation : allOperations) {
        		String name = uml.getName(candidateOperation);
               	List<O> overloads = name2operations.get(name);
               	if (overloads == null) {
               		overloads = new ArrayList<O>();
               		name2operations.put(name, overloads);
               		overloads.add(candidateOperation);
               	}
               	else {
	        		C candidateOwner = uml.getOwningClassifier(candidateOperation);
	        		Collection<? extends C> candidateSupertypes = uml.getAllSupertypes(candidateOwner);
    	        	List<PM> candidateParameters = uml.getParameters(candidateOperation);
    		    	int iMax = candidateParameters.size();
    		    	int j = overloads.size();
                   	while (--j >= 0) {								// Reverse count to allow remove()
                   		O oldOperation = overloads.get(j);
        	        	List<PM> oldParameters = uml.getParameters(oldOperation);
        	        	if (iMax == oldParameters.size()) {
        	        		int i = 0;
        	        		for ( ; i < iMax; i++) {
        	        			PM candidateParameter = candidateParameters.get(i);
        	        			PM oldParameter = oldParameters.get(i);
        						C oldType = uml.getOCLType(oldParameter);
        						C candidateType = uml.getOCLType(candidateParameter);
        	        			if (oldType != candidateType) {
        	        				break;
        	        			}
        	        		}
        	        		if (i >= iMax) {
           	        			C oldOwner = uml.getOwningClassifier(oldOperation);
           	        			if (candidateSupertypes.contains(oldOwner)) {
           	        				overloads.remove(j);
           	        			}
           	        			else {
           	        				Collection<? extends C> oldSupertypes = uml.getAllSupertypes(oldOwner);
               	        			if (oldSupertypes.contains(candidateOwner)) {
               	        				break;
               	        			}
           	        			}
        	        		}
        	        	}
                   	}
                   	if (j < 0) {
                   		overloads.add(candidateOperation);
                   	}
               	}
        	}
    	}
    	//
    	//	Pick and cache the matching unambiguous overload.
    	//
       	String requiredName = uml.getName(staticOperation);
    	List<O> candidateOperations = name2operations.get(requiredName);
    	if (candidateOperations != null) {
	    	List<PM> requiredParameters = uml.getParameters(staticOperation);
	    	int iMax = requiredParameters.size();
			for (O candidateOperation : candidateOperations) {
	        	List<PM> candidateParameters = uml.getParameters(candidateOperation);
	        	if (iMax == candidateParameters.size()) {
	        		int i = 0;
	        		for ( ; i < iMax; i++) {
	        			PM requiredParameter = requiredParameters.get(i);
	        			PM candidateParameter = candidateParameters.get(i);
						C requiredType = uml.getOCLType(requiredParameter);
						C candidateType = uml.getOCLType(candidateParameter);
	        			if (requiredType != candidateType) {
	        				break;
	        			}
	        		}
	        		if (i >= iMax) {
	        			if (dynamicOperation == null) {
	        				dynamicOperation = candidateOperation;
	        			}
	        			else {
	        				dynamicOperation = null;
	        				break;
	        			}
	        		}
	        	}
	    	}
    	}
		typeOperations.put(staticOperation, dynamicOperation);
		return dynamicOperation;
    }
}
