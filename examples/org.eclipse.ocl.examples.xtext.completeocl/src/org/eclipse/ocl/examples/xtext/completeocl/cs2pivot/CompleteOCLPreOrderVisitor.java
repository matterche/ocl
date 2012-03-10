/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: CompleteOCLPreOrderVisitor.java,v 1.11 2011/05/20 15:26:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.cs2pivot;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LibraryCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasicContinuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.SingleContinuation;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.util.AbstractExtendingDelegatingCompleteOCLCSVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLPreOrderVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;

public class CompleteOCLPreOrderVisitor
	extends AbstractExtendingDelegatingCompleteOCLCSVisitor<Continuation<?>, CS2PivotConversion, EssentialOCLPreOrderVisitor>
{	
	protected class DefCSContinuation extends SingleContinuation<DefCS>
	{
		private DefCSContinuation(CS2PivotConversion context, DefCS csElement) {
			super(context, null, null, csElement, context.getTypesHaveSignaturesInterDependency());
		}

		@Override
		public boolean canExecute() {
			if (!super.canExecute()) {
				return true;
			}
			TypedRefCS ownedType = csElement.getOwnedType();
			if ((ownedType != null) && (ownedType.getPivot() == null)) {
				return false;
			}
			for (VariableCS csParameter : csElement.getParameters()) {
				ownedType = csParameter.getOwnedType();
				if (ownedType.getPivot() == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public BasicContinuation<?> execute() {
			ClassifierContextDeclCS csClassifierContextDecl = (ClassifierContextDeclCS) csElement.getContextDecl();
			if (csClassifierContextDecl == null) {
				return null;
			}
			Type type = csClassifierContextDecl.getClassifier();
			if ((type == null) || type.eIsProxy()) {
				return null;
			}
//			org.eclipse.ocl.examples.pivot.Class classifier = (org.eclipse.ocl.examples.pivot.Class)type;
			Type classifier = getContextClassifier(type, csElement);
			Operation pivotOperation = null;
			Property pivotProperty = null;
			Feature pivotFeature = null;
			if (csElement.isOperation()) {
				pivotOperation = context.refreshModelElement(Operation.class, PivotPackage.Literals.OPERATION, csElement);
				pivotFeature = pivotOperation;
			}
			else {
				pivotProperty = context.refreshModelElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
				pivotProperty.setIsDerived(true);
				pivotProperty.setIsReadOnly(true);
				pivotProperty.setIsTransient(true);
				pivotProperty.setIsVolatile(true);
				pivotProperty.setIsResolveProxies(false);
				pivotFeature = pivotProperty;
			}
//			context.installPivotElement(csElement, pivotFeature);
			context.refreshName(pivotFeature, csElement.getConstrainedName());
			TypedRefCS csType = csElement.getOwnedType();
			if (csType != null) {
				pivotFeature.setType(PivotUtil.getPivot(Type.class, csType));
			}
//			context.refreshComments(pivotOperation, csElement);
//			List<String> qualifiers = csTypedElement.getQualifier();
//			pivotElement.setIsOrdered(qualifiers.contains("ordered"));
//			pivotElement.setIsUnique(getQualifier(qualifiers, "unique", "!unique", true));
//			String multiplicity = csTypedElement.getMultiplicity();
//			if (multiplicity == null) {
//				pivotElement.setLower(BigInteger.valueOf(csTypedElement.getLower()));
//				pivotElement.setUpper(BigInteger.valueOf(csTypedElement.getUpper()));
//			}
//			else if ("*".equals(multiplicity)) {
//				pivotElement.setLower(BigInteger.valueOf(0));
//				pivotElement.setUpper(BigInteger.valueOf(-1));
//			}
//			else if ("+".equals(multiplicity)) {
//				pivotElement.setLower(BigInteger.valueOf(1));
//				pivotElement.setUpper(BigInteger.valueOf(-1));
//			}
//			else if ("?".equals(multiplicity)) {
//				pivotElement.setLower(BigInteger.valueOf(0));
//				pivotElement.setUpper(BigInteger.valueOf(1));
//			}
//			context.refreshTemplateSignature(csElement, pivotOperation);
			if (pivotOperation != null) {
				List<VariableCS> csParameters = csElement.getParameters();
				List<Parameter> newPivotParameters = new ArrayList<Parameter>();
				for (VariableCS csParameter : csParameters) {
					Parameter pivotParameter = context.refreshNamedElement(Parameter.class, PivotPackage.Literals.PARAMETER, csParameter);
//					context.refreshMultiplicity(pivotParameter, csParameter);
					pivotParameter.setType(PivotUtil.getPivot(Type.class, csParameter.getOwnedType()));
					newPivotParameters.add(pivotParameter);
				}
				context.refreshList(pivotOperation.getOwnedParameter(), newPivotParameters);
				classifier.getOwnedOperation().add(pivotOperation);
			}
			else {
				classifier.getOwnedAttribute().add(pivotProperty);
			}
			context.refreshComments(pivotFeature, csElement);
			return null;
		}
	}

	protected class OperationContextDeclCSContinuation extends SingleContinuation<OperationContextDeclCS>
	{
		private OperationContextDeclCSContinuation(CS2PivotConversion context, OperationContextDeclCS csElement) {
			super(context, null, null, csElement);
		}

		@Override
		public boolean canExecute() {
			if (!super.canExecute()) {
				return false;
			}
			for (VariableCS csParameter : csElement.getParameters()) {
				if (csParameter.getOwnedType().getPivot() == null) {
					return false;
				}
			}
			TypedRefCS csType = csElement.getOwnedType();
			if ((csType != null) && (csType.getPivot() == null)) {
				return false;
			}
			return true;
		}

		@Override
		public BasicContinuation<?> execute() {
			CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.OPERATION, csElement);
			Operation modelOperation = csElement.getOperation();
			if ((modelOperation == null) || modelOperation.eIsProxy()) {
				return null;
			}
			Type contextType = getContextClassifier(modelOperation.getOwningType(), csElement);
//			completeEnvironmentManager.getCompleteOperation(element);
//			if ((element == null) || element.eIsProxy()) {
//				context.addBadPackageError(csElement, OCLMessages.ErrorUnresolvedPackageName, csElement.toString());
//				element = context.getMetaModelManager().getOclInvalidType();	// FIXME with reason
//			}
			Operation contextOperation = context.refreshModelElement(Operation.class, PivotPackage.Literals.OPERATION, csElement);
			contextOperation.setName(modelOperation.getName());
			List<Parameter> modelParameters = modelOperation.getOwnedParameter();
			List<VariableCS> csParameters = csElement.getParameters();
			for (int i = 0; i < csParameters.size(); i++) {
				VariableCS csParameter = csParameters.get(i);
				Parameter contextParameter = context.refreshModelElement(Parameter.class, PivotPackage.Literals.PARAMETER, csParameter);
				Parameter modelParameter = modelParameters.get(i);
				contextParameter.setName(csParameter.getName());
//				contextParameter.setType(PivotUtil.getPivot(Type.class, csParameter.getOwnedType()));
				contextParameter.setType(modelParameter.getType());				// FIXME consistency check
				contextOperation.getOwnedParameter().add(contextParameter);	// FIXME multiplicity
			}
			TypedRefCS csType = csElement.getOwnedType();
			if (csType != null) {
//				contextOperation.setType(PivotUtil.getPivot(Type.class, csType));
				contextOperation.setType(modelOperation.getType());			// FIXME consistency check
			}
//			context.installPivotElement(csElement, contextOperation);
			contextType.getOwnedOperation().add(contextOperation);
			context.refreshComments(contextOperation, csElement);
//			metaModelManager.addContextOperation(modelOperation, contextOperation);
			return null;
		}
	}
	
	protected final MetaModelManager metaModelManager;

	public CompleteOCLPreOrderVisitor(CS2PivotConversion context) {
		super(new EssentialOCLPreOrderVisitor(context), context);
		metaModelManager = context.getMetaModelManager();
	}

	protected Type getContextClassifier(Type modelType, ModelElementCS csElement) {
		Resource pivotResource = context.getConverter().getPivotResource(csElement.eResource());
		for (Type aType : metaModelManager.getAllTypes(modelType)) {
			if (aType.eResource() == pivotResource) {
				return aType;
			}
		}
		org.eclipse.ocl.examples.pivot.Package contextPackage = getContextPackage(modelType.getPackage(), csElement.eResource(), csElement);
		org.eclipse.ocl.examples.pivot.Class contextType = context.refreshModelElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, csElement);
		contextType.setName(modelType.getName());
		contextPackage.getOwnedType().add(contextType);
		// WIP Install class synonym
		return contextType;
	}

	protected org.eclipse.ocl.examples.pivot.Package getContextPackage(org.eclipse.ocl.examples.pivot.Package modelPackage, Resource csResource, ModelElementCS csElement) {
		if (modelPackage == null) {
			return null;
		}
		Resource pivotResource = context.getConverter().getPivotResource(csResource);
		for (org.eclipse.ocl.examples.pivot.Package aPackage : metaModelManager.getAllPackages(modelPackage, true)) {
			if (aPackage.eResource() == pivotResource) {	// WIP FIXME A CS2P cache would avoid searching
				return aPackage;
			}
		}
		org.eclipse.ocl.examples.pivot.Package contextNestingPackage = getContextPackage(modelPackage.getNestingPackage(), csResource, null);
		org.eclipse.ocl.examples.pivot.Package contextPackage = context.refreshModelElement(org.eclipse.ocl.examples.pivot.Package.class, PivotPackage.Literals.PACKAGE, csElement);
		contextPackage.setName(modelPackage.getName());
		contextPackage.setNsURI(modelPackage.getNsURI());
		if (contextNestingPackage != null) {
			contextNestingPackage.getNestedPackage().add(contextPackage);
		}
		else {
			pivotResource.getContents().add(contextPackage);
		}
		metaModelManager.installPackage(contextPackage);
		return contextPackage;
	}

	@Override
	public Continuation<?> visitClassifierContextDeclCS(ClassifierContextDeclCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.TYPE, csElement);
		Type modelClassifier = csElement.getClassifier();
		if ((modelClassifier == null) || modelClassifier.eIsProxy()) {
			return null;
		}
		Type contextClassifier = getContextClassifier(modelClassifier, csElement);
		context.refreshComments(contextClassifier, csElement);
//		if ((element == null) || element.eIsProxy()) {
//			context.addBadPackageError(csElement, OCLMessages.ErrorUnresolvedPackageName, csElement.toString());
//			element = context.getMetaModelManager().getOclInvalidType();	// FIXME with reason
//		}
		context.installPivotUsage(csElement, contextClassifier);		// WIP ?? reference
		return null;
	}

	@Override
	public Continuation<?> visitCompleteOCLDocumentCS(CompleteOCLDocumentCS object) {
		for (LibraryCS csLibrary : object.getOwnedLibrary()) {
			org.eclipse.ocl.examples.pivot.Package pPackage = csLibrary.getPackage();						// Resolve the proxy to perform the import.
			if ((pPackage != null) && !pPackage.eIsProxy()) {
				context.installPivotUsage(csLibrary, pPackage);
			}
		}
		for (ImportCS csImport : object.getOwnedImport()) {
			Namespace namespace = csImport.getNamespace();					// Resolve the proxy to perform the import.
			if ((namespace != null) && !namespace.eIsProxy()) {
				context.installPivotUsage(csImport, namespace);
			}
		}
		Continuation<?> continuation = super.visitCompleteOCLDocumentCS(object);
		for (IncludeCS csInclude : object.getOwnedInclude()) {
			csInclude.getNamespace();					// Resolve the proxy to perform the import.
		}
		return continuation;
	}

	@Override
	public Continuation<?> visitDefCS(DefCS object) {
		return new DefCSContinuation(context, object);
	}

	@Override
	public Continuation<?> visitOperationContextDeclCS(OperationContextDeclCS object) {
		// Must wait till parameters have types before resolving operation name
		return new OperationContextDeclCSContinuation(context, object);
	}

	@Override
	public Continuation<?> visitPackageDeclarationCS(PackageDeclarationCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.PACKAGE, csElement);
		NamedElement modelElement = csElement.getPathName().getElement();
		if ((modelElement == null) || modelElement.eIsProxy()) {
			return null;
		}
		org.eclipse.ocl.examples.pivot.Package modelPackage = (org.eclipse.ocl.examples.pivot.Package)modelElement;
		org.eclipse.ocl.examples.pivot.Package contextPackage = getContextPackage(modelPackage, csElement.eResource(), csElement);
		context.refreshComments(contextPackage, csElement);
//		if ((element == null) || element.eIsProxy()) {
//			context.addBadPackageError(csElement, OCLMessages.ErrorUnresolvedPackageName, csElement.toString());
//			element = context.getMetaModelManager().getOclInvalidType();	// FIXME with reason
//		}
		context.installPivotUsage(csElement, contextPackage);
		return null; //new CompletePackageContentContinuation(context, csElement);
	}

	@Override
	public Continuation<?> visitPropertyContextDeclCS(PropertyContextDeclCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.PROPERTY, csElement);
		Property modelProperty = csElement.getProperty();
		if (modelProperty == null) {
			return null;
		}
		Type contextType = getContextClassifier(modelProperty.getOwningType(), csElement);
//		if ((element == null) || element.eIsProxy()) {
//			context.addBadPackageError(csElement, OCLMessages.ErrorUnresolvedPackageName, csElement.toString());
//			element = context.getMetaModelManager().getOclInvalidType();	// FIXME with reason
//		}
		Property contextProperty = context.refreshModelElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
		contextProperty.setName(modelProperty.getName());
		contextProperty.setType(modelProperty.getType());
		contextType.getOwnedAttribute().add(contextProperty);
		context.refreshComments(contextProperty, csElement);
//		metaModelManager.addContextProperty(modelProperty, contextProperty);
		return null;
	}
}