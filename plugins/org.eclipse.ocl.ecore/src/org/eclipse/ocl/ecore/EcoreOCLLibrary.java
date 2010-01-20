/**
 * 
 */
package org.eclipse.ocl.ecore;

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
import org.eclipse.ocl.library.OCLClassifier;
import org.eclipse.ocl.library.OCLDataType;
import org.eclipse.ocl.library.OCLEnumeration;
import org.eclipse.ocl.library.OCLEnumerationLiteral;
import org.eclipse.ocl.library.OCLMetaModelOperation;
import org.eclipse.ocl.library.OCLMetaModelProperty;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLType;

/**
 * The EcoreOCLLibrary provides an implementation of the {@linkplain OCLLibrary}
 * with backward compatibility mapping from the old Ecore variant of the OCL
 * standard library to the new generic standard library.
 * 
 * @since 3.0
 */
public class EcoreOCLLibrary extends CompatibilityOCLLibrary<ENamedElement, ETypedElement, EPackage, EClassifier, EClass, EDataType, EEnum, EEnumLiteral, EOperation, EParameter, EStructuralFeature>
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

	@Override
	protected EClassifier asMetaType(Object object) {
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
	protected OCLType createOCLType(EClassifier aType, Map<EClassifier, OCLType> visited) {
		if (aType instanceof EEnum) {
			return createOCLEnumeration((EEnum) aType, visited);
		}
		else if (aType instanceof EDataType) {
			return createOCLDataType((EDataType) aType, visited);
		}
		else if (aType instanceof EClass) {
			return createOCLClassifier((EClass) aType, visited);
		}
		else {
			return null;
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
	protected List<EOperation> getOperations(EClass aClassifier) {
		return aClassifier.getEOperations();
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
	protected List<? extends EClassifier> getSuperTypes(EClass classifier) {
		return classifier.getESuperTypes();
	}

	@Override
	protected EClassifier getType(ETypedElement typedElement) {
		return typedElement.getEType();
	}

	@Override
	public void loadPackage(EPackage aPackage) {
		for (EClassifier ecoreClassifier : aPackage.getEClassifiers()) {
			getOCLTypeOfType(ecoreClassifier);
		}
		for (EPackage ecorePackage : aPackage.getESubpackages()) {
			loadPackage(ecorePackage);
		}
	}

	protected OCLOperation resolveOperation(OCLType dynamicType, EOperation ecoreOperation) {
		EClass classifier = ecoreOperation.getEContainingClass();
		EClassifier realClassifier = OCLStandardLibraryImpl.getRealClassifier(classifier);
		if (realClassifier == null) {
			realClassifier = classifier;
		}
		OCLType thisType = getOCLTypeOfType(realClassifier);
		String operationName = ecoreOperation.getName();
		EList<OCLType> parameterTypes = new BasicEList<OCLType>();
		for (EParameter parameter : ecoreOperation.getEParameters()) {
			parameterTypes.add(getOCLTypeOfType(parameter.getEType()));
		}
		return thisType.getOperation(operationName, parameterTypes);
	}

	protected OCLProperty resolveProperty(OCLType dynamicType, EStructuralFeature ecoreProperty) {
		EClass classifier = ecoreProperty.getEContainingClass();
		EClassifier realClassifier = OCLStandardLibraryImpl.getRealClassifier(classifier);
		if (realClassifier == null) {
			realClassifier = classifier;
		}
		OCLType thisType = getOCLTypeOfType(realClassifier);
		String propertyName = ecoreProperty.getName();
		return thisType.getProperty(propertyName);
	}
}