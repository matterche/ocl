/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: BasePostOrderVisitor.java,v 1.1.2.1 2010/12/06 17:53:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.xtext.base.baseCST.AbstractPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ConstraintCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DetailCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DocumentationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterizedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.util.AbstractExtendingBaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.util.VisitableCS;

public class BasePostOrderVisitor extends AbstractExtendingBaseCSVisitor<Continuation<?>, CS2PivotConversion>
{
	public static final Logger logger = Logger.getLogger(BasePostOrderVisitor.class);
	
	protected static class ConstraintContentContinuation extends SingleContinuation<ConstraintCS>
	{
		public ConstraintContentContinuation(CS2PivotConversion context, ConstraintCS csElement) {
			super(context, null, null, csElement);
		}

		@Override
		public BasicContinuation<?> execute() {
			Constraint pivotElement = context.getPivotElement(Constraint.class, csElement);
			ValueSpecification specification = pivotElement.getSpecification();
			context.putPivotElement(specification);
			if (specification instanceof ExpressionInOcl) {
				Variable contextVariable = ((ExpressionInOcl)specification).getContextVariable();
				context.putPivotElement(contextVariable);
			}
			return null;
		}
	}
	
	public BasePostOrderVisitor(CS2PivotConversion context) {
		super(context);		// NB this class is stateless since separate instances exist per CS package
	}

	protected TemplateableElementCS getTemplateableElementContainer(ElementCS csElement) {
		for (EObject eObject = csElement; eObject != null; eObject = eObject.eContainer())
			if (eObject instanceof TemplateableElementCS) {
				return (TemplateableElementCS) eObject;
			}
		return null;
	}

	protected <CST extends ModelElementCS, P extends NamedElement> BasicContinuation<?> refreshList(NamedElement pivotParent, EStructuralFeature pivotFeature,
		final Class<P> pivotClass, final List<P> pivotElements, List<CST> csElements) {
		if (csElements.isEmpty()) {
			context.refreshPivotList(pivotClass, pivotElements, csElements);
			return null;
		}
		else {
			return new MultipleContinuation<CST>(context, pivotParent, pivotFeature, csElements, new PivotDependencies(csElements)) 
			{
				@Override
				public BasicContinuation<?> execute() {
					context.refreshPivotList(pivotClass, pivotElements, csElement);
					return null;
				}			
			};
		}
	}

	public Continuation<?> visiting(VisitableCS visitable) {
		logger.warn("post-visiting " + ((EObject)visitable).eClass().getName());
		return null;
	}

	@Override
	public Continuation<?> visitAbstractPackageCS(AbstractPackageCS csAbstractPackage) {
		org.eclipse.ocl.examples.pivot.Package pivotElement = context.getPivotElement(org.eclipse.ocl.examples.pivot.Package.class, csAbstractPackage);
		context.handleVisitNamedElement(csAbstractPackage, pivotElement);
		return null;
	}

	@Override
	public Continuation<?> visitAnnotationCS(AnnotationCS csAnnotation) {
		Annotation pivotElement = context.refreshNamedElement(Annotation.class,
			PivotPackage.Literals.ANNOTATION, csAnnotation);
		context.handleVisitNamedElement(csAnnotation, pivotElement);
		context.refreshPivotList(Detail.class, pivotElement.getOwnedDetails(), csAnnotation.getOwnedDetail());
		return null;
	}

	@Override
	public Continuation<?> visitAnnotationElementCS(AnnotationElementCS csAnnotationElement) {
		return null;
	}

	@Override
	public Continuation<?> visitClassifierCS(ClassifierCS csClassifier) {
		Type pivotElement = context.getPivotElement(Type.class, csClassifier);
		context.handleVisitNamedElement(csClassifier, pivotElement);
		context.refreshPivotList(Constraint.class, pivotElement.getOwnedRules(), csClassifier.getOwnedConstraint());
		return null;
	}

	@Override
	public Continuation<?> visitConstraintCS(ConstraintCS csConstraint) {
		Constraint pivotElement = context.refreshNamedElement(Constraint.class, PivotPackage.Literals.CONSTRAINT, csConstraint);
		ValueSpecification pivotSpecification = pivotElement.getSpecification();
		if (!(pivotSpecification instanceof ExpressionInOcl)) {
			pivotSpecification = PivotFactory.eINSTANCE.createExpressionInOcl();
			pivotElement.setSpecification(pivotSpecification);
		}
		ExpressionInOcl expressionInOcl = (ExpressionInOcl)pivotSpecification;
		pivotElement.setStereotype(csConstraint.getStereotype());
		EObject classifierContext = ((ModelElementCS)csConstraint.eContainer()).getPivot();
		while ((classifierContext != null) && !(classifierContext instanceof org.eclipse.ocl.examples.pivot.Class)) {
			classifierContext = classifierContext.eContainer();
		}
		org.eclipse.ocl.examples.pivot.Class pivotClass = (org.eclipse.ocl.examples.pivot.Class)classifierContext;
		Variable contextVariable = expressionInOcl.getContextVariable();
		if (contextVariable == null) {
			contextVariable = PivotFactory.eINSTANCE.createVariable();
			expressionInOcl.setContextVariable(contextVariable);
		}
		context.refreshName(contextVariable, "self");
		context.setType(contextVariable, pivotClass);
		return new ConstraintContentContinuation(context, csConstraint);
	}

	@Override
	public Continuation<?> visitDetailCS(DetailCS csDetail) {
		Detail pivotElement = context.refreshNamedElement(Detail.class,
			PivotPackage.Literals.DETAIL, csDetail);
		context.handleVisitNamedElement(csDetail, pivotElement);
//			refreshPivotList(Detail.class, pivotElement.getOwnedDetails(), csDocumentation.getOwnedDetail());
		List<String> newValues = csDetail.getValue();
		List<String> pivotValues = pivotElement.getValues();
		pivotValues.clear();
		pivotValues.addAll(newValues);
		return null;
	}

	@Override
	public Continuation<?> visitDocumentationCS(DocumentationCS csDocumentation) {
		Annotation pivotElement = context.refreshNamedElement(Annotation.class,
			PivotPackage.Literals.ANNOTATION, csDocumentation);
		context.handleVisitNamedElement(csDocumentation, pivotElement);
		context.refreshPivotList(Detail.class, pivotElement.getOwnedDetails(), csDocumentation.getOwnedDetail());
		return null;
	}

	@Override
	public Continuation<?> visitElementCS(ElementCS csElement) {
		return visiting(csElement);
	}

	@Override
	public Continuation<?> visitImportCS(ImportCS object) {
		return null;
	}

	@Override
	public Continuation<?> visitModelElementCS(ModelElementCS csModelElement) {
		return null;
	}

	@Override
	public Continuation<?> visitMonikeredElementCS(MonikeredElementCS csMonikeredElement) {
		return null;
	}

	@Override
	public Continuation<?> visitNamedElementCS(NamedElementCS csNamedElement) {
		NamedElement pivotElement = context.getPivotElement(NamedElement.class, csNamedElement);
		context.handleVisitNamedElement(csNamedElement, pivotElement);
		return null;
	}

	@Override
	public Continuation<?> visitParameterizedTypeRefCS(ParameterizedTypeRefCS csParameterizedTypeRef) {
		return null;
	}

	@Override
	public Continuation<?> visitPrimitiveTypeRefCS(PrimitiveTypeRefCS csPrimitiveTypeRef) {
		return null;
	}

	@Override
	public Continuation<?> visitReferenceCS(ReferenceCS csReference) {
		Property pivotElement = context.getPivotElement(Property.class, csReference);
		// FIXME opposite
		return visitTypedElementCS(csReference);
	}

	@Override
	public Continuation<?> visitTemplateBindingCS(TemplateBindingCS csTemplateBinding) {
		return null;
	}

	@Override
	public Continuation<?> visitTemplateParameterCS(TemplateParameterCS csTemplateParameter) {
		return null;
	}

	@Override
	public Continuation<?> visitTemplateParameterSubstitutionCS(TemplateParameterSubstitutionCS csTemplateParameterSubstitution) {
		return null;
	}
	
	@Override
	public Continuation<?> visitTemplateSignatureCS(TemplateSignatureCS csTemplateSignature) {
		return null;
	}

	@Override
	public BasicContinuation<?> visitTypedElementCS(TypedElementCS csTypedElement) {
		TypedElement pivotElement = context.getPivotElement(TypedElement.class, csTypedElement);
		context.handleVisitNamedElement(csTypedElement, pivotElement);
		TypedRefCS ownedType = csTypedElement.getOwnedType();
		Type pivotType = ownedType != null ? context.getPivotElement(Type.class, ownedType) : null;
		context.setType(pivotElement, pivotType);
		context.refreshPivotList(Constraint.class, pivotElement.getOwnedRules(), csTypedElement.getOwnedConstraint());
		return null;
//		return new TypedElementCSCompletion(context, csTypedElement, pivotElement);
	}
}