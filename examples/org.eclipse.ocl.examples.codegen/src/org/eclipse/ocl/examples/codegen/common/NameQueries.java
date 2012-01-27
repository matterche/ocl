/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.codegen.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TupleLiteralPart;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;

public class NameQueries
{
	public static abstract class NameAllocation<T>
	{
		private Map<T, String> mappings = new HashMap<T, String>();
		private Set<String> used = new HashSet<String>();
		
		protected abstract String computeUniqueText(T string);
		
		public String get(T string) {
			String uniqueString = mappings.get(string);
			if (uniqueString == null) {
				uniqueString = computeUniqueText(string);
				used.add(uniqueString);
				mappings.put(string, uniqueString);			
			}
			return uniqueString;
		}

		protected boolean isUsed(String string) {
			return used.contains(string);
		}
	}
	
	public static class TuplePartAllocation
	{
		private Map<String, Map<Type, String>> mappings = new HashMap<String, Map<Type, String>>();
		private Set<String> used = new HashSet<String>();

		protected String computeUniqueText(String partName, Type partType) {
			StringBuilder s = new StringBuilder();
			appendJavaCharacters(s, partName);
			s.append('_');
			appendJavaCharacters(s, String.valueOf(partType));
			if (isUsed(s.toString())) {
				for (int i = 1; true; i++) {
					if (!isUsed(s.toString() + '_' + Integer.toString(i))) {
						s.append(i);
						break;
					}
				}
			}
			return s.toString();
		}
		
		public String get(String partName, Type partType) {
			Map<Type, String> typeMaps = mappings.get(partName);
			if (typeMaps == null) {
				typeMaps = new HashMap<Type, String>();
				mappings.put(partName, typeMaps);			
			}
			String uniqueString = typeMaps.get(partType);
			if (uniqueString == null) {
				uniqueString = computeUniqueText(partName, partType);
				used.add(uniqueString);
				typeMaps.put(partType, uniqueString);			
			}
			return uniqueString;
		}

		protected boolean isUsed(String string) {
			return used.contains(string);
		}
	}
	
	private static Map<String, Integer> counters = new HashMap<String, Integer>();
	private static Map<Object, String> definedSymbols = new HashMap<Object, String>();
	private static Map<Element, NameAllocation<Constraint>> uniqueConstraints = new HashMap<Element, NameAllocation<Constraint>>();
	private static Map<Element, NameAllocation<Operation>> uniqueOperations = new HashMap<Element, NameAllocation<Operation>>();
	private static Map<Element, NameAllocation<Property>> uniqueProperties = new HashMap<Element, NameAllocation<Property>>();
	private static Map<Element, NameAllocation<String>> uniqueStrings = new HashMap<Element, NameAllocation<String>>();
	private static Map<Element, TuplePartAllocation> uniqueTupleParts = new HashMap<Element, TuplePartAllocation>();
	private static Map<Element, NameAllocation<TupleType>> uniqueTupleTypes = new HashMap<Element, NameAllocation<TupleType>>();
	private static Map<Element, NameAllocation<Type>> uniqueTypes = new HashMap<Element, NameAllocation<Type>>();
	private static Map<Element, NameAllocation<Variable>> uniqueVariables = new HashMap<Element, NameAllocation<Variable>>();

	protected static void appendJavaCharacters(StringBuilder s, String string) {
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (Character.isJavaIdentifierPart(c)) {
				s.append(c);
			}
			else {
				s.append('_');
			}
		}
	}

	protected static void appendJavaCharacters(StringBuilder s, String string, int iMax) {
		for (int i = 0; i < Math.min(iMax, string.length()); i++) {
			char c = string.charAt(i);
			if (Character.isJavaIdentifierPart(c)) {
				s.append(c);
			}
			else {
				s.append('_');
			}
		}
	}

	public static String defineSymbolName(Object elem, String symbol) {
		definedSymbols.put(elem, symbol);
		return symbol;
	}
	
	public static String encodeName(NamedElement element) {
		String rawEncodeName = rawEncodeName(element.getName());
		if (element instanceof Operation) {
			int sameNames = 0;
			int myIndex = 0;
			for (Operation operation : ((Operation)element).getOwningType().getOwnedOperations()) {
				String rawName = rawEncodeName(operation.getName());
				if (rawName.equals(rawEncodeName)) {
					if (operation == element) {
						myIndex = sameNames;
					}
					sameNames++;
				}
			}
			if (sameNames > 1) {
				return myIndex + "_" + rawEncodeName;
			}
		}
		return rawEncodeName;
	}
	
	/**
	 * Return a symbol name for an eObject. This method is invoked from an
	 * Acceleo script and so there is only one call per distinct object. Acceleo
	 * maintains the cache that returns the symbol for old objects.
	 * 
	 * @param eObject the object in question
	 * @return the symbol name
	 */
	public static String getSymbolName(Object elem) {
		return getPrefixedSymbolName("symbol_", elem);
	}

	public static String getPrefixedSymbolName(String prefix, Object elem) {
		String symbol = definedSymbols.get(elem);
		if (symbol == null) {
			Integer count = counters.get(prefix);
			Integer newCount = count != null ? count+1 : 0;
			counters.put(prefix, newCount);
			symbol = prefix + newCount.toString();
			definedSymbols.put(elem, symbol);
		}
		return symbol;
	}
	
	/**
	 * Return a valid Java identifier suffix encoding of string that is unique within the scope of element.
	 */
	public static String getUniqueText(Element context, Constraint constraint) {
		NameAllocation<Constraint> allocation = uniqueConstraints.get(context);
		if (allocation == null) {
			allocation = new NameAllocation<Constraint>()
			{
				@Override
				protected String computeUniqueText(Constraint constraint) {
					StringBuilder s = new StringBuilder();
					String name = constraint.getName();
					if (name == null) {
						@SuppressWarnings("unchecked")
						List<Constraint> constraints = (List<Constraint>) constraint.eContainer().eGet(constraint.eContainmentFeature());
						name = Integer.toString(constraints.indexOf(constraint));
					}
					appendJavaCharacters(s, name);
					if (isUsed(s.toString())) {
						s.append("___");
						if (isUsed(s.toString())) {
							for (int i = 1; true; i++) {
								if (!isUsed(s.toString() + Integer.toString(i))) {
									s.append(i);
									break;
								}
							}
						}
					}
					return s.toString();
				}

			};
			uniqueConstraints.put(context, allocation);			
		}
		return allocation.get(constraint);
	}
	
	/**
	 * Return a valid Java identifier suffix encoding of an operation name that is unique within the scope of element.
	 */
	public static String getUniqueText(Element context, Operation operation) {
		NameAllocation<Operation> allocation = uniqueOperations.get(context);
		if (allocation == null) {
			allocation = new NameAllocation<Operation>()
			{
				@Override
				protected String computeUniqueText(Operation operation) {
					StringBuilder s = new StringBuilder();
					appendJavaCharacters(s, operation.getOwningType().getName());
					s.append('_');
					String string = operation.getName();
					for (int i = 0; i < string.length(); i++) {
						char c = string.charAt(i);
						if (Character.isJavaIdentifierPart(c)) {
							s.append(c);
						}
						else if (c == '=') {
							s.append("_eq_");
						}
						else if (c == '+') {
							s.append("_add_");
						}
						else if (c == '-') {
							s.append("_sub_");
						}
						else if (c == '/') {
							s.append("_div_");
						}
						else if (c == '*') {
							s.append("_mul_");
						}
						else if (c == '<') {
							s.append("_lt_");
						}
						else if (c == '>') {
							s.append("_gt_");
						}
						else {
							s.append('_');
						}
					}
					if (isUsed(s.toString())) {
						for (int i = 1; true; i++) {
							if (!isUsed(s.toString() + '_' + Integer.toString(i))) {
								s.append(i);
								break;
							}
						}
					}
					return s.toString();
				}
			};
			uniqueOperations.put(context, allocation);			
		}
		return allocation.get(operation);
	}
	
	/**
	 * Return a valid Java identifier suffix encoding of a property name that is unique within the scope of element.
	 */
	public static String getUniqueText(Element context, Property property) {
		if (property.eContainer() instanceof TupleType) {
			TuplePartAllocation allocation = uniqueTupleParts.get(context);
			if (allocation == null) {
				allocation = new TuplePartAllocation();
				uniqueTupleParts.put(context, allocation);			
			}
			return allocation.get(property.getName(), property.getType());
		}
		NameAllocation<Property> allocation = uniqueProperties.get(context);
		if (allocation == null) {
			allocation = new NameAllocation<Property>()
			{
				@Override
				protected String computeUniqueText(Property property) {
					StringBuilder s = new StringBuilder();
					appendJavaCharacters(s, property.getOwningType().getName());
					s.append('_');
					appendJavaCharacters(s, property.getName());
					if (isUsed(s.toString())) {
						for (int i = 1; true; i++) {
							if (!isUsed(s.toString() + '_' + Integer.toString(i))) {
								s.append(i);
								break;
							}
						}
					}
					return s.toString();
				}
			};
			uniqueProperties.put(context, allocation);			
		}
		return allocation.get(property);
	}
	
	/**
	 * Return a valid Java identifier suffix encoding of string that is unique within the scope of element.
	 */
	public static String getUniqueText(Element context, String string) {
		NameAllocation<String> allocation = uniqueStrings.get(context);
		if (allocation == null) {
			allocation = new NameAllocation<String>()
			{
				@Override
				protected String computeUniqueText(String string) {
					StringBuilder s = new StringBuilder();
					int iSize = string.length();
					int iMax = 8;
					appendJavaCharacters(s, string, iMax);
					if ((iSize > 8) || isUsed(s.toString())) {
						s.append("___");
						if (isUsed(s.toString())) {
							for (int i = 1; true; i++) {
								if (!isUsed(s.toString() + Integer.toString(i))) {
									s.append(i);
									break;
								}
							}
						}
					}
					return s.toString();
				}

			};
			uniqueStrings.put(context, allocation);			
		}
		return allocation.get(string);
	}
	
	/**
	 * Return a valid Java identifier suffix encoding of a property name that is unique within the scope of element.
	 */
	public static String getUniqueText(Element context, TupleLiteralPart part) {
		TuplePartAllocation allocation = uniqueTupleParts.get(context);
		if (allocation == null) {
			allocation = new TuplePartAllocation();
			uniqueTupleParts.put(context, allocation);			
		}
		return allocation.get(part.getName(), part.getType());
	}
	
	/**
	 * Return a valid Java identifier suffix encoding of a property name that is unique within the scope of element.
	 */
	public static String getUniqueText(Element context, TupleType type) {
		NameAllocation<TupleType> allocation = uniqueTupleTypes.get(context);
		if (allocation == null) {
			allocation = new NameAllocation<TupleType>()
			{
				@Override
				protected String computeUniqueText(TupleType type) {
					StringBuilder s = new StringBuilder();
					String name = String.valueOf(type);
					appendJavaCharacters(s, name);
					if (isUsed(s.toString())) {
						for (int i = 1; true; i++) {
							if (!isUsed(s.toString() + '_' + Integer.toString(i))) {
								s.append(i);
								break;
							}
						}
					}
					return s.toString();
				}
			};
			uniqueTupleTypes.put(context, allocation);			
		}
		return allocation.get(type);
	}
	
	/**
	 * Return a valid Java identifier suffix encoding of a property name that is unique within the scope of element.
	 */
	public static String getUniqueText(Element context, Type type) {
		NameAllocation<Type> allocation = uniqueTypes.get(context);
		if (allocation == null) {
			allocation = new NameAllocation<Type>()
			{
				@Override
				protected String computeUniqueText(Type type) {
					StringBuilder s = new StringBuilder();
					appendJavaCharacters(s, String.valueOf(type));
					if (isUsed(s.toString())) {
						for (int i = 1; true; i++) {
							if (!isUsed(s.toString() + '_' + Integer.toString(i))) {
								s.append(i);
								break;
							}
						}
					}
					return s.toString();
				}
			};
			uniqueTypes.put(context, allocation);			
		}
		return allocation.get(type);
	}
	
	/**
	 * Return a valid Java identifier suffix encoding of a variable name that is unique within the scope of element.
	 */
	public static String getUniqueText(Element context, Variable variable) {
		NameAllocation<Variable> allocation = uniqueVariables.get(context);
		if (allocation == null) {
			allocation = new NameAllocation<Variable>()
			{
				@Override
				protected String computeUniqueText(Variable variable) {
					StringBuilder s = new StringBuilder();
					appendJavaCharacters(s, variable.getName());
					if (isUsed(s.toString())) {
						for (int i = 1; true; i++) {
							if (!isUsed(s.toString() + '_' + Integer.toString(i))) {
								s.append(i);
								break;
							}
						}
					}
					return s.toString();
				}
			};
			uniqueVariables.put(context, allocation);			
		}
		return allocation.get(variable);
	}

	public static String rawEncodeName(String name) {
		StringBuilder s = new StringBuilder();
//		boolean prevCharIsLower = true;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
//			boolean charIsLowerCase = Character.isLowerCase(ch);
			/*if (charIsLowerCase) {
				s.append(Character.toUpperCase(ch));
			}
			else if (Character.isUpperCase(ch)) {
				if (prevCharIsLower) {
					s.append('_');
				}
				s.append(ch);
			}
			else if (Character.isJavaIdentifierPart(ch)) {
				s.append(ch);
			}
			else*/ if (ch == '<') {
				s.append("_lt_");
			}
			else if (ch == '>') {
				s.append("_gt_");
			}
			else if (ch == '=') {
				s.append("_eq_");
			}
			else if (ch == '+') {
				s.append("_add_");
			}
			else if (ch == '-') {
				s.append("_sub_");
			}
			else if (ch == '*') {
				s.append("_mul_");
			}
			else if (ch == '/') {
				s.append("_div_");
			}
			else if (!Character.isJavaIdentifierPart(ch)) {
				s.append("_" + Integer.toString(ch) + "_");
			}
			else {
				s.append(ch);
			}
//			if ((''))
//			prevCharIsLower = charIsLowerCase;
		}
		return s.toString();
	}
}
