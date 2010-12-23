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
 * $Id: InvalidValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import org.eclipse.ocl.examples.pivot.OclExpression;

public class InvalidValue extends AbstractValue
{
	protected final Object object;
	protected final OclExpression expression;
	protected final String reason;
	protected final Throwable throwable;
	
	public InvalidValue(String reason) {
		this.object = null;
		this.expression = null;
		this.reason = reason;
		this.throwable = null;
	}

	public InvalidValue(Object object, OclExpression expression, String reason, Throwable throwable) {
		this.object = object;
		this.expression = expression;
		this.reason = reason;
		this.throwable = throwable;
	}
	
	public OclExpression getExpression() {
		return expression;
	}

	public Object getObject() {
		return object;
	}
	
	public String getReason() {
		return reason;
	}
	
	public Throwable getThrowable() {
		return throwable;
	}

	@Override
	public boolean isInvalid() {
		return true;
	}

	@Override
	public boolean isUndefined() {
		return true;
	}

	@Override
	public String toString() {
		return "Invalid: " + reason;
	}
}
