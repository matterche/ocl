/**
 * <copyright>
 * 
 * Copyright (c) 2009,2011 Eclipse Modeling Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   L.Goubet, E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EvaluateStringOperationsTest.java,v 1.3 2011/05/07 16:41:27 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.tests;

import java.util.regex.PatternSyntaxException;

import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.osgi.util.NLS;

/**
 * Tests for String operations.
 */
@SuppressWarnings("nls")
public class EvaluateStringOperationsTest extends PivotTestSuite
{
    @Override
    protected void setUp() throws Exception {
        super.setUp();
//        helper.setContext(getMetaclass("Package"));
        helper.setContext(metaModelManager.getAnyClassifierType());
    }

	public void testStringAt() {
		assertQueryEquals(null, "t", "'test'.at(1)");
		assertQueryEquals(null, "e", "'test'.at(2)");
		assertQueryEquals(null, "t", "'test'.at(4)");
		// out of bounds
		assertQueryInvalid(null, "'test'.at(0)");
		assertQueryInvalid(null, "'test'.at(5)");
		assertQueryInvalid(null, "''.at(1)");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s.at(1)");
		// null
		assertQueryInvalid(null, "let s : String = null in s.at(1)");
	}

	public void testStringCharacters() {
		assertQueryEquals(null, new String[] {}, "''.characters()");
		assertQueryEquals(null, new String[] {"a"}, "'a'.characters()");
		assertQueryEquals(null, new String[] {"a", "\r", "\n", "b"}, "'a\\r\nb'.characters()");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s.characters()");
		// null
		assertQueryInvalid(null, "let s : String = null in s.characters()");
	}

	public void testStringConcat() {
		assertQueryEquals(null, "concatenationTest", "'concatenation'.concat('Test')");
		assertQueryEquals(null, "concatenation\n", "'concatenation'.concat('\\n')");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in 'concatenation'.concat(s)");
		assertQueryInvalid(null, "let s : String = invalid in s.concat('concatenation')");
		// null
		assertQueryInvalid(null, "let s : String = null in 'concatenation'.concat(s)");
		assertQueryInvalid(null, "let s : String = null in s.concat('concatenation')");
	}

	public void testStringEqual() {
		assertQueryFalse(null, "'test' = 'se'");
		assertQueryTrue(null, "'test' = 'test'");
		assertQueryFalse(null, "'tESt' = 'TesT'");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s = 'se'");
		assertQueryInvalid(null, "let s : String = invalid in 'test' = s");
		assertQueryInvalid(null, "let s1 : String = invalid, s2 : String = invalid in s1 = s2");
		// null
		assertQueryFalse(null, "let s : String = null in s = 'se'");
		assertQueryFalse(null, "let s : String = null in 'test' = s");
		assertQueryTrue(null, "let s1 : String = null, s2 : String = null in s1 = s2");
	}

	public void testStringEqualIgnoresCase() {
		assertQueryFalse(null, "'test'.equalsIgnoreCase('se')");
		assertQueryTrue(null, "'test'.equalsIgnoreCase('test')");
		assertQueryTrue(null, "'Test'.equalsIgnoreCase('tEst')");
		assertQueryTrue(null, "'tesT'.equalsIgnoreCase('teSt')");
		assertQueryTrue(null, "'TEST'.equalsIgnoreCase('test')");
		assertQueryTrue(null, "'test'.equalsIgnoreCase('TEST')");
	}

	public void testStringGreaterThan() {
		// FIXME Analyzer-extraOperation String::> should not be defined
		assertQueryFalse(null, "'3' > '4'");
		assertQueryFalse(null, "'a' > 'b'");
		assertQueryFalse(null, "'aardvark' > 'aardvarks'");

		assertQueryTrue(null, "'3.2' > '3.1'");
		assertQueryTrue(null, "'a' > 'A'");
		assertQueryTrue(null, "'aardvark' > 'aardvarK'");

		assertQueryFalse(null, "'3' > '3'");
		assertQueryFalse(null, "'a' > 'a'");
		assertQueryFalse(null, "'aardvark' > 'aardvark'");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s > 'se'");
		assertQueryInvalid(null, "let s : String = invalid in 'test' > s");
		assertQueryInvalid(null, "let s1 : String = invalid, s2 : String = invalid in s1 > s2");
		// null
		assertQueryInvalid(null, "let s : String = null in s > 'se'");
		assertQueryInvalid(null, "let s : String = null in 'test' > s");
		assertQueryInvalid(null, "let s1 : String = null, s2 : String = null in s1 > s2");
	}

	public void testStringGreaterThanOrEqual() {
		// FIXME Analyzer-extraOperation String::>= should not be defined
		assertQueryFalse(null, "'3' >= '4'");
		assertQueryFalse(null, "'a' >= 'b'");
		assertQueryFalse(null, "'aardvark' >= 'aardvarks'");

		assertQueryTrue(null, "'3.2' >= '3.1'");
		assertQueryTrue(null, "'a' >= 'A'");
		assertQueryTrue(null, "'aardvark' >= 'aardvarK'");

		assertQueryTrue(null, "'3' >= '3'");
		assertQueryTrue(null, "'a' >= 'a'");
		assertQueryTrue(null, "'aardvark' >= 'aardvark'");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s >= 'se'");
		assertQueryInvalid(null, "let s : String = invalid in 'test' >= s");
		assertQueryInvalid(null, "let s1 : String = invalid, s2 : String = invalid in s1 >= s2");
		// null
		assertQueryInvalid(null, "let s : String = null in s >= 'se'");
		assertQueryInvalid(null, "let s : String = null in 'test' >= s");
		assertQueryInvalid(null, "let s1 : String = null, s2 : String = null in s1 >= s2");
	}

	public void testStringIndexOf() {
		assertQueryEquals(null, 1, "'test'.indexOf('t')");
		assertQueryEquals(null, 1, "'test'.indexOf('te')");
		assertQueryEquals(null, 2, "'test'.indexOf('es')");
		assertQueryEquals(null, 3, "'test'.indexOf('st')");
		assertQueryEquals(null, 5, "'tesla'.indexOf('a')");
		// out of bounds
		assertQueryEquals(null, 0, "'test'.indexOf('xyzzy')");
		assertQueryEquals(null, 0, "'test'.indexOf('est2')");
		// empty
		assertQueryEquals(null, 1, "'test'.indexOf('')");
		assertQueryEquals(null, 0, "''.indexOf('')");
		assertQueryEquals(null, 0, "''.indexOf('t')");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in 'test'.indexOf(s)");
		assertQueryInvalid(null, "let s : String = invalid in s.indexOf('s')");
		// null
		assertQueryInvalid(null, "let s : String = null in 'test'.indexOf(s)");
		assertQueryInvalid(null, "let s : String = null in s.indexOf('s')");
	}

	public void testStringLessThan() {
		// FIXME Analyzer-extraOperation String::< should not be defined
		assertQueryTrue(null, "'3' < '4'");
		assertQueryTrue(null, "'a' < 'b'");
		assertQueryTrue(null, "'aardvark' < 'aardvarks'");

		assertQueryFalse(null, "'3.2' < '3.1'");
		assertQueryFalse(null, "'a' < 'A'");
		assertQueryFalse(null, "'aardvark' < 'aardvarK'");

		assertQueryFalse(null, "'3' < '3'");
		assertQueryFalse(null, "'a' < 'a'");
		assertQueryFalse(null, "'aardvark' < 'aardvark'");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s < 'se'");
		assertQueryInvalid(null, "let s : String = invalid in 'test' < s");
		assertQueryInvalid(null, "let s1 : String = invalid, s2 : String = invalid in s1 < s2");
		// null
		assertQueryInvalid(null, "let s : String = null in s < 'se'");
		assertQueryInvalid(null, "let s : String = null in 'test' < s");
		assertQueryInvalid(null, "let s1 : String = null, s2 : String = null in s1 < s2");
	}

	public void testStringLessThanOrEqual() {
		// FIXME Analyzer-extraOperation String::<= should not be defined
		assertQueryTrue(null, "'3' <= '4'");
		assertQueryTrue(null, "'a' <= 'b'");
		assertQueryTrue(null, "'aardvark' <= 'aardvarks'");

		assertQueryFalse(null, "'3.2' <= '3.1'");
		assertQueryFalse(null, "'a' <= 'A'");
		assertQueryFalse(null, "'aardvark' <= 'aardvarK'");

		assertQueryTrue(null, "'3' <= '3'");
		assertQueryTrue(null, "'a' <= 'a'");
		assertQueryTrue(null, "'aardvark' <= 'aardvark'");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s <= 'se'");
		assertQueryInvalid(null, "let s : String = invalid in 'test' <= s");
		assertQueryInvalid(null, "let s1 : String = invalid, s2 : String = invalid in s1 <= s2");
		// null
		assertQueryInvalid(null, "let s : String = null in s <= 'se'");
		assertQueryInvalid(null, "let s : String = null in 'test' <= s");
		assertQueryInvalid(null, "let s1 : String = null, s2 : String = null in s1 <= s2");
	}

	public void testStringMatches() {
		assertQueryTrue(null, "'characters and spaces'.matches('[\\\\w\\\\s]+')");		// *2 for Java, *2 for OCL
		assertQueryFalse(null, "'characters and 3 digits'.matches('[\\\\p{Alpha}\\\\s]+')");
		//
		assertQueryTrue(null, "''.matches('')");
		assertQueryTrue(null, "''.matches('')");
		assertQueryFalse(null, "'a'.matches('')");
		assertQueryFalse(null, "''.matches('b')");
		//
		assertQueryInvalid(null, "'repla ce operation'.matches('a[b-')", null, PatternSyntaxException.class);
		//
		assertQueryInvalid(null, "null.matches('(\\\\w+)\\\\s*')");
		assertQueryInvalid(null, "'repla ce operation'.matches(null)");
		//
		assertQueryInvalid(null, "invalid.matches('(\\\\w+)\\\\s*')");
		assertQueryInvalid(null, "'repla ce operation'.matches(invalid)");
	}

	public void testStringNotEqual() {
		assertQueryTrue(null, "'test' <> 'se'");
		assertQueryFalse(null, "'test' <> 'test'");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s <> 'se'");
		assertQueryInvalid(null, "let s : String = invalid in 'test' <> s");
		assertQueryInvalid(null, "let s1 : String = invalid, s2 : String = invalid in s1 <> s2");
		// null
		assertQueryTrue(null, "let s : String = null in s <> 'se'");
		assertQueryTrue(null, "let s : String = null in 'test' <> s");
		assertQueryFalse(null, "let s1 : String = null, s2 : String = null in s1 <> s2");
	}

	public void testStringOclAsType() {
		assertQueryInvalid(null, "'test'.oclAsType(Integer)");
		assertQueryEquals(null, "test", "'test'.oclAsType(String)");
		assertQueryEquals(null, "test", "'test'.oclAsType(OclAny)");
		assertQueryInvalid(null, "'test'.oclAsType(OclVoid)");
		assertQueryInvalid(null, "'test'.oclAsType(OclInvalid)");
	}

	public void testStringOclIsInvalid() {
		assertQueryFalse(null, "'test'.oclIsInvalid()");
		assertQueryFalse(null, "''.oclIsInvalid()");
	}

	public void testStringOclIsKindOf() {
		assertQueryFalse(null, "'test'.oclIsKindOf(Integer)");
		assertQueryTrue(null, "'test'.oclIsKindOf(String)");
		assertQueryTrue(null, "'test'.oclIsKindOf(OclAny)");
		assertQueryFalse(null, "'test'.oclIsKindOf(OclVoid)");
		assertQueryFalse(null, "'test'.oclIsKindOf(OclInvalid)");
	}

	public void testStringOclIsTypeOf() {
		assertQueryFalse(null, "'test'.oclIsTypeOf(Integer)");
		assertQueryTrue(null, "'test'.oclIsTypeOf(String)");
		assertQueryFalse(null, "'test'.oclIsTypeOf(OclAny)");
		assertQueryFalse(null, "'test'.oclIsTypeOf(OclVoid)");
		assertQueryFalse(null, "'test'.oclIsTypeOf(OclInvalid)");
	}

	public void testStringOclIsUndefined() {
		assertQueryFalse(null, "'test'.oclIsUndefined()");
		assertQueryFalse(null, "''.oclIsUndefined()");
	}

	public void testStringPlus() {
		assertQueryEquals(null, "concatenationTest", "'concatenation' + 'Test'");
		assertQueryEquals(null, "concatenation\n", "'concatenation' + '\\n'");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in 'concatenation' + s");
		assertQueryInvalid(null, "let s : String = invalid in s + 'concatenation'");
		// null
		assertQueryInvalid(null, "let s : String = null in 'concatenation' + s");
		assertQueryInvalid(null, "let s : String = null in s + 'concatenation'");
	}

	public void testStringReplaceAll() {
		assertQueryEquals(null, "rePlaceAll oPeration", "'replaceAll operation'.replaceAll('p', 'P')");
		assertQueryEquals(null, "ReplaceAllOperation", "'Repla ce All Operation'.replaceAll('(\\\\w+)\\\\s*', '$1')");
		//
		assertQueryEquals(null, "xx", "''.replaceAll('', 'xx')");
		assertQueryEquals(null, "xxrxxexxpxxlxxaxx xxcxxexx xxoxxpxxexxrxxaxxtxxixxoxxnxx", "'repla ce operation'.replaceAll('', 'xx')");
		assertQueryEquals(null, "", "'repla ce operation'.replaceAll('(\\\\w+)\\\\s*', '')");
		assertQueryEquals(null, "repla ce operation", "'repla ce operation'.replaceAll('', '')");
		//
		assertQueryInvalid(null, "'repla ce operation'.replaceAll('a[b-', '$1')", null, PatternSyntaxException.class);
		assertQueryInvalid(null, "'repla ce operation'.replaceAll('', '$1')", "No group 1", IndexOutOfBoundsException.class);
		//
		assertQueryInvalid(null, "null.replaceAll('(\\\\w+)\\\\s*', '$1')");
		assertQueryInvalid(null, "'repla ce operation'.replaceAll(null, '$1')");
		assertQueryInvalid(null, "'repla ce operation'.replaceAll('(\\\\w+)\\\\s*', null)");
		//
		assertQueryInvalid(null, "invalid.replaceAll('(\\\\w+)\\\\s*', '$1')");
		assertQueryInvalid(null, "'repla ce operation'.replaceAll(invalid, '$1')");
		assertQueryInvalid(null, "'repla ce operation'.replaceAll('(\\\\w+)\\\\s*', invalid)");
	}

	public void testStringReplaceFirst() {
		assertQueryEquals(null, "rePlace operation", "'replace operation'.replaceFirst('p', 'P')");
		assertQueryEquals(null, "replace operation", "'repla ce operation'.replaceFirst('(\\\\w+)\\\\s*', '$1')");
		//
		assertQueryEquals(null, "xx", "''.replaceFirst('', 'xx')");
		assertQueryEquals(null, "xxrepla ce operation", "'repla ce operation'.replaceFirst('', 'xx')");
		assertQueryEquals(null, "ce operation", "'repla ce operation'.replaceFirst('(\\\\w+)\\\\s*', '')");
		assertQueryEquals(null, "repla ce operation", "'repla ce operation'.replaceFirst('', '')");
		//
		assertQueryInvalid(null, "'repla ce operation'.replaceFirst('a[b-', '$1')", null, PatternSyntaxException.class);
		assertQueryInvalid(null, "'repla ce operation'.replaceFirst('', '$1')", "No group 1", IndexOutOfBoundsException.class);
		//
		assertQueryInvalid(null, "null.replaceFirst('(\\\\w+)\\\\s*', '$1')");
		assertQueryInvalid(null, "'repla ce operation'.replaceFirst(null, '$1')");
		assertQueryInvalid(null, "'repla ce operation'.replaceFirst('(\\\\w+)\\\\s*', null)");
		//
		assertQueryInvalid(null, "invalid.replaceFirst('(\\\\w+)\\\\s*', '$1')");
		assertQueryInvalid(null, "'repla ce operation'.replaceFirst(invalid, '$1')");
		assertQueryInvalid(null, "'repla ce operation'.replaceFirst('(\\\\w+)\\\\s*', invalid)");
	}

	public void testStringSize() {
		assertQueryEquals(null, Integer.valueOf(4), "'test'.size()"); //$NON-NLS-2$
		assertQueryEquals(null, Integer.valueOf(0), "''.size()"); //$NON-NLS-2$
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s.size()"); //$NON-NLS-2$
		// null
		assertQueryInvalid(null, "let s : String = null in s.size()"); //$NON-NLS-2$
	}

	public void testStringSubstituteAll() {
		assertQueryEquals(null, "subsTiTuTeAll operaTion", "'substituteAll operation'.substituteAll('t', 'T')");
		//
		assertQueryEquals(null, "xx", "''.replaceAll('', 'xx')");
		assertQueryEquals(null, "xxrxxexxpxxlxxaxx xxcxxexx xxoxxpxxexxrxxaxxtxxixxoxxnxx", "'repla ce operation'.substituteAll('', 'xx')");
		assertQueryEquals(null, "repla ce operation", "'repla ce operation'.substituteAll('(\\\\w+)\\\\s*', '')");
		assertQueryEquals(null, "repla ce operation", "'repla ce operation'.substituteAll('', '')");
		//
		assertQueryInvalid(null, "null.substituteAll('(\\\\w+)\\\\s*', '$1')");
		assertQueryInvalid(null, "'repla ce operation'.substituteAll(null, '$1')");
		assertQueryInvalid(null, "'repla ce operation'.substituteAll('(\\\\w+)\\\\s*', null)");
		//
		assertQueryInvalid(null, "invalid.substituteAll('(\\\\w+)\\\\s*', '$1')");
		assertQueryInvalid(null, "'repla ce operation'.substituteAll(invalid, '$1')");
		assertQueryInvalid(null, "'repla ce operation'.substituteAll('(\\\\w+)\\\\s*', invalid)");
	}

	public void testStringSubstituteFirst() {
		assertQueryEquals(null, "subsTiTuTeFirst operaTion", "'substiTuTeFirst operaTion'.substituteFirst('t', 'T')");
		assertQueryEquals(null, "SubstiTuTeFirst operaTion", "'substiTuTeFirst operaTion'.substituteFirst('s', 'S')");
		assertQueryEquals(null, "substiTuTeFirst operaTioN", "'substiTuTeFirst operaTion'.substituteFirst('n', 'N')");
		assertQueryEquals(null, "substiTuTeFirst operaTion", "'substiTuTeFirst operaTion'.substituteFirst('n', 'n')");
		assertQueryEquals(null, "substiTuTeFirst operaTiON", "'substiTuTeFirst operaTion'.substituteFirst('on', 'ON')");
		assertQueryEquals(null, "a[b-c]d\r\n*", "'a[b-c]d\\\\w*'.substituteFirst('\\\\w', '\r\n')");
		//
		assertQueryEquals(null, "xx", "''.substituteFirst('', 'xx')");
		assertQueryEquals(null, "xxrepla ce operation", "'repla ce operation'.substituteFirst('', 'xx')");
		assertQueryEquals(null, "repla ce operation", "'repla ce operation'.substituteFirst('', '')");
		//
		assertQueryInvalid(null, "'repla ce operation'.substituteFirst('(\\\\w+)\\\\s*', '')",
			DomainUtil.bind(EvaluatorMessages.MissingSubstring, "(\\w+)\\s*", "repla ce operation"), null);
		//
		assertQueryInvalid(null, "null.substituteFirst('(\\\\w+)\\\\s*', '$1')");
		assertQueryInvalid(null, "'repla ce operation'.substituteFirst(null, '$1')");
		assertQueryInvalid(null, "'repla ce operation'.substituteFirst('(\\\\w+)\\\\s*', null)");
		//
		assertQueryInvalid(null, "invalid.substituteFirst('(\\\\w+)\\\\s*', '$1')");
		assertQueryInvalid(null, "'repla ce operation'.substituteFirst(invalid, '$1')");
		assertQueryInvalid(null, "'repla ce operation'.substituteFirst('(\\\\w+)\\\\s*', invalid)");
	}

	public void testStringSubstring() {
		assertQueryEquals(null, "t", "'test'.substring(1, 1)");
		assertQueryEquals(null, "es", "'test'.substring(2, 3)");
		assertQueryEquals(null, "t", "'test'.substring(4, 4)");
		// illegal
		assertQueryInvalid(null, "'test'.substring(2, 1)");
		assertQueryInvalid(null, "'test'.substring(3, 1)");
		// out of bounds
		assertQueryInvalid(null, "'test'.substring(0, 1)");
		assertQueryInvalid(null, "'test'.substring(4, 5)");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s.substring(1, 1)");
		assertQueryInvalid(null, "let s : String = invalid in s.substring(5, 5)");
		// null
		assertQueryInvalid(null, "let s : String = null in s.substring(1, 1)");
		assertQueryInvalid(null, "let s : String = null in s.substring(5, 5)");
	}

	public void testStringToBoolean() {
		assertQueryTrue(null, "'true'.toBoolean()");
		assertQueryFalse(null, "' true'.toBoolean()");
		assertQueryFalse(null, "'true '.toBoolean()");
		assertQueryFalse(null, "'True'.toBoolean()");
		assertQueryFalse(null, "'false'.toBoolean()");
		assertQueryFalse(null, "'-4'.toBoolean()");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s.toBoolean()");
		// null
		assertQueryInvalid(null, "let s : String = null in s.toBoolean()");
	}

	public void testStringToInteger() {
		assertQueryEquals(null, Integer.valueOf(4), "'4'.toInteger()");
		assertQueryEquals(null, Integer.valueOf(-4), "'-4'.toInteger()");
		assertQueryInvalid(null, "'4.0'.toInteger()", NLS.bind(EvaluatorMessages.InvalidInteger, "4.0"), NumberFormatException.class);

		assertQueryInvalid(null, "'2.4.0'.toInteger()");
		assertQueryInvalid(null, "'a'.toInteger()");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s.toInteger()");
		// null
		assertQueryInvalid(null, "let s : String = null in s.toInteger()");
	}

	public void testStringToLowerCase() {
//		checkForUTF8Encoding()		
		assertQueryEquals(null, "4", "'4'.toLowerCase()"); //$NON-NLS-2$
		assertQueryEquals(null, "mixed", "'MiXeD'.toLowerCase()"); //$NON-NLS-2$
		assertQueryEquals(null, "upper", "'UPPER'.toLowerCase()"); //$NON-NLS-2$
		// Ensures word-final sigma and regular sigmas are converted as needed
		// TODO re-enable once the Unicode problems on Hudson have been resolved
//		assertQueryEquals(null, "ὀδυσσεύς", "'ὈΔΥΣΣΕΎΣ'.toLowerCase()");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s.toLowerCase()");
		// null
		assertQueryInvalid(null, "let s : String = null in s.toLowerCase()");
	}

	public void testStringToReal() {
		assertQueryEquals(null, 4.0, "'4'.toReal()", 0.0);
		assertQueryEquals(null, -4.0, "'-4'.toReal()", 0.0);
		assertQueryEquals(null, 4.0, "'4.0'.toReal()", 0.0);

		assertQueryInvalid(null, "'2.4.0'.toReal()", NLS.bind(EvaluatorMessages.InvalidReal, "2.4.0"), NumberFormatException.class);
		assertQueryInvalid(null, "'a'.toReal()", NLS.bind(EvaluatorMessages.InvalidReal, "a"), NumberFormatException.class);
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s.toReal()");
		// null
		assertQueryInvalid(null, "let s : String = null in s.toReal()");
	}

	public void testStringToString() {
		assertQueryEquals(null, "'4.0'", "'4.0'.toString()");
		assertQueryEquals(null, "'4.0\t4'", "('4.0' + '\t' + '4').toString()");
	}

	public void testStringToUpperCase() {
//		checkForUTF8Encoding();
		assertQueryEquals(null, "4", "'4'.toUpperCase()");
		assertQueryEquals(null, "MIXED", "'MiXeD'.toUpperCase()");
		assertQueryEquals(null, "LOWER", "'lower'.toUpperCase()");
		
		// Ensures word-final sigma and regular sigmas are converted as needed
		// TODO re-enable once the Unicode problems on Hudson have been resolved
//		assertQueryEquals(null, "ὈΔΥΣΣΕΎΣ", "'ὀδυσσεύς'.toUpperCase()");
		
		// Sharp s should be mapped to a double S upper case
		// TODO re-enable once the Unicode problems on Hudson have been resolved
//		assertQueryEquals(null, "SS", "'ß'.toUpperCase()");
		// invalid
		assertQueryInvalid(null, "let s : String = invalid in s.toUpperCase()");
		// null
		assertQueryInvalid(null, "let s : String = null in s.toUpperCase()");
	}
}
