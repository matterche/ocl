/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryAdapterFactory.java,v 1.1.2.10 2010/01/30 20:15:35 ewillink Exp $
 */
package org.eclipse.ocl.library.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLAnyType;
import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLDeprecatedType;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLIterator;
import org.eclipse.ocl.library.OCLJavaType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLPackageParent;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.OCLTypeParameterParent;
import org.eclipse.ocl.library.OCLTypeValue;
import org.eclipse.ocl.library.OCLTypedElement;
import org.eclipse.ocl.library.OCLVoidType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.library.LibraryPackage
 * @generated
 */
public class LibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LibraryPackage.eINSTANCE;
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
	protected LibrarySwitch<Adapter> modelSwitch =
		new LibrarySwitch<Adapter>() {
			@Override
			public Adapter caseOCLAnyType(OCLAnyType object) {
				return createOCLAnyTypeAdapter();
			}
			@Override
			public Adapter caseOCLBoundType(OCLBoundType object) {
				return createOCLBoundTypeAdapter();
			}
			@Override
			public Adapter caseOCLCache(OCLCache object) {
				return createOCLCacheAdapter();
			}
			@Override
			public Adapter caseOCLConcreteType(OCLConcreteType object) {
				return createOCLConcreteTypeAdapter();
			}
			@Override
			public Adapter caseOCLDeprecatedType(OCLDeprecatedType object) {
				return createOCLDeprecatedTypeAdapter();
			}
			@Override
			public Adapter caseOCLElement(OCLElement object) {
				return createOCLElementAdapter();
			}
			@Override
			public Adapter caseOCLInvalidType(OCLInvalidType object) {
				return createOCLInvalidTypeAdapter();
			}
			@Override
			public Adapter caseOCLIterator(OCLIterator object) {
				return createOCLIteratorAdapter();
			}
			@Override
			public Adapter caseOCLJavaType(OCLJavaType object) {
				return createOCLJavaTypeAdapter();
			}
			@Override
			public Adapter caseOCLLibrary(OCLLibrary object) {
				return createOCLLibraryAdapter();
			}
			@Override
			public Adapter caseOCLLibraryOperation(OCLLibraryOperation object) {
				return createOCLLibraryOperationAdapter();
			}
			@Override
			public Adapter caseOCLLibraryProperty(OCLLibraryProperty object) {
				return createOCLLibraryPropertyAdapter();
			}
			@Override
			public Adapter caseOCLNamedElement(OCLNamedElement object) {
				return createOCLNamedElementAdapter();
			}
			@Override
			public Adapter caseOCLOperation(OCLOperation object) {
				return createOCLOperationAdapter();
			}
			@Override
			public Adapter caseOCLPackage(OCLPackage object) {
				return createOCLPackageAdapter();
			}
			@Override
			public Adapter caseOCLPackageParent(OCLPackageParent object) {
				return createOCLPackageParentAdapter();
			}
			@Override
			public Adapter caseOCLParameter(OCLParameter object) {
				return createOCLParameterAdapter();
			}
			@Override
			public Adapter caseOCLProperty(OCLProperty object) {
				return createOCLPropertyAdapter();
			}
			@Override
			public Adapter caseOCLRoot(OCLRoot object) {
				return createOCLRootAdapter();
			}
			@Override
			public Adapter caseOCLType(OCLType object) {
				return createOCLTypeAdapter();
			}
			@Override
			public Adapter caseOCLTypeBinding(OCLTypeBinding object) {
				return createOCLTypeBindingAdapter();
			}
			@Override
			public Adapter caseOCLTypeParameter(OCLTypeParameter object) {
				return createOCLTypeParameterAdapter();
			}
			@Override
			public Adapter caseOCLTypeParameterParent(OCLTypeParameterParent object) {
				return createOCLTypeParameterParentAdapter();
			}
			@Override
			public Adapter caseOCLTypedElement(OCLTypedElement object) {
				return createOCLTypedElementAdapter();
			}
			@Override
			public Adapter caseOCLTypeValue(OCLTypeValue object) {
				return createOCLTypeValueAdapter();
			}
			@Override
			public Adapter caseOCLVoidType(OCLVoidType object) {
				return createOCLVoidTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLAnyType <em>OCL Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLAnyType
	 * @generated
	 */
	public Adapter createOCLAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLLibrary <em>OCL Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLLibrary
	 * @generated
	 */
	public Adapter createOCLLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLBoundType <em>OCL Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLBoundType
	 * @generated
	 */
	public Adapter createOCLBoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLCache <em>OCL Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLCache
	 * @generated
	 */
	public Adapter createOCLCacheAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLDeprecatedType <em>OCL Deprecated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLDeprecatedType
	 * @generated
	 */
	public Adapter createOCLDeprecatedTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLInvalidType <em>OCL Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLInvalidType
	 * @generated
	 */
	public Adapter createOCLInvalidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLIterator <em>OCL Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLIterator
	 * @generated
	 */
	public Adapter createOCLIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLJavaType <em>OCL Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLJavaType
	 * @generated
	 */
	public Adapter createOCLJavaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLLibraryOperation <em>OCL Library Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLLibraryOperation
	 * @generated
	 */
	public Adapter createOCLLibraryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLLibraryProperty <em>OCL Library Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLLibraryProperty
	 * @generated
	 */
	public Adapter createOCLLibraryPropertyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLPackage <em>OCL Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLPackage
	 * @generated
	 */
	public Adapter createOCLPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLPackageParent <em>OCL Package Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLPackageParent
	 * @generated
	 */
	public Adapter createOCLPackageParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLParameter <em>OCL Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLParameter
	 * @generated
	 */
	public Adapter createOCLParameterAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLRoot <em>OCL Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLRoot
	 * @generated
	 */
	public Adapter createOCLRootAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLTypeBinding <em>OCL Type Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLTypeBinding
	 * @generated
	 */
	public Adapter createOCLTypeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLTypeParameter <em>OCL Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLTypeParameter
	 * @generated
	 */
	public Adapter createOCLTypeParameterAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.OCLVoidType <em>OCL Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.OCLVoidType
	 * @generated
	 */
	public Adapter createOCLVoidTypeAdapter() {
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

} //OCLLibraryAdapterFactory
