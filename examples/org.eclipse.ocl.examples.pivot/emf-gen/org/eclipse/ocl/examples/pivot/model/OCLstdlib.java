/**
 * <copyright>
 *
 * Copyright (c) 2010,2012 E.D.Willink and others.
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
 * This code is auto-generated
 * from: /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateOCLstdlib
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateOCLstdlib.mtl
 * invoked by: org.eclipse.ocl.examples.build.utilities.OCLstdlibCodeGenerator
 * from: org.eclipse.ocl.examples.build.GenerateOCLstdlibModel.mwe2
 *
 * Do not edit it.
 */
package	org.eclipse.ocl.examples.pivot.model;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.*;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.library.StandardLibraryContribution;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectEList;

/**
 * This is the http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib Standard Library
 * auto-generated from /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib.
 * It facilitates efficient library loading without the overheads of model reading.
 * <p>
 * This Standard Library may be registered as the definition of a Standard Library for
 * the OCL evaluation framework by invoking {@link #install}.
 * <p>
 * The Standard Library is normally activated when the MetaModelManager attempts
 * to locate a library type when its default Standard Library URI is the same
 * as this Standard Library.
 */
@SuppressWarnings("nls")
public class OCLstdlib extends AbstractPivotModel
{
	/**
	 *	The static package-of-types pivot model of the Standard Library.
	 */
	private static OCLstdlib INSTANCE = null;
	
	/**
	 *	The URI of this Standard Library.
	 */
	public static final String STDLIB_URI = "http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib";

	private static Comment co_A_32_bag_32_is_32_a_32_c = createComment("A bag is a collection with duplicates allowed. That is, one object can be an element of a bag many times.\nThere is no ordering defined on the elements in a bag.\nBag is itself an instance of the metatype BagType.");
	private static Comment co_A_32_sequence_32_i = createComment("A sequence is a collection where the elements are ordered.\nAn element may be part of a sequence more than once.\nSequence is itself an instance of the metatype SequenceType.\nA Sentence is not a subtype of Bag.\nThe common supertype of Sentence and Bags is Collection.");
	private static Comment co_All_32_types_32_in = createComment("All types in the UML model and the primitive and collection types in the OCL standard library conforms to the type OclAny.\nConceptually, OclAny behaves as a supertype for all the types.\nFeatures of OclAny are available on each object in all OCL expressions.\nOclAny is itself an instance of the metatype AnyType.\n\nAll classes in a UML model inherit all operations defined on OclAny.\nTo avoid name conflicts between properties in the model and the properties inherited from OclAny,\nall names on the properties of OclAny start with \u00E2\u20AC\u02DCocl.\u00E2\u20AC\u2122\nAlthough theoretically there may still be name conflicts, they can be avoided.\nOne can also use qualification by OclAny (name of the type) to explicitly refer to the OclAny properties.\n\nOperations of OclAny, where the instance of OclAny is called object.");
	private static Comment co_An_32_OrderedSe = createComment("An OrderedSet that contains all the elements from oclText[self], with duplicates removed,\nin an order dependent on the particular concrete collection type.");
	private static Comment co_Can_32_only_32_be_32_ = createComment("Can only be used in a postcondition.\nEvaluates to oclText[true] if the oclText[self] is created during performing the operation (for instance, it didn\u00E2\u20AC\u2122t exist at precondition time).");
	private static Comment co_Collection_32_i = createComment("Collection is the abstract supertype of all collection types in the OCL Standard Library.\nEach occurrence of an object in a collection is called an element.\nIf an object occurs twice in a collection, there are two elements.\n\nThis sub clause defines the properties on Collections that have identical semantics for all collection subtypes.\nSome operations may be defined within the subtype as well,\nwhich means that there is an additional postcondition or a more specialized return value.\nCollection is itself an instance of the metatype CollectionType.\n\nThe definition of several common operations is different for each subtype.\nThese operations are not mentioned in this sub clause.\n\nThe semantics of the collection operations is given in the form of a postcondition that uses the IterateExp of the IteratorExp construct.\nThe semantics of those constructs is defined in Clause 10 (\u00E2\u20AC\u0153Semantics Described using UML\u00E2\u20AC\uFFFD).\nIn several cases the postcondition refers to other collection operations,\nwhich in turn are defined in terms of the IterateExp or IteratorExp constructs.\n\nWell-formedness rules\n\n[1] A collection cannot contain oclText[invalid] values.\n\ncontext Collection\ninv: self->forAll(not oclIsInvalid())");
	private static Comment co_Converts_32_ocl = createComment("Converts oclText[self] to a Real value.");
	private static Comment co_Converts_32_ocl_1 = createComment("Converts oclText[self] to a boolean value.");
	private static Comment co_Converts_32_ocl_2 = createComment("Converts oclText[self] to a string value.");
	private static Comment co_Converts_32_ocl_3 = createComment("Converts oclText[self] to a string value.");
	private static Comment co_Converts_32_ocl_4 = createComment("Converts oclText[self] to a string value.");
	private static Comment co_Converts_32_ocl_5 = createComment("Converts oclText[self] to an Integer value.");
	private static Comment co_Converts_32_ocl_6 = createComment("Converts oclText[self] to lower case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
	private static Comment co_Converts_32_ocl_7 = createComment("Converts oclText[self] to upper case, using the locale defined by looking up oclLocale in the current environment.\nOtherwise, returns the same string as oclText[self].");
	private static Comment co_Does_32_oclText = createComment("Does oclText[self] contain all the elements of c2 ?");
	private static Comment co_Does_32_oclText_1 = createComment("Does oclText[self] contain none of the elements of c2 ?");
	private static Comment co_Evaluates_32_to = createComment("Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nIn the case of feature redefinition, casting an object to a supertype of its actual type\ndoes not access the supertype\u00E2\u20AC\u2122s definition of the feature;\naccording to the semantics of redefinition, the redefined feature simply does not exist for the object.\nHowever, when casting to a supertype, any features additionally defined by the subtype are suppressed.");
	private static Comment co_Evaluates_32_to_1 = createComment("Evaluates to oclText[self], where oclText[self] is of the type identified by T.\nThe type T may be any classifier defined in the UML model;\nif the actual type of oclText[self] at evaluation time does not conform to T,\nthen the oclAsType operation evaluates to oclText[invalid].\n\nThe standard behavior is redefined for UnlimitedNatural. Numeric values may be converted to\nReal or Integer, but the e[unlimited] value may not.\nConversion of e[unlimited] to Real or Integer returns oclText[invalid].");
	private static Comment co_Evaluates_32_to_2 = createComment("Evaluates to oclText[true] if oclText[self] and s contain the same elements.");
	private static Comment co_Evaluates_32_to_3 = createComment("Evaluates to oclText[true] if oclText[self] is of the type t but not a subtype of t");
	private static Comment co_Evaluates_32_to_4 = createComment("Evaluates to oclText[true] if the oclText[self] is equal to OclInvalid.");
	private static Comment co_Evaluates_32_to_5 = createComment("Evaluates to oclText[true] if the oclText[self] is equal to oclText[invalid] or equal to oclText[null].");
	private static Comment co_Evaluates_32_to_6 = createComment("Evaluates to oclText[true] if the oclText[self] is in the state indentified by statespec.");
	private static Comment co_Evaluates_32_to_7 = createComment("Evaluates to oclText[true] if the type of oclText[self] conforms to t.\nThat is, oclText[self] is of type t or a subtype of t.");
	private static Comment co_Evaluates_32_to_8 = createComment("Evaluates to the literals of the enumeration.");
	private static Comment co_Evaluates_32_to_9 = createComment("Evaluates to the type of the collection elements.");
	private static Comment co_Evaluates_32_to_10 = createComment("Evaluates to the type of which oclText[self] is an instance.");
	private static Comment co_Evaluates_32_to_11 = createComment("Evaluates to the type of which oclText[self] is an instance.");
	private static Comment co_Evaluates_32_to_12 = createComment("Evaluates to the type of which oclText[self] is an instance.");
	private static Comment co_Evaluates_32_to_13 = createComment("Evaluates to the type of which self is an instance.");
	private static Comment co_If_32_the_32_eleme = createComment("If the element type is not a collection type, this results in the same collection as oclText[self].\nIf the element type is a collection type, the result is a collection containing all the elements of all the recursively flattened elements of oclText[self].");
	private static Comment co_Is_32_oclText_91_s = createComment("Is oclText[self] not the empty collection?\n\noclText[null->notEmpty()] returns oclText[false] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
	private static Comment co_Is_32_oclText_91_s_1 = createComment("Is oclText[self] the empty collection?\n\nNote: oclText[null->isEmpty()] returns oclText[true] in virtue of the implicit casting from oclText[null] to oclText[Bag{}].");
	private static Comment co_Obtains_32_the_32_ = createComment("Obtains the characters of oclText[self] as a sequence.");
	private static Comment co_OclMessage_10_T = createComment("OclMessage\nThis sub clause contains the definition of the standard type OclMessage.\nAs defined in this sub clause, each ocl message type is actually a template type with one parameter.\n\u00E2\u20AC\u02DCT\u00E2\u20AC\u2122 denotes the parameter.\nA concrete ocl message type is created by substituting an operation or signal for the T.\n\nThe predefined type OclMessage is an instance of MessageType.\nEvery OclMessage is fully determined by either the operation, or signal given as parameter.\nNote that there is conceptually an undefined (infinite) number of these types,\nas each is determined by a different operation or signal.\nThese types are unnamed. Every type has as attributes the name of the operation or signal,\nand either all formal parameters of the operation, or all attributes of the signal.\nOclMessage is itself an instance of the metatype MessageType.\n\nOclMessage has a number of predefined operations, as shown in the OCL Standard Library.");
	private static Comment co_Queries_32_the_32_ = createComment("Queries the character at position i in oclText[self].");
	private static Comment co_Queries_32_the_32__1 = createComment("Queries the index in oclText[self] at which s is a substring of oclText[self], or zero if s is not a substring of oclText[self].\nThe empty string is considered to be a substring of every string but the empty string, at index 1.\nNo string is a substring of the empty string.");
	private static Comment co_Queries_32_whet = createComment("Queries whether s and oclText[self] are equivalent under case-insensitive collation.");
	private static Comment co_Redefines_32_th = createComment("Redefines the Collection operation. If the element type is not a collection type, this results in the same bag as oclText[self].\nIf the element type is a collection type, the result is the bag containing all the elements of all the recursively flattened elements of oclText[self].");
	private static Comment co_Redefines_32_th_1 = createComment("Redefines the Collection operation. If the element type is not a collection type, this results in the same sequence as oclText[self].\nIf the element type is a collection type, the result is the sequence containing all the elements\nof all the recursively flattened elements of oclText[self]. The order of the elements is partial.");
	private static Comment co_Redefines_32_th_2 = createComment("Redefines the Collection operation. If the element type is not a collection type, this results in the same set as oclText[self].\nIf the element type is a collection type, the result is the set containing all the elements of all the recursively flattened elements of oclText[self].");
	private static Comment co_Redefines_32_th_3 = createComment("Redefines the OclAny operation, returning oclText[true] if object is oclText[null], oclText[invalid]\nif object is oclText[invalid], oclText[false] otherwise.");
	private static Comment co_Results_32_in_32_o = createComment("Results in oclText[true] if body evaluates to a different value for each element in the source collection; otherwise, result is oclText[false].");
	private static Comment co_Results_32_in_32_o_1 = createComment("Results in oclText[true] if body evaluates to oclText[true] for at least one element in the source collection.");
	private static Comment co_Results_32_in_32_o_2 = createComment("Results in oclText[true] if the body expression evaluates to oclText[true] for each element in the source collection; otherwise, result is oclText[false].");
	private static Comment co_Results_32_in_32_o_3 = createComment("Results in oclText[true] if there is exactly one element in the source collection for which body is oclText[true].");
	private static Comment co_Results_32_in_32_t = createComment("Results in the Collection containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
	private static Comment co_Results_32_in_32_t_1 = createComment("Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
	private static Comment co_Results_32_in_32_t_2 = createComment("Results in the Sequence containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c then a < c).");
	private static Comment co_Results_32_in_32_t_3 = createComment("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
	private static Comment co_Results_32_in_32_t_4 = createComment("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
	private static Comment co_Results_32_in_32_t_5 = createComment("Results in the ordered set containing all elements of the source collection.\nThe element for which body has the lowest value comes first, and so on.\nThe type of the body expression must have the < operation defined.\nThe < operation must return a Boolean value and must be transitive (i.e., if a < b and b < c, then a < c).");
	private static Comment co_Return_32__sub_ve_44__32_ = createComment("Return -ve, 0, +ve according to whether self is less than, equal to , or greater than that.\n\nThe compareTo operation should be commutative.");
	private static Comment co_Return_32_a_32_set = createComment("Return a set of all enumeration values of oclText[self].");
	private static Comment co_Return_32_a_32_set_1 = createComment("Return a set of all instances of the type and derived types of self.");
	private static Comment co_Return_32_the_32__39_ = createComment("Return the \'zero\' value of self to initialize a summation.\n\nzero().sum(self) = self.");
	private static Comment co_Return_32_the_32_s = createComment("Return the sum of self and that.\n\nThe sum operation should be associative.");
	private static Comment co_Returns_32__39_inv = createComment("Returns \'invalid\'.");
	private static Comment co_Returns_32_a_32_Se = createComment("Returns a Set with oclText[self] as the sole content, unless oclText[self] is oclText[null] in which case returns an empty set,");
	private static Comment co_Returns_32_any_32_ = createComment("Returns any element in the source collection for which body evaluates to oclText[true].\nIf there is more than one element for which body is oclText[true], one of them is returned.\nThere must be at least one element fulfilling body, otherwise the result of this IteratorExp is oclText[null].");
	private static Comment co_Returns_32_oclT = createComment("Returns oclText[Set{false, true}].");
	private static Comment co_Returns_32_oclT_1 = createComment("Returns oclText[Set{null}].");
	private static Comment co_Returns_32_oclT_2 = createComment("Returns oclText[invalid].");
	private static Comment co_Returns_32_oclT_3 = createComment("Returns oclText[invalid].");
	private static Comment co_Returns_32_oclT_4 = createComment("Returns oclText[invalid].");
	private static Comment co_Returns_32_oclT_5 = createComment("Returns oclText[null].");
	private static Comment co_Returns_32_oclT_6 = createComment("Returns oclText[self].");
	private static Comment co_Returns_32_oclT_7 = createComment("Returns oclText[true] if the OclMessage represents the sending of a UML Operation call.");
	private static Comment co_Returns_32_oclT_8 = createComment("Returns oclText[true] if the OclMessage represents the sending of a UML Signal.");
	private static Comment co_Returns_32_oclT_9 = createComment("Returns oclText[true] if the logical value of oclText[self] is the not same as the numeric value of object2, oclText[false] otherwise.");
	private static Comment co_Returns_32_oclT_10 = createComment("Returns oclText[true] if the logical value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
	private static Comment co_Returns_32_oclT_11 = createComment("Returns oclText[true] if the numeric value of oclText[self] is the not the same as the numeric value of object2, oclText[false] otherwise.");
	private static Comment co_Returns_32_oclT_12 = createComment("Returns oclText[true] if the numeric value of oclText[self] is the same as the numeric value of object2, oclText[false] otherwise.");
	private static Comment co_Returns_32_the_32_ = createComment("Returns the composed contents of self.");
	private static Comment co_Returns_32_the_32__1 = createComment("Returns the object for which self is a composed content or null if there is no such object.");
	private static Comment co_Returns_32_the_32__2 = createComment("Returns the result of the called operation, if type of template parameter is an operation call,\nand the called operation has returned a value. Otherwise the oclText[invalid] value is returned.");
	private static Comment co_Returns_32_true = createComment("Returns true if type2 conforms to self.");
	private static Comment co_Sequence_32_tha = createComment("Sequence that contains all the elements from oclText[self], in an order dependent on the particular concrete collection type.");
	private static Comment co_The_32_Bag_32_of_32_e = createComment("The Bag of elements which results from applying body to every member of the source nonordered collection.");
	private static Comment co_The_32_Bag_32_that = createComment("The Bag that contains all the elements from oclText[self].");
	private static Comment co_The_32_Collecti = createComment("The Collection of elements that results from applying body to every member of the source set.\nThe result is flattened. Notice that this is based on collectNested, which can be of different type depending on the type of source.\ncollectNested is defined individually for each subclass of CollectionType.");
	private static Comment co_The_32_Collecti_1 = createComment("The Collection of elements which results from applying body to every member of the source collection.");
	private static Comment co_The_32_Enumerat = createComment("The Enumeration type is the type of an OrderedSet of EnumerationLiteral.");
	private static Comment co_The_32_OrderedS = createComment("The OrderedSet is a Set, the elements of which are ordered.\nIt contains no duplicates. OrderedSet is itself an instance of the metatype OrderedSetType.\nAn OrderedSet is not a subtype of Set, neither a subtype of Sequence.\nThe common supertype of Sets and OrderedSets is Collection.");
	private static Comment co_The_32_Set_32_cont = createComment("The Set containing all the elements from oclText[self], with duplicates removed.");
	private static Comment co_The_32_UniqueCo = createComment("The UniqueCollection type provides the shared functionality of the OrderedSet and Set\ncollections for which the elements are unique.\nThe common supertype of UniqueCollection is Collection.");
	private static Comment co_The_32_absolute = createComment("The absolute value of oclText[self].");
	private static Comment co_The_32_absolute_1 = createComment("The absolute value of oclText[self].");
	private static Comment co_The_32_addition = createComment("The addition of all elements in oclText[self].\nElements must be of an oclText[OclSummable] type to provide the zero() and sum() operations.\nThe e[sum] operation must be both associative: a.sum(b).sum(c) = a.sum(b.sum(c)), and commutative: a.sum(b) = b.sum(a).\nUnlimitedNatural, Integer and Real fulfill this condition.\n\nIf the e[sum] operation is not both associative and commutative, the e[sum] expression is not well-formed,\nwhich may result in unpredictable results during evaluation.\nIf an implementation is able to detect a lack of associativity or commutativity,\nthe implementation may bypass the evaluation and return an oclText[invalid] result.");
	private static Comment co_The_32_bag_32_cont = createComment("The bag containing all elements of oclText[self] apart from all occurrences of object.");
	private static Comment co_The_32_bag_32_cont_1 = createComment("The bag containing all elements of oclText[self] plus object.");
	private static Comment co_The_32_cartesia = createComment("The cartesian product operation of oclText[self] and c2.");
	private static Comment co_The_32_closure_32_ = createComment("The closure of applying body transitively to every distinct element of the source collection.");
	private static Comment co_The_32_closure_32__1 = createComment("The closure of applying body transitively to every distinct element of the source collection.");
	private static Comment co_The_32_collecti = createComment("The collection containing all elements of oclText[self] apart from object.");
	private static Comment co_The_32_collecti_1 = createComment("The collection containing all elements of oclText[self] plus object.");
	private static Comment co_The_32_comparis = createComment("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
	private static Comment co_The_32_comparis_1 = createComment("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
	private static Comment co_The_32_comparis_2 = createComment("The comparison of oclText[self] with oclText[that]. -ve if less than, 0 if equal, +ve if greater than.");
	private static Comment co_The_32_concaten = createComment("The concatenation of oclText[self] and s.");
	private static Comment co_The_32_concaten_1 = createComment("The concatenation of oclText[self] and s.");
	private static Comment co_The_32_element_32_ = createComment("The element with the maximum value of all elements in oclText[self].\nElements must be of a type supporting the max operation.\nThe max operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
	private static Comment co_The_32_element_32__1 = createComment("The element with the minimum value of all elements in oclText[self].\nElements must be of a type supporting the min operation.\nThe min operation - supported by the elements - must take one parameter of type T and be both associative and commutative.\nUnlimitedNatural, Integer and Real fulfill this condition.");
	private static Comment co_The_32_elements = createComment("The elements of oclText[self], which are not in s.");
	private static Comment co_The_32_elements_1 = createComment("The elements of oclText[self], which are not in s.");
	private static Comment co_The_32_elements_2 = createComment("The elements of oclText[self], which are not in s.");
	private static Comment co_The_32_first_32_el = createComment("The first element in oclText[self].");
	private static Comment co_The_32_i_sub_th_32_ele = createComment("The i-th element of sequence.");
	private static Comment co_The_32_index_32_of = createComment("The index of object obj in the ordered collection.");
	private static Comment co_The_32_integer_32_ = createComment("The integer that is closest to oclText[self]. When there are two such integers, the largest one.");
	private static Comment co_The_32_intersec = createComment("The intersection of oclText[self] and bag; the bag of all elements that are in both oclText[self] and s.");
	private static Comment co_The_32_intersec_1 = createComment("The intersection of oclText[self] and bag; the bag of all elements that are in both oclText[self] and s.");
	private static Comment co_The_32_intersec_2 = createComment("The intersection of oclText[self] and s (i.e., the set of all elements that are in both oclText[self] and s).");
	private static Comment co_The_32_intersec_3 = createComment("The intersection of oclText[self] and s; the set of all elements that are in both oclText[self] and s.");
	private static Comment co_The_32_intersec_4 = createComment("The intersection of oclText[self] and s; the set of all elements that are in both oclText[self] and s.");
	private static Comment co_The_32_largest_32_ = createComment("The largest integer that is less than or equal to oclText[self].");
	private static Comment co_The_32_last_32_ele = createComment("The last element in oclText[self].");
	private static Comment co_The_32_maximum_32_ = createComment("The maximum of oclText[self] an i.");
	private static Comment co_The_32_maximum_32__1 = createComment("The maximum of oclText[self] and r.");
	private static Comment co_The_32_minimum_32_ = createComment("The minimum of oclText[self] an i.");
	private static Comment co_The_32_minimum_32__1 = createComment("The minimum of oclText[self] and r.");
	private static Comment co_The_32_negative = createComment("The negative value of oclText[self].");
	private static Comment co_The_32_negative_1 = createComment("The negative value of oclText[self].");
	private static Comment co_The_32_number_32_o = createComment("The number of characters in oclText[self].");
	private static Comment co_The_32_number_32_o_1 = createComment("The number of elements in the collection oclText[self].");
	private static Comment co_The_32_number_32_o_2 = createComment("The number of times that i fits completely within oclText[self].");
	private static Comment co_The_32_number_32_o_3 = createComment("The number of times that object occurs in the collection oclText[self].");
	private static Comment co_The_32_ordered_32_ = createComment("The ordered set  containing all elements of oclText[self] apart from object.\n\nThe order of the remaining elements is not changed.");
	private static Comment co_The_32_ordered_32__1 = createComment("The ordered set consisting of all elements in oclText[self] and all elements in o.");
	private static Comment co_The_32_ordered_32__2 = createComment("The ordered set consisting of oclText[self] with object present at position index.");
	private static Comment co_The_32_ordered_32__3 = createComment("The ordered set containing all elements of oclText[self] plus object added as the last element if not already present.");
	private static Comment co_The_32_ordered_32__4 = createComment("The ordered set of elements with same elements but with the opposite order.");
	private static Comment co_The_32_ordered_32__5 = createComment("The ordered set of the source ordered set for which body is oclText[false].");
	private static Comment co_The_32_ordered_32__6 = createComment("The ordered set of the source ordered set for which body is oclText[true]");
	private static Comment co_The_32_pseudo_sub_t = createComment("The pseudo-type OclSelf denotes the statically determinate type of oclText[self] in Operation\nand Iteration signatures. Instances of OclSelf are never created.");
	private static Comment co_The_32_result_32_i = createComment("The result is oclText[self] modulo i.");
	private static Comment co_The_32_sequence = createComment("The sequence consisting of all elements in oclText[self], followed by all elements in s.");
	private static Comment co_The_32_sequence_1 = createComment("The sequence consisting of object, followed by all elements in oclText[self].");
	private static Comment co_The_32_sequence_2 = createComment("The sequence consisting of object, followed by all elements in oclText[self].");
	private static Comment co_The_32_sequence_3 = createComment("The sequence consisting of oclText[self] with object inserted at position index.");
	private static Comment co_The_32_sequence_4 = createComment("The sequence containing all elements of oclText[self] apart from all occurrences of object.\n\nThe order of the remaining elements is not changed.");
	private static Comment co_The_32_sequence_5 = createComment("The sequence containing all elements of oclText[self] plus object added as the last element.");
	private static Comment co_The_32_sequence_6 = createComment("The sequence containing the same elements but with the opposite order.");
	private static Comment co_The_32_sequence_7 = createComment("The sequence of elements that results from applying body to every member of the source ordered collection.");
	private static Comment co_The_32_sequence_8 = createComment("The sequence of elements, consisting of all elements of oclText[self], followed by object.");
	private static Comment co_The_32_set_32_cons = createComment("The set consisting of all elements in oclText[self] and all elements in s.");
	private static Comment co_The_32_set_32_cons_1 = createComment("The set consisting of all elements in oclText[self] and all elements in s.");
	private static Comment co_The_32_set_32_cont = createComment("The set containing all elements of oclText[self] plus object.");
	private static Comment co_The_32_set_32_cont_1 = createComment("The set containing all elements of oclText[self] without object.");
	private static Comment co_The_32_set_32_cont_2 = createComment("The set containing all the elements that are in oclText[self] or s, but not in both.");
	private static Comment co_The_32_set_32_of_32_e = createComment("The set of elements, consisting of all elements of oclText[self], followed by object.");
	private static Comment co_The_32_standard = createComment("The standard type Boolean represents the common true/false values.\nBoolean is itself an instance of the metatype PrimitiveType (from UML).");
	private static Comment co_The_32_standard_1 = createComment("The standard type EnumerationClassifier represents the metatype of an Enumeration.");
	private static Comment co_The_32_standard_2 = createComment("The standard type EnumerationLiteral represents a named constant value of an Enumeration.");
	private static Comment co_The_32_standard_3 = createComment("The standard type Integer represents the mathematical concept of integer.\nNote that UnlimitedNatural is a subclass of Integer, so for each parameter of type Integer,\nyou can use an unlimited natural as the actual parameter.\nInteger is itself an instance of the metatype PrimitiveType (from UML).");
	private static Comment co_The_32_standard_4 = createComment("The standard type Real represents the mathematical concept of real.\nNote that UnlimitedNatural is a subclass of Integer and that Integer is a subclass of Real,\nso for each parameter of type Real, you can use an unlimited natural or an integer as the actual parameter.\nReal is itself an instance of the metatype PrimitiveType (from UML).");
	private static Comment co_The_32_standard_5 = createComment("The standard type String represents strings, which can be both ASCII or Unicode.\nString is itself an instance of the metatype PrimitiveType (from UML).");
	private static Comment co_The_32_standard_6 = createComment("The standard type UnlimitedNatural is used to encode the non-negative values of a multiplicity specification.\nThis includes a special e[unlimited] value (*) that encodes the upper value of  a multiplicity specification.\nUnlimitedNatural is itself an instance of the metatype UnlimitedNaturalType.\n\nNote that although UnlimitedNatural is a subclass of Integer, the e[unlimited] value cannot be represented as an Integer.\nAny use of the e[unlimited] value as an integer or real is replaced by the oclText[invalid] value.");
	private static Comment co_The_32_sub_sub_bag_32_ = createComment("The sub-bag of the source bag for which body is oclText[false].\n\noclCode[self->reject(iterator | body) = self->select(iterator | not body)].");
	private static Comment co_The_32_sub_sub_bag_32__1 = createComment("The sub-bag of the source bag for which body is oclText[true].\n\noclCode[self->select(iterator | body) =\nself->iterate(iterator; result : Bag<T> = Bag{} |\nif body then result->including(iterator)\nelse result\nendif)]");
	private static Comment co_The_32_sub_sub_coll = createComment("The sub-collection of the source collection for which body is oclText[false].");
	private static Comment co_The_32_sub_sub_coll_1 = createComment("The sub-collection of the source collection for which body is oclText[true].");
	private static Comment co_The_32_sub_sub_sequ = createComment("The sub-sequence of oclText[self] starting at number lower, up to and including element number upper.");
	private static Comment co_The_32_sub_sub_set_32_ = createComment("The sub-set of oclText[self] starting at number lower, up to and including element number upper.");
	private static Comment co_The_32_sub_sub_stri = createComment("The sub-string of oclText[self] starting at character number lower, up to and including character number upper. Character numbers run from 1 to self.size().");
	private static Comment co_The_32_subseque = createComment("The subsequence of the source sequence for which body is oclText[false].");
	private static Comment co_The_32_subseque_1 = createComment("The subsequence of the source sequence for which body is oclText[true].");
	private static Comment co_The_32_subset_32_o = createComment("The subset of set for which expr is oclText[true].");
	private static Comment co_The_32_subset_32_o_1 = createComment("The subset of the source set for which body is oclText[false].");
	private static Comment co_The_32_type_32_Ocl = createComment("The type OclComparable defines the compareTo operation used by the sortedBy iteration. Only types that provide a derived\ncompareTo implementation may be sorted.");
	private static Comment co_The_32_type_32_Ocl_1 = createComment("The type OclElement is the implicit supertype of any user-defined type that has no explicit supertypes. Operations defined\nfor OclElement are therefore applicable to all user-defined types.");
	private static Comment co_The_32_type_32_Ocl_2 = createComment("The type OclInvalid is a type that conforms to all other types.\nIt has one single instance, identified as  oclText[invalid].\nAny property call applied on invalid results in oclText[invalid], except for the operations oclIsUndefined() and oclIsInvalid().\nOclInvalid is itself an instance of the metatype InvalidType.");
	private static Comment co_The_32_type_32_Ocl_3 = createComment("The type OclLambda is the implicit supertype of all Lambda types. The operations defined for OclLambda\ntherefore apply to all lambda expressions.");
	private static Comment co_The_32_type_32_Ocl_4 = createComment("The type OclSummable defines the sum and zero operations used by the Collection::sum iteration. Only types that provide derived\nsum and zero implementations may be summed.");
	private static Comment co_The_32_type_32_Ocl_5 = createComment("The type OclTuple is the implicit supertype of all Tuple types. The operations defined for OclTuple\ntherefore apply to all tuples.");
	private static Comment co_The_32_type_32_Ocl_6 = createComment("The type OclType is the implicit supertype of any UML type. Operations defined\nfor OclType are therefore applicable to all UML types.");
	private static Comment co_The_32_type_32_Ocl_7 = createComment("The type OclVoid is a type that conforms to all other types except OclInvalid.\nIt has one single instance, identified as oclText[null], that corresponds with the UML LiteralNull value specification.\nAny property call applied on oclText[null] results in oclText[invalid], except for the\noclIsUndefined(), oclIsInvalid(), =(OclAny) and <>(OclAny) operations.\nHowever, by virtue of the implicit conversion to a collection literal,\nan expression evaluating to oclText[null] can be used as source of collection operations (such as \u00E2\u20AC\u02DCisEmpty\u00E2\u20AC\u2122).\nIf the source is the oclText[null] literal, it is implicitly converted to Bag{}.\n\nOclVoid is itself an instance of the metatype VoidType.");
	private static Comment co_The_32_union_32_of = createComment("The union of oclText[self] and bag; the bag of all elements that are in oclText[self] and all elements that are in bag.");
	private static Comment co_The_32_union_32_of_1 = createComment("The union of oclText[self] and s; the set of all elements that are in oclText[self] and all elements that are in s.");
	private static Comment co_The_32_value_32_of = createComment("The value of oclText[self] divided by i.\nEvaluates to oclText[invalid] if r is equal to zero.");
	private static Comment co_The_32_value_32_of_1 = createComment("The value of oclText[self] divided by r. Evaluates to oclText[invalid] if r is equal to zero.");
	private static Comment co_The_32_value_32_of_2 = createComment("The value of the addition of oclText[self] and i.");
	private static Comment co_The_32_value_32_of_3 = createComment("The value of the addition of oclText[self] and r.");
	private static Comment co_The_32_value_32_of_4 = createComment("The value of the multiplication of oclText[self] and i.");
	private static Comment co_The_32_value_32_of_5 = createComment("The value of the multiplication of oclText[self] and r.");
	private static Comment co_The_32_value_32_of_6 = createComment("The value of the subtraction of i from oclText[self].");
	private static Comment co_The_32_value_32_of_7 = createComment("The value of the subtraction of r from oclText[self].");
	private static Comment co_This_32_clause_32_ = createComment("This clause describes the OCL Standard Library of predefined types, their operations, and predefined expression templates in the OCL.\nThis sub clause contains all standard types defined within OCL, including all the operations defined on those types.\nFor each operation the signature and a description of the semantics is given.\nWithin the description, the reserved word \u00E2\u20AC\u02DCresult\u00E2\u20AC\u2122 is used to refer to the value that results from evaluating the operation.\nIn several places, post conditions are used to describe properties of the result.\nWhen there is more than one postcondition, all postconditions must be true.\nA similar thing is true for multiple preconditions.\nIf these are used, the operation is only defined if all preconditions evaluate to oclText[true].\n\nheading:1[Introduction]\n\nThe structure, syntax, and semantics of the OCL is defined in Clauses 8 (\u00E2\u20AC\u0153Abstract Syntax\u00E2\u20AC\uFFFD), 9 (\u00E2\u20AC\u0153Concrete Syntax\u00E2\u20AC\uFFFD),\nand 10 (\u00E2\u20AC\u0153Semantics Described using UML\u00E2\u20AC\uFFFD).\nThis sub clause adds another part to the OCL definition: a library of predefined types and operations.\nAny implementation of OCL must include this library package. This approach has also been taken by e.g., the Java definition,\nwhere the language definition and the standard libraries are both mandatory parts of the complete language definition.\n\nThe OCL standard library defines a number of types.\nIt includes several primitive types: UnlimitedNatural, Integer, Real, String, and Boolean.\nThese are familiar from many other languages. The second part of the standard library consists of the collection types.\nThey are Bag, Set, Sequence, and Collection where Collection is an abstract type.\nNote that all types defined in the OCL standard library are instances of an abstract syntax class.\nThe OCL standard library exists at the modeling level, also referred to as the M1 level, where the abstract syntax is the metalevel or M2 level.\n\nNext to definitions of types the OCL standard library defines a number of template expressions.\nMany operations defined on collections map not on the abstract syntax metaclass FeatureCallExp, but on the IteratorExp.\nFor each of these a template expression that defines the name and format of the expression is defined in 11.8, Predefined Iterator Expressions.\n\nThe Standard Library may be extended with new types, new operations and new iterators.\nIn particular new operations can be defined for collections.\n\nCertain String operations depend on the prevailing locale to ensure that Strings are collated and characters are case-converted\nin an appropriate fashion.\nA locale is defined as a concatenation of up to three character sequences separated by underscores,\nwith the first sequence identifying the language and the second sequence identifying the country.\nThe third sequence is empty but may encode an implementation-specific variant.\nTrailing empty strings and separators may be omitted.\n\nThe character sequences for languages are defined by ISO 639.\n\nThe character sequences for countries are defined by ISO 3166.\n\n\u00E2\u20AC\u02DCfr_CA\u00E2\u20AC\u2122 therefore identifies the locale for the French language in the Canada country.\n\nComparison of strings and consequently the collation order of Collection::sortedBy()\nconforms to the Unicode Collation algorithm defined by Unicode Technical Standard#10.\n\nThe locale is \u00E2\u20AC\u02DCen_us\u00E2\u20AC\u2122 by default but may be configured by a property constraint on OclAny::oclLocale.\n\nThe prevailing locale is defined by the prevailing value of oclLocale within the current environment;\nit may therefore be changed temporarily by using a Let expression.\nlet oclLocale : String = \u00E2\u20AC\u02DCfr_CA\u00E2\u20AC\u2122 in aString.toUpperCase()\n\nheading:1[Iterators]\n\nThis sub clause defines the standard OCL iterator expressions.\nIn the abstract syntax these are all instances of IteratorExp.\nThese iterator expressions always have a collection expression as their source,\nas is defined in the well-formedness rules in Clause 8 (\u00E2\u20AC\u0153Abstract Syntax\u00E2\u20AC\uFFFD).\nThe defined iterator expressions are shown per source collection type.\nThe semantics of each iterator expression is defined through a mapping from the iterator to the \u00E2\u20AC\u02DCiterate\u00E2\u20AC\u2122 construct.\nThis means that the semantics of the iterator expressions do not need to be defined separately in the semantics sub clauses.\n\nIn all of the following OCL expressions, the lefthand side of the equals sign is the IteratorExp to be defined,\nand the righthand side of the equals sign is the equivalent as an IterateExp.\nThe names source, body, and iterator refer to the role names in the abstract syntax:\n\nsource\tThe source expression of the IteratorExp.\n\nbody\tThe body expression of the IteratorExp.\n\niterator\tThe iterator variable of the IteratorExp.\n\nresult\tThe result variable of the IterateExp.\n\nheading:2[Extending the Standard Library with Iterator Expressions]\n\nIt is possible to add new iterator expressions in the standard library.\nIf this is done the semantics of a new iterator should be defined by mapping it to existing constructs,\nin the same way the semantics of pre-defined iterators is done (see sub clause 11.9)");
	private static Comment co_This_32_is_32_a_32_de = createComment("This is a deprecated variant of toLowerCase() preserving compatibility with traditional Eclipse OCL behaviour.");
	private static Comment co_This_32_is_32_a_32_de_1 = createComment("This is a deprecated variant of toUpperCase() preserving compatibility with traditional Eclipse OCL behaviour.");
	private static Comment co_True_32_if_32_both = createComment("True if both b1 and b are oclText[true].");
	private static Comment co_True_32_if_32_c_32_is = createComment("True if c is a collection of the same kind as oclText[self] and contains the same elements in the same quantities and in the same order,\nin the case of an ordered collection type.");
	private static Comment co_True_32_if_32_c_32_is_1 = createComment("True if c is not equal to oclText[self].");
	private static Comment co_True_32_if_32_eith = createComment("True if either oclText[self] or b is oclText[true], but not both.");
	private static Comment co_True_32_if_32_eith_1 = createComment("True if either oclText[self] or b is oclText[true].");
	private static Comment co_True_32_if_32_obje = createComment("True if object is an element of oclText[self], oclText[false] otherwise.");
	private static Comment co_True_32_if_32_obje_1 = createComment("True if object is not an element of oclText[self], oclText[false] otherwise.");
	private static Comment co_True_32_if_32_oclT = createComment("True if oclText[self] and bag contain the same elements, the same number of times.");
	private static Comment co_True_32_if_32_oclT_1 = createComment("True if oclText[self] contains the same elements as s in the same order.");
	private static Comment co_True_32_if_32_oclT_2 = createComment("True if oclText[self] is a different object from object2. Infix operator.");
	private static Comment co_True_32_if_32_oclT_3 = createComment("True if oclText[self] is greater than or equal to r.");
	private static Comment co_True_32_if_32_oclT_4 = createComment("True if oclText[self] is greater than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
	private static Comment co_True_32_if_32_oclT_5 = createComment("True if oclText[self] is greater than r.");
	private static Comment co_True_32_if_32_oclT_6 = createComment("True if oclText[self] is greater than s, using the locale defined by looking up oclLocale in the current environment.");
	private static Comment co_True_32_if_32_oclT_7 = createComment("True if oclText[self] is less than or equal to r.");
	private static Comment co_True_32_if_32_oclT_8 = createComment("True if oclText[self] is less than or equal to s, using the locale defined by looking up oclLocale in the current environment.");
	private static Comment co_True_32_if_32_oclT_9 = createComment("True if oclText[self] is less than r.");
	private static Comment co_True_32_if_32_oclT_10 = createComment("True if oclText[self] is less than s, using the locale defined by looking up oclLocale in the current environment.");
	private static Comment co_True_32_if_32_oclT_11 = createComment("True if oclText[self] is oclText[false], or if oclText[self] is oclText[true] and b is oclText[true].");
	private static Comment co_True_32_if_32_oclT_12 = createComment("True if oclText[self] is oclText[false].");
	private static Comment co_True_32_if_32_oclT_13 = createComment("True if oclText[self] is the same object as object2. Infix operator.");
	private static Comment co_True_32_if_32_type = createComment("True if type of template parameter is an operation call, and the called operation has returned a value.\nThis implies the fact that the message has been sent. False in all other cases.");
	
	private static Precedence prec_ADDITIVE = createPrecedence("ADDITIVE", AssociativityKind.LEFT);
	private static Precedence prec_AND = createPrecedence("AND", AssociativityKind.LEFT);
	private static Precedence prec_EQUALITY = createPrecedence("EQUALITY", AssociativityKind.LEFT);
	private static Precedence prec_IMPLIES = createPrecedence("IMPLIES", AssociativityKind.LEFT);
	private static Precedence prec_MULTIPLICATIVE = createPrecedence("MULTIPLICATIVE", AssociativityKind.LEFT);
	private static Precedence prec_NAVIGATION = createPrecedence("NAVIGATION", AssociativityKind.LEFT);
	private static Precedence prec_OR = createPrecedence("OR", AssociativityKind.LEFT);
	private static Precedence prec_RELATIONAL = createPrecedence("RELATIONAL", AssociativityKind.LEFT);
	private static Precedence prec_UNARY = createPrecedence("UNARY", AssociativityKind.LEFT);
	private static Precedence prec_XOR = createPrecedence("XOR", AssociativityKind.LEFT);
	
	
	private static PrimitiveType t_Boolean = createPrimitiveType("Boolean");
	private static PrimitiveType t_Integer = createPrimitiveType("Integer");
	private static LambdaType t_Lambda_Bag_T = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Bag_T_1 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Bag_T_2 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Bag_T_3 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Bag_T_4 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Bag_T_5 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_1 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_2 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_3 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_4 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_5 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_6 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_7 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_8 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_9 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_10 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_11 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Collection_T_12 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_OrderedSet_T = createLambdaType("Lambda");
	private static LambdaType t_Lambda_OrderedSet_T_1 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_OrderedSet_T_2 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Sequence_T = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Sequence_T_1 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Sequence_T_2 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Sequence_T_3 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Sequence_T_4 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Sequence_T_5 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Set_T = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Set_T_1 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_Set_T_2 = createLambdaType("Lambda");
	private static LambdaType t_Lambda_UniqueCollection_T = createLambdaType("Lambda");
	private static PrimitiveType t_Real = createPrimitiveType("Real");
	private static PrimitiveType t_String = createPrimitiveType("String");
	private static TupleType t_Tuple = createTupleType("Tuple");
	private static TupleType t_Tuple_1 = createTupleType("Tuple");
	private static TupleType t_Tuple_2 = createTupleType("Tuple");
	private static TupleType t_Tuple_3 = createTupleType("Tuple");
	private static PrimitiveType t_UnlimitedNatural = createPrimitiveType("UnlimitedNatural");
	private static Class t_UnlimitedNatural_oclAsType_TT = createClass("TT");
	private static ClassifierType t_AnyClassifier_UnlimitedNatural_oclAsType_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_Bag_selectByKind_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_Bag_selectByType_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_ClassClassifier_T = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_CollectionClassifier_T = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_Collection_selectByKind_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_Collection_selectByType_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_EnumerationClassifier_T = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_OclAny_oclAsType_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_OclAny_oclIsKindOf_T = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_OclAny_oclIsTypeOf_T = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_OclInvalid = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_OclInvalid_1 = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_OclSelf = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_OclVoid = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_OrderedSet_selectByKind_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_OrderedSet_selectByType_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_Sequence_selectByKind_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_Sequence_selectByType_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_Set_selectByKind_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier_Set_selectByType_TT = createClassifierType("AnyClassifier");
	private static ClassifierType t_AnyClassifier = createClassifierType("AnyClassifier");
	private static Class t_AnyClassifier_T = createClass("T");
	private static BagType t_Bag_Tuple = createBagType("Bag");
	private static BagType t_Bag_Tuple_1 = createBagType("Bag");
	private static BagType t_Bag_Bag_collect_V = createBagType("Bag");
	private static BagType t_Bag_Bag_flatten_T2 = createBagType("Bag");
	private static BagType t_Bag_Bag_selectByKind_TT = createBagType("Bag");
	private static BagType t_Bag_Bag_selectByType_TT = createBagType("Bag");
	private static BagType t_Bag_Bag_T = createBagType("Bag");
	private static BagType t_Bag_Bag_T_1 = createBagType("Bag");
	private static BagType t_Bag_Bag_T_2 = createBagType("Bag");
	private static BagType t_Bag_Bag_T_3 = createBagType("Bag");
	private static BagType t_Bag_Collection_T = createBagType("Bag");
	private static BagType t_Bag_OclElement = createBagType("Bag");
	private static BagType t_Bag_OclSelf = createBagType("Bag");
	private static BagType t_Bag_OclSelf_1 = createBagType("Bag");
	private static BagType t_Bag_OclSelf_2 = createBagType("Bag");
	private static BagType t_Bag_OclSelf_3 = createBagType("Bag");
	private static BagType t_Bag_OclSelf_4 = createBagType("Bag");
	private static BagType t_Bag_OclSelf_5 = createBagType("Bag");
	private static BagType t_Bag_Sequence_T = createBagType("Bag");
	private static BagType t_Bag_Set_flatten_T2 = createBagType("Bag");
	private static BagType t_Bag_Set_selectByKind_TT = createBagType("Bag");
	private static BagType t_Bag_Set_selectByType_TT = createBagType("Bag");
	private static BagType t_Bag_Set_T = createBagType("Bag");
	private static BagType t_Bag_UniqueCollection_T = createBagType("Bag");
	private static BagType t_Bag_UniqueCollection_T_1 = createBagType("Bag");
	private static BagType t_Bag = createBagType("Bag");
	private static Class t_Bag_collectNested_V = createClass("V");
	private static Class t_Bag_collect_V = createClass("V");
	private static Class t_Bag_flatten_T2 = createClass("T2");
	private static Class t_Bag_selectByKind_TT = createClass("TT");
	private static Class t_Bag_selectByType_TT = createClass("TT");
	private static Class t_Bag_T = createClass("T");
	private static Class t_Class = createClass("Class");
	private static ClassifierType t_ClassClassifier_OclInvalid = createClassifierType("ClassClassifier");
	private static ClassifierType t_ClassClassifier_OclSelf = createClassifierType("ClassClassifier");
	private static ClassifierType t_ClassClassifier_OclVoid = createClassifierType("ClassClassifier");
	private static ClassifierType t_ClassClassifier = createClassifierType("ClassClassifier");
	private static Class t_ClassClassifier_T = createClass("T");
	private static ClassifierType t_CollectionClassifier_Collection_T_OclSelf = createClassifierType("CollectionClassifier");
	private static ClassifierType t_CollectionClassifier = createClassifierType("CollectionClassifier");
	private static Class t_CollectionClassifier_E = createClass("E");
	private static Class t_CollectionClassifier_T = createClass("T");
	private static CollectionType t_Collection_Integer = createCollectionType("Collection");
	private static CollectionType t_Collection_String = createCollectionType("Collection");
	private static CollectionType t_Collection_Tuple = createCollectionType("Collection");
	private static CollectionType t_Collection_Tuple_1 = createCollectionType("Collection");
	private static CollectionType t_Collection_Bag_collect_V = createCollectionType("Collection");
	private static CollectionType t_Collection_Bag_flatten_T2 = createCollectionType("Collection");
	private static CollectionType t_Collection_Bag_selectByKind_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_Bag_selectByType_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_Bag_T = createCollectionType("Collection");
	private static CollectionType t_Collection_Bag_T_1 = createCollectionType("Collection");
	private static CollectionType t_Collection_Bag_T_2 = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_collect_V = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_excludesAll_T2 = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_flatten_T2 = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_includesAll_T2 = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_product_T2 = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_selectByKind_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_selectByType_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_T = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_T_1 = createCollectionType("Collection");
	private static CollectionType t_Collection_Collection_T_2 = createCollectionType("Collection");
	private static CollectionType t_Collection_EnumerationLiteral = createCollectionType("Collection");
	private static CollectionType t_Collection_OclAny = createCollectionType("Collection");
	private static CollectionType t_Collection_OclAny_1 = createCollectionType("Collection");
	private static CollectionType t_Collection_OclAny_2 = createCollectionType("Collection");
	private static CollectionType t_Collection_OclAny_3 = createCollectionType("Collection");
	private static CollectionType t_Collection_OclElement = createCollectionType("Collection");
	private static CollectionType t_Collection_OclSelf = createCollectionType("Collection");
	private static CollectionType t_Collection_OrderedSet_flatten_T2 = createCollectionType("Collection");
	private static CollectionType t_Collection_OrderedSet_selectByKind_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_OrderedSet_selectByType_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_OrderedSet_T = createCollectionType("Collection");
	private static CollectionType t_Collection_OrderedSet_T_1 = createCollectionType("Collection");
	private static CollectionType t_Collection_Sequence_collect_V = createCollectionType("Collection");
	private static CollectionType t_Collection_Sequence_flatten_T2 = createCollectionType("Collection");
	private static CollectionType t_Collection_Sequence_selectByKind_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_Sequence_selectByType_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_Sequence_T = createCollectionType("Collection");
	private static CollectionType t_Collection_Sequence_T_1 = createCollectionType("Collection");
	private static CollectionType t_Collection_Set_flatten_T2 = createCollectionType("Collection");
	private static CollectionType t_Collection_Set_selectByKind_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_Set_selectByType_TT = createCollectionType("Collection");
	private static CollectionType t_Collection_Set_T = createCollectionType("Collection");
	private static CollectionType t_Collection_Set_T_1 = createCollectionType("Collection");
	private static CollectionType t_Collection_UniqueCollection_T = createCollectionType("Collection");
	private static CollectionType t_Collection_UniqueCollection_T_1 = createCollectionType("Collection");
	private static CollectionType t_Collection = createCollectionType("Collection");
	private static Class t_Collection_collectNested_V = createClass("V");
	private static Class t_Collection_collect_V = createClass("V");
	private static Class t_Collection_excludesAll_T2 = createClass("T2");
	private static Class t_Collection_flatten_T2 = createClass("T2");
	private static Class t_Collection_includesAll_T2 = createClass("T2");
	private static Class t_Collection_iterate_Tacc = createClass("Tacc");
	private static Class t_Collection_product_T2 = createClass("T2");
	private static Class t_Collection_selectByKind_TT = createClass("TT");
	private static Class t_Collection_selectByType_TT = createClass("TT");
	private static Class t_Collection_T = createClass("T");
	private static Class t_Enumeration = createClass("Enumeration");
	private static ClassifierType t_EnumerationClassifier_OclSelf = createClassifierType("EnumerationClassifier");
	private static ClassifierType t_EnumerationClassifier = createClassifierType("EnumerationClassifier");
	private static Class t_EnumerationClassifier_T = createClass("T");
	private static Class t_EnumerationLiteral = createClass("EnumerationLiteral");
	private static AnyType t_OclAny = createAnyType("OclAny");
	private static Class t_OclAny_oclAsType_TT = createClass("TT");
	private static Class t_OclAny_oclIsKindOf_T = createClass("T");
	private static Class t_OclAny_oclIsTypeOf_T = createClass("T");
	private static Class t_OclComparable = createClass("OclComparable");
	private static Class t_OclElement = createClass("OclElement");
	private static InvalidType t_OclInvalid = createInvalidType("OclInvalid");
	private static Class t_OclLambda = createClass("OclLambda");
	private static Class t_OclMessage = createClass("OclMessage");
	private static SelfType t_OclSelf = createSelfType("OclSelf");
	private static Class t_OclState = createClass("OclState");
	private static Class t_OclSummable = createClass("OclSummable");
	private static Class t_OclTuple = createClass("OclTuple");
	private static Class t_OclType = createClass("OclType");
	private static VoidType t_OclVoid = createVoidType("OclVoid");
	private static OrderedSetType t_OrderedSet_Collection_T = createOrderedSetType("OrderedSet");
	private static OrderedSetType t_OrderedSet_EnumerationLiteral = createOrderedSetType("OrderedSet");
	private static OrderedSetType t_OrderedSet_OrderedSet_flatten_T2 = createOrderedSetType("OrderedSet");
	private static OrderedSetType t_OrderedSet_OrderedSet_selectByKind_TT = createOrderedSetType("OrderedSet");
	private static OrderedSetType t_OrderedSet_OrderedSet_selectByType_TT = createOrderedSetType("OrderedSet");
	private static OrderedSetType t_OrderedSet_Sequence_T = createOrderedSetType("OrderedSet");
	private static OrderedSetType t_OrderedSet_Set_T = createOrderedSetType("OrderedSet");
	private static OrderedSetType t_OrderedSet_UniqueCollection_T = createOrderedSetType("OrderedSet");
	private static OrderedSetType t_OrderedSet = createOrderedSetType("OrderedSet");
	private static Class t_OrderedSet_flatten_T2 = createClass("T2");
	private static Class t_OrderedSet_selectByKind_TT = createClass("TT");
	private static Class t_OrderedSet_selectByType_TT = createClass("TT");
	private static Class t_OrderedSet_T = createClass("T");
	private static SequenceType t_Sequence_Integer = createSequenceType("Sequence");
	private static SequenceType t_Sequence_String = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Bag_T = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Collection_T = createSequenceType("Sequence");
	private static SequenceType t_Sequence_EnumerationLiteral = createSequenceType("Sequence");
	private static SequenceType t_Sequence_OrderedSet_flatten_T2 = createSequenceType("Sequence");
	private static SequenceType t_Sequence_OrderedSet_selectByKind_TT = createSequenceType("Sequence");
	private static SequenceType t_Sequence_OrderedSet_selectByType_TT = createSequenceType("Sequence");
	private static SequenceType t_Sequence_OrderedSet_T = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Sequence_collect_V = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Sequence_flatten_T2 = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Sequence_selectByKind_TT = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Sequence_selectByType_TT = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Sequence_T = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Sequence_T_1 = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Sequence_T_2 = createSequenceType("Sequence");
	private static SequenceType t_Sequence_Set_T = createSequenceType("Sequence");
	private static SequenceType t_Sequence_UniqueCollection_T = createSequenceType("Sequence");
	private static SequenceType t_Sequence = createSequenceType("Sequence");
	private static Class t_Sequence_collectNested_V = createClass("V");
	private static Class t_Sequence_collect_V = createClass("V");
	private static Class t_Sequence_flatten_T2 = createClass("T2");
	private static Class t_Sequence_selectByKind_TT = createClass("TT");
	private static Class t_Sequence_selectByType_TT = createClass("TT");
	private static Class t_Sequence_T = createClass("T");
	private static SetType t_Set_Tuple = createSetType("Set");
	private static SetType t_Set_Bag_T = createSetType("Set");
	private static SetType t_Set_Collection_T = createSetType("Set");
	private static SetType t_Set_OclElement = createSetType("Set");
	private static SetType t_Set_OclSelf = createSetType("Set");
	private static SetType t_Set_Set_flatten_T2 = createSetType("Set");
	private static SetType t_Set_Set_selectByKind_TT = createSetType("Set");
	private static SetType t_Set_Set_selectByType_TT = createSetType("Set");
	private static SetType t_Set_UniqueCollection_T = createSetType("Set");
	private static SetType t_Set = createSetType("Set");
	private static Class t_Set_flatten_T2 = createClass("T2");
	private static Class t_Set_selectByKind_TT = createClass("TT");
	private static Class t_Set_selectByType_TT = createClass("TT");
	private static Class t_Set_T = createClass("T");
	private static Class t_Type = createClass("Type");
	private static CollectionType t_UniqueCollection_Tuple = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Tuple_1 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Bag_T = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Bag_T_1 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Bag_T_2 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Bag_T_3 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Collection_T = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_EnumerationLiteral = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OclAny = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OclElement = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OclSelf = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OclSelf_1 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OclSelf_2 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OclSelf_3 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OclSelf_4 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OclSelf_5 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OrderedSet_flatten_T2 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OrderedSet_selectByKind_TT = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OrderedSet_selectByType_TT = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_OrderedSet_T = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Sequence_T = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Sequence_T_1 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Sequence_T_2 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Set_flatten_T2 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Set_selectByKind_TT = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Set_selectByType_TT = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_Set_T = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_UniqueCollection_T = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection_UniqueCollection_T_1 = createCollectionType("UniqueCollection");
	private static CollectionType t_UniqueCollection = createCollectionType("UniqueCollection");
	private static Class t_UniqueCollection_T = createClass("T");
	private static AnyType t_$$ = createAnyType("$$");
	
	private static Parameter pa_Boolean__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Boolean__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Boolean_and_b = createParameter("b", t_Boolean);
	private static Parameter pa_Boolean_implies_b = createParameter("b", t_Boolean);
	private static Parameter pa_Boolean_or_b = createParameter("b", t_Boolean);
	private static Parameter pa_Boolean_xor_b = createParameter("b", t_Boolean);
	private static Parameter pa_Integer__mul__i = createParameter("i", t_OclSelf);
	private static Parameter pa_Integer__add__i = createParameter("i", t_OclSelf);
	private static Parameter pa_Integer__sub__i = createParameter("i", t_OclSelf);
	private static Parameter pa_Integer__div__i = createParameter("i", t_OclSelf);
	private static Parameter pa_Integer_compareTo_that = createParameter("that", t_OclSelf);
	private static Parameter pa_Integer_div_i = createParameter("i", t_Integer);
	private static Parameter pa_Integer_max_i = createParameter("i", t_OclSelf);
	private static Parameter pa_Integer_min_i = createParameter("i", t_OclSelf);
	private static Parameter pa_Integer_mod_i = createParameter("i", t_Integer);
	private static Parameter pa_Real__mul__r = createParameter("r", t_OclSelf);
	private static Parameter pa_Real__add__r = createParameter("r", t_OclSelf);
	private static Parameter pa_Real__sub__r = createParameter("r", t_OclSelf);
	private static Parameter pa_Real__div__r = createParameter("r", t_OclSelf);
	private static Parameter pa_Real__lt__r = createParameter("r", t_OclSelf);
	private static Parameter pa_Real__lt__eq__r = createParameter("r", t_OclSelf);
	private static Parameter pa_Real__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Real__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Real__gt__r = createParameter("r", t_OclSelf);
	private static Parameter pa_Real__gt__eq__r = createParameter("r", t_OclSelf);
	private static Parameter pa_Real_compareTo_that = createParameter("that", t_OclSelf);
	private static Parameter pa_Real_max_r = createParameter("r", t_OclSelf);
	private static Parameter pa_Real_min_r = createParameter("r", t_OclSelf);
	private static Parameter pa_String__add__s = createParameter("s", t_String);
	private static Parameter pa_String__lt__s = createParameter("s", t_OclSelf);
	private static Parameter pa_String__lt__eq__s = createParameter("s", t_OclSelf);
	private static Parameter pa_String__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_String__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_String__gt__s = createParameter("s", t_OclSelf);
	private static Parameter pa_String__gt__eq__s = createParameter("s", t_OclSelf);
	private static Parameter pa_String_at_i = createParameter("i", t_Integer);
	private static Parameter pa_String_compareTo_that = createParameter("that", t_OclSelf);
	private static Parameter pa_String_concat_s = createParameter("s", t_String);
	private static Parameter pa_String_equalsIgnoreCase_s = createParameter("s", t_String);
	private static Parameter pa_String_indexOf_s = createParameter("s", t_String);
	private static Parameter pa_String_substring_lower = createParameter("lower", t_Integer);
	private static Parameter pa_String_substring_upper = createParameter("upper", t_Integer);
	private static Parameter pa_UnlimitedNatural_oclAsType_type = createParameter("type", t_AnyClassifier_UnlimitedNatural_oclAsType_TT);
	private static Parameter pa_Bag__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Bag__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Bag_closure_body = createParameter("body", t_Lambda_Bag_T_5);
	private static Parameter pa_Bag_closure_i = createParameter("i", t_Bag_T);
	private static Parameter pa_Bag_collectNested_body = createParameter("body", t_Lambda_Bag_T_2);
	private static Parameter pa_Bag_collectNested_i = createParameter("i", t_Bag_T);
	private static Parameter pa_Bag_collect_body = createParameter("body", t_Lambda_Bag_T_3);
	private static Parameter pa_Bag_collect_i = createParameter("i", t_Bag_T);
	private static Parameter pa_Bag_excluding_object = createParameter("object", t_OclAny);
	private static Parameter pa_Bag_including_object = createParameter("object", t_Bag_T);
	private static Parameter pa_Bag_intersection_bag = createParameter("bag", t_Collection_Bag_T);
	private static Parameter pa_Bag_intersection_s = createParameter("s", t_UniqueCollection_Bag_T_3);
	private static Parameter pa_Bag_reject_body = createParameter("body", t_Lambda_Bag_T_1);
	private static Parameter pa_Bag_reject_i = createParameter("i", t_Bag_T);
	private static Parameter pa_Bag_select_body = createParameter("body", t_Lambda_Bag_T);
	private static Parameter pa_Bag_select_i = createParameter("i", t_Bag_T);
	private static Parameter pa_Bag_selectByKind_type = createParameter("type", t_AnyClassifier_Bag_selectByKind_TT);
	private static Parameter pa_Bag_selectByType_type = createParameter("type", t_AnyClassifier_Bag_selectByType_TT);
	private static Parameter pa_Bag_sortedBy_body = createParameter("body", t_Lambda_Bag_T_4);
	private static Parameter pa_Bag_sortedBy_i = createParameter("i", t_Bag_T);
	private static Parameter pa_Bag_union_bag = createParameter("bag", t_Collection_Bag_T);
	private static Parameter pa_Bag_union_s = createParameter("s", t_UniqueCollection_Bag_T_3);
	private static Parameter pa_Collection__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Collection__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Collection_any_body = createParameter("body", t_Lambda_Collection_T_4);
	private static Parameter pa_Collection_any_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_collectNested_body = createParameter("body", t_Lambda_Collection_T_8);
	private static Parameter pa_Collection_collectNested_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_collect_body = createParameter("body", t_Lambda_Collection_T_9);
	private static Parameter pa_Collection_collect_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_count_object = createParameter("object", t_OclAny);
	private static Parameter pa_Collection_excludes_object = createParameter("object", t_OclAny);
	private static Parameter pa_Collection_excludesAll_c2 = createParameter("c2", t_Collection_Collection_excludesAll_T2);
	private static Parameter pa_Collection_excluding_object = createParameter("object", t_OclAny);
	private static Parameter pa_Collection_exists_body = createParameter("body", t_Lambda_Collection_T_7);
	private static Parameter pa_Collection_exists_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_exists_j = createParameter("j", t_Collection_T);
	private static Parameter pa_Collection_exists_body_1 = createParameter("body", t_Lambda_Collection_T_5);
	private static Parameter pa_Collection_exists_i_1 = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_forAll_body = createParameter("body", t_Lambda_Collection_T);
	private static Parameter pa_Collection_forAll_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_forAll_j = createParameter("j", t_Collection_T);
	private static Parameter pa_Collection_forAll_body_1 = createParameter("body", t_Lambda_Collection_T_1);
	private static Parameter pa_Collection_forAll_i_1 = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_includes_object = createParameter("object", t_OclAny);
	private static Parameter pa_Collection_includesAll_c2 = createParameter("c2", t_Collection_Collection_includesAll_T2);
	private static Parameter pa_Collection_including_object = createParameter("object", t_Collection_T);
	private static Parameter pa_Collection_isUnique_body = createParameter("body", t_Lambda_Collection_T_11);
	private static Parameter pa_Collection_isUnique_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_iterate_acc = createParameter("acc", t_Collection_iterate_Tacc);
	private static Parameter pa_Collection_iterate_body = createParameter("body", t_Lambda_Collection_T_10);
	private static Parameter pa_Collection_iterate_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_one_body = createParameter("body", t_Lambda_Collection_T_3);
	private static Parameter pa_Collection_one_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_product_c2 = createParameter("c2", t_Collection_Collection_product_T2);
	private static Parameter pa_Collection_reject_body = createParameter("body", t_Lambda_Collection_T_6);
	private static Parameter pa_Collection_reject_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_select_body = createParameter("body", t_Lambda_Collection_T_2);
	private static Parameter pa_Collection_select_i = createParameter("i", t_Collection_T);
	private static Parameter pa_Collection_selectByKind_type = createParameter("type", t_AnyClassifier_Collection_selectByKind_TT);
	private static Parameter pa_Collection_selectByType_type = createParameter("type", t_AnyClassifier_Collection_selectByType_TT);
	private static Parameter pa_Collection_sortedBy_body = createParameter("body", t_Lambda_Collection_T_12);
	private static Parameter pa_Collection_sortedBy_i = createParameter("i", t_Collection_T);
	private static Parameter pa_OclAny__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OclAny__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OclAny_oclAsType_type = createParameter("type", t_AnyClassifier_OclAny_oclAsType_TT);
	private static Parameter pa_OclAny_oclIsInState_statespec = createParameter("statespec", t_OclState);
	private static Parameter pa_OclAny_oclIsKindOf_type = createParameter("type", t_AnyClassifier_OclAny_oclIsKindOf_T);
	private static Parameter pa_OclAny_oclIsTypeOf_type = createParameter("type", t_AnyClassifier_OclAny_oclIsTypeOf_T);
	private static Parameter pa_OclComparable_compareTo_that = createParameter("that", t_OclSelf);
	private static Parameter pa_OclInvalid__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OclInvalid__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OclSummable_sum_that = createParameter("that", t_OclSelf);
	private static Parameter pa_OclTuple__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OclTuple__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OclType_conformsTo_type2 = createParameter("type2", t_OclType);
	private static Parameter pa_OclVoid__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OclVoid__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OclVoid_and_b = createParameter("b", t_Boolean);
	private static Parameter pa_OclVoid_implies_b = createParameter("b", t_Boolean);
	private static Parameter pa_OclVoid_or_b = createParameter("b", t_Boolean);
	private static Parameter pa_OrderedSet__sub__s = createParameter("s", t_UniqueCollection_OclAny);
	private static Parameter pa_OrderedSet__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OrderedSet__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_OrderedSet_append_object = createParameter("object", t_OrderedSet_T);
	private static Parameter pa_OrderedSet_excluding_object = createParameter("object", t_OclAny);
	private static Parameter pa_OrderedSet_including_object = createParameter("object", t_OrderedSet_T);
	private static Parameter pa_OrderedSet_insertAt_index = createParameter("index", t_Integer);
	private static Parameter pa_OrderedSet_insertAt_object = createParameter("object", t_OrderedSet_T);
	private static Parameter pa_OrderedSet_intersection_o = createParameter("o", t_Collection_OrderedSet_T_1);
	private static Parameter pa_OrderedSet_prepend_object = createParameter("object", t_OrderedSet_T);
	private static Parameter pa_OrderedSet_reject_body = createParameter("body", t_Lambda_OrderedSet_T);
	private static Parameter pa_OrderedSet_reject_i = createParameter("i", t_OrderedSet_T);
	private static Parameter pa_OrderedSet_select_body = createParameter("body", t_Lambda_OrderedSet_T_1);
	private static Parameter pa_OrderedSet_select_i = createParameter("i", t_OrderedSet_T);
	private static Parameter pa_OrderedSet_selectByKind_type = createParameter("type", t_AnyClassifier_OrderedSet_selectByKind_TT);
	private static Parameter pa_OrderedSet_selectByType_type = createParameter("type", t_AnyClassifier_OrderedSet_selectByType_TT);
	private static Parameter pa_OrderedSet_sortedBy_body = createParameter("body", t_Lambda_OrderedSet_T_2);
	private static Parameter pa_OrderedSet_sortedBy_i = createParameter("i", t_OrderedSet_T);
	private static Parameter pa_OrderedSet_subOrderedSet_lower = createParameter("lower", t_Integer);
	private static Parameter pa_OrderedSet_subOrderedSet_upper = createParameter("upper", t_Integer);
	private static Parameter pa_OrderedSet_union_o = createParameter("o", t_Sequence_OrderedSet_T);
	private static Parameter pa_Sequence__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Sequence__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Sequence_append_object = createParameter("object", t_Sequence_T);
	private static Parameter pa_Sequence_at_index = createParameter("index", t_Integer);
	private static Parameter pa_Sequence_closure_body = createParameter("body", t_Lambda_Sequence_T_3);
	private static Parameter pa_Sequence_closure_i = createParameter("i", t_Sequence_T);
	private static Parameter pa_Sequence_collectNested_body = createParameter("body", t_Lambda_Sequence_T_4);
	private static Parameter pa_Sequence_collectNested_i = createParameter("i", t_Sequence_T);
	private static Parameter pa_Sequence_collect_body = createParameter("body", t_Lambda_Sequence_T_5);
	private static Parameter pa_Sequence_collect_i = createParameter("i", t_Sequence_T);
	private static Parameter pa_Sequence_excluding_object = createParameter("object", t_OclAny);
	private static Parameter pa_Sequence_including_object = createParameter("object", t_Sequence_T);
	private static Parameter pa_Sequence_indexOf_obj = createParameter("obj", t_OclAny);
	private static Parameter pa_Sequence_insertAt_index = createParameter("index", t_Integer);
	private static Parameter pa_Sequence_insertAt_object = createParameter("object", t_Sequence_T);
	private static Parameter pa_Sequence_intersection_c = createParameter("c", t_Collection_Sequence_T_1);
	private static Parameter pa_Sequence_intersection_s = createParameter("s", t_UniqueCollection_Sequence_T_2);
	private static Parameter pa_Sequence_prepend_object = createParameter("object", t_Sequence_T);
	private static Parameter pa_Sequence_reject_body = createParameter("body", t_Lambda_Sequence_T_1);
	private static Parameter pa_Sequence_reject_i = createParameter("i", t_Sequence_T);
	private static Parameter pa_Sequence_select_body = createParameter("body", t_Lambda_Sequence_T);
	private static Parameter pa_Sequence_select_i = createParameter("i", t_Sequence_T);
	private static Parameter pa_Sequence_selectByKind_type = createParameter("type", t_AnyClassifier_Sequence_selectByKind_TT);
	private static Parameter pa_Sequence_selectByType_type = createParameter("type", t_AnyClassifier_Sequence_selectByType_TT);
	private static Parameter pa_Sequence_sortedBy_body = createParameter("body", t_Lambda_Sequence_T_2);
	private static Parameter pa_Sequence_sortedBy_i = createParameter("i", t_Sequence_T);
	private static Parameter pa_Sequence_subSequence_lower = createParameter("lower", t_Integer);
	private static Parameter pa_Sequence_subSequence_upper = createParameter("upper", t_Integer);
	private static Parameter pa_Sequence_union_s = createParameter("s", t_Sequence);
	private static Parameter pa_Set__sub__s = createParameter("s", t_UniqueCollection_OclAny);
	private static Parameter pa_Set__lt__gt__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Set__eq__object2 = createParameter("object2", t_OclSelf);
	private static Parameter pa_Set_excluding_object = createParameter("object", t_OclAny);
	private static Parameter pa_Set_including_object = createParameter("object", t_Set_T);
	private static Parameter pa_Set_intersection_s = createParameter("s", t_Collection_Set_T_1);
	private static Parameter pa_Set_reject_body = createParameter("body", t_Lambda_Set_T_1);
	private static Parameter pa_Set_reject_i = createParameter("i", t_Set_T);
	private static Parameter pa_Set_select_body = createParameter("body", t_Lambda_Set_T);
	private static Parameter pa_Set_select_i = createParameter("i", t_Set_T);
	private static Parameter pa_Set_selectByKind_type = createParameter("type", t_AnyClassifier_Set_selectByKind_TT);
	private static Parameter pa_Set_selectByType_type = createParameter("type", t_AnyClassifier_Set_selectByType_TT);
	private static Parameter pa_Set_sortedBy_body = createParameter("body", t_Lambda_Set_T_2);
	private static Parameter pa_Set_sortedBy_i = createParameter("i", t_Set_T);
	private static Parameter pa_Set_union_s = createParameter("s", t_Collection_Set_T_1);
	private static Parameter pa_UniqueCollection__sub__s = createParameter("s", t_UniqueCollection_OclAny);
	private static Parameter pa_UniqueCollection_sortedBy_body = createParameter("body", t_Lambda_UniqueCollection_T);
	private static Parameter pa_UniqueCollection_sortedBy_i = createParameter("i", t_UniqueCollection_T);
	private static Parameter pa_UniqueCollection_symmetricDifference_s = createParameter("s", t_UniqueCollection_OclAny);
	private static Parameter pa_UniqueCollection_union_s = createParameter("s", t_Collection_UniqueCollection_T);
	
	private static Iteration it_Bag_closure = createIteration("closure", t_Set_Bag_T, "org.eclipse.ocl.examples.library.iterator.ClosureIteration", org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE, pa_Bag_closure_body, pa_Bag_closure_i);
	private static Iteration it_Bag_collectNested = createIteration("collectNested", t_Bag, "org.eclipse.ocl.examples.library.iterator.CollectNestedIteration", org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE, pa_Bag_collectNested_body, pa_Bag_collectNested_i);
	private static Iteration it_Bag_collect = createIteration("collect", t_Bag_Bag_collect_V, "org.eclipse.ocl.examples.library.iterator.CollectIteration", org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE, pa_Bag_collect_body, pa_Bag_collect_i);
	private static Iteration it_Bag_reject = createIteration("reject", t_Bag, "org.eclipse.ocl.examples.library.iterator.RejectIteration", org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE, pa_Bag_reject_body, pa_Bag_reject_i);
	private static Iteration it_Bag_select = createIteration("select", t_Bag, "org.eclipse.ocl.examples.library.iterator.SelectIteration", org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE, pa_Bag_select_body, pa_Bag_select_i);
	private static Iteration it_Bag_sortedBy = createIteration("sortedBy", t_Sequence_Bag_T, "org.eclipse.ocl.examples.library.iterator.SortedByIteration", org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE, pa_Bag_sortedBy_body, pa_Bag_sortedBy_i);
	private static Iteration it_Collection_any = createIteration("any", t_Collection_T, "org.eclipse.ocl.examples.library.iterator.AnyIteration", org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE, pa_Collection_any_body, pa_Collection_any_i);
	private static Iteration it_Collection_collectNested = createIteration("collectNested", t_Collection, "org.eclipse.ocl.examples.library.iterator.CollectNestedIteration", org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE, pa_Collection_collectNested_body, pa_Collection_collectNested_i);
	private static Iteration it_Collection_collect = createIteration("collect", t_Collection_Collection_collect_V, "org.eclipse.ocl.examples.library.iterator.CollectIteration", org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE, pa_Collection_collect_body, pa_Collection_collect_i);
	private static Iteration it_Collection_exists = createIteration("exists", t_Boolean, "org.eclipse.ocl.examples.library.iterator.ExistsIteration", org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE, pa_Collection_exists_body, pa_Collection_exists_j, pa_Collection_exists_i);
	private static Iteration it_Collection_exists_1 = createIteration("exists", t_Boolean, "org.eclipse.ocl.examples.library.iterator.ExistsIteration", org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE, pa_Collection_exists_body_1, pa_Collection_exists_i_1);
	private static Iteration it_Collection_forAll = createIteration("forAll", t_Boolean, "org.eclipse.ocl.examples.library.iterator.ForAllIteration", org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE, pa_Collection_forAll_body, pa_Collection_forAll_j, pa_Collection_forAll_i);
	private static Iteration it_Collection_forAll_1 = createIteration("forAll", t_Boolean, "org.eclipse.ocl.examples.library.iterator.ForAllIteration", org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE, pa_Collection_forAll_body_1, pa_Collection_forAll_i_1);
	private static Iteration it_Collection_isUnique = createIteration("isUnique", t_Boolean, "org.eclipse.ocl.examples.library.iterator.IsUniqueIteration", org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE, pa_Collection_isUnique_body, pa_Collection_isUnique_i);
	private static Iteration it_Collection_iterate = createIteration("iterate", t_Collection_iterate_Tacc, "org.eclipse.ocl.examples.library.iterator.IterateIteration", org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE, pa_Collection_iterate_body, pa_Collection_iterate_i);
	private static Iteration it_Collection_one = createIteration("one", t_Boolean, "org.eclipse.ocl.examples.library.iterator.OneIteration", org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE, pa_Collection_one_body, pa_Collection_one_i);
	private static Iteration it_Collection_reject = createIteration("reject", t_Collection, "org.eclipse.ocl.examples.library.iterator.RejectIteration", org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE, pa_Collection_reject_body, pa_Collection_reject_i);
	private static Iteration it_Collection_select = createIteration("select", t_Collection, "org.eclipse.ocl.examples.library.iterator.SelectIteration", org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE, pa_Collection_select_body, pa_Collection_select_i);
	private static Iteration it_Collection_sortedBy = createIteration("sortedBy", t_Sequence_Collection_T, "org.eclipse.ocl.examples.library.iterator.SortedByIteration", org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE, pa_Collection_sortedBy_body, pa_Collection_sortedBy_i);
	private static Iteration it_OrderedSet_reject = createIteration("reject", t_OrderedSet, "org.eclipse.ocl.examples.library.iterator.RejectIteration", org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE, pa_OrderedSet_reject_body, pa_OrderedSet_reject_i);
	private static Iteration it_OrderedSet_select = createIteration("select", t_OrderedSet, "org.eclipse.ocl.examples.library.iterator.SelectIteration", org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE, pa_OrderedSet_select_body, pa_OrderedSet_select_i);
	private static Iteration it_OrderedSet_sortedBy = createIteration("sortedBy", t_OrderedSet, "org.eclipse.ocl.examples.library.iterator.SortedByIteration", org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE, pa_OrderedSet_sortedBy_body, pa_OrderedSet_sortedBy_i);
	private static Iteration it_Sequence_closure = createIteration("closure", t_OrderedSet_Sequence_T, "org.eclipse.ocl.examples.library.iterator.ClosureIteration", org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE, pa_Sequence_closure_body, pa_Sequence_closure_i);
	private static Iteration it_Sequence_collectNested = createIteration("collectNested", t_Sequence, "org.eclipse.ocl.examples.library.iterator.CollectNestedIteration", org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE, pa_Sequence_collectNested_body, pa_Sequence_collectNested_i);
	private static Iteration it_Sequence_collect = createIteration("collect", t_Sequence_Sequence_collect_V, "org.eclipse.ocl.examples.library.iterator.CollectIteration", org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE, pa_Sequence_collect_body, pa_Sequence_collect_i);
	private static Iteration it_Sequence_reject = createIteration("reject", t_Sequence, "org.eclipse.ocl.examples.library.iterator.RejectIteration", org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE, pa_Sequence_reject_body, pa_Sequence_reject_i);
	private static Iteration it_Sequence_select = createIteration("select", t_Sequence, "org.eclipse.ocl.examples.library.iterator.SelectIteration", org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE, pa_Sequence_select_body, pa_Sequence_select_i);
	private static Iteration it_Sequence_sortedBy = createIteration("sortedBy", t_Sequence, "org.eclipse.ocl.examples.library.iterator.SortedByIteration", org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE, pa_Sequence_sortedBy_body, pa_Sequence_sortedBy_i);
	private static Iteration it_Set_reject = createIteration("reject", t_Set, "org.eclipse.ocl.examples.library.iterator.RejectIteration", org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE, pa_Set_reject_body, pa_Set_reject_i);
	private static Iteration it_Set_select = createIteration("select", t_Set, "org.eclipse.ocl.examples.library.iterator.SelectIteration", org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE, pa_Set_select_body, pa_Set_select_i);
	private static Iteration it_Set_sortedBy = createIteration("sortedBy", t_OrderedSet_Set_T, "org.eclipse.ocl.examples.library.iterator.SortedByIteration", org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE, pa_Set_sortedBy_body, pa_Set_sortedBy_i);
	private static Iteration it_UniqueCollection_sortedBy = createIteration("sortedBy", t_OrderedSet_UniqueCollection_T, "org.eclipse.ocl.examples.library.iterator.SortedByIteration", org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE, pa_UniqueCollection_sortedBy_body, pa_UniqueCollection_sortedBy_i);
	
	private static Operation op_Boolean__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_Boolean__lt__gt__object2);
	private static Operation op_Boolean__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_Boolean__eq__object2);
	private static Operation op_Boolean_allInstances = createOperation("allInstances", t_Set_OclSelf, "org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation", org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
	private static Operation op_Boolean_and = createOperation("and", t_Boolean, "org.eclipse.ocl.examples.library.logical.BooleanAndOperation", org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE, pa_Boolean_and_b);
	private static Operation op_Boolean_implies = createOperation("implies", t_Boolean, "org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation", org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE, pa_Boolean_implies_b);
	private static Operation op_Boolean_not = createOperation("not", t_Boolean, "org.eclipse.ocl.examples.library.logical.BooleanNotOperation", org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
	private static Operation op_Boolean_or = createOperation("or", t_Boolean, "org.eclipse.ocl.examples.library.logical.BooleanOrOperation", org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE, pa_Boolean_or_b);
	private static Operation op_Boolean_toString = createOperation("toString", t_String, "org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	private static Operation op_Boolean_xor = createOperation("xor", t_Boolean, "org.eclipse.ocl.examples.library.logical.BooleanXorOperation", org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE, pa_Boolean_xor_b);
	private static Operation op_Integer__mul_ = createOperation("*", t_Integer, "org.eclipse.ocl.examples.library.numeric.NumericTimesOperation", org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE, pa_Integer__mul__i);
	private static Operation op_Integer__add_ = createOperation("+", t_Integer, "org.eclipse.ocl.examples.library.integer.IntegerPlusOperation", org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE, pa_Integer__add__i);
	private static Operation op_Integer__sub_ = createOperation("-", t_Integer, "org.eclipse.ocl.examples.library.numeric.NumericNegateOperation", org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
	private static Operation op_Integer__sub__1 = createOperation("-", t_Integer, "org.eclipse.ocl.examples.library.integer.IntegerMinusOperation", org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE, pa_Integer__sub__i);
	private static Operation op_Integer__div_ = createOperation("/", t_Real, "org.eclipse.ocl.examples.library.numeric.NumericDivideOperation", org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE, pa_Integer__div__i);
	private static Operation op_Integer_abs = createOperation("abs", t_Integer, "org.eclipse.ocl.examples.library.numeric.NumericAbsOperation", org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
	private static Operation op_Integer_compareTo = createOperation("compareTo", t_Integer, "org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation", org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation.INSTANCE, pa_Integer_compareTo_that);
	private static Operation op_Integer_div = createOperation("div", t_Integer, "org.eclipse.ocl.examples.library.numeric.NumericDivOperation", org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE, pa_Integer_div_i);
	private static Operation op_Integer_max = createOperation("max", t_Integer, "org.eclipse.ocl.examples.library.numeric.NumericMaxOperation", org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE, pa_Integer_max_i);
	private static Operation op_Integer_min = createOperation("min", t_Integer, "org.eclipse.ocl.examples.library.numeric.NumericMinOperation", org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE, pa_Integer_min_i);
	private static Operation op_Integer_mod = createOperation("mod", t_Integer, "org.eclipse.ocl.examples.library.numeric.NumericModOperation", org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE, pa_Integer_mod_i);
	private static Operation op_Integer_toString = createOperation("toString", t_String, "org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	private static Operation op_Real__mul_ = createOperation("*", t_Real, "org.eclipse.ocl.examples.library.numeric.NumericTimesOperation", org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE, pa_Real__mul__r);
	private static Operation op_Real__add_ = createOperation("+", t_Real, "org.eclipse.ocl.examples.library.real.RealPlusOperation", org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE, pa_Real__add__r);
	private static Operation op_Real__sub_ = createOperation("-", t_Real, "org.eclipse.ocl.examples.library.numeric.NumericNegateOperation", org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
	private static Operation op_Real__sub__1 = createOperation("-", t_Real, "org.eclipse.ocl.examples.library.real.RealMinusOperation", org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE, pa_Real__sub__r);
	private static Operation op_Real__div_ = createOperation("/", t_Real, "org.eclipse.ocl.examples.library.numeric.NumericDivideOperation", org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE, pa_Real__div__r);
	private static Operation op_Real__lt_ = createOperation("<", t_Boolean, "org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation", org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE, pa_Real__lt__r);
	private static Operation op_Real__lt__eq_ = createOperation("<=", t_Boolean, "org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation", org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE, pa_Real__lt__eq__r);
	private static Operation op_Real__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_Real__lt__gt__object2);
	private static Operation op_Real__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_Real__eq__object2);
	private static Operation op_Real__gt_ = createOperation(">", t_Boolean, "org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation", org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE, pa_Real__gt__r);
	private static Operation op_Real__gt__eq_ = createOperation(">=", t_Boolean, "org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation", org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE, pa_Real__gt__eq__r);
	private static Operation op_Real_abs = createOperation("abs", t_Real, "org.eclipse.ocl.examples.library.numeric.NumericAbsOperation", org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
	private static Operation op_Real_compareTo = createOperation("compareTo", t_Integer, "org.eclipse.ocl.examples.library.real.RealCompareToOperation", org.eclipse.ocl.examples.library.real.RealCompareToOperation.INSTANCE, pa_Real_compareTo_that);
	private static Operation op_Real_floor = createOperation("floor", t_Integer, "org.eclipse.ocl.examples.library.numeric.NumericFloorOperation", org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
	private static Operation op_Real_max = createOperation("max", t_Real, "org.eclipse.ocl.examples.library.numeric.NumericMaxOperation", org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE, pa_Real_max_r);
	private static Operation op_Real_min = createOperation("min", t_Real, "org.eclipse.ocl.examples.library.numeric.NumericMinOperation", org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE, pa_Real_min_r);
	private static Operation op_Real_round = createOperation("round", t_Integer, "org.eclipse.ocl.examples.library.numeric.NumericRoundOperation", org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
	private static Operation op_Real_toString = createOperation("toString", t_String, "org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	private static Operation op_String__add_ = createOperation("+", t_String, "org.eclipse.ocl.examples.library.string.StringConcatOperation", org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE, pa_String__add__s);
	private static Operation op_String__lt_ = createOperation("<", t_Boolean, "org.eclipse.ocl.examples.library.string.StringLessThanOperation", org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE, pa_String__lt__s);
	private static Operation op_String__lt__eq_ = createOperation("<=", t_Boolean, "org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation", org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE, pa_String__lt__eq__s);
	private static Operation op_String__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_String__lt__gt__object2);
	private static Operation op_String__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_String__eq__object2);
	private static Operation op_String__gt_ = createOperation(">", t_Boolean, "org.eclipse.ocl.examples.library.string.StringGreaterThanOperation", org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE, pa_String__gt__s);
	private static Operation op_String__gt__eq_ = createOperation(">=", t_Boolean, "org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation", org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE, pa_String__gt__eq__s);
	private static Operation op_String_at = createOperation("at", t_String, "org.eclipse.ocl.examples.library.string.StringAtOperation", org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE, pa_String_at_i);
	private static Operation op_String_characters = createOperation("characters", t_Sequence_String, "org.eclipse.ocl.examples.library.string.StringCharactersOperation", org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
	private static Operation op_String_compareTo = createOperation("compareTo", t_Integer, "org.eclipse.ocl.examples.library.string.StringCompareToOperation", org.eclipse.ocl.examples.library.string.StringCompareToOperation.INSTANCE, pa_String_compareTo_that);
	private static Operation op_String_concat = createOperation("concat", t_String, "org.eclipse.ocl.examples.library.string.StringConcatOperation", org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE, pa_String_concat_s);
	private static Operation op_String_equalsIgnoreCase = createOperation("equalsIgnoreCase", t_Boolean, "org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation", org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE, pa_String_equalsIgnoreCase_s);
	private static Operation op_String_indexOf = createOperation("indexOf", t_Integer, "org.eclipse.ocl.examples.library.string.StringIndexOfOperation", org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE, pa_String_indexOf_s);
	private static Operation op_String_size = createOperation("size", t_Integer, "org.eclipse.ocl.examples.library.string.StringSizeOperation", org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
	private static Operation op_String_substring = createOperation("substring", t_String, "org.eclipse.ocl.examples.library.string.StringSubstringOperation", org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE, pa_String_substring_lower, pa_String_substring_upper);
	private static Operation op_String_toBoolean = createOperation("toBoolean", t_Boolean, "org.eclipse.ocl.examples.library.string.StringToBooleanOperation", org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
	private static Operation op_String_toInteger = createOperation("toInteger", t_Integer, "org.eclipse.ocl.examples.library.string.StringToIntegerOperation", org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
	private static Operation op_String_toLower = createOperation("toLower", t_String, "org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation", org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
	private static Operation op_String_toLowerCase = createOperation("toLowerCase", t_String, "org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation", org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
	private static Operation op_String_toReal = createOperation("toReal", t_Real, "org.eclipse.ocl.examples.library.string.StringToRealOperation", org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
	private static Operation op_String_toString = createOperation("toString", t_String, "org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	private static Operation op_String_toUpper = createOperation("toUpper", t_String, "org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation", org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
	private static Operation op_String_toUpperCase = createOperation("toUpperCase", t_String, "org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation", org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
	private static Operation op_UnlimitedNatural_oclAsType = createOperation("oclAsType", t_UnlimitedNatural_oclAsType_TT, "org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation", org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE, pa_UnlimitedNatural_oclAsType_type);
	private static Operation op_Bag__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_Bag__lt__gt__object2);
	private static Operation op_Bag__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_Bag__eq__object2);
	private static Operation op_Bag_excluding = createOperation("excluding", t_Bag, "org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation", org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE, pa_Bag_excluding_object);
	private static Operation op_Bag_flatten = createOperation("flatten", t_Bag_Bag_flatten_T2, "org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation", org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
	private static Operation op_Bag_including = createOperation("including", t_Bag, "org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation", org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE, pa_Bag_including_object);
	private static Operation op_Bag_intersection = createOperation("intersection", t_Bag, "org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation", org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE, pa_Bag_intersection_bag);
	private static Operation op_Bag_intersection_1 = createOperation("intersection", t_Set_Bag_T, "org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation", org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE, pa_Bag_intersection_s);
	private static Operation op_Bag_selectByKind = createOperation("selectByKind", t_Bag_Bag_selectByKind_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE, pa_Bag_selectByKind_type);
	private static Operation op_Bag_selectByType = createOperation("selectByType", t_Bag_Bag_selectByType_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE, pa_Bag_selectByType_type);
	private static Operation op_Bag_union = createOperation("union", t_Bag, "org.eclipse.ocl.examples.library.collection.CollectionUnionOperation", org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE, pa_Bag_union_bag);
	private static Operation op_Bag_union_1 = createOperation("union", t_Set_Bag_T, "org.eclipse.ocl.examples.library.collection.CollectionUnionOperation", org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE, pa_Bag_union_s);
	private static Operation op_Class_oclType = createOperation("oclType", t_ClassClassifier_OclSelf, "org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	private static Operation op_Collection__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_Collection__lt__gt__object2);
	private static Operation op_Collection__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_Collection__eq__object2);
	private static Operation op_Collection_asBag = createOperation("asBag", t_Bag_Collection_T, "org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation", org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
	private static Operation op_Collection_asOrderedSet = createOperation("asOrderedSet", t_OrderedSet_Collection_T, "org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation", org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
	private static Operation op_Collection_asSequence = createOperation("asSequence", t_Sequence_Collection_T, "org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation", org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
	private static Operation op_Collection_asSet = createOperation("asSet", t_Set_Collection_T, "org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation", org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
	private static Operation op_Collection_count = createOperation("count", t_Integer, "org.eclipse.ocl.examples.library.collection.CollectionCountOperation", org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE, pa_Collection_count_object);
	private static Operation op_Collection_excludes = createOperation("excludes", t_Boolean, "org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation", org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE, pa_Collection_excludes_object);
	private static Operation op_Collection_excludesAll = createOperation("excludesAll", t_Boolean, "org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation", org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE, pa_Collection_excludesAll_c2);
	private static Operation op_Collection_excluding = createOperation("excluding", t_Collection, "org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation", org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE, pa_Collection_excluding_object);
	private static Operation op_Collection_flatten = createOperation("flatten", t_Collection_Collection_flatten_T2, "org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation", org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
	private static Operation op_Collection_includes = createOperation("includes", t_Boolean, "org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation", org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE, pa_Collection_includes_object);
	private static Operation op_Collection_includesAll = createOperation("includesAll", t_Boolean, "org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation", org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE, pa_Collection_includesAll_c2);
	private static Operation op_Collection_including = createOperation("including", t_Collection, "org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation", org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE, pa_Collection_including_object);
	private static Operation op_Collection_isEmpty = createOperation("isEmpty", t_Boolean, "org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation", org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
	private static Operation op_Collection_max = createOperation("max", t_Collection_T, "org.eclipse.ocl.examples.library.collection.CollectionMaxOperation", org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
	private static Operation op_Collection_min = createOperation("min", t_Collection_T, "org.eclipse.ocl.examples.library.collection.CollectionMinOperation", org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
	private static Operation op_Collection_notEmpty = createOperation("notEmpty", t_Boolean, "org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation", org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
	private static Operation op_Collection_oclType = createOperation("oclType", t_CollectionClassifier_Collection_T_OclSelf, "org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	private static Operation op_Collection_product = createOperation("product", t_Set_Tuple, "org.eclipse.ocl.examples.library.collection.CollectionProductOperation", org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE, pa_Collection_product_c2);
	private static Operation op_Collection_selectByKind = createOperation("selectByKind", t_Collection_Collection_selectByKind_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE, pa_Collection_selectByKind_type);
	private static Operation op_Collection_selectByType = createOperation("selectByType", t_Collection_Collection_selectByType_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE, pa_Collection_selectByType_type);
	private static Operation op_Collection_size = createOperation("size", t_Integer, "org.eclipse.ocl.examples.library.collection.CollectionSizeOperation", org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
	private static Operation op_Collection_sum = createOperation("sum", t_Collection_T, "org.eclipse.ocl.examples.library.collection.CollectionSumOperation", org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
	private static Operation op_Enumeration_allInstances = createOperation("allInstances", t_Set_OclSelf, "org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation", org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
	private static Operation op_Enumeration_oclType = createOperation("oclType", t_EnumerationClassifier_OclSelf, "org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	private static Operation op_OclAny__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_OclAny__lt__gt__object2);
	private static Operation op_OclAny__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_OclAny__eq__object2);
	private static Operation op_OclAny_oclAsSet = createOperation("oclAsSet", t_Set_OclSelf, "org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
	private static Operation op_OclAny_oclAsType = createOperation("oclAsType", t_OclAny_oclAsType_TT, "org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE, pa_OclAny_oclAsType_type);
	private static Operation op_OclAny_oclIsInState = createOperation("oclIsInState", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE, pa_OclAny_oclIsInState_statespec);
	private static Operation op_OclAny_oclIsInvalid = createOperation("oclIsInvalid", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
	private static Operation op_OclAny_oclIsKindOf = createOperation("oclIsKindOf", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE, pa_OclAny_oclIsKindOf_type);
	private static Operation op_OclAny_oclIsNew = createOperation("oclIsNew", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
	private static Operation op_OclAny_oclIsTypeOf = createOperation("oclIsTypeOf", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE, pa_OclAny_oclIsTypeOf_type);
	private static Operation op_OclAny_oclIsUndefined = createOperation("oclIsUndefined", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
	private static Operation op_OclAny_oclType = createOperation("oclType", t_AnyClassifier_OclSelf, "org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation", org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	private static Operation op_OclComparable_compareTo = createOperation("compareTo", t_Integer, null, null, pa_OclComparable_compareTo_that);
	private static Operation op_OclElement_allInstances = createOperation("allInstances", t_Set_OclSelf, "org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation", org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
	private static Operation op_OclElement_oclContainer = createOperation("oclContainer", t_OclElement, "org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation", org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
	private static Operation op_OclElement_oclContents = createOperation("oclContents", t_Set_OclElement, "org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation", org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
	private static Operation op_OclInvalid__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_OclInvalid__lt__gt__object2);
	private static Operation op_OclInvalid__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_OclInvalid__eq__object2);
	private static Operation op_OclInvalid_allInstances = createOperation("allInstances", t_Set_OclSelf, "org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation", org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
	private static Operation op_OclInvalid_oclBadOperation = createOperation("oclBadOperation", t_OclInvalid, null, null);
	private static Operation op_OclInvalid_toString = createOperation("toString", t_String, "org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	private static Operation op_OclMessage_hasReturned = createOperation("hasReturned", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
	private static Operation op_OclMessage_isOperationCall = createOperation("isOperationCall", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
	private static Operation op_OclMessage_isSignalSent = createOperation("isSignalSent", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
	private static Operation op_OclMessage_result = createOperation("result", t_OclAny, "org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation", org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
	private static Operation op_OclSummable_sum = createOperation("sum", t_OclSelf, null, null, pa_OclSummable_sum_that);
	private static Operation op_OclSummable_zero = createOperation("zero", t_OclSelf, null, null);
	private static Operation op_OclTuple__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_OclTuple__lt__gt__object2);
	private static Operation op_OclTuple__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_OclTuple__eq__object2);
	private static Operation op_OclType_conformsTo = createOperation("conformsTo", t_Boolean, "org.eclipse.ocl.examples.library.classifier.OclTypeConformsToOperation", org.eclipse.ocl.examples.library.classifier.OclTypeConformsToOperation.INSTANCE, pa_OclType_conformsTo_type2);
	private static Operation op_OclVoid__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_OclVoid__lt__gt__object2);
	private static Operation op_OclVoid__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_OclVoid__eq__object2);
	private static Operation op_OclVoid_allInstances = createOperation("allInstances", t_Set_OclSelf, "org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation", org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
	private static Operation op_OclVoid_and = createOperation("and", t_Boolean, "org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation", org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE, pa_OclVoid_and_b);
	private static Operation op_OclVoid_implies = createOperation("implies", t_Boolean, "org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation", org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE, pa_OclVoid_implies_b);
	private static Operation op_OclVoid_or = createOperation("or", t_Boolean, "org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation", org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE, pa_OclVoid_or_b);
	private static Operation op_OclVoid_toString = createOperation("toString", t_String, "org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation", org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	private static Operation op_OrderedSet__sub_ = createOperation("-", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.SetMinusOperation", org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE, pa_OrderedSet__sub__s);
	private static Operation op_OrderedSet__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_OrderedSet__lt__gt__object2);
	private static Operation op_OrderedSet__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_OrderedSet__eq__object2);
	private static Operation op_OrderedSet_append = createOperation("append", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE, pa_OrderedSet_append_object);
	private static Operation op_OrderedSet_excluding = createOperation("excluding", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation", org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE, pa_OrderedSet_excluding_object);
	private static Operation op_OrderedSet_flatten = createOperation("flatten", t_OrderedSet_OrderedSet_flatten_T2, "org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation", org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
	private static Operation op_OrderedSet_including = createOperation("including", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation", org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE, pa_OrderedSet_including_object);
	private static Operation op_OrderedSet_insertAt = createOperation("insertAt", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE, pa_OrderedSet_insertAt_index, pa_OrderedSet_insertAt_object);
	private static Operation op_OrderedSet_intersection = createOperation("intersection", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation", org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE, pa_OrderedSet_intersection_o);
	private static Operation op_OrderedSet_prepend = createOperation("prepend", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE, pa_OrderedSet_prepend_object);
	private static Operation op_OrderedSet_reverse = createOperation("reverse", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
	private static Operation op_OrderedSet_selectByKind = createOperation("selectByKind", t_OrderedSet_OrderedSet_selectByKind_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE, pa_OrderedSet_selectByKind_type);
	private static Operation op_OrderedSet_selectByType = createOperation("selectByType", t_OrderedSet_OrderedSet_selectByType_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE, pa_OrderedSet_selectByType_type);
	private static Operation op_OrderedSet_subOrderedSet = createOperation("subOrderedSet", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation", org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE, pa_OrderedSet_subOrderedSet_lower, pa_OrderedSet_subOrderedSet_upper);
	private static Operation op_OrderedSet_union = createOperation("union", t_OrderedSet, "org.eclipse.ocl.examples.library.collection.CollectionUnionOperation", org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE, pa_OrderedSet_union_o);
	private static Operation op_Sequence__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_Sequence__lt__gt__object2);
	private static Operation op_Sequence__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_Sequence__eq__object2);
	private static Operation op_Sequence_append = createOperation("append", t_Sequence, "org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE, pa_Sequence_append_object);
	private static Operation op_Sequence_at = createOperation("at", t_Sequence_T, "org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE, pa_Sequence_at_index);
	private static Operation op_Sequence_excluding = createOperation("excluding", t_Sequence, "org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation", org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE, pa_Sequence_excluding_object);
	private static Operation op_Sequence_first = createOperation("first", t_Sequence_T, "org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
	private static Operation op_Sequence_flatten = createOperation("flatten", t_Sequence_Sequence_flatten_T2, "org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation", org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
	private static Operation op_Sequence_including = createOperation("including", t_Sequence, "org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation", org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE, pa_Sequence_including_object);
	private static Operation op_Sequence_indexOf = createOperation("indexOf", t_Integer, "org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE, pa_Sequence_indexOf_obj);
	private static Operation op_Sequence_insertAt = createOperation("insertAt", t_Sequence, "org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE, pa_Sequence_insertAt_index, pa_Sequence_insertAt_object);
	private static Operation op_Sequence_intersection = createOperation("intersection", t_Bag_Sequence_T, "org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation", org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE, pa_Sequence_intersection_c);
	private static Operation op_Sequence_intersection_1 = createOperation("intersection", t_OrderedSet_Sequence_T, "org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation", org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE, pa_Sequence_intersection_s);
	private static Operation op_Sequence_last = createOperation("last", t_Sequence_T, "org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
	private static Operation op_Sequence_prepend = createOperation("prepend", t_Sequence, "org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE, pa_Sequence_prepend_object);
	private static Operation op_Sequence_reverse = createOperation("reverse", t_Sequence, "org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation", org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
	private static Operation op_Sequence_selectByKind = createOperation("selectByKind", t_Sequence_Sequence_selectByKind_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE, pa_Sequence_selectByKind_type);
	private static Operation op_Sequence_selectByType = createOperation("selectByType", t_Sequence_Sequence_selectByType_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE, pa_Sequence_selectByType_type);
	private static Operation op_Sequence_subSequence = createOperation("subSequence", t_Sequence, "org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation", org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE, pa_Sequence_subSequence_lower, pa_Sequence_subSequence_upper);
	private static Operation op_Sequence_union = createOperation("union", t_Sequence, "org.eclipse.ocl.examples.library.collection.CollectionUnionOperation", org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE, pa_Sequence_union_s);
	private static Operation op_Set__sub_ = createOperation("-", t_Set, "org.eclipse.ocl.examples.library.collection.SetMinusOperation", org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE, pa_Set__sub__s);
	private static Operation op_Set__lt__gt_ = createOperation("<>", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE, pa_Set__lt__gt__object2);
	private static Operation op_Set__eq_ = createOperation("=", t_Boolean, "org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation", org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE, pa_Set__eq__object2);
	private static Operation op_Set_excluding = createOperation("excluding", t_Set, "org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation", org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE, pa_Set_excluding_object);
	private static Operation op_Set_flatten = createOperation("flatten", t_Set_Set_flatten_T2, "org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation", org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
	private static Operation op_Set_including = createOperation("including", t_Set, "org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation", org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE, pa_Set_including_object);
	private static Operation op_Set_intersection = createOperation("intersection", t_Set, "org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation", org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE, pa_Set_intersection_s);
	private static Operation op_Set_selectByKind = createOperation("selectByKind", t_Set_Set_selectByKind_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE, pa_Set_selectByKind_type);
	private static Operation op_Set_selectByType = createOperation("selectByType", t_Set_Set_selectByType_TT, "org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation", org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE, pa_Set_selectByType_type);
	private static Operation op_Set_union = createOperation("union", t_Set, "org.eclipse.ocl.examples.library.collection.CollectionUnionOperation", org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE, pa_Set_union_s);
	private static Operation op_UniqueCollection__sub_ = createOperation("-", t_UniqueCollection, "org.eclipse.ocl.examples.library.collection.SetMinusOperation", org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE, pa_UniqueCollection__sub__s);
	private static Operation op_UniqueCollection_symmetricDifference = createOperation("symmetricDifference", t_Set_UniqueCollection_T, "org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation", org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE, pa_UniqueCollection_symmetricDifference_s);
	private static Operation op_UniqueCollection_union = createOperation("union", t_Set_UniqueCollection_T, "org.eclipse.ocl.examples.library.collection.CollectionUnionOperation", org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE, pa_UniqueCollection_union_s);
	
	private static Property pr_Tuple_first = createProperty("first", t_Collection_T, null, null);
	private static Property pr_Tuple_first_1 = createProperty("first", t_Collection_T, null, null);
	private static Property pr_Tuple_first_2 = createProperty("first", t_Collection_T, null, null);
	private static Property pr_Tuple_first_3 = createProperty("first", t_Collection_T, null, null);
	private static Property pr_Tuple_second = createProperty("second", t_Collection_product_T2, null, null);
	private static Property pr_Tuple_second_1 = createProperty("second", t_Collection_product_T2, null, null);
	private static Property pr_Tuple_second_2 = createProperty("second", t_Collection_product_T2, null, null);
	private static Property pr_Tuple_second_3 = createProperty("second", t_Collection_product_T2, null, null);
	private static Property pr_CollectionClassifier_elementType = createProperty("elementType", t_CollectionClassifier_E, "org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty", org.eclipse.ocl.examples.library.collection.CollectionClassifierElementTypeProperty.INSTANCE);
	private static Property pr_EnumerationClassifier_ownedLiteral = createProperty("ownedLiteral", t_OrderedSet_EnumerationLiteral, "org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty", org.eclipse.ocl.examples.library.enumeration.EnumerationClassifierOwnedLiteralProperty.INSTANCE);
	private static Property pr_OclInvalid_oclBadProperty = createProperty("oclBadProperty", t_OclInvalid, null, null);
	
	private static TypeTemplateParameter tp_UnlimitedNatural_oclAsType = createTypeTemplateParameter(t_UnlimitedNatural_oclAsType_TT);
	private static TypeTemplateParameter tp_AnyClassifier = createTypeTemplateParameter(t_AnyClassifier_T);
	private static TypeTemplateParameter tp_Bag_collectNested = createTypeTemplateParameter(t_Bag_collectNested_V);
	private static TypeTemplateParameter tp_Bag_collect = createTypeTemplateParameter(t_Bag_collect_V);
	private static TypeTemplateParameter tp_Bag_flatten = createTypeTemplateParameter(t_Bag_flatten_T2);
	private static TypeTemplateParameter tp_Bag_selectByKind = createTypeTemplateParameter(t_Bag_selectByKind_TT);
	private static TypeTemplateParameter tp_Bag_selectByType = createTypeTemplateParameter(t_Bag_selectByType_TT);
	private static TypeTemplateParameter tp_Bag = createTypeTemplateParameter(t_Bag_T);
	private static TypeTemplateParameter tp_ClassClassifier = createTypeTemplateParameter(t_ClassClassifier_T);
	private static TypeTemplateParameter tp_CollectionClassifier = createTypeTemplateParameter(t_CollectionClassifier_E);
	private static TypeTemplateParameter tp_CollectionClassifier_1 = createTypeTemplateParameter(t_CollectionClassifier_T);
	private static TypeTemplateParameter tp_Collection_collectNested = createTypeTemplateParameter(t_Collection_collectNested_V);
	private static TypeTemplateParameter tp_Collection_collect = createTypeTemplateParameter(t_Collection_collect_V);
	private static TypeTemplateParameter tp_Collection_excludesAll = createTypeTemplateParameter(t_Collection_excludesAll_T2);
	private static TypeTemplateParameter tp_Collection_flatten = createTypeTemplateParameter(t_Collection_flatten_T2);
	private static TypeTemplateParameter tp_Collection_includesAll = createTypeTemplateParameter(t_Collection_includesAll_T2);
	private static TypeTemplateParameter tp_Collection_iterate = createTypeTemplateParameter(t_Collection_iterate_Tacc);
	private static TypeTemplateParameter tp_Collection_product = createTypeTemplateParameter(t_Collection_product_T2);
	private static TypeTemplateParameter tp_Collection_selectByKind = createTypeTemplateParameter(t_Collection_selectByKind_TT);
	private static TypeTemplateParameter tp_Collection_selectByType = createTypeTemplateParameter(t_Collection_selectByType_TT);
	private static TypeTemplateParameter tp_Collection = createTypeTemplateParameter(t_Collection_T);
	private static TypeTemplateParameter tp_EnumerationClassifier = createTypeTemplateParameter(t_EnumerationClassifier_T);
	private static TypeTemplateParameter tp_OclAny_oclAsType = createTypeTemplateParameter(t_OclAny_oclAsType_TT);
	private static TypeTemplateParameter tp_OclAny_oclIsKindOf = createTypeTemplateParameter(t_OclAny_oclIsKindOf_T);
	private static TypeTemplateParameter tp_OclAny_oclIsTypeOf = createTypeTemplateParameter(t_OclAny_oclIsTypeOf_T);
	private static TypeTemplateParameter tp_OrderedSet_flatten = createTypeTemplateParameter(t_OrderedSet_flatten_T2);
	private static TypeTemplateParameter tp_OrderedSet_selectByKind = createTypeTemplateParameter(t_OrderedSet_selectByKind_TT);
	private static TypeTemplateParameter tp_OrderedSet_selectByType = createTypeTemplateParameter(t_OrderedSet_selectByType_TT);
	private static TypeTemplateParameter tp_OrderedSet = createTypeTemplateParameter(t_OrderedSet_T);
	private static TypeTemplateParameter tp_Sequence_collectNested = createTypeTemplateParameter(t_Sequence_collectNested_V);
	private static TypeTemplateParameter tp_Sequence_collect = createTypeTemplateParameter(t_Sequence_collect_V);
	private static TypeTemplateParameter tp_Sequence_flatten = createTypeTemplateParameter(t_Sequence_flatten_T2);
	private static TypeTemplateParameter tp_Sequence_selectByKind = createTypeTemplateParameter(t_Sequence_selectByKind_TT);
	private static TypeTemplateParameter tp_Sequence_selectByType = createTypeTemplateParameter(t_Sequence_selectByType_TT);
	private static TypeTemplateParameter tp_Sequence = createTypeTemplateParameter(t_Sequence_T);
	private static TypeTemplateParameter tp_Set_flatten = createTypeTemplateParameter(t_Set_flatten_T2);
	private static TypeTemplateParameter tp_Set_selectByKind = createTypeTemplateParameter(t_Set_selectByKind_TT);
	private static TypeTemplateParameter tp_Set_selectByType = createTypeTemplateParameter(t_Set_selectByType_TT);
	private static TypeTemplateParameter tp_Set = createTypeTemplateParameter(t_Set_T);
	private static TypeTemplateParameter tp_UniqueCollection = createTypeTemplateParameter(t_UniqueCollection_T);
	
	private static TemplateSignature ts_UnlimitedNatural_oclAsType = createTemplateSignature(op_UnlimitedNatural_oclAsType, tp_UnlimitedNatural_oclAsType);
	private static TemplateSignature ts_AnyClassifier = createTemplateSignature(t_AnyClassifier, tp_AnyClassifier);
	private static TemplateSignature ts_Bag = createTemplateSignature(t_Bag, tp_Bag);
	private static TemplateSignature ts_Bag_collectNested = createTemplateSignature(it_Bag_collectNested, tp_Bag_collectNested);
	private static TemplateSignature ts_Bag_collect = createTemplateSignature(it_Bag_collect, tp_Bag_collect);
	private static TemplateSignature ts_Bag_flatten = createTemplateSignature(op_Bag_flatten, tp_Bag_flatten);
	private static TemplateSignature ts_Bag_selectByKind = createTemplateSignature(op_Bag_selectByKind, tp_Bag_selectByKind);
	private static TemplateSignature ts_Bag_selectByType = createTemplateSignature(op_Bag_selectByType, tp_Bag_selectByType);
	private static TemplateSignature ts_ClassClassifier = createTemplateSignature(t_ClassClassifier, tp_ClassClassifier);
	private static TemplateSignature ts_CollectionClassifier = createTemplateSignature(t_CollectionClassifier, tp_CollectionClassifier_1, tp_CollectionClassifier);
	private static TemplateSignature ts_Collection = createTemplateSignature(t_Collection, tp_Collection);
	private static TemplateSignature ts_Collection_collectNested = createTemplateSignature(it_Collection_collectNested, tp_Collection_collectNested);
	private static TemplateSignature ts_Collection_collect = createTemplateSignature(it_Collection_collect, tp_Collection_collect);
	private static TemplateSignature ts_Collection_excludesAll = createTemplateSignature(op_Collection_excludesAll, tp_Collection_excludesAll);
	private static TemplateSignature ts_Collection_flatten = createTemplateSignature(op_Collection_flatten, tp_Collection_flatten);
	private static TemplateSignature ts_Collection_includesAll = createTemplateSignature(op_Collection_includesAll, tp_Collection_includesAll);
	private static TemplateSignature ts_Collection_iterate = createTemplateSignature(it_Collection_iterate, tp_Collection_iterate);
	private static TemplateSignature ts_Collection_product = createTemplateSignature(op_Collection_product, tp_Collection_product);
	private static TemplateSignature ts_Collection_selectByKind = createTemplateSignature(op_Collection_selectByKind, tp_Collection_selectByKind);
	private static TemplateSignature ts_Collection_selectByType = createTemplateSignature(op_Collection_selectByType, tp_Collection_selectByType);
	private static TemplateSignature ts_EnumerationClassifier = createTemplateSignature(t_EnumerationClassifier, tp_EnumerationClassifier);
	private static TemplateSignature ts_OclAny_oclAsType = createTemplateSignature(op_OclAny_oclAsType, tp_OclAny_oclAsType);
	private static TemplateSignature ts_OclAny_oclIsKindOf = createTemplateSignature(op_OclAny_oclIsKindOf, tp_OclAny_oclIsKindOf);
	private static TemplateSignature ts_OclAny_oclIsTypeOf = createTemplateSignature(op_OclAny_oclIsTypeOf, tp_OclAny_oclIsTypeOf);
	private static TemplateSignature ts_OrderedSet = createTemplateSignature(t_OrderedSet, tp_OrderedSet);
	private static TemplateSignature ts_OrderedSet_flatten = createTemplateSignature(op_OrderedSet_flatten, tp_OrderedSet_flatten);
	private static TemplateSignature ts_OrderedSet_selectByKind = createTemplateSignature(op_OrderedSet_selectByKind, tp_OrderedSet_selectByKind);
	private static TemplateSignature ts_OrderedSet_selectByType = createTemplateSignature(op_OrderedSet_selectByType, tp_OrderedSet_selectByType);
	private static TemplateSignature ts_Sequence = createTemplateSignature(t_Sequence, tp_Sequence);
	private static TemplateSignature ts_Sequence_collectNested = createTemplateSignature(it_Sequence_collectNested, tp_Sequence_collectNested);
	private static TemplateSignature ts_Sequence_collect = createTemplateSignature(it_Sequence_collect, tp_Sequence_collect);
	private static TemplateSignature ts_Sequence_flatten = createTemplateSignature(op_Sequence_flatten, tp_Sequence_flatten);
	private static TemplateSignature ts_Sequence_selectByKind = createTemplateSignature(op_Sequence_selectByKind, tp_Sequence_selectByKind);
	private static TemplateSignature ts_Sequence_selectByType = createTemplateSignature(op_Sequence_selectByType, tp_Sequence_selectByType);
	private static TemplateSignature ts_Set = createTemplateSignature(t_Set, tp_Set);
	private static TemplateSignature ts_Set_flatten = createTemplateSignature(op_Set_flatten, tp_Set_flatten);
	private static TemplateSignature ts_Set_selectByKind = createTemplateSignature(op_Set_selectByKind, tp_Set_selectByKind);
	private static TemplateSignature ts_Set_selectByType = createTemplateSignature(op_Set_selectByType, tp_Set_selectByType);
	private static TemplateSignature ts_UniqueCollection = createTemplateSignature(t_UniqueCollection, tp_UniqueCollection);
	
	private static Package pk_$$ = createPackage("$$", null, null);
	
	private static TemplateParameterSubstitution tps_AnyClassifier_OclInvalid = createTemplateParameterSubstitution(tp_AnyClassifier, t_OclInvalid);
	private static TemplateParameterSubstitution tps_AnyClassifier_OrderedSet_selectByType_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_OrderedSet_selectByType_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_Set_selectByType_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_Set_selectByType_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_Sequence_selectByType_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_Sequence_selectByType_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_Sequence_selectByKind_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_Sequence_selectByKind_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_Collection_selectByType_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_Collection_selectByType_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_Bag_selectByType_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_Bag_selectByType_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_OclAny_oclIsTypeOf_T = createTemplateParameterSubstitution(tp_AnyClassifier, t_OclAny_oclIsTypeOf_T);
	private static TemplateParameterSubstitution tps_AnyClassifier_EnumerationClassifier_T = createTemplateParameterSubstitution(tp_AnyClassifier, t_EnumerationClassifier_T);
	private static TemplateParameterSubstitution tps_AnyClassifier_OclSelf = createTemplateParameterSubstitution(tp_AnyClassifier, t_OclSelf);
	private static TemplateParameterSubstitution tps_AnyClassifier_OclVoid = createTemplateParameterSubstitution(tp_AnyClassifier, t_OclVoid);
	private static TemplateParameterSubstitution tps_AnyClassifier_OrderedSet_selectByKind_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_OrderedSet_selectByKind_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_OclAny_oclIsKindOf_T = createTemplateParameterSubstitution(tp_AnyClassifier, t_OclAny_oclIsKindOf_T);
	private static TemplateParameterSubstitution tps_AnyClassifier_OclInvalid_1 = createTemplateParameterSubstitution(tp_AnyClassifier, t_OclInvalid);
	private static TemplateParameterSubstitution tps_AnyClassifier_CollectionClassifier_T = createTemplateParameterSubstitution(tp_AnyClassifier, t_CollectionClassifier_T);
	private static TemplateParameterSubstitution tps_AnyClassifier_ClassClassifier_T = createTemplateParameterSubstitution(tp_AnyClassifier, t_ClassClassifier_T);
	private static TemplateParameterSubstitution tps_AnyClassifier_Bag_selectByKind_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_Bag_selectByKind_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_OclAny_oclAsType_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_OclAny_oclAsType_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_Collection_selectByKind_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_Collection_selectByKind_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_UnlimitedNatural_oclAsType_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_UnlimitedNatural_oclAsType_TT);
	private static TemplateParameterSubstitution tps_AnyClassifier_Set_selectByKind_TT = createTemplateParameterSubstitution(tp_AnyClassifier, t_Set_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Bag_UniqueCollection_T = createTemplateParameterSubstitution(tp_Bag, t_UniqueCollection_T);
	private static TemplateParameterSubstitution tps_Bag_Set_flatten_T2 = createTemplateParameterSubstitution(tp_Bag, t_Set_flatten_T2);
	private static TemplateParameterSubstitution tps_Bag_Bag_selectByKind_TT = createTemplateParameterSubstitution(tp_Bag, t_Bag_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Bag_Bag_selectByType_TT = createTemplateParameterSubstitution(tp_Bag, t_Bag_selectByType_TT);
	private static TemplateParameterSubstitution tps_Bag_OclSelf = createTemplateParameterSubstitution(tp_Bag, t_OclSelf);
	private static TemplateParameterSubstitution tps_Bag_Sequence_T = createTemplateParameterSubstitution(tp_Bag, t_Sequence_T);
	private static TemplateParameterSubstitution tps_Bag_UniqueCollection_T_1 = createTemplateParameterSubstitution(tp_Bag, t_UniqueCollection_T);
	private static TemplateParameterSubstitution tps_Bag_Set_T = createTemplateParameterSubstitution(tp_Bag, t_Set_T);
	private static TemplateParameterSubstitution tps_Bag_Tuple = createTemplateParameterSubstitution(tp_Bag, t_Tuple);
	private static TemplateParameterSubstitution tps_Bag_Bag_T = createTemplateParameterSubstitution(tp_Bag, t_Bag_T);
	private static TemplateParameterSubstitution tps_Bag_OclSelf_1 = createTemplateParameterSubstitution(tp_Bag, t_OclSelf);
	private static TemplateParameterSubstitution tps_Bag_OclElement = createTemplateParameterSubstitution(tp_Bag, t_OclElement);
	private static TemplateParameterSubstitution tps_Bag_OclSelf_2 = createTemplateParameterSubstitution(tp_Bag, t_OclSelf);
	private static TemplateParameterSubstitution tps_Bag_OclSelf_3 = createTemplateParameterSubstitution(tp_Bag, t_OclSelf);
	private static TemplateParameterSubstitution tps_Bag_Bag_T_1 = createTemplateParameterSubstitution(tp_Bag, t_Bag_T);
	private static TemplateParameterSubstitution tps_Bag_Bag_flatten_T2 = createTemplateParameterSubstitution(tp_Bag, t_Bag_flatten_T2);
	private static TemplateParameterSubstitution tps_Bag_Tuple_1 = createTemplateParameterSubstitution(tp_Bag, t_Tuple);
	private static TemplateParameterSubstitution tps_Bag_OclSelf_4 = createTemplateParameterSubstitution(tp_Bag, t_OclSelf);
	private static TemplateParameterSubstitution tps_Bag_Collection_T = createTemplateParameterSubstitution(tp_Bag, t_Collection_T);
	private static TemplateParameterSubstitution tps_Bag_Bag_collect_V = createTemplateParameterSubstitution(tp_Bag, t_Bag_collect_V);
	private static TemplateParameterSubstitution tps_Bag_Set_selectByKind_TT = createTemplateParameterSubstitution(tp_Bag, t_Set_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Bag_Bag_T_2 = createTemplateParameterSubstitution(tp_Bag, t_Bag_T);
	private static TemplateParameterSubstitution tps_Bag_OclSelf_5 = createTemplateParameterSubstitution(tp_Bag, t_OclSelf);
	private static TemplateParameterSubstitution tps_Bag_Bag_T_3 = createTemplateParameterSubstitution(tp_Bag, t_Bag_T);
	private static TemplateParameterSubstitution tps_Bag_Set_selectByType_TT = createTemplateParameterSubstitution(tp_Bag, t_Set_selectByType_TT);
	private static TemplateParameterSubstitution tps_ClassClassifier_OclSelf = createTemplateParameterSubstitution(tp_ClassClassifier, t_OclSelf);
	private static TemplateParameterSubstitution tps_ClassClassifier_OclVoid = createTemplateParameterSubstitution(tp_ClassClassifier, t_OclVoid);
	private static TemplateParameterSubstitution tps_ClassClassifier_OclInvalid = createTemplateParameterSubstitution(tp_ClassClassifier, t_OclInvalid);
	private static TemplateParameterSubstitution tps_CollectionClassifier_Collection_T_OclSelf = createTemplateParameterSubstitution(tp_CollectionClassifier, t_Collection_T);
	private static TemplateParameterSubstitution tps_CollectionClassifier_Collection_T_OclSelf_1 = createTemplateParameterSubstitution(tp_CollectionClassifier_1, t_OclSelf);
	private static TemplateParameterSubstitution tps_Collection_UniqueCollection_T = createTemplateParameterSubstitution(tp_Collection, t_UniqueCollection_T);
	private static TemplateParameterSubstitution tps_Collection_Tuple = createTemplateParameterSubstitution(tp_Collection, t_Tuple_3);
	private static TemplateParameterSubstitution tps_Collection_OrderedSet_T = createTemplateParameterSubstitution(tp_Collection, t_OrderedSet_T);
	private static TemplateParameterSubstitution tps_Collection_EnumerationLiteral = createTemplateParameterSubstitution(tp_Collection, t_EnumerationLiteral);
	private static TemplateParameterSubstitution tps_Collection_Bag_selectByKind_TT = createTemplateParameterSubstitution(tp_Collection, t_Bag_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Collection_Integer = createTemplateParameterSubstitution(tp_Collection, t_Integer);
	private static TemplateParameterSubstitution tps_Collection_Collection_T = createTemplateParameterSubstitution(tp_Collection, t_Collection_T);
	private static TemplateParameterSubstitution tps_Collection_Set_selectByKind_TT = createTemplateParameterSubstitution(tp_Collection, t_Set_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Collection_Set_selectByType_TT = createTemplateParameterSubstitution(tp_Collection, t_Set_selectByType_TT);
	private static TemplateParameterSubstitution tps_Collection_Bag_T = createTemplateParameterSubstitution(tp_Collection, t_Bag_T);
	private static TemplateParameterSubstitution tps_Collection_OrderedSet_T_1 = createTemplateParameterSubstitution(tp_Collection, t_OrderedSet_T);
	private static TemplateParameterSubstitution tps_Collection_Bag_collect_V = createTemplateParameterSubstitution(tp_Collection, t_Bag_collect_V);
	private static TemplateParameterSubstitution tps_Collection_Set_T = createTemplateParameterSubstitution(tp_Collection, t_Set_T);
	private static TemplateParameterSubstitution tps_Collection_OclAny = createTemplateParameterSubstitution(tp_Collection, t_OclAny);
	private static TemplateParameterSubstitution tps_Collection_Set_T_1 = createTemplateParameterSubstitution(tp_Collection, t_Set_T);
	private static TemplateParameterSubstitution tps_Collection_Bag_T_1 = createTemplateParameterSubstitution(tp_Collection, t_Bag_T);
	private static TemplateParameterSubstitution tps_Collection_Collection_excludesAll_T2 = createTemplateParameterSubstitution(tp_Collection, t_Collection_excludesAll_T2);
	private static TemplateParameterSubstitution tps_Collection_Collection_includesAll_T2 = createTemplateParameterSubstitution(tp_Collection, t_Collection_includesAll_T2);
	private static TemplateParameterSubstitution tps_Collection_OrderedSet_flatten_T2 = createTemplateParameterSubstitution(tp_Collection, t_OrderedSet_flatten_T2);
	private static TemplateParameterSubstitution tps_Collection_Collection_selectByKind_TT = createTemplateParameterSubstitution(tp_Collection, t_Collection_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Collection_OclSelf = createTemplateParameterSubstitution(tp_Collection, t_OclSelf);
	private static TemplateParameterSubstitution tps_Collection_Sequence_selectByKind_TT = createTemplateParameterSubstitution(tp_Collection, t_Sequence_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Collection_Sequence_flatten_T2 = createTemplateParameterSubstitution(tp_Collection, t_Sequence_flatten_T2);
	private static TemplateParameterSubstitution tps_Collection_Sequence_selectByType_TT = createTemplateParameterSubstitution(tp_Collection, t_Sequence_selectByType_TT);
	private static TemplateParameterSubstitution tps_Collection_Sequence_collect_V = createTemplateParameterSubstitution(tp_Collection, t_Sequence_collect_V);
	private static TemplateParameterSubstitution tps_Collection_Collection_flatten_T2 = createTemplateParameterSubstitution(tp_Collection, t_Collection_flatten_T2);
	private static TemplateParameterSubstitution tps_Collection_Sequence_T = createTemplateParameterSubstitution(tp_Collection, t_Sequence_T);
	private static TemplateParameterSubstitution tps_Collection_Collection_selectByType_TT = createTemplateParameterSubstitution(tp_Collection, t_Collection_selectByType_TT);
	private static TemplateParameterSubstitution tps_Collection_Bag_selectByType_TT = createTemplateParameterSubstitution(tp_Collection, t_Bag_selectByType_TT);
	private static TemplateParameterSubstitution tps_Collection_OclAny_1 = createTemplateParameterSubstitution(tp_Collection, t_OclAny);
	private static TemplateParameterSubstitution tps_Collection_Collection_collect_V = createTemplateParameterSubstitution(tp_Collection, t_Collection_collect_V);
	private static TemplateParameterSubstitution tps_Collection_OclElement = createTemplateParameterSubstitution(tp_Collection, t_OclElement);
	private static TemplateParameterSubstitution tps_Collection_Tuple_1 = createTemplateParameterSubstitution(tp_Collection, t_Tuple_3);
	private static TemplateParameterSubstitution tps_Collection_Collection_T_1 = createTemplateParameterSubstitution(tp_Collection, t_Collection_T);
	private static TemplateParameterSubstitution tps_Collection_Sequence_T_1 = createTemplateParameterSubstitution(tp_Collection, t_Sequence_T);
	private static TemplateParameterSubstitution tps_Collection_Bag_T_2 = createTemplateParameterSubstitution(tp_Collection, t_Bag_T);
	private static TemplateParameterSubstitution tps_Collection_OclAny_2 = createTemplateParameterSubstitution(tp_Collection, t_OclAny);
	private static TemplateParameterSubstitution tps_Collection_String = createTemplateParameterSubstitution(tp_Collection, t_String);
	private static TemplateParameterSubstitution tps_Collection_UniqueCollection_T_1 = createTemplateParameterSubstitution(tp_Collection, t_UniqueCollection_T);
	private static TemplateParameterSubstitution tps_Collection_OrderedSet_selectByKind_TT = createTemplateParameterSubstitution(tp_Collection, t_OrderedSet_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Collection_OrderedSet_selectByType_TT = createTemplateParameterSubstitution(tp_Collection, t_OrderedSet_selectByType_TT);
	private static TemplateParameterSubstitution tps_Collection_OclAny_3 = createTemplateParameterSubstitution(tp_Collection, t_OclAny);
	private static TemplateParameterSubstitution tps_Collection_Collection_T_2 = createTemplateParameterSubstitution(tp_Collection, t_Collection_T);
	private static TemplateParameterSubstitution tps_Collection_Collection_product_T2 = createTemplateParameterSubstitution(tp_Collection, t_Collection_product_T2);
	private static TemplateParameterSubstitution tps_Collection_Set_flatten_T2 = createTemplateParameterSubstitution(tp_Collection, t_Set_flatten_T2);
	private static TemplateParameterSubstitution tps_Collection_Bag_flatten_T2 = createTemplateParameterSubstitution(tp_Collection, t_Bag_flatten_T2);
	private static TemplateParameterSubstitution tps_EnumerationClassifier_OclSelf = createTemplateParameterSubstitution(tp_EnumerationClassifier, t_OclSelf);
	private static TemplateParameterSubstitution tps_OrderedSet_OrderedSet_selectByKind_TT = createTemplateParameterSubstitution(tp_OrderedSet, t_OrderedSet_selectByKind_TT);
	private static TemplateParameterSubstitution tps_OrderedSet_Set_T = createTemplateParameterSubstitution(tp_OrderedSet, t_Set_T);
	private static TemplateParameterSubstitution tps_OrderedSet_Sequence_T = createTemplateParameterSubstitution(tp_OrderedSet, t_Sequence_T);
	private static TemplateParameterSubstitution tps_OrderedSet_OrderedSet_flatten_T2 = createTemplateParameterSubstitution(tp_OrderedSet, t_OrderedSet_flatten_T2);
	private static TemplateParameterSubstitution tps_OrderedSet_UniqueCollection_T = createTemplateParameterSubstitution(tp_OrderedSet, t_UniqueCollection_T);
	private static TemplateParameterSubstitution tps_OrderedSet_OrderedSet_selectByType_TT = createTemplateParameterSubstitution(tp_OrderedSet, t_OrderedSet_selectByType_TT);
	private static TemplateParameterSubstitution tps_OrderedSet_EnumerationLiteral = createTemplateParameterSubstitution(tp_OrderedSet, t_EnumerationLiteral);
	private static TemplateParameterSubstitution tps_OrderedSet_Collection_T = createTemplateParameterSubstitution(tp_OrderedSet, t_Collection_T);
	private static TemplateParameterSubstitution tps_Sequence_Bag_T = createTemplateParameterSubstitution(tp_Sequence, t_Bag_T);
	private static TemplateParameterSubstitution tps_Sequence_Collection_T = createTemplateParameterSubstitution(tp_Sequence, t_Collection_T);
	private static TemplateParameterSubstitution tps_Sequence_OrderedSet_selectByType_TT = createTemplateParameterSubstitution(tp_Sequence, t_OrderedSet_selectByType_TT);
	private static TemplateParameterSubstitution tps_Sequence_Sequence_T = createTemplateParameterSubstitution(tp_Sequence, t_Sequence_T);
	private static TemplateParameterSubstitution tps_Sequence_OrderedSet_T = createTemplateParameterSubstitution(tp_Sequence, t_OrderedSet_T);
	private static TemplateParameterSubstitution tps_Sequence_Sequence_T_1 = createTemplateParameterSubstitution(tp_Sequence, t_Sequence_T);
	private static TemplateParameterSubstitution tps_Sequence_Sequence_collect_V = createTemplateParameterSubstitution(tp_Sequence, t_Sequence_collect_V);
	private static TemplateParameterSubstitution tps_Sequence_Sequence_flatten_T2 = createTemplateParameterSubstitution(tp_Sequence, t_Sequence_flatten_T2);
	private static TemplateParameterSubstitution tps_Sequence_OrderedSet_flatten_T2 = createTemplateParameterSubstitution(tp_Sequence, t_OrderedSet_flatten_T2);
	private static TemplateParameterSubstitution tps_Sequence_Sequence_selectByKind_TT = createTemplateParameterSubstitution(tp_Sequence, t_Sequence_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Sequence_String = createTemplateParameterSubstitution(tp_Sequence, t_String);
	private static TemplateParameterSubstitution tps_Sequence_OrderedSet_selectByKind_TT = createTemplateParameterSubstitution(tp_Sequence, t_OrderedSet_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Sequence_UniqueCollection_T = createTemplateParameterSubstitution(tp_Sequence, t_UniqueCollection_T);
	private static TemplateParameterSubstitution tps_Sequence_Sequence_T_2 = createTemplateParameterSubstitution(tp_Sequence, t_Sequence_T);
	private static TemplateParameterSubstitution tps_Sequence_EnumerationLiteral = createTemplateParameterSubstitution(tp_Sequence, t_EnumerationLiteral);
	private static TemplateParameterSubstitution tps_Sequence_Set_T = createTemplateParameterSubstitution(tp_Sequence, t_Set_T);
	private static TemplateParameterSubstitution tps_Sequence_Integer = createTemplateParameterSubstitution(tp_Sequence, t_Integer);
	private static TemplateParameterSubstitution tps_Sequence_Sequence_selectByType_TT = createTemplateParameterSubstitution(tp_Sequence, t_Sequence_selectByType_TT);
	private static TemplateParameterSubstitution tps_Set_Collection_T = createTemplateParameterSubstitution(tp_Set, t_Collection_T);
	private static TemplateParameterSubstitution tps_Set_Set_selectByKind_TT = createTemplateParameterSubstitution(tp_Set, t_Set_selectByKind_TT);
	private static TemplateParameterSubstitution tps_Set_Set_selectByType_TT = createTemplateParameterSubstitution(tp_Set, t_Set_selectByType_TT);
	private static TemplateParameterSubstitution tps_Set_UniqueCollection_T = createTemplateParameterSubstitution(tp_Set, t_UniqueCollection_T);
	private static TemplateParameterSubstitution tps_Set_Bag_T = createTemplateParameterSubstitution(tp_Set, t_Bag_T);
	private static TemplateParameterSubstitution tps_Set_OclElement = createTemplateParameterSubstitution(tp_Set, t_OclElement);
	private static TemplateParameterSubstitution tps_Set_Tuple = createTemplateParameterSubstitution(tp_Set, t_Tuple);
	private static TemplateParameterSubstitution tps_Set_Set_flatten_T2 = createTemplateParameterSubstitution(tp_Set, t_Set_flatten_T2);
	private static TemplateParameterSubstitution tps_Set_OclSelf = createTemplateParameterSubstitution(tp_Set, t_OclSelf);
	private static TemplateParameterSubstitution tps_UniqueCollection_EnumerationLiteral = createTemplateParameterSubstitution(tp_UniqueCollection, t_EnumerationLiteral);
	private static TemplateParameterSubstitution tps_UniqueCollection_Collection_T = createTemplateParameterSubstitution(tp_UniqueCollection, t_Collection_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_OrderedSet_flatten_T2 = createTemplateParameterSubstitution(tp_UniqueCollection, t_OrderedSet_flatten_T2);
	private static TemplateParameterSubstitution tps_UniqueCollection_OclSelf = createTemplateParameterSubstitution(tp_UniqueCollection, t_OclSelf);
	private static TemplateParameterSubstitution tps_UniqueCollection_OrderedSet_selectByKind_TT = createTemplateParameterSubstitution(tp_UniqueCollection, t_OrderedSet_selectByKind_TT);
	private static TemplateParameterSubstitution tps_UniqueCollection_OclSelf_1 = createTemplateParameterSubstitution(tp_UniqueCollection, t_OclSelf);
	private static TemplateParameterSubstitution tps_UniqueCollection_Set_selectByKind_TT = createTemplateParameterSubstitution(tp_UniqueCollection, t_Set_selectByKind_TT);
	private static TemplateParameterSubstitution tps_UniqueCollection_OclElement = createTemplateParameterSubstitution(tp_UniqueCollection, t_OclElement);
	private static TemplateParameterSubstitution tps_UniqueCollection_OclSelf_2 = createTemplateParameterSubstitution(tp_UniqueCollection, t_OclSelf);
	private static TemplateParameterSubstitution tps_UniqueCollection_OclSelf_3 = createTemplateParameterSubstitution(tp_UniqueCollection, t_OclSelf);
	private static TemplateParameterSubstitution tps_UniqueCollection_Sequence_T = createTemplateParameterSubstitution(tp_UniqueCollection, t_Sequence_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_UniqueCollection_T = createTemplateParameterSubstitution(tp_UniqueCollection, t_UniqueCollection_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_Set_T = createTemplateParameterSubstitution(tp_UniqueCollection, t_Set_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_OclSelf_4 = createTemplateParameterSubstitution(tp_UniqueCollection, t_OclSelf);
	private static TemplateParameterSubstitution tps_UniqueCollection_Set_selectByType_TT = createTemplateParameterSubstitution(tp_UniqueCollection, t_Set_selectByType_TT);
	private static TemplateParameterSubstitution tps_UniqueCollection_Bag_T = createTemplateParameterSubstitution(tp_UniqueCollection, t_Bag_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_Tuple = createTemplateParameterSubstitution(tp_UniqueCollection, t_Tuple);
	private static TemplateParameterSubstitution tps_UniqueCollection_Sequence_T_1 = createTemplateParameterSubstitution(tp_UniqueCollection, t_Sequence_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_Set_flatten_T2 = createTemplateParameterSubstitution(tp_UniqueCollection, t_Set_flatten_T2);
	private static TemplateParameterSubstitution tps_UniqueCollection_Bag_T_1 = createTemplateParameterSubstitution(tp_UniqueCollection, t_Bag_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_Bag_T_2 = createTemplateParameterSubstitution(tp_UniqueCollection, t_Bag_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_OrderedSet_T = createTemplateParameterSubstitution(tp_UniqueCollection, t_OrderedSet_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_OrderedSet_selectByType_TT = createTemplateParameterSubstitution(tp_UniqueCollection, t_OrderedSet_selectByType_TT);
	private static TemplateParameterSubstitution tps_UniqueCollection_Bag_T_3 = createTemplateParameterSubstitution(tp_UniqueCollection, t_Bag_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_OclAny = createTemplateParameterSubstitution(tp_UniqueCollection, t_OclAny);
	private static TemplateParameterSubstitution tps_UniqueCollection_UniqueCollection_T_1 = createTemplateParameterSubstitution(tp_UniqueCollection, t_UniqueCollection_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_Sequence_T_2 = createTemplateParameterSubstitution(tp_UniqueCollection, t_Sequence_T);
	private static TemplateParameterSubstitution tps_UniqueCollection_OclSelf_5 = createTemplateParameterSubstitution(tp_UniqueCollection, t_OclSelf);
	private static TemplateParameterSubstitution tps_UniqueCollection_Tuple_1 = createTemplateParameterSubstitution(tp_UniqueCollection, t_Tuple);
	
	private static TemplateBinding tb_AnyClassifier_Set_selectByKind_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_Set_selectByKind_TT);
	private static TemplateBinding tb_AnyClassifier_OrderedSet_selectByKind_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_OrderedSet_selectByKind_TT);
	private static TemplateBinding tb_AnyClassifier_Sequence_selectByType_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_Sequence_selectByType_TT);
	private static TemplateBinding tb_AnyClassifier_OclVoid = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_OclVoid);
	private static TemplateBinding tb_AnyClassifier_Set_selectByType_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_Set_selectByType_TT);
	private static TemplateBinding tb_AnyClassifier_ClassClassifier_T = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_ClassClassifier_T);
	private static TemplateBinding tb_AnyClassifier_CollectionClassifier_T = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_CollectionClassifier_T);
	private static TemplateBinding tb_AnyClassifier_Bag_selectByKind_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_Bag_selectByKind_TT);
	private static TemplateBinding tb_AnyClassifier_Sequence_selectByKind_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_Sequence_selectByKind_TT);
	private static TemplateBinding tb_AnyClassifier_Collection_selectByType_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_Collection_selectByType_TT);
	private static TemplateBinding tb_AnyClassifier_OclSelf = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_OclSelf);
	private static TemplateBinding tb_AnyClassifier_OclInvalid = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_OclInvalid_1);
	private static TemplateBinding tb_AnyClassifier_Bag_selectByType_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_Bag_selectByType_TT);
	private static TemplateBinding tb_AnyClassifier_OclAny_oclAsType_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_OclAny_oclAsType_TT);
	private static TemplateBinding tb_AnyClassifier_OclInvalid_1 = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_OclInvalid);
	private static TemplateBinding tb_AnyClassifier_Collection_selectByKind_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_Collection_selectByKind_TT);
	private static TemplateBinding tb_AnyClassifier_OclAny_oclIsTypeOf_T = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_OclAny_oclIsTypeOf_T);
	private static TemplateBinding tb_AnyClassifier_UnlimitedNatural_oclAsType_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_UnlimitedNatural_oclAsType_TT);
	private static TemplateBinding tb_AnyClassifier_OclAny_oclIsKindOf_T = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_OclAny_oclIsKindOf_T);
	private static TemplateBinding tb_AnyClassifier_OrderedSet_selectByType_TT = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_OrderedSet_selectByType_TT);
	private static TemplateBinding tb_AnyClassifier_EnumerationClassifier_T = createTemplateBinding(ts_AnyClassifier, tps_AnyClassifier_EnumerationClassifier_T);
	private static TemplateBinding tb_Bag_Set_T = createTemplateBinding(ts_Bag, tps_Bag_Set_T);
	private static TemplateBinding tb_Bag_OclSelf = createTemplateBinding(ts_Bag, tps_Bag_OclSelf_2);
	private static TemplateBinding tb_Bag_Bag_T = createTemplateBinding(ts_Bag, tps_Bag_Bag_T_3);
	private static TemplateBinding tb_Bag_Tuple = createTemplateBinding(ts_Bag, tps_Bag_Tuple);
	private static TemplateBinding tb_Bag_Bag_selectByType_TT = createTemplateBinding(ts_Bag, tps_Bag_Bag_selectByType_TT);
	private static TemplateBinding tb_Bag_Set_selectByKind_TT = createTemplateBinding(ts_Bag, tps_Bag_Set_selectByKind_TT);
	private static TemplateBinding tb_Bag_UniqueCollection_T = createTemplateBinding(ts_Bag, tps_Bag_UniqueCollection_T_1);
	private static TemplateBinding tb_Bag_Tuple_1 = createTemplateBinding(ts_Bag, tps_Bag_Tuple_1);
	private static TemplateBinding tb_Bag_Bag_T_1 = createTemplateBinding(ts_Bag, tps_Bag_Bag_T);
	private static TemplateBinding tb_Bag_OclSelf_1 = createTemplateBinding(ts_Bag, tps_Bag_OclSelf_1);
	private static TemplateBinding tb_Bag_Bag_selectByKind_TT = createTemplateBinding(ts_Bag, tps_Bag_Bag_selectByKind_TT);
	private static TemplateBinding tb_Bag_OclSelf_2 = createTemplateBinding(ts_Bag, tps_Bag_OclSelf);
	private static TemplateBinding tb_Bag_Bag_flatten_T2 = createTemplateBinding(ts_Bag, tps_Bag_Bag_flatten_T2);
	private static TemplateBinding tb_Bag_OclSelf_3 = createTemplateBinding(ts_Bag, tps_Bag_OclSelf_5);
	private static TemplateBinding tb_Bag_Bag_collect_V = createTemplateBinding(ts_Bag, tps_Bag_Bag_collect_V);
	private static TemplateBinding tb_Bag_OclSelf_4 = createTemplateBinding(ts_Bag, tps_Bag_OclSelf_4);
	private static TemplateBinding tb_Bag_Collection_T = createTemplateBinding(ts_Bag, tps_Bag_Collection_T);
	private static TemplateBinding tb_Bag_Bag_T_2 = createTemplateBinding(ts_Bag, tps_Bag_Bag_T_1);
	private static TemplateBinding tb_Bag_UniqueCollection_T_1 = createTemplateBinding(ts_Bag, tps_Bag_UniqueCollection_T);
	private static TemplateBinding tb_Bag_Sequence_T = createTemplateBinding(ts_Bag, tps_Bag_Sequence_T);
	private static TemplateBinding tb_Bag_OclElement = createTemplateBinding(ts_Bag, tps_Bag_OclElement);
	private static TemplateBinding tb_Bag_Bag_T_3 = createTemplateBinding(ts_Bag, tps_Bag_Bag_T_2);
	private static TemplateBinding tb_Bag_OclSelf_5 = createTemplateBinding(ts_Bag, tps_Bag_OclSelf_3);
	private static TemplateBinding tb_Bag_Set_selectByType_TT = createTemplateBinding(ts_Bag, tps_Bag_Set_selectByType_TT);
	private static TemplateBinding tb_Bag_Set_flatten_T2 = createTemplateBinding(ts_Bag, tps_Bag_Set_flatten_T2);
	private static TemplateBinding tb_ClassClassifier_OclSelf = createTemplateBinding(ts_ClassClassifier, tps_ClassClassifier_OclSelf);
	private static TemplateBinding tb_ClassClassifier_OclInvalid = createTemplateBinding(ts_ClassClassifier, tps_ClassClassifier_OclInvalid);
	private static TemplateBinding tb_ClassClassifier_OclVoid = createTemplateBinding(ts_ClassClassifier, tps_ClassClassifier_OclVoid);
	private static TemplateBinding tb_CollectionClassifier_Collection_T_OclSelf = createTemplateBinding(ts_CollectionClassifier, tps_CollectionClassifier_Collection_T_OclSelf, tps_CollectionClassifier_Collection_T_OclSelf_1);
	private static TemplateBinding tb_Collection_OrderedSet_selectByKind_TT = createTemplateBinding(ts_Collection, tps_Collection_OrderedSet_selectByKind_TT);
	private static TemplateBinding tb_Collection_Bag_selectByType_TT = createTemplateBinding(ts_Collection, tps_Collection_Bag_selectByType_TT);
	private static TemplateBinding tb_Collection_Collection_product_T2 = createTemplateBinding(ts_Collection, tps_Collection_Collection_product_T2);
	private static TemplateBinding tb_Collection_Sequence_collect_V = createTemplateBinding(ts_Collection, tps_Collection_Sequence_collect_V);
	private static TemplateBinding tb_Collection_Bag_flatten_T2 = createTemplateBinding(ts_Collection, tps_Collection_Bag_flatten_T2);
	private static TemplateBinding tb_Collection_OrderedSet_T = createTemplateBinding(ts_Collection, tps_Collection_OrderedSet_T);
	private static TemplateBinding tb_Collection_Bag_selectByKind_TT = createTemplateBinding(ts_Collection, tps_Collection_Bag_selectByKind_TT);
	private static TemplateBinding tb_Collection_OclElement = createTemplateBinding(ts_Collection, tps_Collection_OclElement);
	private static TemplateBinding tb_Collection_Sequence_T = createTemplateBinding(ts_Collection, tps_Collection_Sequence_T);
	private static TemplateBinding tb_Collection_Set_selectByType_TT = createTemplateBinding(ts_Collection, tps_Collection_Set_selectByType_TT);
	private static TemplateBinding tb_Collection_Tuple = createTemplateBinding(ts_Collection, tps_Collection_Tuple_1);
	private static TemplateBinding tb_Collection_Tuple_1 = createTemplateBinding(ts_Collection, tps_Collection_Tuple);
	private static TemplateBinding tb_Collection_Collection_selectByKind_TT = createTemplateBinding(ts_Collection, tps_Collection_Collection_selectByKind_TT);
	private static TemplateBinding tb_Collection_UniqueCollection_T = createTemplateBinding(ts_Collection, tps_Collection_UniqueCollection_T_1);
	private static TemplateBinding tb_Collection_OrderedSet_T_1 = createTemplateBinding(ts_Collection, tps_Collection_OrderedSet_T_1);
	private static TemplateBinding tb_Collection_OclAny = createTemplateBinding(ts_Collection, tps_Collection_OclAny_3);
	private static TemplateBinding tb_Collection_Sequence_selectByKind_TT = createTemplateBinding(ts_Collection, tps_Collection_Sequence_selectByKind_TT);
	private static TemplateBinding tb_Collection_Collection_includesAll_T2 = createTemplateBinding(ts_Collection, tps_Collection_Collection_includesAll_T2);
	private static TemplateBinding tb_Collection_Sequence_selectByType_TT = createTemplateBinding(ts_Collection, tps_Collection_Sequence_selectByType_TT);
	private static TemplateBinding tb_Collection_Set_T = createTemplateBinding(ts_Collection, tps_Collection_Set_T_1);
	private static TemplateBinding tb_Collection_Set_flatten_T2 = createTemplateBinding(ts_Collection, tps_Collection_Set_flatten_T2);
	private static TemplateBinding tb_Collection_EnumerationLiteral = createTemplateBinding(ts_Collection, tps_Collection_EnumerationLiteral);
	private static TemplateBinding tb_Collection_OrderedSet_flatten_T2 = createTemplateBinding(ts_Collection, tps_Collection_OrderedSet_flatten_T2);
	private static TemplateBinding tb_Collection_Bag_T = createTemplateBinding(ts_Collection, tps_Collection_Bag_T_1);
	private static TemplateBinding tb_Collection_Collection_T = createTemplateBinding(ts_Collection, tps_Collection_Collection_T);
	private static TemplateBinding tb_Collection_Collection_T_1 = createTemplateBinding(ts_Collection, tps_Collection_Collection_T_2);
	private static TemplateBinding tb_Collection_OclAny_1 = createTemplateBinding(ts_Collection, tps_Collection_OclAny);
	private static TemplateBinding tb_Collection_Collection_T_2 = createTemplateBinding(ts_Collection, tps_Collection_Collection_T_1);
	private static TemplateBinding tb_Collection_Set_T_1 = createTemplateBinding(ts_Collection, tps_Collection_Set_T);
	private static TemplateBinding tb_Collection_Bag_T_1 = createTemplateBinding(ts_Collection, tps_Collection_Bag_T_2);
	private static TemplateBinding tb_Collection_Collection_flatten_T2 = createTemplateBinding(ts_Collection, tps_Collection_Collection_flatten_T2);
	private static TemplateBinding tb_Collection_UniqueCollection_T_1 = createTemplateBinding(ts_Collection, tps_Collection_UniqueCollection_T);
	private static TemplateBinding tb_Collection_OclAny_2 = createTemplateBinding(ts_Collection, tps_Collection_OclAny_1);
	private static TemplateBinding tb_Collection_String = createTemplateBinding(ts_Collection, tps_Collection_String);
	private static TemplateBinding tb_Collection_Sequence_flatten_T2 = createTemplateBinding(ts_Collection, tps_Collection_Sequence_flatten_T2);
	private static TemplateBinding tb_Collection_OclAny_3 = createTemplateBinding(ts_Collection, tps_Collection_OclAny_2);
	private static TemplateBinding tb_Collection_Bag_T_2 = createTemplateBinding(ts_Collection, tps_Collection_Bag_T);
	private static TemplateBinding tb_Collection_Set_selectByKind_TT = createTemplateBinding(ts_Collection, tps_Collection_Set_selectByKind_TT);
	private static TemplateBinding tb_Collection_OclSelf = createTemplateBinding(ts_Collection, tps_Collection_OclSelf);
	private static TemplateBinding tb_Collection_OrderedSet_selectByType_TT = createTemplateBinding(ts_Collection, tps_Collection_OrderedSet_selectByType_TT);
	private static TemplateBinding tb_Collection_Collection_excludesAll_T2 = createTemplateBinding(ts_Collection, tps_Collection_Collection_excludesAll_T2);
	private static TemplateBinding tb_Collection_Collection_selectByType_TT = createTemplateBinding(ts_Collection, tps_Collection_Collection_selectByType_TT);
	private static TemplateBinding tb_Collection_Integer = createTemplateBinding(ts_Collection, tps_Collection_Integer);
	private static TemplateBinding tb_Collection_Sequence_T_1 = createTemplateBinding(ts_Collection, tps_Collection_Sequence_T_1);
	private static TemplateBinding tb_Collection_Collection_collect_V = createTemplateBinding(ts_Collection, tps_Collection_Collection_collect_V);
	private static TemplateBinding tb_Collection_Bag_collect_V = createTemplateBinding(ts_Collection, tps_Collection_Bag_collect_V);
	private static TemplateBinding tb_EnumerationClassifier_OclSelf = createTemplateBinding(ts_EnumerationClassifier, tps_EnumerationClassifier_OclSelf);
	private static TemplateBinding tb_OrderedSet_Sequence_T = createTemplateBinding(ts_OrderedSet, tps_OrderedSet_Sequence_T);
	private static TemplateBinding tb_OrderedSet_OrderedSet_flatten_T2 = createTemplateBinding(ts_OrderedSet, tps_OrderedSet_OrderedSet_flatten_T2);
	private static TemplateBinding tb_OrderedSet_Set_T = createTemplateBinding(ts_OrderedSet, tps_OrderedSet_Set_T);
	private static TemplateBinding tb_OrderedSet_UniqueCollection_T = createTemplateBinding(ts_OrderedSet, tps_OrderedSet_UniqueCollection_T);
	private static TemplateBinding tb_OrderedSet_OrderedSet_selectByKind_TT = createTemplateBinding(ts_OrderedSet, tps_OrderedSet_OrderedSet_selectByKind_TT);
	private static TemplateBinding tb_OrderedSet_EnumerationLiteral = createTemplateBinding(ts_OrderedSet, tps_OrderedSet_EnumerationLiteral);
	private static TemplateBinding tb_OrderedSet_Collection_T = createTemplateBinding(ts_OrderedSet, tps_OrderedSet_Collection_T);
	private static TemplateBinding tb_OrderedSet_OrderedSet_selectByType_TT = createTemplateBinding(ts_OrderedSet, tps_OrderedSet_OrderedSet_selectByType_TT);
	private static TemplateBinding tb_Sequence_EnumerationLiteral = createTemplateBinding(ts_Sequence, tps_Sequence_EnumerationLiteral);
	private static TemplateBinding tb_Sequence_UniqueCollection_T = createTemplateBinding(ts_Sequence, tps_Sequence_UniqueCollection_T);
	private static TemplateBinding tb_Sequence_Sequence_T = createTemplateBinding(ts_Sequence, tps_Sequence_Sequence_T_2);
	private static TemplateBinding tb_Sequence_Integer = createTemplateBinding(ts_Sequence, tps_Sequence_Integer);
	private static TemplateBinding tb_Sequence_String = createTemplateBinding(ts_Sequence, tps_Sequence_String);
	private static TemplateBinding tb_Sequence_Sequence_selectByKind_TT = createTemplateBinding(ts_Sequence, tps_Sequence_Sequence_selectByKind_TT);
	private static TemplateBinding tb_Sequence_Sequence_collect_V = createTemplateBinding(ts_Sequence, tps_Sequence_Sequence_collect_V);
	private static TemplateBinding tb_Sequence_Collection_T = createTemplateBinding(ts_Sequence, tps_Sequence_Collection_T);
	private static TemplateBinding tb_Sequence_Set_T = createTemplateBinding(ts_Sequence, tps_Sequence_Set_T);
	private static TemplateBinding tb_Sequence_Bag_T = createTemplateBinding(ts_Sequence, tps_Sequence_Bag_T);
	private static TemplateBinding tb_Sequence_OrderedSet_T = createTemplateBinding(ts_Sequence, tps_Sequence_OrderedSet_T);
	private static TemplateBinding tb_Sequence_Sequence_T_1 = createTemplateBinding(ts_Sequence, tps_Sequence_Sequence_T_1);
	private static TemplateBinding tb_Sequence_OrderedSet_selectByKind_TT = createTemplateBinding(ts_Sequence, tps_Sequence_OrderedSet_selectByKind_TT);
	private static TemplateBinding tb_Sequence_Sequence_flatten_T2 = createTemplateBinding(ts_Sequence, tps_Sequence_Sequence_flatten_T2);
	private static TemplateBinding tb_Sequence_OrderedSet_flatten_T2 = createTemplateBinding(ts_Sequence, tps_Sequence_OrderedSet_flatten_T2);
	private static TemplateBinding tb_Sequence_OrderedSet_selectByType_TT = createTemplateBinding(ts_Sequence, tps_Sequence_OrderedSet_selectByType_TT);
	private static TemplateBinding tb_Sequence_Sequence_T_2 = createTemplateBinding(ts_Sequence, tps_Sequence_Sequence_T);
	private static TemplateBinding tb_Sequence_Sequence_selectByType_TT = createTemplateBinding(ts_Sequence, tps_Sequence_Sequence_selectByType_TT);
	private static TemplateBinding tb_Set_Set_selectByKind_TT = createTemplateBinding(ts_Set, tps_Set_Set_selectByKind_TT);
	private static TemplateBinding tb_Set_Tuple = createTemplateBinding(ts_Set, tps_Set_Tuple);
	private static TemplateBinding tb_Set_OclElement = createTemplateBinding(ts_Set, tps_Set_OclElement);
	private static TemplateBinding tb_Set_UniqueCollection_T = createTemplateBinding(ts_Set, tps_Set_UniqueCollection_T);
	private static TemplateBinding tb_Set_Set_flatten_T2 = createTemplateBinding(ts_Set, tps_Set_Set_flatten_T2);
	private static TemplateBinding tb_Set_Bag_T = createTemplateBinding(ts_Set, tps_Set_Bag_T);
	private static TemplateBinding tb_Set_Set_selectByType_TT = createTemplateBinding(ts_Set, tps_Set_Set_selectByType_TT);
	private static TemplateBinding tb_Set_Collection_T = createTemplateBinding(ts_Set, tps_Set_Collection_T);
	private static TemplateBinding tb_Set_OclSelf = createTemplateBinding(ts_Set, tps_Set_OclSelf);
	private static TemplateBinding tb_UniqueCollection_Bag_T = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Bag_T_1);
	private static TemplateBinding tb_UniqueCollection_OclSelf = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OclSelf_1);
	private static TemplateBinding tb_UniqueCollection_Set_flatten_T2 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Set_flatten_T2);
	private static TemplateBinding tb_UniqueCollection_OclElement = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OclElement);
	private static TemplateBinding tb_UniqueCollection_OrderedSet_selectByType_TT = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OrderedSet_selectByType_TT);
	private static TemplateBinding tb_UniqueCollection_Tuple = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Tuple);
	private static TemplateBinding tb_UniqueCollection_UniqueCollection_T = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_UniqueCollection_T_1);
	private static TemplateBinding tb_UniqueCollection_Sequence_T = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Sequence_T_1);
	private static TemplateBinding tb_UniqueCollection_Sequence_T_1 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Sequence_T_2);
	private static TemplateBinding tb_UniqueCollection_OclSelf_1 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OclSelf_2);
	private static TemplateBinding tb_UniqueCollection_Sequence_T_2 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Sequence_T);
	private static TemplateBinding tb_UniqueCollection_UniqueCollection_T_1 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_UniqueCollection_T);
	private static TemplateBinding tb_UniqueCollection_OclAny = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OclAny);
	private static TemplateBinding tb_UniqueCollection_Set_selectByType_TT = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Set_selectByType_TT);
	private static TemplateBinding tb_UniqueCollection_Bag_T_1 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Bag_T_3);
	private static TemplateBinding tb_UniqueCollection_OrderedSet_T = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OrderedSet_T);
	private static TemplateBinding tb_UniqueCollection_EnumerationLiteral = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_EnumerationLiteral);
	private static TemplateBinding tb_UniqueCollection_OclSelf_2 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OclSelf);
	private static TemplateBinding tb_UniqueCollection_OclSelf_3 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OclSelf_3);
	private static TemplateBinding tb_UniqueCollection_OclSelf_4 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OclSelf_4);
	private static TemplateBinding tb_UniqueCollection_Set_T = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Set_T);
	private static TemplateBinding tb_UniqueCollection_Set_selectByKind_TT = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Set_selectByKind_TT);
	private static TemplateBinding tb_UniqueCollection_Bag_T_2 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Bag_T);
	private static TemplateBinding tb_UniqueCollection_Collection_T = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Collection_T);
	private static TemplateBinding tb_UniqueCollection_OrderedSet_selectByKind_TT = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OrderedSet_selectByKind_TT);
	private static TemplateBinding tb_UniqueCollection_Bag_T_3 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Bag_T_2);
	private static TemplateBinding tb_UniqueCollection_OclSelf_5 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OclSelf_5);
	private static TemplateBinding tb_UniqueCollection_OrderedSet_flatten_T2 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_OrderedSet_flatten_T2);
	private static TemplateBinding tb_UniqueCollection_Tuple_1 = createTemplateBinding(ts_UniqueCollection, tps_UniqueCollection_Tuple_1);
	

	/**
	 * Return the default OCL standard Library. 
	 *  This static definition auto-generated from /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static OCLstdlib getDefault() {
		if (INSTANCE == null) {
			Library library = create("ocl", "ocl", "http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib");
			INSTANCE = new OCLstdlib(STDLIB_URI, library);
		}
		return INSTANCE;
	}

	/**
	 * Install this library in the {@link StandardLibraryContribution#REGISTRY}.
	 * This method may be invoked by standalone applications to replicate
	 * the registration that should appear as a standard_library plugin
	 * extension when running within Eclipse. 
	 */
	public static void install() {
		StandardLibraryContribution.REGISTRY.put(STDLIB_URI, new Loader());
	}

	/**
	 * Unnstall this library from the {@link StandardLibraryContribution#REGISTRY}.
	 * This method may be invoked by standalone applications to release the library
	 * resources for garbage collection and memory leakage detection. 
	 */
	public static void uninstall() {
		StandardLibraryContribution.REGISTRY.remove(STDLIB_URI);
		INSTANCE = null;
	}
	
	/**
	 * The Loader shares the Standard Library instance whenever this default library
	 * is loaded from the registry of Standard Libraries populated by the standard_library 
	 * extension point.
	 */
	public static class Loader implements StandardLibraryContribution
	{
		public StandardLibraryContribution getContribution() {
			return this;
		}
		
		public Resource getResource() {
			return getDefault();
		}
	}
	
	/**
	 *	Construct an OCL Standard Library with specified resource URI and library content.
	 */
	public OCLstdlib(String uri, Library library) {
		super(URI.createURI(uri));
		getContents().add(library);
	}
	
	/**
	 *	Construct a copy of the OCL Standard Library with specified resource URI,
	 *  and package name, prefix and namespace URI.
	 */
	public static OCLstdlib create(String uri, String name, String nsPrefix, String nsURI) {
		@SuppressWarnings("serial")
		EcoreUtil.Copier copier = new EcoreUtil.Copier(true, false)
		{
			@Override
			protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {
				Object eGet = eObject.eGet(eReference);
				if (eGet instanceof SubsetSupersetEObjectEList) {
					if (eReference == PivotPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER) {
						return;	// Avoid doubling up on TEMPLATE_SIGNATURE__OWNED_PARAMETER
					}
					System.out.println(eReference.getContainerClass().getName() + "::" + eReference.getName());
				}
				super.copyReference(eReference, eObject, copyEObject);
			}			
		};
		Library library = (Library) copier.copy(getDefault().getContents().get(0));
		copier.copyReferences();
		library.setName(name);
		library.setNsPrefix(nsPrefix);
		library.setNsURI(nsURI);
		return new OCLstdlib(uri, library);
	}

	private static Library create(String name, String nsPrefix, String nsURI)
	{
		Library library = createLibrary("ocl", nsPrefix, nsURI);
		List<Precedence> ownedPrecedences = library.getOwnedPrecedences();
		ownedPrecedences.add(prec_NAVIGATION);
		ownedPrecedences.add(prec_UNARY);
		ownedPrecedences.add(prec_MULTIPLICATIVE);
		ownedPrecedences.add(prec_ADDITIVE);
		ownedPrecedences.add(prec_RELATIONAL);
		ownedPrecedences.add(prec_EQUALITY);
		ownedPrecedences.add(prec_AND);
		ownedPrecedences.add(prec_OR);
		ownedPrecedences.add(prec_XOR);
		ownedPrecedences.add(prec_IMPLIES);
		//
		// ocl::Boolean
		//
		t_Boolean.getSuperClasses().add(t_OclAny);
		//
		// ocl::Boolean::<>()
		//
		op_Boolean__lt__gt_.setPrecedence(prec_EQUALITY);
		op_Boolean__lt__gt_.getOwnedComments().add(co_Returns_32_oclT_9);
		t_Boolean.getOwnedOperations().add(op_Boolean__lt__gt_);
		//
		// ocl::Boolean::=()
		//
		op_Boolean__eq_.setPrecedence(prec_EQUALITY);
		op_Boolean__eq_.getOwnedComments().add(co_Returns_32_oclT_10);
		t_Boolean.getOwnedOperations().add(op_Boolean__eq_);
		//
		// ocl::Boolean::allInstances()
		//
		op_Boolean_allInstances.setIsStatic(true);
		op_Boolean_allInstances.getOwnedComments().add(co_Returns_32_oclT);
		t_Boolean.getOwnedOperations().add(op_Boolean_allInstances);
		//
		// ocl::Boolean::and()
		//
		op_Boolean_and.setPrecedence(prec_AND);
		op_Boolean_and.getOwnedComments().add(co_True_32_if_32_both);
		t_Boolean.getOwnedOperations().add(op_Boolean_and);
		//
		// ocl::Boolean::implies()
		//
		op_Boolean_implies.setPrecedence(prec_IMPLIES);
		op_Boolean_implies.getOwnedComments().add(co_True_32_if_32_oclT_11);
		t_Boolean.getOwnedOperations().add(op_Boolean_implies);
		//
		// ocl::Boolean::not()
		//
		op_Boolean_not.setPrecedence(prec_UNARY);
		op_Boolean_not.getOwnedComments().add(co_True_32_if_32_oclT_12);
		t_Boolean.getOwnedOperations().add(op_Boolean_not);
		//
		// ocl::Boolean::or()
		//
		op_Boolean_or.setPrecedence(prec_OR);
		op_Boolean_or.getOwnedComments().add(co_True_32_if_32_eith_1);
		t_Boolean.getOwnedOperations().add(op_Boolean_or);
		//
		// ocl::Boolean::toString()
		//
		op_Boolean_toString.getOwnedComments().add(co_Converts_32_ocl_4);
		t_Boolean.getOwnedOperations().add(op_Boolean_toString);
		//
		// ocl::Boolean::xor()
		//
		op_Boolean_xor.setPrecedence(prec_XOR);
		op_Boolean_xor.getOwnedComments().add(co_True_32_if_32_eith);
		t_Boolean.getOwnedOperations().add(op_Boolean_xor);
		t_Boolean.getOwnedComments().add(co_The_32_standard);
		library.getOwnedTypes().add(t_Boolean);
		//
		// ocl::Integer
		//
		t_Integer.getSuperClasses().add(t_Real);
		//
		// ocl::Integer::*()
		//
		op_Integer__mul_.setPrecedence(prec_MULTIPLICATIVE);
		op_Integer__mul_.getOwnedComments().add(co_The_32_value_32_of_4);
		t_Integer.getOwnedOperations().add(op_Integer__mul_);
		//
		// ocl::Integer::+()
		//
		op_Integer__add_.setPrecedence(prec_ADDITIVE);
		op_Integer__add_.getOwnedComments().add(co_The_32_value_32_of_2);
		t_Integer.getOwnedOperations().add(op_Integer__add_);
		//
		// ocl::Integer::-()
		//
		op_Integer__sub_.setPrecedence(prec_UNARY);
		op_Integer__sub_.getOwnedComments().add(co_The_32_negative);
		t_Integer.getOwnedOperations().add(op_Integer__sub_);
		//
		// ocl::Integer::-()
		//
		op_Integer__sub__1.setPrecedence(prec_ADDITIVE);
		op_Integer__sub__1.getOwnedComments().add(co_The_32_value_32_of_6);
		t_Integer.getOwnedOperations().add(op_Integer__sub__1);
		//
		// ocl::Integer::/()
		//
		op_Integer__div_.setPrecedence(prec_MULTIPLICATIVE);
		op_Integer__div_.getOwnedComments().add(co_The_32_value_32_of);
		t_Integer.getOwnedOperations().add(op_Integer__div_);
		//
		// ocl::Integer::abs()
		//
		op_Integer_abs.getOwnedComments().add(co_The_32_absolute_1);
		t_Integer.getOwnedOperations().add(op_Integer_abs);
		//
		// ocl::Integer::compareTo()
		//
		op_Integer_compareTo.getOwnedComments().add(co_The_32_comparis_1);
		t_Integer.getOwnedOperations().add(op_Integer_compareTo);
		//
		// ocl::Integer::div()
		//
		op_Integer_div.getOwnedComments().add(co_The_32_number_32_o_2);
		t_Integer.getOwnedOperations().add(op_Integer_div);
		//
		// ocl::Integer::max()
		//
		op_Integer_max.getOwnedComments().add(co_The_32_maximum_32_);
		t_Integer.getOwnedOperations().add(op_Integer_max);
		//
		// ocl::Integer::min()
		//
		op_Integer_min.getOwnedComments().add(co_The_32_minimum_32_);
		t_Integer.getOwnedOperations().add(op_Integer_min);
		//
		// ocl::Integer::mod()
		//
		op_Integer_mod.getOwnedComments().add(co_The_32_result_32_i);
		t_Integer.getOwnedOperations().add(op_Integer_mod);
		//
		// ocl::Integer::toString()
		//
		op_Integer_toString.getOwnedComments().add(co_Converts_32_ocl_3);
		t_Integer.getOwnedOperations().add(op_Integer_toString);
		t_Integer.getOwnedComments().add(co_The_32_standard_3);
		library.getOwnedTypes().add(t_Integer);
		//
		// ocl::Real
		//
		t_Real.getSuperClasses().add(t_OclComparable);
		t_Real.getSuperClasses().add(t_OclSummable);
		//
		// ocl::Real::*()
		//
		op_Real__mul_.setPrecedence(prec_MULTIPLICATIVE);
		op_Real__mul_.getOwnedComments().add(co_The_32_value_32_of_5);
		t_Real.getOwnedOperations().add(op_Real__mul_);
		//
		// ocl::Real::+()
		//
		op_Real__add_.setPrecedence(prec_ADDITIVE);
		op_Real__add_.getOwnedComments().add(co_The_32_value_32_of_3);
		t_Real.getOwnedOperations().add(op_Real__add_);
		//
		// ocl::Real::-()
		//
		op_Real__sub__1.setPrecedence(prec_ADDITIVE);
		op_Real__sub__1.getOwnedComments().add(co_The_32_value_32_of_7);
		t_Real.getOwnedOperations().add(op_Real__sub__1);
		//
		// ocl::Real::-()
		//
		op_Real__sub_.setPrecedence(prec_UNARY);
		op_Real__sub_.getOwnedComments().add(co_The_32_negative_1);
		t_Real.getOwnedOperations().add(op_Real__sub_);
		//
		// ocl::Real::/()
		//
		op_Real__div_.setPrecedence(prec_MULTIPLICATIVE);
		op_Real__div_.getOwnedComments().add(co_The_32_value_32_of_1);
		t_Real.getOwnedOperations().add(op_Real__div_);
		//
		// ocl::Real::<()
		//
		op_Real__lt_.setPrecedence(prec_RELATIONAL);
		op_Real__lt_.getOwnedComments().add(co_True_32_if_32_oclT_9);
		t_Real.getOwnedOperations().add(op_Real__lt_);
		//
		// ocl::Real::<=()
		//
		op_Real__lt__eq_.setPrecedence(prec_RELATIONAL);
		op_Real__lt__eq_.getOwnedComments().add(co_True_32_if_32_oclT_7);
		t_Real.getOwnedOperations().add(op_Real__lt__eq_);
		//
		// ocl::Real::<>()
		//
		op_Real__lt__gt_.setPrecedence(prec_EQUALITY);
		op_Real__lt__gt_.getOwnedComments().add(co_Returns_32_oclT_11);
		t_Real.getOwnedOperations().add(op_Real__lt__gt_);
		//
		// ocl::Real::=()
		//
		op_Real__eq_.setPrecedence(prec_EQUALITY);
		op_Real__eq_.getOwnedComments().add(co_Returns_32_oclT_12);
		t_Real.getOwnedOperations().add(op_Real__eq_);
		//
		// ocl::Real::>()
		//
		op_Real__gt_.setPrecedence(prec_RELATIONAL);
		op_Real__gt_.getOwnedComments().add(co_True_32_if_32_oclT_5);
		t_Real.getOwnedOperations().add(op_Real__gt_);
		//
		// ocl::Real::>=()
		//
		op_Real__gt__eq_.setPrecedence(prec_RELATIONAL);
		op_Real__gt__eq_.getOwnedComments().add(co_True_32_if_32_oclT_3);
		t_Real.getOwnedOperations().add(op_Real__gt__eq_);
		//
		// ocl::Real::abs()
		//
		op_Real_abs.getOwnedComments().add(co_The_32_absolute);
		t_Real.getOwnedOperations().add(op_Real_abs);
		//
		// ocl::Real::compareTo()
		//
		op_Real_compareTo.getOwnedComments().add(co_The_32_comparis);
		t_Real.getOwnedOperations().add(op_Real_compareTo);
		//
		// ocl::Real::floor()
		//
		op_Real_floor.getOwnedComments().add(co_The_32_largest_32_);
		t_Real.getOwnedOperations().add(op_Real_floor);
		//
		// ocl::Real::max()
		//
		op_Real_max.getOwnedComments().add(co_The_32_maximum_32__1);
		t_Real.getOwnedOperations().add(op_Real_max);
		//
		// ocl::Real::min()
		//
		op_Real_min.getOwnedComments().add(co_The_32_minimum_32__1);
		t_Real.getOwnedOperations().add(op_Real_min);
		//
		// ocl::Real::round()
		//
		op_Real_round.getOwnedComments().add(co_The_32_integer_32_);
		t_Real.getOwnedOperations().add(op_Real_round);
		//
		// ocl::Real::toString()
		//
		op_Real_toString.getOwnedComments().add(co_Converts_32_ocl_2);
		t_Real.getOwnedOperations().add(op_Real_toString);
		t_Real.getOwnedComments().add(co_The_32_standard_4);
		library.getOwnedTypes().add(t_Real);
		//
		// ocl::String
		//
		t_String.getSuperClasses().add(t_OclComparable);
		t_String.getSuperClasses().add(t_OclSummable);
		//
		// ocl::String::+()
		//
		op_String__add_.setPrecedence(prec_ADDITIVE);
		op_String__add_.getOwnedComments().add(co_The_32_concaten);
		t_String.getOwnedOperations().add(op_String__add_);
		//
		// ocl::String::<()
		//
		op_String__lt_.setPrecedence(prec_RELATIONAL);
		op_String__lt_.getOwnedComments().add(co_True_32_if_32_oclT_10);
		t_String.getOwnedOperations().add(op_String__lt_);
		//
		// ocl::String::<=()
		//
		op_String__lt__eq_.setPrecedence(prec_RELATIONAL);
		op_String__lt__eq_.getOwnedComments().add(co_True_32_if_32_oclT_8);
		t_String.getOwnedOperations().add(op_String__lt__eq_);
		//
		// ocl::String::<>()
		//
		op_String__lt__gt_.setPrecedence(prec_EQUALITY);
		t_String.getOwnedOperations().add(op_String__lt__gt_);
		//
		// ocl::String::=()
		//
		op_String__eq_.setPrecedence(prec_EQUALITY);
		t_String.getOwnedOperations().add(op_String__eq_);
		//
		// ocl::String::>()
		//
		op_String__gt_.setPrecedence(prec_RELATIONAL);
		op_String__gt_.getOwnedComments().add(co_True_32_if_32_oclT_6);
		t_String.getOwnedOperations().add(op_String__gt_);
		//
		// ocl::String::>=()
		//
		op_String__gt__eq_.setPrecedence(prec_RELATIONAL);
		op_String__gt__eq_.getOwnedComments().add(co_True_32_if_32_oclT_4);
		t_String.getOwnedOperations().add(op_String__gt__eq_);
		//
		// ocl::String::at()
		//
		op_String_at.getOwnedComments().add(co_Queries_32_the_32_);
		t_String.getOwnedOperations().add(op_String_at);
		//
		// ocl::String::characters()
		//
		op_String_characters.getOwnedComments().add(co_Obtains_32_the_32_);
		t_String.getOwnedOperations().add(op_String_characters);
		//
		// ocl::String::compareTo()
		//
		op_String_compareTo.getOwnedComments().add(co_The_32_comparis_2);
		t_String.getOwnedOperations().add(op_String_compareTo);
		//
		// ocl::String::concat()
		//
		op_String_concat.getOwnedComments().add(co_The_32_concaten_1);
		t_String.getOwnedOperations().add(op_String_concat);
		//
		// ocl::String::equalsIgnoreCase()
		//
		op_String_equalsIgnoreCase.getOwnedComments().add(co_Queries_32_whet);
		t_String.getOwnedOperations().add(op_String_equalsIgnoreCase);
		//
		// ocl::String::indexOf()
		//
		op_String_indexOf.getOwnedComments().add(co_Queries_32_the_32__1);
		t_String.getOwnedOperations().add(op_String_indexOf);
		//
		// ocl::String::size()
		//
		op_String_size.getOwnedComments().add(co_The_32_number_32_o);
		t_String.getOwnedOperations().add(op_String_size);
		//
		// ocl::String::substring()
		//
		op_String_substring.getOwnedComments().add(co_The_32_sub_sub_stri);
		t_String.getOwnedOperations().add(op_String_substring);
		//
		// ocl::String::toBoolean()
		//
		op_String_toBoolean.getOwnedComments().add(co_Converts_32_ocl_1);
		t_String.getOwnedOperations().add(op_String_toBoolean);
		//
		// ocl::String::toInteger()
		//
		op_String_toInteger.getOwnedComments().add(co_Converts_32_ocl_5);
		t_String.getOwnedOperations().add(op_String_toInteger);
		//
		// ocl::String::toLower()
		//
		op_String_toLower.getOwnedComments().add(co_This_32_is_32_a_32_de);
		t_String.getOwnedOperations().add(op_String_toLower);
		//
		// ocl::String::toLowerCase()
		//
		op_String_toLowerCase.getOwnedComments().add(co_Converts_32_ocl_6);
		t_String.getOwnedOperations().add(op_String_toLowerCase);
		//
		// ocl::String::toReal()
		//
		op_String_toReal.getOwnedComments().add(co_Converts_32_ocl);
		t_String.getOwnedOperations().add(op_String_toReal);
		//
		// ocl::String::toString()
		//
		op_String_toString.getOwnedComments().add(co_Returns_32_oclT_6);
		t_String.getOwnedOperations().add(op_String_toString);
		//
		// ocl::String::toUpper()
		//
		op_String_toUpper.getOwnedComments().add(co_This_32_is_32_a_32_de_1);
		t_String.getOwnedOperations().add(op_String_toUpper);
		//
		// ocl::String::toUpperCase()
		//
		op_String_toUpperCase.getOwnedComments().add(co_Converts_32_ocl_7);
		t_String.getOwnedOperations().add(op_String_toUpperCase);
		t_String.getOwnedComments().add(co_The_32_standard_5);
		library.getOwnedTypes().add(t_String);
		//
		// ocl::UnlimitedNatural
		//
		t_UnlimitedNatural.getSuperClasses().add(t_Integer);
		//
		// ocl::UnlimitedNatural::oclAsType()
		//
		op_UnlimitedNatural_oclAsType.getOwnedComments().add(co_Evaluates_32_to_1);
		t_UnlimitedNatural.getOwnedOperations().add(op_UnlimitedNatural_oclAsType);
		t_UnlimitedNatural.getOwnedComments().add(co_The_32_standard_6);
		library.getOwnedTypes().add(t_UnlimitedNatural);
		//
		// ocl::AnyClassifier
		//
		t_AnyClassifier.setInstanceType(t_AnyClassifier_T);
		t_AnyClassifier.getSuperClasses().add(t_Class);
		t_AnyClassifier.getSuperClasses().add(t_OclType);
		library.getOwnedTypes().add(t_AnyClassifier);
		//
		// ocl::Bag
		//
		t_Bag.setElementType(t_Bag_T);
		t_Bag.getSuperClasses().add(t_Collection_Bag_T);
		//
		// ocl::Bag::<>()
		//
		op_Bag__lt__gt_.setPrecedence(prec_EQUALITY);
		t_Bag.getOwnedOperations().add(op_Bag__lt__gt_);
		//
		// ocl::Bag::=()
		//
		op_Bag__eq_.setPrecedence(prec_EQUALITY);
		op_Bag__eq_.getOwnedComments().add(co_True_32_if_32_oclT);
		t_Bag.getOwnedOperations().add(op_Bag__eq_);
		//
		// ocl::Bag::closure()
		//
		it_Bag_closure.getOwnedComments().add(co_The_32_closure_32__1);
		t_Bag.getOwnedOperations().add(it_Bag_closure);
		//
		// ocl::Bag::collect()
		//
		t_Bag.getOwnedOperations().add(it_Bag_collect);
		//
		// ocl::Bag::collectNested()
		//
		it_Bag_collectNested.getOwnedComments().add(co_The_32_Bag_32_of_32_e);
		t_Bag.getOwnedOperations().add(it_Bag_collectNested);
		//
		// ocl::Bag::excluding()
		//
		op_Bag_excluding.getOwnedComments().add(co_The_32_bag_32_cont);
		t_Bag.getOwnedOperations().add(op_Bag_excluding);
		//
		// ocl::Bag::flatten()
		//
		op_Bag_flatten.getOwnedComments().add(co_Redefines_32_th);
		t_Bag.getOwnedOperations().add(op_Bag_flatten);
		//
		// ocl::Bag::including()
		//
		op_Bag_including.getOwnedComments().add(co_The_32_bag_32_cont_1);
		t_Bag.getOwnedOperations().add(op_Bag_including);
		//
		// ocl::Bag::intersection()
		//
		op_Bag_intersection.getOwnedComments().add(co_The_32_intersec_1);
		t_Bag.getOwnedOperations().add(op_Bag_intersection);
		//
		// ocl::Bag::intersection()
		//
		op_Bag_intersection_1.getOwnedComments().add(co_The_32_intersec_3);
		t_Bag.getOwnedOperations().add(op_Bag_intersection_1);
		//
		// ocl::Bag::reject()
		//
		it_Bag_reject.getOwnedComments().add(co_The_32_sub_sub_bag_32_);
		t_Bag.getOwnedOperations().add(it_Bag_reject);
		//
		// ocl::Bag::select()
		//
		it_Bag_select.getOwnedComments().add(co_The_32_sub_sub_bag_32__1);
		t_Bag.getOwnedOperations().add(it_Bag_select);
		//
		// ocl::Bag::selectByKind()
		//
		t_Bag.getOwnedOperations().add(op_Bag_selectByKind);
		//
		// ocl::Bag::selectByType()
		//
		t_Bag.getOwnedOperations().add(op_Bag_selectByType);
		//
		// ocl::Bag::sortedBy()
		//
		it_Bag_sortedBy.getOwnedComments().add(co_Results_32_in_32_t_2);
		t_Bag.getOwnedOperations().add(it_Bag_sortedBy);
		//
		// ocl::Bag::union()
		//
		op_Bag_union.getOwnedComments().add(co_The_32_union_32_of);
		t_Bag.getOwnedOperations().add(op_Bag_union);
		//
		// ocl::Bag::union()
		//
		op_Bag_union_1.getOwnedComments().add(co_The_32_union_32_of_1);
		t_Bag.getOwnedOperations().add(op_Bag_union_1);
		t_Bag.getOwnedComments().add(co_A_32_bag_32_is_32_a_32_c);
		library.getOwnedTypes().add(t_Bag);
		//
		// ocl::Class
		//
		t_Class.getSuperClasses().add(t_OclAny);
		//
		// ocl::Class::oclType()
		//
		op_Class_oclType.getOwnedComments().add(co_Evaluates_32_to_13);
		t_Class.getOwnedOperations().add(op_Class_oclType);
		library.getOwnedTypes().add(t_Class);
		//
		// ocl::ClassClassifier
		//
		t_ClassClassifier.setInstanceType(t_ClassClassifier_T);
		t_ClassClassifier.getSuperClasses().add(t_AnyClassifier_ClassClassifier_T);
		library.getOwnedTypes().add(t_ClassClassifier);
		//
		// ocl::CollectionClassifier
		//
		t_CollectionClassifier.setInstanceType(t_CollectionClassifier_T);
		t_CollectionClassifier.getSuperClasses().add(t_AnyClassifier_CollectionClassifier_T);
		//
		// ocl::CollectionClassifier::elementType
		//
		pr_CollectionClassifier_elementType.setIsResolveProxies(true);
		pr_CollectionClassifier_elementType.getOwnedComments().add(co_Evaluates_32_to_9);
		t_CollectionClassifier.getOwnedAttributes().add(pr_CollectionClassifier_elementType);
		library.getOwnedTypes().add(t_CollectionClassifier);
		//
		// ocl::Collection
		//
		t_Collection.setElementType(t_Collection_T);
		t_Collection.getSuperClasses().add(t_OclAny);
		//
		// ocl::Collection::<>()
		//
		op_Collection__lt__gt_.setPrecedence(prec_EQUALITY);
		op_Collection__lt__gt_.getOwnedComments().add(co_True_32_if_32_c_32_is_1);
		t_Collection.getOwnedOperations().add(op_Collection__lt__gt_);
		//
		// ocl::Collection::=()
		//
		op_Collection__eq_.setPrecedence(prec_EQUALITY);
		op_Collection__eq_.getOwnedComments().add(co_True_32_if_32_c_32_is);
		t_Collection.getOwnedOperations().add(op_Collection__eq_);
		//
		// ocl::Collection::any()
		//
		it_Collection_any.getOwnedComments().add(co_Returns_32_any_32_);
		t_Collection.getOwnedOperations().add(it_Collection_any);
		//
		// ocl::Collection::asBag()
		//
		op_Collection_asBag.getOwnedComments().add(co_The_32_Bag_32_that);
		t_Collection.getOwnedOperations().add(op_Collection_asBag);
		//
		// ocl::Collection::asOrderedSet()
		//
		op_Collection_asOrderedSet.getOwnedComments().add(co_An_32_OrderedSe);
		t_Collection.getOwnedOperations().add(op_Collection_asOrderedSet);
		//
		// ocl::Collection::asSequence()
		//
		op_Collection_asSequence.getOwnedComments().add(co_Sequence_32_tha);
		t_Collection.getOwnedOperations().add(op_Collection_asSequence);
		//
		// ocl::Collection::asSet()
		//
		op_Collection_asSet.getOwnedComments().add(co_The_32_Set_32_cont);
		t_Collection.getOwnedOperations().add(op_Collection_asSet);
		//
		// ocl::Collection::collect()
		//
		it_Collection_collect.getOwnedComments().add(co_The_32_Collecti);
		t_Collection.getOwnedOperations().add(it_Collection_collect);
		//
		// ocl::Collection::collectNested()
		//
		it_Collection_collectNested.getOwnedComments().add(co_The_32_Collecti_1);
		t_Collection.getOwnedOperations().add(it_Collection_collectNested);
		//
		// ocl::Collection::count()
		//
		op_Collection_count.getOwnedComments().add(co_The_32_number_32_o_3);
		t_Collection.getOwnedOperations().add(op_Collection_count);
		//
		// ocl::Collection::excludes()
		//
		op_Collection_excludes.getOwnedComments().add(co_True_32_if_32_obje_1);
		t_Collection.getOwnedOperations().add(op_Collection_excludes);
		//
		// ocl::Collection::excludesAll()
		//
		op_Collection_excludesAll.getOwnedComments().add(co_Does_32_oclText_1);
		t_Collection.getOwnedOperations().add(op_Collection_excludesAll);
		//
		// ocl::Collection::excluding()
		//
		op_Collection_excluding.getOwnedComments().add(co_The_32_collecti);
		t_Collection.getOwnedOperations().add(op_Collection_excluding);
		//
		// ocl::Collection::exists()
		//
		it_Collection_exists_1.getOwnedComments().add(co_Results_32_in_32_o_1);
		t_Collection.getOwnedOperations().add(it_Collection_exists_1);
		//
		// ocl::Collection::exists()
		//
		t_Collection.getOwnedOperations().add(it_Collection_exists);
		//
		// ocl::Collection::flatten()
		//
		op_Collection_flatten.getOwnedComments().add(co_If_32_the_32_eleme);
		t_Collection.getOwnedOperations().add(op_Collection_flatten);
		//
		// ocl::Collection::forAll()
		//
		it_Collection_forAll_1.getOwnedComments().add(co_Results_32_in_32_o_2);
		t_Collection.getOwnedOperations().add(it_Collection_forAll_1);
		//
		// ocl::Collection::forAll()
		//
		t_Collection.getOwnedOperations().add(it_Collection_forAll);
		//
		// ocl::Collection::includes()
		//
		op_Collection_includes.getOwnedComments().add(co_True_32_if_32_obje);
		t_Collection.getOwnedOperations().add(op_Collection_includes);
		//
		// ocl::Collection::includesAll()
		//
		op_Collection_includesAll.getOwnedComments().add(co_Does_32_oclText);
		t_Collection.getOwnedOperations().add(op_Collection_includesAll);
		//
		// ocl::Collection::including()
		//
		op_Collection_including.getOwnedComments().add(co_The_32_collecti_1);
		t_Collection.getOwnedOperations().add(op_Collection_including);
		//
		// ocl::Collection::isEmpty()
		//
		op_Collection_isEmpty.getOwnedComments().add(co_Is_32_oclText_91_s_1);
		t_Collection.getOwnedOperations().add(op_Collection_isEmpty);
		//
		// ocl::Collection::isUnique()
		//
		it_Collection_isUnique.getOwnedComments().add(co_Results_32_in_32_o);
		t_Collection.getOwnedOperations().add(it_Collection_isUnique);
		//
		// ocl::Collection::iterate()
		//
		it_Collection_iterate.getOwnedAccumulators().add(pa_Collection_iterate_acc);t_Collection.getOwnedOperations().add(it_Collection_iterate);
		//
		// ocl::Collection::max()
		//
		op_Collection_max.getOwnedComments().add(co_The_32_element_32_);
		t_Collection.getOwnedOperations().add(op_Collection_max);
		//
		// ocl::Collection::min()
		//
		op_Collection_min.getOwnedComments().add(co_The_32_element_32__1);
		t_Collection.getOwnedOperations().add(op_Collection_min);
		//
		// ocl::Collection::notEmpty()
		//
		op_Collection_notEmpty.getOwnedComments().add(co_Is_32_oclText_91_s);
		t_Collection.getOwnedOperations().add(op_Collection_notEmpty);
		//
		// ocl::Collection::oclType()
		//
		op_Collection_oclType.getOwnedComments().add(co_Evaluates_32_to_12);
		t_Collection.getOwnedOperations().add(op_Collection_oclType);
		//
		// ocl::Collection::one()
		//
		it_Collection_one.getOwnedComments().add(co_Results_32_in_32_o_3);
		t_Collection.getOwnedOperations().add(it_Collection_one);
		//
		// ocl::Collection::product()
		//
		op_Collection_product.getOwnedComments().add(co_The_32_cartesia);
		t_Collection.getOwnedOperations().add(op_Collection_product);
		//
		// ocl::Collection::reject()
		//
		it_Collection_reject.getOwnedComments().add(co_The_32_sub_sub_coll);
		t_Collection.getOwnedOperations().add(it_Collection_reject);
		//
		// ocl::Collection::select()
		//
		it_Collection_select.getOwnedComments().add(co_The_32_sub_sub_coll_1);
		t_Collection.getOwnedOperations().add(it_Collection_select);
		//
		// ocl::Collection::selectByKind()
		//
		t_Collection.getOwnedOperations().add(op_Collection_selectByKind);
		//
		// ocl::Collection::selectByType()
		//
		t_Collection.getOwnedOperations().add(op_Collection_selectByType);
		//
		// ocl::Collection::size()
		//
		op_Collection_size.getOwnedComments().add(co_The_32_number_32_o_1);
		t_Collection.getOwnedOperations().add(op_Collection_size);
		//
		// ocl::Collection::sortedBy()
		//
		it_Collection_sortedBy.getOwnedComments().add(co_Results_32_in_32_t);
		t_Collection.getOwnedOperations().add(it_Collection_sortedBy);
		//
		// ocl::Collection::sum()
		//
		op_Collection_sum.getOwnedComments().add(co_The_32_addition);
		t_Collection.getOwnedOperations().add(op_Collection_sum);
		t_Collection.getOwnedComments().add(co_Collection_32_i);
		library.getOwnedTypes().add(t_Collection);
		//
		// ocl::Enumeration
		//
		t_Enumeration.getSuperClasses().add(t_OclAny);
		//
		// ocl::Enumeration::allInstances()
		//
		op_Enumeration_allInstances.setIsStatic(true);
		op_Enumeration_allInstances.getOwnedComments().add(co_Return_32_a_32_set);
		t_Enumeration.getOwnedOperations().add(op_Enumeration_allInstances);
		//
		// ocl::Enumeration::oclType()
		//
		op_Enumeration_oclType.getOwnedComments().add(co_Evaluates_32_to_10);
		t_Enumeration.getOwnedOperations().add(op_Enumeration_oclType);
		t_Enumeration.getOwnedComments().add(co_The_32_Enumerat);
		library.getOwnedTypes().add(t_Enumeration);
		//
		// ocl::EnumerationClassifier
		//
		t_EnumerationClassifier.setInstanceType(t_EnumerationClassifier_T);
		t_EnumerationClassifier.getSuperClasses().add(t_AnyClassifier_EnumerationClassifier_T);
		//
		// ocl::EnumerationClassifier::ownedLiteral
		//
		pr_EnumerationClassifier_ownedLiteral.setIsResolveProxies(true);
		pr_EnumerationClassifier_ownedLiteral.getOwnedComments().add(co_Evaluates_32_to_8);
		t_EnumerationClassifier.getOwnedAttributes().add(pr_EnumerationClassifier_ownedLiteral);
		t_EnumerationClassifier.getOwnedComments().add(co_The_32_standard_1);
		library.getOwnedTypes().add(t_EnumerationClassifier);
		//
		// ocl::EnumerationLiteral
		//
		t_EnumerationLiteral.getSuperClasses().add(t_OclAny);
		t_EnumerationLiteral.getOwnedComments().add(co_The_32_standard_2);
		library.getOwnedTypes().add(t_EnumerationLiteral);
		//
		// ocl::OclAny
		//
		//
		// ocl::OclAny::<>()
		//
		op_OclAny__lt__gt_.setPrecedence(prec_EQUALITY);
		op_OclAny__lt__gt_.getOwnedComments().add(co_True_32_if_32_oclT_2);
		t_OclAny.getOwnedOperations().add(op_OclAny__lt__gt_);
		//
		// ocl::OclAny::=()
		//
		op_OclAny__eq_.setPrecedence(prec_EQUALITY);
		op_OclAny__eq_.getOwnedComments().add(co_True_32_if_32_oclT_13);
		t_OclAny.getOwnedOperations().add(op_OclAny__eq_);
		//
		// ocl::OclAny::oclAsSet()
		//
		op_OclAny_oclAsSet.getOwnedComments().add(co_Returns_32_a_32_Se);
		t_OclAny.getOwnedOperations().add(op_OclAny_oclAsSet);
		//
		// ocl::OclAny::oclAsType()
		//
		op_OclAny_oclAsType.getOwnedComments().add(co_Evaluates_32_to);
		t_OclAny.getOwnedOperations().add(op_OclAny_oclAsType);
		//
		// ocl::OclAny::oclIsInState()
		//
		op_OclAny_oclIsInState.getOwnedComments().add(co_Evaluates_32_to_6);
		t_OclAny.getOwnedOperations().add(op_OclAny_oclIsInState);
		//
		// ocl::OclAny::oclIsInvalid()
		//
		op_OclAny_oclIsInvalid.getOwnedComments().add(co_Evaluates_32_to_4);
		t_OclAny.getOwnedOperations().add(op_OclAny_oclIsInvalid);
		//
		// ocl::OclAny::oclIsKindOf()
		//
		op_OclAny_oclIsKindOf.getOwnedComments().add(co_Evaluates_32_to_7);
		t_OclAny.getOwnedOperations().add(op_OclAny_oclIsKindOf);
		//
		// ocl::OclAny::oclIsNew()
		//
		op_OclAny_oclIsNew.getOwnedComments().add(co_Can_32_only_32_be_32_);
		t_OclAny.getOwnedOperations().add(op_OclAny_oclIsNew);
		//
		// ocl::OclAny::oclIsTypeOf()
		//
		op_OclAny_oclIsTypeOf.getOwnedComments().add(co_Evaluates_32_to_3);
		t_OclAny.getOwnedOperations().add(op_OclAny_oclIsTypeOf);
		//
		// ocl::OclAny::oclIsUndefined()
		//
		op_OclAny_oclIsUndefined.getOwnedComments().add(co_Evaluates_32_to_5);
		t_OclAny.getOwnedOperations().add(op_OclAny_oclIsUndefined);
		//
		// ocl::OclAny::oclType()
		//
		op_OclAny_oclType.getOwnedComments().add(co_Evaluates_32_to_11);
		t_OclAny.getOwnedOperations().add(op_OclAny_oclType);
		t_OclAny.getOwnedComments().add(co_All_32_types_32_in);
		library.getOwnedTypes().add(t_OclAny);
		//
		// ocl::OclComparable
		//
		t_OclComparable.getSuperClasses().add(t_OclAny);
		//
		// ocl::OclComparable::compareTo()
		//
		op_OclComparable_compareTo.getOwnedComments().add(co_Return_32__sub_ve_44__32_);
		t_OclComparable.getOwnedOperations().add(op_OclComparable_compareTo);
		t_OclComparable.getOwnedComments().add(co_The_32_type_32_Ocl);
		library.getOwnedTypes().add(t_OclComparable);
		//
		// ocl::OclElement
		//
		t_OclElement.getSuperClasses().add(t_OclAny);
		//
		// ocl::OclElement::allInstances()
		//
		op_OclElement_allInstances.setIsStatic(true);
		op_OclElement_allInstances.getOwnedComments().add(co_Return_32_a_32_set_1);
		t_OclElement.getOwnedOperations().add(op_OclElement_allInstances);
		//
		// ocl::OclElement::oclContainer()
		//
		op_OclElement_oclContainer.getOwnedComments().add(co_Returns_32_the_32__1);
		t_OclElement.getOwnedOperations().add(op_OclElement_oclContainer);
		//
		// ocl::OclElement::oclContents()
		//
		op_OclElement_oclContents.getOwnedComments().add(co_Returns_32_the_32_);
		t_OclElement.getOwnedOperations().add(op_OclElement_oclContents);
		t_OclElement.getOwnedComments().add(co_The_32_type_32_Ocl_1);
		library.getOwnedTypes().add(t_OclElement);
		//
		// ocl::OclInvalid
		//
		t_OclInvalid.getSuperClasses().add(t_OclVoid);
		//
		// ocl::OclInvalid::oclBadProperty
		//
		pr_OclInvalid_oclBadProperty.setIsResolveProxies(true);
		t_OclInvalid.getOwnedAttributes().add(pr_OclInvalid_oclBadProperty);
		//
		// ocl::OclInvalid::<>()
		//
		op_OclInvalid__lt__gt_.setPrecedence(prec_EQUALITY);
		op_OclInvalid__lt__gt_.getOwnedComments().add(co_Returns_32_oclT_3);
		t_OclInvalid.getOwnedOperations().add(op_OclInvalid__lt__gt_);
		//
		// ocl::OclInvalid::=()
		//
		op_OclInvalid__eq_.setPrecedence(prec_EQUALITY);
		op_OclInvalid__eq_.getOwnedComments().add(co_Returns_32_oclT_2);
		t_OclInvalid.getOwnedOperations().add(op_OclInvalid__eq_);
		//
		// ocl::OclInvalid::allInstances()
		//
		op_OclInvalid_allInstances.setIsStatic(true);
		op_OclInvalid_allInstances.getOwnedComments().add(co_Returns_32_oclT_4);
		t_OclInvalid.getOwnedOperations().add(op_OclInvalid_allInstances);
		//
		// ocl::OclInvalid::oclBadOperation()
		//
		t_OclInvalid.getOwnedOperations().add(op_OclInvalid_oclBadOperation);
		//
		// ocl::OclInvalid::toString()
		//
		op_OclInvalid_toString.getOwnedComments().add(co_Returns_32__39_inv);
		t_OclInvalid.getOwnedOperations().add(op_OclInvalid_toString);
		t_OclInvalid.getOwnedComments().add(co_The_32_type_32_Ocl_2);
		library.getOwnedTypes().add(t_OclInvalid);
		//
		// ocl::OclLambda
		//
		t_OclLambda.getSuperClasses().add(t_OclAny);
		t_OclLambda.getOwnedComments().add(co_The_32_type_32_Ocl_3);
		library.getOwnedTypes().add(t_OclLambda);
		//
		// ocl::OclMessage
		//
		t_OclMessage.getSuperClasses().add(t_OclAny);
		//
		// ocl::OclMessage::hasReturned()
		//
		op_OclMessage_hasReturned.getOwnedComments().add(co_True_32_if_32_type);
		t_OclMessage.getOwnedOperations().add(op_OclMessage_hasReturned);
		//
		// ocl::OclMessage::isOperationCall()
		//
		op_OclMessage_isOperationCall.getOwnedComments().add(co_Returns_32_oclT_7);
		t_OclMessage.getOwnedOperations().add(op_OclMessage_isOperationCall);
		//
		// ocl::OclMessage::isSignalSent()
		//
		op_OclMessage_isSignalSent.getOwnedComments().add(co_Returns_32_oclT_8);
		t_OclMessage.getOwnedOperations().add(op_OclMessage_isSignalSent);
		//
		// ocl::OclMessage::result()
		//
		op_OclMessage_result.getOwnedComments().add(co_Returns_32_the_32__2);
		t_OclMessage.getOwnedOperations().add(op_OclMessage_result);
		t_OclMessage.getOwnedComments().add(co_OclMessage_10_T);
		library.getOwnedTypes().add(t_OclMessage);
		//
		// ocl::OclSelf
		//
		t_OclSelf.getSuperClasses().add(t_OclAny);
		t_OclSelf.getOwnedComments().add(co_The_32_pseudo_sub_t);
		library.getOwnedTypes().add(t_OclSelf);
		//
		// ocl::OclState
		//
		t_OclState.getSuperClasses().add(t_OclAny);
		library.getOwnedTypes().add(t_OclState);
		//
		// ocl::OclSummable
		//
		t_OclSummable.getSuperClasses().add(t_OclAny);
		//
		// ocl::OclSummable::sum()
		//
		op_OclSummable_sum.getOwnedComments().add(co_Return_32_the_32_s);
		t_OclSummable.getOwnedOperations().add(op_OclSummable_sum);
		//
		// ocl::OclSummable::zero()
		//
		op_OclSummable_zero.getOwnedComments().add(co_Return_32_the_32__39_);
		t_OclSummable.getOwnedOperations().add(op_OclSummable_zero);
		t_OclSummable.getOwnedComments().add(co_The_32_type_32_Ocl_4);
		library.getOwnedTypes().add(t_OclSummable);
		//
		// ocl::OclTuple
		//
		t_OclTuple.getSuperClasses().add(t_OclAny);
		//
		// ocl::OclTuple::<>()
		//
		op_OclTuple__lt__gt_.setPrecedence(prec_EQUALITY);
		t_OclTuple.getOwnedOperations().add(op_OclTuple__lt__gt_);
		//
		// ocl::OclTuple::=()
		//
		op_OclTuple__eq_.setPrecedence(prec_EQUALITY);
		t_OclTuple.getOwnedOperations().add(op_OclTuple__eq_);
		t_OclTuple.getOwnedComments().add(co_The_32_type_32_Ocl_5);
		library.getOwnedTypes().add(t_OclTuple);
		//
		// ocl::OclType
		//
		t_OclType.getSuperClasses().add(t_OclElement);
		//
		// ocl::OclType::conformsTo()
		//
		op_OclType_conformsTo.getOwnedComments().add(co_Returns_32_true);
		t_OclType.getOwnedOperations().add(op_OclType_conformsTo);
		t_OclType.getOwnedComments().add(co_The_32_type_32_Ocl_6);
		library.getOwnedTypes().add(t_OclType);
		//
		// ocl::OclVoid
		//
		t_OclVoid.getSuperClasses().add(t_OclAny);
		//
		// ocl::OclVoid::<>()
		//
		op_OclVoid__lt__gt_.setPrecedence(prec_EQUALITY);
		t_OclVoid.getOwnedOperations().add(op_OclVoid__lt__gt_);
		//
		// ocl::OclVoid::=()
		//
		op_OclVoid__eq_.setPrecedence(prec_EQUALITY);
		op_OclVoid__eq_.getOwnedComments().add(co_Redefines_32_th_3);
		t_OclVoid.getOwnedOperations().add(op_OclVoid__eq_);
		//
		// ocl::OclVoid::allInstances()
		//
		op_OclVoid_allInstances.setIsStatic(true);
		op_OclVoid_allInstances.getOwnedComments().add(co_Returns_32_oclT_1);
		t_OclVoid.getOwnedOperations().add(op_OclVoid_allInstances);
		//
		// ocl::OclVoid::and()
		//
		op_OclVoid_and.setPrecedence(prec_AND);
		t_OclVoid.getOwnedOperations().add(op_OclVoid_and);
		//
		// ocl::OclVoid::implies()
		//
		op_OclVoid_implies.setPrecedence(prec_IMPLIES);
		t_OclVoid.getOwnedOperations().add(op_OclVoid_implies);
		//
		// ocl::OclVoid::or()
		//
		op_OclVoid_or.setPrecedence(prec_OR);
		t_OclVoid.getOwnedOperations().add(op_OclVoid_or);
		//
		// ocl::OclVoid::toString()
		//
		op_OclVoid_toString.getOwnedComments().add(co_Returns_32_oclT_5);
		t_OclVoid.getOwnedOperations().add(op_OclVoid_toString);
		t_OclVoid.getOwnedComments().add(co_The_32_type_32_Ocl_7);
		library.getOwnedTypes().add(t_OclVoid);
		//
		// ocl::OrderedSet
		//
		t_OrderedSet.setElementType(t_OrderedSet_T);
		t_OrderedSet.getSuperClasses().add(t_Sequence_OrderedSet_T);
		t_OrderedSet.getSuperClasses().add(t_UniqueCollection_OrderedSet_T);
		//
		// ocl::OrderedSet::-()
		//
		op_OrderedSet__sub_.setPrecedence(prec_ADDITIVE);
		op_OrderedSet__sub_.getOwnedComments().add(co_The_32_elements);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet__sub_);
		//
		// ocl::OrderedSet::<>()
		//
		op_OrderedSet__lt__gt_.setPrecedence(prec_EQUALITY);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet__lt__gt_);
		//
		// ocl::OrderedSet::=()
		//
		op_OrderedSet__eq_.setPrecedence(prec_EQUALITY);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet__eq_);
		//
		// ocl::OrderedSet::append()
		//
		op_OrderedSet_append.getOwnedComments().add(co_The_32_set_32_of_32_e);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_append);
		//
		// ocl::OrderedSet::excluding()
		//
		op_OrderedSet_excluding.getOwnedComments().add(co_The_32_ordered_32_);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_excluding);
		//
		// ocl::OrderedSet::flatten()
		//
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_flatten);
		//
		// ocl::OrderedSet::including()
		//
		op_OrderedSet_including.getOwnedComments().add(co_The_32_ordered_32__3);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_including);
		//
		// ocl::OrderedSet::insertAt()
		//
		op_OrderedSet_insertAt.getOwnedComments().add(co_The_32_ordered_32__2);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_insertAt);
		//
		// ocl::OrderedSet::intersection()
		//
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_intersection);
		//
		// ocl::OrderedSet::prepend()
		//
		op_OrderedSet_prepend.getOwnedComments().add(co_The_32_sequence_2);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_prepend);
		//
		// ocl::OrderedSet::reject()
		//
		it_OrderedSet_reject.getOwnedComments().add(co_The_32_ordered_32__5);
		t_OrderedSet.getOwnedOperations().add(it_OrderedSet_reject);
		//
		// ocl::OrderedSet::reverse()
		//
		op_OrderedSet_reverse.getOwnedComments().add(co_The_32_ordered_32__4);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_reverse);
		//
		// ocl::OrderedSet::select()
		//
		it_OrderedSet_select.getOwnedComments().add(co_The_32_ordered_32__6);
		t_OrderedSet.getOwnedOperations().add(it_OrderedSet_select);
		//
		// ocl::OrderedSet::selectByKind()
		//
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_selectByKind);
		//
		// ocl::OrderedSet::selectByType()
		//
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_selectByType);
		//
		// ocl::OrderedSet::sortedBy()
		//
		it_OrderedSet_sortedBy.getOwnedComments().add(co_Results_32_in_32_t_3);
		t_OrderedSet.getOwnedOperations().add(it_OrderedSet_sortedBy);
		//
		// ocl::OrderedSet::subOrderedSet()
		//
		op_OrderedSet_subOrderedSet.getOwnedComments().add(co_The_32_sub_sub_set_32_);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_subOrderedSet);
		//
		// ocl::OrderedSet::union()
		//
		op_OrderedSet_union.getOwnedComments().add(co_The_32_ordered_32__1);
		t_OrderedSet.getOwnedOperations().add(op_OrderedSet_union);
		t_OrderedSet.getOwnedComments().add(co_The_32_OrderedS);
		library.getOwnedTypes().add(t_OrderedSet);
		//
		// ocl::Sequence
		//
		t_Sequence.setElementType(t_Sequence_T);
		t_Sequence.getSuperClasses().add(t_Collection_Sequence_T_1);
		//
		// ocl::Sequence::<>()
		//
		op_Sequence__lt__gt_.setPrecedence(prec_EQUALITY);
		t_Sequence.getOwnedOperations().add(op_Sequence__lt__gt_);
		//
		// ocl::Sequence::=()
		//
		op_Sequence__eq_.setPrecedence(prec_EQUALITY);
		op_Sequence__eq_.getOwnedComments().add(co_True_32_if_32_oclT_1);
		t_Sequence.getOwnedOperations().add(op_Sequence__eq_);
		//
		// ocl::Sequence::append()
		//
		op_Sequence_append.getOwnedComments().add(co_The_32_sequence_8);
		t_Sequence.getOwnedOperations().add(op_Sequence_append);
		//
		// ocl::Sequence::at()
		//
		op_Sequence_at.getOwnedComments().add(co_The_32_i_sub_th_32_ele);
		t_Sequence.getOwnedOperations().add(op_Sequence_at);
		//
		// ocl::Sequence::closure()
		//
		it_Sequence_closure.getOwnedComments().add(co_The_32_closure_32_);
		t_Sequence.getOwnedOperations().add(it_Sequence_closure);
		//
		// ocl::Sequence::collect()
		//
		t_Sequence.getOwnedOperations().add(it_Sequence_collect);
		//
		// ocl::Sequence::collectNested()
		//
		it_Sequence_collectNested.getOwnedComments().add(co_The_32_sequence_7);
		t_Sequence.getOwnedOperations().add(it_Sequence_collectNested);
		//
		// ocl::Sequence::excluding()
		//
		op_Sequence_excluding.getOwnedComments().add(co_The_32_sequence_4);
		t_Sequence.getOwnedOperations().add(op_Sequence_excluding);
		//
		// ocl::Sequence::first()
		//
		op_Sequence_first.getOwnedComments().add(co_The_32_first_32_el);
		t_Sequence.getOwnedOperations().add(op_Sequence_first);
		//
		// ocl::Sequence::flatten()
		//
		op_Sequence_flatten.getOwnedComments().add(co_Redefines_32_th_1);
		t_Sequence.getOwnedOperations().add(op_Sequence_flatten);
		//
		// ocl::Sequence::including()
		//
		op_Sequence_including.getOwnedComments().add(co_The_32_sequence_5);
		t_Sequence.getOwnedOperations().add(op_Sequence_including);
		//
		// ocl::Sequence::indexOf()
		//
		op_Sequence_indexOf.getOwnedComments().add(co_The_32_index_32_of);
		t_Sequence.getOwnedOperations().add(op_Sequence_indexOf);
		//
		// ocl::Sequence::insertAt()
		//
		op_Sequence_insertAt.getOwnedComments().add(co_The_32_sequence_3);
		t_Sequence.getOwnedOperations().add(op_Sequence_insertAt);
		//
		// ocl::Sequence::intersection()
		//
		op_Sequence_intersection.getOwnedComments().add(co_The_32_intersec);
		t_Sequence.getOwnedOperations().add(op_Sequence_intersection);
		//
		// ocl::Sequence::intersection()
		//
		op_Sequence_intersection_1.getOwnedComments().add(co_The_32_intersec_4);
		t_Sequence.getOwnedOperations().add(op_Sequence_intersection_1);
		//
		// ocl::Sequence::last()
		//
		op_Sequence_last.getOwnedComments().add(co_The_32_last_32_ele);
		t_Sequence.getOwnedOperations().add(op_Sequence_last);
		//
		// ocl::Sequence::prepend()
		//
		op_Sequence_prepend.getOwnedComments().add(co_The_32_sequence_1);
		t_Sequence.getOwnedOperations().add(op_Sequence_prepend);
		//
		// ocl::Sequence::reject()
		//
		it_Sequence_reject.getOwnedComments().add(co_The_32_subseque);
		t_Sequence.getOwnedOperations().add(it_Sequence_reject);
		//
		// ocl::Sequence::reverse()
		//
		op_Sequence_reverse.getOwnedComments().add(co_The_32_sequence_6);
		t_Sequence.getOwnedOperations().add(op_Sequence_reverse);
		//
		// ocl::Sequence::select()
		//
		it_Sequence_select.getOwnedComments().add(co_The_32_subseque_1);
		t_Sequence.getOwnedOperations().add(it_Sequence_select);
		//
		// ocl::Sequence::selectByKind()
		//
		t_Sequence.getOwnedOperations().add(op_Sequence_selectByKind);
		//
		// ocl::Sequence::selectByType()
		//
		t_Sequence.getOwnedOperations().add(op_Sequence_selectByType);
		//
		// ocl::Sequence::sortedBy()
		//
		it_Sequence_sortedBy.getOwnedComments().add(co_Results_32_in_32_t_1);
		t_Sequence.getOwnedOperations().add(it_Sequence_sortedBy);
		//
		// ocl::Sequence::subSequence()
		//
		op_Sequence_subSequence.getOwnedComments().add(co_The_32_sub_sub_sequ);
		t_Sequence.getOwnedOperations().add(op_Sequence_subSequence);
		//
		// ocl::Sequence::union()
		//
		op_Sequence_union.getOwnedComments().add(co_The_32_sequence);
		t_Sequence.getOwnedOperations().add(op_Sequence_union);
		t_Sequence.getOwnedComments().add(co_A_32_sequence_32_i);
		library.getOwnedTypes().add(t_Sequence);
		//
		// ocl::Set
		//
		t_Set.setElementType(t_Set_T);
		t_Set.getSuperClasses().add(t_Bag_Set_T);
		t_Set.getSuperClasses().add(t_UniqueCollection_Set_T);
		//
		// ocl::Set::-()
		//
		op_Set__sub_.setPrecedence(prec_ADDITIVE);
		op_Set__sub_.getOwnedComments().add(co_The_32_elements_2);
		t_Set.getOwnedOperations().add(op_Set__sub_);
		//
		// ocl::Set::<>()
		//
		op_Set__lt__gt_.setPrecedence(prec_EQUALITY);
		t_Set.getOwnedOperations().add(op_Set__lt__gt_);
		//
		// ocl::Set::=()
		//
		op_Set__eq_.setPrecedence(prec_EQUALITY);
		op_Set__eq_.getOwnedComments().add(co_Evaluates_32_to_2);
		t_Set.getOwnedOperations().add(op_Set__eq_);
		//
		// ocl::Set::excluding()
		//
		op_Set_excluding.getOwnedComments().add(co_The_32_set_32_cont_1);
		t_Set.getOwnedOperations().add(op_Set_excluding);
		//
		// ocl::Set::flatten()
		//
		op_Set_flatten.getOwnedComments().add(co_Redefines_32_th_2);
		t_Set.getOwnedOperations().add(op_Set_flatten);
		//
		// ocl::Set::including()
		//
		op_Set_including.getOwnedComments().add(co_The_32_set_32_cont);
		t_Set.getOwnedOperations().add(op_Set_including);
		//
		// ocl::Set::intersection()
		//
		op_Set_intersection.getOwnedComments().add(co_The_32_intersec_2);
		t_Set.getOwnedOperations().add(op_Set_intersection);
		//
		// ocl::Set::reject()
		//
		it_Set_reject.getOwnedComments().add(co_The_32_subset_32_o_1);
		t_Set.getOwnedOperations().add(it_Set_reject);
		//
		// ocl::Set::select()
		//
		it_Set_select.getOwnedComments().add(co_The_32_subset_32_o);
		t_Set.getOwnedOperations().add(it_Set_select);
		//
		// ocl::Set::selectByKind()
		//
		t_Set.getOwnedOperations().add(op_Set_selectByKind);
		//
		// ocl::Set::selectByType()
		//
		t_Set.getOwnedOperations().add(op_Set_selectByType);
		//
		// ocl::Set::sortedBy()
		//
		it_Set_sortedBy.getOwnedComments().add(co_Results_32_in_32_t_5);
		t_Set.getOwnedOperations().add(it_Set_sortedBy);
		//
		// ocl::Set::union()
		//
		op_Set_union.getOwnedComments().add(co_The_32_set_32_cons);
		t_Set.getOwnedOperations().add(op_Set_union);
		library.getOwnedTypes().add(t_Set);
		//
		// ocl::Type
		//
		t_Type.getSuperClasses().add(t_OclType);
		library.getOwnedTypes().add(t_Type);
		//
		// ocl::UniqueCollection
		//
		t_UniqueCollection.setElementType(t_UniqueCollection_T);
		t_UniqueCollection.getSuperClasses().add(t_Collection_UniqueCollection_T);
		//
		// ocl::UniqueCollection::-()
		//
		op_UniqueCollection__sub_.setPrecedence(prec_ADDITIVE);
		op_UniqueCollection__sub_.getOwnedComments().add(co_The_32_elements_1);
		t_UniqueCollection.getOwnedOperations().add(op_UniqueCollection__sub_);
		//
		// ocl::UniqueCollection::sortedBy()
		//
		it_UniqueCollection_sortedBy.getOwnedComments().add(co_Results_32_in_32_t_4);
		t_UniqueCollection.getOwnedOperations().add(it_UniqueCollection_sortedBy);
		//
		// ocl::UniqueCollection::symmetricDifference()
		//
		op_UniqueCollection_symmetricDifference.getOwnedComments().add(co_The_32_set_32_cont_2);
		t_UniqueCollection.getOwnedOperations().add(op_UniqueCollection_symmetricDifference);
		//
		// ocl::UniqueCollection::union()
		//
		op_UniqueCollection_union.getOwnedComments().add(co_The_32_set_32_cons_1);
		t_UniqueCollection.getOwnedOperations().add(op_UniqueCollection_union);
		t_UniqueCollection.getOwnedComments().add(co_The_32_UniqueCo);
		library.getOwnedTypes().add(t_UniqueCollection);
		//
		// ocl::$$
		//
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Bag_T.setContextType(t_Bag_T);
		t_Lambda_Bag_T.setResultType(t_Boolean);
		t_Lambda_Bag_T.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Bag_T);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Bag_T_1.setContextType(t_Bag_T);
		t_Lambda_Bag_T_1.setResultType(t_Boolean);
		t_Lambda_Bag_T_1.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Bag_T_1);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Bag_T_2.setContextType(t_Bag_T);
		t_Lambda_Bag_T_2.setResultType(t_Bag_collectNested_V);
		t_Lambda_Bag_T_2.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Bag_T_2);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Bag_T_3.setContextType(t_Bag_T);
		t_Lambda_Bag_T_3.setResultType(t_Bag_collect_V);
		t_Lambda_Bag_T_3.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Bag_T_3);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Bag_T_4.setContextType(t_Bag_T);
		t_Lambda_Bag_T_4.setResultType(t_OclAny);
		t_Lambda_Bag_T_4.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Bag_T_4);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Bag_T_5.setContextType(t_Bag_T);
		t_Lambda_Bag_T_5.setResultType(t_Set_Bag_T);
		t_Lambda_Bag_T_5.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Bag_T_5);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T.setContextType(t_Collection_T);
		t_Lambda_Collection_T.setResultType(t_Boolean);
		t_Lambda_Collection_T.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_1.setContextType(t_Collection_T);
		t_Lambda_Collection_T_1.setResultType(t_Boolean);
		t_Lambda_Collection_T_1.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_1);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_2.setContextType(t_Collection_T);
		t_Lambda_Collection_T_2.setResultType(t_Boolean);
		t_Lambda_Collection_T_2.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_2);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_3.setContextType(t_Collection_T);
		t_Lambda_Collection_T_3.setResultType(t_Boolean);
		t_Lambda_Collection_T_3.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_3);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_4.setContextType(t_Collection_T);
		t_Lambda_Collection_T_4.setResultType(t_Boolean);
		t_Lambda_Collection_T_4.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_4);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_5.setContextType(t_Collection_T);
		t_Lambda_Collection_T_5.setResultType(t_Boolean);
		t_Lambda_Collection_T_5.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_5);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_6.setContextType(t_Collection_T);
		t_Lambda_Collection_T_6.setResultType(t_Boolean);
		t_Lambda_Collection_T_6.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_6);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_7.setContextType(t_Collection_T);
		t_Lambda_Collection_T_7.setResultType(t_Boolean);
		t_Lambda_Collection_T_7.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_7);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_8.setContextType(t_Collection_T);
		t_Lambda_Collection_T_8.setResultType(t_Collection_collectNested_V);
		t_Lambda_Collection_T_8.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_8);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_9.setContextType(t_Collection_T);
		t_Lambda_Collection_T_9.setResultType(t_Collection_collect_V);
		t_Lambda_Collection_T_9.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_9);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_10.setContextType(t_Collection_T);
		t_Lambda_Collection_T_10.setResultType(t_Collection_iterate_Tacc);
		t_Lambda_Collection_T_10.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_10);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_11.setContextType(t_Collection_T);
		t_Lambda_Collection_T_11.setResultType(t_OclAny);
		t_Lambda_Collection_T_11.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_11);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Collection_T_12.setContextType(t_Collection_T);
		t_Lambda_Collection_T_12.setResultType(t_OclAny);
		t_Lambda_Collection_T_12.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Collection_T_12);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_OrderedSet_T.setContextType(t_OrderedSet_T);
		t_Lambda_OrderedSet_T.setResultType(t_Boolean);
		t_Lambda_OrderedSet_T.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_OrderedSet_T);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_OrderedSet_T_1.setContextType(t_OrderedSet_T);
		t_Lambda_OrderedSet_T_1.setResultType(t_Boolean);
		t_Lambda_OrderedSet_T_1.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_OrderedSet_T_1);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_OrderedSet_T_2.setContextType(t_OrderedSet_T);
		t_Lambda_OrderedSet_T_2.setResultType(t_OclAny);
		t_Lambda_OrderedSet_T_2.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_OrderedSet_T_2);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Sequence_T.setContextType(t_Sequence_T);
		t_Lambda_Sequence_T.setResultType(t_Boolean);
		t_Lambda_Sequence_T.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Sequence_T);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Sequence_T_1.setContextType(t_Sequence_T);
		t_Lambda_Sequence_T_1.setResultType(t_Boolean);
		t_Lambda_Sequence_T_1.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Sequence_T_1);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Sequence_T_2.setContextType(t_Sequence_T);
		t_Lambda_Sequence_T_2.setResultType(t_OclAny);
		t_Lambda_Sequence_T_2.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Sequence_T_2);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Sequence_T_3.setContextType(t_Sequence_T);
		t_Lambda_Sequence_T_3.setResultType(t_OrderedSet_Sequence_T);
		t_Lambda_Sequence_T_3.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Sequence_T_3);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Sequence_T_4.setContextType(t_Sequence_T);
		t_Lambda_Sequence_T_4.setResultType(t_Sequence_collectNested_V);
		t_Lambda_Sequence_T_4.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Sequence_T_4);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Sequence_T_5.setContextType(t_Sequence_T);
		t_Lambda_Sequence_T_5.setResultType(t_Sequence_collect_V);
		t_Lambda_Sequence_T_5.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Sequence_T_5);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Set_T.setContextType(t_Set_T);
		t_Lambda_Set_T.setResultType(t_Boolean);
		t_Lambda_Set_T.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Set_T);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Set_T_1.setContextType(t_Set_T);
		t_Lambda_Set_T_1.setResultType(t_Boolean);
		t_Lambda_Set_T_1.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Set_T_1);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_Set_T_2.setContextType(t_Set_T);
		t_Lambda_Set_T_2.setResultType(t_OclAny);
		t_Lambda_Set_T_2.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_Set_T_2);
		//
		// ocl::$$::Lambda
		//
		t_Lambda_UniqueCollection_T.setContextType(t_UniqueCollection_T);
		t_Lambda_UniqueCollection_T.setResultType(t_OclAny);
		t_Lambda_UniqueCollection_T.getSuperClasses().add(t_OclLambda);
		pk_$$.getOwnedTypes().add(t_Lambda_UniqueCollection_T);
		//
		// ocl::$$::Tuple
		//
		t_Tuple.getSuperClasses().add(t_OclTuple);
		//
		// ocl::$$::Tuple::first
		//
		pr_Tuple_first_3.setIsResolveProxies(true);
		t_Tuple.getOwnedAttributes().add(pr_Tuple_first_3);
		//
		// ocl::$$::Tuple::second
		//
		pr_Tuple_second.setIsResolveProxies(true);
		t_Tuple.getOwnedAttributes().add(pr_Tuple_second);
		pk_$$.getOwnedTypes().add(t_Tuple);
		//
		// ocl::$$::Tuple
		//
		t_Tuple_1.getSuperClasses().add(t_OclTuple);
		//
		// ocl::$$::Tuple::first
		//
		pr_Tuple_first_2.setIsResolveProxies(true);
		t_Tuple_1.getOwnedAttributes().add(pr_Tuple_first_2);
		//
		// ocl::$$::Tuple::second
		//
		pr_Tuple_second_2.setIsResolveProxies(true);
		t_Tuple_1.getOwnedAttributes().add(pr_Tuple_second_2);
		pk_$$.getOwnedTypes().add(t_Tuple_1);
		//
		// ocl::$$::Tuple
		//
		t_Tuple_2.getSuperClasses().add(t_OclTuple);
		//
		// ocl::$$::Tuple::first
		//
		pr_Tuple_first_1.setIsResolveProxies(true);
		t_Tuple_2.getOwnedAttributes().add(pr_Tuple_first_1);
		//
		// ocl::$$::Tuple::second
		//
		pr_Tuple_second_3.setIsResolveProxies(true);
		t_Tuple_2.getOwnedAttributes().add(pr_Tuple_second_3);
		pk_$$.getOwnedTypes().add(t_Tuple_2);
		//
		// ocl::$$::Tuple
		//
		t_Tuple_3.getSuperClasses().add(t_OclTuple);
		//
		// ocl::$$::Tuple::first
		//
		pr_Tuple_first.setIsResolveProxies(true);
		t_Tuple_3.getOwnedAttributes().add(pr_Tuple_first);
		//
		// ocl::$$::Tuple::second
		//
		pr_Tuple_second_1.setIsResolveProxies(true);
		t_Tuple_3.getOwnedAttributes().add(pr_Tuple_second_1);
		pk_$$.getOwnedTypes().add(t_Tuple_3);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_UnlimitedNatural_oclAsType_TT.setInstanceType(t_UnlimitedNatural_oclAsType_TT);
		t_AnyClassifier_UnlimitedNatural_oclAsType_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_UnlimitedNatural_oclAsType_TT.getTemplateBindings().add(tb_AnyClassifier_UnlimitedNatural_oclAsType_TT);
		t_AnyClassifier_UnlimitedNatural_oclAsType_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_UnlimitedNatural_oclAsType_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_UnlimitedNatural_oclAsType_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_Bag_selectByKind_TT.setInstanceType(t_Bag_selectByKind_TT);
		t_AnyClassifier_Bag_selectByKind_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_Bag_selectByKind_TT.getTemplateBindings().add(tb_AnyClassifier_Bag_selectByKind_TT);
		t_AnyClassifier_Bag_selectByKind_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_Bag_selectByKind_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_Bag_selectByKind_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_Bag_selectByType_TT.setInstanceType(t_Bag_selectByType_TT);
		t_AnyClassifier_Bag_selectByType_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_Bag_selectByType_TT.getTemplateBindings().add(tb_AnyClassifier_Bag_selectByType_TT);
		t_AnyClassifier_Bag_selectByType_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_Bag_selectByType_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_Bag_selectByType_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_ClassClassifier_T.setInstanceType(t_ClassClassifier_T);
		t_AnyClassifier_ClassClassifier_T.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_ClassClassifier_T.getTemplateBindings().add(tb_AnyClassifier_ClassClassifier_T);
		t_AnyClassifier_ClassClassifier_T.getSuperClasses().add(t_Class);
		t_AnyClassifier_ClassClassifier_T.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_ClassClassifier_T);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_CollectionClassifier_T.setInstanceType(t_CollectionClassifier_T);
		t_AnyClassifier_CollectionClassifier_T.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_CollectionClassifier_T.getTemplateBindings().add(tb_AnyClassifier_CollectionClassifier_T);
		t_AnyClassifier_CollectionClassifier_T.getSuperClasses().add(t_Class);
		t_AnyClassifier_CollectionClassifier_T.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_CollectionClassifier_T);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_Collection_selectByKind_TT.setInstanceType(t_Collection_selectByKind_TT);
		t_AnyClassifier_Collection_selectByKind_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_Collection_selectByKind_TT.getTemplateBindings().add(tb_AnyClassifier_Collection_selectByKind_TT);
		t_AnyClassifier_Collection_selectByKind_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_Collection_selectByKind_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_Collection_selectByKind_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_Collection_selectByType_TT.setInstanceType(t_Collection_selectByType_TT);
		t_AnyClassifier_Collection_selectByType_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_Collection_selectByType_TT.getTemplateBindings().add(tb_AnyClassifier_Collection_selectByType_TT);
		t_AnyClassifier_Collection_selectByType_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_Collection_selectByType_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_Collection_selectByType_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_EnumerationClassifier_T.setInstanceType(t_EnumerationClassifier_T);
		t_AnyClassifier_EnumerationClassifier_T.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_EnumerationClassifier_T.getTemplateBindings().add(tb_AnyClassifier_EnumerationClassifier_T);
		t_AnyClassifier_EnumerationClassifier_T.getSuperClasses().add(t_Class);
		t_AnyClassifier_EnumerationClassifier_T.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_EnumerationClassifier_T);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_OclAny_oclAsType_TT.setInstanceType(t_OclAny_oclAsType_TT);
		t_AnyClassifier_OclAny_oclAsType_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_OclAny_oclAsType_TT.getTemplateBindings().add(tb_AnyClassifier_OclAny_oclAsType_TT);
		t_AnyClassifier_OclAny_oclAsType_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_OclAny_oclAsType_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_OclAny_oclAsType_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_OclAny_oclIsKindOf_T.setInstanceType(t_OclAny_oclIsKindOf_T);
		t_AnyClassifier_OclAny_oclIsKindOf_T.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_OclAny_oclIsKindOf_T.getTemplateBindings().add(tb_AnyClassifier_OclAny_oclIsKindOf_T);
		t_AnyClassifier_OclAny_oclIsKindOf_T.getSuperClasses().add(t_Class);
		t_AnyClassifier_OclAny_oclIsKindOf_T.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_OclAny_oclIsKindOf_T);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_OclAny_oclIsTypeOf_T.setInstanceType(t_OclAny_oclIsTypeOf_T);
		t_AnyClassifier_OclAny_oclIsTypeOf_T.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_OclAny_oclIsTypeOf_T.getTemplateBindings().add(tb_AnyClassifier_OclAny_oclIsTypeOf_T);
		t_AnyClassifier_OclAny_oclIsTypeOf_T.getSuperClasses().add(t_Class);
		t_AnyClassifier_OclAny_oclIsTypeOf_T.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_OclAny_oclIsTypeOf_T);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_OclInvalid.setInstanceType(t_OclInvalid);
		t_AnyClassifier_OclInvalid.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_OclInvalid.getTemplateBindings().add(tb_AnyClassifier_OclInvalid_1);
		t_AnyClassifier_OclInvalid.getSuperClasses().add(t_Class);
		t_AnyClassifier_OclInvalid.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_OclInvalid);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_OclInvalid_1.setInstanceType(t_OclInvalid);
		t_AnyClassifier_OclInvalid_1.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_OclInvalid_1.getTemplateBindings().add(tb_AnyClassifier_OclInvalid);
		t_AnyClassifier_OclInvalid_1.getSuperClasses().add(t_Class);
		t_AnyClassifier_OclInvalid_1.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_OclInvalid_1);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_OclSelf.setInstanceType(t_OclSelf);
		t_AnyClassifier_OclSelf.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_OclSelf.getTemplateBindings().add(tb_AnyClassifier_OclSelf);
		t_AnyClassifier_OclSelf.getSuperClasses().add(t_Class);
		t_AnyClassifier_OclSelf.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_OclSelf);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_OclVoid.setInstanceType(t_OclVoid);
		t_AnyClassifier_OclVoid.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_OclVoid.getTemplateBindings().add(tb_AnyClassifier_OclVoid);
		t_AnyClassifier_OclVoid.getSuperClasses().add(t_Class);
		t_AnyClassifier_OclVoid.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_OclVoid);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_OrderedSet_selectByKind_TT.setInstanceType(t_OrderedSet_selectByKind_TT);
		t_AnyClassifier_OrderedSet_selectByKind_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_OrderedSet_selectByKind_TT.getTemplateBindings().add(tb_AnyClassifier_OrderedSet_selectByKind_TT);
		t_AnyClassifier_OrderedSet_selectByKind_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_OrderedSet_selectByKind_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_OrderedSet_selectByKind_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_OrderedSet_selectByType_TT.setInstanceType(t_OrderedSet_selectByType_TT);
		t_AnyClassifier_OrderedSet_selectByType_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_OrderedSet_selectByType_TT.getTemplateBindings().add(tb_AnyClassifier_OrderedSet_selectByType_TT);
		t_AnyClassifier_OrderedSet_selectByType_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_OrderedSet_selectByType_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_OrderedSet_selectByType_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_Sequence_selectByKind_TT.setInstanceType(t_Sequence_selectByKind_TT);
		t_AnyClassifier_Sequence_selectByKind_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_Sequence_selectByKind_TT.getTemplateBindings().add(tb_AnyClassifier_Sequence_selectByKind_TT);
		t_AnyClassifier_Sequence_selectByKind_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_Sequence_selectByKind_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_Sequence_selectByKind_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_Sequence_selectByType_TT.setInstanceType(t_Sequence_selectByType_TT);
		t_AnyClassifier_Sequence_selectByType_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_Sequence_selectByType_TT.getTemplateBindings().add(tb_AnyClassifier_Sequence_selectByType_TT);
		t_AnyClassifier_Sequence_selectByType_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_Sequence_selectByType_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_Sequence_selectByType_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_Set_selectByKind_TT.setInstanceType(t_Set_selectByKind_TT);
		t_AnyClassifier_Set_selectByKind_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_Set_selectByKind_TT.getTemplateBindings().add(tb_AnyClassifier_Set_selectByKind_TT);
		t_AnyClassifier_Set_selectByKind_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_Set_selectByKind_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_Set_selectByKind_TT);
		//
		// ocl::$$::AnyClassifier
		//
		t_AnyClassifier_Set_selectByType_TT.setInstanceType(t_Set_selectByType_TT);
		t_AnyClassifier_Set_selectByType_TT.setUnspecializedElement(t_AnyClassifier);
		t_AnyClassifier_Set_selectByType_TT.getTemplateBindings().add(tb_AnyClassifier_Set_selectByType_TT);
		t_AnyClassifier_Set_selectByType_TT.getSuperClasses().add(t_Class);
		t_AnyClassifier_Set_selectByType_TT.getSuperClasses().add(t_OclType);
		pk_$$.getOwnedTypes().add(t_AnyClassifier_Set_selectByType_TT);
		//
		// ocl::$$::Bag
		//
		t_Bag_Tuple.setElementType(t_Tuple_1);
		t_Bag_Tuple.setUnspecializedElement(t_Bag);
		t_Bag_Tuple.getTemplateBindings().add(tb_Bag_Tuple);
		t_Bag_Tuple.getSuperClasses().add(t_Collection_Tuple);
		pk_$$.getOwnedTypes().add(t_Bag_Tuple);
		//
		// ocl::$$::Bag
		//
		t_Bag_Tuple_1.setElementType(t_Tuple_1);
		t_Bag_Tuple_1.setUnspecializedElement(t_Bag);
		t_Bag_Tuple_1.getTemplateBindings().add(tb_Bag_Tuple_1);
		t_Bag_Tuple_1.getSuperClasses().add(t_Collection_Tuple);
		pk_$$.getOwnedTypes().add(t_Bag_Tuple_1);
		//
		// ocl::$$::Bag
		//
		t_Bag_Bag_collect_V.setElementType(t_Bag_collect_V);
		t_Bag_Bag_collect_V.setUnspecializedElement(t_Bag);
		t_Bag_Bag_collect_V.getTemplateBindings().add(tb_Bag_Bag_collect_V);
		t_Bag_Bag_collect_V.getSuperClasses().add(t_Collection_Bag_collect_V);
		pk_$$.getOwnedTypes().add(t_Bag_Bag_collect_V);
		//
		// ocl::$$::Bag
		//
		t_Bag_Bag_flatten_T2.setElementType(t_Bag_flatten_T2);
		t_Bag_Bag_flatten_T2.setUnspecializedElement(t_Bag);
		t_Bag_Bag_flatten_T2.getTemplateBindings().add(tb_Bag_Bag_flatten_T2);
		t_Bag_Bag_flatten_T2.getSuperClasses().add(t_Collection_Bag_flatten_T2);
		pk_$$.getOwnedTypes().add(t_Bag_Bag_flatten_T2);
		//
		// ocl::$$::Bag
		//
		t_Bag_Bag_selectByKind_TT.setElementType(t_Bag_selectByKind_TT);
		t_Bag_Bag_selectByKind_TT.setUnspecializedElement(t_Bag);
		t_Bag_Bag_selectByKind_TT.getTemplateBindings().add(tb_Bag_Bag_selectByKind_TT);
		t_Bag_Bag_selectByKind_TT.getSuperClasses().add(t_Collection_Bag_selectByKind_TT);
		pk_$$.getOwnedTypes().add(t_Bag_Bag_selectByKind_TT);
		//
		// ocl::$$::Bag
		//
		t_Bag_Bag_selectByType_TT.setElementType(t_Bag_selectByType_TT);
		t_Bag_Bag_selectByType_TT.setUnspecializedElement(t_Bag);
		t_Bag_Bag_selectByType_TT.getTemplateBindings().add(tb_Bag_Bag_selectByType_TT);
		t_Bag_Bag_selectByType_TT.getSuperClasses().add(t_Collection_Bag_selectByType_TT);
		pk_$$.getOwnedTypes().add(t_Bag_Bag_selectByType_TT);
		//
		// ocl::$$::Bag
		//
		t_Bag_Bag_T.setElementType(t_Bag_T);
		t_Bag_Bag_T.setUnspecializedElement(t_Bag);
		t_Bag_Bag_T.getTemplateBindings().add(tb_Bag_Bag_T);
		t_Bag_Bag_T.getSuperClasses().add(t_Collection_Bag_T);
		pk_$$.getOwnedTypes().add(t_Bag_Bag_T);
		//
		// ocl::$$::Bag
		//
		t_Bag_Bag_T_1.setElementType(t_Bag_T);
		t_Bag_Bag_T_1.setUnspecializedElement(t_Bag);
		t_Bag_Bag_T_1.getTemplateBindings().add(tb_Bag_Bag_T_1);
		t_Bag_Bag_T_1.getSuperClasses().add(t_Collection_Bag_T);
		pk_$$.getOwnedTypes().add(t_Bag_Bag_T_1);
		//
		// ocl::$$::Bag
		//
		t_Bag_Bag_T_2.setElementType(t_Bag_T);
		t_Bag_Bag_T_2.setUnspecializedElement(t_Bag);
		t_Bag_Bag_T_2.getTemplateBindings().add(tb_Bag_Bag_T_2);
		t_Bag_Bag_T_2.getSuperClasses().add(t_Collection_Bag_T);
		pk_$$.getOwnedTypes().add(t_Bag_Bag_T_2);
		//
		// ocl::$$::Bag
		//
		t_Bag_Bag_T_3.setElementType(t_Bag_T);
		t_Bag_Bag_T_3.setUnspecializedElement(t_Bag);
		t_Bag_Bag_T_3.getTemplateBindings().add(tb_Bag_Bag_T_3);
		t_Bag_Bag_T_3.getSuperClasses().add(t_Collection_Bag_T);
		pk_$$.getOwnedTypes().add(t_Bag_Bag_T_3);
		//
		// ocl::$$::Bag
		//
		t_Bag_Collection_T.setElementType(t_Collection_T);
		t_Bag_Collection_T.setUnspecializedElement(t_Bag);
		t_Bag_Collection_T.getTemplateBindings().add(tb_Bag_Collection_T);
		t_Bag_Collection_T.getSuperClasses().add(t_Collection_Collection_T);
		pk_$$.getOwnedTypes().add(t_Bag_Collection_T);
		//
		// ocl::$$::Bag
		//
		t_Bag_OclElement.setElementType(t_OclElement);
		t_Bag_OclElement.setUnspecializedElement(t_Bag);
		t_Bag_OclElement.getTemplateBindings().add(tb_Bag_OclElement);
		t_Bag_OclElement.getSuperClasses().add(t_Collection_OclElement);
		pk_$$.getOwnedTypes().add(t_Bag_OclElement);
		//
		// ocl::$$::Bag
		//
		t_Bag_OclSelf.setElementType(t_OclSelf);
		t_Bag_OclSelf.setUnspecializedElement(t_Bag);
		t_Bag_OclSelf.getTemplateBindings().add(tb_Bag_OclSelf_2);
		t_Bag_OclSelf.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_Bag_OclSelf);
		//
		// ocl::$$::Bag
		//
		t_Bag_OclSelf_1.setElementType(t_OclSelf);
		t_Bag_OclSelf_1.setUnspecializedElement(t_Bag);
		t_Bag_OclSelf_1.getTemplateBindings().add(tb_Bag_OclSelf_3);
		t_Bag_OclSelf_1.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_Bag_OclSelf_1);
		//
		// ocl::$$::Bag
		//
		t_Bag_OclSelf_2.setElementType(t_OclSelf);
		t_Bag_OclSelf_2.setUnspecializedElement(t_Bag);
		t_Bag_OclSelf_2.getTemplateBindings().add(tb_Bag_OclSelf_4);
		t_Bag_OclSelf_2.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_Bag_OclSelf_2);
		//
		// ocl::$$::Bag
		//
		t_Bag_OclSelf_3.setElementType(t_OclSelf);
		t_Bag_OclSelf_3.setUnspecializedElement(t_Bag);
		t_Bag_OclSelf_3.getTemplateBindings().add(tb_Bag_OclSelf_1);
		t_Bag_OclSelf_3.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_Bag_OclSelf_3);
		//
		// ocl::$$::Bag
		//
		t_Bag_OclSelf_4.setElementType(t_OclSelf);
		t_Bag_OclSelf_4.setUnspecializedElement(t_Bag);
		t_Bag_OclSelf_4.getTemplateBindings().add(tb_Bag_OclSelf);
		t_Bag_OclSelf_4.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_Bag_OclSelf_4);
		//
		// ocl::$$::Bag
		//
		t_Bag_OclSelf_5.setElementType(t_OclSelf);
		t_Bag_OclSelf_5.setUnspecializedElement(t_Bag);
		t_Bag_OclSelf_5.getTemplateBindings().add(tb_Bag_OclSelf_5);
		t_Bag_OclSelf_5.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_Bag_OclSelf_5);
		//
		// ocl::$$::Bag
		//
		t_Bag_Sequence_T.setElementType(t_Sequence_T);
		t_Bag_Sequence_T.setUnspecializedElement(t_Bag);
		t_Bag_Sequence_T.getTemplateBindings().add(tb_Bag_Sequence_T);
		t_Bag_Sequence_T.getSuperClasses().add(t_Collection_Sequence_T_1);
		pk_$$.getOwnedTypes().add(t_Bag_Sequence_T);
		//
		// ocl::$$::Bag
		//
		t_Bag_Set_flatten_T2.setElementType(t_Set_flatten_T2);
		t_Bag_Set_flatten_T2.setUnspecializedElement(t_Bag);
		t_Bag_Set_flatten_T2.getTemplateBindings().add(tb_Bag_Set_flatten_T2);
		t_Bag_Set_flatten_T2.getSuperClasses().add(t_Collection_Set_flatten_T2);
		pk_$$.getOwnedTypes().add(t_Bag_Set_flatten_T2);
		//
		// ocl::$$::Bag
		//
		t_Bag_Set_selectByKind_TT.setElementType(t_Set_selectByKind_TT);
		t_Bag_Set_selectByKind_TT.setUnspecializedElement(t_Bag);
		t_Bag_Set_selectByKind_TT.getTemplateBindings().add(tb_Bag_Set_selectByKind_TT);
		t_Bag_Set_selectByKind_TT.getSuperClasses().add(t_Collection_Set_selectByKind_TT);
		pk_$$.getOwnedTypes().add(t_Bag_Set_selectByKind_TT);
		//
		// ocl::$$::Bag
		//
		t_Bag_Set_selectByType_TT.setElementType(t_Set_selectByType_TT);
		t_Bag_Set_selectByType_TT.setUnspecializedElement(t_Bag);
		t_Bag_Set_selectByType_TT.getTemplateBindings().add(tb_Bag_Set_selectByType_TT);
		t_Bag_Set_selectByType_TT.getSuperClasses().add(t_Collection_Set_selectByType_TT);
		pk_$$.getOwnedTypes().add(t_Bag_Set_selectByType_TT);
		//
		// ocl::$$::Bag
		//
		t_Bag_Set_T.setElementType(t_Set_T);
		t_Bag_Set_T.setUnspecializedElement(t_Bag);
		t_Bag_Set_T.getTemplateBindings().add(tb_Bag_Set_T);
		t_Bag_Set_T.getSuperClasses().add(t_Collection_Set_T_1);
		pk_$$.getOwnedTypes().add(t_Bag_Set_T);
		//
		// ocl::$$::Bag
		//
		t_Bag_UniqueCollection_T.setElementType(t_UniqueCollection_T);
		t_Bag_UniqueCollection_T.setUnspecializedElement(t_Bag);
		t_Bag_UniqueCollection_T.getTemplateBindings().add(tb_Bag_UniqueCollection_T_1);
		t_Bag_UniqueCollection_T.getSuperClasses().add(t_Collection_UniqueCollection_T);
		pk_$$.getOwnedTypes().add(t_Bag_UniqueCollection_T);
		//
		// ocl::$$::Bag
		//
		t_Bag_UniqueCollection_T_1.setElementType(t_UniqueCollection_T);
		t_Bag_UniqueCollection_T_1.setUnspecializedElement(t_Bag);
		t_Bag_UniqueCollection_T_1.getTemplateBindings().add(tb_Bag_UniqueCollection_T);
		t_Bag_UniqueCollection_T_1.getSuperClasses().add(t_Collection_UniqueCollection_T);
		pk_$$.getOwnedTypes().add(t_Bag_UniqueCollection_T_1);
		//
		// ocl::$$::ClassClassifier
		//
		t_ClassClassifier_OclInvalid.setInstanceType(t_OclInvalid);
		t_ClassClassifier_OclInvalid.setUnspecializedElement(t_ClassClassifier);
		t_ClassClassifier_OclInvalid.getTemplateBindings().add(tb_ClassClassifier_OclInvalid);
		t_ClassClassifier_OclInvalid.getSuperClasses().add(t_AnyClassifier_OclInvalid);
		pk_$$.getOwnedTypes().add(t_ClassClassifier_OclInvalid);
		//
		// ocl::$$::ClassClassifier
		//
		t_ClassClassifier_OclSelf.setInstanceType(t_OclSelf);
		t_ClassClassifier_OclSelf.setUnspecializedElement(t_ClassClassifier);
		t_ClassClassifier_OclSelf.getTemplateBindings().add(tb_ClassClassifier_OclSelf);
		t_ClassClassifier_OclSelf.getSuperClasses().add(t_AnyClassifier_OclSelf);
		pk_$$.getOwnedTypes().add(t_ClassClassifier_OclSelf);
		//
		// ocl::$$::ClassClassifier
		//
		t_ClassClassifier_OclVoid.setInstanceType(t_OclVoid);
		t_ClassClassifier_OclVoid.setUnspecializedElement(t_ClassClassifier);
		t_ClassClassifier_OclVoid.getTemplateBindings().add(tb_ClassClassifier_OclVoid);
		t_ClassClassifier_OclVoid.getSuperClasses().add(t_AnyClassifier_OclVoid);
		pk_$$.getOwnedTypes().add(t_ClassClassifier_OclVoid);
		//
		// ocl::$$::CollectionClassifier
		//
		t_CollectionClassifier_Collection_T_OclSelf.setInstanceType(t_OclSelf);
		t_CollectionClassifier_Collection_T_OclSelf.setUnspecializedElement(t_CollectionClassifier);
		t_CollectionClassifier_Collection_T_OclSelf.getTemplateBindings().add(tb_CollectionClassifier_Collection_T_OclSelf);
		t_CollectionClassifier_Collection_T_OclSelf.getSuperClasses().add(t_AnyClassifier_OclSelf);
		pk_$$.getOwnedTypes().add(t_CollectionClassifier_Collection_T_OclSelf);
		//
		// ocl::$$::Collection
		//
		t_Collection_Integer.setElementType(t_Integer);
		t_Collection_Integer.setUnspecializedElement(t_Collection);
		t_Collection_Integer.getTemplateBindings().add(tb_Collection_Integer);
		t_Collection_Integer.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Integer);
		//
		// ocl::$$::Collection
		//
		t_Collection_String.setElementType(t_String);
		t_Collection_String.setUnspecializedElement(t_Collection);
		t_Collection_String.getTemplateBindings().add(tb_Collection_String);
		t_Collection_String.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_String);
		//
		// ocl::$$::Collection
		//
		t_Collection_Tuple.setElementType(t_Tuple_3);
		t_Collection_Tuple.setUnspecializedElement(t_Collection);
		t_Collection_Tuple.getTemplateBindings().add(tb_Collection_Tuple);
		t_Collection_Tuple.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Tuple);
		//
		// ocl::$$::Collection
		//
		t_Collection_Tuple_1.setElementType(t_Tuple_3);
		t_Collection_Tuple_1.setUnspecializedElement(t_Collection);
		t_Collection_Tuple_1.getTemplateBindings().add(tb_Collection_Tuple_1);
		t_Collection_Tuple_1.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Tuple_1);
		//
		// ocl::$$::Collection
		//
		t_Collection_Bag_collect_V.setElementType(t_Bag_collect_V);
		t_Collection_Bag_collect_V.setUnspecializedElement(t_Collection);
		t_Collection_Bag_collect_V.getTemplateBindings().add(tb_Collection_Bag_collect_V);
		t_Collection_Bag_collect_V.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Bag_collect_V);
		//
		// ocl::$$::Collection
		//
		t_Collection_Bag_flatten_T2.setElementType(t_Bag_flatten_T2);
		t_Collection_Bag_flatten_T2.setUnspecializedElement(t_Collection);
		t_Collection_Bag_flatten_T2.getTemplateBindings().add(tb_Collection_Bag_flatten_T2);
		t_Collection_Bag_flatten_T2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Bag_flatten_T2);
		//
		// ocl::$$::Collection
		//
		t_Collection_Bag_selectByKind_TT.setElementType(t_Bag_selectByKind_TT);
		t_Collection_Bag_selectByKind_TT.setUnspecializedElement(t_Collection);
		t_Collection_Bag_selectByKind_TT.getTemplateBindings().add(tb_Collection_Bag_selectByKind_TT);
		t_Collection_Bag_selectByKind_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Bag_selectByKind_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_Bag_selectByType_TT.setElementType(t_Bag_selectByType_TT);
		t_Collection_Bag_selectByType_TT.setUnspecializedElement(t_Collection);
		t_Collection_Bag_selectByType_TT.getTemplateBindings().add(tb_Collection_Bag_selectByType_TT);
		t_Collection_Bag_selectByType_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Bag_selectByType_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_Bag_T.setElementType(t_Bag_T);
		t_Collection_Bag_T.setUnspecializedElement(t_Collection);
		t_Collection_Bag_T.getTemplateBindings().add(tb_Collection_Bag_T_1);
		t_Collection_Bag_T.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Bag_T);
		//
		// ocl::$$::Collection
		//
		t_Collection_Bag_T_1.setElementType(t_Bag_T);
		t_Collection_Bag_T_1.setUnspecializedElement(t_Collection);
		t_Collection_Bag_T_1.getTemplateBindings().add(tb_Collection_Bag_T);
		t_Collection_Bag_T_1.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Bag_T_1);
		//
		// ocl::$$::Collection
		//
		t_Collection_Bag_T_2.setElementType(t_Bag_T);
		t_Collection_Bag_T_2.setUnspecializedElement(t_Collection);
		t_Collection_Bag_T_2.getTemplateBindings().add(tb_Collection_Bag_T_2);
		t_Collection_Bag_T_2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Bag_T_2);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_collect_V.setElementType(t_Collection_collect_V);
		t_Collection_Collection_collect_V.setUnspecializedElement(t_Collection);
		t_Collection_Collection_collect_V.getTemplateBindings().add(tb_Collection_Collection_collect_V);
		t_Collection_Collection_collect_V.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_collect_V);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_excludesAll_T2.setElementType(t_Collection_excludesAll_T2);
		t_Collection_Collection_excludesAll_T2.setUnspecializedElement(t_Collection);
		t_Collection_Collection_excludesAll_T2.getTemplateBindings().add(tb_Collection_Collection_excludesAll_T2);
		t_Collection_Collection_excludesAll_T2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_excludesAll_T2);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_flatten_T2.setElementType(t_Collection_flatten_T2);
		t_Collection_Collection_flatten_T2.setUnspecializedElement(t_Collection);
		t_Collection_Collection_flatten_T2.getTemplateBindings().add(tb_Collection_Collection_flatten_T2);
		t_Collection_Collection_flatten_T2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_flatten_T2);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_includesAll_T2.setElementType(t_Collection_includesAll_T2);
		t_Collection_Collection_includesAll_T2.setUnspecializedElement(t_Collection);
		t_Collection_Collection_includesAll_T2.getTemplateBindings().add(tb_Collection_Collection_includesAll_T2);
		t_Collection_Collection_includesAll_T2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_includesAll_T2);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_product_T2.setElementType(t_Collection_product_T2);
		t_Collection_Collection_product_T2.setUnspecializedElement(t_Collection);
		t_Collection_Collection_product_T2.getTemplateBindings().add(tb_Collection_Collection_product_T2);
		t_Collection_Collection_product_T2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_product_T2);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_selectByKind_TT.setElementType(t_Collection_selectByKind_TT);
		t_Collection_Collection_selectByKind_TT.setUnspecializedElement(t_Collection);
		t_Collection_Collection_selectByKind_TT.getTemplateBindings().add(tb_Collection_Collection_selectByKind_TT);
		t_Collection_Collection_selectByKind_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_selectByKind_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_selectByType_TT.setElementType(t_Collection_selectByType_TT);
		t_Collection_Collection_selectByType_TT.setUnspecializedElement(t_Collection);
		t_Collection_Collection_selectByType_TT.getTemplateBindings().add(tb_Collection_Collection_selectByType_TT);
		t_Collection_Collection_selectByType_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_selectByType_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_T.setElementType(t_Collection_T);
		t_Collection_Collection_T.setUnspecializedElement(t_Collection);
		t_Collection_Collection_T.getTemplateBindings().add(tb_Collection_Collection_T_2);
		t_Collection_Collection_T.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_T);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_T_1.setElementType(t_Collection_T);
		t_Collection_Collection_T_1.setUnspecializedElement(t_Collection);
		t_Collection_Collection_T_1.getTemplateBindings().add(tb_Collection_Collection_T);
		t_Collection_Collection_T_1.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_T_1);
		//
		// ocl::$$::Collection
		//
		t_Collection_Collection_T_2.setElementType(t_Collection_T);
		t_Collection_Collection_T_2.setUnspecializedElement(t_Collection);
		t_Collection_Collection_T_2.getTemplateBindings().add(tb_Collection_Collection_T_1);
		t_Collection_Collection_T_2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Collection_T_2);
		//
		// ocl::$$::Collection
		//
		t_Collection_EnumerationLiteral.setElementType(t_EnumerationLiteral);
		t_Collection_EnumerationLiteral.setUnspecializedElement(t_Collection);
		t_Collection_EnumerationLiteral.getTemplateBindings().add(tb_Collection_EnumerationLiteral);
		t_Collection_EnumerationLiteral.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_EnumerationLiteral);
		//
		// ocl::$$::Collection
		//
		t_Collection_OclAny.setElementType(t_OclAny);
		t_Collection_OclAny.setUnspecializedElement(t_Collection);
		t_Collection_OclAny.getTemplateBindings().add(tb_Collection_OclAny);
		t_Collection_OclAny.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OclAny);
		//
		// ocl::$$::Collection
		//
		t_Collection_OclAny_1.setElementType(t_OclAny);
		t_Collection_OclAny_1.setUnspecializedElement(t_Collection);
		t_Collection_OclAny_1.getTemplateBindings().add(tb_Collection_OclAny_2);
		t_Collection_OclAny_1.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OclAny_1);
		//
		// ocl::$$::Collection
		//
		t_Collection_OclAny_2.setElementType(t_OclAny);
		t_Collection_OclAny_2.setUnspecializedElement(t_Collection);
		t_Collection_OclAny_2.getTemplateBindings().add(tb_Collection_OclAny_3);
		t_Collection_OclAny_2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OclAny_2);
		//
		// ocl::$$::Collection
		//
		t_Collection_OclAny_3.setElementType(t_OclAny);
		t_Collection_OclAny_3.setUnspecializedElement(t_Collection);
		t_Collection_OclAny_3.getTemplateBindings().add(tb_Collection_OclAny_1);
		t_Collection_OclAny_3.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OclAny_3);
		//
		// ocl::$$::Collection
		//
		t_Collection_OclElement.setElementType(t_OclElement);
		t_Collection_OclElement.setUnspecializedElement(t_Collection);
		t_Collection_OclElement.getTemplateBindings().add(tb_Collection_OclElement);
		t_Collection_OclElement.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OclElement);
		//
		// ocl::$$::Collection
		//
		t_Collection_OclSelf.setElementType(t_OclSelf);
		t_Collection_OclSelf.setUnspecializedElement(t_Collection);
		t_Collection_OclSelf.getTemplateBindings().add(tb_Collection_OclSelf);
		t_Collection_OclSelf.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OclSelf);
		//
		// ocl::$$::Collection
		//
		t_Collection_OrderedSet_flatten_T2.setElementType(t_OrderedSet_flatten_T2);
		t_Collection_OrderedSet_flatten_T2.setUnspecializedElement(t_Collection);
		t_Collection_OrderedSet_flatten_T2.getTemplateBindings().add(tb_Collection_OrderedSet_flatten_T2);
		t_Collection_OrderedSet_flatten_T2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OrderedSet_flatten_T2);
		//
		// ocl::$$::Collection
		//
		t_Collection_OrderedSet_selectByKind_TT.setElementType(t_OrderedSet_selectByKind_TT);
		t_Collection_OrderedSet_selectByKind_TT.setUnspecializedElement(t_Collection);
		t_Collection_OrderedSet_selectByKind_TT.getTemplateBindings().add(tb_Collection_OrderedSet_selectByKind_TT);
		t_Collection_OrderedSet_selectByKind_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OrderedSet_selectByKind_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_OrderedSet_selectByType_TT.setElementType(t_OrderedSet_selectByType_TT);
		t_Collection_OrderedSet_selectByType_TT.setUnspecializedElement(t_Collection);
		t_Collection_OrderedSet_selectByType_TT.getTemplateBindings().add(tb_Collection_OrderedSet_selectByType_TT);
		t_Collection_OrderedSet_selectByType_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OrderedSet_selectByType_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_OrderedSet_T.setElementType(t_OrderedSet_T);
		t_Collection_OrderedSet_T.setUnspecializedElement(t_Collection);
		t_Collection_OrderedSet_T.getTemplateBindings().add(tb_Collection_OrderedSet_T_1);
		t_Collection_OrderedSet_T.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OrderedSet_T);
		//
		// ocl::$$::Collection
		//
		t_Collection_OrderedSet_T_1.setElementType(t_OrderedSet_T);
		t_Collection_OrderedSet_T_1.setUnspecializedElement(t_Collection);
		t_Collection_OrderedSet_T_1.getTemplateBindings().add(tb_Collection_OrderedSet_T);
		t_Collection_OrderedSet_T_1.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_OrderedSet_T_1);
		//
		// ocl::$$::Collection
		//
		t_Collection_Sequence_collect_V.setElementType(t_Sequence_collect_V);
		t_Collection_Sequence_collect_V.setUnspecializedElement(t_Collection);
		t_Collection_Sequence_collect_V.getTemplateBindings().add(tb_Collection_Sequence_collect_V);
		t_Collection_Sequence_collect_V.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Sequence_collect_V);
		//
		// ocl::$$::Collection
		//
		t_Collection_Sequence_flatten_T2.setElementType(t_Sequence_flatten_T2);
		t_Collection_Sequence_flatten_T2.setUnspecializedElement(t_Collection);
		t_Collection_Sequence_flatten_T2.getTemplateBindings().add(tb_Collection_Sequence_flatten_T2);
		t_Collection_Sequence_flatten_T2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Sequence_flatten_T2);
		//
		// ocl::$$::Collection
		//
		t_Collection_Sequence_selectByKind_TT.setElementType(t_Sequence_selectByKind_TT);
		t_Collection_Sequence_selectByKind_TT.setUnspecializedElement(t_Collection);
		t_Collection_Sequence_selectByKind_TT.getTemplateBindings().add(tb_Collection_Sequence_selectByKind_TT);
		t_Collection_Sequence_selectByKind_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Sequence_selectByKind_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_Sequence_selectByType_TT.setElementType(t_Sequence_selectByType_TT);
		t_Collection_Sequence_selectByType_TT.setUnspecializedElement(t_Collection);
		t_Collection_Sequence_selectByType_TT.getTemplateBindings().add(tb_Collection_Sequence_selectByType_TT);
		t_Collection_Sequence_selectByType_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Sequence_selectByType_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_Sequence_T.setElementType(t_Sequence_T);
		t_Collection_Sequence_T.setUnspecializedElement(t_Collection);
		t_Collection_Sequence_T.getTemplateBindings().add(tb_Collection_Sequence_T);
		t_Collection_Sequence_T.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Sequence_T);
		//
		// ocl::$$::Collection
		//
		t_Collection_Sequence_T_1.setElementType(t_Sequence_T);
		t_Collection_Sequence_T_1.setUnspecializedElement(t_Collection);
		t_Collection_Sequence_T_1.getTemplateBindings().add(tb_Collection_Sequence_T_1);
		t_Collection_Sequence_T_1.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Sequence_T_1);
		//
		// ocl::$$::Collection
		//
		t_Collection_Set_flatten_T2.setElementType(t_Set_flatten_T2);
		t_Collection_Set_flatten_T2.setUnspecializedElement(t_Collection);
		t_Collection_Set_flatten_T2.getTemplateBindings().add(tb_Collection_Set_flatten_T2);
		t_Collection_Set_flatten_T2.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Set_flatten_T2);
		//
		// ocl::$$::Collection
		//
		t_Collection_Set_selectByKind_TT.setElementType(t_Set_selectByKind_TT);
		t_Collection_Set_selectByKind_TT.setUnspecializedElement(t_Collection);
		t_Collection_Set_selectByKind_TT.getTemplateBindings().add(tb_Collection_Set_selectByKind_TT);
		t_Collection_Set_selectByKind_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Set_selectByKind_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_Set_selectByType_TT.setElementType(t_Set_selectByType_TT);
		t_Collection_Set_selectByType_TT.setUnspecializedElement(t_Collection);
		t_Collection_Set_selectByType_TT.getTemplateBindings().add(tb_Collection_Set_selectByType_TT);
		t_Collection_Set_selectByType_TT.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Set_selectByType_TT);
		//
		// ocl::$$::Collection
		//
		t_Collection_Set_T.setElementType(t_Set_T);
		t_Collection_Set_T.setUnspecializedElement(t_Collection);
		t_Collection_Set_T.getTemplateBindings().add(tb_Collection_Set_T_1);
		t_Collection_Set_T.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Set_T);
		//
		// ocl::$$::Collection
		//
		t_Collection_Set_T_1.setElementType(t_Set_T);
		t_Collection_Set_T_1.setUnspecializedElement(t_Collection);
		t_Collection_Set_T_1.getTemplateBindings().add(tb_Collection_Set_T);
		t_Collection_Set_T_1.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_Set_T_1);
		//
		// ocl::$$::Collection
		//
		t_Collection_UniqueCollection_T.setElementType(t_UniqueCollection_T);
		t_Collection_UniqueCollection_T.setUnspecializedElement(t_Collection);
		t_Collection_UniqueCollection_T.getTemplateBindings().add(tb_Collection_UniqueCollection_T);
		t_Collection_UniqueCollection_T.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_UniqueCollection_T);
		//
		// ocl::$$::Collection
		//
		t_Collection_UniqueCollection_T_1.setElementType(t_UniqueCollection_T);
		t_Collection_UniqueCollection_T_1.setUnspecializedElement(t_Collection);
		t_Collection_UniqueCollection_T_1.getTemplateBindings().add(tb_Collection_UniqueCollection_T_1);
		t_Collection_UniqueCollection_T_1.getSuperClasses().add(t_OclAny);
		pk_$$.getOwnedTypes().add(t_Collection_UniqueCollection_T_1);
		//
		// ocl::$$::EnumerationClassifier
		//
		t_EnumerationClassifier_OclSelf.setInstanceType(t_OclSelf);
		t_EnumerationClassifier_OclSelf.setUnspecializedElement(t_EnumerationClassifier);
		t_EnumerationClassifier_OclSelf.getTemplateBindings().add(tb_EnumerationClassifier_OclSelf);
		t_EnumerationClassifier_OclSelf.getSuperClasses().add(t_AnyClassifier_OclSelf);
		pk_$$.getOwnedTypes().add(t_EnumerationClassifier_OclSelf);
		//
		// ocl::$$::OrderedSet
		//
		t_OrderedSet_Collection_T.setElementType(t_Collection_T);
		t_OrderedSet_Collection_T.setUnspecializedElement(t_OrderedSet);
		t_OrderedSet_Collection_T.getTemplateBindings().add(tb_OrderedSet_Collection_T);
		t_OrderedSet_Collection_T.getSuperClasses().add(t_Sequence_Collection_T);
		t_OrderedSet_Collection_T.getSuperClasses().add(t_UniqueCollection_Collection_T);
		pk_$$.getOwnedTypes().add(t_OrderedSet_Collection_T);
		//
		// ocl::$$::OrderedSet
		//
		t_OrderedSet_EnumerationLiteral.setElementType(t_EnumerationLiteral);
		t_OrderedSet_EnumerationLiteral.setUnspecializedElement(t_OrderedSet);
		t_OrderedSet_EnumerationLiteral.getTemplateBindings().add(tb_OrderedSet_EnumerationLiteral);
		t_OrderedSet_EnumerationLiteral.getSuperClasses().add(t_Sequence_EnumerationLiteral);
		t_OrderedSet_EnumerationLiteral.getSuperClasses().add(t_UniqueCollection_EnumerationLiteral);
		pk_$$.getOwnedTypes().add(t_OrderedSet_EnumerationLiteral);
		//
		// ocl::$$::OrderedSet
		//
		t_OrderedSet_OrderedSet_flatten_T2.setElementType(t_OrderedSet_flatten_T2);
		t_OrderedSet_OrderedSet_flatten_T2.setUnspecializedElement(t_OrderedSet);
		t_OrderedSet_OrderedSet_flatten_T2.getTemplateBindings().add(tb_OrderedSet_OrderedSet_flatten_T2);
		t_OrderedSet_OrderedSet_flatten_T2.getSuperClasses().add(t_Sequence_OrderedSet_flatten_T2);
		t_OrderedSet_OrderedSet_flatten_T2.getSuperClasses().add(t_UniqueCollection_OrderedSet_flatten_T2);
		pk_$$.getOwnedTypes().add(t_OrderedSet_OrderedSet_flatten_T2);
		//
		// ocl::$$::OrderedSet
		//
		t_OrderedSet_OrderedSet_selectByKind_TT.setElementType(t_OrderedSet_selectByKind_TT);
		t_OrderedSet_OrderedSet_selectByKind_TT.setUnspecializedElement(t_OrderedSet);
		t_OrderedSet_OrderedSet_selectByKind_TT.getTemplateBindings().add(tb_OrderedSet_OrderedSet_selectByKind_TT);
		t_OrderedSet_OrderedSet_selectByKind_TT.getSuperClasses().add(t_Sequence_OrderedSet_selectByKind_TT);
		t_OrderedSet_OrderedSet_selectByKind_TT.getSuperClasses().add(t_UniqueCollection_OrderedSet_selectByKind_TT);
		pk_$$.getOwnedTypes().add(t_OrderedSet_OrderedSet_selectByKind_TT);
		//
		// ocl::$$::OrderedSet
		//
		t_OrderedSet_OrderedSet_selectByType_TT.setElementType(t_OrderedSet_selectByType_TT);
		t_OrderedSet_OrderedSet_selectByType_TT.setUnspecializedElement(t_OrderedSet);
		t_OrderedSet_OrderedSet_selectByType_TT.getTemplateBindings().add(tb_OrderedSet_OrderedSet_selectByType_TT);
		t_OrderedSet_OrderedSet_selectByType_TT.getSuperClasses().add(t_Sequence_OrderedSet_selectByType_TT);
		t_OrderedSet_OrderedSet_selectByType_TT.getSuperClasses().add(t_UniqueCollection_OrderedSet_selectByType_TT);
		pk_$$.getOwnedTypes().add(t_OrderedSet_OrderedSet_selectByType_TT);
		//
		// ocl::$$::OrderedSet
		//
		t_OrderedSet_Sequence_T.setElementType(t_Sequence_T);
		t_OrderedSet_Sequence_T.setUnspecializedElement(t_OrderedSet);
		t_OrderedSet_Sequence_T.getTemplateBindings().add(tb_OrderedSet_Sequence_T);
		t_OrderedSet_Sequence_T.getSuperClasses().add(t_Sequence_Sequence_T_2);
		t_OrderedSet_Sequence_T.getSuperClasses().add(t_UniqueCollection_Sequence_T);
		pk_$$.getOwnedTypes().add(t_OrderedSet_Sequence_T);
		//
		// ocl::$$::OrderedSet
		//
		t_OrderedSet_Set_T.setElementType(t_Set_T);
		t_OrderedSet_Set_T.setUnspecializedElement(t_OrderedSet);
		t_OrderedSet_Set_T.getTemplateBindings().add(tb_OrderedSet_Set_T);
		t_OrderedSet_Set_T.getSuperClasses().add(t_Sequence_Set_T);
		t_OrderedSet_Set_T.getSuperClasses().add(t_UniqueCollection_Set_T);
		pk_$$.getOwnedTypes().add(t_OrderedSet_Set_T);
		//
		// ocl::$$::OrderedSet
		//
		t_OrderedSet_UniqueCollection_T.setElementType(t_UniqueCollection_T);
		t_OrderedSet_UniqueCollection_T.setUnspecializedElement(t_OrderedSet);
		t_OrderedSet_UniqueCollection_T.getTemplateBindings().add(tb_OrderedSet_UniqueCollection_T);
		t_OrderedSet_UniqueCollection_T.getSuperClasses().add(t_Sequence_UniqueCollection_T);
		t_OrderedSet_UniqueCollection_T.getSuperClasses().add(t_UniqueCollection_UniqueCollection_T);
		pk_$$.getOwnedTypes().add(t_OrderedSet_UniqueCollection_T);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Integer.setElementType(t_Integer);
		t_Sequence_Integer.setUnspecializedElement(t_Sequence);
		t_Sequence_Integer.getTemplateBindings().add(tb_Sequence_Integer);
		t_Sequence_Integer.getSuperClasses().add(t_Collection_Integer);
		pk_$$.getOwnedTypes().add(t_Sequence_Integer);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_String.setElementType(t_String);
		t_Sequence_String.setUnspecializedElement(t_Sequence);
		t_Sequence_String.getTemplateBindings().add(tb_Sequence_String);
		t_Sequence_String.getSuperClasses().add(t_Collection_String);
		pk_$$.getOwnedTypes().add(t_Sequence_String);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Bag_T.setElementType(t_Bag_T);
		t_Sequence_Bag_T.setUnspecializedElement(t_Sequence);
		t_Sequence_Bag_T.getTemplateBindings().add(tb_Sequence_Bag_T);
		t_Sequence_Bag_T.getSuperClasses().add(t_Collection_Bag_T);
		pk_$$.getOwnedTypes().add(t_Sequence_Bag_T);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Collection_T.setElementType(t_Collection_T);
		t_Sequence_Collection_T.setUnspecializedElement(t_Sequence);
		t_Sequence_Collection_T.getTemplateBindings().add(tb_Sequence_Collection_T);
		t_Sequence_Collection_T.getSuperClasses().add(t_Collection_Collection_T_1);
		pk_$$.getOwnedTypes().add(t_Sequence_Collection_T);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_EnumerationLiteral.setElementType(t_EnumerationLiteral);
		t_Sequence_EnumerationLiteral.setUnspecializedElement(t_Sequence);
		t_Sequence_EnumerationLiteral.getTemplateBindings().add(tb_Sequence_EnumerationLiteral);
		t_Sequence_EnumerationLiteral.getSuperClasses().add(t_Collection_EnumerationLiteral);
		pk_$$.getOwnedTypes().add(t_Sequence_EnumerationLiteral);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_OrderedSet_flatten_T2.setElementType(t_OrderedSet_flatten_T2);
		t_Sequence_OrderedSet_flatten_T2.setUnspecializedElement(t_Sequence);
		t_Sequence_OrderedSet_flatten_T2.getTemplateBindings().add(tb_Sequence_OrderedSet_flatten_T2);
		t_Sequence_OrderedSet_flatten_T2.getSuperClasses().add(t_Collection_OrderedSet_flatten_T2);
		pk_$$.getOwnedTypes().add(t_Sequence_OrderedSet_flatten_T2);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_OrderedSet_selectByKind_TT.setElementType(t_OrderedSet_selectByKind_TT);
		t_Sequence_OrderedSet_selectByKind_TT.setUnspecializedElement(t_Sequence);
		t_Sequence_OrderedSet_selectByKind_TT.getTemplateBindings().add(tb_Sequence_OrderedSet_selectByKind_TT);
		t_Sequence_OrderedSet_selectByKind_TT.getSuperClasses().add(t_Collection_OrderedSet_selectByKind_TT);
		pk_$$.getOwnedTypes().add(t_Sequence_OrderedSet_selectByKind_TT);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_OrderedSet_selectByType_TT.setElementType(t_OrderedSet_selectByType_TT);
		t_Sequence_OrderedSet_selectByType_TT.setUnspecializedElement(t_Sequence);
		t_Sequence_OrderedSet_selectByType_TT.getTemplateBindings().add(tb_Sequence_OrderedSet_selectByType_TT);
		t_Sequence_OrderedSet_selectByType_TT.getSuperClasses().add(t_Collection_OrderedSet_selectByType_TT);
		pk_$$.getOwnedTypes().add(t_Sequence_OrderedSet_selectByType_TT);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_OrderedSet_T.setElementType(t_OrderedSet_T);
		t_Sequence_OrderedSet_T.setUnspecializedElement(t_Sequence);
		t_Sequence_OrderedSet_T.getTemplateBindings().add(tb_Sequence_OrderedSet_T);
		t_Sequence_OrderedSet_T.getSuperClasses().add(t_Collection_OrderedSet_T);
		pk_$$.getOwnedTypes().add(t_Sequence_OrderedSet_T);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Sequence_collect_V.setElementType(t_Sequence_collect_V);
		t_Sequence_Sequence_collect_V.setUnspecializedElement(t_Sequence);
		t_Sequence_Sequence_collect_V.getTemplateBindings().add(tb_Sequence_Sequence_collect_V);
		t_Sequence_Sequence_collect_V.getSuperClasses().add(t_Collection_Sequence_collect_V);
		pk_$$.getOwnedTypes().add(t_Sequence_Sequence_collect_V);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Sequence_flatten_T2.setElementType(t_Sequence_flatten_T2);
		t_Sequence_Sequence_flatten_T2.setUnspecializedElement(t_Sequence);
		t_Sequence_Sequence_flatten_T2.getTemplateBindings().add(tb_Sequence_Sequence_flatten_T2);
		t_Sequence_Sequence_flatten_T2.getSuperClasses().add(t_Collection_Sequence_flatten_T2);
		pk_$$.getOwnedTypes().add(t_Sequence_Sequence_flatten_T2);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Sequence_selectByKind_TT.setElementType(t_Sequence_selectByKind_TT);
		t_Sequence_Sequence_selectByKind_TT.setUnspecializedElement(t_Sequence);
		t_Sequence_Sequence_selectByKind_TT.getTemplateBindings().add(tb_Sequence_Sequence_selectByKind_TT);
		t_Sequence_Sequence_selectByKind_TT.getSuperClasses().add(t_Collection_Sequence_selectByKind_TT);
		pk_$$.getOwnedTypes().add(t_Sequence_Sequence_selectByKind_TT);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Sequence_selectByType_TT.setElementType(t_Sequence_selectByType_TT);
		t_Sequence_Sequence_selectByType_TT.setUnspecializedElement(t_Sequence);
		t_Sequence_Sequence_selectByType_TT.getTemplateBindings().add(tb_Sequence_Sequence_selectByType_TT);
		t_Sequence_Sequence_selectByType_TT.getSuperClasses().add(t_Collection_Sequence_selectByType_TT);
		pk_$$.getOwnedTypes().add(t_Sequence_Sequence_selectByType_TT);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Sequence_T.setElementType(t_Sequence_T);
		t_Sequence_Sequence_T.setUnspecializedElement(t_Sequence);
		t_Sequence_Sequence_T.getTemplateBindings().add(tb_Sequence_Sequence_T_1);
		t_Sequence_Sequence_T.getSuperClasses().add(t_Collection_Sequence_T_1);
		pk_$$.getOwnedTypes().add(t_Sequence_Sequence_T);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Sequence_T_1.setElementType(t_Sequence_T);
		t_Sequence_Sequence_T_1.setUnspecializedElement(t_Sequence);
		t_Sequence_Sequence_T_1.getTemplateBindings().add(tb_Sequence_Sequence_T_2);
		t_Sequence_Sequence_T_1.getSuperClasses().add(t_Collection_Sequence_T_1);
		pk_$$.getOwnedTypes().add(t_Sequence_Sequence_T_1);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Sequence_T_2.setElementType(t_Sequence_T);
		t_Sequence_Sequence_T_2.setUnspecializedElement(t_Sequence);
		t_Sequence_Sequence_T_2.getTemplateBindings().add(tb_Sequence_Sequence_T);
		t_Sequence_Sequence_T_2.getSuperClasses().add(t_Collection_Sequence_T_1);
		pk_$$.getOwnedTypes().add(t_Sequence_Sequence_T_2);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_Set_T.setElementType(t_Set_T);
		t_Sequence_Set_T.setUnspecializedElement(t_Sequence);
		t_Sequence_Set_T.getTemplateBindings().add(tb_Sequence_Set_T);
		t_Sequence_Set_T.getSuperClasses().add(t_Collection_Set_T_1);
		pk_$$.getOwnedTypes().add(t_Sequence_Set_T);
		//
		// ocl::$$::Sequence
		//
		t_Sequence_UniqueCollection_T.setElementType(t_UniqueCollection_T);
		t_Sequence_UniqueCollection_T.setUnspecializedElement(t_Sequence);
		t_Sequence_UniqueCollection_T.getTemplateBindings().add(tb_Sequence_UniqueCollection_T);
		t_Sequence_UniqueCollection_T.getSuperClasses().add(t_Collection_UniqueCollection_T);
		pk_$$.getOwnedTypes().add(t_Sequence_UniqueCollection_T);
		//
		// ocl::$$::Set
		//
		t_Set_Tuple.setElementType(t_Tuple_1);
		t_Set_Tuple.setUnspecializedElement(t_Set);
		t_Set_Tuple.getTemplateBindings().add(tb_Set_Tuple);
		t_Set_Tuple.getSuperClasses().add(t_Bag_Tuple_1);
		t_Set_Tuple.getSuperClasses().add(t_UniqueCollection_Tuple);
		pk_$$.getOwnedTypes().add(t_Set_Tuple);
		//
		// ocl::$$::Set
		//
		t_Set_Bag_T.setElementType(t_Bag_T);
		t_Set_Bag_T.setUnspecializedElement(t_Set);
		t_Set_Bag_T.getTemplateBindings().add(tb_Set_Bag_T);
		t_Set_Bag_T.getSuperClasses().add(t_Bag_Bag_T_2);
		t_Set_Bag_T.getSuperClasses().add(t_UniqueCollection_Bag_T_2);
		pk_$$.getOwnedTypes().add(t_Set_Bag_T);
		//
		// ocl::$$::Set
		//
		t_Set_Collection_T.setElementType(t_Collection_T);
		t_Set_Collection_T.setUnspecializedElement(t_Set);
		t_Set_Collection_T.getTemplateBindings().add(tb_Set_Collection_T);
		t_Set_Collection_T.getSuperClasses().add(t_Bag_Collection_T);
		t_Set_Collection_T.getSuperClasses().add(t_UniqueCollection_Collection_T);
		pk_$$.getOwnedTypes().add(t_Set_Collection_T);
		//
		// ocl::$$::Set
		//
		t_Set_OclElement.setElementType(t_OclElement);
		t_Set_OclElement.setUnspecializedElement(t_Set);
		t_Set_OclElement.getTemplateBindings().add(tb_Set_OclElement);
		t_Set_OclElement.getSuperClasses().add(t_Bag_OclElement);
		t_Set_OclElement.getSuperClasses().add(t_UniqueCollection_OclElement);
		pk_$$.getOwnedTypes().add(t_Set_OclElement);
		//
		// ocl::$$::Set
		//
		t_Set_OclSelf.setElementType(t_OclSelf);
		t_Set_OclSelf.setUnspecializedElement(t_Set);
		t_Set_OclSelf.getTemplateBindings().add(tb_Set_OclSelf);
		t_Set_OclSelf.getSuperClasses().add(t_Bag_OclSelf_3);
		t_Set_OclSelf.getSuperClasses().add(t_UniqueCollection_OclSelf_5);
		pk_$$.getOwnedTypes().add(t_Set_OclSelf);
		//
		// ocl::$$::Set
		//
		t_Set_Set_flatten_T2.setElementType(t_Set_flatten_T2);
		t_Set_Set_flatten_T2.setUnspecializedElement(t_Set);
		t_Set_Set_flatten_T2.getTemplateBindings().add(tb_Set_Set_flatten_T2);
		t_Set_Set_flatten_T2.getSuperClasses().add(t_Bag_Set_flatten_T2);
		t_Set_Set_flatten_T2.getSuperClasses().add(t_UniqueCollection_Set_flatten_T2);
		pk_$$.getOwnedTypes().add(t_Set_Set_flatten_T2);
		//
		// ocl::$$::Set
		//
		t_Set_Set_selectByKind_TT.setElementType(t_Set_selectByKind_TT);
		t_Set_Set_selectByKind_TT.setUnspecializedElement(t_Set);
		t_Set_Set_selectByKind_TT.getTemplateBindings().add(tb_Set_Set_selectByKind_TT);
		t_Set_Set_selectByKind_TT.getSuperClasses().add(t_Bag_Set_selectByKind_TT);
		t_Set_Set_selectByKind_TT.getSuperClasses().add(t_UniqueCollection_Set_selectByKind_TT);
		pk_$$.getOwnedTypes().add(t_Set_Set_selectByKind_TT);
		//
		// ocl::$$::Set
		//
		t_Set_Set_selectByType_TT.setElementType(t_Set_selectByType_TT);
		t_Set_Set_selectByType_TT.setUnspecializedElement(t_Set);
		t_Set_Set_selectByType_TT.getTemplateBindings().add(tb_Set_Set_selectByType_TT);
		t_Set_Set_selectByType_TT.getSuperClasses().add(t_Bag_Set_selectByType_TT);
		t_Set_Set_selectByType_TT.getSuperClasses().add(t_UniqueCollection_Set_selectByType_TT);
		pk_$$.getOwnedTypes().add(t_Set_Set_selectByType_TT);
		//
		// ocl::$$::Set
		//
		t_Set_UniqueCollection_T.setElementType(t_UniqueCollection_T);
		t_Set_UniqueCollection_T.setUnspecializedElement(t_Set);
		t_Set_UniqueCollection_T.getTemplateBindings().add(tb_Set_UniqueCollection_T);
		t_Set_UniqueCollection_T.getSuperClasses().add(t_Bag_UniqueCollection_T);
		t_Set_UniqueCollection_T.getSuperClasses().add(t_UniqueCollection_UniqueCollection_T_1);
		pk_$$.getOwnedTypes().add(t_Set_UniqueCollection_T);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Tuple.setElementType(t_Tuple_1);
		t_UniqueCollection_Tuple.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Tuple.getTemplateBindings().add(tb_UniqueCollection_Tuple_1);
		t_UniqueCollection_Tuple.getSuperClasses().add(t_Collection_Tuple);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Tuple);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Tuple_1.setElementType(t_Tuple_1);
		t_UniqueCollection_Tuple_1.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Tuple_1.getTemplateBindings().add(tb_UniqueCollection_Tuple);
		t_UniqueCollection_Tuple_1.getSuperClasses().add(t_Collection_Tuple);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Tuple_1);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Bag_T.setElementType(t_Bag_T);
		t_UniqueCollection_Bag_T.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Bag_T.getTemplateBindings().add(tb_UniqueCollection_Bag_T_2);
		t_UniqueCollection_Bag_T.getSuperClasses().add(t_Collection_Bag_T);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Bag_T);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Bag_T_1.setElementType(t_Bag_T);
		t_UniqueCollection_Bag_T_1.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Bag_T_1.getTemplateBindings().add(tb_UniqueCollection_Bag_T);
		t_UniqueCollection_Bag_T_1.getSuperClasses().add(t_Collection_Bag_T);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Bag_T_1);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Bag_T_2.setElementType(t_Bag_T);
		t_UniqueCollection_Bag_T_2.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Bag_T_2.getTemplateBindings().add(tb_UniqueCollection_Bag_T_1);
		t_UniqueCollection_Bag_T_2.getSuperClasses().add(t_Collection_Bag_T);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Bag_T_2);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Bag_T_3.setElementType(t_Bag_T);
		t_UniqueCollection_Bag_T_3.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Bag_T_3.getTemplateBindings().add(tb_UniqueCollection_Bag_T_3);
		t_UniqueCollection_Bag_T_3.getSuperClasses().add(t_Collection_Bag_T_2);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Bag_T_3);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Collection_T.setElementType(t_Collection_T);
		t_UniqueCollection_Collection_T.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Collection_T.getTemplateBindings().add(tb_UniqueCollection_Collection_T);
		t_UniqueCollection_Collection_T.getSuperClasses().add(t_Collection_Collection_T);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Collection_T);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_EnumerationLiteral.setElementType(t_EnumerationLiteral);
		t_UniqueCollection_EnumerationLiteral.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_EnumerationLiteral.getTemplateBindings().add(tb_UniqueCollection_EnumerationLiteral);
		t_UniqueCollection_EnumerationLiteral.getSuperClasses().add(t_Collection_EnumerationLiteral);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_EnumerationLiteral);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OclAny.setElementType(t_OclAny);
		t_UniqueCollection_OclAny.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OclAny.getTemplateBindings().add(tb_UniqueCollection_OclAny);
		t_UniqueCollection_OclAny.getSuperClasses().add(t_Collection_OclAny_3);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OclAny);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OclElement.setElementType(t_OclElement);
		t_UniqueCollection_OclElement.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OclElement.getTemplateBindings().add(tb_UniqueCollection_OclElement);
		t_UniqueCollection_OclElement.getSuperClasses().add(t_Collection_OclElement);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OclElement);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OclSelf.setElementType(t_OclSelf);
		t_UniqueCollection_OclSelf.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OclSelf.getTemplateBindings().add(tb_UniqueCollection_OclSelf_5);
		t_UniqueCollection_OclSelf.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OclSelf);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OclSelf_1.setElementType(t_OclSelf);
		t_UniqueCollection_OclSelf_1.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OclSelf_1.getTemplateBindings().add(tb_UniqueCollection_OclSelf_1);
		t_UniqueCollection_OclSelf_1.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OclSelf_1);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OclSelf_2.setElementType(t_OclSelf);
		t_UniqueCollection_OclSelf_2.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OclSelf_2.getTemplateBindings().add(tb_UniqueCollection_OclSelf);
		t_UniqueCollection_OclSelf_2.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OclSelf_2);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OclSelf_3.setElementType(t_OclSelf);
		t_UniqueCollection_OclSelf_3.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OclSelf_3.getTemplateBindings().add(tb_UniqueCollection_OclSelf_2);
		t_UniqueCollection_OclSelf_3.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OclSelf_3);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OclSelf_4.setElementType(t_OclSelf);
		t_UniqueCollection_OclSelf_4.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OclSelf_4.getTemplateBindings().add(tb_UniqueCollection_OclSelf_4);
		t_UniqueCollection_OclSelf_4.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OclSelf_4);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OclSelf_5.setElementType(t_OclSelf);
		t_UniqueCollection_OclSelf_5.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OclSelf_5.getTemplateBindings().add(tb_UniqueCollection_OclSelf_3);
		t_UniqueCollection_OclSelf_5.getSuperClasses().add(t_Collection_OclSelf);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OclSelf_5);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OrderedSet_flatten_T2.setElementType(t_OrderedSet_flatten_T2);
		t_UniqueCollection_OrderedSet_flatten_T2.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OrderedSet_flatten_T2.getTemplateBindings().add(tb_UniqueCollection_OrderedSet_flatten_T2);
		t_UniqueCollection_OrderedSet_flatten_T2.getSuperClasses().add(t_Collection_OrderedSet_flatten_T2);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OrderedSet_flatten_T2);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OrderedSet_selectByKind_TT.setElementType(t_OrderedSet_selectByKind_TT);
		t_UniqueCollection_OrderedSet_selectByKind_TT.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OrderedSet_selectByKind_TT.getTemplateBindings().add(tb_UniqueCollection_OrderedSet_selectByKind_TT);
		t_UniqueCollection_OrderedSet_selectByKind_TT.getSuperClasses().add(t_Collection_OrderedSet_selectByKind_TT);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OrderedSet_selectByKind_TT);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OrderedSet_selectByType_TT.setElementType(t_OrderedSet_selectByType_TT);
		t_UniqueCollection_OrderedSet_selectByType_TT.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OrderedSet_selectByType_TT.getTemplateBindings().add(tb_UniqueCollection_OrderedSet_selectByType_TT);
		t_UniqueCollection_OrderedSet_selectByType_TT.getSuperClasses().add(t_Collection_OrderedSet_selectByType_TT);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OrderedSet_selectByType_TT);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_OrderedSet_T.setElementType(t_OrderedSet_T);
		t_UniqueCollection_OrderedSet_T.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_OrderedSet_T.getTemplateBindings().add(tb_UniqueCollection_OrderedSet_T);
		t_UniqueCollection_OrderedSet_T.getSuperClasses().add(t_Collection_OrderedSet_T_1);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_OrderedSet_T);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Sequence_T.setElementType(t_Sequence_T);
		t_UniqueCollection_Sequence_T.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Sequence_T.getTemplateBindings().add(tb_UniqueCollection_Sequence_T_2);
		t_UniqueCollection_Sequence_T.getSuperClasses().add(t_Collection_Sequence_T_1);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Sequence_T);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Sequence_T_1.setElementType(t_Sequence_T);
		t_UniqueCollection_Sequence_T_1.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Sequence_T_1.getTemplateBindings().add(tb_UniqueCollection_Sequence_T_1);
		t_UniqueCollection_Sequence_T_1.getSuperClasses().add(t_Collection_Sequence_T_1);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Sequence_T_1);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Sequence_T_2.setElementType(t_Sequence_T);
		t_UniqueCollection_Sequence_T_2.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Sequence_T_2.getTemplateBindings().add(tb_UniqueCollection_Sequence_T);
		t_UniqueCollection_Sequence_T_2.getSuperClasses().add(t_Collection_Sequence_T);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Sequence_T_2);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Set_flatten_T2.setElementType(t_Set_flatten_T2);
		t_UniqueCollection_Set_flatten_T2.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Set_flatten_T2.getTemplateBindings().add(tb_UniqueCollection_Set_flatten_T2);
		t_UniqueCollection_Set_flatten_T2.getSuperClasses().add(t_Collection_Set_flatten_T2);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Set_flatten_T2);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Set_selectByKind_TT.setElementType(t_Set_selectByKind_TT);
		t_UniqueCollection_Set_selectByKind_TT.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Set_selectByKind_TT.getTemplateBindings().add(tb_UniqueCollection_Set_selectByKind_TT);
		t_UniqueCollection_Set_selectByKind_TT.getSuperClasses().add(t_Collection_Set_selectByKind_TT);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Set_selectByKind_TT);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Set_selectByType_TT.setElementType(t_Set_selectByType_TT);
		t_UniqueCollection_Set_selectByType_TT.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Set_selectByType_TT.getTemplateBindings().add(tb_UniqueCollection_Set_selectByType_TT);
		t_UniqueCollection_Set_selectByType_TT.getSuperClasses().add(t_Collection_Set_selectByType_TT);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Set_selectByType_TT);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_Set_T.setElementType(t_Set_T);
		t_UniqueCollection_Set_T.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_Set_T.getTemplateBindings().add(tb_UniqueCollection_Set_T);
		t_UniqueCollection_Set_T.getSuperClasses().add(t_Collection_Set_T);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_Set_T);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_UniqueCollection_T.setElementType(t_UniqueCollection_T);
		t_UniqueCollection_UniqueCollection_T.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_UniqueCollection_T.getTemplateBindings().add(tb_UniqueCollection_UniqueCollection_T_1);
		t_UniqueCollection_UniqueCollection_T.getSuperClasses().add(t_Collection_UniqueCollection_T_1);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_UniqueCollection_T);
		//
		// ocl::$$::UniqueCollection
		//
		t_UniqueCollection_UniqueCollection_T_1.setElementType(t_UniqueCollection_T);
		t_UniqueCollection_UniqueCollection_T_1.setUnspecializedElement(t_UniqueCollection);
		t_UniqueCollection_UniqueCollection_T_1.getTemplateBindings().add(tb_UniqueCollection_UniqueCollection_T);
		t_UniqueCollection_UniqueCollection_T_1.getSuperClasses().add(t_Collection_UniqueCollection_T);
		pk_$$.getOwnedTypes().add(t_UniqueCollection_UniqueCollection_T_1);
		//
		// ocl::$$::$$
		//
		pk_$$.getOwnedTypes().add(t_$$);
		library.getNestedPackages().add(pk_$$);
		return library;
	}
}
