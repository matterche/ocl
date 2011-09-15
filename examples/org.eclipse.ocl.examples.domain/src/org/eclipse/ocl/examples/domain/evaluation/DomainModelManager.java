/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: ModelManager.java,v 1.2 2011/01/24 20:47:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.evaluation;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.types.DomainType;

/**
 * DomainModelManager provides the models to be used during evaluation. In particular
 * the managed models constitute the extent from which Classifier.allInstances
 * returns are made.
 */
public interface DomainModelManager
{
	DomainModelManager NULL = new DomainModelManager()
	{
		public Set<EObject> get(DomainType type) {
			return null;
		}
	};

	Set<EObject> get(DomainType type);
}
