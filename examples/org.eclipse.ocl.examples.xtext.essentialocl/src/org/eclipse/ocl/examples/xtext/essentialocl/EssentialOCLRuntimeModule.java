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
 * $Id: EssentialOCLRuntimeModule.java,v 1.6 2011/05/15 20:22:23 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl;

import org.eclipse.ocl.examples.xtext.essentialocl.parser.antlr.internal.InternalEssentialOCLLexer;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.LexerProvider;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class EssentialOCLRuntimeModule extends org.eclipse.ocl.examples.xtext.essentialocl.AbstractEssentialOCLRuntimeModule
{	
	public static final String LANGUAGE_ID = "org.eclipse.ocl.examples.xtext.essentialocl.EssentialOCL";

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bindConstant().annotatedWith(Names.named(org.eclipse.xtext.validation.CompositeEValidator.USE_EOBJECT_VALIDATOR)).to(false);
	}

	@Override
	public Class<? extends Lexer> bindLexer() {
		return MyEssentialOCLLexer.class;
	}

	@Override
	public Class<? extends IParser> bindIParser() {
		return MyEssentialOCLParser.class;
	}

	@Override
	public Provider<InternalEssentialOCLLexer> provideInternalEssentialOCLLexer() {
		return new MyLexerProvider<InternalEssentialOCLLexer>(MyEssentialOCLLexer.class);
	}

//	public Provider<MyEssentialOCLLexer> provideMyEssentialOCLLexer() {
//		return LexerProvider.create(MyEssentialOCLLexer.class);
//	}
	
//	public Class<? extends CompositeEValidator> bindCompositeEValidator() {
//		return NoEObjectCompositeEValidator.class;
//	}

//	@Override
//	public Class<? extends IScopeProvider> bindIScopeProvider() {
//		return EssentialOCLCSScopeProvider.class;
//	}
}
