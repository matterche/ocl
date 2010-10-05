/**
 * <copyright>
 *
 * Copyright (c) 2005, 2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   E.D. Willink - Robustness enhancements (null-proofing)
 *   Adolfo Sanchez- Barbudo Herrera - 228841 Fix NPE in VariableExp
 *
 * </copyright>
 *
 * $Id: ToStringVisitor.java,v 1.1.2.1 2010/10/05 17:38:47 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.utilities;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.AssociationClassCallExp;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CallOperationAction;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionKind;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EnumLiteralExp;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.FeatureCallExp;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.Iterate;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.MessageExp;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.SendSignalAction;
import org.eclipse.ocl.examples.pivot.Signal;
import org.eclipse.ocl.examples.pivot.StateExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralPart;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeExp;
import org.eclipse.ocl.examples.pivot.TypeUtil;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.UnspecifiedValueExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.VoidType;
import org.eclipse.ocl.examples.pivot.evaluation.AbstractVisitor;

/**
 * Converts an OCL expression to a string for debugging.  This is not intended
 * to be used by client applications as an AST-to-text transformation.
 * 
 * @author Edith Schonberg (edith)
 * @author Christian W. Damus (cdamus)
 * @author Edward Willink (ewillink)
 */
public class ToStringVisitor extends AbstractVisitor<String> {

    private final Environment env;
    private final UMLReflection uml;

	
	/**
	 * Indicates where a required element in the AST was <code>null</code>, so
	 * that it is evident in the debugger that something was missing.  We don't
	 * want just <code>"null"</code> because that would look like the OclVoid
	 * literal.
	 */
	protected static String NULL_PLACEHOLDER = "\"<null>\""; //$NON-NLS-1$

	/**
	 * Initializes me with my environment.
	 * 
	 * @param env my environment
	 */
	public ToStringVisitor() {
	    this(null);
	}

	/**
	 * Initializes me with my environment.
	 * 
	 * @param env my environment
	 */
	protected ToStringVisitor(Environment env) {
	    this.env = env;
		this.uml = (env == null)? null : env.getUMLReflection();
	}
	
	/**
	 * Obtains an instance of the <tt>toString()</tt> visitor for the specified
	 * environment.
	 * 
	 * @param env an OCL environment
	 * 
	 * @return the corresponding instance
	 */
	public static 
	ToStringVisitor getInstance(
			Environment env) {
		
		return new ToStringVisitor(env);
	}
	
	/**
	 * Obtains an instance of the <tt>toString()</tt> visitor for the specified
	 * expression or other typed element.
	 * 
	 * @param element an OCL expression or other typed element such as a variable
	 * 
	 * @return the corresponding instance
	 */
	public static 
	ToStringVisitor getInstance(TypedElement element) {
		
		return new ToStringVisitor(
				(Environment)
					Environment.Registry.INSTANCE.getEnvironmentFor(element));
	}
	
	/**
	 * Null-safe access to the name of a named element.
	 * 
	 * @param named a named element or <code>null</code>
	 * @return a name, or the null placeholder if the named element or its name
	 *    be <code>null</code>.  i.e., <code>null</code> is never returned
	 */
	protected String getName(NamedElement named) {
		return (named == null)? NULL_PLACEHOLDER : named.getName();
	}
	
	/**
	 * Null-safe access to the name of a named element.
	 * 
	 * @param named a named element or <code>null</code>
	 * @return a name, or the null placeholder if the named element or its name
	 *    be <code>null</code>.  i.e., <code>null</code> is never returned
	 */
	protected String getName(EObject eContainer, String separator, NamedElement named) {
		if (eContainer instanceof NamedElement) {
			return getName(eContainer.eContainer(), "::", (NamedElement) eContainer) + separator + getName(named);
		}
		else {
			return getName(named);
		}
	}
    
    /**
     * Null-safe access to the qualified name of a named element.
     * 
     * @param named a named element or <code>null</code>
     * @return a qualified name, or the null placeholder if the named element
     *    or its name be <code>null</code>.  i.e., <code>null</code> is never
     *    returned
     */
    protected String getQualifiedName(Object named) {
        return (uml == null)? NULL_PLACEHOLDER : uml.getQualifiedName(named);
    }

	/**
	 * Callback for an OperationCallExp visit.
	 * 
	 * Look at the source to determine operator ( -> or . )
	 * @param oc the operation call expression
	 * @return string
	 */
    @Override
    protected String handleOperationCallExp(OperationCallExp oc,
            String sourceResult, List<String> argumentResults) {
        
		OclExpression source = oc.getSource();
		Type sourceType = source != null ? source.getType() : null;
		Operation oper = oc.getReferredOperation();
		
		StringBuffer result = new StringBuffer();
		result.append(sourceResult);
		result.append(sourceType instanceof CollectionType ? "->" : "."); //$NON-NLS-1$ //$NON-NLS-2$
		result.append(getName(oper != null ? oper : oc));
		
        result.append('(');
        for (Iterator<String> iter = argumentResults.iterator(); iter.hasNext();) {
			result.append(iter.next());
			if (iter.hasNext()) {
				result.append(", ");//$NON-NLS-1$
            }
		}
		result.append(')');
        
		return maybeAtPre(oc, result.toString());
	}

	/**
	 * Callback for an EnumLiteralExp visit.  
	 * @param el the enumeration literal expresion
	 * @return the enumeration literal toString()
	 */
	@Override
    public String visitEnumLiteralExp(EnumLiteralExp el) {
		EnumerationLiteral l = el.getReferredEnumLiteral();
		return getQualifiedName(l);
	}

	/**
	 * Callback for a VariableExp visit.
	 * @param v the variable expression
	 * @return the variable name
	 */
	@Override
    public String visitVariableExp(VariableExp v) {
		VariableDeclaration vd = v.getReferredVariable();
		String result = (vd == null) ? null : vd.getName();
		
		if (result == null) {
			result = NULL_PLACEHOLDER;
		}
		
		return result;
	}

	/**
	 * Callback for an AssociationEndCallExp visit. 
	 * @param pc the property call expression
	 * @return string source.ref
	 */
    @Override
    protected String handlePropertyCallExp(PropertyCallExp pc,
            String sourceResult, List<String> qualifierResults) {
		Property property = pc.getReferredProperty();

        if (sourceResult == null) {
			// if we are the qualifier of an association class call, then
			//   we just return our name, because our source is null (implied)
			return getName(property);
		}
		
		StringBuffer result = new StringBuffer(
			maybeAtPre(pc, sourceResult + "." + getName(property)));//$NON-NLS-1$
		
		if (!qualifierResults.isEmpty()) {
			result.append('[');
			
			for (Iterator<String> iter = qualifierResults.iterator(); iter.hasNext();) {
				result.append(iter.next());
				
				if (iter.hasNext()) {
					result.append(", "); //$NON-NLS-1$
				}
			}
			
			result.append(']');
		}
		
		return result.toString();
	}

	/**
	 * Callback for an AssociationClassCallExp visit. 
	 * @param ac the association class expression
	 * @return string source.ref
	 */
    @Override
    protected String handleAssociationClassCallExp(
            AssociationClassCallExp ac,
            String sourceResult, List<String> qualifierResults) {

		Type ref = ac.getReferredAssociationClass();
		String name = initialLower(getName(ref));
		
		StringBuffer result = new StringBuffer(
			maybeAtPre(ac, sourceResult + "." + name));//$NON-NLS-1$
		
		if (!qualifierResults.isEmpty()) {
			result.append('[').append(qualifierResults.get(0)).append(']');
		}
		
		return result.toString();
	}
	
	protected String initialLower(String name) {
		if (name == null || name.length() == 0) {
			return name;
		}
		
		StringBuffer result = new StringBuffer(name);
		result.setCharAt(0, Character.toLowerCase(result.charAt(0)));
		return result.toString();
	}

	/**
	 * Callback for the Variable visit.
	 * @param vd the variable declaration
	 * @return string
	 */
    @Override
    protected String handleVariable(Variable vd, String initResult) {
		String varName = vd.getName();
		
		if (varName == null) {
			varName = NULL_PLACEHOLDER;
		}
		
		Type type = vd.getType();
		String result = varName;

		if (type != null) {
			result += " : " + getName(type);//$NON-NLS-1$
		}
        
        if (initResult != null) {
			result += " = " + initResult;//$NON-NLS-1$
        }
        
		return result;
	}

	/**
	 * Callback for an IfExp visit.
	 * @param ifExp an IfExp
     * @return the string representation
	 */
    @Override
    protected String handleIfExp(IfExp ifExp, String conditionResult, String thenResult, String elseResult) {
        StringBuffer result = new StringBuffer();
        
        result.append("if ").append(conditionResult); //$NON-NLS-1$
        result.append(" then ").append(thenResult); //$NON-NLS-1$
        result.append(" else ").append(elseResult); //$NON-NLS-1$
        result.append(" endif"); //$NON-NLS-1$
        
        return result.toString();
	}

	@Override
    public String visitTypeExp(TypeExp t) {
		return getQualifiedName(t.getReferredType());
	}
	
	@Override
    public String visitStateExp(StateExp s) {
		return getName(s);
	}

	/**
	 * Callback for an UnspecifiedValueExp visit.
	 * @param uv - UnspecifiedValueExp
	 * @return the string representation
	 */
	@Override
    public String visitUnspecifiedValueExp(UnspecifiedValueExp uv) {
		StringBuffer result = new StringBuffer();
		result.append("?"); //$NON-NLS-1$
		if (uv.getType() != null && !(uv.getType() instanceof VoidType)) {
			result.append(" : "); //$NON-NLS-1$
			result.append(getName(uv.getType()));
		}

		return result.toString();
	}

	/**
	 * Callback for an IntegerLiteralExp visit. 
	 * @param il -- integer literal expression 
	 * @return String
	 */
	@Override
    public String visitIntegerLiteralExp(IntegerLiteralExp il) {
    	BigInteger value = il.getIntegerSymbol();
    	if (value == null) {
    		return NULL_PLACEHOLDER;
    	}
        return value.toString();
	}
    
    /**
     * Callback for an UnlimitedNaturalLiteralExp visit. 
     * @param unl -- unlimited natural literal expression 
     * @return String
     */
    @Override
    public String visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp unl) {
    	BigInteger value = unl.getSymbol();
    	if (value == null) {
    		return NULL_PLACEHOLDER;
    	}
    	if (value.signum() < 0) {
            return "*"; //$NON-NLS-1$
        }
        return value.toString();
    }
    

	/**
	 * Callback for a RealLiteralExp visit.
	 * @param rl -- real literal expression
	 * @return the value of the real literal as a java.lang.Double.
	 */
	@Override
    public String visitRealLiteralExp(RealLiteralExp rl) {
		return (rl.getRealSymbol() == null)? NULL_PLACEHOLDER
				: rl.getRealSymbol().toString();
	}

	/**
	 * Callback for a StringLiteralExp visit.
	 * @param sl -- string literal expression
	 * @return the value of the string literal as a java.lang.String.
	 */
	@Override
    public String visitStringLiteralExp(StringLiteralExp sl) {
		return "'" + ((sl.getStringSymbol() == null)? NULL_PLACEHOLDER //$NON-NLS-1$
				: sl.getStringSymbol()) + "'";//$NON-NLS-1$
	}

	/**
	 * Callback for a BooleanLiteralExp visit.
	 * @param bl -- boolean literal expression
	 * @return the value of the boolean literal as a java.lang.Boolean.
	 */
	@Override
    public String visitBooleanLiteralExp(BooleanLiteralExp bl) {
    	boolean value = bl.isBooleanSymbol();
		return Boolean.toString(value);
	}

	/**
	 * Callback for LetExp visit.
	 * @param letExp a let expression
     * @return the string representation
	 */
    @Override
    protected String handleLetExp(LetExp letExp, String variableResult,
            String inResult) {
        
        StringBuffer result = new StringBuffer();
		result.append("let ").append(variableResult); //$NON-NLS-1$
        result.append(" in ").append(inResult); //$NON-NLS-1$
        
		return result.toString();

	}

	/**
	 *  Callback for an IterateExp visit.
	 * @param callExp an iterate expression
     * @return the string representation
	 */
    @Override
    protected String handleIterateExp(IterateExp callExp,
            String sourceResult, List<String> variableResults,
            String resultResult, String bodyResult) {
        
        StringBuffer result = new StringBuffer();
        
        result.append(sourceResult).append("->iterate("); //$NON-NLS-1$
        
		for (Iterator<String> iter = variableResults.iterator(); iter.hasNext();) {
			result.append(iter.next());
			if (iter.hasNext()) {
				result.append(", ");//$NON-NLS-1$
            }
		}
        
		result.append("; ").append(resultResult).append(" | ");//$NON-NLS-2$//$NON-NLS-1$

		result.append(bodyResult).append(')');

		return result.toString();
	}

	/**
	 * Callback for an IteratorExp visit.
	 * @param callExp an iterator expression
     * @return the string representation
	 */
    @Override
    protected String handleIteratorExp(IteratorExp callExp,
            String sourceResult, List<String> variableResults, String bodyResult) {
        
        StringBuffer result = new StringBuffer();

        String name = callExp.getName();
        result.append(sourceResult).append("->").append(name).append('('); //$NON-NLS-1$
        
        for (Iterator<String> iter = variableResults.iterator(); iter.hasNext();) {
            result.append(iter.next());
            if (iter.hasNext()) {
                result.append(", ");//$NON-NLS-1$
            }
        }
        
        result.append(" | ").append(bodyResult).append(')');//$NON-NLS-1$

        return result.toString();
	}

	/**
	 * Callback for a CollectionLiteralExp visit.
	 * @param cl collection literal expression
	 * @return String
	 */
    @Override
    protected String handleCollectionLiteralExp(CollectionLiteralExp cl,
            List<String> partResults) {
        
        StringBuffer result = new StringBuffer();
        
		// construct the appropriate collection from the parts
		// based on the collection kind.
		CollectionKind kind = cl.getKind();

		switch (kind) {
		case SET:
			result.append("Set {");//$NON-NLS-1$
			break;
		case ORDERED_SET:
            result.append("OrderedSet {");//$NON-NLS-1$
			break;
		case BAG:
            result.append("Bag {");//$NON-NLS-1$
			break;
		case SEQUENCE:
            result.append("Sequence {");//$NON-NLS-1$
			break;
		default:
            result.append("Collection {");//$NON-NLS-1$
			break;
		}

		for (Iterator<String> iter = partResults.iterator(); iter.hasNext();) {
			result.append(iter.next());
			if (iter.hasNext()) {
				result.append(", "); //$NON-NLS-1$
            }
		}
        
		result.append('}');
        
        return result.toString();
	}
    
    @Override
    protected String handleCollectionItem(CollectionItem item,
            String itemResult) {
        return itemResult;
    }
    
    @Override
    protected String handleCollectionRange(CollectionRange range,
            String firstResult, String lastResult) {
        return firstResult + ".." + lastResult; //$NON-NLS-1$
    }

	/**
	 * Callback for a TupleLiteralExp visit.
	 * @param literalExp tuple literal expression
     * @return the string representation
	 */
    @Override
    protected String handleTupleLiteralExp(TupleLiteralExp literalExp,
            List<String> partResults) {
        
		// construct the appropriate collection from the parts
		// based on the collection kind.
		StringBuffer result = new StringBuffer();
        result.append("Tuple{");//$NON-NLS-1$
        
		for (Iterator<String> iter = partResults.iterator(); iter.hasNext();) {
			result.append(iter.next());
            
			if (iter.hasNext()) {
				result.append(", ");//$NON-NLS-1$
            }
		}
        
		result.append('}');
        
        return result.toString();
	}
	
    @Override
    protected String handleTupleLiteralPart(TupleLiteralPart part,
            String valueResult) {
        
		String varName = part.getName();
		Type type = part.getType();
        
		StringBuffer result = new StringBuffer();
        
        result.append(varName);

		if (type != null) {
			result.append(" : ").append(getName(type));//$NON-NLS-1$
		}
		
		if (valueResult != null) {
			result.append(" = ").append(valueResult);//$NON-NLS-1$
		}
		
		return result.toString();
	}
	
    @Override
    protected String handleMessageExp(MessageExp messageExp,
            String targetResult, List<String> argumentResults) {
		StringBuffer result = new StringBuffer();
		
		result.append(targetResult);
		
		result.append((messageExp.getType() instanceof CollectionType)?
            "^^" : "^");  //$NON-NLS-1$//$NON-NLS-2$
	
		if (messageExp.getCalledOperation() != null) {
			result.append(getName(getOperation(messageExp.getCalledOperation())));
		} else if (messageExp.getSentSignal() != null) {
			result.append(getName(getSignal(messageExp.getSentSignal())));
		}
		
		result.append('(');
		
		for (Iterator<String> iter = argumentResults.iterator(); iter.hasNext();) {
			result.append(iter.next());
			
			if (iter.hasNext()) {
				result.append(", ");  //$NON-NLS-1$
			}
		}
		
		result.append(')');
		
		return result.toString();
	}
	
	protected Operation getOperation(CallOperationAction callOperationAction) {
		return (uml == null)? null : uml.getOperation(callOperationAction);
	}
	
	protected Signal getSignal(SendSignalAction sendSignalAction) {
		return (uml == null)? null : uml.getSignal(sendSignalAction);
	}

	/**
     * Renders an ExpressionInOcl with its context variables and body.
	 */
	@Override
    public String visitExpressionInOcl(ExpressionInOcl expression) {
		return expression.getBodyExpression().accept(this);
	}

    /**
     * Renders a constraint with its context and expression.
     */
    @Override
    public String visitConstraint(Constraint constraint) {
        StringBuffer result = new StringBuffer();
        
        List<? extends EObject> constrained = getConstrainedElements(constraint);
        
        if (!constrained.isEmpty()) {
            EObject elem = constrained.get(0);
            
            result.append("context "); //$NON-NLS-1$
            if (isClassifier(elem)) {
                result.append(getName((NamedElement) elem));
            } else if (isOperation(elem)) {
                Operation oper = (Operation) elem;
                appendOperationSignature(result, oper);
            } else if (isProperty(elem)) {
                Property prop = (Property) elem;
                appendPropertySignature(result, prop);
            }
            
            result.append(' ');
        }
        
        String stereo = getStereotype(constraint);
        if (UMLReflection.PRECONDITION.equals(stereo)) {
            result.append("pre: "); //$NON-NLS-1$
        } else if (UMLReflection.POSTCONDITION.equals(stereo)) {
            result.append("post: "); //$NON-NLS-1$
        } else if (UMLReflection.BODY.equals(stereo)) {
            result.append("body: "); //$NON-NLS-1$
        } else if (UMLReflection.INITIAL.equals(stereo)) {
            result.append("init: "); //$NON-NLS-1$
        } else if (UMLReflection.DERIVATION.equals(stereo)) {
            result.append("derive: "); //$NON-NLS-1$
        } else if (UMLReflection.POSTCONDITION.equals(stereo)) {
            result.append("def: "); //$NON-NLS-1$
            
            EObject elem = constrained.get(1);
            
            if (isOperation(elem)) {
                Operation oper = (Operation) elem;
                appendOperationSignature(result, oper);
            } else if (isProperty(elem)) {
                Property prop = (Property) elem;
                appendPropertySignature(result, prop);
            }
            
            result.append(" = "); //$NON-NLS-1$
        } else {
            result.append("inv "); //$NON-NLS-1$
            result.append(getName(constraint));
            result.append(": "); //$NON-NLS-1$
        }
        
        result.append(visit(getSpecification(constraint)));
        
        return result.toString();
    }
	
	protected boolean isClassifier(Object element) {
		return (uml == null)? null : uml.isClassifier(element);
	}
	
	protected boolean isOperation(Object element) {
		return (uml == null)? null : uml.isOperation(element);
	}
	
	protected boolean isProperty(Object element) {
		return (uml == null)? null : uml.isProperty(element);
	}
	
	protected List<? extends EObject> getConstrainedElements(Constraint constraint) {
		return (uml == null)? null : uml.getConstrainedElements(constraint);
	}
	
	protected String getStereotype(Constraint constraint) {
		return (uml == null)? null : uml.getStereotype(constraint);
	}
	
	@Override
    protected ExpressionInOcl getSpecification(Constraint constraint) {
		return (uml == null)? null : uml.getSpecification(constraint);
	}
	
	private void appendOperationSignature(StringBuffer buf, Operation operation) {
		buf.append(getName(operation)).append('(');
		
		boolean comma = false;
		for (java.util.Iterator<Parameter> iter = getParameters(operation).iterator(); iter.hasNext();) {
			Parameter parm = iter.next();
			
			if (comma) {
				buf.append(", "); //$NON-NLS-1$
			} else {
				comma = true;
			}
			
			buf.append(getName(parm)).append(" : "); //$NON-NLS-1$
			
			if (getType(parm) != null) {
				buf.append(getName(getType(parm)));
			} else {
				buf.append("OclVoid"); //$NON-NLS-1$
			}
		}
		
		buf.append(") :"); //$NON-NLS-1$
		if (getType(operation) != null) {
			buf.append(' ').append(getName(getType(operation)));
		}
	}
	
	protected Type getType(Object typedElement) {
		return (uml == null)? null : TypeUtil.resolveType(env, uml.getOCLType(typedElement));
	}
	
	protected List<Parameter> getParameters(Operation operation) {
		return (uml == null)? null : uml.getParameters(operation);
	}

	private void appendPropertySignature(StringBuffer buf, Property property) {
		buf.append(getName(property));
		if (getType(property) != null) {
			buf.append(" : ").append(getName(getType(property))); //$NON-NLS-1$
		}
	}

	private String maybeAtPre(FeatureCallExp mpc, String base) {
		return mpc.isPre() ? base + "@pre" : base; //$NON-NLS-1$
	}

	@Override
	public String visitClass(org.eclipse.ocl.examples.pivot.Class cls) {
		return getName(cls.eContainer(), "::", cls);
	}

	@Override
    public String visitInvalidLiteralExp(InvalidLiteralExp il) {
		return "invalid"; //$NON-NLS-1$
	}

	@Override
	public String visitIterate(Iterate iterate) {
		return getName(iterate.eContainer(), ".", iterate);
	}

	@Override
	public String visitIterator(org.eclipse.ocl.examples.pivot.Iterator iterator) {
		return getName(iterator.eContainer(), ".", iterator);
	}

	@Override
    public String visitNullLiteralExp(NullLiteralExp il) {
		return "null"; //$NON-NLS-1$
	}

	@Override
	public String visitOperation(Operation operation) {
		StringBuffer s = new StringBuffer();
		s.append(getName(operation.eContainer(), ".", operation));
		s.append('(');
		boolean isFirst = true;
		for (Parameter parameter : operation.getOwnedParameters()) {
			if (!isFirst) {
				s.append(',');
			}
			Type type = parameter.getType();
			s.append(getName(type));
			isFirst = false;
		}
		s.append(')');
		return s.toString();
	}

	@Override
	public String visitPackage(org.eclipse.ocl.examples.pivot.Package pkg) {
		return getName(pkg.eContainer(), "::", pkg);
	}

	@Override
	public String visitParameter(Parameter parameter) {
		return getName(parameter.eContainer(), ".", parameter);
	}

	@Override
	public String visitPrecedence(Precedence precedence) {
		return precedence.getName();
	}

	@Override
	public String visitProperty(Property property) {
		return getName(property.eContainer(), ".", property);
	}
	
	public String visit(Visitable visitable) {
		return (visitable == null)? NULL_PLACEHOLDER : visitable.getClass().getName();
	}
} // ToStringVisitorImpl
