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

import org.eclipse.ocl.examples.pivot.Type;

/**
 * A TypeClient adapts a secondary Type to coordinate the coherent behaviour of a primary and one or more
 * secondary Types as required for Complete OCL type extension.
 */
public class TypeClient extends TypeTracker
{
	protected final TypeServer typeServer;
	
	protected TypeClient(TypeServer typeServer, Type target) {
		super(typeServer.getPackageManager(), target);
		this.typeServer = typeServer;
		initializeContents();
	}

	@Override
	public void dispose() {
		typeServer.removedClient(this);
		super.dispose();
	}
	
	@Override
	public TypeServer getTypeServer() {
		return typeServer.getTypeServer();
	}
}