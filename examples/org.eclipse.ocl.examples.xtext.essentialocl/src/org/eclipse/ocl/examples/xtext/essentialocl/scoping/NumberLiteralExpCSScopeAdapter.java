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
 * $Id: NumberLiteralExpCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:30:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.ocl.examples.pivot.NumericLiteralExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NumberLiteralExpCS;

public class NumberLiteralExpCSScopeAdapter extends ExpCSScopeAdapter<NumberLiteralExpCS, NumericLiteralExp>
{
	private Type type = null;
	
	public NumberLiteralExpCSScopeAdapter(NumberLiteralExpCS csElement) {
		super(csElement, NumericLiteralExp.class);
	}
	
	@Override
	public Type getSynthesizedType() {
		if (type == null) {
			String text = getText();
			if (text.contains(".") || text.contains("E") || text.contains("e")) {
				type = getLibraryRealType();
			}
			else if (text.contains("-")) {
				type = getLibraryIntegerType();
			}
			else {
				type = getLibraryUnlimitedNaturalType();
			}
		}
		return type;
	}
}
