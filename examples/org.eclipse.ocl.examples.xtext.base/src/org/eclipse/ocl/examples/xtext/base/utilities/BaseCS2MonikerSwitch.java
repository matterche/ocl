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
 * $Id: BaseCS2MonikerSwitch.java,v 1.1.2.1 2010/10/01 14:13:00 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.Abstract2Moniker.Switch;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AttributeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AttributeCSRef;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCSRef;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DetailCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DocumentationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationLiteralCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCSRef;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedClassifierRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedOperationRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedPackageRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedRefCS;
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
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.WildcardTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.impl.TypedTypeRefCSImpl;
import org.eclipse.ocl.examples.xtext.base.baseCST.util.BaseCSTSwitch;
import org.eclipse.ocl.examples.xtext.base.scope.RootCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ElementCSScopeAdapter;

public class BaseCS2MonikerSwitch extends BaseCSTSwitch<Object> implements CS2Moniker.Switch, PivotConstants
{	
	private static final class Factory extends CS2Moniker.Factory
	{
		private Factory() {
			CS2Moniker.addFactory(this);
		}
		
		@Override
		public Switch create(CS2Moniker moniker) {
			return new BaseCS2MonikerSwitch(moniker);
		}

		public EPackage getEPackage() {
			return BaseCSTPackage.eINSTANCE;
		}
	}

	public static CS2Moniker.Factory FACTORY = new Factory();
		
	protected final CS2Moniker moniker;
	
	public BaseCS2MonikerSwitch(CS2Moniker moniker) {
		this.moniker = moniker;			
	}

	@Override
	public Object caseAnnotationCS(AnnotationCS object) {
		moniker.appendParent(object, SCOPE_SEPARATOR);
		moniker.append(ANNOTATION_QUOTE);
		moniker.append(String.valueOf(object.getName()));
		moniker.append(ANNOTATION_QUOTE);
		return true;
	}

	@Override
	public Object caseAttributeCS(AttributeCS object) {
		return caseNamedElementCS(object);
	}

	@Override
	public Object caseAttributeCSRef(AttributeCSRef object) {
		moniker.appendElement(object.getRef());
		return true;
	}

	@Override
	public Object caseClassCSRef(ClassCSRef object) {
		moniker.appendElement(object.getRef());
		return true;
	}

	@Override
	public Object caseClassifierCS(ClassifierCS object) {
		caseNamedElementCS(object);
		moniker.appendTemplateParameters(object);
		return true;
	}

	@Override
	public Object caseDetailCS(DetailCS object) {
		moniker.appendParent(object, BINDINGS_PREFIX);
		moniker.append(object.getName());
		return true;
	}

	@Override
	public Object caseDocumentationCS(DocumentationCS object) {
		moniker.appendParent(object, "@");
		moniker.append(hashCode());
		return true;
	}

	@Override
	public Object caseEnumerationLiteralCS(EnumerationLiteralCS object) {
		caseNamedElementCS(object);
		return true;
	}

	@Override
	public Object caseModelElementCSRef(ModelElementCSRef object) {
		moniker.appendElement(object.getRef());
		return true;
	}

	@Override
	public Object caseNamedElementCS(NamedElementCS object) {
		moniker.appendParent(object, SCOPE_SEPARATOR);
		moniker.appendName(object);
		return true;
	}

	@Override
	public Object caseOperationCS(OperationCS object) {
		caseNamedElementCS(object);
		moniker.appendTemplateParameters(object);
		moniker.appendParameters(object.getOwnedIterator(), object.getOwnedParameter());
		return true;
	}

	@Override
	public Object casePackageCS(PackageCS object) {
		ScopeCSAdapter scopeAdapter = ElementUtil.getScopeCSAdapter(object);
		RootCSScopeAdapter documentScopeAdapter = scopeAdapter.getRootScopeAdapter();
		if (documentScopeAdapter != null) {
			String alias = documentScopeAdapter.getAlias(object);
			if (alias != null) {
				moniker.append(alias);
				return true;
			}
		}
		moniker.appendName(object);
		return true;
	}

	@Override
	public Object caseParameterCS(ParameterCS object) {
		return caseNamedElementCS(object);
	}

	@Override
	public Object casePrimitiveTypeRefCS(PrimitiveTypeRefCS object) {
		moniker.appendName(object);
		return true;
	}

	@Override
	public Object caseQualifiedClassifierRefCS(QualifiedClassifierRefCS object) {
		moniker.appendElement(object.getElement());
//		moniker.appendTemplateBinding(object);
		return true;
	}

	@Override
	public Object caseQualifiedOperationRefCS(QualifiedOperationRefCS object) {
		moniker.appendElement(object.getElement());
//		moniker.appendTemplateBinding(object.get);
		return true;
	}

	@Override
	public Object caseQualifiedPackageRefCS(QualifiedPackageRefCS object) {
		moniker.appendElement(object.getElement());
		return true;
	}

	@Override
	public <E extends ElementCS> Object caseQualifiedRefCS(QualifiedRefCS<E> object) {
		moniker.appendElement(object.getElement());
		return true;
	}

	@Override
	public Object caseQualifiedStructuralFeatureRefCS(QualifiedStructuralFeatureRefCS object) {
		moniker.appendElement(object.getElement());
		return true;
	}

	@Override
	public Object caseQualifiedTypeRefCS(QualifiedTypeRefCS object) {
		moniker.appendElement(object.getElement());
		moniker.appendTemplateBindings(object);
		return true;
	}

	@Override
	public Object caseReferenceCS(ReferenceCS object) {
		return caseNamedElementCS(object);
	}

	@Override
	public Object caseReferenceCSRef(ReferenceCSRef object) {
		moniker.appendElement(object.getRef());
		return true;
	}

	@Override
	public Object caseRootPackageCS(RootPackageCS object) {
		ScopeCSAdapter scopeAdapter = ElementUtil.getScopeCSAdapter(object);
		RootCSScopeAdapter documentScopeAdapter = scopeAdapter.getRootScopeAdapter();
		if (documentScopeAdapter != null) {
			String alias = documentScopeAdapter.getAlias(object);
			if (alias != null) {
				moniker.append(alias);
				return true;
			}
		}
		return caseNamedElementCS(object);
	}

	@Override
	public Object caseSimpleClassifierRefCS(SimpleClassifierRefCS object) {
		moniker.appendElement(object.getClassifier());
		return true;
	}

	@Override
	public Object caseSimpleOperationRefCS(SimpleOperationRefCS object) {
		moniker.appendElement(object.getOperation());
		return true;
	}

	@Override
	public Object caseSimplePackageRefCS(SimplePackageRefCS object) {
		moniker.appendElement(object.getPackage());
		return true;
	}

	@Override
	public Object caseSimpleStructuralFeatureRefCS(SimpleStructuralFeatureRefCS object) {
		moniker.appendElement(object.getFeature());
		return true;
	}

	@Override
	public Object caseTemplateBindingCS(TemplateBindingCS object) {
		moniker.appendElement(object.getOwningTemplateBindableElement());
		moniker.append(BINDINGS_PREFIX);
		return true;
	}

	@Override
	public Object caseTemplateParameterSubstitutionCS(TemplateParameterSubstitutionCS object) {
		moniker.appendElement(object.getOwningTemplateBinding());
		TemplateParameter formalTemplateParameter = ElementUtil.getFormalTemplateParameter(object);	
		moniker.append(formalTemplateParameter.getParameteredElement().getMoniker());
		return true;
	}

	@Override
	public Object caseTemplateSignatureCS(TemplateSignatureCS object) {
		moniker.appendParent(object, SCOPE_SEPARATOR);
		return true;
	}

	@Override
	public Object caseTypeParameterCS(TypeParameterCS object) {
//		if (moniker.toString().length() <= 0) {
		if (!moniker.hasEmitted(object)) {
			if (moniker.toString().length() < 100) {
				moniker.appendParent(object.getOwningTemplateSignature(), SCOPE_SEPARATOR);
			}
			else {
				moniker.append(OVERFLOW_MARKER);
			}
		}
		moniker.appendName(object);
		return true;
	}

	@Override
	public Object caseTypedTypeRefCS(TypedTypeRefCS object) {
		int oldBindings = moniker.pushBindings(object);
		try {
			Type type = ((TypedTypeRefCSImpl)object).basicGetType();
			if (type.eIsProxy()) {	// Operation Template Parameters are cyclically unresolveable
				String text = ElementCSScopeAdapter.getText(object);
				TemplateParameterCS csTemplateParameter = moniker.getTemplateParameter(text);
				if (csTemplateParameter != null) {
					moniker.appendElement(csTemplateParameter);
					return true;
				}
			}
			type = object.getType();
//			if (type.eIsProxy()) {	// FIXME Just testing
//				type = object.getType();
//			}
			moniker.append(type.getMoniker());
		} catch (Exception e) {
			moniker.append(e.getMessage());
		} finally {
			moniker.popBindings(oldBindings);
		}
		return true;
	}

	@Override
	public Object caseWildcardTypeRefCS(WildcardTypeRefCS object) {
		moniker.append(WILDCARD_INDICATOR);
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
	public Object doSwitch(EObject theEObject) {
		EClass eClass = theEObject.eClass();
		return doSwitch(eClass, theEObject);
	}
/*	public String getText(EObject eObject) {
		CompositeNode node = NodeUtil.getNode(eObject);
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
//		EObject grammarElement = leafNode.getGrammarElement();
//		String ruleName = getLinkingHelper().getRuleNameFrom(grammarElement);
//		return (String) valueConverterService.toValue(leafNode.getText(), ruleName, leafNode);
	} */

	@Override
	public String toString() {
		return moniker.toString();
	}	
}
