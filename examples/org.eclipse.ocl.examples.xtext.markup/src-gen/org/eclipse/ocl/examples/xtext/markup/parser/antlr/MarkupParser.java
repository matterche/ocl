/*
* generated by Xtext
*/
package org.eclipse.ocl.examples.xtext.markup.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.ocl.examples.xtext.markup.services.MarkupGrammarAccess;

public class MarkupParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MarkupGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens();
	}
	
	@Override
	protected org.eclipse.ocl.examples.xtext.markup.parser.antlr.internal.InternalMarkupParser createParser(XtextTokenStream stream) {
		return new org.eclipse.ocl.examples.xtext.markup.parser.antlr.internal.InternalMarkupParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Markup";
	}
	
	public MarkupGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MarkupGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}