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
 *   C.Damus, K.Hussey, E.D.Willink - Initial API and implementation
 * 
 * </copyright>
 *
 * $Id: OCLDelegateDomainFactory.java,v 1.2 2010/04/08 06:27:21 ewillink Exp $
 */
package org.eclipse.ocl.ecore.delegate;

import org.eclipse.emf.ecore.EPackage;

/**
 * Factory for OCL delegate domains.
 * 
 * @since 3.0
 */
public class OCLDelegateDomainFactory implements DelegateDomain.Factory
{	
	public OCLDelegateDomainFactory() {}

	public OCLDelegateDomain createDelegateDomain(String delegateURI, EPackage ePackage) {
		return new OCLDelegateDomain(delegateURI, ePackage);
	}
	
	/**
	 * Mapping provides a Factory entry that maps one delegate URI key to another.
	 * 
	 * @since 3.2
	 */
	public static class Mapping implements DelegateDomain.Factory
	{
		protected final DelegateDomain.Factory.Registry registry;
		
		public Mapping() {
			this(DelegateDomain.Factory.Registry.INSTANCE);
		}
		
		public Mapping(DelegateDomain.Factory.Registry registry) {
			this.registry = registry;
		}

		public DelegateDomain createDelegateDomain(String delegateURI, EPackage ePackage) {
			DelegateDomain.Factory factory = registry.getFactory(delegateURI);
			if (factory == null) {
				factory = OCLDelegateDomainFactory.INSTANCE;
			}
			return factory.createDelegateDomain(delegateURI, ePackage);
		}
	}
}
