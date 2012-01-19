package org.eclipse.ocl.examples.xtext.essentialocl;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;
import org.eclipse.ocl.examples.xtext.essentialocl.parser.antlr.internal.InternalEssentialOCLLexer;
import org.eclipse.xtext.parser.antlr.LexerProvider;

import com.google.inject.Provider;


public class MyLexerProvider<T extends Lexer> implements Provider<T> {

	private final Class<? extends T> clazz;

	public static <T extends Lexer> LexerProvider<T> create(Class<T> clazz) {
		return new LexerProvider<T>(clazz);
	}
	
	public MyLexerProvider(Class<? extends T> clazz) {
		this.clazz = clazz;
	}
	
	/**
	 * Creates a lexer instance via reflection. The object is not created with the default
	 * constructor because it will not initialize the backtracking state of the lexer.
	 * Instead, we pass <code>null</code> as CharStream argument.
	 */
	public T get() {
		try {
			return clazz.getConstructor(CharStream.class).newInstance(new Object[] { null });
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
