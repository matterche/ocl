/**
 * <copyright>
 *
 * Copyright (c) 2007, 2008 IBM Corporation and others.
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
 * $Id: OCLHelperImpl.java,v 1.1.2.4 2010/12/28 12:17:30 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.helper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.OCLUtil;
import org.eclipse.ocl.examples.pivot.PivotEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationContext;
import org.eclipse.ocl.examples.pivot.util.Pivotable;
import org.eclipse.ocl.examples.pivot.utilities.CS2PivotResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;


/**
 * Implementation of the {@link OclMetaModel.Helper} convenience interface.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class OCLHelperImpl extends OCLBaseHelperImpl
{
	private static final Logger logger = Logger.getLogger(OCLHelperImpl.class);

	public OCLHelperImpl(OCL ocl) {
		super(ocl);
    }

	public ExpressionInOcl createQuery(String expression) throws ParserException {
		PivotEnvironment environment = (PivotEnvironment) getEnvironment();
		environment.getProblemHandler().beginParse();
		PivotManager pivotManager = environment.getPivotManager();
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		CS2PivotResourceSetAdapter.getAdapter(resourceSet, pivotManager);
		URI uri = URI.createURI("test.essentialocl");
		Resource resource = resourceSet.createResource(uri);
		if (resource instanceof EvaluationContext) {
			((EvaluationContext)resource).setEnvironment(environment);
		}
		String string = "body:\n" + expression + "\n;";
		InputStream inputStream = new ByteArrayInputStream(string.getBytes());
		try {
			resource.load(inputStream, null);
		} catch (IOException e) {
			throw new ParserException("Failed to load expression", e);
		}
		OCLUtil.checkForErrors(((PivotEnvironment) getEnvironment()).getProblemHandler());
		checkResourceErrors("Errors in '" + expression + "'", resource);
		List<EObject> contents = resource.getContents();
		int size = contents.size();
		if (size == 0) {
			return null;
		}
		if (size > 1) {
			logger.warn("Extra returns ignored");
		}
		EObject csObject = contents.get(0);
		if (csObject instanceof Pivotable) {
			Element pivotElement = ((Pivotable)csObject).getPivot();
			if (pivotElement instanceof ExpressionInOcl) {
				return (ExpressionInOcl) pivotElement;
			}
		}
		logger.warn("Non-expression ignored");
		return null;
	}

	public Constraint createInvariant(String expression) throws ParserException {
		PivotManager pivotManager = getEnvironment().getPivotManager();
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		CS2PivotResourceSetAdapter.getAdapter(resourceSet, pivotManager);
		URI uri = URI.createURI("test.essentialocl");
		Resource resource = resourceSet.createResource(uri);
		String string = "inv:\n" + expression + "\n;";
		InputStream inputStream = new ByteArrayInputStream(string.getBytes());
		try {
			resource.load(inputStream, null);
		} catch (IOException e) {
			throw new ParserException("Failed to load expression", e);
		}
		checkResourceErrors("Errors in '" + expression + "'", resource);
		List<EObject> contents = resource.getContents();
		int size = contents.size();
		if (size == 0) {
			return null;
		}
		if (size > 1) {
			logger.warn("Extra returns ignored");
		}
		EObject csObject = contents.get(0);
		if (csObject instanceof Pivotable) {
			Element pivotElement = ((Pivotable)csObject).getPivot();
			if (pivotElement instanceof ExpressionInOcl) {
//				return ((ExpressionInOcl) pivotElement).getBodyExpression();
			}
		}
		logger.warn("Non-expression ignored");
		return null;
	}

	public Constraint createPrecondition(String expression)
			throws ParserException {
		// TODO Auto-generated method stub
		return null;
	}

	public Constraint createPostcondition(String expression)
			throws ParserException {
		// TODO Auto-generated method stub
		return null;
	}

	public Constraint createBodyCondition(String expression)
			throws ParserException {
		// TODO Auto-generated method stub
		return null;
	}

	public static void checkResourceErrors(String message, Resource resource) throws ParserException {
		List<Resource.Diagnostic> errors = resource.getErrors();
		if (errors.size() > 0) {
			StringBuffer s = new StringBuffer();
			s.append(message);
			for (Resource.Diagnostic conversionError : errors) {
				s.append("\n");
				s.append(conversionError.getMessage());
			}
			throw new ParserException(s.toString());
		}
	}
}