/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedType.java,v 1.1.2.4 2010/01/31 22:23:42 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Merged Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedType#getMergedLibrary <em>Merged Library</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedType#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedType#getConforms <em>Conforms</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedType#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedType#getInv <em>Inv</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedType()
 * @model
 * @generated
 */
public interface MergedType extends OCLElement {
	/**
	 * Returns the value of the '<em><b>Merged Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merged Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged Library</em>' reference.
	 * @see #isSetMergedLibrary()
	 * @see #unsetMergedLibrary()
	 * @see #setMergedLibrary(MergedLibrary)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedType_MergedLibrary()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	MergedLibrary getMergedLibrary();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedType#getMergedLibrary <em>Merged Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged Library</em>' reference.
	 * @see #isSetMergedLibrary()
	 * @see #unsetMergedLibrary()
	 * @see #getMergedLibrary()
	 * @generated
	 */
	void setMergedLibrary(MergedLibrary value);

	/**
	 * Unsets the value of the '{@link org.eclipse.ocl.library.merged.MergedType#getMergedLibrary <em>Merged Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMergedLibrary()
	 * @see #getMergedLibrary()
	 * @see #setMergedLibrary(MergedLibrary)
	 * @generated
	 */
	void unsetMergedLibrary();

	/**
	 * Returns whether the value of the '{@link org.eclipse.ocl.library.merged.MergedType#getMergedLibrary <em>Merged Library</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Merged Library</em>' reference is set.
	 * @see #unsetMergedLibrary()
	 * @see #getMergedLibrary()
	 * @see #setMergedLibrary(MergedLibrary)
	 * @generated
	 */
	boolean isSetMergedLibrary();

	/**
	 * Returns the value of the '<em><b>Conforms</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conforms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms</em>' reference list.
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedType_Conforms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OCLType> getConforms();

	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.merged.MergedIteration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' containment reference list.
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedType_Iteration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MergedIteration> getIteration();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.merged.MergedOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedType_Operation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MergedOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.merged.MergedProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedType_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<MergedProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Inv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv</em>' reference.
	 * @see #setInv(ExpressionInOCL)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedType_Inv()
	 * @model
	 * @generated
	 */
	ExpressionInOCL<?, ?> getInv();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedType#getInv <em>Inv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inv</em>' reference.
	 * @see #getInv()
	 * @generated
	 */
	void setInv(ExpressionInOCL<?, ?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<OCLTypeParameter> getTypeParameter();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(OCLType)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedType_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	OCLType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(OCLType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.ocl.library.merged.MergedType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(OCLType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.ocl.library.merged.MergedType#getType <em>Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(OCLType)
	 * @generated
	 */
	boolean isSetType();

	void addOperation(MergedOperation mergedOperation);

	void addProperty(MergedProperty mergedProperty);
	
	MergedIteration getConformingIteration(String name);

	Set<MergedOperation> getConformingOperations(boolean isStatic, String name, int argumentCount);
	
//	Set<MergedOperation> getConformingOperations(String name, OCLType[] staticArgumentTypes, OCLType contextType);
	
	MergedProperty getConformingProperty(String name);

	MergedOperation getExactOperation(String name, OCLType[] oclArguments);
	
	MergedProperty getLocalProperty(String name);

} // OCLMergedType
