/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLOperationItemProvider.java,v 1.1.2.5 2010/01/30 07:49:44 ewillink Exp $
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLOperation;

/**
 * This is the item provider adapter for a {@link org.eclipse.ocl.library.OCLOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OCLOperationItemProvider
	extends OCLTypedElementItemProvider
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
	public OCLOperationItemProvider(AdapterFactory adapterFactory) {
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

			addIsStaticPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OCLOperation_isStatic_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OCLOperation_isStatic_feature", "_UI_OCLOperation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LibraryPackage.Literals.OCL_OPERATION__IS_STATIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(LibraryPackage.Literals.OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER);
			childrenFeatures.add(LibraryPackage.Literals.OCL_OPERATION__ITERATOR);
			childrenFeatures.add(LibraryPackage.Literals.OCL_OPERATION__PARAMETER);
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
/*		StringBuffer s = new StringBuffer();
		appendName(s, (OCLOperation)object);
		s.append("(");
		String prefix = "";
		List<OCLIterator> iterators = ((OCLOperation)object).getIterator();
		if (!iterators.isEmpty()) {
			for (OCLIterator iterator : iterators) {
				s.append(prefix);
				appendSignature(s, iterator.getType());
				prefix = ", ";
			}
			s.append(" | ");
			prefix = "";
		}
		for (OCLParameter parameter : ((OCLOperation)object).getParameter()) {
			s.append(prefix);
			appendSignature(s, parameter.getType());
			prefix = ", ";
		}
		s.append(") : ");
		appendSignature(s, ((OCLOperation)object).getType()); 
		return s.toString(); */
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

		switch (notification.getFeatureID(OCLOperation.class)) {
			case LibraryPackage.OCL_OPERATION__IS_STATIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LibraryPackage.OCL_OPERATION__TYPE_PARAMETER:
			case LibraryPackage.OCL_OPERATION__ITERATOR:
			case LibraryPackage.OCL_OPERATION__PARAMETER:
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
				(LibraryPackage.Literals.OCL_TYPE_PARAMETER_PARENT__TYPE_PARAMETER,
				 LibraryFactory.eINSTANCE.createOCLTypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_OPERATION__ITERATOR,
				 LibraryFactory.eINSTANCE.createOCLIterator()));

		newChildDescriptors.add
			(createChildParameter
				(LibraryPackage.Literals.OCL_OPERATION__PARAMETER,
				 LibraryFactory.eINSTANCE.createOCLParameter()));
	}

}
