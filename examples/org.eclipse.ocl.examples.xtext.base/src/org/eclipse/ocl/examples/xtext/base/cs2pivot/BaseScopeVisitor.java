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
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TuplePartCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TupleTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
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
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ReferenceCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.RootPackageCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.TemplateParameterSubstitutionCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.TemplateSignatureCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.TupleTypeCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.TypedTypeRefCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.util.AbstractExtendingBaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.util.VisitableCS;

public class BaseScopeVisitor extends AbstractExtendingBaseCSVisitor<ScopeCSAdapter, Object>
{
	public BaseScopeVisitor() {
		super(null);
	}
	
	@Override
	public ScopeCSAdapter visitAnnotationCS(AnnotationCS eObject) {
		return new EmptyCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitAttributeCS(AttributeCS eObject) {
		return new EmptyCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitClassCS(ClassCS eObject) {
		return new ClassCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitConstraintCS(ConstraintCS eObject) {
		return new ConstraintCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitDataTypeCS(DataTypeCS eObject) {
		return new DataTypeCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitEnumerationCS(EnumerationCS eObject) {
		return new EnumCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitImportCS(ImportCS eObject) {
		return new ImportScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitLambdaTypeCS(LambdaTypeCS eObject) {
		return new LambdaTypeCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitLibraryCS(LibraryCS eObject) {
		return new LibraryScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitModelElementRefCS(ModelElementRefCS eObject) {
		return new ModelElementRefCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitOperationCS(OperationCS eObject) {
		return new OperationCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitPackageCS(PackageCS eObject) {
		return new PackageCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitParameterCS(ParameterCS eObject) {
		return new EmptyCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitReferenceCS(ReferenceCS eObject) {
		return new ReferenceCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitRootPackageCS(RootPackageCS eObject) {
		return new RootPackageCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitTemplateBindingCS(TemplateBindingCS eObject) {
		return new EmptyCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitTemplateParameterSubstitutionCS(TemplateParameterSubstitutionCS eObject) {
		return new TemplateParameterSubstitutionCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitTemplateSignatureCS(TemplateSignatureCS eObject) {
		return new TemplateSignatureCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitTuplePartCS(TuplePartCS eObject) {
		return new EmptyCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitTupleTypeCS(TupleTypeCS eObject) {
		return new TupleTypeCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitTypeParameterCS(TypeParameterCS eObject) {
		return new EmptyCSScopeAdapter(eObject);
	}

	@Override
	public ScopeCSAdapter visitTypedTypeRefCS(TypedTypeRefCS eObject) {
		return new TypedTypeRefCSScopeAdapter(eObject);
	}

	public ScopeCSAdapter visiting(VisitableCS visitable) {
		throw new IllegalArgumentException("Unsupported " + visitable.eClass().getName() + " for ScopeVisitor");
	}
}