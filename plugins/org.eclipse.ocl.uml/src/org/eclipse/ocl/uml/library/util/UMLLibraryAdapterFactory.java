/**
 * <copyright>
 * </copyright>
 *
 * $Id: UMLLibraryAdapterFactory.java,v 1.1.2.3 2010/01/30 07:49:48 ewillink Exp $
 */
package org.eclipse.ocl.uml.library.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeParameterParent;
import org.eclipse.ocl.library.OCLTypeValue;
import org.eclipse.ocl.library.OCLTypedElement;
import org.eclipse.ocl.library.merged.OCLClassifier;
import org.eclipse.ocl.library.merged.OCLDataType;
import org.eclipse.ocl.library.merged.OCLEnumeration;
import org.eclipse.ocl.library.merged.OCLEnumerationLiteral;
import org.eclipse.ocl.library.merged.OCLMetaModelOperation;
import org.eclipse.ocl.library.merged.OCLMetaModelProperty;
import org.eclipse.ocl.uml.library.UMLLibraryPackage;
import org.eclipse.ocl.uml.library.UMLOCLClassifier;
import org.eclipse.ocl.uml.library.UMLOCLDataType;
import org.eclipse.ocl.uml.library.UMLOCLEnumeration;
import org.eclipse.ocl.uml.library.UMLOCLEnumerationLiteral;
import org.eclipse.ocl.uml.library.UMLOCLOperation;
import org.eclipse.ocl.uml.library.UMLOCLProperty;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.uml.library.UMLLibraryPackage
 * @generated
 */
public class UMLLibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UMLLibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLLibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UMLLibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLLibrarySwitch<Adapter> modelSwitch =
		new UMLLibrarySwitch<Adapter>() {
			@Override
			public Adapter caseUMLOCLClassifier(UMLOCLClassifier object) {
				return createUMLOCLClassifierAdapter();
			}
			@Override
			public Adapter caseUMLOCLDataType(UMLOCLDataType object) {
				return createUMLOCLDataTypeAdapter();
			}
			@Override
			public Adapter caseUMLOCLEnumeration(UMLOCLEnumeration object) {
				return createUMLOCLEnumerationAdapter();
			}
			@Override
			public Adapter caseUMLOCLEnumerationLiteral(UMLOCLEnumerationLiteral object) {
				return createUMLOCLEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseUMLOCLOperation(UMLOCLOperation object) {
				return createUMLOCLOperationAdapter();
			}
			@Override
			public Adapter caseUMLOCLProperty(UMLOCLProperty object) {
				return createUMLOCLPropertyAdapter();
			}
			@Override
			public Adapter caseOCLElement(OCLElement object) {
				return createOCLElementAdapter();
			}
			@Override
			public Adapter caseOCLTypeValue(OCLTypeValue object) {
				return createOCLTypeValueAdapter();
			}
			@Override
			public Adapter caseOCLType(OCLType object) {
				return createOCLTypeAdapter();
			}
			@Override
			public Adapter caseOCLNamedElement(OCLNamedElement object) {
				return createOCLNamedElementAdapter();
			}
			@Override
			public Adapter caseOCLTypeParameterParent(OCLTypeParameterParent object) {
				return createOCLTypeParameterParentAdapter();
			}
			@Override
			public Adapter caseOCLConcreteType(OCLConcreteType object) {
				return createOCLConcreteTypeAdapter();
			}
			@Override
			public Adapter caseOCLClassifier(OCLClassifier object) {
				return createOCLClassifierAdapter();
			}
			@Override
			public Adapter caseOCLDataType(OCLDataType object) {
				return createOCLDataTypeAdapter();
			}
			@Override
			public Adapter caseOCLEnumeration(OCLEnumeration object) {
				return createOCLEnumerationAdapter();
			}
			@Override
			public Adapter caseOCLEnumerationLiteral(OCLEnumerationLiteral object) {
				return createOCLEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseOCLTypedElement(OCLTypedElement object) {
				return createOCLTypedElementAdapter();
			}
			@Override
			public Adapter caseOCLOperation(OCLOperation object) {
				return createOCLOperationAdapter();
			}
			@Override
			public Adapter caseOCLMetaModelOperation(OCLMetaModelOperation object) {
				return createOCLMetaModelOperationAdapter();
			}
			@Override
			public Adapter caseOCLProperty(OCLProperty object) {
				return createOCLPropertyAdapter();
			}
			@Override
			public Adapter caseOCLMetaModelProperty(OCLMetaModelProperty object) {
				return createOCLMetaModelPropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.uml.library.UMLOCLClassifier <em>UMLOCL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.uml.library.UMLOCLClassifier
	 * @generated
	 */
	public Adapter createUMLOCLClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.uml.library.UMLOCLDataType <em>UMLOCL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.uml.library.UMLOCLDataType
	 * @generated
	 */
	public Adapter createUMLOCLDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.uml.library.UMLOCLEnumeration <em>UMLOCL Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.uml.library.UMLOCLEnumeration
	 * @generated
	 */
	public Adapter createUMLOCLEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.uml.library.UMLOCLEnumerationLiteral <em>UMLOCL Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.uml.library.UMLOCLEnumerationLiteral
	 * @generated
	 */
	public Adapter createUMLOCLEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.uml.library.UMLOCLOperation <em>UMLOCL Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.uml.library.UMLOCLOperation
	 * @generated
	 */
	public Adapter createUMLOCLOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.uml.library.UMLOCLProperty <em>UMLOCL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.uml.library.UMLOCLProperty
	 * @generated
	 */
	public Adapter createUMLOCLPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLElement <em>OCL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLElement
	 * @generated
	 */
	public Adapter createOCLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLNamedElement <em>OCL Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLNamedElement
	 * @generated
	 */
	public Adapter createOCLNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLTypeParameterParent <em>OCL Type Parameter Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLTypeParameterParent
	 * @generated
	 */
	public Adapter createOCLTypeParameterParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLTypeValue <em>OCL Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLTypeValue
	 * @generated
	 */
	public Adapter createOCLTypeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLType <em>OCL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLType
	 * @generated
	 */
	public Adapter createOCLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLConcreteType <em>OCL Concrete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLConcreteType
	 * @generated
	 */
	public Adapter createOCLConcreteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.OCLClassifier <em>OCL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.OCLClassifier
	 * @generated
	 */
	public Adapter createOCLClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.OCLDataType <em>OCL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.OCLDataType
	 * @generated
	 */
	public Adapter createOCLDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.OCLEnumeration <em>OCL Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.OCLEnumeration
	 * @generated
	 */
	public Adapter createOCLEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral <em>OCL Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.OCLEnumerationLiteral
	 * @generated
	 */
	public Adapter createOCLEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLTypedElement <em>OCL Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLTypedElement
	 * @generated
	 */
	public Adapter createOCLTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLOperation <em>OCL Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLOperation
	 * @generated
	 */
	public Adapter createOCLOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.OCLMetaModelOperation <em>OCL Meta Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.OCLMetaModelOperation
	 * @generated
	 */
	public Adapter createOCLMetaModelOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLProperty <em>OCL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLProperty
	 * @generated
	 */
	public Adapter createOCLPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.OCLMetaModelProperty <em>OCL Meta Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.OCLMetaModelProperty
	 * @generated
	 */
	public Adapter createOCLMetaModelPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UMLLibraryAdapterFactory
