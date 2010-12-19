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
 * $Id: EssentialOCLCS2MonikerVisitor.java,v 1.1.2.1 2010/12/19 18:33:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.utilities;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCS2MonikerVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BooleanLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvalidLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetVariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgOrBodyCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingAccCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NullLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NumberLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrefixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnlimitedNaturalLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingDelegatingEssentialOCLCSVisitor;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;

public class EssentialOCLCS2MonikerVisitor
	extends AbstractExtendingDelegatingEssentialOCLCSVisitor<Object, CS2Moniker, BaseCSVisitor<Object, CS2Moniker>>
	implements PivotConstants {

	private static final class Factory implements CS2Moniker.Factory
	{
		private Factory() {
			BaseCS2MonikerVisitor.FACTORY.getClass();
			CS2Moniker.addFactory(EssentialOCLCSTPackage.eINSTANCE, this);
			roleNames.put(EssentialOCLCSTPackage.Literals.COLLECTION_LITERAL_PART_CS__EXPRESSION_CS, "first");
			roleNames.put(EssentialOCLCSTPackage.Literals.COLLECTION_LITERAL_PART_CS__LAST_EXPRESSION_CS, "last");
			roleNames.put(EssentialOCLCSTPackage.Literals.EXP_CONSTRAINT_CS__OWNED_EXPRESSION, "specification|ownedExpression");
			roleNames.put(EssentialOCLCSTPackage.Literals.INFIX_EXP_CS__OWNED_EXPRESSION, "source");
//			roleNames.put(EssentialOCLCSTPackage.Literals.NAVIGATING_EXP_CS__ARGUMENT, "argument");
		}

		public BaseCSVisitor<?, ?> create(CS2Moniker context) {
			return new EssentialOCLCS2MonikerVisitor(context);
		}
	}

	public static CS2Moniker.Factory FACTORY = new Factory();

	@SuppressWarnings("unchecked")
	public EssentialOCLCS2MonikerVisitor(CS2Moniker context) {
		super((BaseCSVisitor<Object, CS2Moniker>) context.getVisitor(BaseCSTPackage.eINSTANCE), context);
	}

	protected void appendExpPrefix(ElementCS object) {
		ElementCS child = getChildCS(object);
		MonikeredElementCS parent = getParentCS(child);
		EReference feature = getParentChildFeature(object);
		assert feature.getEContainingClass().isInstance(parent);
		assert feature.getEReferenceType().isInstance(child);
		context.append(getPivotedCS(parent).getMoniker());
		context.append(MONIKER_SCOPE_SEPARATOR);
		if (feature == EssentialOCLCSTPackage.Literals.LET_EXP_CS__IN) {
			int iMax = ((LetExpCS) parent).getVariable().size();
			for (int i = 1; i < iMax; i++) {
				context.append(EssentialOCLCSTPackage.Literals.LET_EXP_CS__IN.getName());
				context.append(MONIKER_OPERATOR_SEPARATOR);
				context.append(MONIKER_LET_EXP);
				context.append(MONIKER_SCOPE_SEPARATOR);
			}
		}
		int index = 0;
		if (feature.isMany()) {
			index = ((List<?>)parent.eGet(feature)).indexOf(child);
			if (feature == EssentialOCLCSTPackage.Literals.NAVIGATING_EXP_CS__ARGUMENT) {
				NavigatingExpCS csNavigatingExp = (NavigatingExpCS)parent;
				int argsOrBodies = 0;
				int accs = 0;
				int bodies = 0;
				for (NavigatingArgCS csNavigatingArg : csNavigatingExp.getArgument()) {
					if (csNavigatingArg instanceof NavigatingArgOrBodyCS) {
						argsOrBodies++;
					}
					else if (csNavigatingArg instanceof NavigatingAccCS) {
						accs++;
					}
					else {
						bodies++;
					}
				}
				if ((accs + bodies) > 0) {
					index -= argsOrBodies + accs;
				}
				if (index < 0) {
					index += accs;
					if (index >= 0) {
						feature = PivotPackage.Literals.ITERATE_EXP__RESULT;
					}
					else {
						index += argsOrBodies;
						feature = PivotPackage.Literals.LOOP_EXP__ITERATOR;
					}
				}
			}
		}
		context.appendRoleCS(feature);
		if (index != 0) {
			assert index > 0;
			context.append(index);
		}
		context.append(MONIKER_OPERATOR_SEPARATOR);
	}

	/**
	 * Return the CS element from the CS elements associated with the
	 * same pivot element as csElement, whose child-parent relationship
	 * corresponds to the child-parent relationship of the pivot element.
	 * 
	 * @param csElement for which the child counterpart is required
	 * @return the child counterpart
	 */
	protected ElementCS getChildCS(ElementCS csElement) {
		if (csElement instanceof ExpCS) {
			OperatorCS operator = ((ExpCS) csElement).getParent();
			if (operator != null) {
				return csElement;
			}
		}
		EObject csParent = csElement.eContainer();
		if (csParent instanceof InfixExpCS) {
			return getChildCS((InfixExpCS) csParent);
		}
		else if (csParent instanceof NavigatingArgCS) {
			return getChildCS((NavigatingArgCS) csParent);
		}
		else if (csParent instanceof NavigatingExpCS) {
			NavigatingExpCS csNavigatingExp = (NavigatingExpCS)csParent;
			if (csElement == csNavigatingExp.getNamedExp()) {
				return getChildCS(csNavigatingExp.getParent());
			}
			else {
				return csElement;
			}
		}
		else if (csParent instanceof NestedExpCS) {
			return getChildCS((NestedExpCS) csParent);
		}
		else if (csParent instanceof PrefixExpCS) {
			return getChildCS((PrefixExpCS) csParent);
		}
		else {
			return csElement;
		}
	}

	// FIXME Simplify since csElement is the immediate child
	protected MonikeredElementCS getParentCS(EObject csElement) {
		if (csElement instanceof ExpCS) {
			OperatorCS operator = ((ExpCS) csElement).getParent();
			if (operator != null) {
				return operator;
			}
		}
		EObject csParent = csElement.eContainer();
		if (csParent instanceof InfixExpCS) {
			return getParentCS(csParent);
		}
		else if (csParent instanceof NavigatingArgCS) {
			return getParentCS(csParent);
		}
		else if (csParent instanceof NavigatingExpCS) {
			NavigatingExpCS csNavigatingExp = (NavigatingExpCS)csParent;
			if (csElement == csNavigatingExp.getNamedExp()) {
				return getParentCS(csNavigatingExp.getParent());
			}
			else {
				return (MonikeredElementCS) csParent;
//				return getParent(csNavigatingExp);
			}
		}
		else if (csParent instanceof NestedExpCS) {
			return getParentCS(csParent);
		}
		else if (csParent instanceof PrefixExpCS) {
			return getParentCS(csParent);
		}
		else if (csParent instanceof MonikeredElementCS) {
			return (MonikeredElementCS) csParent;
		}
		else {
			return null;
		}
	}

	// FIXME Simplify since csElement is the immediate child
	protected EReference getParentChildFeature(ElementCS csElement) {
		if (csElement instanceof ExpCS) {
			OperatorCS operator = ((ExpCS) csElement).getParent();
			if (operator != null) {
				if (operator.getSource() == csElement) {
					return EssentialOCLCSTPackage.Literals.OPERATOR_CS__SOURCE;
				}
				else {
					return EssentialOCLCSTPackage.Literals.BINARY_OPERATOR_CS__ARGUMENT;
				}
			}
		}
		EObject csParent = csElement.eContainer();
		if (csParent instanceof InfixExpCS) {
			return getParentChildFeature((InfixExpCS) csParent);
		}
		else if (csParent instanceof NavigatingArgCS) {
//			return EssentialOCLCSTPackage.Literals.NAVIGATING_EXP_CS__ARGS; //getParentChildFeature((NavigatingArgCS) csParent);
			return getParentChildFeature((NavigatingArgCS) csParent);
		}
		else if (csParent instanceof NavigatingExpCS) {
			NavigatingExpCS csNavigatingExp = (NavigatingExpCS)csParent;
			if (csElement == csNavigatingExp.getNamedExp()) {
				return getParentChildFeature(csNavigatingExp.getParent());
			}
			else {
				return EssentialOCLCSTPackage.Literals.NAVIGATING_EXP_CS__ARGUMENT;
			}
		}
		else if (csParent instanceof NestedExpCS) {
			return getParentChildFeature((NestedExpCS) csParent);
		}
		else if (csParent instanceof PrefixExpCS) {
			return getParentChildFeature((PrefixExpCS) csParent);
		}
		else {
			return (EReference) csElement.eContainingFeature();
		}
	}

	/**
	 * Return the element associated with csElement for which there is a
	 * pivot element with an identical moniker.
	 * @param csElement
	 * @return the csElement with a matching pivot element
	 */
	protected MonikeredElementCS getPivotedCS(EObject csElement) {
		if (csElement instanceof InfixExpCS) {
			return getPivotedCS(((InfixExpCS)csElement).getOwnedOperator().get(0));
		}
		else if (csElement instanceof NavigatingArgCS) {
			return getPivotedCS(((NavigatingArgCS)csElement).getName());
		}
		else if (csElement instanceof NavigatingExpCS) {
			return getPivotedCS(((NavigatingExpCS)csElement).getNamedExp());
		}
		else if (csElement instanceof NavigationOperatorCS) {
			return getPivotedCS(((NavigationOperatorCS)csElement).getArgument());
		}
		else if (csElement instanceof NestedExpCS) {
			return getPivotedCS(((NestedExpCS)csElement).getSource());
		}
		else if (csElement instanceof PrefixExpCS) {
			return getPivotedCS(((PrefixExpCS)csElement).getOwnedOperator().get(0));
		}
		else if (csElement instanceof MonikeredElementCS) {
			return (MonikeredElementCS) csElement;
		}
		else {
			return null;
		}
	}

	@Override
	public String toString() {
		return context.toString();
	}

	@Override
	public Object visitBooleanLiteralExpCS(BooleanLiteralExpCS object) {
		appendExpPrefix(object);
		context.append(object.getName());
		return true;
	}

	@Override
	public Object visitCollectionLiteralExpCS(CollectionLiteralExpCS object) {
		appendExpPrefix(object);
		context.appendNameCS(object.getOwnedType());
		return true;
	}

	@Override
	public Object visitCollectionLiteralPartCS(CollectionLiteralPartCS object) {
		context.appendParentCS(object, MONIKER_PART_SEPARATOR);
		context.appendIndex(object);
		return true;
	}

	@Override
	public Object visitCollectionTypeCS(CollectionTypeCS object) {
		// Element pivot = object.getPivot();
		// if (pivot != null) {
		// context.appendElement(pivot);
		// return true;
		// }
		// context.appendParentCS(object, SCOPE_SEPARATOR);
		context.appendNameCS(object);
		TypeRefCS type = object.getOwnedType();
		if (type != null) {
			context.append(TEMPLATE_BINDING_PREFIX);
			context.appendElementCS(type);
			context.append(TEMPLATE_BINDING_SUFFIX);
		}
		return true;
	}

	@Override
	public Object visitContextCS(ContextCS object) {
		context.appendNameCS(object);
		return true;
	}

	@Override
	public Object visitIfExpCS(IfExpCS object) {
		appendExpPrefix(object);
		context.append(MONIKER_IF_EXP);
		return true;
	}

	@Override
	public Object visitInfixExpCS(InfixExpCS object) {
		appendExpPrefix(object);
		context.append("infix");
		return true;
	}

	@Override
	public Object visitInvalidLiteralExpCS(InvalidLiteralExpCS object) {
		appendExpPrefix(object);
		context.append(MONIKER_INVALID_LITERAL_EXP);
		return true;
	}

	@Override
	public Object visitLetExpCS(LetExpCS object) {
		appendExpPrefix(object);
		context.append(MONIKER_LET_EXP);
		return true;
	}

	@Override
	public Object visitLetVariableCS(LetVariableCS object) {
		context.appendParentCS(object, MONIKER_SCOPE_SEPARATOR);
		LetExpCS csLetExp = object.getLetExpression();
		for (LetVariableCS csVariable : csLetExp.getVariable()) {
			if (csVariable == object) {
				break;
			}
			context.append(EssentialOCLCSTPackage.Literals.LET_EXP_CS__IN.getName());
			context.append(MONIKER_OPERATOR_SEPARATOR);
			context.append(MONIKER_LET_EXP);
			context.append(MONIKER_SCOPE_SEPARATOR);
		}
//		context.append(MONIKER_LET_VARIABLE_PREFIX);
		context.append("variable");
		context.append(MONIKER_OPERATOR_SEPARATOR);
		context.appendNameCS(object);
		return true;
	}

	@Override
	public Object visitNameExpCS(NameExpCS object) {
		appendExpPrefix(object);
		CompositeNode node = NodeUtil.getNode(object);
		context.append(node.serialize().trim());
		return true;
	}

	@Override
	public Object visitNavigatingArgCS(NavigatingArgCS object) {
		appendExpPrefix(object);
		context.append("navarg");		
		return true;
	}

	@Override
	public Object visitNavigatingExpCS(NavigatingExpCS object) {
		appendExpPrefix(object);
		context.append("navexp");
		return true;
	}

	@Override
	public Object visitNavigationOperatorCS(NavigationOperatorCS object) {
		appendExpPrefix(object);
		context.append("navop");		
		return true;
	}

	@Override
	public Object visitNestedExpCS(NestedExpCS object) {
		appendExpPrefix(object);
		context.append("nested");		
		return true;
	}

	@Override
	public Object visitNullLiteralExpCS(NullLiteralExpCS object) {
		appendExpPrefix(object);
		context.append(MONIKER_NULL_LITERAL_EXP);
		return true;
	}

	@Override
	public Object visitNumberLiteralExpCS(NumberLiteralExpCS object) {
		appendExpPrefix(object);
		context.append(object.getName().toString());
		return true;
	}

	@Override
	public Object visitOperatorCS(OperatorCS object) {
		appendExpPrefix(object);
		context.appendNameCS(object);
		return true;
	}

	@Override
	public Object visitPrefixExpCS(PrefixExpCS object) {
		appendExpPrefix(object);
		context.append("prefix");
		return true;
	}

	@Override
	public Object visitSelfExpCS(SelfExpCS object) {
		appendExpPrefix(object);
		context.append("self");
		return true;
	}

	@Override
	public Object visitStringLiteralExpCS(StringLiteralExpCS object) {
		appendExpPrefix(object);
		context.append(MONIKER_STRING_LITERAL_EXP);
		return true;
	}

	@Override
	public Object visitTypeLiteralExpCS(TypeLiteralExpCS object) {
		appendExpPrefix(object);
		context.append(MONIKER_TYPE_LITERAL_EXP);
		return true;
	}

	@Override
	public Object visitTypeNameExpCS(TypeNameExpCS object) {
		context.append(((MonikeredElement) object.getPivot()).getMoniker());
		return true;
	}

	@Override
	public Object visitUnlimitedNaturalLiteralExpCS(UnlimitedNaturalLiteralExpCS object) {
		appendExpPrefix(object);
		context.append(MONIKER_UNLIMITED_NATURAL_LITERAL_EXP);
		return true;
	}
}
