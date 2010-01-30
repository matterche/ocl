/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLElementImpl.java,v 1.1.2.6 2010/01/30 07:49:24 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLTypeParameter;

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
	public String getQualifiedSignature() {
		StringBuffer s = new StringBuffer();
		appendQualifiedSignature(s);
		return s.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isTypeParameter(OCLTypeParameter typeParameter) {
		if (eContainer instanceof OCLElement) {
			return ((OCLElement)eContainer).isTypeParameter(typeParameter);
		}
		else {
			return false;
		}
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

	public static void appendName(StringBuffer s, OCLElement element) {
		if (element != null) {
			element.appendName(s);
		}
		else {
			s.append("<null>"); //$NON-NLS-1$
		}
	}

	public void appendName(StringBuffer s) {
		String name = getName();
		s.append(String.valueOf(name));
	}

	public static void appendQualifiedName(StringBuffer s, OCLElement element) {
		if (element != null) {
			element.appendQualifiedName(s);
		}
		else {
			s.append("<null>"); //$NON-NLS-1$
		}
	}

	public void appendQualifiedName(StringBuffer s) {
		String name = getName();
		EObject eContainer = eContainer();
		if (eContainer instanceof OCLElementImpl) {
			int oldLength = s.length();
			OCLElementImpl parent = (OCLElementImpl)eContainer;
			parent.appendQualifiedName(s);
			if (s.length() > oldLength) {
				s.append(parent.getNameSeparator());
			}
			s.append(String.valueOf(name));
		} else if (name != null) {
			s.append(name);
		}
	}

	public static void appendQualifiedSignature(StringBuffer s, OCLElement element) {
		if (element != null) {
			element.appendQualifiedSignature(s);
		}
		else {
			s.append("<null>"); //$NON-NLS-1$
		}
	}

	public void appendQualifiedSignature(StringBuffer s) {
		appendQualifiedName(s);
	}

	public static void appendSignature(StringBuffer s, OCLElement element) {
		if (element != null) {
			element.appendSignature(s);
		}
		else {
			s.append("<null>"); //$NON-NLS-1$
		}
	}

	public void appendSignature(StringBuffer s) {
		appendName(s);
	}

	@SuppressWarnings("nls")
	public void appendTypeParameterSignature(StringBuffer s, List<OCLTypeParameter> typeParameters) {
		if (!typeParameters.isEmpty()) {
			s.append("<");
			String prefix = "";
			for (OCLTypeParameter typeParameter : typeParameters) {
				s.append(prefix);
				typeParameter.appendName(s);
				prefix = " ,";
			}
			s.append(">");
		}
	}

	public String getNameSeparator() {
		return "::"; //$NON-NLS-1$
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
		appendQualifiedSignature(s);
		return s.toString();
	}

} //OCLElementImpl
