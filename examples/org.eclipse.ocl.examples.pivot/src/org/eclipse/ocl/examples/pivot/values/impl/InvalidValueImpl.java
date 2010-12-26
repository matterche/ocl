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
 * $Id: InvalidValueImpl.java,v 1.1.2.2 2010/12/26 16:56:23 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.values.InvalidValue;

public class InvalidValueImpl extends AbstractUndefinedCollectionValue implements InvalidValue
{	
	protected final Object value;
	protected final OclExpression expression;
	protected final String reason;
	protected final Throwable throwable;

	protected InvalidValueImpl(String reason) {
		this(null, null, reason, null);
	}

	protected InvalidValueImpl(InvalidValue invalidValue) {
		this(invalidValue, null, invalidValue.getReason(), null);
	}

	public InvalidValueImpl(Object value, OclExpression expression, String reason, Throwable throwable) {
		this.value = value;
		this.expression = expression;
		this.reason = reason;
		this.throwable = throwable;
	}

	public InvalidValue asInvalidValue() {
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof InvalidValue;
	}
	
	public OclExpression getExpression() {
		return expression;
	}
	
	public String getReason() {
		return reason;
	}
	
	public Throwable getThrowable() {
		return throwable;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		return 0x22222222;
	}

	public boolean isInvalid() {
		return true;
	}

	public boolean isNull() {
		return false;
	}

	public String oclToString() {
		return "invalid";
	}

	public InvalidValue toInvalidValue() {
		return this;
	}

	@Override
	public String toString() {
		return "Invalid: " + reason;
	}
}
