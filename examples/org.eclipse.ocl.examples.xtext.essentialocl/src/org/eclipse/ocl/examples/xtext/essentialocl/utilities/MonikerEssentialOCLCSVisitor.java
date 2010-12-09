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
 * $Id: MonikerEssentialOCLCSVisitor.java,v 1.1.2.2 2010/12/09 22:15:40 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.util.VisitableCS;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.ocl.examples.xtext.base.utilities.MonikerBaseCSVisitor;
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
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NamedExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NullLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NumberLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrefixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnlimitedNaturalLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingDelegatingEssentialOCLCSVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingEssentialOCLCSVisitor;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;

public class MonikerEssentialOCLCSVisitor
	extends AbstractExtendingDelegatingEssentialOCLCSVisitor<Object, CS2Moniker, BaseCSVisitor<Object, CS2Moniker>>
	implements PivotConstants
{	
	private static final Logger logger = Logger.getLogger(MonikerEssentialOCLCSVisitor.class);

	private static final class Factory implements CS2Moniker.Factory
	{
		private Factory() {
			MonikerBaseCSVisitor.FACTORY.getClass();
			CS2Moniker.addFactory(EssentialOCLCSTPackage.eINSTANCE, this);
//			roleNames.put(EssentialOCLCSTPackage.Literals.CALL_EXP__SOURCE, "src");
//			roleNames.put(EssentialOCLCSTPackage.Literals.CONSTRAINT__SPECIFICATION, "spec");
			roleNames.put(EssentialOCLCSTPackage.Literals.COLLECTION_LITERAL_PART_CS__EXPRESSION_CS, "first");
			roleNames.put(EssentialOCLCSTPackage.Literals.COLLECTION_LITERAL_PART_CS__LAST_EXPRESSION_CS, "last");
			roleNames.put(EssentialOCLCSTPackage.Literals.CONTEXT_CS__OWNED_EXPRESSION, "x");
			roleNames.put(EssentialOCLCSTPackage.Literals.EXP_CONSTRAINT_CS__OWNED_EXPRESSION, "z");
			roleNames.put(EssentialOCLCSTPackage.Literals.IF_EXP_CS__CONDITION, "q");
			roleNames.put(EssentialOCLCSTPackage.Literals.IF_EXP_CS__THEN_EXPRESSION, "t");
			roleNames.put(EssentialOCLCSTPackage.Literals.IF_EXP_CS__ELSE_EXPRESSION, "f");
			roleNames.put(EssentialOCLCSTPackage.Literals.LET_EXP_CS__IN, "i");
			roleNames.put(EssentialOCLCSTPackage.Literals.LET_EXP_CS__VARIABLE, "v");
//			roleNames.put(EssentialOCLCSTPackage.Literals.LOOP_EXP__BODY, "body");
//			roleNames.put(EssentialOCLCSTPackage.Literals.LOOP_EXP__ITERATOR, "it");
			roleNames.put(EssentialOCLCSTPackage.Literals.INFIX_EXP_CS__OWNED_EXPRESSION, "x");
			roleNames.put(EssentialOCLCSTPackage.Literals.INFIX_EXP_CS__OWNED_OPERATOR, "o");
			roleNames.put(EssentialOCLCSTPackage.Literals.PREFIX_EXP_CS__OWNED_EXPRESSION, "x");
			roleNames.put(EssentialOCLCSTPackage.Literals.PREFIX_EXP_CS__OWNED_OPERATOR, "o");
		}
		
		public BaseCSVisitor<?, ?> create(CS2Moniker context) {
			return new MonikerEssentialOCLCSVisitor(context);
		}
	}

	public static CS2Moniker.Factory FACTORY = new Factory();
	
	/**
	 * An EssentialOCLCSTreeNameVisitor provides the name of an expression tree
	 * node. This name is not unique but serves to spread the namespace within
	 * the flattened expression tree names.
	 */
	public static class EssentialOCLCSTreeNameVisitor 
	extends AbstractExtendingEssentialOCLCSVisitor<String, Object>
	{
		protected EssentialOCLCSTreeNameVisitor() {
			super(null);
		}

		@Override
		public String safeVisit(VisitableCS v) {
			try {
				if (v != null) {
					return v.accept(this);
				}
			} catch (Exception e) {
				logger.warn("Failed to cs tree-name visit " + v.getClass().getName(), e);
			}
			return null;
		}

		@Override
		public String visitBooleanLiteralExpCS(BooleanLiteralExpCS object) {
			return object.getName();
		}

		@Override
		public String visitCollectionLiteralExpCS(CollectionLiteralExpCS object) {
			return object.getOwnedType().getName();
		}

		@Override
		public String visitExpCS(ExpCS object) {
			return "";
		}

		@Override
		public String visitIfExpCS(IfExpCS object) {
			return "if";
		}

		@Override
		public String visitInfixExpCS(InfixExpCS object) {
			return "?";
		}

		@Override
		public String visitInvalidLiteralExpCS(InvalidLiteralExpCS object) {
			return "invalid";
		}

		@Override
		public String visitLetExpCS(LetExpCS object) {
			return "let";
		}

		@Override
		public String visitLetVariableCS(LetVariableCS object) {
			return object.getName();
		}

		@Override
		public String visitNameExpCS(NameExpCS object) {
			CompositeNode node = NodeUtil.getNode(object);
			return node.serialize().trim();
		}

		@Override
		public String visitNavigatingArgCS(NavigatingArgCS object) {
			return "?";
		}

		@Override
		public String visitNavigatingExpCS(NavigatingExpCS object) {
			return "?";
		}

		@Override
		public String visitNestedExpCS(NestedExpCS object) {
			return "?";
		}

		@Override
		public String visitNullLiteralExpCS(NullLiteralExpCS object) {
			return "null";
		}

		@Override
		public String visitNumberLiteralExpCS(NumberLiteralExpCS object) {
			return object.getName().toString();
		}

		@Override
		public String visitOperatorCS(OperatorCS object) {
			return object.getName();
		}		

		@Override
		public String visitPrefixExpCS(PrefixExpCS object) {
			return "?";
		}

		@Override
		public String visitSelfExpCS(SelfExpCS object) {
			return "self";
		}

		@Override
		public String visitUnlimitedNaturalLiteralExpCS(UnlimitedNaturalLiteralExpCS object) {
			return "*";
		}

		public String visiting(VisitableCS visitable) {
			logger.error("cs tree-name visting " + visitable.getClass().getName());
			return null;
		}	
	}
	
	/**
	 * An EssentialOCLCSTreeContentVisitor supervises the pre-order traversal
	 * of the contained content of an expression tree, accumulating content in
	 * a map of node name to list of same-named nodes.
	 */
	public static class EssentialOCLCSTreeContentVisitor 
	extends AbstractExtendingEssentialOCLCSVisitor<Object, Map<String, List<ModelElementCS>>>
	{
		protected final EssentialOCLCSTreeNameVisitor treeNameVisitor;
		
		protected EssentialOCLCSTreeContentVisitor(Map<String, List<ModelElementCS>> contents, EssentialOCLCSTreeNameVisitor treeNameVisitor) {
			super(contents);
			this.treeNameVisitor = treeNameVisitor;
		}

		@Override
		public Object safeVisit(VisitableCS v) {
			try {
				if (v != null) {
					return v.accept(this);
				}
			} catch (Exception e) {
				logger.warn("Failed to cs tree-content visit " + v.getClass().getName(), e);
			}
			return null;
		}

		protected void updateContext(ModelElementCS object) {
			String name = treeNameVisitor.safeVisit(object);
			if (name != null) {
				List<ModelElementCS> csList = context.get(name);
				if (csList == null) {
					csList = new ArrayList<ModelElementCS>();
					context.put(name, csList);
				}
				csList.add(object);
			}
		}

		@Override
		public Object visitCollectionLiteralExpCS(CollectionLiteralExpCS object) {
			updateContext(object);			
//			CollectionTypeCS type = object.getOwnedType();
//			for (CollectionLiteralPartCS csPart : object.getOwnedParts()) {
//				safeVisit(csPart);
//			}
			return null;
		}

/*		@Override
		public Object visitCollectionLiteralPartCS(CollectionLiteralPartCS object) {
			updateContext(object);			
			ExpCS first = object.getExpressionCS();
			if (first != null) {
				safeVisit(first);
			}
			ExpCS last = object.getExpressionCS();
			if (last != null) {
				safeVisit(last);
			}
			return null;
		} */

		@Override
		public Object visitExpCS(ExpCS object) {
			updateContext(object);			
			assert object.eContents().isEmpty();		// FIXME review
			return null;
		}

		@Override
		public Object visitIfExpCS(IfExpCS object) {
			updateContext(object);			
			safeVisit(object.getCondition());
			safeVisit(object.getThenExpression());
			safeVisit(object.getElseExpression());
			return null;
		}

		@Override
		public Object visitInfixExpCS(InfixExpCS object) {
			updateContext(object);			
			for (ExpCS csExp : object.getOwnedExpression()) {
				safeVisit(csExp);
			}
			for (OperatorCS csOperator : object.getOwnedOperator()) {
				safeVisit(csOperator);
			}
			return null;
		}

		@Override
		public Object visitLetExpCS(LetExpCS object) {
			updateContext(object);			
			for (LetVariableCS csVariable : object.getVariable()) {
				safeVisit(csVariable);
			}
			safeVisit(object.getIn());
			return null;
		}

		@Override
		public Object visitNameExpCS(NameExpCS object) {
			updateContext(object);			
			assert object.eContents().isEmpty();
			return null;
		}

		@Override
		public Object visitNavigatingArgCS(NavigatingArgCS object) {
			updateContext(object);			
			ExpCS name = object.getName();
			if (name != null) {
				safeVisit(name);
			}
//			safeVisit(object.getOwnedType());
			ExpCS init = object.getInit();
			if (init != null) {
				safeVisit(init);
			}
			return null;
		}

		@Override
		public Object visitNavigatingExpCS(NavigatingExpCS object) {
			updateContext(object);			
			NamedExpCS namedExp = object.getNamedExp();
			if (namedExp != null) {
				safeVisit(namedExp);
			}
			for (NavigatingArgCS csArg : object.getArguments()) {
				safeVisit(csArg);
			}
			return null;
		}

		@Override
		public Object visitNestedExpCS(NestedExpCS object) {
			updateContext(object);			
			ExpCS source = object.getSource();
			if (source != null) {
				safeVisit(source);
			}
			return null;
		}

		@Override
		public Object visitOperatorCS(OperatorCS object) {
			updateContext(object);			
			assert object.eContents().isEmpty();
			return null;
		}		

		@Override
		public Object visitPrefixExpCS(PrefixExpCS object) {
			updateContext(object);			
			for (OperatorCS csOperator : object.getOwnedOperator()) {
				safeVisit(csOperator);
			}
			ExpCS ownedExpression = object.getOwnedExpression();
			if (ownedExpression != null) {
				safeVisit(ownedExpression);
			}
			return null;
		}

		@Override
		public String visitSelfExpCS(SelfExpCS object) {
			updateContext(object);			
			assert object.eContents().isEmpty();
			return null;
		}

		@Override
		public Object visitTypeLiteralExpCS(TypeLiteralExpCS object) {
			updateContext(object);			
			return null;
		}

		@Override
		public Object visitVariableCS(VariableCS object) {
			updateContext(object);			
			safeVisit(object.getInitExpression());
			return null;
		}

		public Object visiting(VisitableCS visitable) {
			logger.error("cs tree-content visting " + visitable.getClass().getName());
			return null;
		}	
	}
	
	protected EssentialOCLCSTreeNameVisitor treeNameVisitor = null;

	@SuppressWarnings("unchecked")
	public MonikerEssentialOCLCSVisitor(CS2Moniker context) {
		super((BaseCSVisitor<Object, CS2Moniker>) context.getVisitor(BaseCSTPackage.eINSTANCE), context);
	}

	protected void appendExpNode(ModelElementCS object) {
		ModelElementCS csRoot = getExpTreeRoot(object);
		context.appendParentCS(csRoot, SCOPE_SEPARATOR);
		context.appendRoleCS(csRoot);
		if (!(csRoot.eContainer() instanceof ExpCS) && !(csRoot.eContainer() instanceof CollectionLiteralPartCS)) {
			context.append(SCOPE_SEPARATOR);
			context.append("x");
		}
		Map<String, List<ModelElementCS>> expTreeMap = new HashMap<String, List<ModelElementCS>>();
		getTreeContentVisitor(expTreeMap).safeVisit(csRoot);
		String name = getTreeNameVisitor().safeVisit(object);
		List<ModelElementCS> csList = expTreeMap.get(name);
		int index = (csList != null) ? csList.indexOf(object) : -1;
		if (index >= 0) {
			context.append(SCOPE_SEPARATOR);
			context.append(name);
			context.append(OPERATOR_SEPARATOR);
			context.append(index);
		}
	}

	/**
	 * Return the root node with respect to which all monikers are determined.
	 */
	protected ModelElementCS getExpTreeRoot(ModelElementCS object) {
		for (ModelElementCS eObject = object; eObject != null; eObject = (ModelElementCS) eObject.eContainer()) {
			EObject eContainer = eObject.eContainer();
			if (!(eContainer instanceof ExpCS) && !(eContainer instanceof NavigatingArgCS)) {
				return eObject;
			}
			if (eContainer instanceof IfExpCS) {
				return eObject;
			}
			if (eContainer instanceof LetExpCS) {
				return eObject;
			}
			if (eContainer instanceof LetVariableCS) {
				return eObject;
			}		
		}
		return null;
	}

	protected EssentialOCLCSTreeContentVisitor getTreeContentVisitor(Map<String, List<ModelElementCS>> map) {
		return new EssentialOCLCSTreeContentVisitor(map, getTreeNameVisitor());
	}
	
	protected EssentialOCLCSTreeNameVisitor getTreeNameVisitor() {
		if (treeNameVisitor == null) {
			treeNameVisitor = new EssentialOCLCSTreeNameVisitor();
		}
		return treeNameVisitor;
	}

	@Override
	public Object visitCollectionLiteralPartCS(CollectionLiteralPartCS object) {
		context.appendParentCS(object, "@");
		context.appendIndex(object);
		return true;
	}

	@Override
	public Object visitCollectionTypeCS(CollectionTypeCS object) {
//		Element pivot = object.getPivot();
//		if (pivot != null) { 
//			context.appendElement(pivot);
//			return true;
//		}
//		context.appendParentCS(object, SCOPE_SEPARATOR);
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
	public Object visitExpCS(ExpCS object) {
		appendExpNode(object);
		return true;
	}

	@Override
	public Object visitLetVariableCS(LetVariableCS object) {
		context.appendParentCS(object, SCOPE_SEPARATOR);
		context.append("var_");
		context.append(object.getName());
		return true;
	}

	@Override
	public Object visitNavigatingArgCS(NavigatingArgCS object) {
		appendExpNode(object);
		return true;
	}

	@Override
	public Object visitOperatorCS(OperatorCS object) {
		appendExpNode(object);
		return true;
	}

	@Override
	public String toString() {
		return context.toString();
	}
}
