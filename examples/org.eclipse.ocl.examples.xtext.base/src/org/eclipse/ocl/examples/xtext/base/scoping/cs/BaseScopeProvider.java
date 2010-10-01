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
 * $Id: BaseScopeProvider.java,v 1.1.2.1 2010/10/01 14:13:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.examples.common.utils.TracingOption;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AttributeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ConstraintCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DataTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedClassifierRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedOperationRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedPackageRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedStructuralFeatureRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCSRef;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SimpleClassifierRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SimpleOperationRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SimplePackageRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SimpleStructuralFeatureRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.util.BaseCSTSwitch;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.PivotScopeProvider;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class BaseScopeProvider extends AbstractDeclarativeScopeProvider
{
	protected static class Factory extends ModelElementCSScopeAdapter.Factory
	{
		protected Factory() {
			PivotScopeProvider.FACTORY.getClass();
			addSwitch(BaseCSTPackage.eINSTANCE, new BaseScopeSwitch());
		}
	}

	public static ModelElementCSScopeAdapter.Factory FACTORY = new Factory();
	
	public static final TracingOption LOOKUP = new TracingOption("org.eclipse.ocl.examples.xtext.base", "lookup");  //$NON-NLS-1$//$NON-NLS-2$
	
	public static class BaseScopeSwitch 
		extends BaseCSTSwitch<ScopeAdapter>
		implements ScopeAdapter.Switch
	{
		@Override
		public ScopeAdapter caseAnnotationCS(AnnotationCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseAttributeCS(AttributeCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseClassCS(ClassCS eObject) {
			return new ClassCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseConstraintCS(ConstraintCS eObject) {
			return new ConstraintCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseDataTypeCS(DataTypeCS eObject) {
			return new DataTypeCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseEnumerationCS(EnumerationCS eObject) {
			return new EnumCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseImportCS(ImportCS eObject) {
			return new ImportScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseOperationCS(OperationCS eObject) {
			return new OperationCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter casePackageCS(PackageCS eObject) {
			return new PackageCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseParameterCS(ParameterCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseQualifiedClassifierRefCS(QualifiedClassifierRefCS eObject) {
			return new QualifiedRefCSScopeAdapter<QualifiedClassifierRefCS, Type>(eObject, Type.class);
		}

		@Override
		public ScopeAdapter caseQualifiedOperationRefCS(QualifiedOperationRefCS eObject) {
			return new QualifiedRefCSScopeAdapter<QualifiedOperationRefCS, Operation>(eObject, Operation.class);
		}

		@Override
		public ScopeAdapter caseQualifiedPackageRefCS(QualifiedPackageRefCS eObject) {
			return new QualifiedRefCSScopeAdapter<QualifiedPackageRefCS, org.eclipse.ocl.examples.pivot.Package>(eObject, org.eclipse.ocl.examples.pivot.Package.class);
		}

		@Override
		public ScopeAdapter caseQualifiedStructuralFeatureRefCS(QualifiedStructuralFeatureRefCS eObject) {
			return new QualifiedRefCSScopeAdapter<QualifiedStructuralFeatureRefCS, Property>(eObject, Property.class);
		}

		@Override
		public ScopeAdapter caseQualifiedTypeRefCS(QualifiedTypeRefCS eObject) {
			return new QualifiedRefCSScopeAdapter<QualifiedTypeRefCS, Type>(eObject, Type.class);
		}

		@Override
		public ScopeAdapter caseReferenceCS(ReferenceCS eObject) {
			return new ReferenceCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseReferenceCSRef(ReferenceCSRef eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseRootPackageCS(RootPackageCS eObject) {
			return new RootPackageCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseSimpleClassifierRefCS(SimpleClassifierRefCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseSimpleOperationRefCS(SimpleOperationRefCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseSimplePackageRefCS(SimplePackageRefCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseSimpleStructuralFeatureRefCS(SimpleStructuralFeatureRefCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseTemplateBindingCS(TemplateBindingCS eObject) {
			return new TemplateBindingCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseTemplateParameterSubstitutionCS(TemplateParameterSubstitutionCS eObject) {
			return new TemplateParameterSubstitutionCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseTemplateSignatureCS(TemplateSignatureCS eObject) {
			return new TemplateSignatureCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseTypeParameterCS(TypeParameterCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseTypedTypeRefCS(TypedTypeRefCS eObject) {
//			Resource resource = eObject.eResource();
//			CS2PivotResourceAdapter adapter = CS2PivotResourceAdapter.findAdapter(resource);
//			PivotManager pivotManager = adapter.getPivotManager();
//			String string = getText(NodeUtil.getNode(eObject));
//			Type type = pivotManager.getLibraryType(string, null);
			return new TypedTypeRefCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter defaultCase(EObject eObject) {
			return new DefaultScopeAdapter((ModelElementCS) eObject);
		}

		public ScopeAdapter doInPackageSwitch(EObject eObject) {
			int classifierID = eObject.eClass().getClassifierID();
			return doSwitch(classifierID, eObject);
		}

		public String getText(AbstractNode node) {
			LeafNode leafNode = null;
			if (node instanceof LeafNode) {
				leafNode = (LeafNode) node;
			}
			else {
				for (LeafNode lNode : node.getLeafNodes()) {
					if (!lNode.isHidden()) {
						leafNode = lNode;
						break;
					}
				}
			}
			if (leafNode == null) {
				return null;
			}
			return leafNode.getText();
		}
	}

	@Override
	public ScopeView getScope(EObject context, EReference reference) {
		ScopeAdapter scopeAdapter = ElementUtil.getScopeAdapter(context);
		if (scopeAdapter == null) {
			return null;
		}
//		TypeBindingsCS bindings = BaseCSTFactory.eINSTANCE.createTypeBindingsCS();
//		DocumentScopeAdapter documentScopeAdapter = scopeAdapter.getDocumentScopeAdapter();
//		bindings.setBoundDocument(documentScopeAdapter.getBoundDocument());
//		return scopeAdapter.getOuterScopeView(reference);
//		return scopeAdapter.getInnerScopeView(reference);
		return new BaseScopeView(scopeAdapter, reference, reference);
	}
}
