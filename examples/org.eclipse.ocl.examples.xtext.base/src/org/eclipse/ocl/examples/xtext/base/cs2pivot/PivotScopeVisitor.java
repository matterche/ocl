/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: PivotScopeVisitor.java,v 1.7 2011/04/25 19:39:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidType;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeTemplateParameter;
import org.eclipse.ocl.examples.pivot.UnspecifiedType;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.VoidType;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.ClassScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.EmptyScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.EnumerationScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.ExpressionInOclScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.IterateExpScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.IteratorExpScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.LetExpScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.OperationCallExpScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.OperationScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.PackageScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.PivotScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.RootPackageScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.VoidTypeScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class PivotScopeVisitor extends AbstractExtendingVisitor<PivotScopeAdapter, Object> implements PivotConstants
{	
	public PivotScopeVisitor() {
		super(null);
	}
	
	@Override
	public PivotScopeAdapter visitClass(org.eclipse.ocl.examples.pivot.Class pivotElement) {
		return ClassScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter  visitConstraint(Constraint pivotElement) {
		return EmptyScopeAdapter.INSTANCE;
	}
	
	@Override
	public PivotScopeAdapter visitDataType(DataType pivotElement) {
		Type behavioralType = pivotElement.getBehavioralType();
		if (behavioralType != null) {
			return ElementUtil.getScopeAdapter(behavioralType);
		}
		else {
			return super.visitDataType(pivotElement);
		}
	}

	@Override
	public PivotScopeAdapter visitEnumeration(org.eclipse.ocl.examples.pivot.Enumeration pivotElement) {
		return EnumerationScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitExpressionInOcl(ExpressionInOcl pivotElement) {
		return ExpressionInOclScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitIfExp(IfExp pivotElement) {
		return EmptyScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitInvalidLiteralExp(InvalidLiteralExp pivotElement) {
		return EmptyScopeAdapter.INSTANCE;		// FIXME
	}

	@Override
	public PivotScopeAdapter visitInvalidType(InvalidType pivotElement) {
		return VoidTypeScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitIterateExp(IterateExp pivotElement) {
		return IterateExpScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitIteratorExp(IteratorExp pivotElement) {
		return IteratorExpScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitLetExp(LetExp pivotElement) {
		return LetExpScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitOperation(Operation pivotElement) {
		return OperationScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitOperationCallExp(OperationCallExp pivotElement) {
		return OperationCallExpScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitPackage(org.eclipse.ocl.examples.pivot.Package pivotElement) {
		if (pivotElement.eContainer() == null) {
			return RootPackageScopeAdapter.INSTANCE;
		}
		else {
			return PackageScopeAdapter.INSTANCE;
		}
	}

	@Override
	public PivotScopeAdapter visitProperty(Property pivotElement) {
		return EmptyScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitPropertyCallExp(PropertyCallExp pivotElement) {
		return EmptyScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitTemplateSignature(TemplateSignature pivotElement) {
		return EmptyScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitTypeTemplateParameter(TypeTemplateParameter pivotElement) {
		return EmptyScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitUnspecifiedType(UnspecifiedType pivotElement) {
		return ElementUtil.getScopeAdapter(pivotElement.getLowerBound());
	}

	@Override
	public PivotScopeAdapter visitVariable(Variable pivotElement) {
		return EmptyScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitVariableExp(VariableExp pivotElement) {
		return EmptyScopeAdapter.INSTANCE;
	}

	@Override
	public PivotScopeAdapter visitVoidType(VoidType pivotElement) {
		return VoidTypeScopeAdapter.INSTANCE;
	}

	public PivotScopeAdapter visiting(Visitable visitable) {
		throw new IllegalArgumentException("Unsupported " + visitable.eClass().getName() + " for PivotScopeVisitor");
	}	
}
