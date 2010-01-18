/**
 * 
 */
package org.eclipse.ocl.ecore;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.ocl.ecore.internal.OCLStandardLibraryImpl;
import org.eclipse.ocl.library.CompatibilityOCLLibrary;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLType;

/**
 * The EcoreOCLLibrary provides an implementation of the {@linkplain OCLLibrary}
 * with backward compatibility mapping from the old Ecore variant of the OCL
 * standard library to the new generic standard library.
 * 
 * @since 3.0
 */
public class EcoreOCLLibrary extends CompatibilityOCLLibrary<EClass>
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
	protected EClass asClass(Object object) {
		return (object instanceof EClass) ? (EClass)object : null;
	}

	@Override
	protected EClass asMetaClass(Object object) {
		return (object instanceof EObject) ? ((EObject)object).eClass() : null;
	}

	@Override
	protected String getName(EClass classifier) {
		return classifier.getName();
	}

	@Override
	protected List<EClass> getSuperTypes(EClass classifier) {
		return classifier.getESuperTypes();
	}

	protected OCLOperation resolveOperation(OCLType dynamicType, Object referredOperation) {
		EOperation eOperation = (EOperation) referredOperation;
		EClass classifier = eOperation.getEContainingClass();
		EClassifier realClassifier = OCLStandardLibraryImpl.getRealClassifier(classifier);
		if (realClassifier == null) {
			realClassifier = classifier;
		}
		OCLType thisType = getOCLTypeOfType(realClassifier);
		String operationName = eOperation.getName();
		EList<OCLType> parameterTypes = new BasicEList<OCLType>();
		for (EParameter parameter : eOperation.getEParameters()) {
			parameterTypes.add(getOCLTypeOfType(parameter.getEType()));
		}
		return thisType.getOperation(operationName, parameterTypes);
	}
}