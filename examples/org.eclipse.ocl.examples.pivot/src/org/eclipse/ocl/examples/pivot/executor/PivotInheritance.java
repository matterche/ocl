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
 * $Id: Nameable.java,v 1.2 2011/01/24 20:49:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.executor;

import java.util.Iterator;

import org.eclipse.ocl.examples.domain.types.AbstractFragment;
import org.eclipse.ocl.examples.domain.types.AbstractInheritance;
import org.eclipse.ocl.examples.domain.types.DomainInheritance;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public abstract class PivotInheritance extends AbstractInheritance
{
	protected final Type type;
	protected final MetaModelManager metaModelManager;
	
	public PivotInheritance(Type type, MetaModelManager metaModelManager) {
		this.type = type;
		this.metaModelManager = metaModelManager;
	}

	@Override
	protected AbstractFragment createFragment(DomainInheritance baseInheritance) {
		return new PivotFragment(this, baseInheritance);
	}

	@Override
	protected DomainInheritance getInheritance(DomainType superClass) {
		return metaModelManager.getInheritance(superClass);
	}
	
	public final MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	@Override
	protected DomainInheritance getOclAnyInheritance() {
		AnyType oclAnyType = metaModelManager.getOclAnyType();
		return metaModelManager.getInheritance(oclAnyType);
	}

	public final DomainStandardLibrary getStandardLibrary() {
		return metaModelManager;
	}

	@Override
	protected Iterable<? extends DomainInheritance> getSuperInheritances() {
		final Iterator<Type> iterator = metaModelManager.getSuperClasses(type).iterator();
		return new Iterable<DomainInheritance>()
		{
			public Iterator<DomainInheritance> iterator() {
				return new Iterator<DomainInheritance>()
				{
					public boolean hasNext() {
						return iterator.hasNext();
					}

					public DomainInheritance next() {
						return getInheritance(iterator.next());
					}

					public void remove() {
						throw new UnsupportedOperationException();
					}					
				};
			}			
		};
	}

	public final Type getType() {
		return type;
	}
}
