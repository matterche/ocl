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
 * $Id: CompleteOCLFormatter.java,v 1.3 2010/05/23 10:27:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.formatting;

import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.BodyCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.ClassifierContextDeclCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.DefCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.DerCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.ImportCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.InitCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.InvCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.NavigatingExpCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.NavigationExpCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.OperationContextDeclCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.PackageDeclarationCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.PostCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.PreCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.PropertyContextDeclCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.QualifiedClassifierRefCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.QualifiedOperationRefCSElements;
import org.eclipse.ocl.examples.xtext.completeocl.services.CompleteOCLGrammarAccess.QualifiedPropertyRefCSElements;
import org.eclipse.ocl.examples.xtext.essentialocl.formatting.AbstractEssentialOCLFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class CompleteOCLFormatter extends AbstractEssentialOCLFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {

	    c.setAutoLinewrap(120);

		CompleteOCLGrammarAccess f = (CompleteOCLGrammarAccess) getGrammarAccess();
	    
		configureCollectionLiteralExpCS(c, f.getCollectionLiteralExpCSAccess());
		configureCollectionTypeCS(c, f.getCollectionTypeCSAccess());
		configureIfExpCS(c, f.getIfExpCSAccess());
		configureLetExpCS(c, f.getLetExpCSAccess());
	    configureNavigationExpCS(c, f.getNavigationExpCSAccess());
	    configureNavigatingExpCS(c, f.getNavigatingExpCSAccess());
		configurePathNameExpCS(c, f.getPathNameExpCSAccess());
		configurePreExpCS(c, f.getPreExpCSAccess());
	    configureRoundBracketExpCS(c, f.getRoundBracketExpCSAccess());
	    configureSquareBracketExpCS(c, f.getSquareBracketExpCSAccess());
		configureSubNavigationExpCS(c, f.getSubNavigationExpCSAccess());
	    configureTupleLiteralExpCS(c, f.getTupleLiteralExpCSAccess());
	    configureTupleTypeCS(c, f.getTupleTypeCSAccess());

	    {
			BodyCSElements a = f.getBodyCSAccess();
		    c.setLinewrap(2).before(a.getBodyKeyword_0());
			setNoSpaceLineWrap(c, a.getColonKeyword_2());
		    c.setIndentation(a.getExpressionAssignment_3(), a.getExpressionAssignment_3());
		    c.setLinewrap(2).after(a.getExpressionAssignment_3());
	    }
	    {
			ClassifierContextDeclCSElements a = f.getClassifierContextDeclCSAccess();
		    c.setLinewrap(2).before(a.getContextKeyword_0());
		    c.setLinewrap(2).after(a.getClassifierAssignment_2());
	    }
	    {
			DefCSElements a = f.getDefCSAccess();
		    c.setLinewrap(2).before(a.getDefKeyword_1());
		    c.setNoSpace().before(a.getColonKeyword_3());
		    c.setNoSpace().around(a.getLeftParenthesisKeyword_5_0());
		    c.setNoSpace().before(a.getCommaKeyword_5_1_1_0());
		    c.setNoSpace().before(a.getRightParenthesisKeyword_5_2());
			setNoSpaceLineWrap(c, a.getColonKeyword_6());
//		    c.setIndentation(a.getExpressionAssignment_9(), a.getExpressionAssignment_9());
		    c.setLinewrap(2).after(a.getExpressionAssignment_9());
	    }
	    {
			DerCSElements a = f.getDerCSAccess();
		    c.setLinewrap(2).before(a.getDeriveKeyword_0());
			setNoSpaceLineWrap(c, a.getColonKeyword_1());
//		    c.setIndentation(a.getExpressionAssignment_2(), a.getExpressionAssignment_2());
		    c.setLinewrap(2).after(a.getExpressionAssignment_2());
	    }
	    {
			ImportCSElements a = f.getImportCSAccess();
		    c.setLinewrap().after(a.getNamespaceAssignment_2());
	    }
	    {
			InitCSElements a = f.getInitCSAccess();
		    c.setLinewrap(2).before(a.getInitKeyword_0());
			setNoSpaceLineWrap(c, a.getColonKeyword_1());
//		    c.setIndentation(a.getExpressionAssignment_2(), a.getExpressionAssignment_2());
		    c.setLinewrap(2).after(a.getExpressionAssignment_2());
	    }
	    {
			InvCSElements a = f.getInvCSAccess();
		    c.setLinewrap(2).before(a.getInvKeyword_0());
			setNoSpaceLineWrap(c, a.getColonKeyword_2());
//		    c.setIndentation(a.getExpressionAssignment_3(), a.getExpressionAssignment_3());
		    c.setLinewrap(2).after(a.getExpressionAssignment_3());
	    }
	    {
			OperationContextDeclCSElements a = f.getOperationContextDeclCSAccess();
		    c.setLinewrap(2).before(a.getContextKeyword_0());
			c.setNoSpace().around(a.getLeftParenthesisKeyword_2());
			c.setNoSpace().before(a.getCommaKeyword_3_1_0());
			c.setNoSpace().before(a.getRightParenthesisKeyword_4());
		    c.setLinewrap(2).after(a.getTypeAssignment_6());
		    c.setIndentation(a.getLeftParenthesisKeyword_2(), a.getRightParenthesisKeyword_4());
	    }
	    {
	    	PackageDeclarationCSElements a = f.getPackageDeclarationCSAccess();
		    c.setLinewrap(2).before(a.getPackageKeyword_0());
		    c.setLinewrap(2).after(a.getPackageAssignment_1());
		    c.setLinewrap(2).before(a.getEndpackageKeyword_3());
		    c.setLinewrap(2).after(a.getEndpackageKeyword_3());
	    }
	    {
			PostCSElements a = f.getPostCSAccess();
		    c.setLinewrap(2).before(a.getPostKeyword_0());
			setNoSpaceLineWrap(c, a.getColonKeyword_2());
//		    c.setIndentation(a.getColonKeyword_2(), a.getExpressionAssignment_3());
		    c.setLinewrap(2).after(a.getExpressionAssignment_3());
	    }
	    {
			PreCSElements a = f.getPreCSAccess();
		    c.setLinewrap(2).before(a.getPreKeyword_0());
			setNoSpaceLineWrap(c, a.getColonKeyword_2());
//		    c.setIndentation(a.getColonKeyword_2(), a.getExpressionAssignment_3());
		    c.setLinewrap(2).after(a.getExpressionAssignment_3());
	    }
	    {
	    	PropertyContextDeclCSElements a = f.getPropertyContextDeclCSAccess();
		    c.setLinewrap(2).before(a.getContextKeyword_0());
		    c.setLinewrap(2).after(a.getTypeAssignment_3());
	    }
	    {
	    	QualifiedClassifierRefCSElements a = f.getQualifiedClassifierRefCSAccess();
		    c.setNoSpace().around(a.getColonColonKeyword_1());
	    }
	    {
	    	QualifiedOperationRefCSElements a = f.getQualifiedOperationRefCSAccess();
		    c.setNoSpace().around(a.getColonColonKeyword_1());
	    }
	    {
	    	QualifiedPropertyRefCSElements a = f.getQualifiedPropertyRefCSAccess();
		    c.setNoSpace().around(a.getColonColonKeyword_1());
	    }
	    {	// comments
	    	c.setNoLinewrap().before(f.getSL_COMMENTRule());
	    }
	}

	protected void configureNavigatingExpCS(FormattingConfig c, NavigatingExpCSElements a) {
	    c.setNoSpace().around(a.getOpFullStopKeyword_1_0_1_0_0());
	    c.setNoSpace().around(a.getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1());
	}

	protected void configureNavigationExpCS(FormattingConfig c, NavigationExpCSElements a) {
	    c.setNoSpace().around(a.getOpFullStopKeyword_1_0_1_0_0());
	    c.setNoSpace().around(a.getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1());
	}
}