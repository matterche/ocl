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
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.prettyprint;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

/**
 * PrettyPrintOptions defines the capability to provide options to the PrettyPrinter
 */
public abstract class PrettyPrintOptions
{
	/**
	 * Global PrettyPrintOptions apply regardless of pretty printer nesting.
	 */
	public static class Global extends PrettyPrintOptions
	{
		private String indentStep = "  ";
		private int linelength = Integer.MAX_VALUE;
		private final Set<String> reservedNames = new HashSet<String>();
		private final Set<String> restrictedNames = new HashSet<String>();
		private Map<Namespace, String> namespace2alias = new HashMap<Namespace, String>();
		private URI baseURI = null;
		private MetaModelManager metaModelManager = null;
		
		public Global(Namespace scope) {
			super(scope);
		}
		
		public void addAliases(Namespace  namespace, String alias) {
			if (namespace2alias == null) {
				namespace2alias = new HashMap<Namespace, String>();
			}
			namespace2alias.put(namespace, alias);
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
		public String getAlias(Namespace namespace) {
			return namespace2alias != null ? namespace2alias.get(namespace) : null;
		}

		@Override
		public URI getBaseURI() {
			return baseURI;
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

		public Set<Namespace> getAliasedNamespaces() {
			return namespace2alias.keySet();
		}

		@Override
		public MetaModelManager getMetaModelManager() {
			return metaModelManager;
		}
		
		@Override
		public Set<String> getReservedNames() {
			return reservedNames;
		}

		@Override
		public Set<String> getRestrictedNames() {
			return restrictedNames;
		}
		
		public void setAliases(Map<Namespace,String> namespace2alias) {
			this.namespace2alias = namespace2alias;
		}

		public void setBaseURI(URI baseURI) {
			this.baseURI  = baseURI;
		}

		@Override
		public void setIndentStep(String indentStep) {
			this.indentStep = indentStep;
		}

		@Override
		public void setLinelength(int linelength) {
			this.linelength = linelength;
		}

		public void setMetaModelManager(MetaModelManager metaModelManager) {
			this.metaModelManager = metaModelManager;
		}
	}
	
	/**
	 * Local PrettyPrintOptions may be overridden in nested pretty printer contexts.
	 */
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

	/**
	 * Return a name to be used when referencing element as the first element in a qualified name.
	 */
	public String getAlias(Namespace namespace) {
		return getGlobalOptions().getAlias(namespace);
	}

	/**
	 * Return a URI against which to deresolve the first element of qualified names that
	 * reference external resources. Null leaves URIs in global form.
	 */
	public URI getBaseURI() {
		return getGlobalOptions().getBaseURI();
	}

	public abstract Global getGlobalOptions();

	public String getIndentStep() {
		return getGlobalOptions().getIndentStep();
	}

	public int getLinelength() {
		return getGlobalOptions().getLinelength();
	}

	public MetaModelManager getMetaModelManager() {
		return getGlobalOptions().getMetaModelManager();
	}

	public abstract Set<String> getReservedNames();

	public abstract Set<String> getRestrictedNames();

	public Namespace getScope() {
		return scope;
	}

	public void setIndentStep(String indentStep) {
		getGlobalOptions().setIndentStep(indentStep);
	}
	
	public void setLinelength(int linelength) {
		getGlobalOptions().setLinelength(linelength);
	}

	@Deprecated
	public void setUseParentheses(boolean useParentheses) {}
}