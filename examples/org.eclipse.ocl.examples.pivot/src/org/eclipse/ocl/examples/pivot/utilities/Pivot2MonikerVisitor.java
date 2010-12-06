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
 * $Id: Pivot2MonikerVisitor.java,v 1.1.2.1 2010/12/06 17:20:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralPart;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.TupleLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;

public class Pivot2MonikerVisitor extends AbstractExtendingVisitor<Object, Abstract2Moniker> implements PivotConstants
{	
	private static final Logger logger = Logger.getLogger(Pivot2MonikerVisitor.class);

	private static boolean initialized = false;
	
	private static void initialize() {
		initialized = true;
		roleNames.put(PivotPackage.Literals.CALL_EXP__SOURCE, "s");
		roleNames.put(PivotPackage.Literals.CONSTRAINT__SPECIFICATION, "z");
		roleNames.put(PivotPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION, "x");
		roleNames.put(PivotPackage.Literals.IF_EXP__CONDITION, "q");
		roleNames.put(PivotPackage.Literals.IF_EXP__THEN_EXPRESSION, "t");
		roleNames.put(PivotPackage.Literals.IF_EXP__ELSE_EXPRESSION, "f");
		roleNames.put(PivotPackage.Literals.LET_EXP__IN, "i");
		roleNames.put(PivotPackage.Literals.LET_EXP__VARIABLE, "v");
		roleNames.put(PivotPackage.Literals.LOOP_EXP__BODY, "b");
		roleNames.put(PivotPackage.Literals.LOOP_EXP__ITERATOR, "i");
		roleNames.put(PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT, "a");
		roleNames.put(PivotPackage.Literals.VARIABLE__INIT_EXPRESSION, "i");
	}
	/**
	 * An EssentialOCLTreeContentVisitor supervises the pre-order traversal
	 * of the contained content of an expression tree, accumulating content in
	 * a map of node name to list of same-named nodes.
	 */
	public static class EssentialOCLTreeContentVisitor 
	extends AbstractExtendingVisitor<Object, Map<String, List<MonikeredElement>>>
	{
		protected final EssentialOCLTreeNameVisitor treeNameVisitor;

		@Override
		public Object safeVisit(Visitable v) {
			try {
				if (v != null) {
					return v.accept(this);
				}
			} catch (Exception e) {
				logger.warn("Failed to pivot tree-content visit " + v.getClass().getName(), e);
			}
			return null;
		}
		
		protected EssentialOCLTreeContentVisitor(Map<String, List<MonikeredElement>> contents, EssentialOCLTreeNameVisitor treeNameVisitor) {
			super(contents);
			this.treeNameVisitor = treeNameVisitor;
		}

		protected void updateContext(MonikeredElement object) {
			String name = treeNameVisitor.safeVisit(object);
			if (name != null) {
				List<MonikeredElement> csList = context.get(name);
				if (csList == null) {
					csList = new ArrayList<MonikeredElement>();
					context.put(name, csList);
				}
				csList.add(object);
			}
		}

		@Override
		public Object visitCollectionLiteralExp(CollectionLiteralExp object) {
			updateContext(object);			
			return null;
		}

		@Override
		public Object visitIfExp(IfExp object) {
			updateContext(object);			
			return null;
		}

		@Override
		public Object visitLetExp(LetExp object) {
			updateContext(object);			
			return null;
		}

		@Override
		public Object visitOclExpression(OclExpression object) {
			updateContext(object);			
			assert object.eContents().isEmpty();		// FIXME review
			return null;
		}

		@Override
		public Object visitOperationCallExp(OperationCallExp object) {
			updateContext(object);
			OclExpression source = object.getSource();
			if (source != null) {
				safeVisit(source);
			}
			for (OclExpression argument : object.getArguments()) {
				safeVisit(argument);
			}
			return null;
		}

		@Override
		public Object visitTupleLiteralExp(TupleLiteralExp object) {
			updateContext(object);			
			return null;
		}

		@Override
		public String visitVariableExp(VariableExp object) {
			updateContext(object);			
			assert object.eContents().isEmpty();
			return null;
		}

		public Object visiting(Visitable visitable) {
			logger.error("pivot tree-content visting " + visitable.getClass().getName());
			return null;
		}	
	}

	/**
	 * An EssentialOCLTreeNameVisitor provides the name of an expression tree
	 * node. This name is not unique but serves to spread the namespace within
	 * the flattened expression tree names.
	 */
	public static class EssentialOCLTreeNameVisitor 
	extends AbstractExtendingVisitor<String, Object>
	{
		protected EssentialOCLTreeNameVisitor() {
			super(null);
		}

		@Override
		public String safeVisit(Visitable v) {
			try {
				if (v != null) {
					return v.accept(this);
				}
			} catch (Exception e) {
				logger.warn("Failed to pivot tree-name visit " + v.getClass().getName(), e);
			}
			return null;
		}

		@Override
		public String visitBooleanLiteralExp(BooleanLiteralExp object) {
	    	boolean value = object.isBooleanSymbol();
			return Boolean.toString(value);
		}

//		@Override
//		public String visitExpCS(ExpCS object) {
//			return "";
//		}

//		@Override
//		public String visitInfixExpCS(InfixExpCS object) {
//			return "?";
//		}

		@Override
		public String visitCollectionLiteralExp(CollectionLiteralExp object) {
			return object.getType().getName();
		}

		@Override
		public String visitEnumerationLiteral(EnumerationLiteral object) {
			return object.getEnumeration().getName();
		}

		@Override
		public String visitIntegerLiteralExp(IntegerLiteralExp object) {
			return object.getIntegerSymbol().toString();
		}

		@Override
		public String visitInvalidLiteralExp(InvalidLiteralExp object) {
			return "invalid";
		}

		@Override
		public String visitNullLiteralExp(NullLiteralExp object) {
			return "null";
		}

		@Override
		public String visitOperationCallExp(OperationCallExp object) {
			return object.getReferredOperation().getName();
		}

		@Override
		public String visitRealLiteralExp(RealLiteralExp object) {
			return object.getRealSymbol().toString();
		}

		@Override
		public String visitStringLiteralExp(StringLiteralExp object) {
			return "string";
		}

		@Override
		public String visitTupleLiteralExp(TupleLiteralExp object) {
			return "tuple";
		}

		@Override
		public String visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp object) {
			return object.getSymbol().toString();
		}

		@Override
		public String visitVariableExp(VariableExp object) {
			return object.getReferredVariable().getName();
		}

		public String visiting(Visitable visitable) {
			logger.error("pivot tree-name visting " + visitable.getClass().getName());
			return null;
		}	
	}
		
	protected EssentialOCLTreeNameVisitor treeNameVisitor = null;
	
	public Pivot2MonikerVisitor(Abstract2Moniker context) {
		super(context);
		if (!initialized) {
			initialize();
		}
	}

	/**
	 * Return the root node with respect to which all monikers are determined.
	 */
	protected OclExpression getExpTreeRoot(OclExpression object) {
		for (OclExpression eObject = object; eObject != null; eObject = (OclExpression) eObject.eContainer()) {
			EObject eContainer = eObject.eContainer();
			if (!(eContainer instanceof OclExpression)) {
				return eObject;
			}
			if (eContainer instanceof IfExp) {
				return eObject;
			}
			if (eContainer instanceof LetExp) {
				return eObject;
			}
		}
		return null;
	}

	protected EssentialOCLTreeContentVisitor getTreeContentVisitor(Map<String, List<MonikeredElement>> map) {
		return new EssentialOCLTreeContentVisitor(map, getTreeNameVisitor());
	}
	
	protected EssentialOCLTreeNameVisitor getTreeNameVisitor() {
		if (treeNameVisitor == null) {
			treeNameVisitor = new EssentialOCLTreeNameVisitor();
		}
		return treeNameVisitor;
	}

	@Override
	public String toString() {
		return context.toString();
	}

	@Override
	public Object visitAnnotation(Annotation object) {
		context.appendParent(object, SCOPE_SEPARATOR);
		context.append(ANNOTATION_QUOTE);
		context.append(String.valueOf(object.getName()));
		context.append(ANNOTATION_QUOTE);
		return true;
	}

	@Override
	public Object visitClass(org.eclipse.ocl.examples.pivot.Class object) {
		TemplateParameter owningTemplateParameter = object.getOwningTemplateParameter();
		if (owningTemplateParameter != null) {			
			TemplateableElement owningTemplateElement = owningTemplateParameter.getSignature().getTemplate();
			if (!context.hasEmitted(owningTemplateParameter)/* || !context.isTemplateParameter(owningTemplateParameter)*/) {
				context.appendElement(owningTemplateElement);
				context.append(TEMPLATE_PARAMETER_PREFIX);
			}
			context.appendName(object);
		}
		else if (!object.getTemplateBindings().isEmpty()) {
			org.eclipse.ocl.examples.pivot.Class templateableClass = PivotUtils.getTemplateableClass(object);
			context.appendParent(templateableClass, SCOPE_SEPARATOR);
//			context.append(((MonikeredElement) templateableClass.eContainer()).getMoniker());
//			context.append(SCOPE_SEPARATOR);
			context.appendName(templateableClass);
			context.appendTemplateBindings(object);
		}
		else {
			context.appendParent(object, SCOPE_SEPARATOR);
			context.appendName(object);
			context.appendTemplateParameters(object);
		}
		return true;
	}

	@Override
	public Object visitCollectionLiteralPart(CollectionLiteralPart object) {
		context.appendParent(object, "@");
		context.appendIndex(object);
		return true;
	}

	@Override
	public Object visitConstraint(Constraint object) {
		context.appendParent(object, SCOPE_SEPARATOR);
		context.append(object.getStereotype());
		context.append(OPERATOR_SEPARATOR);
		String name = object.getName();
		if (name != null) {
			context.append(name);
		}
		return true;
	}

	@Override
	public Object visitDetail(Detail object) {
		context.appendParent(object, BINDINGS_PREFIX);
		context.append(object.getName());
		return true;
	}

	@Override
	public Object visitExpressionInOcl(ExpressionInOcl object) {
		context.appendParent(object, SCOPE_SEPARATOR);
		context.appendRole(object);
		return true;
	}

	@Override
	public Object visitNamedElement(NamedElement object) {
		context.appendParent(object, SCOPE_SEPARATOR);
		context.appendName(object);
		return true;
	}

	@Override
	public Object visitOclExpression(OclExpression object) {
		OclExpression expRoot = getExpTreeRoot(object);
		context.appendParent(expRoot, SCOPE_SEPARATOR);
		context.appendRole(expRoot);
		Map<String, List<MonikeredElement>> expTreeMap = new HashMap<String, List<MonikeredElement>>();
		getTreeContentVisitor(expTreeMap).safeVisit(expRoot);
		String name = getTreeNameVisitor().safeVisit(object);
		List<MonikeredElement> csList = expTreeMap.get(name);
		int index = (csList != null) ? csList.indexOf(object) : -1;
		if (index >= 0) {
			context.append(SCOPE_SEPARATOR);
			context.append(name);
			context.append(OPERATOR_SEPARATOR);
			context.append(index);
		}
		return true;
	}

/*	@Override
	public Object visitOperationCallExp(OperationCallExp object) {
		OperationCallExp root = getOperationCallExpTreeRoot(object);
		List<OperationCallExp> nodes = getOperationCallExpTree(root, new ArrayList<OperationCallExp>());
		context.appendParent(root, SCOPE_SEPARATOR);
		context.append('o');
		context.append(getOperationCallExpIndex(object, nodes));
		context.append(OPERATOR_SEPARATOR);
		context.appendName(object);
		return true;
	}

	private int getOperationCallExpIndex(OperationCallExp object, List<OperationCallExp> nodes) {
		String name = object.getName();
		int index = 0;
		for (OperationCallExp node : nodes) {
			if (node == object) {
				return index;
			}
			if (name.equals(node.getName())) {
				index++;
			}
		}
		return -1;
	}

	private List<OperationCallExp> getOperationCallExpTree(OperationCallExp node, List<OperationCallExp> nodes) {
		Operation referredOperation = node.getReferredOperation();
		Precedence precedence = referredOperation != null ? referredOperation.getPrecedence() : null;
		if (precedence != null) {
			OclExpression source = node.getSource();
			if (source instanceof OperationCallExp) {
				nodes = getOperationCallExpTree((OperationCallExp) source, nodes);
			}
			nodes.add(node);
			List<OclExpression> args = node.getArguments();
			if (args.size() > 0) {
				OclExpression arg = args.get(0);
				if (arg instanceof OperationCallExp) {
					nodes = getOperationCallExpTree((OperationCallExp) arg, nodes);
				}
			}
		}
		else {
			nodes.add(node);
		}
		return nodes;
	}

	private OperationCallExp getOperationCallExpTreeRoot(OperationCallExp object) {
		OperationCallExp root = object;
		while (true) {
			EObject eObject = root.eContainer();
			if (eObject instanceof OperationCallExp) {
				root = (OperationCallExp) eObject;
			}
			else {
				return root;
			}
		}
	} */

	@Override
	public Object visitOperation(Operation object) {
		List<TemplateBinding> templateBindings = object.getTemplateBindings();
		if (!templateBindings.isEmpty()) {
			context.appendElement((Element) object.eContainer());
			TemplateSignature signature = templateBindings.get(0).getSignature();
			context.appendSignature(signature, object);
			return true;
		}
		context.appendParent(object, SCOPE_SEPARATOR);
		context.appendName(object);
		context.appendTemplateParameters(object);
		context.appendParameters(object.getOwnedParameters());
		return true;
	}

	@Override
	public Object visitPackage(org.eclipse.ocl.examples.pivot.Package object) {
		String alias = AliasAdapter.getAlias(object);
		if (alias != null) {
			context.append(alias);
		}
		else {
			context.appendParent(object, SCOPE_SEPARATOR);
			context.appendName(object);
		}
		return true;
	}

	@Override
	public Object visitPrecedence(Precedence object) {
		context.appendParent(object, PRECEDENCE_PREFIX);
		context.appendName(object);
		return true;
	}

	@Override
	public Object visitTemplateBinding(TemplateBinding object) {
		TemplateSignature signature = object.getSignature();
		context.appendSignature(signature, object);
		context.append(BINDINGS_PREFIX);
		return true;
	}

	@Override
	public Object visitTemplateParameter(TemplateParameter object) {
		TemplateableElement owningTemplateElement = object.getSignature().getTemplate();
		context.appendElement(owningTemplateElement);
		context.append(TEMPLATE_PARAMETER_PREFIX);
		context.appendName(object.getParameteredElement());
		return true;
	}

	@Override
	public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution object) {
		context.appendElement(object.getTemplateBinding());
		context.appendName(object.getFormal().getParameteredElement());
		return true;
	}

	@Override
	public Object visitTemplateSignature(TemplateSignature object) {
		context.appendParent(object, SCOPE_SEPARATOR);
		return true;
	}

	@Override
	public Object visitTupleType(TupleType object) {
		context.appendName(object);
		List<Property> parts = new ArrayList<Property>(object.getOwnedAttributes());
		Collections.sort(parts, new Comparator<Property>()
		{
			public int compare(Property o1, Property o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		context.append('(');
		String prefix = "";
		for (Property part : parts) {
			context.append(prefix);
			context.appendName(part);
			context.append(':');
			Type type = part.getType();
			if (type != null) {
				context.appendElement(type);
			}
			prefix = ",";
		}
		context.append(')');
		return true;
	}

	public Object visiting(Visitable visitable) {
		logger.warn("moniker-visiting " + ((EObject)visitable).eClass().getName());
		return null;
	}	
}
