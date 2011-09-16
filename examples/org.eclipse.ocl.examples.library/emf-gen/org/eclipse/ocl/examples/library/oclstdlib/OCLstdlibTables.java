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
 * This code is auto-generated
 * from: oclstdlib
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateJavaTables
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateJavaTables.mtl
 *
 * Do not edit it.
 *
 * $Id$
 */
package org.eclipse.ocl.examples.library.oclstdlib;

import org.eclipse.ocl.examples.library.executor.ExecutorClass;
import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorPackage;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;

/**
 * OCLstdlibTables provides the dispatch tables for the oclstdlib for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class OCLstdlibTables
{
	/**
	 *	The package descriptor for the package.
	 */
	public static final ExecutorPackage PACKAGE = new ExecutorPackage("oclstdlib", "$oclstdlib", null);

	/**
	 *	The class descriptors for each class.
	 */
	public static class Classes {
	    public static final ExecutorClass __Dummy = new ExecutorClass("_Dummy", PACKAGE, 0);
	
		private static final ExecutorClass[] classes = {
		    __Dummy
		};
	
		/*
		 *	Install the class descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(classes);
			ClassFragments.init();
			FragmentOperations.init();
			FragmentProperties.init();
		}
	}

	/**
	 *	The fragment descriptors for the local elements of each class and its superclasses.
	 */
	public static class Fragments {
		public static final ExecutorFragment __Dummy___Dummy = new ExecutorFragment(Classes.__Dummy, OCLstdlibTables.Classes.__Dummy, null, null);
		
	}

	/**
	 *	The operation descriptors for each operation of each class.
	 */
	public static class Operations {}

	/**
	 *	The property descriptors for each property of each class.
	 */
	public static class Properties {}

	/**
	 *	The fragments for all base classes in depth order: OclAny first, OclSelf last.
	 */
	public static class ClassFragments {
		private static final ExecutorFragment[] __Dummy =
		{
		    Fragments.__Dummy___Dummy /* 0 */
		};
		private static final int[] ___Dummy = { 1 };
	
		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Classes.__Dummy.initFragments(__Dummy, ___Dummy);
		}
	
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each class.
	 */
	public static class FragmentOperations {
		private static final ExecutorOperation[] __Dummy___Dummy = {};
	
		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments.__Dummy___Dummy.initOperations(__Dummy___Dummy);
		}
	
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each class.
	 */
	public static class FragmentProperties {
		private static final ExecutorProperty[] __Dummy = {};
	
		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
	  	 	Fragments.__Dummy___Dummy.initProperties(__Dummy);
		}
	
		public static void init() {}
	}
	
//	static {
//		Classes.classes[0].getClass();
//	}
}
