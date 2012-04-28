/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.Model;
import org.eclipse.ocl.examples.pivot.MultiplicityElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.CollectionTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ConstraintCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DataTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DetailCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DocumentationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationLiteralCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LambdaTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LibraryCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MultiplicityBoundsCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MultiplicityStringCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SpecificationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TuplePartCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TupleTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.WildcardTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.util.AbstractExtendingBaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.util.VisitableCS;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class BaseContainmentVisitor extends AbstractExtendingBaseCSVisitor<Continuation<?>, CS2PivotConversion>
{
	protected final MetaModelManager metaModelManager;

	public BaseContainmentVisitor(CS2PivotConversion context) {
		super(context);
		metaModelManager = context.getMetaModelManager();
	}

	protected void importPackages(RootPackageCS csElement) { // FIXME: CS2Pivot.computeRootContainmentFeatures may make this redundant
		for (LibraryCS csLibrary : csElement.getOwnedLibrary()) {
			csLibrary.getPackage();						// Resolve the proxy to perform the import.
		}
		for (ImportCS csImport : csElement.getOwnedImport()) {
			csImport.getNamespace();					// Resolve the proxy to perform the import.
		}
	}

	protected Type refreshClassifier(Type pivotElement, ClassifierCS csElement) {
		if (csElement.eIsSet(BaseCSTPackage.Literals.CLASSIFIER_CS__INSTANCE_CLASS_NAME)) {
			pivotElement.setInstanceClassName(csElement.getInstanceClassName());
		}
		else {
			pivotElement.eUnset(PivotPackage.Literals.TYPE__INSTANCE_CLASS_NAME);
		}
		String newInstanceClassName = csElement.getInstanceClassName();
		String oldInstanceClassName = pivotElement.getInstanceClassName();
		if ((newInstanceClassName != oldInstanceClassName) && ((newInstanceClassName == null) || !newInstanceClassName.equals(oldInstanceClassName))) {
			pivotElement.setInstanceClassName(newInstanceClassName);
		}
		context.refreshTemplateSignature(csElement, pivotElement);
		return pivotElement;
	}

	protected <T> void refreshMultiplicity(MultiplicityElement pivotElement, TypedElementCS csTypedElement) {
		pivotElement.setIsOrdered(ElementUtil.isOrdered(csTypedElement));
		pivotElement.setIsUnique(ElementUtil.isUnique(csTypedElement));
		int lower = ElementUtil.getLower(csTypedElement);
		int upper = ElementUtil.getUpper(csTypedElement);
		pivotElement.setLower(BigInteger.valueOf(lower));
		pivotElement.setUpper(BigInteger.valueOf(upper));
	}

	protected <T extends NamedElement> T refreshNamedElement(Class<T> pivotClass, EClass pivotEClass, NamedElementCS csElement) {
		T pivotElement = context.refreshModelElement(pivotClass, pivotEClass, csElement);
		context.refreshName(pivotElement, csElement.getName());
		context.refreshComments(pivotElement, csElement);
		return pivotElement;
	}

	protected <T extends org.eclipse.ocl.examples.pivot.Package> T refreshPackage(Class<T> pivotClass, EClass pivotEClass, PackageCS csElement) {
		Object pivotObject = csElement.getPivot();
		if (pivotObject == null) {
			pivotObject = context.getOldPackageByQualifiedName(csElement);
		}
		String name = csElement.getName();
		if ((name == null) && (csElement.eContainer() == null)) {
			Resource csResource = csElement.eResource();
			if (csResource != null) {
				URI csURI = csResource.getURI();
				if (csURI != null) {
					name = csURI.lastSegment();
				}
			}
		}
		if (pivotObject == null) {
			pivotObject = context.getOldPackageBySimpleName(name);
		}
		T pivotElement;
		if (pivotObject == null) {
			pivotElement = metaModelManager.createPackage(pivotClass, pivotEClass, name, csElement.getNsURI());
//			logger.trace("Created " + pivotEClass.getName() + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
			metaModelManager.installPackage(pivotElement);
		}
		else {
			if (!pivotClass.isAssignableFrom(pivotObject.getClass())) {
				throw new ClassCastException();
			}
			@SuppressWarnings("unchecked")
			T pivotElement2 = (T) pivotObject;
			pivotElement = pivotElement2;
//			logger.trace("Reusing " + pivotEClass.getName() + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
			context.refreshName(pivotElement, name);
		}
		context.converter.installPivotDefinition(csElement, pivotElement);
		context.refreshComments(pivotElement, csElement);
		String newNsPrefix = csElement.getNsPrefix();
		String oldNsPrefix = pivotElement.getNsPrefix();
		if ((newNsPrefix != oldNsPrefix) && ((newNsPrefix == null) || !newNsPrefix.equals(oldNsPrefix))) {
			pivotElement.setNsPrefix(newNsPrefix);
		}
		String newNsURI = csElement.getNsURI();
		String oldNsURI = pivotElement.getNsURI();
		if ((newNsURI != oldNsURI) && ((newNsURI == null) || !newNsURI.equals(oldNsURI))) {
			pivotElement.setNsURI(newNsURI);
		}
		context.refreshPivotList(org.eclipse.ocl.examples.pivot.Package.class, pivotElement.getNestedPackage(), csElement.getOwnedNestedPackage());
		context.refreshPivotList(Type.class, pivotElement.getOwnedType(), csElement.getOwnedType());
		return pivotElement;
	}

	protected void refreshSerializable(DataType pivotElement, ClassifierCS csElement) {
		List<String> qualifiers = csElement.getQualifier();
		pivotElement.setIsSerializable(qualifiers.contains("serializable"));
	}
	
	protected <T extends TypedMultiplicityElement> T  refreshTypedMultiplicityElement(Class<T> pivotClass,
			EClass pivotEClass, TypedElementCS csTypedElement) {
		T pivotElement = refreshNamedElement(pivotClass, pivotEClass, csTypedElement);
		refreshMultiplicity(pivotElement, csTypedElement);
		return pivotElement;
	}

	@Override
	public Continuation<?> visitAnnotationCS(AnnotationCS csElement) {
		refreshNamedElement(Annotation.class, PivotPackage.Literals.ANNOTATION, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitAnnotationElementCS(AnnotationElementCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitClassCS(ClassCS csElement) {
		org.eclipse.ocl.examples.pivot.Class pivotElement = refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class,
			PivotPackage.Literals.CLASS, csElement);
		List<String> qualifiers = csElement.getQualifier();
		pivotElement.setIsAbstract(qualifiers.contains("abstract"));
		pivotElement.setIsInterface(qualifiers.contains("interface"));
		pivotElement.setIsStatic(qualifiers.contains("static"));
		context.refreshPivotList(Property.class, pivotElement.getOwnedAttribute(), csElement.getOwnedProperty());
		context.refreshPivotList(Operation.class, pivotElement.getOwnedOperation(), csElement.getOwnedOperation());
		refreshClassifier(pivotElement, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitCollectionTypeRefCS(CollectionTypeRefCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitConstraintCS(ConstraintCS csElement) {
		refreshNamedElement(Constraint.class, PivotPackage.Literals.CONSTRAINT, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitDataTypeCS(DataTypeCS csElement) {
		DataType pivotElement = refreshNamedElement(DataType.class, PivotPackage.Literals.DATA_TYPE, csElement);
		refreshSerializable(pivotElement, csElement);
		refreshClassifier(pivotElement, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitDetailCS(DetailCS csElement) {
		refreshNamedElement(Detail.class, PivotPackage.Literals.DETAIL, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitDocumentationCS(DocumentationCS csElement) {
		refreshNamedElement(Annotation.class, PivotPackage.Literals.ANNOTATION, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitElementCS(ElementCS csElement) {
// FIXME		return visiting(csElement);
		System.out.println("Unsupported " + csElement.eClass().getName() + " for CS2Pivot Containment pass");
		return null;
	}

	@Override
	public Continuation<?> visitElementRefCS(ElementRefCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitEnumerationCS(EnumerationCS csElement) {
		org.eclipse.ocl.examples.pivot.Enumeration pivotElement = refreshNamedElement(org.eclipse.ocl.examples.pivot.Enumeration.class,
			PivotPackage.Literals.ENUMERATION, csElement);
		context.refreshPivotList(EnumerationLiteral.class, pivotElement.getOwnedLiteral(), csElement.getOwnedLiterals());
		refreshSerializable(pivotElement, csElement);
		refreshClassifier(pivotElement, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitEnumerationLiteralCS(EnumerationLiteralCS csElement) {
		EnumerationLiteral pivotElement = refreshNamedElement(EnumerationLiteral.class, PivotPackage.Literals.ENUMERATION_LITERAL, csElement);
		pivotElement.setValue(BigInteger.valueOf(csElement.getValue()));
		return null;
	}

	@Override
	public Continuation<?> visitImportCS(ImportCS csElement) {
//		csElement.getNamespace();					// Resolve the proxy to perform the import.
		return null;								// FIXME: CS2Pivot.computeRootContainmentFeatures may allow the above now
	}

	@Override
	public Continuation<?> visitLambdaTypeCS(LambdaTypeCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitLibraryCS(LibraryCS csElement) {
//		csElement.getPackage();						// Resolve the proxy to perform the import.
		return null;								// FIXME: CS2Pivot.computeRootContainmentFeatures may allow the above now
	}

	@Override
	public Continuation<?> visitModelElementRefCS(ModelElementRefCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.ELEMENT, csElement, null);
		return null;
	}

	@Override
	public Continuation<?> visitMultiplicityBoundsCS(MultiplicityBoundsCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitMultiplicityStringCS(MultiplicityStringCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitOperationCS(OperationCS csElement) {
		Operation pivotElement = refreshTypedMultiplicityElement(Operation.class, PivotPackage.Literals.OPERATION, csElement);
		context.refreshTemplateSignature(csElement, pivotElement);
		context.refreshPivotList(Parameter.class, pivotElement.getOwnedParameter(), csElement.getOwnedParameter());
		return null;
	}

	@Override
	public Continuation<?> visitPackageCS(PackageCS csElement) {
		refreshPackage(org.eclipse.ocl.examples.pivot.Package.class, PivotPackage.Literals.PACKAGE, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitParameterCS(ParameterCS csElement) {
		refreshTypedMultiplicityElement(Parameter.class, PivotPackage.Literals.PARAMETER, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitPathElementCS(PathElementCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitPathNameCS(PathNameCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitPrimitiveTypeRefCS(PrimitiveTypeRefCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitRootPackageCS(RootPackageCS csElement) {
		importPackages(csElement);
		refreshPackage(Model.class, PivotPackage.Literals.MODEL, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitSpecificationCS(SpecificationCS csElement) {
		OpaqueExpression pivotElement = context.refreshModelElement(OpaqueExpression.class, PivotPackage.Literals.OPAQUE_EXPRESSION, csElement);
		pivotElement.getLanguage().add(PivotConstants.OCL_LANGUAGE);
		pivotElement.getBody().add(csElement.getExprString());
		pivotElement.getMessage().add(null);
		return null;
	}

	@Override
	public Continuation<?> visitStructuralFeatureCS(StructuralFeatureCS csElement) {
		Property pivotElement = refreshTypedMultiplicityElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
		List<String> qualifiers = csElement.getQualifier();
		pivotElement.setIsComposite(qualifiers.contains("composes"));
		pivotElement.setIsDerived(qualifiers.contains("derived"));
		pivotElement.setIsID(qualifiers.contains("id"));
		pivotElement.setIsReadOnly(qualifiers.contains("readonly"));
		pivotElement.setIsResolveProxies(ElementUtil.getQualifier(qualifiers, "resolve", "!resolve", true));
		pivotElement.setIsStatic(qualifiers.contains("static"));
		pivotElement.setIsTransient(qualifiers.contains("transient"));
		pivotElement.setIsUnsettable(qualifiers.contains("unsettable"));
		pivotElement.setIsVolatile(qualifiers.contains("volatile"));
		if (csElement.eIsSet(BaseCSTPackage.Literals.STRUCTURAL_FEATURE_CS__DEFAULT)) {
			pivotElement.setDefault(csElement.getDefault());
		}
		else {
			pivotElement.eUnset(PivotPackage.Literals.PROPERTY__DEFAULT);
		}
		return null;
	}

	@Override
	public Continuation<?> visitTemplateBindingCS(TemplateBindingCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitTemplateParameterCS(TemplateParameterCS csElement) {
		org.eclipse.ocl.examples.pivot.Class pivotElement = refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class,
			PivotPackage.Literals.CLASS, csElement);
		TemplateParameter pivotTemplateParameter = pivotElement.getOwningTemplateParameter();
		if (pivotTemplateParameter == null) {
			pivotTemplateParameter = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			pivotTemplateParameter.setOwnedParameteredElement(pivotElement);
		}
		return null;
	}

	@Override
	public Continuation<?> visitTemplateParameterSubstitutionCS(TemplateParameterSubstitutionCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitTemplateSignatureCS(TemplateSignatureCS csElement) {
		TemplateSignature pivotElement = context.refreshModelElement(TemplateSignature.class, PivotPackage.Literals.TEMPLATE_SIGNATURE, csElement);
		List<TemplateParameter> newPivotTemplateParameters = new ArrayList<TemplateParameter>();
		List<TemplateParameterCS> csTemplateParameters = csElement.getOwnedTemplateParameter();
		for (TemplateParameterCS csTemplateParameter : csTemplateParameters) {
			org.eclipse.ocl.examples.pivot.Class pivotTemplateParameterClass = PivotUtil.getPivot(org.eclipse.ocl.examples.pivot.Class.class, csTemplateParameter);
			TemplateParameter pivotTemplateParameter = pivotTemplateParameterClass.getOwningTemplateParameter();
			newPivotTemplateParameters.add(pivotTemplateParameter);
		}
		PivotUtil.refreshList(pivotElement.getOwnedParameter(), newPivotTemplateParameters);
		return null;
	}

	@Override
	public Continuation<?> visitTuplePartCS(TuplePartCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitTupleTypeCS(TupleTypeCS csElement) {
		return null;
	}


	@Override
	public Continuation<?> visitTypeRefCS(TypeRefCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitTypedRefCS(TypedRefCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitTypedTypeRefCS(TypedTypeRefCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.TYPE, csElement, null);
		return null;
	}

	@Override
	public Continuation<?> visitWildcardTypeRefCS(WildcardTypeRefCS csElement) {
		org.eclipse.ocl.examples.pivot.Class pivotElement = context.refreshModelElement(org.eclipse.ocl.examples.pivot.Class.class,
			PivotPackage.Literals.CLASS, null);
		context.installPivotReference(csElement, pivotElement, BaseCSTPackage.Literals.PIVOTABLE_ELEMENT_CS__PIVOT);
		return null;
	}

	public Continuation<?> visiting(VisitableCS visitable) {
		throw new IllegalArgumentException("Unsupported " + visitable.eClass().getName() + " for CS2Pivot Containment pass");
	}
}