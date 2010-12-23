/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: CollectionValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.ocl.examples.pivot.evaluation.CallableImplementation;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;

public interface CollectionValue extends Value, Iterable<Value>
{
	interface Accumulator extends CollectionValue {
		boolean add(Value value);	
	}

	Collection<Value> asCollection();	
	List<Value> asList();
    int count(Value value);
    CollectionValue createNew();
	boolean excludes(Value value);	
    boolean excludesAll(CollectionValue c);
	CollectionValue excluding(Value value);
    CollectionValue flatten();
	boolean includes(Value value);	
    boolean includesAll(CollectionValue c);
	CollectionValue including(Value value);
	boolean isEmpty();
	Iterator<Value> iterator();
//	Value maxMin(LibraryBinaryOperation binaryOperation);
	boolean notEmpty();
    int size();
    OrderedCollectionValue sort(Comparator<Value> comparator);
    CollectionValue union(CollectionValue c);
	Value maxMin(EvaluationVisitor evaluationVisitor, CallableImplementation operation);
}
