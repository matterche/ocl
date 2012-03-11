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
 * $Id: PrettyPrintTypeVisitor.java,v 1.7 2011/05/22 21:06:19 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.prettyprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.LambdaType;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintOptions.Global;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.PathElement;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * The PrettyPrintNameVisitor supports pretty printing of a type-like signature.
 * PrettyPrintOptions may be used to configure the printing.
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
			StringBuilder s = new StringBuilder();
			toString(s, null, "  ");
			return s.toString();
		}
		
		public String toString(StringBuilder s, String newLine, String indent) {
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
	private StringBuilder pendingText;
	protected Fragment fragment;

	/**
	 * Initializes me.
	 */
	public PrettyPrintTypeVisitor(PrettyPrintOptions options) {
		super(options);
		this.delegate = null;
		pendingText = new StringBuilder();
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

	protected void appendMultiplicity(int lower, int upper) {
		if (delegate != null) {
			delegate.appendMultiplicity(lower, upper);
		}
		else {
			PivotUtil.appendMultiplicity(pendingText, lower, upper);
		}
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
			for (Parameter parameter : iteration.getOwnedIterator()) {
				append(prefix);
				if (withNames) {
					appendName(parameter);
					append(" : ");
				}
				appendTypedMultiplicity(parameter);
				prefix = ", ";
			}
			if (iteration.getOwnedAccumulator().size() > 0) {
				prefix = "; ";
				for (Parameter parameter : iteration.getOwnedAccumulator()) {
					if (withNames) {
						appendName(parameter);
						append(" : ");
					}
					append(prefix);
					appendTypedMultiplicity(parameter);
					prefix = ", ";
				}
			}
			prefix = " | ";
		}
		for (Parameter parameter : operation.getOwnedParameter()) {
			append(prefix);
			if (withNames) {
				appendName(parameter);
				append(" : ");
			}
			appendTypedMultiplicity(parameter);
			prefix = ", ";
		}
		append(")");
	}

    protected void appendParent(EObject scope, Element element, String parentSeparator) { // FIXME Use appendQualifiedName instead
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
            if (parent instanceof org.eclipse.ocl.examples.pivot.Package) {
                String name = ((org.eclipse.ocl.examples.pivot.Package)parent).getName();
                if (PivotConstants.ORPHANAGE_NAME.equals(name)) {
                    return;
                }
                if (PivotPackage.eNAME.equals(name)) {
                    return;
                }
                if ("ocl".equals(name)) {            // FIXME constant needed
                    return;
                }
			}
			if ((element instanceof Operation) &&
				(parent instanceof Type) &&
					PivotConstants.ORPHANAGE_NAME.equals(((Type)parent).getName())) {
				Operation operation = (Operation)element;
				append(operation.getOwningType().getName());
				appendTemplateBindings(operation);
				append(parentSeparator);
				return;
			}
            MetaModelManager metaModelManager = context.getGlobalOptions().getMetaModelManager();
            if ((metaModelManager != null) && (parent instanceof Type)) {
            	parent = (Namespace) metaModelManager.getPrimaryType((Type) parent);
            }
			if (parent == scope) {
				return;
			}
            if (parent instanceof Visitable) {
                List<PathElement> parentPath = PathElement.getPath(parent, metaModelManager);
                int iMax = parentPath.size();
                int i = 0;
                if (scope != null) {
                    List<PathElement> scopePath = PathElement.getPath(scope, metaModelManager);
                    i = PathElement.getCommonLength(parentPath, scopePath);
                }
                if (i < iMax) {
//                    append(parentPath.get(i++).getName());
                    safeVisit((Visitable) parentPath.get(i++).getElement());
                    while (i < iMax) {
                        append("::");               
//                        append(parentPath.get(i++).getName());
                        safeVisit((Visitable) parentPath.get(i++).getElement());
                    }
                }
//                safeVisit((Visitable) parent);
			}
			else  {
				assert element instanceof org.eclipse.ocl.examples.pivot.Package || element instanceof ExpressionInOcl : element.eClass().getName();	
			}
		}
		append(parentSeparator);
	}

    public void appendQualifiedName(Element element) {
        MetaModelManager metaModelManager = context.getGlobalOptions().getMetaModelManager();
        Namespace parent = PrettyPrintNameVisitor.getNamespace(element.eContainer());
        List<PathElement> parentPath = PathElement.getPath(parent, metaModelManager);
        int iMax = parentPath.size();
        int i = 0;
        Namespace scope = context.getScope();
        if (scope != null) {
			List<PathElement> scopePath = PathElement.getPath(scope, metaModelManager);
            i = PathElement.getCommonLength(parentPath, scopePath);
        }
        if ((i == 0) && (i < iMax)) {
            PathElement rootPathElement = parentPath.get(0);
			String name = rootPathElement.getName();
        	String alias = context.getAlias((Namespace)rootPathElement.getElement());
        	if (alias != null) {
        		append(getName(alias, context.getReservedNames()));
        		append("::");               
                i++;
            }
            else if (PivotConstants.ORPHANAGE_NAME.equals(name)) {
                i++;
            }
            else if (PivotPackage.eNAME.equals(name)) {
                i++;
            }
            else if ("ocl".equals(name)) {            // FIXME constant needed
                i++;
            }
            else {
            	URI uri = rootPathElement.getElement().eResource().getURI();
            	if (uri != null) {
                	if (PivotUtil.isPivotURI(uri)) {
                		uri = PivotUtil.getNonPivotURI(uri);
                	}
                	URI baseURI = context.getBaseURI();
                	if (baseURI != null) {
                		uri = uri.deresolve(baseURI);
                	}
            		append(getName(uri.toString(), context.getReservedNames()));
            		append("::");               
                    i++;
            	}
            }
        }
        while (i < iMax) {
            safeVisit((Visitable) parentPath.get(i++).getElement());
            append("::");               
        }
        safeVisit(element);
    }
	
	protected void appendTemplateBindings(TemplateableElement typeRef) {
		List<TemplateBinding> templateBindings = typeRef.getTemplateBinding();
		if (!templateBindings.isEmpty()) {
			append("(");
			String prefix = ""; //$NON-NLS-1$
			for (TemplateBinding templateBinding : templateBindings) {
				for (TemplateParameterSubstitution templateParameterSubstitution : templateBinding.getParameterSubstitution()) {
					append(prefix);
					appendElement((Namespace) typeRef, templateParameterSubstitution.getActual());
//					appendName((NamedElement) templateParameterSubstitution.getActual());	// FIXME cast, selective scope
					prefix = ", ";
				}
			}
			append(")");
		}
	}

	public void appendTemplateParameters(TemplateableElement templateableElement) {
		TemplateSignature templateSignature = templateableElement.getOwnedTemplateSignature();
		if (templateSignature != null) {
			List<TemplateParameter> templateParameters = templateSignature.getOwnedParameter();
			if (!templateParameters.isEmpty()) {
				append("(");
				String prefix = ""; //$NON-NLS-1$
				for (TemplateParameter templateParameter : templateParameters) {
					append(prefix);
//					emittedTemplateParameter(templateParameter);
//					appendName((NamedElement) templateParameter.getParameteredElement(), restrictedNames);
					appendElement((Namespace) templateableElement, templateParameter);
					prefix = ", ";
				}
				append(")");
			}
		}
	}

	public void appendTypedMultiplicity(TypedMultiplicityElement object) {
		int lower = object.getLower().intValue();
		int upper = object.getUpper().intValue();
		if (upper != 1) {
			if (object.isOrdered()) {
				if (object.isUnique()) {
					append("OrderedSet");
				}
				else {
					append("Sequence");
				}
			}
			else {
				if (object.isUnique()) {
					append("Set");
				}
				else {
					append("Bag");
				}
			}
			append("(");
			appendElement(object.getType());
			if ((lower > 0) || (upper >= 0)) {
				appendMultiplicity(lower, upper);
			}
			append(")");
		}
		else {
			appendElement(object.getType());
			appendMultiplicity(lower, upper);
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
			StringBuilder s = new StringBuilder();
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
			StringBuilder s = new StringBuilder();
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
		for (Type parameterType : object.getParameterType()) {
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
//		appendParent(null, object, "::");
		appendName(object, context.getReservedNames());
		return null;
	}

	@Override
	public Object visitOperation(Operation operation) {
//		appendParent(null, operation, "::");
		appendName(operation, context.getReservedNames());
		appendTemplateParameters(operation);
		appendTemplateBindings(operation);
		append("(");
		String prefix = ""; //$NON-NLS-1$
		if (operation instanceof Iteration) {
			Iteration iteration = (Iteration)operation;
			for (Parameter parameter : iteration.getOwnedIterator()) {
				append(prefix);
				appendTypedMultiplicity(parameter);
				prefix = ",";
			}
			if (iteration.getOwnedAccumulator().size() > 0) {
				prefix = ";";
				for (Parameter parameter : iteration.getOwnedAccumulator()) {
					append(prefix);
					appendTypedMultiplicity(parameter);
					prefix = ",";
				}
			}
			prefix = "|";
		}
		for (Parameter parameter : operation.getOwnedParameter()) {
			append(prefix);
			appendTypedMultiplicity(parameter);
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
		appendName(object, null);
		List<Property> tupleParts = object.getOwnedAttribute();
		if (!tupleParts.isEmpty()) {
			append("(");
			String prefix = ""; //$NON-NLS-1$
			for (Property tuplePart : tupleParts) {
				append(prefix);
				appendName(tuplePart, context.getRestrictedNames());
				append(" : ");
				appendElement(tuplePart.getType());
				prefix = ", ";
			}
			append(")");
		}
		return null;
	}

	@Override
	public Object visitType(Type object) {
//		appendParent(object.eContainer(), object, "::");
		appendName(object, context.getReservedNames());
		appendTemplateParameters(object);
		appendTemplateBindings(object);
		return null;
	}

	@Override
	public Object visitTypedElement(TypedElement object) {
//		appendParent(object.eContainer(), object, "::");
		appendElement(object.getType());
		return null;
	}

	@Override
	public Object visitTypedMultiplicityElement(TypedMultiplicityElement object) {
//		appendParent(object.eContainer(), object, "::");
		appendTypedMultiplicity(object);
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
		return getName(object.getName(), keywords);
	}

	public String getName(String name, Set<String> keywords) {
		if ((keywords == null) || (!keywords.contains(name)) && PivotUtil.isValidIdentifier(name)) {
			return name;
		}
		StringBuilder s = new StringBuilder();
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
