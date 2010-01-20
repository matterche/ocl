package org.eclipse.ocl.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.library.CompatibilityOCLLibrary;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

/**
 * The UMLOCLLibrary provides an implementation of the {@linkplain OCLLibrary}
 * with backward compatibility mapping from the old UML variant of the OCL
 * standard library to the new generic standard library.

 * @since 3.0
 */
public final class UMLOCLLibrary extends CompatibilityOCLLibrary<NamedElement, TypedElement, Package, Type, Class, DataType, Enumeration, EnumerationLiteral, Operation, Parameter, Property>
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
	protected Classifier asMetaType(Object object) {
//		return (object instanceof Element) ? ((Operation)object).eClass() : null;
		throw new UnsupportedOperationException();
	}

	@Override
	protected Classifier asType(Object object) {
		return (object instanceof Classifier) ? (Classifier)object : null;
	}

	@Override
	protected OCLType createOCLType(Type aType, Map<Type, OCLType> visited) {
		if (aType instanceof Enumeration) {
			return createOCLEnumeration((Enumeration) aType, visited);
		}
		else if (aType instanceof DataType) {
			return createOCLDataType((DataType) aType, visited);
		}
		else if (aType instanceof Class) {
			return createOCLClassifier((Class) aType, visited);
		}
		else {
			return null;
		}
	}

	@Override
	protected List<EnumerationLiteral> getLiterals(Enumeration anEnumeration) {
		return anEnumeration.getOwnedLiterals();
	}

	@Override
	protected String getName(NamedElement namedElement) {
		return namedElement.getName();
	}

	@Override
	protected List<Operation> getOperations(Class aClassifier) {
		return aClassifier.getOwnedOperations();
	}

	@Override
	protected List<Parameter> getParameters(Operation anOperation) {
		EList<Parameter> ownedParameters = anOperation.getOwnedParameters();
		return ownedParameters.subList(1, ownedParameters.size());
	}

	@Override
	protected List<Property> getProperties(Class aClassifier) {
		return aClassifier.getOwnedAttributes();
	}

	@Override
	protected Type getReturnType(Operation anOperation) {
		return anOperation.getType();
	}

	@Override
	protected List<? extends Classifier> getSuperTypes(Class classifier) {
		return classifier.getGenerals();
	}

	@Override
	protected Type getType(TypedElement typedElement) {
		return typedElement.getType();
	}

	@Override
	public void loadPackage(Package aPackage) {
		for (Element umlElement : aPackage.getOwnedElements()) {
			if (umlElement instanceof Classifier) {
				getOCLTypeOfType(umlElement);
			}
		}
		for (Package umlPackage : aPackage.getNestedPackages()) {
			loadPackage(umlPackage);
		}
	}

	protected OCLOperation resolveOperation(OCLType dynamicType, Operation umlOperation) {
		Element classifier = umlOperation.getOwner();
		OCLType thisType = getOCLTypeOfType(classifier);
		String operationName = umlOperation.getName();
		EList<OCLType> parameterTypes = new BasicEList<OCLType>();
		for (Parameter parameter : umlOperation.getOwnedParameters()) {
			parameterTypes.add(getOCLTypeOfType(parameter.getType()));
		}
		parameterTypes.remove(0);			// Lose the 'result' parameter
		return thisType.getOperation(operationName, parameterTypes);
	}
}