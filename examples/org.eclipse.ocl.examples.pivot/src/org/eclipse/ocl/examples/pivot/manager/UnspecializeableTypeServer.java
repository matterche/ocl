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
 * An UnspecializeableTypeServer adapts the primary Type to coordinate the coherent behaviour of a primary and one or more
 * secondary Types as required for Complete OCL type extension.
 */
public class UnspecializeableTypeServer extends TypeServer
{
	UnspecializeableTypeServer(MetaModelManager metaModelManager, Type primaryType) {
		super(metaModelManager, primaryType);
		assert target.getOwnedTemplateSignature() == null;
		assert target.getTemplateBindings().isEmpty();
		initializeContents();
	}
}