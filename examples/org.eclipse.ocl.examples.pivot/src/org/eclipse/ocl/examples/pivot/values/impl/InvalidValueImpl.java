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
 * $Id: InvalidValueImpl.java,v 1.1.2.4 2011/01/08 15:35:07 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.values.InvalidValue;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

public class InvalidValueImpl extends AbstractUndefinedCollectionValue implements InvalidValue
{	
	protected final Object value;
	protected final OclExpression expression;
	protected final String reason;
	protected final Throwable throwable;
	private String message = null;

	protected InvalidValueImpl(ValueFactory valueFactory, String reason) {
		this(valueFactory, null, null, reason, null);
	}

	protected InvalidValueImpl(ValueFactory valueFactory, InvalidValue invalidValue) {
		this(valueFactory, invalidValue, null, invalidValue.getReason(), null);
	}

	public InvalidValueImpl(ValueFactory valueFactory, Object value, OclExpression expression, String reason, Throwable throwable) {
		super(valueFactory);
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
	
	public String getMessage() {
		if (message == null) {
			StringBuffer s =  new StringBuffer();
			s.append("Invalid: ");
			s.append(reason);
			if (throwable != null) {
				s.append(" : ");
				s.append(throwable);
			}
			message = s.toString();
		}
		return message;
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
		return getMessage();
	}
}