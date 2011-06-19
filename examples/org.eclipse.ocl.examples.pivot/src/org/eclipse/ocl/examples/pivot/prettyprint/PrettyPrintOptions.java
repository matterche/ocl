/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D. Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PrettyPrintExprVisitor.java,v 1.7 2011/05/13 18:41:43 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.prettyprint;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.Namespace;

public abstract class PrettyPrintOptions
{
	
	public static class Global extends PrettyPrintOptions
	{
		private String indentStep = "  ";
		private int linelength = Integer.MAX_VALUE;
		private boolean useParentheses = true;
		private final Set<String> reservedNames = new HashSet<String>();
		private final Set<String> restrictedNames = new HashSet<String>();
		
		public Global(Namespace scope) {
			super(scope);
		}
		
		@Override
		public void addReservedNames(Iterable<String> names) {
			for (String name : names) {
				reservedNames.add(name);
				restrictedNames.add(name);
			}
		}
		
		@Override
		public  void addRestrictedNames(Iterable<String> names) {
			for (String name : names) {
				restrictedNames.add(name);
			}
		}
		
		@Override
		public Global getGlobalOptions() {
			return this;
		}

		@Override
		public String getIndentStep() {
			return indentStep;
		}

		@Override
		public int getLinelength() {
			return linelength;
		}

		@Override
		public Set<String> getReservedNames() {
			return reservedNames;
		}

		@Override
		public Set<String> getRestrictedNames() {
			return restrictedNames;
		}

		@Override
		public boolean getUseParentheses() {
			return useParentheses;
		}

		@Override
		public void setIndentStep(String indentStep) {
			this.indentStep = indentStep;
		}

		@Override
		public void setLinelength(int linelength) {
			this.linelength = linelength;
		}

		@Override
		public void setUseParentheses(boolean useParentheses) {
			this.useParentheses = useParentheses;
		}
	}
	
	public static class Local extends PrettyPrintOptions
	{
		private PrettyPrintOptions options;
		private Set<String> reservedNames = null;
		private Set<String> restrictedNames = null;

		public Local(PrettyPrintOptions options, Namespace scope) {
			super(scope);
			this.options = options;
		}
		
		@Override
		public void addReservedNames(Iterable<String> names) {
			if (reservedNames == null) {
				reservedNames = new HashSet<String>();
			}
			if (reservedNames == null) {
				restrictedNames = new HashSet<String>();
			}
			for (String name : names) {
				reservedNames.add(name);
				restrictedNames.add(name);
			}
		}
		
		@Override
		public  void addRestrictedNames(Iterable<String> names) {
			if (reservedNames == null) {
				reservedNames = new HashSet<String>();
			}
			if (reservedNames == null) {
				restrictedNames = new HashSet<String>();
			}
			for (String name : names) {
				restrictedNames.add(name);
			}
		}
		
		@Override
		public Global getGlobalOptions() {
			return options.getGlobalOptions();
		}

		@Override
		public Set<String> getReservedNames() {
			return reservedNames != null ? reservedNames : options.getReservedNames();
		}

		@Override
		public Set<String> getRestrictedNames() {
			return restrictedNames != null ? restrictedNames : options.getRestrictedNames();
		}
	}
	
	protected final Namespace scope;
	
	public PrettyPrintOptions(Namespace scope) {
		this.scope = scope;
	}

	public abstract void addReservedNames(Iterable<String> names);
	
	public abstract void addRestrictedNames(Iterable<String> names);

	public abstract Global getGlobalOptions();

	public String getIndentStep() {
		return getGlobalOptions().getIndentStep();
	}

	public int getLinelength() {
		return getGlobalOptions().getLinelength();
	}

	public abstract Set<String> getReservedNames();

	public abstract Set<String> getRestrictedNames();

	public Namespace getScope() {
		return scope;
	}

	public boolean getUseParentheses() {
		return getGlobalOptions().getUseParentheses();
	}

	public void setIndentStep(String indentStep) {
		getGlobalOptions().setIndentStep(indentStep);
	}
	
	public void setLinelength(int linelength) {
		getGlobalOptions().setLinelength(linelength);
	}

	public void setUseParentheses(boolean useParentheses) {
		getGlobalOptions().setUseParentheses(useParentheses);
	}
}