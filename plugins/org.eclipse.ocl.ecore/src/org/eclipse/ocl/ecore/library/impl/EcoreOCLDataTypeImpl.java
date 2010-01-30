/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreOCLDataTypeImpl.java,v 1.1.2.4 2010/01/30 07:48:52 ewillink Exp $
 */
package org.eclipse.ocl.ecore.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.ecore.library.EcoreLibraryPackage;
import org.eclipse.ocl.ecore.library.EcoreOCLDataType;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.merged.impl.OCLDataTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore OCL Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EcoreOCLDataTypeImpl extends OCLDataTypeImpl implements EcoreOCLDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreOCLDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreLibraryPackage.Literals.ECORE_OCL_DATA_TYPE;
	}
	
	public OCLConcreteType getNormalizedType() {
		if (getMetaModelElement() == EcorePackage.Literals.ESTRING) {
			return ((OCLRoot)getLibrary()).getString();
		}
		return this;
	}
} //EcoreOCLDataTypeImpl
