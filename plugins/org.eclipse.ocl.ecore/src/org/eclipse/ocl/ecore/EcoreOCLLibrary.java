/**
 * 
 */
package org.eclipse.ocl.ecore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.ocl.ecore.internal.OCLStandardLibraryImpl;
import org.eclipse.ocl.ecore.library.EcoreLibraryFactory;
import org.eclipse.ocl.library.CompatibilityOCLLibrary;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLVoidType;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.merged.OCLClassifier;
import org.eclipse.ocl.library.merged.OCLDataType;
import org.eclipse.ocl.library.merged.OCLEnumeration;
import org.eclipse.ocl.library.merged.OCLEnumerationLiteral;
import org.eclipse.ocl.library.merged.OCLMetaModelOperation;
import org.eclipse.ocl.library.merged.OCLMetaModelProperty;

/**
 * The EcoreOCLLibrary provides an implementation of the {@linkplain OCLLibrary}
 * with backward compatibility mapping from the old Ecore variant of the OCL
 * standard library to the new generic standard library.
 * 
 * @since 3.0
 */
public class EcoreOCLLibrary extends CompatibilityOCLLibrary<ENamedElement, ETypedElement, EPackage, EClassifier, EClass, TupleType, EDataType, EEnum, EEnumLiteral, EOperation, EParameter, EStructuralFeature>
{
	private static EcoreOCLLibrary DEFAULT = null;

	public static EcoreOCLLibrary getDefault() {
		if (DEFAULT == null) {
			DEFAULT = new EcoreOCLLibrary(null);
		}
		return DEFAULT;
	}
	
	public EcoreOCLLibrary(String libraryURI) {
		super(libraryURI);
	}

	protected EClass asMetaType(Object object) {
		return (object instanceof EObject) ? ((EObject)object).eClass() : null;
	}

	@Override
	protected EClassifier asType(Object object) {
		return (object instanceof EClassifier) ? (EClassifier)object : null;
	}

	@Override
	protected OCLClassifier createOCLClassifier() {
		return EcoreLibraryFactory.eINSTANCE.createEcoreOCLClassifier();
	}

	@Override
	protected OCLDataType createOCLDataType() {
		return EcoreLibraryFactory.eINSTANCE.createEcoreOCLDataType();
	}

	@Override
	protected OCLEnumeration createOCLEnumeration() {
		return EcoreLibraryFactory.eINSTANCE.createEcoreOCLEnumeration();
	}

	@Override
	protected OCLEnumerationLiteral createOCLEnumerationLiteral() {
		return EcoreLibraryFactory.eINSTANCE.createEcoreOCLEnumerationLiteral();
	}

	@Override
	protected OCLMetaModelOperation createOCLMetaModelOperation() {
		return EcoreLibraryFactory.eINSTANCE.createEcoreOCLOperation();
	}

	@Override
	protected OCLMetaModelProperty createOCLMetaModelProperty() {
		return EcoreLibraryFactory.eINSTANCE.createEcoreOCLProperty();
	}

	@Override
	protected OCLConcreteType createOCLType(MergedLibrary mergedLibrary, Object aType, Map<Object, OCLConcreteType> visited) {
		if (aType instanceof EEnum) {
			return createOCLEnumeration(mergedLibrary, (EEnum) aType, visited);
		}
		else if (aType instanceof TupleType) {
			return createOCLTupleType(mergedLibrary, (TupleType) aType, visited);
		}
		else if (aType instanceof EDataType) {
			if (aType == org.eclipse.emf.ecore.EcorePackage.Literals.EBOOLEAN) {
				return getBoolean();
			}
			else if (aType == org.eclipse.emf.ecore.EcorePackage.Literals.EDOUBLE) {
				return getReal();
			}
			else if (aType == org.eclipse.emf.ecore.EcorePackage.Literals.EINT) {
				return getInteger();
			}
			else if (aType == org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING) {
				return getString();
			}
			return createOCLDataType(mergedLibrary, (EDataType) aType, visited);
		}
		else if (aType instanceof EClass) {
			return createOCLClassifier(mergedLibrary, (EClass) aType, visited);
		}
		else if (aType instanceof java.lang.Class<?>) {
			return createOCLJavaType((java.lang.Class<?>) aType, visited);
		}
		else {
			return null;
		}
	}

	@Override
	protected OCLType getLibraryTypeOfTypedElement(MergedLibrary mergedLibrary, ETypedElement typedElement) {
		OCLType elementType = mergedLibrary.getLibraryTypeOfType(typedElement.getEType());
		if (!typedElement.isMany()) {
			return elementType;
		}
		else {
			if (typedElement.isUnique()) {
				if (typedElement.isOrdered()) {
					return mergedLibrary.getOrderedSetType(elementType);
				}
				else {
					return mergedLibrary.getSetType(elementType);
				}
			}
			else {
				if (typedElement.isOrdered()) {
					return mergedLibrary.getSequenceType(elementType);
				}
				else {
					return mergedLibrary.getBagType(elementType);
				}
			}
		}
	}

	@Override
	protected List<EEnumLiteral> getLiterals(EEnum anEnumeration) {
		return anEnumeration.getELiterals();
	}

	@Override
	protected String getName(ENamedElement namedElement) {
		return namedElement.getName();
	}

	@Override
	protected EPackage getNestingPackage(EPackage aPackage) {
		return aPackage.getESuperPackage();
	}

	@Override
	protected List<EOperation> getOperations(EClass aClassifier) {
		return aClassifier.getEOperations();
	}

	@Override
	protected EPackage getPackage(EClassifier aType) {
		return aType.getEPackage();
	}

	@Override
	protected List<EParameter> getParameters(EOperation anOperation) {
		return anOperation.getEParameters();
	}

	@Override
	protected List<EStructuralFeature> getProperties(EClass aClassifier) {
		return aClassifier.getEStructuralFeatures();
	}

	@Override
	protected EClassifier getReturnType(EOperation anOperation) {
		return anOperation.getEType();
	}

	@Override
	protected List<? extends EStructuralFeature> getSortedTupleParts(TupleType aTupleType) {
		List<EStructuralFeature> parts = new ArrayList<EStructuralFeature>(aTupleType.oclProperties());
		Collections.sort(parts, new Comparator<EStructuralFeature>()
		{
			public int compare(EStructuralFeature o1, EStructuralFeature o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		return parts;
	}

	@Override
	protected List<? extends EClassifier> getSuperTypes(EClass classifier) {
		return classifier.getESuperTypes();
	}

	@Override
	public void loadPackage(MergedLibrary mergedLibrary, EPackage aPackage) {
		for (EClassifier ecoreClassifier : aPackage.getEClassifiers()) {
			mergedLibrary.getLibraryTypeOfType(ecoreClassifier);
		}
		for (EPackage ecorePackage : aPackage.getESubpackages()) {
			loadPackage(mergedLibrary, ecorePackage);
		}
	}

	protected List<OCLOperation> resolveOperations(MergedLibrary mergedLibrary, OCLType dynamicType, EOperation ecoreOperation) {
		EClass classifier = ecoreOperation.getEContainingClass();
		EClassifier realClassifier = OCLStandardLibraryImpl.getRealClassifier(classifier);
		if (realClassifier == null) {
			realClassifier = classifier;
		}
		OCLType staticType = mergedLibrary.getLibraryTypeOfType(realClassifier);
		String operationName = ecoreOperation.getName();
		EList<OCLType> parameterTypes = new BasicEList<OCLType>();
		for (EParameter parameter : ecoreOperation.getEParameters()) {
			parameterTypes.add(mergedLibrary.getLibraryTypeOfType(parameter.getEType()));
		}
		if ((dynamicType instanceof OCLInvalidType) || (dynamicType instanceof OCLVoidType)) {
			dynamicType = staticType;
		}
		return dynamicType.getOperations(operationName, parameterTypes, dynamicType);
	}

	protected OCLProperty resolveProperty(MergedLibrary mergedLibrary, OCLType dynamicType, EStructuralFeature ecoreProperty) {
		EClass classifier = ecoreProperty.getEContainingClass();
		EClassifier realClassifier = OCLStandardLibraryImpl.getRealClassifier(classifier);
		if (realClassifier == null) {
			realClassifier = classifier;
		}
		OCLType thisType = mergedLibrary.getLibraryTypeOfType(realClassifier);
		String propertyName = ecoreProperty.getName();
		return thisType.getProperty(propertyName);
	}
}