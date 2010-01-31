/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLIteration.java,v 1.1.2.1 2010/01/31 22:23:43 ewillink Exp $
 */
package org.eclipse.ocl.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Iteration</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLIteration#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLIteration#getIterators <em>Iterators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLIteration()
 * @model abstract="true"
 * @generated
 */
public interface OCLIteration extends OCLTypedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLConcreteType#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLConcreteType)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLIteration_Container()
	 * @see org.eclipse.ocl.library.OCLConcreteType#getIteration
	 * @model opposite="iteration" transient="false"
	 * @generated
	 */
	OCLConcreteType getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLIteration#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLConcreteType value);

	/**
	 * Returns the value of the '<em><b>Iterators</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterators</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterators</em>' attribute.
	 * @see #setIterators(int)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLIteration_Iterators()
	 * @model default="1"
	 * @generated
	 */
	int getIterators();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLIteration#getIterators <em>Iterators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterators</em>' attribute.
	 * @see #getIterators()
	 * @generated
	 */
	void setIterators(int value);

} // OCLIteration
