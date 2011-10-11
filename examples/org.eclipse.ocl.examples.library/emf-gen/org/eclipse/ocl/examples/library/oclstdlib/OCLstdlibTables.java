/**
 * 
 *************************************************************************
 * This code is 100% auto-generated
 * from: oclstdlib
 * using: org.eclipse.ocl.examples.codegen.tables.model2tables.mtl
 *
 * Do not edit it.
 */
package org.eclipse.ocl.examples.library.oclstdlib;

import org.eclipse.ocl.examples.library.ecore.*;
import org.eclipse.ocl.examples.library.executor.*;
//import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibPackage;
//import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

/**
 * OCLstdlibTables provides the dispatch tables for the oclstdlib for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class OCLstdlibTables
{
	/**
	 *	The package descriptor for the package.
	 */
	public static final ExecutorPackage PACKAGE = new ExecutorPackage("oclstdlib", "http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib", null);

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
	    private static final ExecutorTypeParameter _AnyClassifier_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _AnyClassifier = new ExecutorType("AnyClassifier", PACKAGE, 0, _AnyClassifier_T);
	    private static final ExecutorTypeParameter _Bag_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _Bag = new ExecutorType("Bag", PACKAGE, 0, _Bag_T);
	    public static final ExecutorType _Boolean = new ExecutorType("Boolean", PACKAGE, 0);
	    public static final ExecutorType _Class = new ExecutorType("Class", PACKAGE, 0);
	    private static final ExecutorTypeParameter _ClassClassifier_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _ClassClassifier = new ExecutorType("ClassClassifier", PACKAGE, 0, _ClassClassifier_T);
	    private static final ExecutorTypeParameter _Collection_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _Collection = new ExecutorType("Collection", PACKAGE, 0, _Collection_T);
	    private static final ExecutorTypeParameter _CollectionClassifier_T = new ExecutorTypeParameter("T");
	    private static final ExecutorTypeParameter _CollectionClassifier_E = new ExecutorTypeParameter("E");
	    public static final ExecutorType _CollectionClassifier = new ExecutorType("CollectionClassifier", PACKAGE, 0, _CollectionClassifier_T, _CollectionClassifier_E);
	    public static final ExecutorType _Enumeration = new ExecutorType("Enumeration", PACKAGE, 0);
	    private static final ExecutorTypeParameter _EnumerationClassifier_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _EnumerationClassifier = new ExecutorType("EnumerationClassifier", PACKAGE, 0, _EnumerationClassifier_T);
	    public static final ExecutorType _EnumerationLiteral = new ExecutorType("EnumerationLiteral", PACKAGE, 0);
	    public static final ExecutorType _Integer = new ExecutorType("Integer", PACKAGE, 0);
	    private static final ExecutorTypeParameter _NonOrderedCollection_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _NonOrderedCollection = new ExecutorType("NonOrderedCollection", PACKAGE, 0, _NonOrderedCollection_T);
	    private static final ExecutorTypeParameter _NonUniqueCollection_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _NonUniqueCollection = new ExecutorType("NonUniqueCollection", PACKAGE, 0, _NonUniqueCollection_T);
	    public static final ExecutorType _OclAny = new ExecutorType("OclAny", PACKAGE, 0);
	    public static final ExecutorType _OclComparable = new ExecutorType("OclComparable", PACKAGE, 0);
	    public static final ExecutorType _OclElement = new ExecutorType("OclElement", PACKAGE, 0);
	    public static final ExecutorType _OclInvalid = new ExecutorType("OclInvalid", PACKAGE, 0);
	    public static final ExecutorType _OclLambda = new ExecutorType("OclLambda", PACKAGE, 0);
	    public static final ExecutorType _OclMessage = new ExecutorType("OclMessage", PACKAGE, 0);
	    public static final ExecutorType _OclSelf = new ExecutorType("OclSelf", PACKAGE, 0);
	    public static final ExecutorType _OclState = new ExecutorType("OclState", PACKAGE, 0);
	    public static final ExecutorType _OclSummable = new ExecutorType("OclSummable", PACKAGE, 0);
	    public static final ExecutorType _OclTuple = new ExecutorType("OclTuple", PACKAGE, 0);
	    public static final ExecutorType _OclVoid = new ExecutorType("OclVoid", PACKAGE, 0);
	    private static final ExecutorTypeParameter _OrderedCollection_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _OrderedCollection = new ExecutorType("OrderedCollection", PACKAGE, 0, _OrderedCollection_T);
	    private static final ExecutorTypeParameter _OrderedSet_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _OrderedSet = new ExecutorType("OrderedSet", PACKAGE, ExecutorType.ORDERED | ExecutorType.UNIQUE, _OrderedSet_T);
	    public static final ExecutorType _Real = new ExecutorType("Real", PACKAGE, 0);
	    private static final ExecutorTypeParameter _Sequence_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _Sequence = new ExecutorType("Sequence", PACKAGE, ExecutorType.ORDERED, _Sequence_T);
	    private static final ExecutorTypeParameter _Set_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _Set = new ExecutorType("Set", PACKAGE, ExecutorType.UNIQUE, _Set_T);
	    public static final ExecutorType _String = new ExecutorType("String", PACKAGE, 0);
	    private static final ExecutorTypeParameter _UniqueCollection_T = new ExecutorTypeParameter("T");
	    public static final ExecutorType _UniqueCollection = new ExecutorType("UniqueCollection", PACKAGE, 0, _UniqueCollection_T);
	    public static final ExecutorType _UnlimitedNatural = new ExecutorType("UnlimitedNatural", PACKAGE, 0);
	    public static final ExecutorType __Dummy = new ExecutorType("_Dummy", PACKAGE, 0);
	
		private static final ExecutorType[] types = {
		    _Boolean,
		    _Integer,
		    _Real,
		    _String,
		    _UnlimitedNatural,
		    _AnyClassifier,
		    _Bag,
		    _Class,
		    _ClassClassifier,
		    _CollectionClassifier,
		    _Collection,
		    _Enumeration,
		    _EnumerationClassifier,
		    _EnumerationLiteral,
		    _NonOrderedCollection,
		    _NonUniqueCollection,
		    _OclAny,
		    _OclComparable,
		    _OclElement,
		    _OclInvalid,
		    _OclLambda,
		    _OclMessage,
		    _OclSelf,
		    _OclState,
		    _OclSummable,
		    _OclTuple,
		    _OclVoid,
		    _OrderedCollection,
		    _OrderedSet,
		    _Sequence,
		    _Set,
		    _UniqueCollection,
		    __Dummy
		};
	
		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(types);
			TypeFragments.init();
			FragmentOperations.init();
			FragmentProperties.init();
		}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		public static final ExecutorFragment _AnyClassifier__AnyClassifier = new ExecutorFragment(Types._AnyClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._AnyClassifier, null, null);
		public static final ExecutorFragment _AnyClassifier__Class = new ExecutorFragment(Types._AnyClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Class, null, null);
		public static final ExecutorFragment _AnyClassifier__OclAny = new ExecutorFragment(Types._AnyClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _Bag__Bag = new ExecutorFragment(Types._Bag, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Bag, null, null);
		public static final ExecutorFragment _Bag__Collection = new ExecutorFragment(Types._Bag, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection, null, null);
		public static final ExecutorFragment _Bag__NonOrderedCollection = new ExecutorFragment(Types._Bag, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection, null, null);
		public static final ExecutorFragment _Bag__NonUniqueCollection = new ExecutorFragment(Types._Bag, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonUniqueCollection, null, null);
		public static final ExecutorFragment _Bag__OclAny = new ExecutorFragment(Types._Bag, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _Boolean__Boolean = new ExecutorFragment(Types._Boolean, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Boolean, null, null);
		public static final ExecutorFragment _Boolean__OclAny = new ExecutorFragment(Types._Boolean, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _Class__Class = new ExecutorFragment(Types._Class, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Class, null, null);
		public static final ExecutorFragment _Class__OclAny = new ExecutorFragment(Types._Class, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _ClassClassifier__AnyClassifier = new ExecutorFragment(Types._ClassClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._AnyClassifier, null, null);
		public static final ExecutorFragment _ClassClassifier__Class = new ExecutorFragment(Types._ClassClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Class, null, null);
		public static final ExecutorFragment _ClassClassifier__ClassClassifier = new ExecutorFragment(Types._ClassClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._ClassClassifier, null, null);
		public static final ExecutorFragment _ClassClassifier__OclAny = new ExecutorFragment(Types._ClassClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _Collection__Collection = new ExecutorFragment(Types._Collection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection, null, null);
		public static final ExecutorFragment _Collection__OclAny = new ExecutorFragment(Types._Collection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _CollectionClassifier__AnyClassifier = new ExecutorFragment(Types._CollectionClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._AnyClassifier, null, null);
		public static final ExecutorFragment _CollectionClassifier__Class = new ExecutorFragment(Types._CollectionClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Class, null, null);
		public static final ExecutorFragment _CollectionClassifier__CollectionClassifier = new ExecutorFragment(Types._CollectionClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._CollectionClassifier, null, null);
		public static final ExecutorFragment _CollectionClassifier__OclAny = new ExecutorFragment(Types._CollectionClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _Enumeration__Enumeration = new ExecutorFragment(Types._Enumeration, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Enumeration, null, null);
		public static final ExecutorFragment _Enumeration__OclAny = new ExecutorFragment(Types._Enumeration, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _EnumerationClassifier__AnyClassifier = new ExecutorFragment(Types._EnumerationClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._AnyClassifier, null, null);
		public static final ExecutorFragment _EnumerationClassifier__Class = new ExecutorFragment(Types._EnumerationClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Class, null, null);
		public static final ExecutorFragment _EnumerationClassifier__EnumerationClassifier = new ExecutorFragment(Types._EnumerationClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._EnumerationClassifier, null, null);
		public static final ExecutorFragment _EnumerationClassifier__OclAny = new ExecutorFragment(Types._EnumerationClassifier, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _EnumerationLiteral__EnumerationLiteral = new ExecutorFragment(Types._EnumerationLiteral, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._EnumerationLiteral, null, null);
		public static final ExecutorFragment _EnumerationLiteral__OclAny = new ExecutorFragment(Types._EnumerationLiteral, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _Integer__Integer = new ExecutorFragment(Types._Integer, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer, null, null);
		public static final ExecutorFragment _Integer__OclAny = new ExecutorFragment(Types._Integer, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _Integer__OclComparable = new ExecutorFragment(Types._Integer, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclComparable, null, null);
		public static final ExecutorFragment _Integer__OclSummable = new ExecutorFragment(Types._Integer, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSummable, null, null);
		public static final ExecutorFragment _Integer__Real = new ExecutorFragment(Types._Integer, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Real, null, null);
		
		public static final ExecutorFragment _NonOrderedCollection__Collection = new ExecutorFragment(Types._NonOrderedCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection, null, null);
		public static final ExecutorFragment _NonOrderedCollection__NonOrderedCollection = new ExecutorFragment(Types._NonOrderedCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection, null, null);
		public static final ExecutorFragment _NonOrderedCollection__OclAny = new ExecutorFragment(Types._NonOrderedCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _NonUniqueCollection__Collection = new ExecutorFragment(Types._NonUniqueCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection, null, null);
		public static final ExecutorFragment _NonUniqueCollection__NonUniqueCollection = new ExecutorFragment(Types._NonUniqueCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonUniqueCollection, null, null);
		public static final ExecutorFragment _NonUniqueCollection__OclAny = new ExecutorFragment(Types._NonUniqueCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _OclAny__OclAny = new ExecutorFragment(Types._OclAny, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		
		public static final ExecutorFragment _OclComparable__OclAny = new ExecutorFragment(Types._OclComparable, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclComparable__OclComparable = new ExecutorFragment(Types._OclComparable, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclComparable, null, null);
		
		public static final ExecutorFragment _OclElement__OclAny = new ExecutorFragment(Types._OclElement, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclElement__OclElement = new ExecutorFragment(Types._OclElement, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclElement, null, null);
		
		public static final ExecutorFragment _OclInvalid__OclAny = new ExecutorFragment(Types._OclInvalid, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclInvalid__OclInvalid = new ExecutorFragment(Types._OclInvalid, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclInvalid, null, null);
		public static final ExecutorFragment _OclInvalid__OclVoid = new ExecutorFragment(Types._OclInvalid, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclVoid, null, null);
		
		public static final ExecutorFragment _OclLambda__OclAny = new ExecutorFragment(Types._OclLambda, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclLambda__OclLambda = new ExecutorFragment(Types._OclLambda, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclLambda, null, null);
		
		public static final ExecutorFragment _OclMessage__OclAny = new ExecutorFragment(Types._OclMessage, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclMessage__OclMessage = new ExecutorFragment(Types._OclMessage, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclMessage, null, null);
		
		public static final ExecutorFragment _OclSelf__OclAny = new ExecutorFragment(Types._OclSelf, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclSelf__OclSelf = new ExecutorFragment(Types._OclSelf, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf, null, null);
		
		public static final ExecutorFragment _OclState__OclAny = new ExecutorFragment(Types._OclState, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclState__OclState = new ExecutorFragment(Types._OclState, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclState, null, null);
		
		public static final ExecutorFragment _OclSummable__OclAny = new ExecutorFragment(Types._OclSummable, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclSummable__OclSummable = new ExecutorFragment(Types._OclSummable, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSummable, null, null);
		
		public static final ExecutorFragment _OclTuple__OclAny = new ExecutorFragment(Types._OclTuple, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclTuple__OclTuple = new ExecutorFragment(Types._OclTuple, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclTuple, null, null);
		
		public static final ExecutorFragment _OclVoid__OclAny = new ExecutorFragment(Types._OclVoid, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OclVoid__OclVoid = new ExecutorFragment(Types._OclVoid, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclVoid, null, null);
		
		public static final ExecutorFragment _OrderedCollection__Collection = new ExecutorFragment(Types._OrderedCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection, null, null);
		public static final ExecutorFragment _OrderedCollection__OclAny = new ExecutorFragment(Types._OrderedCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OrderedCollection__OrderedCollection = new ExecutorFragment(Types._OrderedCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedCollection, null, null);
		
		public static final ExecutorFragment _OrderedSet__Collection = new ExecutorFragment(Types._OrderedSet, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection, null, null);
		public static final ExecutorFragment _OrderedSet__OclAny = new ExecutorFragment(Types._OrderedSet, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _OrderedSet__OrderedCollection = new ExecutorFragment(Types._OrderedSet, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedCollection, null, null);
		public static final ExecutorFragment _OrderedSet__OrderedSet = new ExecutorFragment(Types._OrderedSet, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet, null, null);
		public static final ExecutorFragment _OrderedSet__UniqueCollection = new ExecutorFragment(Types._OrderedSet, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._UniqueCollection, null, null);
		
		public static final ExecutorFragment _Real__OclAny = new ExecutorFragment(Types._Real, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _Real__OclComparable = new ExecutorFragment(Types._Real, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclComparable, null, null);
		public static final ExecutorFragment _Real__OclSummable = new ExecutorFragment(Types._Real, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSummable, null, null);
		public static final ExecutorFragment _Real__Real = new ExecutorFragment(Types._Real, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Real, null, null);
		
		public static final ExecutorFragment _Sequence__Collection = new ExecutorFragment(Types._Sequence, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection, null, null);
		public static final ExecutorFragment _Sequence__NonUniqueCollection = new ExecutorFragment(Types._Sequence, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonUniqueCollection, null, null);
		public static final ExecutorFragment _Sequence__OclAny = new ExecutorFragment(Types._Sequence, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _Sequence__OrderedCollection = new ExecutorFragment(Types._Sequence, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedCollection, null, null);
		public static final ExecutorFragment _Sequence__Sequence = new ExecutorFragment(Types._Sequence, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Sequence, null, null);
		
		public static final ExecutorFragment _Set__Collection = new ExecutorFragment(Types._Set, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection, null, null);
		public static final ExecutorFragment _Set__NonOrderedCollection = new ExecutorFragment(Types._Set, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection, null, null);
		public static final ExecutorFragment _Set__OclAny = new ExecutorFragment(Types._Set, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _Set__Set = new ExecutorFragment(Types._Set, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Set, null, null);
		public static final ExecutorFragment _Set__UniqueCollection = new ExecutorFragment(Types._Set, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._UniqueCollection, null, null);
		
		public static final ExecutorFragment _String__OclAny = new ExecutorFragment(Types._String, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _String__OclComparable = new ExecutorFragment(Types._String, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclComparable, null, null);
		public static final ExecutorFragment _String__OclSummable = new ExecutorFragment(Types._String, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSummable, null, null);
		public static final ExecutorFragment _String__String = new ExecutorFragment(Types._String, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._String, null, null);
		
		public static final ExecutorFragment _UniqueCollection__Collection = new ExecutorFragment(Types._UniqueCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection, null, null);
		public static final ExecutorFragment _UniqueCollection__OclAny = new ExecutorFragment(Types._UniqueCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _UniqueCollection__UniqueCollection = new ExecutorFragment(Types._UniqueCollection, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._UniqueCollection, null, null);
		
		public static final ExecutorFragment _UnlimitedNatural__Integer = new ExecutorFragment(Types._UnlimitedNatural, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer, null, null);
		public static final ExecutorFragment _UnlimitedNatural__OclAny = new ExecutorFragment(Types._UnlimitedNatural, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny, null, null);
		public static final ExecutorFragment _UnlimitedNatural__OclComparable = new ExecutorFragment(Types._UnlimitedNatural, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclComparable, null, null);
		public static final ExecutorFragment _UnlimitedNatural__OclSummable = new ExecutorFragment(Types._UnlimitedNatural, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSummable, null, null);
		public static final ExecutorFragment _UnlimitedNatural__Real = new ExecutorFragment(Types._UnlimitedNatural, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Real, null, null);
		public static final ExecutorFragment _UnlimitedNatural__UnlimitedNatural = new ExecutorFragment(Types._UnlimitedNatural, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._UnlimitedNatural, null, null);
		
		public static final ExecutorFragment __Dummy___Dummy = new ExecutorFragment(Types.__Dummy, org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types.__Dummy, null, null);
		
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
		public static final ExecutorOperation _Bag___lt__gt_ = new ExecutorOperation("<>",
			Types._Bag, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Bag___eq_ = new ExecutorOperation("=",
			Types._Bag, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Bag__excluding = new ExecutorOperation("excluding",
			Types._Bag, 2, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __Bag__flatten_T2 = new ExecutorTypeParameter("T2");
		public static final ExecutorOperation _Bag__flatten = new ExecutorOperation("flatten",
			Types._Bag, 3, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Bag__including = new ExecutorOperation("including",
			Types._Bag, 4, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Bag_T);
		public static final ExecutorOperation _Bag__reject = new ExecutorOperation("reject",
			Types._Bag, 5, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Bag_T));
		public static final ExecutorOperation _Bag__select = new ExecutorOperation("select",
			Types._Bag, 6, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Bag_T));
	
		public static final ExecutorOperation _Boolean___lt__gt_ = new ExecutorOperation("<>",
			Types._Boolean, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Boolean___eq_ = new ExecutorOperation("=",
			Types._Boolean, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Boolean__allInstances = new ExecutorOperation("allInstances",
			Types._Boolean, 2, org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__and = new ExecutorOperation("and",
			Types._Boolean, 3, org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__implies = new ExecutorOperation("implies",
			Types._Boolean, 4, org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__not = new ExecutorOperation("not",
			Types._Boolean, 5, org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__or = new ExecutorOperation("or",
			Types._Boolean, 6, org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__toString = new ExecutorOperation("toString",
			Types._Boolean, 7, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__xor = new ExecutorOperation("xor",
			Types._Boolean, 8, org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Boolean);
	
		public static final ExecutorOperation _Class__oclType = new ExecutorOperation("oclType",
			Types._Class, 0, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	
		public static final ExecutorOperation _Collection___lt__gt_ = new ExecutorOperation("<>",
			Types._Collection, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Collection___eq_ = new ExecutorOperation("=",
			Types._Collection, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Collection__any = new ExecutorOperation("any",
			Types._Collection, 2, org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__asBag = new ExecutorOperation("asBag",
			Types._Collection, 3, org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
		public static final ExecutorOperation _Collection__asOrderedSet = new ExecutorOperation("asOrderedSet",
			Types._Collection, 4, org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
		public static final ExecutorOperation _Collection__asSequence = new ExecutorOperation("asSequence",
			Types._Collection, 5, org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
		public static final ExecutorOperation _Collection__asSet = new ExecutorOperation("asSet",
			Types._Collection, 6, org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
		public static final ExecutorTypeParameter __Collection__collectNested_V = new ExecutorTypeParameter("V");
		public static final ExecutorOperation _Collection__collectNested = new ExecutorOperation("collectNested",
			Types._Collection, 7, org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorTypeParameter __Collection__collect_V = new ExecutorTypeParameter("V");
		public static final ExecutorOperation _Collection__collect = new ExecutorOperation("collect",
			Types._Collection, 8, org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__count = new ExecutorOperation("count",
			Types._Collection, 9, org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny);
		public static final ExecutorOperation _Collection__excludes = new ExecutorOperation("excludes",
			Types._Collection, 10, org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __Collection__excludesAll_T2 = new ExecutorTypeParameter("T2");
		public static final ExecutorOperation _Collection__excludesAll = new ExecutorOperation("excludesAll",
			Types._Collection, 11, org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE,
				new ExecutorSpecializedType("Collection", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations.__Collection__excludesAll_T2));
		public static final ExecutorOperation _Collection__excluding = new ExecutorOperation("excluding",
			Types._Collection, 12, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny);
		public static final ExecutorOperation _Collection__1_exists = new ExecutorOperation("exists",
			Types._Collection, 13, org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__0_exists = new ExecutorOperation("exists",
			Types._Collection, 14, org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorTypeParameter __Collection__flatten_T2 = new ExecutorTypeParameter("T2");
		public static final ExecutorOperation _Collection__flatten = new ExecutorOperation("flatten",
			Types._Collection, 15, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Collection__1_forAll = new ExecutorOperation("forAll",
			Types._Collection, 16, org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__0_forAll = new ExecutorOperation("forAll",
			Types._Collection, 17, org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__includes = new ExecutorOperation("includes",
			Types._Collection, 18, org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __Collection__includesAll_T2 = new ExecutorTypeParameter("T2");
		public static final ExecutorOperation _Collection__includesAll = new ExecutorOperation("includesAll",
			Types._Collection, 19, org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE,
				new ExecutorSpecializedType("Collection", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations.__Collection__includesAll_T2));
		public static final ExecutorOperation _Collection__including = new ExecutorOperation("including",
			Types._Collection, 20, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T);
		public static final ExecutorOperation _Collection__isEmpty = new ExecutorOperation("isEmpty",
			Types._Collection, 21, org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
		public static final ExecutorOperation _Collection__isUnique = new ExecutorOperation("isUnique",
			Types._Collection, 22, org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorTypeParameter __Collection__iterate_Tacc = new ExecutorTypeParameter("Tacc");
		public static final ExecutorOperation _Collection__iterate = new ExecutorOperation("iterate",
			Types._Collection, 23, org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE);
		public static final ExecutorOperation _Collection__max = new ExecutorOperation("max",
			Types._Collection, 24, org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
		public static final ExecutorOperation _Collection__min = new ExecutorOperation("min",
			Types._Collection, 25, org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
		public static final ExecutorOperation _Collection__notEmpty = new ExecutorOperation("notEmpty",
			Types._Collection, 26, org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
		public static final ExecutorOperation _Collection__oclType = new ExecutorOperation("oclType",
			Types._Collection, 27, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
		public static final ExecutorOperation _Collection__one = new ExecutorOperation("one",
			Types._Collection, 28, org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorTypeParameter __Collection__product_T2 = new ExecutorTypeParameter("T2");
		public static final ExecutorOperation _Collection__product = new ExecutorOperation("product",
			Types._Collection, 29, org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE,
				new ExecutorSpecializedType("Collection", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations.__Collection__product_T2));
		public static final ExecutorOperation _Collection__reject = new ExecutorOperation("reject",
			Types._Collection, 30, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__select = new ExecutorOperation("select",
			Types._Collection, 31, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__size = new ExecutorOperation("size",
			Types._Collection, 32, org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
		public static final ExecutorOperation _Collection__sortedBy = new ExecutorOperation("sortedBy",
			Types._Collection, 33, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__sum = new ExecutorOperation("sum",
			Types._Collection, 34, org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
	
		public static final ExecutorOperation _Enumeration__allInstances = new ExecutorOperation("allInstances",
			Types._Enumeration, 0, org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _Enumeration__oclType = new ExecutorOperation("oclType",
			Types._Enumeration, 1, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	
		public static final ExecutorOperation _Integer___mul_ = new ExecutorOperation("*",
			Types._Integer, 0, org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer___add_ = new ExecutorOperation("+",
			Types._Integer, 1, org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__0__sub_ = new ExecutorOperation("-",
			Types._Integer, 2, org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
		public static final ExecutorOperation _Integer__1__sub_ = new ExecutorOperation("-",
			Types._Integer, 3, org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer___div_ = new ExecutorOperation("/",
			Types._Integer, 4, org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__abs = new ExecutorOperation("abs",
			Types._Integer, 5, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Integer__compareTo = new ExecutorOperation("compareTo",
			Types._Integer, 6, org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__div = new ExecutorOperation("div",
			Types._Integer, 7, org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _Integer__max = new ExecutorOperation("max",
			Types._Integer, 8, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__min = new ExecutorOperation("min",
			Types._Integer, 9, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__mod = new ExecutorOperation("mod",
			Types._Integer, 10, org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _Integer__toString = new ExecutorOperation("toString",
			Types._Integer, 11, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _NonOrderedCollection__closure = new ExecutorOperation("closure",
			Types._NonOrderedCollection, 0, org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection_T));
		public static final ExecutorTypeParameter __NonOrderedCollection__collectNested_V = new ExecutorTypeParameter("V");
		public static final ExecutorOperation _NonOrderedCollection__collectNested = new ExecutorOperation("collectNested",
			Types._NonOrderedCollection, 1, org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection_T));
		public static final ExecutorTypeParameter __NonOrderedCollection__collect_V = new ExecutorTypeParameter("V");
		public static final ExecutorOperation _NonOrderedCollection__collect = new ExecutorOperation("collect",
			Types._NonOrderedCollection, 2, org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection_T));
		public static final ExecutorOperation _NonOrderedCollection__0_intersection = new ExecutorOperation("intersection",
			Types._NonOrderedCollection, 3, org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType("Bag", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection_T));
		public static final ExecutorOperation _NonOrderedCollection__1_intersection = new ExecutorOperation("intersection",
			Types._NonOrderedCollection, 4, org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType("Set", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection_T));
		public static final ExecutorOperation _NonOrderedCollection__0_union = new ExecutorOperation("union",
			Types._NonOrderedCollection, 5, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType("Bag", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection_T));
		public static final ExecutorOperation _NonOrderedCollection__1_union = new ExecutorOperation("union",
			Types._NonOrderedCollection, 6, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType("Set", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonOrderedCollection_T));
	
		public static final ExecutorOperation _NonUniqueCollection__sortedBy = new ExecutorOperation("sortedBy",
			Types._NonUniqueCollection, 0, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._NonUniqueCollection_T));
	
		public static final ExecutorOperation _OclAny___lt__gt_ = new ExecutorOperation("<>",
			Types._OclAny, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclAny___eq_ = new ExecutorOperation("=",
			Types._OclAny, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclAny__oclAsSet = new ExecutorOperation("oclAsSet",
			Types._OclAny, 2, org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
		public static final ExecutorTypeParameter __OclAny__oclAsType_TT = new ExecutorTypeParameter("TT");
		public static final ExecutorOperation _OclAny__oclAsType = new ExecutorOperation("oclAsType",
			Types._OclAny, 3, org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._AnyClassifier);
		public static final ExecutorOperation _OclAny__oclIsInState = new ExecutorOperation("oclIsInState",
			Types._OclAny, 4, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclState);
		public static final ExecutorOperation _OclAny__oclIsInvalid = new ExecutorOperation("oclIsInvalid",
			Types._OclAny, 5, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
		public static final ExecutorTypeParameter __OclAny__oclIsKindOf_T = new ExecutorTypeParameter("T");
		public static final ExecutorOperation _OclAny__oclIsKindOf = new ExecutorOperation("oclIsKindOf",
			Types._OclAny, 6, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._AnyClassifier);
		public static final ExecutorOperation _OclAny__oclIsNew = new ExecutorOperation("oclIsNew",
			Types._OclAny, 7, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		public static final ExecutorTypeParameter __OclAny__oclIsTypeOf_T = new ExecutorTypeParameter("T");
		public static final ExecutorOperation _OclAny__oclIsTypeOf = new ExecutorOperation("oclIsTypeOf",
			Types._OclAny, 8, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._AnyClassifier);
		public static final ExecutorOperation _OclAny__oclIsUndefined = new ExecutorOperation("oclIsUndefined",
			Types._OclAny, 9, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclType = new ExecutorOperation("oclType",
			Types._OclAny, 10, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	
		public static final ExecutorOperation _OclComparable__compareTo = new ExecutorOperation("compareTo",
			Types._OclComparable, 0, null,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
	
		public static final ExecutorOperation _OclElement__allInstances = new ExecutorOperation("allInstances",
			Types._OclElement, 0, org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
		public static final ExecutorTypeParameter __OclElement__oclContainer_U = new ExecutorTypeParameter("U");
		public static final ExecutorOperation _OclElement__oclContainer = new ExecutorOperation("oclContainer",
			Types._OclElement, 1, org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
		public static final ExecutorTypeParameter __OclElement__oclContents_U = new ExecutorTypeParameter("U");
		public static final ExecutorOperation _OclElement__oclContents = new ExecutorOperation("oclContents",
			Types._OclElement, 2, org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
	
		public static final ExecutorOperation _OclInvalid___lt__gt_ = new ExecutorOperation("<>",
			Types._OclInvalid, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclInvalid___eq_ = new ExecutorOperation("=",
			Types._OclInvalid, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclInvalid__allInstances = new ExecutorOperation("allInstances",
			Types._OclInvalid, 2, org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _OclInvalid__oclBadOperation = new ExecutorOperation("oclBadOperation",
			Types._OclInvalid, 3, null);
		public static final ExecutorOperation _OclInvalid__toString = new ExecutorOperation("toString",
			Types._OclInvalid, 4, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _OclMessage__hasReturned = new ExecutorOperation("hasReturned",
			Types._OclMessage, 0, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		public static final ExecutorOperation _OclMessage__isOperationCall = new ExecutorOperation("isOperationCall",
			Types._OclMessage, 1, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		public static final ExecutorOperation _OclMessage__isSignalSent = new ExecutorOperation("isSignalSent",
			Types._OclMessage, 2, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		public static final ExecutorOperation _OclMessage__result = new ExecutorOperation("result",
			Types._OclMessage, 3, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
	
		public static final ExecutorOperation _OclSummable__sum = new ExecutorOperation("sum",
			Types._OclSummable, 0, null,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclSummable__zero = new ExecutorOperation("zero",
			Types._OclSummable, 1, null);
	
		public static final ExecutorOperation _OclTuple___lt__gt_ = new ExecutorOperation("<>",
			Types._OclTuple, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclTuple___eq_ = new ExecutorOperation("=",
			Types._OclTuple, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
	
		public static final ExecutorOperation _OclVoid___lt__gt_ = new ExecutorOperation("<>",
			Types._OclVoid, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclVoid___eq_ = new ExecutorOperation("=",
			Types._OclVoid, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclVoid__allInstances = new ExecutorOperation("allInstances",
			Types._OclVoid, 2, org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _OclVoid__and = new ExecutorOperation("and",
			Types._OclVoid, 3, org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _OclVoid__implies = new ExecutorOperation("implies",
			Types._OclVoid, 4, org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _OclVoid__or = new ExecutorOperation("or",
			Types._OclVoid, 5, org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _OclVoid__toString = new ExecutorOperation("toString",
			Types._OclVoid, 6, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _OrderedCollection__at = new ExecutorOperation("at",
			Types._OrderedCollection, 0, org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _OrderedCollection__closure = new ExecutorOperation("closure",
			Types._OrderedCollection, 1, org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedCollection_T));
		public static final ExecutorTypeParameter __OrderedCollection__collectNested_V = new ExecutorTypeParameter("V");
		public static final ExecutorOperation _OrderedCollection__collectNested = new ExecutorOperation("collectNested",
			Types._OrderedCollection, 2, org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedCollection_T));
		public static final ExecutorTypeParameter __OrderedCollection__collect_V = new ExecutorTypeParameter("V");
		public static final ExecutorOperation _OrderedCollection__collect = new ExecutorOperation("collect",
			Types._OrderedCollection, 3, org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedCollection_T));
		public static final ExecutorOperation _OrderedCollection__first = new ExecutorOperation("first",
			Types._OrderedCollection, 4, org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
		public static final ExecutorOperation _OrderedCollection__indexOf = new ExecutorOperation("indexOf",
			Types._OrderedCollection, 5, org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny);
		public static final ExecutorOperation _OrderedCollection__last = new ExecutorOperation("last",
			Types._OrderedCollection, 6, org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
		public static final ExecutorOperation _OrderedCollection__reverse = new ExecutorOperation("reverse",
			Types._OrderedCollection, 7, org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
	
		public static final ExecutorOperation _OrderedSet___sub_ = new ExecutorOperation("-",
			Types._OrderedSet, 0, org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE,
				new ExecutorSpecializedType("Set", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny));
		public static final ExecutorOperation _OrderedSet___lt__gt_ = new ExecutorOperation("<>",
			Types._OrderedSet, 1, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OrderedSet___eq_ = new ExecutorOperation("=",
			Types._OrderedSet, 2, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OrderedSet__append = new ExecutorOperation("append",
			Types._OrderedSet, 3, org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet_T);
		public static final ExecutorOperation _OrderedSet__excluding = new ExecutorOperation("excluding",
			Types._OrderedSet, 4, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __OrderedSet__flatten_T2 = new ExecutorTypeParameter("T2");
		public static final ExecutorOperation _OrderedSet__flatten = new ExecutorOperation("flatten",
			Types._OrderedSet, 5, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__including = new ExecutorOperation("including",
			Types._OrderedSet, 6, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet_T);
		public static final ExecutorOperation _OrderedSet__insertAt = new ExecutorOperation("insertAt",
			Types._OrderedSet, 7, org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet_T);
		public static final ExecutorOperation _OrderedSet__intersection = new ExecutorOperation("intersection",
			Types._OrderedSet, 8, org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType("Set", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet_T));
		public static final ExecutorOperation _OrderedSet__prepend = new ExecutorOperation("prepend",
			Types._OrderedSet, 9, org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet_T);
		public static final ExecutorOperation _OrderedSet__reject = new ExecutorOperation("reject",
			Types._OrderedSet, 10, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet_T));
		public static final ExecutorOperation _OrderedSet__reverse = new ExecutorOperation("reverse",
			Types._OrderedSet, 11, org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__select = new ExecutorOperation("select",
			Types._OrderedSet, 12, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet_T));
		public static final ExecutorOperation _OrderedSet__subOrderedSet = new ExecutorOperation("subOrderedSet",
			Types._OrderedSet, 13, org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _OrderedSet__symmetricDifference = new ExecutorOperation("symmetricDifference",
			Types._OrderedSet, 14, org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE,
				new ExecutorSpecializedType("Set", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny));
		public static final ExecutorOperation _OrderedSet__0_union = new ExecutorOperation("union",
			Types._OrderedSet, 15, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType("OrderedSet", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet_T));
		public static final ExecutorOperation _OrderedSet__1_union = new ExecutorOperation("union",
			Types._OrderedSet, 16, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType("Set", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OrderedSet_T));
	
		public static final ExecutorOperation _Real___mul_ = new ExecutorOperation("*",
			Types._Real, 0, org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___add_ = new ExecutorOperation("+",
			Types._Real, 1, org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__1__sub_ = new ExecutorOperation("-",
			Types._Real, 2, org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
		public static final ExecutorOperation _Real__0__sub_ = new ExecutorOperation("-",
			Types._Real, 3, org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___div_ = new ExecutorOperation("/",
			Types._Real, 4, org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___lt_ = new ExecutorOperation("<",
			Types._Real, 5, org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___lt__eq_ = new ExecutorOperation("<=",
			Types._Real, 6, org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___lt__gt_ = new ExecutorOperation("<>",
			Types._Real, 7, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___eq_ = new ExecutorOperation("=",
			Types._Real, 8, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___gt_ = new ExecutorOperation(">",
			Types._Real, 9, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___gt__eq_ = new ExecutorOperation(">=",
			Types._Real, 10, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__abs = new ExecutorOperation("abs",
			Types._Real, 11, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Real__compareTo = new ExecutorOperation("compareTo",
			Types._Real, 12, org.eclipse.ocl.examples.library.real.RealCompareToOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__floor = new ExecutorOperation("floor",
			Types._Real, 13, org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
		public static final ExecutorOperation _Real__max = new ExecutorOperation("max",
			Types._Real, 14, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__min = new ExecutorOperation("min",
			Types._Real, 15, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__round = new ExecutorOperation("round",
			Types._Real, 16, org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
		public static final ExecutorOperation _Real__toString = new ExecutorOperation("toString",
			Types._Real, 17, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _Sequence___lt__gt_ = new ExecutorOperation("<>",
			Types._Sequence, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Sequence___eq_ = new ExecutorOperation("=",
			Types._Sequence, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Sequence__append = new ExecutorOperation("append",
			Types._Sequence, 2, org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Sequence_T);
		public static final ExecutorOperation _Sequence__excluding = new ExecutorOperation("excluding",
			Types._Sequence, 3, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __Sequence__flatten_T2 = new ExecutorTypeParameter("T2");
		public static final ExecutorOperation _Sequence__flatten = new ExecutorOperation("flatten",
			Types._Sequence, 4, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__including = new ExecutorOperation("including",
			Types._Sequence, 5, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Sequence_T);
		public static final ExecutorOperation _Sequence__insertAt = new ExecutorOperation("insertAt",
			Types._Sequence, 6, org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Sequence_T);
		public static final ExecutorOperation _Sequence__prepend = new ExecutorOperation("prepend",
			Types._Sequence, 7, org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Sequence_T);
		public static final ExecutorOperation _Sequence__reject = new ExecutorOperation("reject",
			Types._Sequence, 8, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorOperation _Sequence__reverse = new ExecutorOperation("reverse",
			Types._Sequence, 9, org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__select = new ExecutorOperation("select",
			Types._Sequence, 10, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorOperation _Sequence__subSequence = new ExecutorOperation("subSequence",
			Types._Sequence, 11, org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _Sequence__union = new ExecutorOperation("union",
			Types._Sequence, 12, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType("Sequence", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Sequence_T));
	
		public static final ExecutorOperation _Set___sub_ = new ExecutorOperation("-",
			Types._Set, 0, org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE,
				new ExecutorSpecializedType("Set", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny));
		public static final ExecutorOperation _Set___lt__gt_ = new ExecutorOperation("<>",
			Types._Set, 1, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Set___eq_ = new ExecutorOperation("=",
			Types._Set, 2, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Set__excluding = new ExecutorOperation("excluding",
			Types._Set, 3, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __Set__flatten_T2 = new ExecutorTypeParameter("T2");
		public static final ExecutorOperation _Set__flatten = new ExecutorOperation("flatten",
			Types._Set, 4, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Set__including = new ExecutorOperation("including",
			Types._Set, 5, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Set_T);
		public static final ExecutorOperation _Set__intersection = new ExecutorOperation("intersection",
			Types._Set, 6, org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType("Set", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Set_T));
		public static final ExecutorOperation _Set__reject = new ExecutorOperation("reject",
			Types._Set, 7, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Set_T));
		public static final ExecutorOperation _Set__select = new ExecutorOperation("select",
			Types._Set, 8, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Set_T));
		public static final ExecutorOperation _Set__symmetricDifference = new ExecutorOperation("symmetricDifference",
			Types._Set, 9, org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE,
				new ExecutorSpecializedType("Set", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclAny));
	
		public static final ExecutorOperation _String___add_ = new ExecutorOperation("+",
			Types._String, 0, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String___lt_ = new ExecutorOperation("<",
			Types._String, 1, org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___lt__eq_ = new ExecutorOperation("<=",
			Types._String, 2, org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___lt__gt_ = new ExecutorOperation("<>",
			Types._String, 3, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___eq_ = new ExecutorOperation("=",
			Types._String, 4, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___gt_ = new ExecutorOperation(">",
			Types._String, 5, org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___gt__eq_ = new ExecutorOperation(">=",
			Types._String, 6, org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String__at = new ExecutorOperation("at",
			Types._String, 7, org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _String__characters = new ExecutorOperation("characters",
			Types._String, 8, org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
		public static final ExecutorOperation _String__compareTo = new ExecutorOperation("compareTo",
			Types._String, 9, org.eclipse.ocl.examples.library.string.StringCompareToOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String__concat = new ExecutorOperation("concat",
			Types._String, 10, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__equalsIgnoreCase = new ExecutorOperation("equalsIgnoreCase",
			Types._String, 11, org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__indexOf = new ExecutorOperation("indexOf",
			Types._String, 12, org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__size = new ExecutorOperation("size",
			Types._String, 13, org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
		public static final ExecutorOperation _String__substring = new ExecutorOperation("substring",
			Types._String, 14, org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _String__toBoolean = new ExecutorOperation("toBoolean",
			Types._String, 15, org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
		public static final ExecutorOperation _String__toInteger = new ExecutorOperation("toInteger",
			Types._String, 16, org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
		public static final ExecutorOperation _String__toLower = new ExecutorOperation("toLower",
			Types._String, 17, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toLowerCase = new ExecutorOperation("toLowerCase",
			Types._String, 18, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toReal = new ExecutorOperation("toReal",
			Types._String, 19, org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
		public static final ExecutorOperation _String__toString = new ExecutorOperation("toString",
			Types._String, 20, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpper = new ExecutorOperation("toUpper",
			Types._String, 21, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpperCase = new ExecutorOperation("toUpperCase",
			Types._String, 22, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
	
		public static final ExecutorOperation _UniqueCollection__sortedBy = new ExecutorOperation("sortedBy",
			Types._UniqueCollection, 0, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE,
				new ExecutorLambdaType("Lambda", org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._UniqueCollection_T));
	
		public static final ExecutorTypeParameter __UnlimitedNatural__oclAsType_TT = new ExecutorTypeParameter("TT");
		public static final ExecutorOperation _UnlimitedNatural__oclAsType = new ExecutorOperation("oclAsType",
			Types._UnlimitedNatural, 0, org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE,
				org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Types._AnyClassifier);
	}

	/**
	 *	The property descriptors for each property of each type.
	 */
	public static class Properties {
		
	
		
	
		
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		private static final ExecutorFragment[] _AnyClassifier =
		{
		    Fragments._AnyClassifier__OclAny /* 0 */,
		    Fragments._AnyClassifier__Class /* 1 */,
		    Fragments._AnyClassifier__AnyClassifier /* 2 */
		};
		private static final int[] __AnyClassifier = { 1,1,1 };
	
		private static final ExecutorFragment[] _Bag =
		{
		    Fragments._Bag__OclAny /* 0 */,
		    Fragments._Bag__Collection /* 1 */,
		    Fragments._Bag__NonOrderedCollection /* 2 */,
		    Fragments._Bag__NonUniqueCollection /* 2 */,
		    Fragments._Bag__Bag /* 3 */
		};
		private static final int[] __Bag = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _Boolean =
		{
		    Fragments._Boolean__OclAny /* 0 */,
		    Fragments._Boolean__Boolean /* 1 */
		};
		private static final int[] __Boolean = { 1,1 };
	
		private static final ExecutorFragment[] _Class =
		{
		    Fragments._Class__OclAny /* 0 */,
		    Fragments._Class__Class /* 1 */
		};
		private static final int[] __Class = { 1,1 };
	
		private static final ExecutorFragment[] _ClassClassifier =
		{
		    Fragments._ClassClassifier__OclAny /* 0 */,
		    Fragments._ClassClassifier__Class /* 1 */,
		    Fragments._ClassClassifier__AnyClassifier /* 2 */,
		    Fragments._ClassClassifier__ClassClassifier /* 3 */
		};
		private static final int[] __ClassClassifier = { 1,1,1,1 };
	
		private static final ExecutorFragment[] _Collection =
		{
		    Fragments._Collection__OclAny /* 0 */,
		    Fragments._Collection__Collection /* 1 */
		};
		private static final int[] __Collection = { 1,1 };
	
		private static final ExecutorFragment[] _CollectionClassifier =
		{
		    Fragments._CollectionClassifier__OclAny /* 0 */,
		    Fragments._CollectionClassifier__Class /* 1 */,
		    Fragments._CollectionClassifier__AnyClassifier /* 2 */,
		    Fragments._CollectionClassifier__CollectionClassifier /* 3 */
		};
		private static final int[] __CollectionClassifier = { 1,1,1,1 };
	
		private static final ExecutorFragment[] _Enumeration =
		{
		    Fragments._Enumeration__OclAny /* 0 */,
		    Fragments._Enumeration__Enumeration /* 1 */
		};
		private static final int[] __Enumeration = { 1,1 };
	
		private static final ExecutorFragment[] _EnumerationClassifier =
		{
		    Fragments._EnumerationClassifier__OclAny /* 0 */,
		    Fragments._EnumerationClassifier__Class /* 1 */,
		    Fragments._EnumerationClassifier__AnyClassifier /* 2 */,
		    Fragments._EnumerationClassifier__EnumerationClassifier /* 3 */
		};
		private static final int[] __EnumerationClassifier = { 1,1,1,1 };
	
		private static final ExecutorFragment[] _EnumerationLiteral =
		{
		    Fragments._EnumerationLiteral__OclAny /* 0 */,
		    Fragments._EnumerationLiteral__EnumerationLiteral /* 1 */
		};
		private static final int[] __EnumerationLiteral = { 1,1 };
	
		private static final ExecutorFragment[] _Integer =
		{
		    Fragments._Integer__OclAny /* 0 */,
		    Fragments._Integer__OclSummable /* 1 */,
		    Fragments._Integer__OclComparable /* 1 */,
		    Fragments._Integer__Real /* 2 */,
		    Fragments._Integer__Integer /* 3 */
		};
		private static final int[] __Integer = { 1,2,1,1 };
	
		private static final ExecutorFragment[] _NonOrderedCollection =
		{
		    Fragments._NonOrderedCollection__OclAny /* 0 */,
		    Fragments._NonOrderedCollection__Collection /* 1 */,
		    Fragments._NonOrderedCollection__NonOrderedCollection /* 2 */
		};
		private static final int[] __NonOrderedCollection = { 1,1,1 };
	
		private static final ExecutorFragment[] _NonUniqueCollection =
		{
		    Fragments._NonUniqueCollection__OclAny /* 0 */,
		    Fragments._NonUniqueCollection__Collection /* 1 */,
		    Fragments._NonUniqueCollection__NonUniqueCollection /* 2 */
		};
		private static final int[] __NonUniqueCollection = { 1,1,1 };
	
		private static final ExecutorFragment[] _OclAny =
		{
		    Fragments._OclAny__OclAny /* 0 */
		};
		private static final int[] __OclAny = { 1 };
	
		private static final ExecutorFragment[] _OclComparable =
		{
		    Fragments._OclComparable__OclAny /* 0 */,
		    Fragments._OclComparable__OclComparable /* 1 */
		};
		private static final int[] __OclComparable = { 1,1 };
	
		private static final ExecutorFragment[] _OclElement =
		{
		    Fragments._OclElement__OclAny /* 0 */,
		    Fragments._OclElement__OclElement /* 1 */
		};
		private static final int[] __OclElement = { 1,1 };
	
		private static final ExecutorFragment[] _OclInvalid =
		{
		    Fragments._OclInvalid__OclAny /* 0 */,
		    Fragments._OclInvalid__OclVoid /* 1 */,
		    Fragments._OclInvalid__OclInvalid /* 2 */
		};
		private static final int[] __OclInvalid = { 1,1,1 };
	
		private static final ExecutorFragment[] _OclLambda =
		{
		    Fragments._OclLambda__OclAny /* 0 */,
		    Fragments._OclLambda__OclLambda /* 1 */
		};
		private static final int[] __OclLambda = { 1,1 };
	
		private static final ExecutorFragment[] _OclMessage =
		{
		    Fragments._OclMessage__OclAny /* 0 */,
		    Fragments._OclMessage__OclMessage /* 1 */
		};
		private static final int[] __OclMessage = { 1,1 };
	
		private static final ExecutorFragment[] _OclSelf =
		{
		    Fragments._OclSelf__OclAny /* 0 */,
		    Fragments._OclSelf__OclSelf /* 1 */
		};
		private static final int[] __OclSelf = { 1,1 };
	
		private static final ExecutorFragment[] _OclState =
		{
		    Fragments._OclState__OclAny /* 0 */,
		    Fragments._OclState__OclState /* 1 */
		};
		private static final int[] __OclState = { 1,1 };
	
		private static final ExecutorFragment[] _OclSummable =
		{
		    Fragments._OclSummable__OclAny /* 0 */,
		    Fragments._OclSummable__OclSummable /* 1 */
		};
		private static final int[] __OclSummable = { 1,1 };
	
		private static final ExecutorFragment[] _OclTuple =
		{
		    Fragments._OclTuple__OclAny /* 0 */,
		    Fragments._OclTuple__OclTuple /* 1 */
		};
		private static final int[] __OclTuple = { 1,1 };
	
		private static final ExecutorFragment[] _OclVoid =
		{
		    Fragments._OclVoid__OclAny /* 0 */,
		    Fragments._OclVoid__OclVoid /* 1 */
		};
		private static final int[] __OclVoid = { 1,1 };
	
		private static final ExecutorFragment[] _OrderedCollection =
		{
		    Fragments._OrderedCollection__OclAny /* 0 */,
		    Fragments._OrderedCollection__Collection /* 1 */,
		    Fragments._OrderedCollection__OrderedCollection /* 2 */
		};
		private static final int[] __OrderedCollection = { 1,1,1 };
	
		private static final ExecutorFragment[] _OrderedSet =
		{
		    Fragments._OrderedSet__OclAny /* 0 */,
		    Fragments._OrderedSet__Collection /* 1 */,
		    Fragments._OrderedSet__UniqueCollection /* 2 */,
		    Fragments._OrderedSet__OrderedCollection /* 2 */,
		    Fragments._OrderedSet__OrderedSet /* 3 */
		};
		private static final int[] __OrderedSet = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _Real =
		{
		    Fragments._Real__OclAny /* 0 */,
		    Fragments._Real__OclSummable /* 1 */,
		    Fragments._Real__OclComparable /* 1 */,
		    Fragments._Real__Real /* 2 */
		};
		private static final int[] __Real = { 1,2,1 };
	
		private static final ExecutorFragment[] _Sequence =
		{
		    Fragments._Sequence__OclAny /* 0 */,
		    Fragments._Sequence__Collection /* 1 */,
		    Fragments._Sequence__NonUniqueCollection /* 2 */,
		    Fragments._Sequence__OrderedCollection /* 2 */,
		    Fragments._Sequence__Sequence /* 3 */
		};
		private static final int[] __Sequence = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _Set =
		{
		    Fragments._Set__OclAny /* 0 */,
		    Fragments._Set__Collection /* 1 */,
		    Fragments._Set__NonOrderedCollection /* 2 */,
		    Fragments._Set__UniqueCollection /* 2 */,
		    Fragments._Set__Set /* 3 */
		};
		private static final int[] __Set = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _String =
		{
		    Fragments._String__OclAny /* 0 */,
		    Fragments._String__OclSummable /* 1 */,
		    Fragments._String__OclComparable /* 1 */,
		    Fragments._String__String /* 2 */
		};
		private static final int[] __String = { 1,2,1 };
	
		private static final ExecutorFragment[] _UniqueCollection =
		{
		    Fragments._UniqueCollection__OclAny /* 0 */,
		    Fragments._UniqueCollection__Collection /* 1 */,
		    Fragments._UniqueCollection__UniqueCollection /* 2 */
		};
		private static final int[] __UniqueCollection = { 1,1,1 };
	
		private static final ExecutorFragment[] _UnlimitedNatural =
		{
		    Fragments._UnlimitedNatural__OclAny /* 0 */,
		    Fragments._UnlimitedNatural__OclSummable /* 1 */,
		    Fragments._UnlimitedNatural__OclComparable /* 1 */,
		    Fragments._UnlimitedNatural__Real /* 2 */,
		    Fragments._UnlimitedNatural__Integer /* 3 */,
		    Fragments._UnlimitedNatural__UnlimitedNatural /* 4 */
		};
		private static final int[] __UnlimitedNatural = { 1,2,1,1,1 };
	
		private static final ExecutorFragment[] __Dummy =
		{
		    Fragments.__Dummy___Dummy /* 0 */
		};
		private static final int[] ___Dummy = { 1 };
	
		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AnyClassifier.initFragments(_AnyClassifier, __AnyClassifier);
			Types._Bag.initFragments(_Bag, __Bag);
			Types._Boolean.initFragments(_Boolean, __Boolean);
			Types._Class.initFragments(_Class, __Class);
			Types._ClassClassifier.initFragments(_ClassClassifier, __ClassClassifier);
			Types._Collection.initFragments(_Collection, __Collection);
			Types._CollectionClassifier.initFragments(_CollectionClassifier, __CollectionClassifier);
			Types._Enumeration.initFragments(_Enumeration, __Enumeration);
			Types._EnumerationClassifier.initFragments(_EnumerationClassifier, __EnumerationClassifier);
			Types._EnumerationLiteral.initFragments(_EnumerationLiteral, __EnumerationLiteral);
			Types._Integer.initFragments(_Integer, __Integer);
			Types._NonOrderedCollection.initFragments(_NonOrderedCollection, __NonOrderedCollection);
			Types._NonUniqueCollection.initFragments(_NonUniqueCollection, __NonUniqueCollection);
			Types._OclAny.initFragments(_OclAny, __OclAny);
			Types._OclComparable.initFragments(_OclComparable, __OclComparable);
			Types._OclElement.initFragments(_OclElement, __OclElement);
			Types._OclInvalid.initFragments(_OclInvalid, __OclInvalid);
			Types._OclLambda.initFragments(_OclLambda, __OclLambda);
			Types._OclMessage.initFragments(_OclMessage, __OclMessage);
			Types._OclSelf.initFragments(_OclSelf, __OclSelf);
			Types._OclState.initFragments(_OclState, __OclState);
			Types._OclSummable.initFragments(_OclSummable, __OclSummable);
			Types._OclTuple.initFragments(_OclTuple, __OclTuple);
			Types._OclVoid.initFragments(_OclVoid, __OclVoid);
			Types._OrderedCollection.initFragments(_OrderedCollection, __OrderedCollection);
			Types._OrderedSet.initFragments(_OrderedSet, __OrderedSet);
			Types._Real.initFragments(_Real, __Real);
			Types._Sequence.initFragments(_Sequence, __Sequence);
			Types._Set.initFragments(_Set, __Set);
			Types._String.initFragments(_String, __String);
			Types._UniqueCollection.initFragments(_UniqueCollection, __UniqueCollection);
			Types._UnlimitedNatural.initFragments(_UnlimitedNatural, __UnlimitedNatural);
			Types.__Dummy.initFragments(__Dummy, ___Dummy);
		}
	
		public static void init() {}
	}
	

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		private static final ExecutorOperation[] _AnyClassifier__AnyClassifier = {};
		private static final ExecutorOperation[] _AnyClassifier__Class = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _AnyClassifier__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Bag__Bag = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__select /* select(T|Lambda T() : Boolean) */
		};
		private static final ExecutorOperation[] _Bag__Collection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__iterate /* iterate<Tacc>(T;Tacc) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__max /* max() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__min /* min() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__product /* product<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Bag__NonOrderedCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__closure /* closure(T|Lambda T() : Set(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__0_intersection /* intersection(Bag(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__1_intersection /* intersection(Set(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__0_union /* union(Bag(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__1_union /* union(Set(T)) */
		};
		private static final ExecutorOperation[] _Bag__NonUniqueCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */
		};
		private static final ExecutorOperation[] _Bag__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Boolean__Boolean = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean__allInstances /* allInstances() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean__and /* _'and'(Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean__implies /* _'implies'(Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean__not /* _'not'() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean__or /* _'or'(Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean__toString /* toString() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean__xor /* _'xor'(Boolean) */
		};
		private static final ExecutorOperation[] _Boolean__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Class__Class = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Class__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _ClassClassifier__ClassClassifier = {};
		private static final ExecutorOperation[] _ClassClassifier__AnyClassifier = {};
		private static final ExecutorOperation[] _ClassClassifier__Class = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ClassClassifier__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Collection__Collection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__iterate /* iterate<Tacc>(T;Tacc) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__max /* max() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__min /* min() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__product /* product<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Collection__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _CollectionClassifier__CollectionClassifier = {};
		private static final ExecutorOperation[] _CollectionClassifier__AnyClassifier = {};
		private static final ExecutorOperation[] _CollectionClassifier__Class = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionClassifier__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Enumeration__Enumeration = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Enumeration__allInstances /* allInstances() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Enumeration__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Enumeration__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Enumeration__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _EnumerationClassifier__EnumerationClassifier = {};
		private static final ExecutorOperation[] _EnumerationClassifier__AnyClassifier = {};
		private static final ExecutorOperation[] _EnumerationClassifier__Class = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _EnumerationClassifier__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _EnumerationLiteral__EnumerationLiteral = {};
		private static final ExecutorOperation[] _EnumerationLiteral__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Integer__Integer = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__0__sub_ /* _'-'() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__abs /* abs() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__div /* div(Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__max /* max(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__min /* min(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__mod /* mod(Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
		private static final ExecutorOperation[] _Integer__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Integer__OclComparable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _Integer__OclSummable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final ExecutorOperation[] _Integer__Real = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__0__sub_ /* _'-'() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__abs /* abs() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__floor /* floor() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__max /* max(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__min /* min(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__round /* round() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _NonOrderedCollection__NonOrderedCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__closure /* closure(T|Lambda T() : Set(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__0_intersection /* intersection(Bag(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__1_intersection /* intersection(Set(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__0_union /* union(Bag(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__1_union /* union(Set(T)) */
		};
		private static final ExecutorOperation[] _NonOrderedCollection__Collection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__iterate /* iterate<Tacc>(T;Tacc) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__max /* max() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__min /* min() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__product /* product<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _NonOrderedCollection__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _NonUniqueCollection__NonUniqueCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */
		};
		private static final ExecutorOperation[] _NonUniqueCollection__Collection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__iterate /* iterate<Tacc>(T;Tacc) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__max /* max() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__min /* min() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__product /* product<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _NonUniqueCollection__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclAny__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclComparable__OclComparable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _OclComparable__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclElement__OclElement = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer<U>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclElement__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _OclElement__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclInvalid__OclInvalid = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid__allInstances /* allInstances() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid__oclBadOperation /* oclBadOperation() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclInvalid__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OclInvalid__OclVoid = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid__allInstances /* allInstances() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid__and /* _'and'(Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid__implies /* _'implies'(Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid__or /* _'or'(Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclInvalid__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclLambda__OclLambda = {};
		private static final ExecutorOperation[] _OclLambda__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclMessage__OclMessage = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclMessage__hasReturned /* hasReturned() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclMessage__isOperationCall /* isOperationCall() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclMessage__isSignalSent /* isSignalSent() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclMessage__result /* result() */
		};
		private static final ExecutorOperation[] _OclMessage__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclSelf__OclSelf = {};
		private static final ExecutorOperation[] _OclSelf__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclState__OclState = {};
		private static final ExecutorOperation[] _OclState__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclSummable__OclSummable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final ExecutorOperation[] _OclSummable__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclTuple__OclTuple = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclTuple___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclTuple___eq_ /* _'='(OclSelf) */
		};
		private static final ExecutorOperation[] _OclTuple__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclTuple___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclTuple___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclVoid__OclVoid = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid__allInstances /* allInstances() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid__and /* _'and'(Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid__implies /* _'implies'(Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid__or /* _'or'(Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclVoid__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclVoid___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OrderedCollection__OrderedCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__at /* at(Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__closure /* closure(T|Lambda T() : OrderedSet(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__first /* first() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__indexOf /* indexOf(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__last /* last() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__reverse /* reverse() */
		};
		private static final ExecutorOperation[] _OrderedCollection__Collection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__iterate /* iterate<Tacc>(T;Tacc) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__max /* max() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__min /* min() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__product /* product<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _OrderedCollection__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OrderedSet__OrderedSet = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet___sub_ /* _'-'(Set(OclAny)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__append /* append(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__insertAt /* insertAt(Integer,T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__intersection /* intersection(Set(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__prepend /* prepend(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__reverse /* reverse() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__subOrderedSet /* subOrderedSet(Integer,Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__symmetricDifference /* symmetricDifference(Set(OclAny)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__0_union /* union(OrderedSet(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__1_union /* union(Set(T)) */
		};
		private static final ExecutorOperation[] _OrderedSet__Collection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__iterate /* iterate<Tacc>(T;Tacc) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__max /* max() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__min /* min() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__product /* product<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._UniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _OrderedSet__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OrderedSet__OrderedCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__at /* at(Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__closure /* closure(T|Lambda T() : OrderedSet(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__first /* first() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__indexOf /* indexOf(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__last /* last() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedSet__reverse /* reverse() */
		};
		private static final ExecutorOperation[] _OrderedSet__UniqueCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._UniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */
		};
	
		private static final ExecutorOperation[] _Real__Real = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___mul_ /* _'*'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___add_ /* _'+'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__1__sub_ /* _'-'() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__0__sub_ /* _'-'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___div_ /* _'/'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__abs /* abs() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__compareTo /* compareTo(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__floor /* floor() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__max /* max(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__min /* min(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__round /* round() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__toString /* toString() */
		};
		private static final ExecutorOperation[] _Real__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Real__OclComparable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _Real__OclSummable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
	
		private static final ExecutorOperation[] _Sequence__Sequence = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__append /* append(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__insertAt /* insertAt(Integer,T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__prepend /* prepend(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__reverse /* reverse() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__subSequence /* subSequence(Integer,Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__union /* union(Sequence(T)) */
		};
		private static final ExecutorOperation[] _Sequence__Collection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__iterate /* iterate<Tacc>(T;Tacc) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__max /* max() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__min /* min() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__product /* product<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Sequence__NonUniqueCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */
		};
		private static final ExecutorOperation[] _Sequence__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Sequence__OrderedCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__at /* at(Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__closure /* closure(T|Lambda T() : OrderedSet(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__first /* first() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__indexOf /* indexOf(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OrderedCollection__last /* last() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Sequence__reverse /* reverse() */
		};
	
		private static final ExecutorOperation[] _Set__Set = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set___sub_ /* _'-'(Set(OclAny)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__intersection /* intersection(Set(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__symmetricDifference /* symmetricDifference(Set(OclAny)) */
		};
		private static final ExecutorOperation[] _Set__Collection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__iterate /* iterate<Tacc>(T;Tacc) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__max /* max() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__min /* min() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__product /* product<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._UniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Set__NonOrderedCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__closure /* closure(T|Lambda T() : Set(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__0_intersection /* intersection(Bag(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set__intersection /* intersection(Set(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__0_union /* union(Bag(T)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._NonOrderedCollection__1_union /* union(Set(T)) */
		};
		private static final ExecutorOperation[] _Set__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Set__UniqueCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._UniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */
		};
	
		private static final ExecutorOperation[] _String__String = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String___add_ /* _'+'(String) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__at /* at(Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__characters /* characters() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__concat /* concat(String) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__equalsIgnoreCase /* equalsIgnoreCase(String) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__indexOf /* indexOf(String) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__substring /* substring(Integer,Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__toBoolean /* toBoolean() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__toInteger /* toInteger() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__toLower /* toLower() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__toLowerCase /* toLowerCase() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__toReal /* toReal() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__toString /* toString() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__toUpper /* toUpper() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__toUpperCase /* toUpperCase() */
		};
		private static final ExecutorOperation[] _String__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _String__OclComparable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _String__OclSummable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
	
		private static final ExecutorOperation[] _UniqueCollection__UniqueCollection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._UniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */
		};
		private static final ExecutorOperation[] _UniqueCollection__Collection = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__collectNested /* collectNested<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__collect /* collect<V>(T|Lambda T() : V) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__flatten /* flatten<T2>() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__including /* including(T) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__iterate /* iterate<Tacc>(T;Tacc) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__max /* max() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__min /* min() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__product /* product<T2>(Collection(T2)) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__reject /* reject(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__select /* select(T|Lambda T() : Boolean) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__size /* size() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._UniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _UniqueCollection__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Collection__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _UnlimitedNatural__UnlimitedNatural = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._UnlimitedNatural__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__Integer = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__0__sub_ /* _'-'() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__abs /* abs() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__div /* div(Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__max /* max(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__min /* min(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__mod /* mod(Integer) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__OclAny = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._UnlimitedNatural__oclAsType /* oclAsType<TT>(AnyClassifier<TT>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(AnyClassifier<T>) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__OclComparable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__OclSummable = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__Real = {
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__0__sub_ /* _'-'() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__abs /* abs() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__floor /* floor() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__max /* max(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__min /* min(OclSelf) */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Real__round /* round() */,
		    org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
	
		private static final ExecutorOperation[] __Dummy___Dummy = {};
	
		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AnyClassifier__AnyClassifier.initOperations(_AnyClassifier__AnyClassifier);
			Fragments._AnyClassifier__Class.initOperations(_AnyClassifier__Class);
			Fragments._AnyClassifier__OclAny.initOperations(_AnyClassifier__OclAny);
	
			Fragments._Bag__Bag.initOperations(_Bag__Bag);
			Fragments._Bag__Collection.initOperations(_Bag__Collection);
			Fragments._Bag__NonOrderedCollection.initOperations(_Bag__NonOrderedCollection);
			Fragments._Bag__NonUniqueCollection.initOperations(_Bag__NonUniqueCollection);
			Fragments._Bag__OclAny.initOperations(_Bag__OclAny);
	
			Fragments._Boolean__Boolean.initOperations(_Boolean__Boolean);
			Fragments._Boolean__OclAny.initOperations(_Boolean__OclAny);
	
			Fragments._Class__Class.initOperations(_Class__Class);
			Fragments._Class__OclAny.initOperations(_Class__OclAny);
	
			Fragments._ClassClassifier__AnyClassifier.initOperations(_ClassClassifier__AnyClassifier);
			Fragments._ClassClassifier__Class.initOperations(_ClassClassifier__Class);
			Fragments._ClassClassifier__ClassClassifier.initOperations(_ClassClassifier__ClassClassifier);
			Fragments._ClassClassifier__OclAny.initOperations(_ClassClassifier__OclAny);
	
			Fragments._Collection__Collection.initOperations(_Collection__Collection);
			Fragments._Collection__OclAny.initOperations(_Collection__OclAny);
	
			Fragments._CollectionClassifier__AnyClassifier.initOperations(_CollectionClassifier__AnyClassifier);
			Fragments._CollectionClassifier__Class.initOperations(_CollectionClassifier__Class);
			Fragments._CollectionClassifier__CollectionClassifier.initOperations(_CollectionClassifier__CollectionClassifier);
			Fragments._CollectionClassifier__OclAny.initOperations(_CollectionClassifier__OclAny);
	
			Fragments._Enumeration__Enumeration.initOperations(_Enumeration__Enumeration);
			Fragments._Enumeration__OclAny.initOperations(_Enumeration__OclAny);
	
			Fragments._EnumerationClassifier__AnyClassifier.initOperations(_EnumerationClassifier__AnyClassifier);
			Fragments._EnumerationClassifier__Class.initOperations(_EnumerationClassifier__Class);
			Fragments._EnumerationClassifier__EnumerationClassifier.initOperations(_EnumerationClassifier__EnumerationClassifier);
			Fragments._EnumerationClassifier__OclAny.initOperations(_EnumerationClassifier__OclAny);
	
			Fragments._EnumerationLiteral__EnumerationLiteral.initOperations(_EnumerationLiteral__EnumerationLiteral);
			Fragments._EnumerationLiteral__OclAny.initOperations(_EnumerationLiteral__OclAny);
	
			Fragments._Integer__Integer.initOperations(_Integer__Integer);
			Fragments._Integer__OclAny.initOperations(_Integer__OclAny);
			Fragments._Integer__OclComparable.initOperations(_Integer__OclComparable);
			Fragments._Integer__OclSummable.initOperations(_Integer__OclSummable);
			Fragments._Integer__Real.initOperations(_Integer__Real);
	
			Fragments._NonOrderedCollection__Collection.initOperations(_NonOrderedCollection__Collection);
			Fragments._NonOrderedCollection__NonOrderedCollection.initOperations(_NonOrderedCollection__NonOrderedCollection);
			Fragments._NonOrderedCollection__OclAny.initOperations(_NonOrderedCollection__OclAny);
	
			Fragments._NonUniqueCollection__Collection.initOperations(_NonUniqueCollection__Collection);
			Fragments._NonUniqueCollection__NonUniqueCollection.initOperations(_NonUniqueCollection__NonUniqueCollection);
			Fragments._NonUniqueCollection__OclAny.initOperations(_NonUniqueCollection__OclAny);
	
			Fragments._OclAny__OclAny.initOperations(_OclAny__OclAny);
	
			Fragments._OclComparable__OclAny.initOperations(_OclComparable__OclAny);
			Fragments._OclComparable__OclComparable.initOperations(_OclComparable__OclComparable);
	
			Fragments._OclElement__OclAny.initOperations(_OclElement__OclAny);
			Fragments._OclElement__OclElement.initOperations(_OclElement__OclElement);
	
			Fragments._OclInvalid__OclAny.initOperations(_OclInvalid__OclAny);
			Fragments._OclInvalid__OclInvalid.initOperations(_OclInvalid__OclInvalid);
			Fragments._OclInvalid__OclVoid.initOperations(_OclInvalid__OclVoid);
	
			Fragments._OclLambda__OclAny.initOperations(_OclLambda__OclAny);
			Fragments._OclLambda__OclLambda.initOperations(_OclLambda__OclLambda);
	
			Fragments._OclMessage__OclAny.initOperations(_OclMessage__OclAny);
			Fragments._OclMessage__OclMessage.initOperations(_OclMessage__OclMessage);
	
			Fragments._OclSelf__OclAny.initOperations(_OclSelf__OclAny);
			Fragments._OclSelf__OclSelf.initOperations(_OclSelf__OclSelf);
	
			Fragments._OclState__OclAny.initOperations(_OclState__OclAny);
			Fragments._OclState__OclState.initOperations(_OclState__OclState);
	
			Fragments._OclSummable__OclAny.initOperations(_OclSummable__OclAny);
			Fragments._OclSummable__OclSummable.initOperations(_OclSummable__OclSummable);
	
			Fragments._OclTuple__OclAny.initOperations(_OclTuple__OclAny);
			Fragments._OclTuple__OclTuple.initOperations(_OclTuple__OclTuple);
	
			Fragments._OclVoid__OclAny.initOperations(_OclVoid__OclAny);
			Fragments._OclVoid__OclVoid.initOperations(_OclVoid__OclVoid);
	
			Fragments._OrderedCollection__Collection.initOperations(_OrderedCollection__Collection);
			Fragments._OrderedCollection__OclAny.initOperations(_OrderedCollection__OclAny);
			Fragments._OrderedCollection__OrderedCollection.initOperations(_OrderedCollection__OrderedCollection);
	
			Fragments._OrderedSet__Collection.initOperations(_OrderedSet__Collection);
			Fragments._OrderedSet__OclAny.initOperations(_OrderedSet__OclAny);
			Fragments._OrderedSet__OrderedCollection.initOperations(_OrderedSet__OrderedCollection);
			Fragments._OrderedSet__OrderedSet.initOperations(_OrderedSet__OrderedSet);
			Fragments._OrderedSet__UniqueCollection.initOperations(_OrderedSet__UniqueCollection);
	
			Fragments._Real__OclAny.initOperations(_Real__OclAny);
			Fragments._Real__OclComparable.initOperations(_Real__OclComparable);
			Fragments._Real__OclSummable.initOperations(_Real__OclSummable);
			Fragments._Real__Real.initOperations(_Real__Real);
	
			Fragments._Sequence__Collection.initOperations(_Sequence__Collection);
			Fragments._Sequence__NonUniqueCollection.initOperations(_Sequence__NonUniqueCollection);
			Fragments._Sequence__OclAny.initOperations(_Sequence__OclAny);
			Fragments._Sequence__OrderedCollection.initOperations(_Sequence__OrderedCollection);
			Fragments._Sequence__Sequence.initOperations(_Sequence__Sequence);
	
			Fragments._Set__Collection.initOperations(_Set__Collection);
			Fragments._Set__NonOrderedCollection.initOperations(_Set__NonOrderedCollection);
			Fragments._Set__OclAny.initOperations(_Set__OclAny);
			Fragments._Set__Set.initOperations(_Set__Set);
			Fragments._Set__UniqueCollection.initOperations(_Set__UniqueCollection);
	
			Fragments._String__OclAny.initOperations(_String__OclAny);
			Fragments._String__OclComparable.initOperations(_String__OclComparable);
			Fragments._String__OclSummable.initOperations(_String__OclSummable);
			Fragments._String__String.initOperations(_String__String);
	
			Fragments._UniqueCollection__Collection.initOperations(_UniqueCollection__Collection);
			Fragments._UniqueCollection__OclAny.initOperations(_UniqueCollection__OclAny);
			Fragments._UniqueCollection__UniqueCollection.initOperations(_UniqueCollection__UniqueCollection);
	
			Fragments._UnlimitedNatural__Integer.initOperations(_UnlimitedNatural__Integer);
			Fragments._UnlimitedNatural__OclAny.initOperations(_UnlimitedNatural__OclAny);
			Fragments._UnlimitedNatural__OclComparable.initOperations(_UnlimitedNatural__OclComparable);
			Fragments._UnlimitedNatural__OclSummable.initOperations(_UnlimitedNatural__OclSummable);
			Fragments._UnlimitedNatural__Real.initOperations(_UnlimitedNatural__Real);
			Fragments._UnlimitedNatural__UnlimitedNatural.initOperations(_UnlimitedNatural__UnlimitedNatural);
	
			Fragments.__Dummy___Dummy.initOperations(__Dummy___Dummy);
		}
	
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		private static final ExecutorProperty[] _AnyClassifier = {};
	
		private static final ExecutorProperty[] _Bag = {};
	
		private static final ExecutorProperty[] _Boolean = {};
	
		private static final ExecutorProperty[] _Class = {};
	
		private static final ExecutorProperty[] _ClassClassifier = {};
	
		private static final ExecutorProperty[] _Collection = {};
	
		private static final ExecutorProperty[] _CollectionClassifier = {};
	
		private static final ExecutorProperty[] _Enumeration = {};
	
		private static final ExecutorProperty[] _EnumerationClassifier = {};
	
		private static final ExecutorProperty[] _EnumerationLiteral = {};
	
		private static final ExecutorProperty[] _Integer = {};
	
		private static final ExecutorProperty[] _NonOrderedCollection = {};
	
		private static final ExecutorProperty[] _NonUniqueCollection = {};
	
		private static final ExecutorProperty[] _OclAny = {};
	
		private static final ExecutorProperty[] _OclComparable = {};
	
		private static final ExecutorProperty[] _OclElement = {};
	
		private static final ExecutorProperty[] _OclInvalid = {};
	
		private static final ExecutorProperty[] _OclLambda = {};
	
		private static final ExecutorProperty[] _OclMessage = {};
	
		private static final ExecutorProperty[] _OclSelf = {};
	
		private static final ExecutorProperty[] _OclState = {};
	
		private static final ExecutorProperty[] _OclSummable = {};
	
		private static final ExecutorProperty[] _OclTuple = {};
	
		private static final ExecutorProperty[] _OclVoid = {};
	
		private static final ExecutorProperty[] _OrderedCollection = {};
	
		private static final ExecutorProperty[] _OrderedSet = {};
	
		private static final ExecutorProperty[] _Real = {};
	
		private static final ExecutorProperty[] _Sequence = {};
	
		private static final ExecutorProperty[] _Set = {};
	
		private static final ExecutorProperty[] _String = {};
	
		private static final ExecutorProperty[] _UniqueCollection = {};
	
		private static final ExecutorProperty[] _UnlimitedNatural = {};
	
		private static final ExecutorProperty[] __Dummy = {};
	
		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
	  	 	Fragments._AnyClassifier__AnyClassifier.initProperties(_AnyClassifier);
	  	 	Fragments._Bag__Bag.initProperties(_Bag);
	  	 	Fragments._Boolean__Boolean.initProperties(_Boolean);
	  	 	Fragments._Class__Class.initProperties(_Class);
	  	 	Fragments._ClassClassifier__ClassClassifier.initProperties(_ClassClassifier);
	  	 	Fragments._Collection__Collection.initProperties(_Collection);
	  	 	Fragments._CollectionClassifier__CollectionClassifier.initProperties(_CollectionClassifier);
	  	 	Fragments._Enumeration__Enumeration.initProperties(_Enumeration);
	  	 	Fragments._EnumerationClassifier__EnumerationClassifier.initProperties(_EnumerationClassifier);
	  	 	Fragments._EnumerationLiteral__EnumerationLiteral.initProperties(_EnumerationLiteral);
	  	 	Fragments._Integer__Integer.initProperties(_Integer);
	  	 	Fragments._NonOrderedCollection__NonOrderedCollection.initProperties(_NonOrderedCollection);
	  	 	Fragments._NonUniqueCollection__NonUniqueCollection.initProperties(_NonUniqueCollection);
	  	 	Fragments._OclAny__OclAny.initProperties(_OclAny);
	  	 	Fragments._OclComparable__OclComparable.initProperties(_OclComparable);
	  	 	Fragments._OclElement__OclElement.initProperties(_OclElement);
	  	 	Fragments._OclInvalid__OclInvalid.initProperties(_OclInvalid);
	  	 	Fragments._OclLambda__OclLambda.initProperties(_OclLambda);
	  	 	Fragments._OclMessage__OclMessage.initProperties(_OclMessage);
	  	 	Fragments._OclSelf__OclSelf.initProperties(_OclSelf);
	  	 	Fragments._OclState__OclState.initProperties(_OclState);
	  	 	Fragments._OclSummable__OclSummable.initProperties(_OclSummable);
	  	 	Fragments._OclTuple__OclTuple.initProperties(_OclTuple);
	  	 	Fragments._OclVoid__OclVoid.initProperties(_OclVoid);
	  	 	Fragments._OrderedCollection__OrderedCollection.initProperties(_OrderedCollection);
	  	 	Fragments._OrderedSet__OrderedSet.initProperties(_OrderedSet);
	  	 	Fragments._Real__Real.initProperties(_Real);
	  	 	Fragments._Sequence__Sequence.initProperties(_Sequence);
	  	 	Fragments._Set__Set.initProperties(_Set);
	  	 	Fragments._String__String.initProperties(_String);
	  	 	Fragments._UniqueCollection__UniqueCollection.initProperties(_UniqueCollection);
	  	 	Fragments._UnlimitedNatural__UnlimitedNatural.initProperties(_UnlimitedNatural);
	  	 	Fragments.__Dummy___Dummy.initProperties(__Dummy);
		}
	
		public static void init() {}
	}
	
//	static {
//		Types.types[0].getClass();
//	}
}
