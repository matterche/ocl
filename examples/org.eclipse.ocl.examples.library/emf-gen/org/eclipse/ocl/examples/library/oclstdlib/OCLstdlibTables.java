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

import org.eclipse.ocl.examples.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorLambdaType;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorSpecializedType;
import org.eclipse.ocl.examples.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.executor.ExecutorTypeParameter;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

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
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OCLstdlibPackage.eINSTANCE);

/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = new ExecutorStandardLibrary(PACKAGE); 

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
	    private static final ExecutorTypeParameter _AnyClassifier_T = new ExecutorTypeParameter(LIBRARY, "T");
	    public static final EcoreExecutorType _AnyClassifier = new EcoreExecutorType("AnyClassifier", PACKAGE, 0, _AnyClassifier_T);
	    private static final ExecutorTypeParameter _Bag_T = new ExecutorTypeParameter(LIBRARY, "T");
	    public static final EcoreExecutorType _Bag = new EcoreExecutorType("Bag", PACKAGE, 0, _Bag_T);
	    public static final EcoreExecutorType _Boolean = new EcoreExecutorType("Boolean", PACKAGE, 0);
	    public static final EcoreExecutorType _Class = new EcoreExecutorType("Class", PACKAGE, 0);
	    private static final ExecutorTypeParameter _ClassClassifier_T = new ExecutorTypeParameter(LIBRARY, "T");
	    public static final EcoreExecutorType _ClassClassifier = new EcoreExecutorType("ClassClassifier", PACKAGE, 0, _ClassClassifier_T);
	    private static final ExecutorTypeParameter _Collection_T = new ExecutorTypeParameter(LIBRARY, "T");
	    public static final EcoreExecutorType _Collection = new EcoreExecutorType("Collection", PACKAGE, 0, _Collection_T);
	    private static final ExecutorTypeParameter _CollectionClassifier_T = new ExecutorTypeParameter(LIBRARY, "T");
	    private static final ExecutorTypeParameter _CollectionClassifier_E = new ExecutorTypeParameter(LIBRARY, "E");
	    public static final EcoreExecutorType _CollectionClassifier = new EcoreExecutorType("CollectionClassifier", PACKAGE, 0, _CollectionClassifier_T, _CollectionClassifier_E);
	    public static final EcoreExecutorType _Enumeration = new EcoreExecutorType("Enumeration", PACKAGE, 0);
	    private static final ExecutorTypeParameter _EnumerationClassifier_T = new ExecutorTypeParameter(LIBRARY, "T");
	    public static final EcoreExecutorType _EnumerationClassifier = new EcoreExecutorType("EnumerationClassifier", PACKAGE, 0, _EnumerationClassifier_T);
	    public static final EcoreExecutorType _EnumerationLiteral = new EcoreExecutorType("EnumerationLiteral", PACKAGE, 0);
	    public static final EcoreExecutorType _Integer = new EcoreExecutorType("Integer", PACKAGE, 0);
	    public static final EcoreExecutorType _OclAny = new EcoreExecutorType("OclAny", PACKAGE, 0);
	    public static final EcoreExecutorType _OclComparable = new EcoreExecutorType("OclComparable", PACKAGE, 0);
	    public static final EcoreExecutorType _OclElement = new EcoreExecutorType("OclElement", PACKAGE, 0);
	    public static final EcoreExecutorType _OclInvalid = new EcoreExecutorType("OclInvalid", PACKAGE, 0);
	    public static final EcoreExecutorType _OclLambda = new EcoreExecutorType("OclLambda", PACKAGE, 0);
	    public static final EcoreExecutorType _OclMessage = new EcoreExecutorType("OclMessage", PACKAGE, 0);
	    public static final EcoreExecutorType _OclSelf = new EcoreExecutorType("OclSelf", PACKAGE, 0);
	    public static final EcoreExecutorType _OclState = new EcoreExecutorType("OclState", PACKAGE, 0);
	    public static final EcoreExecutorType _OclSummable = new EcoreExecutorType("OclSummable", PACKAGE, 0);
	    public static final EcoreExecutorType _OclTuple = new EcoreExecutorType("OclTuple", PACKAGE, 0);
	    public static final EcoreExecutorType _OclType = new EcoreExecutorType("OclType", PACKAGE, 0);
	    public static final EcoreExecutorType _OclVoid = new EcoreExecutorType("OclVoid", PACKAGE, 0);
	    private static final ExecutorTypeParameter _OrderedSet_T = new ExecutorTypeParameter(LIBRARY, "T");
	    public static final EcoreExecutorType _OrderedSet = new EcoreExecutorType("OrderedSet", PACKAGE, ExecutorType.ORDERED | ExecutorType.UNIQUE, _OrderedSet_T);
	    public static final EcoreExecutorType _Real = new EcoreExecutorType("Real", PACKAGE, 0);
	    private static final ExecutorTypeParameter _Sequence_T = new ExecutorTypeParameter(LIBRARY, "T");
	    public static final EcoreExecutorType _Sequence = new EcoreExecutorType("Sequence", PACKAGE, ExecutorType.ORDERED, _Sequence_T);
	    private static final ExecutorTypeParameter _Set_T = new ExecutorTypeParameter(LIBRARY, "T");
	    public static final EcoreExecutorType _Set = new EcoreExecutorType("Set", PACKAGE, ExecutorType.UNIQUE, _Set_T);
	    public static final EcoreExecutorType _String = new EcoreExecutorType("String", PACKAGE, 0);
	    public static final EcoreExecutorType _Type = new EcoreExecutorType("Type", PACKAGE, 0);
	    private static final ExecutorTypeParameter _UniqueCollection_T = new ExecutorTypeParameter(LIBRARY, "T");
	    public static final EcoreExecutorType _UniqueCollection = new EcoreExecutorType("UniqueCollection", PACKAGE, 0, _UniqueCollection_T);
	    public static final EcoreExecutorType _UnlimitedNatural = new EcoreExecutorType("UnlimitedNatural", PACKAGE, 0);
	    public static final EcoreExecutorType __Dummy = new EcoreExecutorType("_Dummy", PACKAGE, 0);
	
		private static final EcoreExecutorType[] types = {
		    _AnyClassifier,
		    _Bag,
		    _Boolean,
		    _Class,
		    _ClassClassifier,
		    _Collection,
		    _CollectionClassifier,
		    _Enumeration,
		    _EnumerationClassifier,
		    _EnumerationLiteral,
		    _Integer,
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
		    _OclType,
		    _OclVoid,
		    _OrderedSet,
		    _Real,
		    _Sequence,
		    _Set,
		    _String,
		    _Type,
		    _UniqueCollection,
		    _UnlimitedNatural,
		    __Dummy
		};
	
		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			TypeFragments.init();
			FragmentOperations.init();
			FragmentProperties.init();
		}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		public static final ExecutorFragment _AnyClassifier__AnyClassifier = new ExecutorFragment(Types._AnyClassifier, OCLstdlibTables.Types._AnyClassifier);
		public static final ExecutorFragment _AnyClassifier__Class = new ExecutorFragment(Types._AnyClassifier, OCLstdlibTables.Types._Class);
		public static final ExecutorFragment _AnyClassifier__OclAny = new ExecutorFragment(Types._AnyClassifier, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _AnyClassifier__OclElement = new ExecutorFragment(Types._AnyClassifier, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _AnyClassifier__OclType = new ExecutorFragment(Types._AnyClassifier, OCLstdlibTables.Types._OclType);
		
		public static final ExecutorFragment _Bag__Bag = new ExecutorFragment(Types._Bag, OCLstdlibTables.Types._Bag);
		public static final ExecutorFragment _Bag__Collection = new ExecutorFragment(Types._Bag, OCLstdlibTables.Types._Collection);
		public static final ExecutorFragment _Bag__OclAny = new ExecutorFragment(Types._Bag, OCLstdlibTables.Types._OclAny);
		
		public static final ExecutorFragment _Boolean__Boolean = new ExecutorFragment(Types._Boolean, OCLstdlibTables.Types._Boolean);
		public static final ExecutorFragment _Boolean__OclAny = new ExecutorFragment(Types._Boolean, OCLstdlibTables.Types._OclAny);
		
		public static final ExecutorFragment _Class__Class = new ExecutorFragment(Types._Class, OCLstdlibTables.Types._Class);
		public static final ExecutorFragment _Class__OclAny = new ExecutorFragment(Types._Class, OCLstdlibTables.Types._OclAny);
		
		public static final ExecutorFragment _ClassClassifier__AnyClassifier = new ExecutorFragment(Types._ClassClassifier, OCLstdlibTables.Types._AnyClassifier);
		public static final ExecutorFragment _ClassClassifier__Class = new ExecutorFragment(Types._ClassClassifier, OCLstdlibTables.Types._Class);
		public static final ExecutorFragment _ClassClassifier__ClassClassifier = new ExecutorFragment(Types._ClassClassifier, OCLstdlibTables.Types._ClassClassifier);
		public static final ExecutorFragment _ClassClassifier__OclAny = new ExecutorFragment(Types._ClassClassifier, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _ClassClassifier__OclElement = new ExecutorFragment(Types._ClassClassifier, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _ClassClassifier__OclType = new ExecutorFragment(Types._ClassClassifier, OCLstdlibTables.Types._OclType);
		
		public static final ExecutorFragment _Collection__Collection = new ExecutorFragment(Types._Collection, OCLstdlibTables.Types._Collection);
		public static final ExecutorFragment _Collection__OclAny = new ExecutorFragment(Types._Collection, OCLstdlibTables.Types._OclAny);
		
		public static final ExecutorFragment _CollectionClassifier__AnyClassifier = new ExecutorFragment(Types._CollectionClassifier, OCLstdlibTables.Types._AnyClassifier);
		public static final ExecutorFragment _CollectionClassifier__Class = new ExecutorFragment(Types._CollectionClassifier, OCLstdlibTables.Types._Class);
		public static final ExecutorFragment _CollectionClassifier__CollectionClassifier = new ExecutorFragment(Types._CollectionClassifier, OCLstdlibTables.Types._CollectionClassifier);
		public static final ExecutorFragment _CollectionClassifier__OclAny = new ExecutorFragment(Types._CollectionClassifier, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _CollectionClassifier__OclElement = new ExecutorFragment(Types._CollectionClassifier, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _CollectionClassifier__OclType = new ExecutorFragment(Types._CollectionClassifier, OCLstdlibTables.Types._OclType);
		
		public static final ExecutorFragment _Enumeration__Enumeration = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._Enumeration);
		public static final ExecutorFragment _Enumeration__OclAny = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._OclAny);
		
		public static final ExecutorFragment _EnumerationClassifier__AnyClassifier = new ExecutorFragment(Types._EnumerationClassifier, OCLstdlibTables.Types._AnyClassifier);
		public static final ExecutorFragment _EnumerationClassifier__Class = new ExecutorFragment(Types._EnumerationClassifier, OCLstdlibTables.Types._Class);
		public static final ExecutorFragment _EnumerationClassifier__EnumerationClassifier = new ExecutorFragment(Types._EnumerationClassifier, OCLstdlibTables.Types._EnumerationClassifier);
		public static final ExecutorFragment _EnumerationClassifier__OclAny = new ExecutorFragment(Types._EnumerationClassifier, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _EnumerationClassifier__OclElement = new ExecutorFragment(Types._EnumerationClassifier, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _EnumerationClassifier__OclType = new ExecutorFragment(Types._EnumerationClassifier, OCLstdlibTables.Types._OclType);
		
		public static final ExecutorFragment _EnumerationLiteral__EnumerationLiteral = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._EnumerationLiteral);
		public static final ExecutorFragment _EnumerationLiteral__OclAny = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._OclAny);
		
		public static final ExecutorFragment _Integer__Integer = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._Integer);
		public static final ExecutorFragment _Integer__OclAny = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Integer__OclComparable = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._OclComparable);
		public static final ExecutorFragment _Integer__OclSummable = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._OclSummable);
		public static final ExecutorFragment _Integer__Real = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._Real);
		
		public static final ExecutorFragment _OclAny__OclAny = new ExecutorFragment(Types._OclAny, OCLstdlibTables.Types._OclAny);
		
		public static final ExecutorFragment _OclComparable__OclAny = new ExecutorFragment(Types._OclComparable, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclComparable__OclComparable = new ExecutorFragment(Types._OclComparable, OCLstdlibTables.Types._OclComparable);
		
		public static final ExecutorFragment _OclElement__OclAny = new ExecutorFragment(Types._OclElement, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclElement__OclElement = new ExecutorFragment(Types._OclElement, OCLstdlibTables.Types._OclElement);
		
		public static final ExecutorFragment _OclInvalid__OclAny = new ExecutorFragment(Types._OclInvalid, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclInvalid__OclInvalid = new ExecutorFragment(Types._OclInvalid, OCLstdlibTables.Types._OclInvalid);
		public static final ExecutorFragment _OclInvalid__OclVoid = new ExecutorFragment(Types._OclInvalid, OCLstdlibTables.Types._OclVoid);
		
		public static final ExecutorFragment _OclLambda__OclAny = new ExecutorFragment(Types._OclLambda, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclLambda__OclLambda = new ExecutorFragment(Types._OclLambda, OCLstdlibTables.Types._OclLambda);
		
		public static final ExecutorFragment _OclMessage__OclAny = new ExecutorFragment(Types._OclMessage, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclMessage__OclMessage = new ExecutorFragment(Types._OclMessage, OCLstdlibTables.Types._OclMessage);
		
		public static final ExecutorFragment _OclSelf__OclAny = new ExecutorFragment(Types._OclSelf, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclSelf__OclSelf = new ExecutorFragment(Types._OclSelf, OCLstdlibTables.Types._OclSelf);
		
		public static final ExecutorFragment _OclState__OclAny = new ExecutorFragment(Types._OclState, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclState__OclState = new ExecutorFragment(Types._OclState, OCLstdlibTables.Types._OclState);
		
		public static final ExecutorFragment _OclSummable__OclAny = new ExecutorFragment(Types._OclSummable, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclSummable__OclSummable = new ExecutorFragment(Types._OclSummable, OCLstdlibTables.Types._OclSummable);
		
		public static final ExecutorFragment _OclTuple__OclAny = new ExecutorFragment(Types._OclTuple, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclTuple__OclTuple = new ExecutorFragment(Types._OclTuple, OCLstdlibTables.Types._OclTuple);
		
		public static final ExecutorFragment _OclType__OclAny = new ExecutorFragment(Types._OclType, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclType__OclElement = new ExecutorFragment(Types._OclType, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _OclType__OclType = new ExecutorFragment(Types._OclType, OCLstdlibTables.Types._OclType);
		
		public static final ExecutorFragment _OclVoid__OclAny = new ExecutorFragment(Types._OclVoid, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OclVoid__OclVoid = new ExecutorFragment(Types._OclVoid, OCLstdlibTables.Types._OclVoid);
		
		public static final ExecutorFragment _OrderedSet__Collection = new ExecutorFragment(Types._OrderedSet, OCLstdlibTables.Types._Collection);
		public static final ExecutorFragment _OrderedSet__OclAny = new ExecutorFragment(Types._OrderedSet, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _OrderedSet__OrderedSet = new ExecutorFragment(Types._OrderedSet, OCLstdlibTables.Types._OrderedSet);
		public static final ExecutorFragment _OrderedSet__Sequence = new ExecutorFragment(Types._OrderedSet, OCLstdlibTables.Types._Sequence);
		public static final ExecutorFragment _OrderedSet__UniqueCollection = new ExecutorFragment(Types._OrderedSet, OCLstdlibTables.Types._UniqueCollection);
		
		public static final ExecutorFragment _Real__OclAny = new ExecutorFragment(Types._Real, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Real__OclComparable = new ExecutorFragment(Types._Real, OCLstdlibTables.Types._OclComparable);
		public static final ExecutorFragment _Real__OclSummable = new ExecutorFragment(Types._Real, OCLstdlibTables.Types._OclSummable);
		public static final ExecutorFragment _Real__Real = new ExecutorFragment(Types._Real, OCLstdlibTables.Types._Real);
		
		public static final ExecutorFragment _Sequence__Collection = new ExecutorFragment(Types._Sequence, OCLstdlibTables.Types._Collection);
		public static final ExecutorFragment _Sequence__OclAny = new ExecutorFragment(Types._Sequence, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Sequence__Sequence = new ExecutorFragment(Types._Sequence, OCLstdlibTables.Types._Sequence);
		
		public static final ExecutorFragment _Set__Bag = new ExecutorFragment(Types._Set, OCLstdlibTables.Types._Bag);
		public static final ExecutorFragment _Set__Collection = new ExecutorFragment(Types._Set, OCLstdlibTables.Types._Collection);
		public static final ExecutorFragment _Set__OclAny = new ExecutorFragment(Types._Set, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Set__Set = new ExecutorFragment(Types._Set, OCLstdlibTables.Types._Set);
		public static final ExecutorFragment _Set__UniqueCollection = new ExecutorFragment(Types._Set, OCLstdlibTables.Types._UniqueCollection);
		
		public static final ExecutorFragment _String__OclAny = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _String__OclComparable = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclComparable);
		public static final ExecutorFragment _String__OclSummable = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclSummable);
		public static final ExecutorFragment _String__String = new ExecutorFragment(Types._String, OCLstdlibTables.Types._String);
		
		public static final ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		public static final ExecutorFragment _Type__OclType = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclType);
		public static final ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._Type);
		
		public static final ExecutorFragment _UniqueCollection__Collection = new ExecutorFragment(Types._UniqueCollection, OCLstdlibTables.Types._Collection);
		public static final ExecutorFragment _UniqueCollection__OclAny = new ExecutorFragment(Types._UniqueCollection, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _UniqueCollection__UniqueCollection = new ExecutorFragment(Types._UniqueCollection, OCLstdlibTables.Types._UniqueCollection);
		
		public static final ExecutorFragment _UnlimitedNatural__Integer = new ExecutorFragment(Types._UnlimitedNatural, OCLstdlibTables.Types._Integer);
		public static final ExecutorFragment _UnlimitedNatural__OclAny = new ExecutorFragment(Types._UnlimitedNatural, OCLstdlibTables.Types._OclAny);
		public static final ExecutorFragment _UnlimitedNatural__OclComparable = new ExecutorFragment(Types._UnlimitedNatural, OCLstdlibTables.Types._OclComparable);
		public static final ExecutorFragment _UnlimitedNatural__OclSummable = new ExecutorFragment(Types._UnlimitedNatural, OCLstdlibTables.Types._OclSummable);
		public static final ExecutorFragment _UnlimitedNatural__Real = new ExecutorFragment(Types._UnlimitedNatural, OCLstdlibTables.Types._Real);
		public static final ExecutorFragment _UnlimitedNatural__UnlimitedNatural = new ExecutorFragment(Types._UnlimitedNatural, OCLstdlibTables.Types._UnlimitedNatural);
		
		public static final ExecutorFragment __Dummy___Dummy = new ExecutorFragment(Types.__Dummy, OCLstdlibTables.Types.__Dummy);
		
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
		public static final ExecutorOperation _Bag___lt__gt_ = new ExecutorOperation("<>",
			Types._Bag, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Bag___eq_ = new ExecutorOperation("=",
			Types._Bag, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Bag__closure = new ExecutorOperation("closure",
			Types._Bag, 2, org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Bag_T));
		public static final ExecutorTypeParameter __Bag__collect_V = new ExecutorTypeParameter(LIBRARY, "V");
		public static final ExecutorOperation _Bag__collect = new ExecutorOperation("collect",
			Types._Bag, 3, org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Bag_T));
		public static final ExecutorTypeParameter __Bag__collectNested_V = new ExecutorTypeParameter(LIBRARY, "V");
		public static final ExecutorOperation _Bag__collectNested = new ExecutorOperation("collectNested",
			Types._Bag, 4, org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Bag_T));
		public static final ExecutorOperation _Bag__excluding = new ExecutorOperation("excluding",
			Types._Bag, 5, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __Bag__flatten_T2 = new ExecutorTypeParameter(LIBRARY, "T2");
		public static final ExecutorOperation _Bag__flatten = new ExecutorOperation("flatten",
			Types._Bag, 6, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Bag__including = new ExecutorOperation("including",
			Types._Bag, 7, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				OCLstdlibTables.Types._Bag_T);
		public static final ExecutorOperation _Bag__0_intersection = new ExecutorOperation("intersection",
			Types._Bag, 8, org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Types._Bag_T));
		public static final ExecutorOperation _Bag__1_intersection = new ExecutorOperation("intersection",
			Types._Bag, 9, org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "UniqueCollection", OCLstdlibTables.Types._Bag_T));
		public static final ExecutorOperation _Bag__reject = new ExecutorOperation("reject",
			Types._Bag, 10, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Bag_T));
		public static final ExecutorOperation _Bag__select = new ExecutorOperation("select",
			Types._Bag, 11, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Bag_T));
		public static final ExecutorTypeParameter __Bag__selectByKind_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _Bag__selectByKind = new ExecutorOperation("selectByKind",
			Types._Bag, 12, org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__Bag__selectByKind_TT));
		public static final ExecutorTypeParameter __Bag__selectByType_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _Bag__selectByType = new ExecutorOperation("selectByType",
			Types._Bag, 13, org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__Bag__selectByType_TT));
		public static final ExecutorOperation _Bag__sortedBy = new ExecutorOperation("sortedBy",
			Types._Bag, 14, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Bag_T));
		public static final ExecutorOperation _Bag__0_union = new ExecutorOperation("union",
			Types._Bag, 15, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Types._Bag_T));
		public static final ExecutorOperation _Bag__1_union = new ExecutorOperation("union",
			Types._Bag, 16, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "UniqueCollection", OCLstdlibTables.Types._Bag_T));
	
		public static final ExecutorOperation _Boolean___lt__gt_ = new ExecutorOperation("<>",
			Types._Boolean, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Boolean___eq_ = new ExecutorOperation("=",
			Types._Boolean, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Boolean__and = new ExecutorOperation("and",
			Types._Boolean, 2, org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__implies = new ExecutorOperation("implies",
			Types._Boolean, 3, org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__not = new ExecutorOperation("not",
			Types._Boolean, 4, org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__or = new ExecutorOperation("or",
			Types._Boolean, 5, org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__xor = new ExecutorOperation("xor",
			Types._Boolean, 6, org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _Boolean__allInstances = new ExecutorOperation("allInstances",
			Types._Boolean, 7, org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__toString = new ExecutorOperation("toString",
			Types._Boolean, 8, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _Class__oclType = new ExecutorOperation("oclType",
			Types._Class, 0, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	
		public static final ExecutorOperation _Collection___lt__gt_ = new ExecutorOperation("<>",
			Types._Collection, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Collection___eq_ = new ExecutorOperation("=",
			Types._Collection, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Collection__any = new ExecutorOperation("any",
			Types._Collection, 2, org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__asBag = new ExecutorOperation("asBag",
			Types._Collection, 3, org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
		public static final ExecutorOperation _Collection__asOrderedSet = new ExecutorOperation("asOrderedSet",
			Types._Collection, 4, org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
		public static final ExecutorOperation _Collection__asSequence = new ExecutorOperation("asSequence",
			Types._Collection, 5, org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
		public static final ExecutorOperation _Collection__asSet = new ExecutorOperation("asSet",
			Types._Collection, 6, org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
		public static final ExecutorTypeParameter __Collection__collect_V = new ExecutorTypeParameter(LIBRARY, "V");
		public static final ExecutorOperation _Collection__collect = new ExecutorOperation("collect",
			Types._Collection, 7, org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorTypeParameter __Collection__collectNested_V = new ExecutorTypeParameter(LIBRARY, "V");
		public static final ExecutorOperation _Collection__collectNested = new ExecutorOperation("collectNested",
			Types._Collection, 8, org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__count = new ExecutorOperation("count",
			Types._Collection, 9, org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE,
				OCLstdlibTables.Types._OclAny);
		public static final ExecutorOperation _Collection__excludes = new ExecutorOperation("excludes",
			Types._Collection, 10, org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE,
				OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __Collection__excludesAll_T2 = new ExecutorTypeParameter(LIBRARY, "T2");
		public static final ExecutorOperation _Collection__excludesAll = new ExecutorOperation("excludesAll",
			Types._Collection, 11, org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Operations.__Collection__excludesAll_T2));
		public static final ExecutorOperation _Collection__excluding = new ExecutorOperation("excluding",
			Types._Collection, 12, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				OCLstdlibTables.Types._OclAny);
		public static final ExecutorOperation _Collection__1_exists = new ExecutorOperation("exists",
			Types._Collection, 13, org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__0_exists = new ExecutorOperation("exists",
			Types._Collection, 14, org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorTypeParameter __Collection__flatten_T2 = new ExecutorTypeParameter(LIBRARY, "T2");
		public static final ExecutorOperation _Collection__flatten = new ExecutorOperation("flatten",
			Types._Collection, 15, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Collection__1_forAll = new ExecutorOperation("forAll",
			Types._Collection, 16, org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__0_forAll = new ExecutorOperation("forAll",
			Types._Collection, 17, org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__includes = new ExecutorOperation("includes",
			Types._Collection, 18, org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE,
				OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __Collection__includesAll_T2 = new ExecutorTypeParameter(LIBRARY, "T2");
		public static final ExecutorOperation _Collection__includesAll = new ExecutorOperation("includesAll",
			Types._Collection, 19, org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Operations.__Collection__includesAll_T2));
		public static final ExecutorOperation _Collection__including = new ExecutorOperation("including",
			Types._Collection, 20, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				OCLstdlibTables.Types._Collection_T);
		public static final ExecutorOperation _Collection__isEmpty = new ExecutorOperation("isEmpty",
			Types._Collection, 21, org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
		public static final ExecutorOperation _Collection__isUnique = new ExecutorOperation("isUnique",
			Types._Collection, 22, org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorTypeParameter __Collection__iterate_Tacc = new ExecutorTypeParameter(LIBRARY, "Tacc");
		public static final ExecutorOperation _Collection__iterate = new ExecutorOperation("iterate",
			Types._Collection, 23, org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
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
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorTypeParameter __Collection__product_T2 = new ExecutorTypeParameter(LIBRARY, "T2");
		public static final ExecutorOperation _Collection__product = new ExecutorOperation("product",
			Types._Collection, 29, org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Operations.__Collection__product_T2));
		public static final ExecutorOperation _Collection__reject = new ExecutorOperation("reject",
			Types._Collection, 30, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__select = new ExecutorOperation("select",
			Types._Collection, 31, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorTypeParameter __Collection__selectByKind_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _Collection__selectByKind = new ExecutorOperation("selectByKind",
			Types._Collection, 32, org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__Collection__selectByKind_TT));
		public static final ExecutorTypeParameter __Collection__selectByType_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _Collection__selectByType = new ExecutorOperation("selectByType",
			Types._Collection, 33, org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__Collection__selectByType_TT));
		public static final ExecutorOperation _Collection__size = new ExecutorOperation("size",
			Types._Collection, 34, org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
		public static final ExecutorOperation _Collection__sortedBy = new ExecutorOperation("sortedBy",
			Types._Collection, 35, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Collection_T));
		public static final ExecutorOperation _Collection__sum = new ExecutorOperation("sum",
			Types._Collection, 36, org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
	
		public static final ExecutorOperation _Enumeration__allInstances = new ExecutorOperation("allInstances",
			Types._Enumeration, 0, org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _Enumeration__oclType = new ExecutorOperation("oclType",
			Types._Enumeration, 1, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	
		public static final ExecutorOperation _Integer___mul_ = new ExecutorOperation("*",
			Types._Integer, 0, org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer___add_ = new ExecutorOperation("+",
			Types._Integer, 1, org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__0__sub_ = new ExecutorOperation("-",
			Types._Integer, 2, org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
		public static final ExecutorOperation _Integer__1__sub_ = new ExecutorOperation("-",
			Types._Integer, 3, org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer___div_ = new ExecutorOperation("/",
			Types._Integer, 4, org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__abs = new ExecutorOperation("abs",
			Types._Integer, 5, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Integer__compareTo = new ExecutorOperation("compareTo",
			Types._Integer, 6, org.eclipse.ocl.examples.library.integer.IntegerCompareToOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__div = new ExecutorOperation("div",
			Types._Integer, 7, org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _Integer__max = new ExecutorOperation("max",
			Types._Integer, 8, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__min = new ExecutorOperation("min",
			Types._Integer, 9, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Integer__mod = new ExecutorOperation("mod",
			Types._Integer, 10, org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _Integer__toString = new ExecutorOperation("toString",
			Types._Integer, 11, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _OclAny___lt__gt_ = new ExecutorOperation("<>",
			Types._OclAny, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclAny___eq_ = new ExecutorOperation("=",
			Types._OclAny, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclAny__oclAsSet = new ExecutorOperation("oclAsSet",
			Types._OclAny, 2, org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
		public static final ExecutorTypeParameter __OclAny__oclAsType_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _OclAny__oclAsType = new ExecutorOperation("oclAsType",
			Types._OclAny, 3, org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__OclAny__oclAsType_TT));
		public static final ExecutorOperation _OclAny__oclIsInState = new ExecutorOperation("oclIsInState",
			Types._OclAny, 4, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE,
				OCLstdlibTables.Types._OclState);
		public static final ExecutorOperation _OclAny__oclIsInvalid = new ExecutorOperation("oclIsInvalid",
			Types._OclAny, 5, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
		public static final ExecutorTypeParameter __OclAny__oclIsKindOf_T = new ExecutorTypeParameter(LIBRARY, "T");
		public static final ExecutorOperation _OclAny__oclIsKindOf = new ExecutorOperation("oclIsKindOf",
			Types._OclAny, 6, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__OclAny__oclIsKindOf_T));
		public static final ExecutorOperation _OclAny__oclIsNew = new ExecutorOperation("oclIsNew",
			Types._OclAny, 7, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		public static final ExecutorTypeParameter __OclAny__oclIsTypeOf_T = new ExecutorTypeParameter(LIBRARY, "T");
		public static final ExecutorOperation _OclAny__oclIsTypeOf = new ExecutorOperation("oclIsTypeOf",
			Types._OclAny, 8, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__OclAny__oclIsTypeOf_T));
		public static final ExecutorOperation _OclAny__oclIsUndefined = new ExecutorOperation("oclIsUndefined",
			Types._OclAny, 9, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclType = new ExecutorOperation("oclType",
			Types._OclAny, 10, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__toString = new ExecutorOperation("toString",
			Types._OclAny, 11, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _OclComparable___lt_ = new ExecutorOperation("<",
			Types._OclComparable, 0, org.eclipse.ocl.examples.library.oclany.OclComparableLessThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclComparable___lt__eq_ = new ExecutorOperation("<=",
			Types._OclComparable, 1, org.eclipse.ocl.examples.library.oclany.OclComparableLessThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclComparable___gt_ = new ExecutorOperation(">",
			Types._OclComparable, 2, org.eclipse.ocl.examples.library.oclany.OclComparableGreaterThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclComparable___gt__eq_ = new ExecutorOperation(">=",
			Types._OclComparable, 3, org.eclipse.ocl.examples.library.oclany.OclComparableGreaterThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclComparable__compareTo = new ExecutorOperation("compareTo",
			Types._OclComparable, 4, null,
				OCLstdlibTables.Types._OclSelf);
	
		public static final ExecutorOperation _OclElement__allInstances = new ExecutorOperation("allInstances",
			Types._OclElement, 0, org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _OclElement__oclContainer = new ExecutorOperation("oclContainer",
			Types._OclElement, 1, org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
		public static final ExecutorOperation _OclElement__oclContents = new ExecutorOperation("oclContents",
			Types._OclElement, 2, org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
	
		public static final ExecutorOperation _OclInvalid___lt__gt_ = new ExecutorOperation("<>",
			Types._OclInvalid, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclInvalid___eq_ = new ExecutorOperation("=",
			Types._OclInvalid, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
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
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclSummable__zero = new ExecutorOperation("zero",
			Types._OclSummable, 1, null);
	
		public static final ExecutorOperation _OclTuple___lt__gt_ = new ExecutorOperation("<>",
			Types._OclTuple, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclTuple___eq_ = new ExecutorOperation("=",
			Types._OclTuple, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
	
		public static final ExecutorOperation _OclType__conformsTo = new ExecutorOperation("conformsTo",
			Types._OclType, 0, org.eclipse.ocl.examples.library.classifier.OclTypeConformsToOperation.INSTANCE,
				OCLstdlibTables.Types._OclType);
	
		public static final ExecutorOperation _OclVoid___lt__gt_ = new ExecutorOperation("<>",
			Types._OclVoid, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclVoid___eq_ = new ExecutorOperation("=",
			Types._OclVoid, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OclVoid__and = new ExecutorOperation("and",
			Types._OclVoid, 2, org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _OclVoid__implies = new ExecutorOperation("implies",
			Types._OclVoid, 3, org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _OclVoid__or = new ExecutorOperation("or",
			Types._OclVoid, 4, org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _OclVoid__allInstances = new ExecutorOperation("allInstances",
			Types._OclVoid, 5, org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _OclVoid__toString = new ExecutorOperation("toString",
			Types._OclVoid, 6, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _OrderedSet___sub_ = new ExecutorOperation("-",
			Types._OrderedSet, 0, org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "UniqueCollection", OCLstdlibTables.Types._OclAny));
		public static final ExecutorOperation _OrderedSet___lt__gt_ = new ExecutorOperation("<>",
			Types._OrderedSet, 1, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OrderedSet___eq_ = new ExecutorOperation("=",
			Types._OrderedSet, 2, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _OrderedSet__append = new ExecutorOperation("append",
			Types._OrderedSet, 3, org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE,
				OCLstdlibTables.Types._OrderedSet_T);
		public static final ExecutorOperation _OrderedSet__excluding = new ExecutorOperation("excluding",
			Types._OrderedSet, 4, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __OrderedSet__flatten_T2 = new ExecutorTypeParameter(LIBRARY, "T2");
		public static final ExecutorOperation _OrderedSet__flatten = new ExecutorOperation("flatten",
			Types._OrderedSet, 5, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__including = new ExecutorOperation("including",
			Types._OrderedSet, 6, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				OCLstdlibTables.Types._OrderedSet_T);
		public static final ExecutorOperation _OrderedSet__insertAt = new ExecutorOperation("insertAt",
			Types._OrderedSet, 7, org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE,
				OCLstdlibTables.Types._Integer,
				OCLstdlibTables.Types._OrderedSet_T);
		public static final ExecutorOperation _OrderedSet__intersection = new ExecutorOperation("intersection",
			Types._OrderedSet, 8, org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Types._OrderedSet_T));
		public static final ExecutorOperation _OrderedSet__prepend = new ExecutorOperation("prepend",
			Types._OrderedSet, 9, org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE,
				OCLstdlibTables.Types._OrderedSet_T);
		public static final ExecutorOperation _OrderedSet__reject = new ExecutorOperation("reject",
			Types._OrderedSet, 10, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._OrderedSet_T));
		public static final ExecutorOperation _OrderedSet__reverse = new ExecutorOperation("reverse",
			Types._OrderedSet, 11, org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__select = new ExecutorOperation("select",
			Types._OrderedSet, 12, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._OrderedSet_T));
		public static final ExecutorTypeParameter __OrderedSet__selectByKind_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _OrderedSet__selectByKind = new ExecutorOperation("selectByKind",
			Types._OrderedSet, 13, org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__OrderedSet__selectByKind_TT));
		public static final ExecutorTypeParameter __OrderedSet__selectByType_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _OrderedSet__selectByType = new ExecutorOperation("selectByType",
			Types._OrderedSet, 14, org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__OrderedSet__selectByType_TT));
		public static final ExecutorOperation _OrderedSet__sortedBy = new ExecutorOperation("sortedBy",
			Types._OrderedSet, 15, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._OrderedSet_T));
		public static final ExecutorOperation _OrderedSet__subOrderedSet = new ExecutorOperation("subOrderedSet",
			Types._OrderedSet, 16, org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _OrderedSet__union = new ExecutorOperation("union",
			Types._OrderedSet, 17, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Sequence", OCLstdlibTables.Types._OrderedSet_T));
	
		public static final ExecutorOperation _Real___mul_ = new ExecutorOperation("*",
			Types._Real, 0, org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___add_ = new ExecutorOperation("+",
			Types._Real, 1, org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__1__sub_ = new ExecutorOperation("-",
			Types._Real, 2, org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
		public static final ExecutorOperation _Real__0__sub_ = new ExecutorOperation("-",
			Types._Real, 3, org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___div_ = new ExecutorOperation("/",
			Types._Real, 4, org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___lt_ = new ExecutorOperation("<",
			Types._Real, 5, org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___lt__eq_ = new ExecutorOperation("<=",
			Types._Real, 6, org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___lt__gt_ = new ExecutorOperation("<>",
			Types._Real, 7, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___eq_ = new ExecutorOperation("=",
			Types._Real, 8, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___gt_ = new ExecutorOperation(">",
			Types._Real, 9, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real___gt__eq_ = new ExecutorOperation(">=",
			Types._Real, 10, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__abs = new ExecutorOperation("abs",
			Types._Real, 11, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Real__compareTo = new ExecutorOperation("compareTo",
			Types._Real, 12, org.eclipse.ocl.examples.library.real.RealCompareToOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__floor = new ExecutorOperation("floor",
			Types._Real, 13, org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
		public static final ExecutorOperation _Real__max = new ExecutorOperation("max",
			Types._Real, 14, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__min = new ExecutorOperation("min",
			Types._Real, 15, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Real__round = new ExecutorOperation("round",
			Types._Real, 16, org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
		public static final ExecutorOperation _Real__toString = new ExecutorOperation("toString",
			Types._Real, 17, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _Sequence___lt__gt_ = new ExecutorOperation("<>",
			Types._Sequence, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Sequence___eq_ = new ExecutorOperation("=",
			Types._Sequence, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Sequence__append = new ExecutorOperation("append",
			Types._Sequence, 2, org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE,
				OCLstdlibTables.Types._Sequence_T);
		public static final ExecutorOperation _Sequence__at = new ExecutorOperation("at",
			Types._Sequence, 3, org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _Sequence__closure = new ExecutorOperation("closure",
			Types._Sequence, 4, org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorTypeParameter __Sequence__collect_V = new ExecutorTypeParameter(LIBRARY, "V");
		public static final ExecutorOperation _Sequence__collect = new ExecutorOperation("collect",
			Types._Sequence, 5, org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorTypeParameter __Sequence__collectNested_V = new ExecutorTypeParameter(LIBRARY, "V");
		public static final ExecutorOperation _Sequence__collectNested = new ExecutorOperation("collectNested",
			Types._Sequence, 6, org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorOperation _Sequence__excluding = new ExecutorOperation("excluding",
			Types._Sequence, 7, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				OCLstdlibTables.Types._OclAny);
		public static final ExecutorOperation _Sequence__first = new ExecutorOperation("first",
			Types._Sequence, 8, org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
		public static final ExecutorTypeParameter __Sequence__flatten_T2 = new ExecutorTypeParameter(LIBRARY, "T2");
		public static final ExecutorOperation _Sequence__flatten = new ExecutorOperation("flatten",
			Types._Sequence, 9, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__including = new ExecutorOperation("including",
			Types._Sequence, 10, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				OCLstdlibTables.Types._Sequence_T);
		public static final ExecutorOperation _Sequence__indexOf = new ExecutorOperation("indexOf",
			Types._Sequence, 11, org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE,
				OCLstdlibTables.Types._OclAny);
		public static final ExecutorOperation _Sequence__insertAt = new ExecutorOperation("insertAt",
			Types._Sequence, 12, org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE,
				OCLstdlibTables.Types._Integer,
				OCLstdlibTables.Types._Sequence_T);
		public static final ExecutorOperation _Sequence__0_intersection = new ExecutorOperation("intersection",
			Types._Sequence, 13, org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorOperation _Sequence__1_intersection = new ExecutorOperation("intersection",
			Types._Sequence, 14, org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "UniqueCollection", OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorOperation _Sequence__last = new ExecutorOperation("last",
			Types._Sequence, 15, org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__prepend = new ExecutorOperation("prepend",
			Types._Sequence, 16, org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE,
				OCLstdlibTables.Types._Sequence_T);
		public static final ExecutorOperation _Sequence__reject = new ExecutorOperation("reject",
			Types._Sequence, 17, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorOperation _Sequence__reverse = new ExecutorOperation("reverse",
			Types._Sequence, 18, org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__select = new ExecutorOperation("select",
			Types._Sequence, 19, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorTypeParameter __Sequence__selectByKind_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _Sequence__selectByKind = new ExecutorOperation("selectByKind",
			Types._Sequence, 20, org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__Sequence__selectByKind_TT));
		public static final ExecutorTypeParameter __Sequence__selectByType_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _Sequence__selectByType = new ExecutorOperation("selectByType",
			Types._Sequence, 21, org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__Sequence__selectByType_TT));
		public static final ExecutorOperation _Sequence__sortedBy = new ExecutorOperation("sortedBy",
			Types._Sequence, 22, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Sequence_T));
		public static final ExecutorOperation _Sequence__subSequence = new ExecutorOperation("subSequence",
			Types._Sequence, 23, org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _Sequence__union = new ExecutorOperation("union",
			Types._Sequence, 24, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Sequence", OCLstdlibTables.Types._Sequence_T));
	
		public static final ExecutorOperation _Set___sub_ = new ExecutorOperation("-",
			Types._Set, 0, org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "UniqueCollection", OCLstdlibTables.Types._OclAny));
		public static final ExecutorOperation _Set___lt__gt_ = new ExecutorOperation("<>",
			Types._Set, 1, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Set___eq_ = new ExecutorOperation("=",
			Types._Set, 2, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _Set__excluding = new ExecutorOperation("excluding",
			Types._Set, 3, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE,
				OCLstdlibTables.Types._OclAny);
		public static final ExecutorTypeParameter __Set__flatten_T2 = new ExecutorTypeParameter(LIBRARY, "T2");
		public static final ExecutorOperation _Set__flatten = new ExecutorOperation("flatten",
			Types._Set, 4, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Set__including = new ExecutorOperation("including",
			Types._Set, 5, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE,
				OCLstdlibTables.Types._Set_T);
		public static final ExecutorOperation _Set__intersection = new ExecutorOperation("intersection",
			Types._Set, 6, org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Types._Set_T));
		public static final ExecutorOperation _Set__reject = new ExecutorOperation("reject",
			Types._Set, 7, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Set_T));
		public static final ExecutorOperation _Set__select = new ExecutorOperation("select",
			Types._Set, 8, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Set_T));
		public static final ExecutorTypeParameter __Set__selectByKind_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _Set__selectByKind = new ExecutorOperation("selectByKind",
			Types._Set, 9, org.eclipse.ocl.examples.library.collection.CollectionSelectByKindOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__Set__selectByKind_TT));
		public static final ExecutorTypeParameter __Set__selectByType_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _Set__selectByType = new ExecutorOperation("selectByType",
			Types._Set, 10, org.eclipse.ocl.examples.library.collection.CollectionSelectByTypeOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__Set__selectByType_TT));
		public static final ExecutorOperation _Set__sortedBy = new ExecutorOperation("sortedBy",
			Types._Set, 11, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._Set_T));
		public static final ExecutorOperation _Set__union = new ExecutorOperation("union",
			Types._Set, 12, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Types._Set_T));
	
		public static final ExecutorOperation _String___add_ = new ExecutorOperation("+",
			Types._String, 0, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String___lt_ = new ExecutorOperation("<",
			Types._String, 1, org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___lt__eq_ = new ExecutorOperation("<=",
			Types._String, 2, org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___lt__gt_ = new ExecutorOperation("<>",
			Types._String, 3, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___eq_ = new ExecutorOperation("=",
			Types._String, 4, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___gt_ = new ExecutorOperation(">",
			Types._String, 5, org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String___gt__eq_ = new ExecutorOperation(">=",
			Types._String, 6, org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String__at = new ExecutorOperation("at",
			Types._String, 7, org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _String__characters = new ExecutorOperation("characters",
			Types._String, 8, org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
		public static final ExecutorOperation _String__compareTo = new ExecutorOperation("compareTo",
			Types._String, 9, org.eclipse.ocl.examples.library.string.StringCompareToOperation.INSTANCE,
				OCLstdlibTables.Types._OclSelf);
		public static final ExecutorOperation _String__concat = new ExecutorOperation("concat",
			Types._String, 10, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__endsWith = new ExecutorOperation("endsWith",
			Types._String, 11, org.eclipse.ocl.examples.library.string.StringEndsWithOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__equalsIgnoreCase = new ExecutorOperation("equalsIgnoreCase",
			Types._String, 12, org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__indexOf = new ExecutorOperation("indexOf",
			Types._String, 13, org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__lastIndexOf = new ExecutorOperation("lastIndexOf",
			Types._String, 14, org.eclipse.ocl.examples.library.string.StringLastIndexOfOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__matches = new ExecutorOperation("matches",
			Types._String, 15, org.eclipse.ocl.examples.library.string.StringMatchesOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__replaceAll = new ExecutorOperation("replaceAll",
			Types._String, 16, org.eclipse.ocl.examples.library.string.StringReplaceAllOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__replaceFirst = new ExecutorOperation("replaceFirst",
			Types._String, 17, org.eclipse.ocl.examples.library.string.StringReplaceFirstOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__size = new ExecutorOperation("size",
			Types._String, 18, org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
		public static final ExecutorOperation _String__startsWith = new ExecutorOperation("startsWith",
			Types._String, 19, org.eclipse.ocl.examples.library.string.StringStartsWithOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__substituteAll = new ExecutorOperation("substituteAll",
			Types._String, 20, org.eclipse.ocl.examples.library.string.StringSubstituteAllOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__substituteFirst = new ExecutorOperation("substituteFirst",
			Types._String, 21, org.eclipse.ocl.examples.library.string.StringSubstituteFirstOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__substring = new ExecutorOperation("substring",
			Types._String, 22, org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE,
				OCLstdlibTables.Types._Integer);
		public static final ExecutorOperation _String__toBoolean = new ExecutorOperation("toBoolean",
			Types._String, 23, org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
		public static final ExecutorOperation _String__toInteger = new ExecutorOperation("toInteger",
			Types._String, 24, org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
		public static final ExecutorOperation _String__toLower = new ExecutorOperation("toLower",
			Types._String, 25, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toLowerCase = new ExecutorOperation("toLowerCase",
			Types._String, 26, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toReal = new ExecutorOperation("toReal",
			Types._String, 27, org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
		public static final ExecutorOperation _String__toString = new ExecutorOperation("toString",
			Types._String, 28, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpper = new ExecutorOperation("toUpper",
			Types._String, 29, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpperCase = new ExecutorOperation("toUpperCase",
			Types._String, 30, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__0_tokenize = new ExecutorOperation("tokenize",
			Types._String, 31, org.eclipse.ocl.examples.library.string.StringTokenizeOperation.INSTANCE);
		public static final ExecutorOperation _String__1_tokenize = new ExecutorOperation("tokenize",
			Types._String, 32, org.eclipse.ocl.examples.library.string.StringTokenizeOperation.INSTANCE,
				OCLstdlibTables.Types._String);
		public static final ExecutorOperation _String__2_tokenize = new ExecutorOperation("tokenize",
			Types._String, 33, org.eclipse.ocl.examples.library.string.StringTokenizeOperation.INSTANCE,
				OCLstdlibTables.Types._String,
				OCLstdlibTables.Types._Boolean);
		public static final ExecutorOperation _String__trim = new ExecutorOperation("trim",
			Types._String, 34, org.eclipse.ocl.examples.library.string.StringTrimOperation.INSTANCE);
	
		public static final ExecutorOperation _UniqueCollection___sub_ = new ExecutorOperation("-",
			Types._UniqueCollection, 0, org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "UniqueCollection", OCLstdlibTables.Types._OclAny));
		public static final ExecutorOperation _UniqueCollection__sortedBy = new ExecutorOperation("sortedBy",
			Types._UniqueCollection, 1, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE,
				new ExecutorLambdaType(LIBRARY, "Lambda", OCLstdlibTables.Types._UniqueCollection_T));
		public static final ExecutorOperation _UniqueCollection__symmetricDifference = new ExecutorOperation("symmetricDifference",
			Types._UniqueCollection, 2, org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "UniqueCollection", OCLstdlibTables.Types._OclAny));
		public static final ExecutorOperation _UniqueCollection__union = new ExecutorOperation("union",
			Types._UniqueCollection, 3, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "Collection", OCLstdlibTables.Types._UniqueCollection_T));
	
		public static final ExecutorTypeParameter __UnlimitedNatural__oclAsType_TT = new ExecutorTypeParameter(LIBRARY, "TT");
		public static final ExecutorOperation _UnlimitedNatural__oclAsType = new ExecutorOperation("oclAsType",
			Types._UnlimitedNatural, 0, org.eclipse.ocl.examples.library.numeric.UnlimitedNaturalOclAsTypeOperation.INSTANCE,
				new ExecutorSpecializedType(LIBRARY, "AnyClassifier", OCLstdlibTables.Operations.__UnlimitedNatural__oclAsType_TT));
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
		    Fragments._AnyClassifier__OclElement /* 1 */,
		    Fragments._AnyClassifier__OclType /* 2 */,
		    Fragments._AnyClassifier__AnyClassifier /* 3 */
		};
		private static final int[] __AnyClassifier = { 1,2,1,1 };
	
		private static final ExecutorFragment[] _Bag =
		{
		    Fragments._Bag__OclAny /* 0 */,
		    Fragments._Bag__Collection /* 1 */,
		    Fragments._Bag__Bag /* 2 */
		};
		private static final int[] __Bag = { 1,1,1 };
	
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
		    Fragments._ClassClassifier__OclElement /* 1 */,
		    Fragments._ClassClassifier__OclType /* 2 */,
		    Fragments._ClassClassifier__AnyClassifier /* 3 */,
		    Fragments._ClassClassifier__ClassClassifier /* 4 */
		};
		private static final int[] __ClassClassifier = { 1,2,1,1,1 };
	
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
		    Fragments._CollectionClassifier__OclElement /* 1 */,
		    Fragments._CollectionClassifier__OclType /* 2 */,
		    Fragments._CollectionClassifier__AnyClassifier /* 3 */,
		    Fragments._CollectionClassifier__CollectionClassifier /* 4 */
		};
		private static final int[] __CollectionClassifier = { 1,2,1,1,1 };
	
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
		    Fragments._EnumerationClassifier__OclElement /* 1 */,
		    Fragments._EnumerationClassifier__OclType /* 2 */,
		    Fragments._EnumerationClassifier__AnyClassifier /* 3 */,
		    Fragments._EnumerationClassifier__EnumerationClassifier /* 4 */
		};
		private static final int[] __EnumerationClassifier = { 1,2,1,1,1 };
	
		private static final ExecutorFragment[] _EnumerationLiteral =
		{
		    Fragments._EnumerationLiteral__OclAny /* 0 */,
		    Fragments._EnumerationLiteral__EnumerationLiteral /* 1 */
		};
		private static final int[] __EnumerationLiteral = { 1,1 };
	
		private static final ExecutorFragment[] _Integer =
		{
		    Fragments._Integer__OclAny /* 0 */,
		    Fragments._Integer__OclComparable /* 1 */,
		    Fragments._Integer__OclSummable /* 1 */,
		    Fragments._Integer__Real /* 2 */,
		    Fragments._Integer__Integer /* 3 */
		};
		private static final int[] __Integer = { 1,2,1,1 };
	
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
	
		private static final ExecutorFragment[] _OclType =
		{
		    Fragments._OclType__OclAny /* 0 */,
		    Fragments._OclType__OclElement /* 1 */,
		    Fragments._OclType__OclType /* 2 */
		};
		private static final int[] __OclType = { 1,1,1 };
	
		private static final ExecutorFragment[] _OclVoid =
		{
		    Fragments._OclVoid__OclAny /* 0 */,
		    Fragments._OclVoid__OclVoid /* 1 */
		};
		private static final int[] __OclVoid = { 1,1 };
	
		private static final ExecutorFragment[] _OrderedSet =
		{
		    Fragments._OrderedSet__OclAny /* 0 */,
		    Fragments._OrderedSet__Collection /* 1 */,
		    Fragments._OrderedSet__Sequence /* 2 */,
		    Fragments._OrderedSet__UniqueCollection /* 2 */,
		    Fragments._OrderedSet__OrderedSet /* 3 */
		};
		private static final int[] __OrderedSet = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _Real =
		{
		    Fragments._Real__OclAny /* 0 */,
		    Fragments._Real__OclComparable /* 1 */,
		    Fragments._Real__OclSummable /* 1 */,
		    Fragments._Real__Real /* 2 */
		};
		private static final int[] __Real = { 1,2,1 };
	
		private static final ExecutorFragment[] _Sequence =
		{
		    Fragments._Sequence__OclAny /* 0 */,
		    Fragments._Sequence__Collection /* 1 */,
		    Fragments._Sequence__Sequence /* 2 */
		};
		private static final int[] __Sequence = { 1,1,1 };
	
		private static final ExecutorFragment[] _Set =
		{
		    Fragments._Set__OclAny /* 0 */,
		    Fragments._Set__Collection /* 1 */,
		    Fragments._Set__Bag /* 2 */,
		    Fragments._Set__UniqueCollection /* 2 */,
		    Fragments._Set__Set /* 3 */
		};
		private static final int[] __Set = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _String =
		{
		    Fragments._String__OclAny /* 0 */,
		    Fragments._String__OclComparable /* 1 */,
		    Fragments._String__OclSummable /* 1 */,
		    Fragments._String__String /* 2 */
		};
		private static final int[] __String = { 1,2,1 };
	
		private static final ExecutorFragment[] _Type =
		{
		    Fragments._Type__OclAny /* 0 */,
		    Fragments._Type__OclElement /* 1 */,
		    Fragments._Type__OclType /* 2 */,
		    Fragments._Type__Type /* 3 */
		};
		private static final int[] __Type = { 1,1,1,1 };
	
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
		    Fragments._UnlimitedNatural__OclComparable /* 1 */,
		    Fragments._UnlimitedNatural__OclSummable /* 1 */,
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
			Types._OclType.initFragments(_OclType, __OclType);
			Types._OclVoid.initFragments(_OclVoid, __OclVoid);
			Types._OrderedSet.initFragments(_OrderedSet, __OrderedSet);
			Types._Real.initFragments(_Real, __Real);
			Types._Sequence.initFragments(_Sequence, __Sequence);
			Types._Set.initFragments(_Set, __Set);
			Types._String.initFragments(_String, __String);
			Types._Type.initFragments(_Type, __Type);
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
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _AnyClassifier__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation[] _AnyClassifier__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _AnyClassifier__OclType = {
		    OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType) */
		};
	
		private static final ExecutorOperation[] _Bag__Bag = {
		    OCLstdlibTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Bag__closure /* closure(T|Lambda T() : Set(T)) */,
		    OCLstdlibTables.Operations._Bag__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Bag__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Bag__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Bag__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Bag__including /* including(T) */,
		    OCLstdlibTables.Operations._Bag__0_intersection /* intersection(Collection(T)) */,
		    OCLstdlibTables.Operations._Bag__1_intersection /* intersection(UniqueCollection(T)) */,
		    OCLstdlibTables.Operations._Bag__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Bag__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Bag__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Bag__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Bag__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Bag__0_union /* union(Collection(T)) */,
		    OCLstdlibTables.Operations._Bag__1_union /* union(UniqueCollection(T)) */
		};
		private static final ExecutorOperation[] _Bag__Collection = {
		    OCLstdlibTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    OCLstdlibTables.Operations._Bag__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Bag__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Bag__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Bag__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__includesAll /* includesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Bag__including /* including(T) */,
		    OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__iterate /* iterate(Tacc)(T;Tacc|Lambda T() : Tacc) */,
		    OCLstdlibTables.Operations._Collection__max /* max() */,
		    OCLstdlibTables.Operations._Collection__min /* min() */,
		    OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__product /* product(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Bag__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Bag__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Bag__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Bag__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Collection__size /* size() */,
		    OCLstdlibTables.Operations._Bag__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Bag__OclAny = {
		    OCLstdlibTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _Boolean__Boolean = {
		    OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Boolean__and /* _'and'(Boolean) */,
		    OCLstdlibTables.Operations._Boolean__implies /* _'implies'(Boolean) */,
		    OCLstdlibTables.Operations._Boolean__not /* _'not'() */,
		    OCLstdlibTables.Operations._Boolean__or /* _'or'(Boolean) */,
		    OCLstdlibTables.Operations._Boolean__xor /* _'xor'(Boolean) */,
		    OCLstdlibTables.Operations._Boolean__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._Boolean__toString /* toString() */
		};
		private static final ExecutorOperation[] _Boolean__OclAny = {
		    OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Boolean__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _Class__Class = {
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Class__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _ClassClassifier__ClassClassifier = {};
		private static final ExecutorOperation[] _ClassClassifier__AnyClassifier = {};
		private static final ExecutorOperation[] _ClassClassifier__Class = {
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ClassClassifier__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation[] _ClassClassifier__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _ClassClassifier__OclType = {
		    OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType) */
		};
	
		private static final ExecutorOperation[] _Collection__Collection = {
		    OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    OCLstdlibTables.Operations._Collection__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Collection__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__includesAll /* includesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Collection__including /* including(T) */,
		    OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__iterate /* iterate(Tacc)(T;Tacc|Lambda T() : Tacc) */,
		    OCLstdlibTables.Operations._Collection__max /* max() */,
		    OCLstdlibTables.Operations._Collection__min /* min() */,
		    OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__product /* product(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Collection__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Collection__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Collection__size /* size() */,
		    OCLstdlibTables.Operations._Collection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Collection__OclAny = {
		    OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _CollectionClassifier__CollectionClassifier = {};
		private static final ExecutorOperation[] _CollectionClassifier__AnyClassifier = {};
		private static final ExecutorOperation[] _CollectionClassifier__Class = {
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionClassifier__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation[] _CollectionClassifier__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _CollectionClassifier__OclType = {
		    OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType) */
		};
	
		private static final ExecutorOperation[] _Enumeration__Enumeration = {
		    OCLstdlibTables.Operations._Enumeration__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._Enumeration__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Enumeration__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Enumeration__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _EnumerationClassifier__EnumerationClassifier = {};
		private static final ExecutorOperation[] _EnumerationClassifier__AnyClassifier = {};
		private static final ExecutorOperation[] _EnumerationClassifier__Class = {
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _EnumerationClassifier__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Class__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation[] _EnumerationClassifier__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _EnumerationClassifier__OclType = {
		    OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType) */
		};
	
		private static final ExecutorOperation[] _EnumerationLiteral__EnumerationLiteral = {};
		private static final ExecutorOperation[] _EnumerationLiteral__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _Integer__Integer = {
		    OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__0__sub_ /* _'-'() */,
		    OCLstdlibTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__abs /* abs() */,
		    OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__div /* div(Integer) */,
		    OCLstdlibTables.Operations._Integer__max /* max(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__min /* min(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__mod /* mod(Integer) */,
		    OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
		private static final ExecutorOperation[] _Integer__OclAny = {
		    OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
		private static final ExecutorOperation[] _Integer__OclComparable = {
		    OCLstdlibTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _Integer__OclSummable = {
		    OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final ExecutorOperation[] _Integer__Real = {
		    OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__0__sub_ /* _'-'() */,
		    OCLstdlibTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__abs /* abs() */,
		    OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */,
		    OCLstdlibTables.Operations._Real__floor /* floor() */,
		    OCLstdlibTables.Operations._Integer__max /* max(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__min /* min(OclSelf) */,
		    OCLstdlibTables.Operations._Real__round /* round() */,
		    OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclAny__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclComparable__OclComparable = {
		    OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf) */,
		    OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf) */,
		    OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf) */,
		    OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _OclComparable__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclElement__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _OclElement__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclInvalid__OclInvalid = {
		    OCLstdlibTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclInvalid__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclInvalid__oclBadOperation /* oclBadOperation() */,
		    OCLstdlibTables.Operations._OclInvalid__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclInvalid__OclAny = {
		    OCLstdlibTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclInvalid__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclInvalid__OclVoid = {
		    OCLstdlibTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclVoid__and /* _'and'(Boolean) */,
		    OCLstdlibTables.Operations._OclVoid__implies /* _'implies'(Boolean) */,
		    OCLstdlibTables.Operations._OclVoid__or /* _'or'(Boolean) */,
		    OCLstdlibTables.Operations._OclInvalid__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclInvalid__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclLambda__OclLambda = {};
		private static final ExecutorOperation[] _OclLambda__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclMessage__OclMessage = {
		    OCLstdlibTables.Operations._OclMessage__hasReturned /* hasReturned() */,
		    OCLstdlibTables.Operations._OclMessage__isOperationCall /* isOperationCall() */,
		    OCLstdlibTables.Operations._OclMessage__isSignalSent /* isSignalSent() */,
		    OCLstdlibTables.Operations._OclMessage__result /* result() */
		};
		private static final ExecutorOperation[] _OclMessage__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclSelf__OclSelf = {};
		private static final ExecutorOperation[] _OclSelf__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclState__OclState = {};
		private static final ExecutorOperation[] _OclState__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclSummable__OclSummable = {
		    OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final ExecutorOperation[] _OclSummable__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclTuple__OclTuple = {
		    OCLstdlibTables.Operations._OclTuple___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclTuple___eq_ /* _'='(OclSelf) */
		};
		private static final ExecutorOperation[] _OclTuple__OclAny = {
		    OCLstdlibTables.Operations._OclTuple___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclTuple___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclType__OclType = {
		    OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType) */
		};
		private static final ExecutorOperation[] _OclType__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclType__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
	
		private static final ExecutorOperation[] _OclVoid__OclVoid = {
		    OCLstdlibTables.Operations._OclVoid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclVoid___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclVoid__and /* _'and'(Boolean) */,
		    OCLstdlibTables.Operations._OclVoid__implies /* _'implies'(Boolean) */,
		    OCLstdlibTables.Operations._OclVoid__or /* _'or'(Boolean) */,
		    OCLstdlibTables.Operations._OclVoid__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclVoid__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclVoid__OclAny = {
		    OCLstdlibTables.Operations._OclVoid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclVoid___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclVoid__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OrderedSet__OrderedSet = {
		    OCLstdlibTables.Operations._OrderedSet___sub_ /* _'-'(UniqueCollection(OclAny)) */,
		    OCLstdlibTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OrderedSet__append /* append(T) */,
		    OCLstdlibTables.Operations._OrderedSet__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._OrderedSet__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._OrderedSet__including /* including(T) */,
		    OCLstdlibTables.Operations._OrderedSet__insertAt /* insertAt(Integer,T) */,
		    OCLstdlibTables.Operations._OrderedSet__intersection /* intersection(Collection(T)) */,
		    OCLstdlibTables.Operations._OrderedSet__prepend /* prepend(T) */,
		    OCLstdlibTables.Operations._OrderedSet__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._OrderedSet__reverse /* reverse() */,
		    OCLstdlibTables.Operations._OrderedSet__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._OrderedSet__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OrderedSet__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OrderedSet__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._OrderedSet__subOrderedSet /* subOrderedSet(Integer,Integer) */,
		    OCLstdlibTables.Operations._OrderedSet__union /* union(Sequence(T)) */
		};
		private static final ExecutorOperation[] _OrderedSet__Collection = {
		    OCLstdlibTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    OCLstdlibTables.Operations._Sequence__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Sequence__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._OrderedSet__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._OrderedSet__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__includesAll /* includesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._OrderedSet__including /* including(T) */,
		    OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__iterate /* iterate(Tacc)(T;Tacc|Lambda T() : Tacc) */,
		    OCLstdlibTables.Operations._Collection__max /* max() */,
		    OCLstdlibTables.Operations._Collection__min /* min() */,
		    OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__product /* product(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._OrderedSet__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._OrderedSet__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._OrderedSet__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OrderedSet__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Collection__size /* size() */,
		    OCLstdlibTables.Operations._OrderedSet__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _OrderedSet__OclAny = {
		    OCLstdlibTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation[] _OrderedSet__Sequence = {
		    OCLstdlibTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OrderedSet__append /* append(T) */,
		    OCLstdlibTables.Operations._Sequence__at /* at(Integer) */,
		    OCLstdlibTables.Operations._Sequence__closure /* closure(T|Lambda T() : OrderedSet(T)) */,
		    OCLstdlibTables.Operations._Sequence__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Sequence__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._OrderedSet__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Sequence__first /* first() */,
		    OCLstdlibTables.Operations._OrderedSet__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._OrderedSet__including /* including(T) */,
		    OCLstdlibTables.Operations._Sequence__indexOf /* indexOf(OclAny) */,
		    OCLstdlibTables.Operations._OrderedSet__insertAt /* insertAt(Integer,T) */,
		    OCLstdlibTables.Operations._OrderedSet__intersection /* intersection(Collection(T)) */,
		    OCLstdlibTables.Operations._Sequence__1_intersection /* intersection(UniqueCollection(T)) */,
		    OCLstdlibTables.Operations._Sequence__last /* last() */,
		    OCLstdlibTables.Operations._OrderedSet__prepend /* prepend(T) */,
		    OCLstdlibTables.Operations._OrderedSet__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._OrderedSet__reverse /* reverse() */,
		    OCLstdlibTables.Operations._OrderedSet__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._OrderedSet__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OrderedSet__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OrderedSet__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Sequence__subSequence /* subSequence(Integer,Integer) */,
		    OCLstdlibTables.Operations._OrderedSet__union /* union(Sequence(T)) */
		};
		private static final ExecutorOperation[] _OrderedSet__UniqueCollection = {
		    OCLstdlibTables.Operations._OrderedSet___sub_ /* _'-'(UniqueCollection(OclAny)) */,
		    OCLstdlibTables.Operations._OrderedSet__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._UniqueCollection__symmetricDifference /* symmetricDifference(UniqueCollection(OclAny)) */,
		    OCLstdlibTables.Operations._UniqueCollection__union /* union(Collection(T)) */
		};
	
		private static final ExecutorOperation[] _Real__Real = {
		    OCLstdlibTables.Operations._Real___mul_ /* _'*'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___add_ /* _'+'(OclSelf) */,
		    OCLstdlibTables.Operations._Real__1__sub_ /* _'-'() */,
		    OCLstdlibTables.Operations._Real__0__sub_ /* _'-'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___div_ /* _'/'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    OCLstdlibTables.Operations._Real__abs /* abs() */,
		    OCLstdlibTables.Operations._Real__compareTo /* compareTo(OclSelf) */,
		    OCLstdlibTables.Operations._Real__floor /* floor() */,
		    OCLstdlibTables.Operations._Real__max /* max(OclSelf) */,
		    OCLstdlibTables.Operations._Real__min /* min(OclSelf) */,
		    OCLstdlibTables.Operations._Real__round /* round() */,
		    OCLstdlibTables.Operations._Real__toString /* toString() */
		};
		private static final ExecutorOperation[] _Real__OclAny = {
		    OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Real__toString /* toString() */
		};
		private static final ExecutorOperation[] _Real__OclComparable = {
		    OCLstdlibTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    OCLstdlibTables.Operations._Real__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _Real__OclSummable = {
		    OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
	
		private static final ExecutorOperation[] _Sequence__Sequence = {
		    OCLstdlibTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Sequence__append /* append(T) */,
		    OCLstdlibTables.Operations._Sequence__at /* at(Integer) */,
		    OCLstdlibTables.Operations._Sequence__closure /* closure(T|Lambda T() : OrderedSet(T)) */,
		    OCLstdlibTables.Operations._Sequence__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Sequence__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Sequence__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Sequence__first /* first() */,
		    OCLstdlibTables.Operations._Sequence__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Sequence__including /* including(T) */,
		    OCLstdlibTables.Operations._Sequence__indexOf /* indexOf(OclAny) */,
		    OCLstdlibTables.Operations._Sequence__insertAt /* insertAt(Integer,T) */,
		    OCLstdlibTables.Operations._Sequence__0_intersection /* intersection(Collection(T)) */,
		    OCLstdlibTables.Operations._Sequence__1_intersection /* intersection(UniqueCollection(T)) */,
		    OCLstdlibTables.Operations._Sequence__last /* last() */,
		    OCLstdlibTables.Operations._Sequence__prepend /* prepend(T) */,
		    OCLstdlibTables.Operations._Sequence__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Sequence__reverse /* reverse() */,
		    OCLstdlibTables.Operations._Sequence__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Sequence__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Sequence__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Sequence__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Sequence__subSequence /* subSequence(Integer,Integer) */,
		    OCLstdlibTables.Operations._Sequence__union /* union(Sequence(T)) */
		};
		private static final ExecutorOperation[] _Sequence__Collection = {
		    OCLstdlibTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    OCLstdlibTables.Operations._Sequence__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Sequence__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Sequence__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Sequence__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__includesAll /* includesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Sequence__including /* including(T) */,
		    OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__iterate /* iterate(Tacc)(T;Tacc|Lambda T() : Tacc) */,
		    OCLstdlibTables.Operations._Collection__max /* max() */,
		    OCLstdlibTables.Operations._Collection__min /* min() */,
		    OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__product /* product(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Sequence__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Sequence__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Sequence__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Sequence__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Collection__size /* size() */,
		    OCLstdlibTables.Operations._Sequence__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Sequence__OclAny = {
		    OCLstdlibTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _Set__Set = {
		    OCLstdlibTables.Operations._Set___sub_ /* _'-'(UniqueCollection(OclAny)) */,
		    OCLstdlibTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Set__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Set__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Set__including /* including(T) */,
		    OCLstdlibTables.Operations._Set__intersection /* intersection(Collection(T)) */,
		    OCLstdlibTables.Operations._Set__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Set__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Set__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Set__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Set__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Set__union /* union(Collection(T)) */
		};
		private static final ExecutorOperation[] _Set__Bag = {
		    OCLstdlibTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Bag__closure /* closure(T|Lambda T() : Set(T)) */,
		    OCLstdlibTables.Operations._Bag__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Bag__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Set__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Set__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Set__including /* including(T) */,
		    OCLstdlibTables.Operations._Set__intersection /* intersection(Collection(T)) */,
		    OCLstdlibTables.Operations._Bag__1_intersection /* intersection(UniqueCollection(T)) */,
		    OCLstdlibTables.Operations._Set__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Set__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Set__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Set__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Set__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Set__union /* union(Collection(T)) */,
		    OCLstdlibTables.Operations._Bag__1_union /* union(UniqueCollection(T)) */
		};
		private static final ExecutorOperation[] _Set__Collection = {
		    OCLstdlibTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    OCLstdlibTables.Operations._Bag__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Bag__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Set__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Set__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__includesAll /* includesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Set__including /* including(T) */,
		    OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__iterate /* iterate(Tacc)(T;Tacc|Lambda T() : Tacc) */,
		    OCLstdlibTables.Operations._Collection__max /* max() */,
		    OCLstdlibTables.Operations._Collection__min /* min() */,
		    OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__product /* product(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Set__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Set__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Set__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Set__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Collection__size /* size() */,
		    OCLstdlibTables.Operations._Set__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Set__OclAny = {
		    OCLstdlibTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation[] _Set__UniqueCollection = {
		    OCLstdlibTables.Operations._Set___sub_ /* _'-'(UniqueCollection(OclAny)) */,
		    OCLstdlibTables.Operations._Set__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._UniqueCollection__symmetricDifference /* symmetricDifference(UniqueCollection(OclAny)) */,
		    OCLstdlibTables.Operations._Set__union /* union(Collection(T)) */
		};
	
		private static final ExecutorOperation[] _String__String = {
		    OCLstdlibTables.Operations._String___add_ /* _'+'(String) */,
		    OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf) */,
		    OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf) */,
		    OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf) */,
		    OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf) */,
		    OCLstdlibTables.Operations._String__at /* at(Integer) */,
		    OCLstdlibTables.Operations._String__characters /* characters() */,
		    OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf) */,
		    OCLstdlibTables.Operations._String__concat /* concat(String) */,
		    OCLstdlibTables.Operations._String__endsWith /* endsWith(String) */,
		    OCLstdlibTables.Operations._String__equalsIgnoreCase /* equalsIgnoreCase(String) */,
		    OCLstdlibTables.Operations._String__indexOf /* indexOf(String) */,
		    OCLstdlibTables.Operations._String__lastIndexOf /* lastIndexOf(String) */,
		    OCLstdlibTables.Operations._String__matches /* matches(String) */,
		    OCLstdlibTables.Operations._String__replaceAll /* replaceAll(String,String) */,
		    OCLstdlibTables.Operations._String__replaceFirst /* replaceFirst(String,String) */,
		    OCLstdlibTables.Operations._String__size /* size() */,
		    OCLstdlibTables.Operations._String__startsWith /* startsWith(String) */,
		    OCLstdlibTables.Operations._String__substituteAll /* substituteAll(String,String) */,
		    OCLstdlibTables.Operations._String__substituteFirst /* substituteFirst(String,String) */,
		    OCLstdlibTables.Operations._String__substring /* substring(Integer,Integer) */,
		    OCLstdlibTables.Operations._String__toBoolean /* toBoolean() */,
		    OCLstdlibTables.Operations._String__toInteger /* toInteger() */,
		    OCLstdlibTables.Operations._String__toLower /* toLower() */,
		    OCLstdlibTables.Operations._String__toLowerCase /* toLowerCase() */,
		    OCLstdlibTables.Operations._String__toReal /* toReal() */,
		    OCLstdlibTables.Operations._String__toString /* toString() */,
		    OCLstdlibTables.Operations._String__toUpper /* toUpper() */,
		    OCLstdlibTables.Operations._String__toUpperCase /* toUpperCase() */,
		    OCLstdlibTables.Operations._String__0_tokenize /* tokenize() */,
		    OCLstdlibTables.Operations._String__1_tokenize /* tokenize(String) */,
		    OCLstdlibTables.Operations._String__2_tokenize /* tokenize(String,Boolean) */,
		    OCLstdlibTables.Operations._String__trim /* trim() */
		};
		private static final ExecutorOperation[] _String__OclAny = {
		    OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._String__toString /* toString() */
		};
		private static final ExecutorOperation[] _String__OclComparable = {
		    OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf) */,
		    OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf) */,
		    OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf) */,
		    OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf) */,
		    OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _String__OclSummable = {
		    OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
	
		private static final ExecutorOperation[] _Type__Type = {};
		private static final ExecutorOperation[] _Type__OclAny = {
		    OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation[] _Type__OclElement = {
		    OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
		    OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
		    OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final ExecutorOperation[] _Type__OclType = {
		    OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType) */
		};
	
		private static final ExecutorOperation[] _UniqueCollection__UniqueCollection = {
		    OCLstdlibTables.Operations._UniqueCollection___sub_ /* _'-'(UniqueCollection(OclAny)) */,
		    OCLstdlibTables.Operations._UniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._UniqueCollection__symmetricDifference /* symmetricDifference(UniqueCollection(OclAny)) */,
		    OCLstdlibTables.Operations._UniqueCollection__union /* union(Collection(T)) */
		};
		private static final ExecutorOperation[] _UniqueCollection__Collection = {
		    OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Collection__any /* any(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__asBag /* asBag() */,
		    OCLstdlibTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLstdlibTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLstdlibTables.Operations._Collection__asSet /* asSet() */,
		    OCLstdlibTables.Operations._Collection__collect /* collect(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Collection__collectNested /* collectNested(V)(T|Lambda T() : V) */,
		    OCLstdlibTables.Operations._Collection__count /* count(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__excludesAll /* excludesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    OCLstdlibTables.Operations._Collection__1_exists /* exists(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_exists /* exists(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__flatten /* flatten(T2)() */,
		    OCLstdlibTables.Operations._Collection__1_forAll /* forAll(T,T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__0_forAll /* forAll(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLstdlibTables.Operations._Collection__includesAll /* includesAll(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Collection__including /* including(T) */,
		    OCLstdlibTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLstdlibTables.Operations._Collection__isUnique /* isUnique(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__iterate /* iterate(Tacc)(T;Tacc|Lambda T() : Tacc) */,
		    OCLstdlibTables.Operations._Collection__max /* max() */,
		    OCLstdlibTables.Operations._Collection__min /* min() */,
		    OCLstdlibTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Collection__one /* one(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__product /* product(T2)(Collection(T2)) */,
		    OCLstdlibTables.Operations._Collection__reject /* reject(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__select /* select(T|Lambda T() : Boolean) */,
		    OCLstdlibTables.Operations._Collection__selectByKind /* selectByKind(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Collection__selectByType /* selectByType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._Collection__size /* size() */,
		    OCLstdlibTables.Operations._UniqueCollection__sortedBy /* sortedBy(T|Lambda T() : OclAny) */,
		    OCLstdlibTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _UniqueCollection__OclAny = {
		    OCLstdlibTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._Collection__oclType /* oclType() */,
		    OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _UnlimitedNatural__UnlimitedNatural = {
		    OCLstdlibTables.Operations._UnlimitedNatural__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__Integer = {
		    OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__0__sub_ /* _'-'() */,
		    OCLstdlibTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__abs /* abs() */,
		    OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__div /* div(Integer) */,
		    OCLstdlibTables.Operations._Integer__max /* max(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__min /* min(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__mod /* mod(Integer) */,
		    OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__OclAny = {
		    OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLstdlibTables.Operations._UnlimitedNatural__oclAsType /* oclAsType(TT)(AnyClassifier(TT)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(AnyClassifier(T)) */,
		    OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
		    OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__OclComparable = {
		    OCLstdlibTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__OclSummable = {
		    OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
		    OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__Real = {
		    OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__0__sub_ /* _'-'() */,
		    OCLstdlibTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    OCLstdlibTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__abs /* abs() */,
		    OCLstdlibTables.Operations._Integer__compareTo /* compareTo(OclSelf) */,
		    OCLstdlibTables.Operations._Real__floor /* floor() */,
		    OCLstdlibTables.Operations._Integer__max /* max(OclSelf) */,
		    OCLstdlibTables.Operations._Integer__min /* min(OclSelf) */,
		    OCLstdlibTables.Operations._Real__round /* round() */,
		    OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
	
		private static final ExecutorOperation[] __Dummy___Dummy = {};
	
		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AnyClassifier__AnyClassifier.initOperations(_AnyClassifier__AnyClassifier);
			Fragments._AnyClassifier__Class.initOperations(_AnyClassifier__Class);
			Fragments._AnyClassifier__OclAny.initOperations(_AnyClassifier__OclAny);
			Fragments._AnyClassifier__OclElement.initOperations(_AnyClassifier__OclElement);
			Fragments._AnyClassifier__OclType.initOperations(_AnyClassifier__OclType);
	
			Fragments._Bag__Bag.initOperations(_Bag__Bag);
			Fragments._Bag__Collection.initOperations(_Bag__Collection);
			Fragments._Bag__OclAny.initOperations(_Bag__OclAny);
	
			Fragments._Boolean__Boolean.initOperations(_Boolean__Boolean);
			Fragments._Boolean__OclAny.initOperations(_Boolean__OclAny);
	
			Fragments._Class__Class.initOperations(_Class__Class);
			Fragments._Class__OclAny.initOperations(_Class__OclAny);
	
			Fragments._ClassClassifier__AnyClassifier.initOperations(_ClassClassifier__AnyClassifier);
			Fragments._ClassClassifier__Class.initOperations(_ClassClassifier__Class);
			Fragments._ClassClassifier__ClassClassifier.initOperations(_ClassClassifier__ClassClassifier);
			Fragments._ClassClassifier__OclAny.initOperations(_ClassClassifier__OclAny);
			Fragments._ClassClassifier__OclElement.initOperations(_ClassClassifier__OclElement);
			Fragments._ClassClassifier__OclType.initOperations(_ClassClassifier__OclType);
	
			Fragments._Collection__Collection.initOperations(_Collection__Collection);
			Fragments._Collection__OclAny.initOperations(_Collection__OclAny);
	
			Fragments._CollectionClassifier__AnyClassifier.initOperations(_CollectionClassifier__AnyClassifier);
			Fragments._CollectionClassifier__Class.initOperations(_CollectionClassifier__Class);
			Fragments._CollectionClassifier__CollectionClassifier.initOperations(_CollectionClassifier__CollectionClassifier);
			Fragments._CollectionClassifier__OclAny.initOperations(_CollectionClassifier__OclAny);
			Fragments._CollectionClassifier__OclElement.initOperations(_CollectionClassifier__OclElement);
			Fragments._CollectionClassifier__OclType.initOperations(_CollectionClassifier__OclType);
	
			Fragments._Enumeration__Enumeration.initOperations(_Enumeration__Enumeration);
			Fragments._Enumeration__OclAny.initOperations(_Enumeration__OclAny);
	
			Fragments._EnumerationClassifier__AnyClassifier.initOperations(_EnumerationClassifier__AnyClassifier);
			Fragments._EnumerationClassifier__Class.initOperations(_EnumerationClassifier__Class);
			Fragments._EnumerationClassifier__EnumerationClassifier.initOperations(_EnumerationClassifier__EnumerationClassifier);
			Fragments._EnumerationClassifier__OclAny.initOperations(_EnumerationClassifier__OclAny);
			Fragments._EnumerationClassifier__OclElement.initOperations(_EnumerationClassifier__OclElement);
			Fragments._EnumerationClassifier__OclType.initOperations(_EnumerationClassifier__OclType);
	
			Fragments._EnumerationLiteral__EnumerationLiteral.initOperations(_EnumerationLiteral__EnumerationLiteral);
			Fragments._EnumerationLiteral__OclAny.initOperations(_EnumerationLiteral__OclAny);
	
			Fragments._Integer__Integer.initOperations(_Integer__Integer);
			Fragments._Integer__OclAny.initOperations(_Integer__OclAny);
			Fragments._Integer__OclComparable.initOperations(_Integer__OclComparable);
			Fragments._Integer__OclSummable.initOperations(_Integer__OclSummable);
			Fragments._Integer__Real.initOperations(_Integer__Real);
	
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
	
			Fragments._OclType__OclAny.initOperations(_OclType__OclAny);
			Fragments._OclType__OclElement.initOperations(_OclType__OclElement);
			Fragments._OclType__OclType.initOperations(_OclType__OclType);
	
			Fragments._OclVoid__OclAny.initOperations(_OclVoid__OclAny);
			Fragments._OclVoid__OclVoid.initOperations(_OclVoid__OclVoid);
	
			Fragments._OrderedSet__Collection.initOperations(_OrderedSet__Collection);
			Fragments._OrderedSet__OclAny.initOperations(_OrderedSet__OclAny);
			Fragments._OrderedSet__OrderedSet.initOperations(_OrderedSet__OrderedSet);
			Fragments._OrderedSet__Sequence.initOperations(_OrderedSet__Sequence);
			Fragments._OrderedSet__UniqueCollection.initOperations(_OrderedSet__UniqueCollection);
	
			Fragments._Real__OclAny.initOperations(_Real__OclAny);
			Fragments._Real__OclComparable.initOperations(_Real__OclComparable);
			Fragments._Real__OclSummable.initOperations(_Real__OclSummable);
			Fragments._Real__Real.initOperations(_Real__Real);
	
			Fragments._Sequence__Collection.initOperations(_Sequence__Collection);
			Fragments._Sequence__OclAny.initOperations(_Sequence__OclAny);
			Fragments._Sequence__Sequence.initOperations(_Sequence__Sequence);
	
			Fragments._Set__Bag.initOperations(_Set__Bag);
			Fragments._Set__Collection.initOperations(_Set__Collection);
			Fragments._Set__OclAny.initOperations(_Set__OclAny);
			Fragments._Set__Set.initOperations(_Set__Set);
			Fragments._Set__UniqueCollection.initOperations(_Set__UniqueCollection);
	
			Fragments._String__OclAny.initOperations(_String__OclAny);
			Fragments._String__OclComparable.initOperations(_String__OclComparable);
			Fragments._String__OclSummable.initOperations(_String__OclSummable);
			Fragments._String__String.initOperations(_String__String);
	
			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__OclType.initOperations(_Type__OclType);
			Fragments._Type__Type.initOperations(_Type__Type);
	
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
	
		private static final ExecutorProperty[] _OclType = {};
	
		private static final ExecutorProperty[] _OclVoid = {};
	
		private static final ExecutorProperty[] _OrderedSet = {};
	
		private static final ExecutorProperty[] _Real = {};
	
		private static final ExecutorProperty[] _Sequence = {};
	
		private static final ExecutorProperty[] _Set = {};
	
		private static final ExecutorProperty[] _String = {};
	
		private static final ExecutorProperty[] _Type = {};
	
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
	  	 	Fragments._OclType__OclType.initProperties(_OclType);
	  	 	Fragments._OclVoid__OclVoid.initProperties(_OclVoid);
	  	 	Fragments._OrderedSet__OrderedSet.initProperties(_OrderedSet);
	  	 	Fragments._Real__Real.initProperties(_Real);
	  	 	Fragments._Sequence__Sequence.initProperties(_Sequence);
	  	 	Fragments._Set__Set.initProperties(_Set);
	  	 	Fragments._String__String.initProperties(_String);
	  	 	Fragments._Type__Type.initProperties(_Type);
	  	 	Fragments._UniqueCollection__UniqueCollection.initProperties(_UniqueCollection);
	  	 	Fragments._UnlimitedNatural__UnlimitedNatural.initProperties(_UnlimitedNatural);
	  	 	Fragments.__Dummy___Dummy.initProperties(__Dummy);
		}
	
		public static void init() {}
	}
	
	
	static {
		Types.types[0].getClass();
	}
}

