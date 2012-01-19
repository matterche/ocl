package org.eclipse.ocl.examples.xtext.essentialocl;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.antlr.runtime.ANTLRReaderStream;

public class MyANTLRReaderStream extends ANTLRReaderStream
{
	public MyANTLRReaderStream(Reader r) throws IOException {
		super(r);
	}
		
	public Reader getReader() {
		return new CharArrayReader(data, 0, n);
	}
}
