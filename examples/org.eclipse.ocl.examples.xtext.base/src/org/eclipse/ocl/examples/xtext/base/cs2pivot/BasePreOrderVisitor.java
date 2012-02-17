/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: BasePreOrderVisitor.java,v 1.13 2011/05/22 21:06:21 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.LambdaType;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.TupleTypeManager;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ConstraintCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DataTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DocumentationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationLiteralCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LambdaTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LibraryCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MultiplicityCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TuplePartCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TupleTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.WildcardTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.util.AbstractExtendingBaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.util.VisitableCS;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class BasePreOrderVisitor extends AbstractExtendingBaseCSVisitor<Continuation<?>, CS2PivotConversion>
{
	protected static class ClassContentContinuation extends SingleContinuation<ClassCS>
	{
		public ClassContentContinuation(CS2PivotConversion context, org.eclipse.ocl.examples.pivot.Class pivotParent, ClassCS csElement) {
			super(context, pivotParent, null, csElement, context.getOperationsHaveTemplateParametersInterDependency());
		}

		@Override
		public BasicContinuation<?> execute() {
			org.eclipse.ocl.examples.pivot.Class pivotElement = PivotUtil.getPivot(org.eclipse.ocl.examples.pivot.Class.class, csElement);
			List<Operation> newPivotOperations = new ArrayList<Operation>();
			for (OperationCS csOperation : csElement.getOwnedOperation()) {
				Operation pivotOperation = PivotUtil.getPivot(Operation.class, csOperation);
				newPivotOperations.add(pivotOperation);
			}
			context.refreshList(pivotElement.getOwnedOperation(), newPivotOperations);
			return null;
		}
	}

	protected static class ClassSupersContinuation extends SingleContinuation<ClassCS>
	{
		private static Dependency[] computeDependencies(CS2PivotConversion context, ClassCS csElement) {
			List<TypedRefCS> csSuperTypes = csElement.getOwnedSuperType();
			if (csSuperTypes.isEmpty()) {
				return null;
			}
			List<Dependency> dependencies = new ArrayList<Dependency>();
			for (TypedRefCS csSuperType : csSuperTypes) {
				dependencies.add(new PivotDependency(csSuperType));
			}
			return dependencies.toArray(new Dependency[dependencies.size()]);
		}

		public ClassSupersContinuation(CS2PivotConversion context, org.eclipse.ocl.examples.pivot.Class pivotParent, ClassCS csElement) {
			super(context, pivotParent, null, csElement, computeDependencies(context, csElement));
		}

		@Override
		public BasicContinuation<?> execute() {
			org.eclipse.ocl.examples.pivot.Class pivotElement = PivotUtil.getPivot(org.eclipse.ocl.examples.pivot.Class.class, csElement);
			List<Type> superClasses = pivotElement.getSuperClass();
			context.refreshList(Type.class, superClasses, csElement.getOwnedSuperType());
			if (superClasses.isEmpty()) {
				org.eclipse.ocl.examples.pivot.Class oclElementType = context.getMetaModelManager().getOclElementType();
				if (oclElementType != null) {
					pivotElement.getSuperClass().add(oclElementType);
				}
			}
			return null;
		}
	}
	
	protected static class LambdaContinuation extends SingleContinuation<LambdaTypeCS>
	{
		private static Dependency[] computeDependencies(CS2PivotConversion context, LambdaTypeCS csElement) {
			List<TypedRefCS> csParameterTypes = csElement.getOwnedParameterType();
			int iMax = csParameterTypes.size();
			Dependency[] dependencies = new Dependency[3 + iMax];
			dependencies[0] = context.getPackagesHaveTypesInterDependency();
			dependencies[1] = context.createTypeIsReferenceableDependency(csElement.getOwnedContextType());
			dependencies[2] = context.createTypeIsReferenceableDependency(csElement.getOwnedResultType());
			for (int i = 0; i < iMax; i++) {
				TypedRefCS csParameterType = csParameterTypes.get(i);
				dependencies[i+3] = context.createTypeIsReferenceableDependency(csParameterType);
			}
			return dependencies;
		}

		public LambdaContinuation(CS2PivotConversion context, LambdaTypeCS csElement) {
			super(context, null, null, csElement, computeDependencies(context, csElement));
		}

		@Override
		public BasicContinuation<?> execute() {
			Type contextType = PivotUtil.getPivot(Type.class, csElement.getOwnedContextType());
			Type resultType = PivotUtil.getPivot(Type.class, csElement.getOwnedResultType());
			List<Type> parameterTypes = new ArrayList<Type>();
			for (TypedRefCS csParameterType : csElement.getOwnedParameterType()) {
				Type parameterType = PivotUtil.getPivot(Type.class, csParameterType);
				parameterTypes.add(parameterType);
			}
			LambdaType lambdaType = context.getMetaModelManager().getLambdaType(csElement.getName(), contextType, parameterTypes, resultType, null);
			context.installPivotReference(csElement, lambdaType, BaseCSTPackage.Literals.PIVOTABLE_ELEMENT_CS__PIVOT);
			return null;
		}
	}
	
	public static class OperationContinuation<T extends OperationCS> extends SingleContinuation<T>
	{
		public OperationContinuation(CS2PivotConversion context, T csElement) {
			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
			context.getOperationsHaveTemplateParametersInterDependency().addDependency(this);
		}

		@Override
		public BasicContinuation<?> execute() {
			Operation pivotOperation = context.refreshTypedMultiplicityElement(Operation.class, PivotPackage.Literals.OPERATION, csElement);
			context.refreshTemplateSignature(csElement, pivotOperation);
			refreshParameters(csElement.getOwnedParameter(), pivotOperation.getOwnedParameter());
			context.refreshList(Type.class, pivotOperation.getRaisedException(), csElement.getOwnedException());
			context.getOperationsHaveTemplateParametersInterDependency().setSatisfied(this);
			return null;
		}

		protected void refreshParameters(List<ParameterCS> csParameters, List<Parameter> pivotParameters) {
			List<Parameter> newPivotParameters = new ArrayList<Parameter>();
			for (ParameterCS csParameter : csParameters) {
				Parameter pivotParameter = context.refreshTypedMultiplicityElement(Parameter.class, PivotPackage.Literals.PARAMETER, csParameter);
				newPivotParameters.add(pivotParameter);
			}
			context.refreshList(pivotParameters, newPivotParameters);
		}
	}
	
	protected static class PackageContentContinuation extends SingleContinuation<PackageCS>
	{
		private PackageContentContinuation(CS2PivotConversion context, PackageCS csElement) {
			super(context, null, null, csElement);
			context.getPackagesHaveTypesInterDependency().addDependency(this);
		}

		@Override
		public BasicContinuation<?> execute() {
			org.eclipse.ocl.examples.pivot.Package pivotElement = PivotUtil.getPivot(org.eclipse.ocl.examples.pivot.Package.class, csElement);
			context.refreshPivotList(Type.class, pivotElement.getOwnedType(), csElement.getOwnedType());
			context.refreshPivotList(org.eclipse.ocl.examples.pivot.Package.class, pivotElement.getNestedPackage(), csElement.getOwnedNestedPackage());
			context.getPackagesHaveTypesInterDependency().setSatisfied(this);
			return null;
		}
	}

	protected static class PrimitiveTypeRefContinuation extends SingleContinuation<PrimitiveTypeRefCS>
	{
		
		public PrimitiveTypeRefContinuation(CS2PivotConversion context, PrimitiveTypeRefCS csElement) {
			super(context, null, null, csElement, context.getPackagesHaveTypesInterDependency());
		}

		@Override
		public BasicContinuation<?> execute() {
			Type type = context.getMetaModelManager().getLibraryType(csElement.getName());
			context.installPivotReference(csElement, type, BaseCSTPackage.Literals.PIVOTABLE_ELEMENT_CS__PIVOT);
			return null;
		}
	}

	protected static class SimpleNamedElementRefContinuation extends SingleContinuation<SimpleNamedElementRefCS>
	{
		
		public SimpleNamedElementRefContinuation(CS2PivotConversion context, SimpleNamedElementRefCS csElement) {
			super(context, null, null, csElement, context.getPackagesHaveTypesInterDependency());
		}

		@Override
		public BasicContinuation<?> execute() {
//			Type type = context.getMetaModelManager().getLibraryType(csElement.getName());
//			context.installPivotReference(csElement, type, BaseCSTPackage.Literals.PIVOTABLE_ELEMENT_CS__PIVOT);
			@SuppressWarnings("unused")
			NamedElement namedElement = csElement.getElement();
			return null;
		}
	}
	
	protected static class SpecializedTypeRefContinuation1 extends SingleContinuation<TypedTypeRefCS>
	{
		public SpecializedTypeRefContinuation1(CS2PivotConversion context, TypedTypeRefCS csElement) {
			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
			assert csElement.getOwnedTemplateBinding() != null;
		}

		@Override
		public BasicContinuation<?> execute() {
			context.resolveNamespaces(csElement.getNamespace());
			Element pivotType = csElement.getType();
			if (pivotType.eIsProxy()) {
				Type badType = context.addBadTypeError(csElement, OCLMessages.UnresolvedType_ERROR_, csElement);
				csElement.setType(badType);
			}
//			else {
//				context.installPivotReference(csElement, pivotType, BaseCSTPackage.Literals.PIVOTABLE_ELEMENT_CS__PIVOT);
//			}
			return new SpecializedTypeRefContinuation2(context, csElement);
		}
	}

	protected static class SpecializedTypeRefContinuation2 extends SingleContinuation<TypedTypeRefCS>
	{
		private static Dependency[] computeDependencies(CS2PivotConversion context, TypedTypeRefCS csElement) {
			List<Dependency> dependencies = new ArrayList<Dependency>();
			TemplateBindingCS csTemplateBinding = csElement.getOwnedTemplateBinding();
			if (csTemplateBinding != null) {
				for (TemplateParameterSubstitutionCS csTemplateParameterSubstitution : csTemplateBinding.getOwnedParameterSubstitution()) {
					TypeRefCS csTemplateParameter = csTemplateParameterSubstitution.getOwnedActualParameter();
					Dependency dependency = context.createTypeIsReferenceableDependency(csTemplateParameter);
					if (dependency != null) {
						dependencies.add(dependency);
					}
				}
				for (TemplateParameterSubstitutionCS csTemplateParameterSubstitution : csTemplateBinding.getOwnedParameterSubstitution()) {
					TypeRefCS csActualParameter = csTemplateParameterSubstitution.getOwnedActualParameter();
					dependencies.add(new PivotDependency(csActualParameter));	// FIXME may be a redundant duplicate
				}
			}
			dependencies.add(new PivotHasSuperClassesDependency(csElement));
			return dependencies.toArray(new Dependency[dependencies.size()]);
		}
		
		public SpecializedTypeRefContinuation2(CS2PivotConversion context, TypedTypeRefCS csElement) {
			super(context, null, null, csElement, computeDependencies(context, csElement));
			assert csElement.getOwnedTemplateBinding() != null;
		}

		@Override
		public BasicContinuation<?> execute() {
			context.resolveNamespaces(csElement.getNamespace());
			Element pivotType = csElement.getType();
			if (pivotType.eIsProxy()) {
				Type badType = context.addBadTypeError(csElement, OCLMessages.UnresolvedType_ERROR_, csElement);
				csElement.setType(badType);
			}
			else {
				TemplateBindingCS csTemplateBinding = csElement.getOwnedTemplateBinding();
				if (ElementUtil.isSpecialization(csTemplateBinding)) {
					pivotType = context.specializeTemplates(csElement);
//					TemplateBinding pivotTemplateBinding = PivotUtil.getPivot(TemplateBinding.class, csTemplateBinding);
//					pivotType = pivotTemplateBinding.getBoundElement();
				}
				context.installPivotReference(csElement, pivotType, BaseCSTPackage.Literals.PIVOTABLE_ELEMENT_CS__PIVOT);
			}
			return null;
		}
	}

	protected static class TemplateSignatureContinuation extends SingleContinuation<ClassifierCS>
	{
		public TemplateSignatureContinuation(CS2PivotConversion context, NamedElement pivotParent, ClassifierCS csElement) {
			super(context, pivotParent, PivotPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, csElement);
			context.getTypesHaveSignaturesInterDependency().addDependency(this);
		}

		@Override
		public BasicContinuation<?> execute() {
			Type pivotElement = PivotUtil.getPivot(Type.class, csElement);
			context.refreshTemplateSignature(csElement, pivotElement);
			context.getTypesHaveSignaturesInterDependency().setSatisfied(this);
			return null;
		}
	}
	
	protected static class TupleContinuation extends SingleContinuation<TupleTypeCS>
	{
		public TupleContinuation(CS2PivotConversion context, TupleTypeCS csElement) {
			super(context, null, null, csElement, context.getPackagesHaveTypesInterDependency());
		}

		@Override
		public boolean canExecute() {
			if (!super.canExecute()) {
				return false;
			}
			for (TuplePartCS csTuplePart : csElement.getOwnedParts()) {
				TypedRefCS ownedType = csTuplePart.getOwnedType();
				if (ownedType.getPivot() == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public BasicContinuation<?> execute() {
			List<TupleTypeManager.TuplePart> tupleParts = new ArrayList<TupleTypeManager.TuplePart>();
			for (TuplePartCS csTuplePart : csElement.getOwnedParts()) {
				Type partType = PivotUtil.getPivot(Type.class, csTuplePart.getOwnedType());
				TupleTypeManager.TuplePart tuplePart = new TupleTypeManager.TuplePart(csTuplePart.getName(), partType);
				tupleParts.add(tuplePart);
				context.installPivotUsage(csTuplePart, tuplePart);
			}
			TupleType tupleType = context.getMetaModelManager().getTupleType(csElement.getName(), tupleParts, null);
			context.installPivotReference(csElement, tupleType, BaseCSTPackage.Literals.PIVOTABLE_ELEMENT_CS__PIVOT);
			return null;
		}
	}

	protected static class UnspecializedTypeRefContinuation extends SingleContinuation<TypedTypeRefCS>
	{
		public UnspecializedTypeRefContinuation(CS2PivotConversion context, TypedTypeRefCS csElement) {
			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
			assert csElement.getOwnedTemplateBinding() == null;
		}

		@Override
		public BasicContinuation<?> execute() {
			context.resolveNamespaces(csElement.getNamespace());
			Element pivotType = csElement.getType();
			if (pivotType.eIsProxy()) {
				Type badType = context.addBadTypeError(csElement, OCLMessages.UnresolvedType_ERROR_, csElement);
				csElement.setType(badType);
			}
			else {
				context.installPivotReference(csElement, pivotType, BaseCSTPackage.Literals.PIVOTABLE_ELEMENT_CS__PIVOT);
			}
			return null;
		}
	}

	public BasePreOrderVisitor(CS2PivotConversion context) {
		super(context);		// NB this class is stateless since separate instances exist per CS package
	}

	protected BasicContinuation<?> refreshClassifier(ClassifierCS csClassifier, org.eclipse.ocl.examples.pivot.Class pivotElement) {
		if (csClassifier.eIsSet(BaseCSTPackage.Literals.CLASSIFIER_CS__INSTANCE_CLASS_NAME)) {
			pivotElement.setInstanceClassName(csClassifier.getInstanceClassName());
		}
		else {
			pivotElement.eUnset(PivotPackage.Literals.TYPE__INSTANCE_CLASS_NAME);
		}
		String newInstanceClassName = csClassifier.getInstanceClassName();
		String oldInstanceClassName = pivotElement.getInstanceClassName();
		if ((newInstanceClassName != oldInstanceClassName) && ((newInstanceClassName == null) || !newInstanceClassName.equals(oldInstanceClassName))) {
			pivotElement.setInstanceClassName(newInstanceClassName);
		}
		if (csClassifier.getOwnedTemplateSignature() != null) {
			return new TemplateSignatureContinuation(context, pivotElement, csClassifier);
		}
		if (pivotElement.getOwnedTemplateSignature() != null) {
			pivotElement.setOwnedTemplateSignature(null);
		}
		return null;
	}

	protected void refreshEnumerationLiterals(EnumerationCS csEnumeration, org.eclipse.ocl.examples.pivot.Enumeration pivotElement) {
		List<EnumerationLiteral> newPivotLiterals = new ArrayList<EnumerationLiteral>();
		for (EnumerationLiteralCS csEnumerationLiteral : csEnumeration.getOwnedLiterals()) {
			EnumerationLiteral pivotEnumerationLiteral = context.refreshNamedElement(EnumerationLiteral.class,
				PivotPackage.Literals.ENUMERATION_LITERAL, csEnumerationLiteral);
			newPivotLiterals.add(pivotEnumerationLiteral);
			pivotEnumerationLiteral.setValue(BigInteger.valueOf(csEnumerationLiteral.getValue()));
		}
		context.refreshList(pivotElement.getOwnedLiteral(), newPivotLiterals);
	}

	protected void refreshProperties(ClassCS csClass, org.eclipse.ocl.examples.pivot.Class pivotElement) {
		List<Property> newPivotProperties = new ArrayList<Property>();
		for (StructuralFeatureCS csProperty : csClass.getOwnedProperty()) {
			Property pivotProperty = context.refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, csProperty);
			newPivotProperties.add(pivotProperty);
		}
		context.refreshList(pivotElement.getOwnedAttribute(), newPivotProperties);
	}

	public Continuation<?> visiting(VisitableCS visitable) {
		throw new IllegalArgumentException("Unsupported " + visitable.eClass().getName() + " for CS2Pivot PreOrder pass");
	}

	@Override
	public Continuation<?> visitAnnotationCS(AnnotationCS object) {
		return null;
	}

	@Override
	public Continuation<?> visitClassCS(ClassCS csClass) {
		org.eclipse.ocl.examples.pivot.Class pivotElement = context.refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class,
			PivotPackage.Literals.CLASS, csClass);
		List<String> qualifiers = csClass.getQualifier();
		pivotElement.setIsAbstract(qualifiers.contains("abstract"));
		pivotElement.setIsInterface(qualifiers.contains("interface"));
		pivotElement.setIsStatic(qualifiers.contains("static"));
		boolean csTemplated = csClass.getOwnedTemplateSignature() != null;
		if (csTemplated != (pivotElement.getOwnedTemplateSignature() != null)) {
			if (csTemplated) {
				pivotElement.setOwnedTemplateSignature(PivotFactory.eINSTANCE.createTemplateSignature());
			}
			else {
				pivotElement.setOwnedTemplateSignature(null);
			}
		}
		refreshProperties(csClass, pivotElement);
		Continuations continuations = new Continuations();
		continuations.add(refreshClassifier(csClass, pivotElement));
		continuations.add(new ClassContentContinuation(context, pivotElement, csClass));
		if (!(pivotElement instanceof AnyType)) {
			continuations.add(new ClassSupersContinuation(context, pivotElement, csClass));
		}
		return continuations.getContinuation();
	}

	@Override
	public Continuation<?> visitConstraintCS(ConstraintCS csConstraint) {
		return null;
	}

	@Override
	public Continuation<?> visitDataTypeCS(DataTypeCS csDataType) {
		DataType pivotElement = context.refreshNamedElement(DataType.class,
			PivotPackage.Literals.DATA_TYPE, csDataType);
		List<String> qualifiers = csDataType.getQualifier();
		pivotElement.setIsSerializable(qualifiers.contains("serializable"));
		return refreshClassifier(csDataType, pivotElement);
	}

	@Override
	public Continuation<?> visitDocumentationCS(DocumentationCS object) {
		return null;
	}

	@Override
	public Continuation<?> visitEnumerationCS(EnumerationCS csEnumeration) {
		org.eclipse.ocl.examples.pivot.Enumeration pivotElement = context.refreshNamedElement(org.eclipse.ocl.examples.pivot.Enumeration.class,
			PivotPackage.Literals.ENUMERATION, csEnumeration);
		refreshEnumerationLiterals(csEnumeration, pivotElement);
		List<String> qualifiers = csEnumeration.getQualifier();
		pivotElement.setIsSerializable(qualifiers.contains("serializable"));
		return refreshClassifier(csEnumeration, pivotElement);
	}

	@Override
	public Continuation<?> visitEnumerationLiteralCS(EnumerationLiteralCS csEnumerationLiteral) {
		return null;
	}

	@Override
	public Continuation<?> visitLambdaTypeCS(LambdaTypeCS csLambdaType) {
		return new LambdaContinuation(context, csLambdaType);
	}

	@Override
	public Continuation<?> visitModelElementCS(ModelElementCS csModelElement) {
		return null;
	}

	@Override
	public Continuation<?> visitModelElementRefCS(ModelElementRefCS object) {
		return null;
	}

	@Override
	public Continuation<?> visitMultiplicityCS(MultiplicityCS object) {
		return null;
	}

	@Override
	public Continuation<?> visitOperationCS(OperationCS csOperation) {
		return new OperationContinuation<OperationCS>(context, csOperation);
	}

	@Override
	public Continuation<?> visitPackageCS(PackageCS csPackage) {
		org.eclipse.ocl.examples.pivot.Package pivotElement = context.refreshPackage(org.eclipse.ocl.examples.pivot.Package.class,
			PivotPackage.Literals.PACKAGE, csPackage);
		String newNsPrefix = csPackage.getNsPrefix();
		String oldNsPrefix = pivotElement.getNsPrefix();
		if ((newNsPrefix != oldNsPrefix) && ((newNsPrefix == null) || !newNsPrefix.equals(oldNsPrefix))) {
			pivotElement.setNsPrefix(newNsPrefix);
		}
		String newNsURI = csPackage.getNsURI();
		String oldNsURI = pivotElement.getNsURI();
		if ((newNsURI != oldNsURI) && ((newNsURI == null) || !newNsURI.equals(oldNsURI))) {
			pivotElement.setNsURI(newNsURI);
		}
		return new PackageContentContinuation(context, csPackage);
	}

	@Override
	public Continuation<?> visitPathNameCS(PathNameCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitPrimitiveTypeRefCS(PrimitiveTypeRefCS csPrimitiveTypeRef) {
		return new PrimitiveTypeRefContinuation(context, csPrimitiveTypeRef);
	}

	@Override
	public Continuation<?> visitRootPackageCS(RootPackageCS object) {
		for (LibraryCS csLibrary : object.getOwnedLibrary()) {
			csLibrary.getPackage();						// Resolve the proxy to perform the import.
		}
		for (ImportCS csImport : object.getOwnedImport()) {
			csImport.getNamespace();					// Resolve the proxy to perform the import.
		}
		return super.visitRootPackageCS(object);
	}

	@Override
	public Continuation<?> visitSimpleNamedElementRefCS(SimpleNamedElementRefCS csElement) {
		return new SimpleNamedElementRefContinuation(context, csElement);
	}

	@Override
	public Continuation<?> visitStructuralFeatureCS(StructuralFeatureCS csStructuralFeature) {
		Property pivotElement = context.refreshTypedMultiplicityElement(Property.class, PivotPackage.Literals.PROPERTY, csStructuralFeature);
		List<String> qualifiers = csStructuralFeature.getQualifier();
		pivotElement.setIsComposite(qualifiers.contains("composes"));
		pivotElement.setIsDerived(qualifiers.contains("derived"));
		pivotElement.setIsID(qualifiers.contains("id"));
		pivotElement.setIsReadOnly(qualifiers.contains("readonly"));
		pivotElement.setIsResolveProxies(ElementUtil.getQualifier(qualifiers, "resolve", "!resolve", true));
		pivotElement.setIsStatic(qualifiers.contains("static"));
		pivotElement.setIsTransient(qualifiers.contains("transient"));
		pivotElement.setIsUnsettable(qualifiers.contains("unsettable"));
		pivotElement.setIsVolatile(qualifiers.contains("volatile"));
		if (csStructuralFeature.eIsSet(BaseCSTPackage.Literals.STRUCTURAL_FEATURE_CS__DEFAULT)) {
			pivotElement.setDefault(csStructuralFeature.getDefault());
		}
		else {
			pivotElement.eUnset(PivotPackage.Literals.PROPERTY__DEFAULT);
		}
		return null;
	}

	@Override
	public Continuation<?> visitTemplateBindingCS(TemplateBindingCS csTemplateBinding) {
//		if (csTemplateBinding.getOwnedParameterSubstitution().isEmpty()) {
			return null;
//		}
//		else {
//			return new TemplateBindingContinuation(context, csTemplateBinding);
//		}
	}

	@Override
	public Continuation<?> visitTemplateSignatureCS(TemplateSignatureCS csTemplateSignature) {
		return null;
	}

	@Override
	public Continuation<?> visitTupleTypeCS(TupleTypeCS csTupleType) {
		return new TupleContinuation(context, csTupleType);
	}

	@Override
	public Continuation<?> visitTypedTypeRefCS(TypedTypeRefCS csTypedTypeRef) {
		if (csTypedTypeRef.getOwnedTemplateBinding() == null) {
			return new UnspecializedTypeRefContinuation(context, csTypedTypeRef);
		}
		else {
			return new SpecializedTypeRefContinuation1(context, csTypedTypeRef);
		}
	}

	@Override
	public Continuation<?> visitWildcardTypeRefCS(WildcardTypeRefCS csWildcardTypeRef) {
		org.eclipse.ocl.examples.pivot.Class pivotElement = context.refreshModelElement(org.eclipse.ocl.examples.pivot.Class.class,
			PivotPackage.Literals.CLASS, null);
		context.installPivotReference(csWildcardTypeRef, pivotElement, BaseCSTPackage.Literals.PIVOTABLE_ELEMENT_CS__PIVOT);
		return null;
	}
}