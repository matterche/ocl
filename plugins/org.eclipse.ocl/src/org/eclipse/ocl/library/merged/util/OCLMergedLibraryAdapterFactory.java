/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMergedLibraryAdapterFactory.java,v 1.1.2.1 2010/01/24 07:41:11 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.merged.*;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.merged.MergedOperation;
import org.eclipse.ocl.library.merged.MergedOperationDefinition;
import org.eclipse.ocl.library.merged.MergedLibraryOperation;
import org.eclipse.ocl.library.merged.MergedProperty;
import org.eclipse.ocl.library.merged.MergedPropertyDefinition;
import org.eclipse.ocl.library.merged.MergedLibraryProperty;
import org.eclipse.ocl.library.merged.MergedType;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage
 * @generated
 */
public class OCLMergedLibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OCLMergedLibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLMergedLibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OCLMergedLibraryPackage.eINSTANCE;
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
	protected OCLMergedLibrarySwitch<Adapter> modelSwitch =
		new OCLMergedLibrarySwitch<Adapter>() {
			@Override
			public Adapter caseMergedLibrary(MergedLibrary object) {
				return createMergedLibraryAdapter();
			}
			@Override
			public Adapter caseMergedLibraryOperation(MergedLibraryOperation object) {
				return createMergedLibraryOperationAdapter();
			}
			@Override
			public Adapter caseMergedLibraryProperty(MergedLibraryProperty object) {
				return createMergedLibraryPropertyAdapter();
			}
			@Override
			public Adapter caseMergedMetaModelOperation(MergedMetaModelOperation object) {
				return createMergedMetaModelOperationAdapter();
			}
			@Override
			public Adapter caseMergedMetaModelProperty(MergedMetaModelProperty object) {
				return createMergedMetaModelPropertyAdapter();
			}
			@Override
			public Adapter caseMergedOperation(MergedOperation object) {
				return createMergedOperationAdapter();
			}
			@Override
			public Adapter caseMergedOperationDefinition(MergedOperationDefinition object) {
				return createMergedOperationDefinitionAdapter();
			}
			@Override
			public Adapter caseMergedProperty(MergedProperty object) {
				return createMergedPropertyAdapter();
			}
			@Override
			public Adapter caseMergedPropertyDefinition(MergedPropertyDefinition object) {
				return createMergedPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseMergedType(MergedType object) {
				return createMergedTypeAdapter();
			}
			@Override
			public Adapter caseOCLElement(OCLElement object) {
				return createOCLElementAdapter();
			}
			@Override
			public Adapter caseOCLNamedElement(OCLNamedElement object) {
				return createOCLNamedElementAdapter();
			}
			@Override
			public Adapter caseOCLCache(OCLCache object) {
				return createOCLCacheAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedLibrary <em>Merged Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedLibrary
	 * @generated
	 */
	public Adapter createMergedLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedLibraryOperation <em>Merged Library Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedLibraryOperation
	 * @generated
	 */
	public Adapter createMergedLibraryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedLibraryProperty <em>Merged Library Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedLibraryProperty
	 * @generated
	 */
	public Adapter createMergedLibraryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation <em>Merged Meta Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedMetaModelOperation
	 * @generated
	 */
	public Adapter createMergedMetaModelOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedMetaModelProperty <em>Merged Meta Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedMetaModelProperty
	 * @generated
	 */
	public Adapter createMergedMetaModelPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedOperation <em>Merged Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedOperation
	 * @generated
	 */
	public Adapter createMergedOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedOperationDefinition <em>Merged Operation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedOperationDefinition
	 * @generated
	 */
	public Adapter createMergedOperationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedProperty <em>Merged Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedProperty
	 * @generated
	 */
	public Adapter createMergedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedPropertyDefinition <em>Merged Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedPropertyDefinition
	 * @generated
	 */
	public Adapter createMergedPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.library.merged.MergedType <em>Merged Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.library.merged.MergedType
	 * @generated
	 */
	public Adapter createMergedTypeAdapter() {
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

} //OCLMergedLibraryAdapterFactory
