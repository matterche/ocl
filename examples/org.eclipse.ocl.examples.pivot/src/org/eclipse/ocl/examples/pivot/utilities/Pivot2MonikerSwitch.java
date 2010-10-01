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
 * $Id: Pivot2MonikerSwitch.java,v 1.1.2.1 2010/10/01 13:49:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Iterate;
import org.eclipse.ocl.examples.pivot.Iterator;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.TypeTemplateParameter;
import org.eclipse.ocl.examples.pivot.util.PivotSwitch;

public class Pivot2MonikerSwitch extends PivotSwitch<Object> implements PivotConstants, Abstract2Moniker.Switch
{	
	private static final class Factory implements Pivot2Moniker.Factory
	{
		private Factory() {
			Pivot2Moniker.addFactory(this);
			roleNames.put(PivotPackage.Literals.CALL_EXP__SOURCE, "src");
			roleNames.put(PivotPackage.Literals.CONSTRAINT__SPECIFICATION, "spec");
			roleNames.put(PivotPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION, "body");
			roleNames.put(PivotPackage.Literals.IF_EXP__CONDITION, "cond");
			roleNames.put(PivotPackage.Literals.IF_EXP__THEN_EXPRESSION, "then");
			roleNames.put(PivotPackage.Literals.IF_EXP__ELSE_EXPRESSION, "else");
			roleNames.put(PivotPackage.Literals.LET_EXP__IN, "in");
			roleNames.put(PivotPackage.Literals.LET_EXP__VARIABLE, "var");
			roleNames.put(PivotPackage.Literals.LOOP_EXP__BODY, "body");
			roleNames.put(PivotPackage.Literals.LOOP_EXP__ITERATOR, "it");
			roleNames.put(PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT, "arg");
		}
		
		public Pivot2Moniker.Switch create(Abstract2Moniker moniker) {
			return new Pivot2MonikerSwitch((Pivot2Moniker)moniker);
		}

		public EPackage getEPackage() {
			return PivotPackage.eINSTANCE;
		}
	}

	public static Pivot2Moniker.Factory FACTORY = new Factory();

	protected final Pivot2Moniker moniker;
	
	public Pivot2MonikerSwitch(Pivot2Moniker moniker) {
		this.moniker = moniker;			
	}

	@Override
	public Object caseAnnotation(Annotation object) {
		moniker.appendParent(object, SCOPE_SEPARATOR);
		moniker.append(ANNOTATION_QUOTE);
		moniker.append(String.valueOf(object.getName()));
		moniker.append(ANNOTATION_QUOTE);
		return true;
	}

	@Override
	public Object caseClass(org.eclipse.ocl.examples.pivot.Class object) {
		EObject eContainer = object.eContainer();
		if (eContainer instanceof TemplateParameter) {
			if (moniker.hasEmitted((TemplateParameter) eContainer)) {
				moniker.appendName(object);
			}
			else {
				moniker.appendParent((Element) eContainer.eContainer(), SCOPE_SEPARATOR);
				moniker.appendName(object);
			}
		}
		else {
			caseNamedElement(object);
			moniker.appendTemplateParameters(object);
		}
		return true;
	}

	@Override
	public Object caseDetail(Detail object) {
		moniker.appendParent(object, BINDINGS_PREFIX);
		moniker.append(object.getName());
		return true;
	}

	@Override
	public Object caseEnumerationLiteral(EnumerationLiteral object) {
		caseNamedElement(object);
		return true;
	}

	@Override
	public Object caseIterate(Iterate object) {
		caseNamedElement(object);
		moniker.appendTemplateParameters(object);
		moniker.appendParameters(object.getOwnedIterators(), object.getOwnedAccumulators(), object.getOwnedParameters());
		return true;
	}

	@Override
	public Object caseIterator(Iterator object) {
		caseNamedElement(object);
		moniker.appendTemplateParameters(object);
		moniker.appendParameters(object.getOwnedIterators(), Collections.<Parameter>emptyList(), object.getOwnedParameters());
		return true;
	}

	@Override
	public Object caseNamedElement(NamedElement object) {
		if (object instanceof TemplateableElement) {
			List<TemplateBinding> templateBindings = ((TemplateableElement)object).getTemplateBindings();
			if (!templateBindings.isEmpty()) {
				TemplateSignature signature = templateBindings.get(0).getSignature();
				moniker.appendSignature(signature, (TemplateableElement)object);
				return true;
			}
		}
		moniker.appendParent(object, SCOPE_SEPARATOR);
		moniker.appendName(object);
		return true;
	}

	@Override
	public Object caseExpressionInOcl(ExpressionInOcl object) {
		moniker.appendRole(object);
		return true;
	}

	@Override
	public Object caseOclExpression(OclExpression object) {
		moniker.appendRole(object);
		return true;
	}

	@Override
	public Object caseOperationCallExp(OperationCallExp object) {
		caseOclExpression(object);
		moniker.append(OPERATOR_SEPARATOR);
		moniker.append(object.getName());
		return true;
	}

	@Override
	public Object caseOperation(Operation object) {
		caseNamedElement(object);
		moniker.appendTemplateParameters(object);
		moniker.appendParameters(Collections.<Parameter>emptyList(), Collections.<Parameter>emptyList(), object.getOwnedParameters());
		return true;
	}

	@Override
	public Object casePackage(org.eclipse.ocl.examples.pivot.Package object) {
		String alias = AliasAdapter.getAlias(object);
		if (alias != null) {
			moniker.append(alias);
			return true;
		}
		return caseNamedElement(object);
	}

	@Override
	public Object caseParameter(Parameter object) {
		return caseNamedElement(object);
	}

	@Override
	public Object caseProperty(Property object) {
		return caseNamedElement(object);
	}

	@Override
	public Object caseTemplateBinding(TemplateBinding object) {
		TemplateSignature signature = object.getSignature();
		moniker.appendSignature(signature, object);
		moniker.append(BINDINGS_PREFIX);
		return true;
	}

	@Override
	public Object caseTemplateParameterSubstitution(TemplateParameterSubstitution object) {
		moniker.appendElement(object.getTemplateBinding());
		moniker.appendName((NamedElement) object.getFormal().getParameteredElement());	// FIXME bad cast
		return true;
	}

	@Override
	public Object caseTemplateSignature(TemplateSignature object) {
		moniker.appendParent(object, SCOPE_SEPARATOR);
		return true;
	}

	@Override
	public Object caseTypeTemplateParameter(TypeTemplateParameter object) {
		if (!moniker.hasEmitted(object)) {
			if (moniker.toString().length() < 100) {
				moniker.appendParent(object.getSignature(), SCOPE_SEPARATOR);
			}
			else {
				moniker.append(OVERFLOW_MARKER);
			}
		}
		moniker.appendName((NamedElement) object.getParameteredElement());	// FIXME bad cast
		return true;
	}

	@Override
	public Object defaultCase(EObject object) {
		// TODO Auto-generated method stub
		return super.defaultCase(object);
	}

	public Object doInPackageSwitch(EObject theEObject) {
		int classifierID = theEObject.eClass().getClassifierID();
		return doSwitch(classifierID, theEObject);
	}

	@Override
	public String toString() {
		return moniker.toString();
	}	
}
