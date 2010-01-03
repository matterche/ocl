package org.eclipse.ocl.uml;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.library.CompatibilityOCLLibrary;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;

/**
 * The UMLOCLLibrary provides an implementation of the {@linkplain OCLLibrary}
 * with backward compatibility mapping from the old UML variant of the OCL
 * standard library to the new generic standard library.

 * @since 3.0
 */
public final class UMLOCLLibrary extends CompatibilityOCLLibrary<Classifier>
{
	private static UMLOCLLibrary DEFAULT = null;

	public static UMLOCLLibrary getDefault() {
		if (DEFAULT == null) {
			DEFAULT = new UMLOCLLibrary(null);
		}
		return DEFAULT;
	}
	
	public UMLOCLLibrary(String libraryURI) {
		super(libraryURI);
	}

	@Override
	protected Classifier asClass(Object object) {
		return (object instanceof Classifier) ? (Classifier)object : null;
	}

	@Override
	protected Classifier asMetaClass(Object object) {
//		return (object instanceof Element) ? ((Operation)object).eClass() : null;
		throw new UnsupportedOperationException();
	}

	@Override
	protected String getName(Classifier classifier) {
		return classifier.getName();
	}

	@Override
	protected List<Classifier> getSuperTypes(Classifier classifier) {
		return classifier.getGenerals();
	}

	protected OCLOperation resolveOperation(Object referredOperation) {
		Operation operation = (Operation) referredOperation;
		org.eclipse.uml2.uml.Class classifier = operation.getClass_();
		OCLType thisType = getOCLTypeOfType(classifier);
		String operationName = operation.getName();
		EList<OCLType> parameterTypes = new BasicEList<OCLType>();
		for (Parameter parameter : operation.getOwnedParameters()) {
			parameterTypes.add(getOCLTypeOfType(parameter.getType()));
		}
		return thisType.getOperation(operationName, parameterTypes);
	}
}