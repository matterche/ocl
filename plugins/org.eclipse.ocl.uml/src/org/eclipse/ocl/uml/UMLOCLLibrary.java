package org.eclipse.ocl.uml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.library.CompatibilityOCLLibrary;
import org.eclipse.ocl.library.OCLClassifier;
import org.eclipse.ocl.library.OCLDataType;
import org.eclipse.ocl.library.OCLEnumeration;
import org.eclipse.ocl.library.OCLEnumerationLiteral;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLMetaModelOperation;
import org.eclipse.ocl.library.OCLMetaModelProperty;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.uml.library.UMLLibraryFactory;
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
public final class UMLOCLLibrary extends CompatibilityOCLLibrary<NamedElement, TypedElement, Package, Type, Class, TupleType, DataType, Enumeration, EnumerationLiteral, Operation, Parameter, Property, EClass>
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

	protected EClass asMetaType(Object object) {
		return (object instanceof EObject) ? ((EObject)object).eClass() : null;
	}

	@Override
	protected Classifier asType(Object object) {
		return (object instanceof Classifier) ? (Classifier)object : null;
	}

	@Override
	protected OCLClassifier createOCLClassifier() {
		return UMLLibraryFactory.eINSTANCE.createUMLOCLClassifier();
	}

	@Override
	protected OCLDataType createOCLDataType() {
		return UMLLibraryFactory.eINSTANCE.createUMLOCLDataType();
	}

	@Override
	protected OCLEnumeration createOCLEnumeration() {
		return UMLLibraryFactory.eINSTANCE.createUMLOCLEnumeration();
	}

	@Override
	protected OCLEnumerationLiteral createOCLEnumerationLiteral() {
		return UMLLibraryFactory.eINSTANCE.createUMLOCLEnumerationLiteral();
	}

	@Override
	protected OCLMetaModelOperation createOCLMetaModelOperation() {
		return UMLLibraryFactory.eINSTANCE.createUMLOCLOperation();
	}

	@Override
	protected OCLMetaModelProperty createOCLMetaModelProperty() {
		return UMLLibraryFactory.eINSTANCE.createUMLOCLProperty();
	}

	@Override
	protected OCLType createOCLType(EObject aType, Map<EObject, OCLType> visited) {
		if (aType instanceof Enumeration) {
			return createOCLEnumeration((Enumeration) aType, visited);
		}
		else if (aType instanceof TupleType) {
			return createOCLTupleType((TupleType) aType, visited);
		}
		else if (aType instanceof DataType) {
			return createOCLDataType((DataType) aType, visited);
		}
		else if (aType instanceof Class) {
			return createOCLClassifier((Class) aType, visited);
		}
//		else if (aType instanceof EClass) {
//			return createOCLClassifier((Class) aType, visited);
//		}
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
	protected Package getNestingPackage(Package aPackage) {
		return aPackage.getNestingPackage();
	}

	@Override
	protected Package getPackage(Type aType) {
		Element owner = aType.getOwner();
		while (owner instanceof Class) {
			owner = owner.getOwner();
		}
		return (Package) owner;
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
	protected List<? extends Property> getSortedTupleParts(TupleType aTupleType) {
		List<Property> parts = new ArrayList<Property>(aTupleType.oclProperties());
		Collections.sort(parts, new Comparator<Property>()
		{
			public int compare(Property o1, Property o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		return parts;
	}

	@Override
	protected List<? extends Classifier> getSuperTypes(Class aClassifier) {
		return aClassifier.getGenerals();
	}

	@Override
	protected OCLType getLibraryTypeOfTypedElement(TypedElement typedElement) {
		OCLType elementType = getLibraryTypeOfType(typedElement.getType());
/*		if (!typedElement.isMany()) {
			return elementType;
		}
		else {
			if (typedElement.isUnique()) {
				if (typedElement.isOrdered()) {
					return getOrderedSetType(elementType);
				}
				else {
					return getSetType(elementType);
				}
			}
			else {
				if (typedElement.isOrdered()) {
					return getSequenceType(elementType);
				}
				else {
					return getBagType(elementType);
				}
			}
		} */
		return elementType;
	}

	@Override
	public void loadPackage(Package aPackage) {
		for (Element umlElement : aPackage.getOwnedElements()) {
			if (umlElement instanceof Classifier) {
				getLibraryTypeOfType(umlElement);
			}
		}
		for (Package umlPackage : aPackage.getNestedPackages()) {
			loadPackage(umlPackage);
		}
	}

	protected List<OCLOperation> resolveOperations(OCLType dynamicType, Operation umlOperation) {
		Element classifier = umlOperation.getOwner();
		OCLType thisType = getLibraryTypeOfType(classifier);
		String operationName = umlOperation.getName();
		EList<OCLType> parameterTypes = new BasicEList<OCLType>();
		for (Parameter parameter : umlOperation.getOwnedParameters()) {
			parameterTypes.add(getLibraryTypeOfType(parameter.getType()));
		}
		parameterTypes.remove(0);			// Lose the 'result' parameter
		return thisType.getOperations(operationName, parameterTypes);
	}

	protected OCLProperty resolveProperty(OCLType dynamicType, Property umlProperty) {
		Element classifier = umlProperty.getOwner();
		OCLType thisType = getLibraryTypeOfType(classifier);
		String propertyName = umlProperty.getName();
		return thisType.getProperty(propertyName);
	}
}