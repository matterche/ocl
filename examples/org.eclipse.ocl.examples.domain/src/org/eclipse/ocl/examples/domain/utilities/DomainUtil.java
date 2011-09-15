/**
 * <copyright>
 * 
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: PivotUtil.java,v 1.18 2011/05/20 15:27:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.utilities;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

public class DomainUtil
{	
	private static final AdapterFactory reflectiveAdapterFactory =
			new ReflectiveItemProviderAdapterFactory();

	private static final AdapterFactory defaultAdapterFactory =
			new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	public static String getLabel(EObject eObject) {
		IItemLabelProvider labeler =
			(IItemLabelProvider) defaultAdapterFactory.adapt(eObject, IItemLabelProvider.class);		
		if (labeler == null) {
			labeler = (IItemLabelProvider) reflectiveAdapterFactory.adapt(eObject, IItemLabelProvider.class);
		}		
		if (labeler != null) {
			return labeler.getText(eObject);
		}
		return eObject.toString();
	}
}
