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
 * $Id: OCLinEcoreDeclarationVisitor.java,v 1.8 2011/05/14 10:38:08 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.pivot2cs;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintExprVisitor;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintOptions;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintTypeVisitor;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.Pivot2CSConversion;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.BodyCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextSpecificationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DerCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InitCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InvCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreCS;
import org.eclipse.ocl.examples.xtext.essentialocl.pivot2cs.EssentialOCLDeclarationVisitor;

public class CompleteOCLDeclarationVisitor extends EssentialOCLDeclarationVisitor
{
	public CompleteOCLDeclarationVisitor(Pivot2CSConversion context) {
		super(context);
	}

	@Override
	public ElementCS visitClass(Class object) {
		return visitType(object);
	}

	@Override
	public ElementCS visitComment(Comment object) {
		// TODO Auto-generated method stub
		return super.visitComment(object);
	}

	@Override
	public ElementCS visitConstraint(Constraint object) {
		String stereotype = object.getStereotype();
		ContextConstraintCS csElement = null;
		if (UMLReflection.BODY.equals(stereotype)) {
			csElement = context.refreshNamedElement(BodyCS.class, CompleteOCLCSTPackage.Literals.BODY_CS, object);
		}
		else if (UMLReflection.DERIVATION.equals(stereotype)) {
			csElement = context.refreshNamedElement(DerCS.class, CompleteOCLCSTPackage.Literals.DER_CS, object);
		}
		else if (UMLReflection.INITIAL.equals(stereotype)) {
			csElement = context.refreshNamedElement(InitCS.class, CompleteOCLCSTPackage.Literals.INIT_CS, object);
		}
		else if (UMLReflection.INVARIANT.equals(stereotype)) {
			csElement = context.refreshNamedElement(InvCS.class, CompleteOCLCSTPackage.Literals.INV_CS, object);
		}
		else if (UMLReflection.POSTCONDITION.equals(stereotype)) {
			csElement = context.refreshNamedElement(PostCS.class, CompleteOCLCSTPackage.Literals.POST_CS, object);
		}
		else if (UMLReflection.PRECONDITION.equals(stereotype)) {
			csElement = context.refreshNamedElement(PreCS.class, CompleteOCLCSTPackage.Literals.PRE_CS, object);
		}
		if (csElement != null) {
			csElement.setStereotype(stereotype);
			Namespace namespace = null;
			for (EObject eContainer = object; eContainer != null; eContainer = eContainer.eContainer()) {
				if (eContainer instanceof Namespace) {
					namespace = (Namespace)eContainer;
					break;
				}
			}			
			ValueSpecification specification = object.getSpecification();
			ContextSpecificationCS csSpec = context.refreshElement(ContextSpecificationCS.class, CompleteOCLCSTPackage.Literals.CONTEXT_SPECIFICATION_CS, specification);
			csElement.setSpecification(csSpec);
			if (specification instanceof OpaqueExpression) {
				PrettyPrintOptions prettyPrintOptions = PrettyPrintTypeVisitor.createOptions(namespace);
				String expr = PrettyPrintExprVisitor.prettyPrint(specification, prettyPrintOptions);		
				csSpec.setExprString(expr);
				OpaqueExpression opaqueExpression = (OpaqueExpression)specification;
				String message = PivotUtil.getMessage(opaqueExpression);
				if ((message != null) && (message.length() > 0)) {
					ContextSpecificationCS csMessageElement = context.refreshElement(ContextSpecificationCS.class, CompleteOCLCSTPackage.Literals.CONTEXT_SPECIFICATION_CS, opaqueExpression);
					csMessageElement.setExprString(message);
					csElement.setMessageSpecification(csMessageElement);
				}
			}
		}
		return csElement;
	}

	@Override
	public ElementCS visitOperation(Operation object) {
		// TODO Auto-generated method stub
		return super.visitOperation(object);
	}

	@Override
	public ElementCS visitPackage(org.eclipse.ocl.examples.pivot.Package object) {
		ElementCS csElement;
		if (object.eContainer() == null) {
			// Lose the name to lose the 'module' declaration, there are no annotations
			CompleteOCLDocumentCS csDocument = context.refreshElement(CompleteOCLDocumentCS.class, CompleteOCLCSTPackage.Literals.COMPLETE_OCL_DOCUMENT_CS, object);
			context.refreshList(csDocument.getPackages(), context.visitDeclarations(PackageDeclarationCS.class, object.getNestedPackages(), null));
//			csDocument.setPackage(object);
			csElement = csDocument;
		}
		else {
			PackageDeclarationCS csPackage = context.refreshElement(PackageDeclarationCS.class, CompleteOCLCSTPackage.Literals.PACKAGE_DECLARATION_CS, object);
//			context.refreshList(csPackage.getOwnedType(), context.visitDeclarations(ClassifierCS.class, object.getOwnedTypes(), null));
			csPackage.setPackage(object);
			context.importPackage(object);
			List<ClassifierContextDeclCS> classifierContexts = context.visitDeclarations(ClassifierContextDeclCS.class, object.getOwnedTypes(), null);
//			List<OperationContextDeclCS> operationContexts = context.visitReferences(OperationContextDeclCS.class, object.getOwnedOperations(), null);
//			List<PropertyContextDeclCS> propertyContexts = context.visitReferences(PropertyContextDeclCS.class, object.getOwnedAttributes(), null);
			context.refreshList(csPackage.getContexts(), classifierContexts);
			csElement = csPackage;
//			context.refreshList(csPackage.getOwnedNestedPackage(), context.visitDeclarations(PackageCS.class, object.getNestedPackages(), null));
		}
//		csElement.setNsPrefix(object.getNsPrefix());
//		csElement.setNsURI(object.getNsURI());
//		context.refreshList(csElement.getOwnedNestedPackage(), context.visitDeclarations(PackageCS.class, object.getNestedPackages(), null));
		return csElement;
	}

	@Override
	public ElementCS visitProperty(Property object) {
		// TODO Auto-generated method stub
		return super.visitProperty(object);
	}

	@Override
	public ElementCS visitType(Type object) {
		ClassifierContextDeclCS csContext = context.refreshElement(ClassifierContextDeclCS.class, CompleteOCLCSTPackage.Literals.CLASSIFIER_CONTEXT_DECL_CS, object);
//		context.refreshList(csPackage.getOwnedType(), context.visitDeclarations(ClassifierCS.class, object.getOwnedTypes(), null));
		csContext.setClassifier(object);
		context.importPackage(object.getPackage());
//		List<ClassifierContextDeclCS> classifierContexts = context.visitReferences(ClassifierContextDeclCS.class, object.getOwnedTypes(), null);
//		List<OperationContextDeclCS> operationContexts = context.visitReferences(OperationContextDeclCS.class, object.getOwnedOperations(), null);
//		List<PropertyContextDeclCS> propertyContexts = context.visitReferences(PropertyContextDeclCS.class, object.getOwnedAttributes(), null);
//		context.refreshList(csPackage.getContexts(), context.visitReferences(ContextDeclCS.class, classifierContexts, null));
		context.refreshList(csContext.getRules(), context.visitDeclarations(ContextConstraintCS.class, object.getOwnedRules(), null));
		return csContext;
	}

/*	@Override
	public ElementCS visitConstraint(Constraint object) {
		OCLinEcoreConstraintCS csElement = context.refreshNamedElement(OCLinEcoreConstraintCS.class, OCLinEcoreCSTPackage.Literals.OC_LIN_ECORE_CONSTRAINT_CS, object);
		csElement.setStereotype(object.getStereotype());
		csElement.setCallable(object.isCallable());
		ValueSpecification specification = object.getSpecification();
		csElement.setSpecification(context.visitDeclaration(SpecificationCS.class, specification));
		if (specification instanceof OpaqueExpression) {		// FIXME ExpressionInOcl too??
			OpaqueExpression opaqueExpression = (OpaqueExpression)specification;
			String message = PivotUtil.getMessage(opaqueExpression);
			if ((message != null) && (message.length() > 0)) {
				OCLinEcoreSpecificationCS csMessageElement = context.refreshElement(OCLinEcoreSpecificationCS.class, OCLinEcoreCSTPackage.Literals.OC_LIN_ECORE_SPECIFICATION_CS, opaqueExpression);
				csMessageElement.setExprString(message);
				csElement.setMessageSpecification(csMessageElement);
			}
		}
		return csElement;
	}

	@Override
	public ElementCS visitExpressionInOcl(ExpressionInOcl object) {
		OCLinEcoreSpecificationCS csElement = context.refreshElement(OCLinEcoreSpecificationCS.class, OCLinEcoreCSTPackage.Literals.OC_LIN_ECORE_SPECIFICATION_CS, object);
		csElement.setOwnedExpression(context.visitDeclaration(ExpCS.class, object.getBodyExpression()));
		return csElement;
	}

	@Override
	public ElementCS visitOpaqueExpression(OpaqueExpression object) {
		String body = PivotUtil.getBody(object);
		if (body == null) {
			return null;
		}
		OCLinEcoreSpecificationCS csElement = context.refreshElement(OCLinEcoreSpecificationCS.class, OCLinEcoreCSTPackage.Literals.OC_LIN_ECORE_SPECIFICATION_CS, object);
		csElement.setExprString(body);
		return csElement;
	} */
	
	
}