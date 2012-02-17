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
 * $Id: BaseScopeVisitor.java,v 1.7 2011/05/20 15:27:24 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AttributeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ConstraintCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DataTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LambdaTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LibraryCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TuplePartCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TupleTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.CSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ClassCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ConstraintCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.DataTypeCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.EmptyCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.EnumCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ImportScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.LambdaTypeCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.LibraryScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementRefCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.OperationCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.PackageCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.PathNameCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ReferenceCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.RootPackageCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.SimpleNamedElementRefScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.TemplateParameterSubstitutionCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.TemplateSignatureCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.TupleTypeCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.TypedTypeRefCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.util.AbstractExtendingBaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.util.VisitableCS;

public class BaseScopeVisitor extends AbstractExtendingBaseCSVisitor<CSScopeAdapter, Object>
{
	public BaseScopeVisitor() {
		super(null);
	}
	
	@Override
	public CSScopeAdapter visitAnnotationCS(AnnotationCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitAttributeCS(AttributeCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitClassCS(ClassCS eObject) {
		return ClassCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitConstraintCS(ConstraintCS eObject) {
		return ConstraintCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitDataTypeCS(DataTypeCS eObject) {
		return DataTypeCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitEnumerationCS(EnumerationCS eObject) {
		return EnumCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitImportCS(ImportCS eObject) {
		return new ImportScopeAdapter();		// WIP static instance
	}

	@Override
	public CSScopeAdapter visitLambdaTypeCS(LambdaTypeCS eObject) {
		return LambdaTypeCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitLibraryCS(LibraryCS eObject) {
		return new LibraryScopeAdapter();		// WIP static instance
	}

	@Override
	public CSScopeAdapter visitModelElementRefCS(ModelElementRefCS eObject) {
		return ModelElementRefCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitOperationCS(OperationCS eObject) {
		return OperationCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitPackageCS(PackageCS eObject) {
		return PackageCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitParameterCS(ParameterCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitReferenceCS(ReferenceCS eObject) {
		return ReferenceCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitRootPackageCS(RootPackageCS eObject) {
		return RootPackageCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitPathNameCS(PathNameCS eObject) {
		return PathNameCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitSimpleNamedElementRefCS(SimpleNamedElementRefCS eObject) {
		return SimpleNamedElementRefScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTemplateBindingCS(TemplateBindingCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTemplateParameterSubstitutionCS(TemplateParameterSubstitutionCS eObject) {
		return TemplateParameterSubstitutionCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTemplateSignatureCS(TemplateSignatureCS eObject) {
		return TemplateSignatureCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTuplePartCS(TuplePartCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTupleTypeCS(TupleTypeCS eObject) {
		return TupleTypeCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTypeParameterCS(TypeParameterCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTypedTypeRefCS(TypedTypeRefCS eObject) {
		return TypedTypeRefCSScopeAdapter.INSTANCE;
	}

	public CSScopeAdapter visiting(VisitableCS visitable) {
		throw new IllegalArgumentException("Unsupported " + visitable.eClass().getName() + " for ScopeVisitor");
	}
}