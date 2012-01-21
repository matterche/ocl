/**
 * 
 *************************************************************************
 * This code is 100% auto-generated
 * from: company
 * using: org.eclipse.ocl.examples.codegen.tables.model2tables.mtl
 *
 * Do not edit it.
 */
package codegen.company.bodies;

import codegen.company.CodegencompanyTables;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainTupleType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.AbstractProperty;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryIteration;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.IntegerRange;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.TupleValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

/**
 * CompanyBodies provides the Java implementation bodies of OCL-defined Company operations and properties.
 */
@SuppressWarnings("nls")
public class CompanyBodies
{

	/** 
	 * Implementation of the Company 'dummyInvariant' invariant.
	 */
	public static class _invariant_dummyInvariant extends AbstractUnaryOperation
	{
		public static _invariant_dummyInvariant INSTANCE = new _invariant_dummyInvariant();
	
		/*
		true
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final BooleanValue True = valueFactory.getTrue();
			
			
			return True;
		}
	}



	/** 
	 * Implementation of the Company::size '' <derivation>.
	 */
	public static class _size_derivation_ extends AbstractProperty
	{
		public static _size_derivation_ INSTANCE = new _size_derivation_();
	
		/*
		let
	  table : Set(Tuple(range : Sequence(Integer), size : CompanySizeKind)) = Set{
	    Tuple{range = Sequence{0..49}, size = CompanySizeKind::small
	    }
	    , Tuple{range = Sequence{50..999}, size = CompanySizeKind::medium
	    }
	    , Tuple{range = Sequence{1000..1000000}, size = CompanySizeKind::large
	    }
	  }
	in
	  table->any(range->includes(employees->size())).size
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, DomainProperty property) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Company_ecore__company__CompanySizeKind = CodegencompanyTables.Types._CompanySizeKind;
			final DomainTypedElement L_size_Company_ecore__company__CompanySizeKind = standardLibrary.getTuplePart("size", T_Company_ecore__company__CompanySizeKind);
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final DomainCollectionType T_Sequence_Integer_ = standardLibrary.getSequenceType(T_Integer);
			final DomainTypedElement L_range_Sequence_Integer_ = standardLibrary.getTuplePart("range", T_Sequence_Integer_);
			final DomainTupleType U_Tuple_range_Sequence_size_CompanySizeKind_ = standardLibrary.getTupleType(L_range_Sequence_Integer_, L_size_Company_ecore__company__CompanySizeKind);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_any = OCLstdlibTables.Operations._Collection__any;
			final ExecutorOperation O_Collection_includes = OCLstdlibTables.Operations._Collection__includes;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final ExecutorType T_Company_ecore__company__Employee = CodegencompanyTables.Types._Employee;
			final DomainCollectionType T_OrderedSet_Company_ecore__company__Employee_ = standardLibrary.getOrderedSetType(T_Company_ecore__company__Employee);
			final ExecutorProperty P_Company_employees = CodegencompanyTables.Properties._Company__employees;
			final LibraryProperty IP_Company_employees = P_Company_employees.getImplementation();
			final ExecutorType T_UnlimitedNatural = OCLstdlibTables.Types._UnlimitedNatural;
			final DomainCollectionType T_Sequence_UnlimitedNatural_ = standardLibrary.getSequenceType(T_UnlimitedNatural);
			final DomainTypedElement L_range_Sequence_UnlimitedNatural_ = standardLibrary.getTuplePart("range", T_Sequence_UnlimitedNatural_);
			final DomainTupleType U_Tuple_range_Sequence_size_CompanySizeKind_1 = standardLibrary.getTupleType(L_range_Sequence_UnlimitedNatural_, L_size_Company_ecore__company__CompanySizeKind);
			final DomainCollectionType T_Set_Tuple_range_Sequence_size_CompanySizeKind__ = standardLibrary.getSetType(U_Tuple_range_Sequence_size_CompanySizeKind_1);
			final IntegerValue I_0 = valueFactory.integerValueOf(0);
			final IntegerValue I_49 = valueFactory.integerValueOf(49);
			final IntegerRange rA_symbol_43 = valueFactory.createRange(I_0.asIntegerValue(), I_49.asIntegerValue());
			final Value A_symbol_43 = valueFactory.createSequenceRange(T_Sequence_UnlimitedNatural_, rA_symbol_43);
			final Value A_symbol_44 = valueFactory.createEnumerationLiteralValue(CodegencompanyTables.EnumerationLiterals._CompanySizeKind__small);
			final IntegerValue I_50 = valueFactory.integerValueOf(50);
			final IntegerValue I_999 = valueFactory.integerValueOf(999);
			final IntegerRange rA_symbol_45 = valueFactory.createRange(I_50.asIntegerValue(), I_999.asIntegerValue());
			final Value A_symbol_45 = valueFactory.createSequenceRange(T_Sequence_UnlimitedNatural_, rA_symbol_45);
			final Value A_symbol_46 = valueFactory.createEnumerationLiteralValue(CodegencompanyTables.EnumerationLiterals._CompanySizeKind__medium);
			final IntegerValue I_1000 = valueFactory.integerValueOf(1000);
			final IntegerValue I_1000000 = valueFactory.integerValueOf(1000000);
			final IntegerRange rA_symbol_47 = valueFactory.createRange(I_1000.asIntegerValue(), I_1000000.asIntegerValue());
			final Value A_symbol_47 = valueFactory.createSequenceRange(T_Sequence_UnlimitedNatural_, rA_symbol_47);
			final Value A_symbol_48 = valueFactory.createEnumerationLiteralValue(CodegencompanyTables.EnumerationLiterals._CompanySizeKind__large);
			
			
			final Map<DomainTypedElement, Value> mA_symbol_49 = new HashMap<DomainTypedElement, Value>();
			mA_symbol_49.put(L_range_Sequence_UnlimitedNatural_, A_symbol_43);
			mA_symbol_49.put(L_size_Company_ecore__company__CompanySizeKind, A_symbol_44);
			TupleValue A_symbol_49 = valueFactory.createTupleValue(U_Tuple_range_Sequence_size_CompanySizeKind_1, mA_symbol_49);
			
			
			final Map<DomainTypedElement, Value> mA_symbol_50 = new HashMap<DomainTypedElement, Value>();
			mA_symbol_50.put(L_range_Sequence_UnlimitedNatural_, A_symbol_45);
			mA_symbol_50.put(L_size_Company_ecore__company__CompanySizeKind, A_symbol_46);
			TupleValue A_symbol_50 = valueFactory.createTupleValue(U_Tuple_range_Sequence_size_CompanySizeKind_1, mA_symbol_50);
			
			
			final Map<DomainTypedElement, Value> mA_symbol_51 = new HashMap<DomainTypedElement, Value>();
			mA_symbol_51.put(L_range_Sequence_UnlimitedNatural_, A_symbol_47);
			mA_symbol_51.put(L_size_Company_ecore__company__CompanySizeKind, A_symbol_48);
			TupleValue A_symbol_51 = valueFactory.createTupleValue(U_Tuple_range_Sequence_size_CompanySizeKind_1, mA_symbol_51);
			
			final Value A_symbol_52 = valueFactory.createSetValue(T_Set_Tuple_range_Sequence_size_CompanySizeKind__, A_symbol_49, A_symbol_50, A_symbol_51);
			final Value V_table = A_symbol_52;
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_53 = new AbstractBinaryOperation()
			{
			/*
			range->includes(employees->size())
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_54 = ((TupleValue)V_1_).getValue(L_range_Sequence_Integer_);
					
					
					Value A_symbol_55 = IP_Company_employees.evaluate(evaluator, T_OrderedSet_Company_ecore__company__Employee_, self, P_Company_employees);
					
					DomainType static_A_symbol_56 = valueFactory.typeOf(A_symbol_55);
					LibraryUnaryOperation dynamic_A_symbol_56 = (LibraryUnaryOperation)static_A_symbol_56.lookupImplementation(standardLibrary, O_Collection_size);
					Value A_symbol_56 = dynamic_A_symbol_56.evaluate(evaluator, T_Integer, A_symbol_55);
					DomainType static_A_symbol_57 = valueFactory.typeOf(A_symbol_54);
					LibraryBinaryOperation dynamic_A_symbol_57 = (LibraryBinaryOperation)static_A_symbol_57.lookupImplementation(standardLibrary, O_Collection_includes);
					Value A_symbol_57 = dynamic_A_symbol_57.evaluate(evaluator, T_Boolean, A_symbol_54, A_symbol_56);
					return A_symbol_57;
				}
			};
			DomainType static_A_symbol_53 = V_table.getType();
			LibraryIteration dynamic_A_symbol_53 = (LibraryIteration)static_A_symbol_53.lookupImplementation(standardLibrary, O_Collection_any);
			Value acc_A_symbol_53 = dynamic_A_symbol_53.createAccumulatorValue(evaluator, U_Tuple_range_Sequence_size_CompanySizeKind_, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_53 = new ExecutorSingleIterationManager(evaluator, U_Tuple_range_Sequence_size_CompanySizeKind_, body_A_symbol_53, (CollectionValue)V_table, acc_A_symbol_53);
			Value A_symbol_53 = dynamic_A_symbol_53.evaluateIteration(manager_A_symbol_53);
			Value A_symbol_58 = ((TupleValue)A_symbol_53).getValue(L_size_Company_ecore__company__CompanySizeKind);
			
			final Value A_symbol_59 = A_symbol_58;
			return A_symbol_59;
		}}
}

