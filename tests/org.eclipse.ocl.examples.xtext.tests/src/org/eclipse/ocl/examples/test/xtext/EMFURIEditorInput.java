/**
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation (based on URIEditorInput)
 */
package org.eclipse.ocl.examples.test.xtext;

import java.io.File;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.CommonUIPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IURIEditorInput;

/**
 * An implementation of an {@link org.eclipse.ui.IURIEditorInput} to wrap a
 * {@link org.eclipse.emf.common.util.URI} for test purposes only.
 */
public class EMFURIEditorInput implements IURIEditorInput
{
	private final URI emfURI;

	public EMFURIEditorInput(URI emfURI) {
		this.emfURI = emfURI;
	}

	@Override
	public int hashCode() {
		return emfURI.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		return this == o || o instanceof EMFURIEditorInput
			&& emfURI.equals(((EMFURIEditorInput) o).emfURI);
	}

	/**
	 * @return the uri
	 */
	public URI getEMFURI() {
		return emfURI;
	}

	public java.net.URI getURI() {
		try {
			return new java.net.URI(emfURI.toString());
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Returns <b>true</b> only if the URI represents a file and if this file
	 * exists.
	 * 
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	public boolean exists() {
		if (emfURI.isFile()) {
			return new File(emfURI.toFileString()).exists();
		} else {
			if (EMFPlugin.IS_RESOURCES_BUNDLE_AVAILABLE) {
				return EclipseUtil.exists(emfURI);
			} else {
				return false;
			}
		}
	}

	/**
	 * Returns the <i>toString</i> value of the associated URI.
	 * 
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	public String getName() {
		return URI.decode(emfURI.isHierarchical()
			&& emfURI.lastSegment() != null
			? emfURI.lastSegment()
			: emfURI.toString());
	}

	public String getToolTipText() {
		return emfURI.toString();
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		if (EMFPlugin.IS_RESOURCES_BUNDLE_AVAILABLE) {
			Object result = EclipseUtil.getAdatper(adapter, emfURI);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	protected String getBundleSymbolicName() {
		return CommonUIPlugin.getPlugin().getSymbolicName();
	}

	protected static class EclipseUtil {

		public static Object getAdatper(Class<?> adapter, URI uri) {
			if ((adapter == IFile.class || adapter == IResource.class)
				&& uri.isPlatformResource()) {
				return ResourcesPlugin.getWorkspace().getRoot()
					.getFile(new Path(uri.toPlatformString(true)));
			} else {
				return null;
			}
		}

		public static boolean exists(URI uri) {
			if (uri.isPlatformResource()) {
				return ResourcesPlugin.getWorkspace().getRoot()
					.getFile(new Path(uri.toPlatformString(true))).exists();
			} else {
				return false;
			}
		}
	}
}