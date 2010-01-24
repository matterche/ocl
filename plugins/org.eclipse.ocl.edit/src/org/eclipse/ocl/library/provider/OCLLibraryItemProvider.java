/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibraryItemProvider.java,v 1.1.2.1 2010/01/24 07:40:30 ewillink Exp $
 */
package org.eclipse.ocl.library.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLLibrary;

/**
 * This is the item provider adapter for a {@link org.eclipse.ocl.library.OCLLibrary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OCLLibraryItemProvider
	extends OCLPackageParentItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLLibraryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addExtendsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Extends feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OCLLibrary_extends_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OCLLibrary_extends_feature", "_UI_OCLLibrary_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LibraryPackage.Literals.OCL_LIBRARY__EXTENDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LibraryPackage.Literals.OCL_LIBRARY__TYPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns OCLLibrary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OCLLibrary")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(OCLLibrary.class)) {
			case LibraryPackage.OCL_LIBRARY__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLBagType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLInvalidType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLNonOrderedCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLNonUniqueCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLOrderedCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLOrderedSetType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLTemplateParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLSetType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLTupleType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLUniqueCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_LIBRARY__TYPE,
				 LibraryFactory.eINSTANCE.createOCLVoidType()));
	}

}
