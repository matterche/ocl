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
 * $Id: IntegerRangeImpl.java,v 1.1 2011/02/11 20:00:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

class IntegerRangeImpl extends AbstractList<Value>
{
	// local iterator class that provides
	// hasNext() and next() methods appropriate
	// for this range set
	class IntegerRangeIterator implements Iterator<Value>
	{
		private IntegerValue curr = null;		// null, first, .... last

		public IntegerValue next() {
			if (curr == null) {
				curr = first;
			}
			else if (!curr.equals(last)) {
				try {
					curr = curr.add(one);
				} catch (InvalidValueException e) {
				}
            }
			else {
				throw new NoSuchElementException();
			}
            return curr;
		}

		public boolean hasNext() {
			return !last.equals(curr);
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	protected final IntegerValue first;
	protected final IntegerValue last;
	protected final IntegerValue one;
	protected final int size;
	
	public IntegerRangeImpl(IntegerValue first, IntegerValue last) throws InvalidValueException {
		this.first = first;
		this.last = last;
		this.one = first.getValueFactory().getOne();
		Integer delta = last.subtract(first).asInteger();
		if (delta >= 0) {
			this.size = delta + 1;
		}
		else {
			this.size = 0;
		}
	}

	@Override
	public IntegerValue get(int index) {		// 0-based
		ValueFactory valueFactory = first.getValueFactory();
		if ((0 <= index) && (index < size)) {
			try {
				return first.add(valueFactory.integerValueOf(index));
			} catch (InvalidValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return valueFactory.getInvalid();
			}
		}
		else {
			return valueFactory.getInvalid();
//			valueFactory.throwInvalidValueException("Out of IntegerRange {0}", index);
		}
	}


	public IntegerValue getFirst() {
		return first;
	}

	public IntegerValue getLast() {
		return last;
	}

    @Override
	public Iterator<Value> iterator() {
		return new IntegerRangeIterator();
	}

	@Override
	public int size() {
		return size;
	}
	
}