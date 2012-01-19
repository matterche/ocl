package org.eclipse.ocl.examples.xtext.essentialocl;

import java.io.IOException;
import java.io.Reader;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.ocl.examples.xtext.essentialocl.parser.antlr.EssentialOCLParser;
import org.eclipse.xtext.parser.IParseResult;

public class MyEssentialOCLParser extends EssentialOCLParser
{
	public MyEssentialOCLParser() {
		super();
	}

	@Override
	public IParseResult doParse(Reader reader) {
		try {
			
			return parse(getDefaultRuleName(), new MyANTLRReaderStream(reader));
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}
}
