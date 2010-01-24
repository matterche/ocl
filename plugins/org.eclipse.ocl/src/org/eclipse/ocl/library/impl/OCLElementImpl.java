/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLElementImpl.java,v 1.1.2.5 2010/01/24 07:41:15 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Element</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class OCLElementImpl extends EObjectImpl implements OCLElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.OCL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQualifiedName() {
		StringBuffer s = new StringBuffer();
		appendQualifiedName(s);
		return s.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OCLLibrary getLibrary() {
		if (eContainer instanceof OCLElement) {
			return ((OCLElement)eContainer).getLibrary();
		}
		else {
			return null;
		}
	}

	public void appendName(StringBuffer s) {
		String name = getName();
		s.append(String.valueOf(name));
	}

	public void appendQualifiedName(StringBuffer s) {
		String name = getName();
		EObject eContainer = eContainer();
		if (eContainer instanceof OCLElement) {
			int oldLength = s.length();
			((OCLElement)eContainer).appendQualifiedName(s);
			if (s.length() > oldLength) {
				s.append("::"); //$NON-NLS-1$
			}
			s.append(String.valueOf(name));
		} else if (name != null) {
			s.append(name);
		}
	}

/*	@SuppressWarnings("nls")
	protected void appendType(StringBuffer s, Object object) {
		OCLType oclType = object instanceof OCLType ? (OCLType)object : null;
		appendName(s, oclType);
		if (oclType instanceof OCLGenericType) {
			s.append("<");
			String prefix = "";
			for (OCLType type : ((OCLGenericType)oclType).getParameter()) {
				s.append(prefix);
				appendType(s, type);
				prefix = ", ";
			}
			s.append(">");
		}
	} */

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("nls")
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("<");
		s.append(eClass().getName());
		s.append("> ");
		appendQualifiedName(s);
		return s.toString();
	}

} //OCLElementImpl
