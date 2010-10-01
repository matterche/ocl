/**
 * <copyright>
 *
 * Copyright (c) 2002, 2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCLBaseHelperImpl.java,v 1.1.2.1 2010/10/01 13:51:56 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.helper;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.EnvironmentFactory;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.OCLBase;
import org.eclipse.ocl.examples.pivot.OCLFactory;
import org.eclipse.ocl.examples.pivot.OCLStandardLibrary;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.UnspecifiedValueExp;
import org.eclipse.ocl.examples.pivot.util.PivotPlugin;
import org.eclipse.ocl.helper.Choice;
import org.eclipse.ocl.helper.ConstraintKind;

/**
 * Default implementation of the {@link OCLHelper} interface.
 * 
 * @author Yasser Lulu
 * @author Christian W. Damus (cdamus)
 */
abstract class OCLBaseHelperImpl implements OCLHelper {
	
	private final EnvironmentFactory environmentFactory;
    private final UMLReflection uml;
    private final OCLFactory oclFactory;
	private Environment env;

	private OCLSyntaxHelper syntaxHelper;
	
	private boolean validating = true;
    private final OCL ocl;
    
    private Diagnostic problems;
    
	/**
	 * Initializes me with my environment.
	 * 
	 * @param ocl the OCL environment
	 */
	OCLBaseHelperImpl(OCL ocl) {
        this.ocl = ocl;
        
        uml = ocl.getEnvironment().getUMLReflection();
        oclFactory = ocl.getEnvironment().getOCLFactory();
		environmentFactory = ocl.getEnvironment().getFactory();
	}
	
	public Environment
	getEnvironment() {
		return env == null? ocl.getEnvironment() : env;
	}
	
    public OCLBase getOCL() {
        return ocl;
    }
    
	public boolean isValidating() {
		return validating;
	}
	
	public void setValidating(boolean validating) {
		this.validating = validating;
	}
	
	/**
	 * Strips any leading, trailing, or embedded comments from the specified OCL
	 * expression text.
	 * 
	 * @param txt an OCL expression
	 * @return the same, but without any comments.  Note that the result
	 *     may be an empty String if <code>txt</code> has only comments
	 */
	private String removeOCLComments(String txt) {
		try {
			return HelperUtil.getLogicalLine(txt);
		} catch (Exception ex) {
			HelperUtil.catchException(ex, getClass(), "removeOCLComments");//$NON-NLS-1$
		}
		return HelperUtil.EMPTY;
	}

	private void setEnvironment(Environment env) {
		this.env = env;
		
		// forget the cached syntax helper, as its environment is now obsolete
		syntaxHelper = null;
	}
	
	public void setContext(Type context) {
		setEnvironment(environmentFactory.createClassifierContext(
            ocl.getEnvironment(), context));
	}
	
	public void setOperationContext(Type context, Operation operation) {
        setContext(context);
		setEnvironment(environmentFactory.createOperationContext(env, operation));
	}
	
	public void setAttributeContext(Type context, Property property) {
        setContext(context);
		setEnvironment(environmentFactory.createAttributeContext(env, property));
	}
    
    public void setInstanceContext(Object instance) {
        setEnvironment(environmentFactory.createInstanceContext(
            ocl.getEnvironment(), instance));
    }
    
    public void setInstanceOperationContext(Object instance, Operation operation) {
        setInstanceContext(instance);
        setEnvironment(environmentFactory.createOperationContext(env, operation));
    }
    
    public void setInstanceAttributeContext(Object instance, Property property) {
        setInstanceContext(instance);
        setEnvironment(environmentFactory.createAttributeContext(env, property));
    }
	
	public Type getContextClassifier() {
		return env.getContextClassifier();
	}
	
	public Operation getContextOperation() {
		return env.getContextOperation();
	}
	
	public Property getContextAttribute() {
		return env.getContextProperty();
	}

	public List<Choice> getSyntaxHelp(ConstraintKind constraintType, String txt) {
	    if (constraintType == null) {
	        // query expressions cannot use post-condition constructs such
	        // as @pre or oclIsNew(), so pretend an invariant constraint
	        constraintType = ConstraintKind.INVARIANT;
	    }
	    
//		return createSyntaxHelper().getSyntaxHelp(constraintType, txt);
	    throw new UnsupportedOperationException(getClass().getName() + ".getSyntaxHelp");
	}

/*    public OclExpression
    createQuery(String expression) throws ParserException {
        if (removeOCLComments(expression).length() > 0) {
            // be sure to pass the original expression along to get the right
            //    position information when parse fails
            try {
                return HelperUtil.parseQuery(
                    this, expression, validating, ocl.isParseTracingEnabled());
            } catch (RuntimeException e) {
                propagate(e, "createQuery"); //$NON-NLS-1$
            }
        }
        
        // may as well create a boolean-valued expression if none was supplied
        return uml.getSpecification(
                createNullCondition(
                        env.getOCLStandardLibrary().getBoolean())).getBodyExpression();
    } */

/*    public Constraint createConstraint(ConstraintKind kind, String expression)
        throws ParserException {
        
        switch (kind) {
        case PRECONDITION:
            return createPrecondition(expression);
        case BODYCONDITION:
            return createBodyCondition(expression);
        case POSTCONDITION:
            return createPostcondition(expression);
        case INITIAL:
            return createInitialValueExpression(expression);
        case DERIVATION:
            return createDerivedValueExpression(expression);
        case DEFINITION:
            return HelperUtil.parseDefExpression(
                this, expression, validating, ocl.isParseTracingEnabled());
        default:
            return createInvariant(expression);
        }
    } */
    
/*	public Constraint createInvariant(String expression) throws ParserException {
		if (removeOCLComments(expression).length() > 0) {
			// be sure to pass the original expression along to get the right
			//    position information when parse fails
			try {
				return HelperUtil.parseInvariant(
                    this, expression, validating, ocl.isParseTracingEnabled());
			} catch (RuntimeException e) {
				propagate(e, "createInvariant"); //$NON-NLS-1$
			}
		}
		
		return createNullCondition(env.getOCLStandardLibrary().getBoolean());
	} */

/*	public Constraint createPrecondition(String expression) throws ParserException {
		if (removeOCLComments(expression).length() > 0) {
			// be sure to pass the original expression along to get the right
			//    position information when parse fails
			try {
				return HelperUtil.parsePrecondition(
                    this, expression, validating, ocl.isParseTracingEnabled());
			} catch (RuntimeException e) {
				propagate(e, "createPrecondition"); //$NON-NLS-1$
			}
		}
		
		return createNullCondition(env.getOCLStandardLibrary().getBoolean());
	} */
	
/*	public Constraint createPostcondition(String expression) throws ParserException {
		if (removeOCLComments(expression).length() > 0) {
			// be sure to pass the original expression along to get the right
			//    position information when parse fails
			try {
				return HelperUtil.parsePostcondition(
                    this, expression, validating, ocl.isParseTracingEnabled());
			} catch (RuntimeException e) {
				propagate(e, "createPostcondition"); //$NON-NLS-1$
			}
		}
		
		return createNullCondition(env.getOCLStandardLibrary().getBoolean());
	} */
	
/*	public Constraint createBodyCondition(String expression) throws ParserException {
		if (removeOCLComments(expression).length() > 0) {
			// be sure to pass the original expression along to get the right
			//    position information when parse fails
			try {
				return HelperUtil.parseBodyCondition(
                    this, expression, validating, ocl.isParseTracingEnabled());
			} catch (RuntimeException e) {
				propagate(e, "createBodyCondition"); //$NON-NLS-1$
			}
		}
		
		return createNullCondition(env.getOCLStandardLibrary().getOclVoid());
	} */
	
/*	public Constraint createInitialValueExpression(String expression) throws ParserException {
		if (removeOCLComments(expression).length() > 0) {
			// be sure to pass the original expression along to get the right
			//    position information when parse fails
			try {
				return HelperUtil.parseInitialValueExpression(
                    this, expression, validating, ocl.isParseTracingEnabled());
			} catch (RuntimeException e) {
				propagate(e, "createInitialValueExpression"); //$NON-NLS-1$
			}
		}
		
		return createNullCondition(env.getOCLStandardLibrary().getOclVoid());
	} */
	
/*	public Constraint createDerivedValueExpression(String expression) throws ParserException {
		if (removeOCLComments(expression).length() > 0) {
			// be sure to pass the original expression along to get the right
			//    position information when parse fails
			try {
				return HelperUtil.parseDerivedValueExpression(
                    this, expression, validating, ocl.isParseTracingEnabled());
			} catch (RuntimeException e) {
				propagate(e, "createDerivedValueExpression"); //$NON-NLS-1$
			}
		}
		
		return createNullCondition(env.getOCLStandardLibrary().getOclVoid());
	} */
	
/*	@SuppressWarnings("unchecked")
	public Operation defineOperation(String defExpression) throws ParserException {
		try {
			EObject operation = define(defExpression);
			
			if (!uml.isOperation(operation)) {
				// assert that the correct type of feature was defined
				throw new ClassCastException();
			}
			
			return (Operation) operation;
		} catch (RuntimeException e) {
			propagate(e, "define"); //$NON-NLS-1$
		}
		
		return null;  // make the compiler happy
	} */
	
/*	@SuppressWarnings("unchecked")
	public Property defineAttribute(String defExpression) throws ParserException {
		try {
			EObject property = define(defExpression);
			
			if (!uml.isProperty(property)) {
				// assert that the correct type of feature was defined
				throw new ClassCastException();
			}
			
			return (Property) property;
		} catch (RuntimeException e) {
			propagate(e, "define"); //$NON-NLS-1$
		}
		
		return null;  // make the compiler happy
	} */
	
/*	EObject define(String defExpression) throws ParserException {
		Constraint constraint = HelperUtil.parseDefExpression(
            this, defExpression, validating, ocl.isParseTracingEnabled());
		
		List<? extends EObject> constrainedElement = uml.getConstrainedElements(constraint);
		EObject result = constrainedElement.get(1);
		
		if (!ParsingOptions.getValue(getEnvironment(), ParsingOptions.DEFINITION_CONSTRAINS_FEATURE)) {
		    // remove it for good measure
		    constrainedElement.remove(result);
		}
		
		return result;
	} */

	/**
	 * Creates a null condition of the specified <code>type</code>.
	 * 
	 * @param type the condition type
	 * 
	 * @return an expression whose value is <code>false</code> for boolean type
	 *     or <code>null</code> for anything else
	 */
	private Constraint createNullCondition(Type type) {
		OclExpression condition;
		
        OCLStandardLibrary stdlib = env.getOCLStandardLibrary();
        
		if (type == stdlib.getBooleanType()) {
			BooleanLiteralExp literal =
				oclFactory.createBooleanLiteralExp();
			condition = literal;
			uml.setType(literal, env.getOCLStandardLibrary().getBooleanType());
			literal.setBooleanSymbol(Boolean.FALSE);
		} else {
			UnspecifiedValueExp unspec =
				oclFactory.createUnspecifiedValueExp();
			condition = unspec;
			
			if (type == null) {
				type = env.getOCLStandardLibrary().getNullType();
			}
			
			uml.setType(unspec, type);
		}
		
		Constraint result = uml.createConstraint();
		
		ExpressionInOcl spec = uml.createExpressionInOcl();
		spec.setBodyExpression(condition);
		spec.setContextVariable(env.getSelfVariable());
		
		uml.setSpecification(result, spec);
		return result;
	}
	
	/**
	 * Propagates the specified exception as a parsing exception, with
	 * the requisite tracing.
	 * 
	 * @param e the exception to propagate
	 * @param method the name of the method that caught the exception
	 * 
	 * @throws the exception wrapped in an {@link ParserException}
	 */
	private void propagate(Exception e, String method) throws ParserException {
		PivotPlugin.catching(getClass(), method, e);
		ParserException ope = new ParserException(e.getLocalizedMessage(), e);
		PivotPlugin.throwing(getClass(), method, ope);
		
		throw ope;
	}

	/**
	 * returns the ocl syntax helper object
	 * 
	 * @return OCLSyntaxHelper
	 */
	protected OCLSyntaxHelper
	createSyntaxHelper() {
		if (syntaxHelper == null) {
			syntaxHelper = new OCLSyntaxHelper(
					getEnvironment());
		}
		return syntaxHelper;
	}
	
	public Diagnostic getProblems() {
		return problems;
	}
	
	void setProblems(Diagnostic problems) {
		this.problems = problems;
	}
}