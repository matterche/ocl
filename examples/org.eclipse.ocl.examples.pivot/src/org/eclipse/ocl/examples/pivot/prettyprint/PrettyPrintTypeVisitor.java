/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D. Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PrettyPrintTypeVisitor.java,v 1.6 2011/05/13 18:41:43 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.prettyprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.LambdaType;
import org.eclipse.ocl.examples.pivot.MultiplicityElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintOptions.Global;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 */
public class PrettyPrintTypeVisitor extends AbstractExtendingVisitor<Object,PrettyPrintOptions>
{
	public static final String NULL_PLACEHOLDER = "<null>";
	public static List<String> reservedNameList = Arrays.asList("and", "else", "endif", "false", "if", "implies", "in", "invalid", "let", "not", "null", "or", "self", "then", "true", "xor");
	public static List<String> restrictedNameList = Arrays.asList("Bag", "Boolean", "Collection", "Integer", "OclAny", "OclInvalid", "OclVoid", "OrderedSet", "Real", "Sequence", "Set", "String", "Tuple", "UnlimitedNatural");

	private static class Fragment
	{
		private final int depth;
		private final String prefix;		// null for manditory continuation  of previous fragment
		private final String text;
		private final String suffix;
		private Fragment parent = null;
		private List<Fragment> children = null;
		private boolean lineWrap = true;
		private boolean exdented = false;
//		private int length = 0;
		
		public Fragment(Fragment parent, int depth, String prefix, String text, String suffix) {
			this.parent = parent;
			this.depth = depth;
			this.prefix = prefix;
			this.text = text;
			this.suffix = suffix;
		}
		
		public Fragment addChild(String prefix, String text, String suffix) {
//			assert (prefix.length() + text.length() + suffix.length()) > 0;
			if (children == null) {
				children = new ArrayList<Fragment>();
			}
			Fragment child = new Fragment(this, depth+1, prefix, text, suffix);
			children.add(child);
			return child;
		}
		
		public void configureLineWrapping(int spacesPerIndent, int lineLength) {
			int firstColumn = depth * spacesPerIndent;
			int lastColumn = firstColumn + text.length();
			if (prefix != null) {
				lastColumn += prefix.length();
			}
			if (suffix != null) {
				lastColumn += suffix.length();
			}
			if (children != null) {
				for (Fragment child : children) {
					child.lineWrap = true;
					child.configureLineWrapping(spacesPerIndent, lineLength);
				}
				int allChildrenLength = getChildrenLength(true);
				if (lastColumn + allChildrenLength <= lineLength) {
//					System.out.println(depth + " '" + prefix + "'+'" + text + "'+'" + suffix + "' "
//							+ lastColumn + "+" + allChildrenLength + "<=" + lineLength);
					for (Fragment child : children) {
						child.lineWrap = false;
					}
				}
				else {
//					System.out.println(depth + " '" + prefix + "'+'" + text + "'+'" + suffix + "' "
//							+ lastColumn + "+" + allChildrenLength + ">" + lineLength);
//					int firstChildLength = getChildLength(0);
//					if (lastColumn + allChildrenLength <= lineLength) {
						for (Fragment child : children) {
							child.lineWrap = child.exdented;
						}
//					}
				}
//				while (lastColumn < lineLength) {
//					lastColumn = getChildrenLength(spacesPerIndent, lineLength, lastColumn);				
//				}
			}
			else {
//				System.out.println(depth + " '" + prefix + "'+'" + text + "'+'" + suffix + "' "
//						+ lastColumn);
			}
			if (parent == null) {
				lineWrap = false;
			}
		}

		public int getChildrenLength(Boolean concatenate) {
			int childrenLength = 0;
			for (int iChild = 0; iChild < children.size(); iChild++) {
				int childLength = getChildLength(iChild);
				if (concatenate == Boolean.TRUE) {
					childrenLength += childLength;
				}
				else if (childLength > childrenLength) {
					childrenLength = childLength;
				}
			}
			return childrenLength;
		}

		public int getChildLength(int iChild) {
			Fragment child = children.get(iChild);
			int childLength = child.length();
			for (int jChild = iChild+1; jChild < children.size(); jChild++) {
				Fragment nextChild = children.get(jChild);
				if ((nextChild.prefix != null) && nextChild.lineWrap) {
					break;
				}
				childLength += child.length();
			}
			return childLength;
		}
		
		public int length() {
			int length = text.length();
			if (prefix != null) {
				length += prefix.length();
			}
			if (suffix != null) {
				length += suffix.length();
			}
			if (children != null) {
				length += getChildrenLength(null);
			}
			return length;
		}

		public Fragment getParent() {
			return parent;
		}

		@Override
		public String toString() {
			StringBuffer s = new StringBuffer();
			toString(s, null, "  ");
			return s.toString();
		}
		
		public String toString(StringBuffer s, String newLine, String indent) {
			if ((lineWrap || (newLine != null)) && (prefix != null)) {
				if (lineWrap) {
					newLine = "\n";
				}
				s.append(newLine);
				if (text.length() > 0) {
					if ((newLine != null) && newLine.equals("\n")) {
						for (int i = 1; i < depth; i++) {
							s.append(indent);
						}
					}
					else {
						s.append(prefix);
					}
				}
				else if (prefix.length() > 0) {
					s.append(prefix);
				}
			}
			s.append(text);
//			newLine = suffix != null ? lineWrap ? "\n" : suffix : null;
			newLine = suffix;
			if (children != null) {
				for (Fragment child : children) {
					newLine = child.toString(s, newLine, indent);
				}				
			}
			return newLine;
		}
	}
	
	public static Global createOptions(Namespace scope) {
		PrettyPrintOptions.Global options = new PrettyPrintOptions.Global(scope);
		options.addReservedNames(PrettyPrintTypeVisitor.reservedNameList);
		options.addRestrictedNames(PrettyPrintTypeVisitor.reservedNameList);
		options.setUseParentheses(true);
		return options;
	}

	public static String prettyPrint(Visitable element) {
		PrettyPrintTypeVisitor visitor = new PrettyPrintTypeVisitor(createOptions(null));
		try {
			visitor.safeVisit(element);
			return visitor.toString();
		}
		catch (Exception e) {
			e.printStackTrace();
			return visitor.toString() + " ... " + e.getClass().getName() + " - " + e.getLocalizedMessage();
		}
	}

	public static String prettyPrint(Visitable element, Namespace namespace) {
		PrettyPrintTypeVisitor visitor = new PrettyPrintTypeVisitor(createOptions(namespace));
		try {
			visitor.safeVisit(element);
			return visitor.toString();
		}
		catch (Exception e) {
			e.printStackTrace();
			return visitor.toString() + " ... " + e.getClass().getName() + " - " + e.getLocalizedMessage();
		}
	}
	
	public static String prettyPrint(Visitable element, PrettyPrintOptions options) {
		PrettyPrintTypeVisitor visitor = new PrettyPrintTypeVisitor(options);
		try {
			visitor.safeVisit(element);
			String string = visitor.toString();
//			System.out.println("Type-prettyPrint : " + element.eClass().getName() + "/" + element.eClass().getName() + " => " + string);
			return string;
		}
		catch (Exception e) {
			e.printStackTrace();
			return visitor.toString() + " ... " + e.getClass().getName() + " - " + e.getLocalizedMessage();
		}
	}
	
	protected final PrettyPrintTypeVisitor delegate;
	private String pendingPrefix = "";
	private StringBuffer pendingText;
	protected Fragment fragment;

	/**
	 * Initializes me.
	 */
	public PrettyPrintTypeVisitor(PrettyPrintOptions options) {
		super(options);
		this.delegate = null;
		pendingText = new StringBuffer();
		fragment = new Fragment(null, 0, "", "", "");
	}

	public PrettyPrintTypeVisitor(PrettyPrintTypeVisitor delegate, Namespace scope) {
		super(new PrettyPrintOptions.Local(delegate.context, scope));
		this.delegate = delegate;
		pendingText = null;
		fragment = null;
	}

	protected void append(Number number) {
		if (number != null) {
			append(number.toString());
		}
		else {
			append(NULL_PLACEHOLDER);
		}
	}

	protected void append(String string) {
		if (delegate != null) {
			delegate.append(string);
		}
		else if (string != null) {
			pendingText.append(string);
		}
		else {
			pendingText.append(NULL_PLACEHOLDER);
		}
	}

	protected void appendElement(Element element) {
		safeVisit(element);
	}

	protected void appendElement(Namespace scope, Element element) {
		PrettyPrintTypeVisitor nestedVisitor = new PrettyPrintTypeVisitor(this, scope);
		nestedVisitor.safeVisit(element);
	}

	public void appendMultiplicity(MultiplicityElement object) {
		int lower = object.getLower().intValue();
		int upper = object.getUpper().intValue();
		PivotUtil.appendMultiplicity(pendingText, lower, upper);
	}

	protected void appendName(NamedElement object) {
		appendName(object, context.getRestrictedNames());
	}
		
	protected void appendName(NamedElement object, Set<String> keywords) {
		append(getName(object, keywords));
	}

	protected void appendParameters(Operation operation, boolean withNames) {
		append("(");
		String prefix = ""; //$NON-NLS-1$
		if (operation instanceof Iteration) {
			Iteration iteration = (Iteration)operation;
			for (Parameter parameter : iteration.getOwnedIterators()) {
				append(prefix);
				if (withNames) {
					appendName(parameter);
					append(" : ");
				}
				appendElement(operation, parameter.getType());
				appendMultiplicity(parameter);
				prefix = ", ";
			}
			if (iteration.getOwnedAccumulators().size() > 0) {
				prefix = "; ";
				for (Parameter parameter : iteration.getOwnedAccumulators()) {
					if (withNames) {
						appendName(parameter);
						append(" : ");
					}
					append(prefix);
					appendElement(operation, parameter.getType());
					appendMultiplicity(parameter);
					prefix = ", ";
				}
			}
			prefix = " | ";
		}
		for (Parameter parameter : operation.getOwnedParameters()) {
			append(prefix);
			if (withNames) {
				appendName(parameter);
				append(" : ");
			}
			appendElement(operation, parameter.getType());
			appendMultiplicity(parameter);
			prefix = ", ";
		}
		append(")");
	}

	protected void appendParent(EObject scope, Element element, String parentSeparator) {
		for (EObject eObject = scope; eObject != null; eObject = eObject.eContainer()) {
			if (element == eObject) {
				return;	
			}
		}
//		if (toString().length() >= MONIKER_OVERFLOW_LIMIT) {
//			append(OVERFLOW_MARKER);
//		}
		if (element == null) {
			append(NULL_PLACEHOLDER);	
		}
		else {
//			EObject parent = element.eContainer();
			EObject parent = PrettyPrintNameVisitor.getNamespace(element.eContainer());
			if ((parent instanceof org.eclipse.ocl.examples.pivot.Package) &&
					PivotConstants.ORPHANAGE_NAME.equals(((org.eclipse.ocl.examples.pivot.Package)parent).getName())) {
				return;
			}
			if ((element instanceof Operation) &&
				(parent instanceof org.eclipse.ocl.examples.pivot.Class) &&
					PivotConstants.ORPHANAGE_NAME.equals(((org.eclipse.ocl.examples.pivot.Class)parent).getName())) {
				Operation operation = (Operation)element;
				append(operation.getClass_().getName());
				appendTemplateBindings(operation);
				append(parentSeparator);
				return;
			}
			if (parent == scope) {
				return;
			}
			if (parent instanceof Visitable) {
				safeVisit((Visitable) parent);
			}
			else  {
				assert element instanceof org.eclipse.ocl.examples.pivot.Package || element instanceof ExpressionInOcl : element.eClass().getName();	
			}
		}
		append(parentSeparator);
	}
	
	protected void appendTemplateBindings(TemplateableElement typeRef) {
		boolean useParentheses = context.getUseParentheses() && (typeRef instanceof CollectionType);
		List<TemplateBinding> templateBindings = typeRef.getTemplateBindings();
		if (!templateBindings.isEmpty()) {
			append(useParentheses ? "(" : "<");
			String prefix = ""; //$NON-NLS-1$
			for (TemplateBinding templateBinding : templateBindings) {
				for (TemplateParameterSubstitution templateParameterSubstitution : templateBinding.getParameterSubstitutions()) {
					append(prefix);
					appendElement((Namespace) typeRef, templateParameterSubstitution.getActual());
//					appendName((NamedElement) templateParameterSubstitution.getActual());	// FIXME cast, selective scope
					prefix = ", ";
				}
			}
			append(useParentheses ? ")" : ">");
		}
	}

	public void appendTemplateParameters(TemplateableElement templateableElement) {
		boolean useParentheses = context.getUseParentheses() && (templateableElement instanceof CollectionType);
		TemplateSignature templateSignature = templateableElement.getOwnedTemplateSignature();
		if (templateSignature != null) {
			List<TemplateParameter> templateParameters = templateSignature.getOwnedParameters();
			if (!templateParameters.isEmpty()) {
				append(useParentheses ? "(" : "<");
				String prefix = ""; //$NON-NLS-1$
				for (TemplateParameter templateParameter : templateParameters) {
					append(prefix);
//					emittedTemplateParameter(templateParameter);
//					appendName((NamedElement) templateParameter.getParameteredElement(), restrictedNames);
					appendElement((Namespace) templateableElement, templateParameter);
					prefix = ", ";
				}
				append(useParentheses ? ")" : ">");
			}
		}
	}

	@Override
	public String toString() {
		if (delegate != null) {
			return delegate.toString();
		}
		else {
			if (fragment == null) {
				return pendingPrefix + pendingText.toString();
			}
			fragment.configureLineWrapping(context.getIndentStep().length(), context.getLinelength());
			StringBuffer s = new StringBuffer();
			String newLine = fragment.toString(s, null, "  ");
			return s.toString() + newLine + pendingPrefix + pendingText.toString();
		}
	}
	
	public String toString(String indent, int lineLength) {
		if (delegate != null) {
			return delegate.toString(indent, lineLength);
		}
		else {
			if (fragment == null) {
				return pendingPrefix + pendingText.toString();
			}
			fragment.configureLineWrapping(indent.length(), lineLength);
			StringBuffer s = new StringBuffer();
			fragment.toString(s, null, indent);
//			System.out.println(s.toString() + "--" + pendingPrefix + "--" + pendingText.toString());
			return s.toString() + pendingPrefix + pendingText.toString();
		}
	}
	
	@Override
	public Object visitClass(Class object) {
		TemplateParameter owningTemplateParameter = object.getOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter.accept(this);
		}
		return super.visitClass(object);
	}

	@Override
	public Object visitLambdaType(LambdaType object) {
//		appendParent(object.eContainer(), object, "::");
		appendName(object, context.getRestrictedNames());
		append(" ");
		appendElement(object.getContextType());
		append("(");
		String prefix = ""; //$NON-NLS-1$
		for (Type parameterType : object.getParameterTypes()) {
			append(prefix);
			appendElement(parameterType);
//			appendMultiplicity(parameter);
			prefix = ",";
		}
		append(") : ");
		appendElement(object.getResultType());
		return null;
	}

	@Override
	public String visitNamedElement(NamedElement object) {
		appendParent(null, object, "::");
		appendName(object, context.getReservedNames());
		return null;
	}

	@Override
	public Object visitOperation(Operation operation) {
		appendParent(null, operation, "::");
		appendName(operation, context.getReservedNames());
		appendTemplateParameters(operation);
		appendTemplateBindings(operation);
		append("(");
		String prefix = ""; //$NON-NLS-1$
		if (operation instanceof Iteration) {
			Iteration iteration = (Iteration)operation;
			for (Parameter parameter : iteration.getOwnedIterators()) {
				append(prefix);
				appendElement(parameter.getType());
				prefix = ",";
			}
			if (iteration.getOwnedAccumulators().size() > 0) {
				prefix = ";";
				for (Parameter parameter : iteration.getOwnedAccumulators()) {
					append(prefix);
					appendElement(parameter.getType());
					prefix = ",";
				}
			}
			prefix = "|";
		}
		for (Parameter parameter : operation.getOwnedParameters()) {
			append(prefix);
			appendElement(parameter.getType());
			prefix = ",";
		}
		append(")");
		return null;
	}

	@Override
	public Object visitTemplateParameter(TemplateParameter object) {
		appendName((NamedElement) object.getParameteredElement(), context.getRestrictedNames());
		return null;
	}

	@Override
	public Object visitTupleType(TupleType object) {
//		appendParent(object.eContainer(), object, "::");
		boolean useParentheses = context.getUseParentheses();
		appendName(object, null);
		List<Property> tupleParts = object.getOwnedAttributes();
		if (!tupleParts.isEmpty()) {
			append(useParentheses ? "(" : "<");
			String prefix = ""; //$NON-NLS-1$
			for (Property tuplePart : tupleParts) {
				append(prefix);
				appendName(tuplePart, context.getRestrictedNames());
				append(" : ");
				appendElement(tuplePart.getType());
				prefix = ", ";
			}
			append(useParentheses ? ")" : ">");
		}
		return null;
	}

	@Override
	public Object visitType(Type object) {
		appendParent(object.eContainer(), object, "::");
		appendName(object, context.getReservedNames());
		appendTemplateParameters(object);
		appendTemplateBindings(object);
		return null;
	}

	@Override
	public Object visitTypedElement(TypedElement object) {
		appendParent(object.eContainer(), object, "::");
		appendElement(object.getType());
		return null;
	}

	public String visiting(Visitable visitable) {
		return (visitable == null)? NULL_PLACEHOLDER : visitable.getClass().getName();
	}

	/**
	 * Emit text to the current indented region.
	 * Start a new indented region.
	 * 
	 * If it is not necessary to start a new-line after text, emit suffix instead of the new-line.
	 */
	public void push(String text, String suffix) {
		if (delegate != null) {
			delegate.push(text, suffix);
		}
		else {
			append(text);
//			if ((pendingPrefix.length() > 0) || (pendingText.length() > 0)) {
				fragment = fragment.addChild(pendingPrefix, pendingText.toString(), suffix);
				fragment.exdented = true;
				pendingPrefix = "";
				pendingText.setLength(0);
//			}
		}
	}

	/**
	 * Flush the current indented region.
	 * Emit text exdented with respect to the current indented region.
	 * Start a new indented region.
	 * 
	 * If it is not necessary to start a new-line before text, emit prefix instead of the new-line.
	 * 
	 * If it is not necessary to start a new-line after text, emit suffix instead of the new-line.
	 */
	public void exdent(String prefix, String text, String suffix) {
		if (delegate != null) {
			delegate.exdent(prefix, text, suffix);
		}
		else {
			assert (fragment != null) && (fragment.getParent() != null);
			if (((pendingPrefix != null) && (pendingPrefix.length() > 0)) || (pendingText.length() > 0)) {
				fragment.addChild(pendingPrefix, pendingText.toString(), "");
				pendingPrefix = "";
				pendingText.setLength(0);
			}
			if ((prefix.length() > 0) || (text.length() > 0)) {
				fragment = fragment.getParent().addChild(prefix, text.toString(), suffix);
				fragment.exdented = true;
			}
		}
	}

	public String getName(NamedElement object, Set<String> keywords) {
		if (object == null) {
			return NULL_PLACEHOLDER;
		}
		String name = object.getName();
		if ((keywords == null) || (!keywords.contains(name)) && PivotUtil.isValidIdentifier(name)) {
			return name;
		}
		StringBuffer s = new StringBuffer();
		s.append("_'");
		s.append(PivotUtil.convertToOCLString(name));
		s.append("'");
		return s.toString();
	}

	/**
	 * Flush the current indented region.
	 * Emit text indented with respect to the current indented region.
	 * Start a new indented region.
	 * 
	 * If it is not necessary to start a new-line before text, emit prefix instead of the new-line.
	 * 
	 * If it is not necessary to start a new-line after text, emit suffix instead of the new-line.
	 */
	public void next(String prefix, String text, String suffix) {
		if (delegate != null) {
			delegate.next(prefix, text, suffix);
		}
		else {
			assert fragment != null;
			if (((pendingPrefix != null) && (pendingPrefix.length() > 0)) || (pendingText.length() > 0)) {
				fragment.addChild(pendingPrefix, pendingText.toString(), "");
				pendingPrefix = "";
				pendingText.setLength(0);
			}
//			if ((prefix.length() > 0) || (text.length() > 0)) {
				fragment.addChild(prefix, text, suffix);
//			}
		}
	}

	/**
	 * Flush the current indented region.
	 * Resume output with one less indentation depth.
	 */
	public void pop() {
		if (delegate != null) {
			delegate.pop();
		}
		else {
			assert fragment != null;
			if (((pendingPrefix != null) && (pendingPrefix.length() > 0)) || (pendingText.length() > 0)) {
				fragment.addChild(pendingPrefix, pendingText.toString(), "");
			}
			pendingPrefix = "";
			pendingText.setLength(0);
			assert fragment.getParent() != null;
			fragment = fragment.getParent();
		}
	}
}
