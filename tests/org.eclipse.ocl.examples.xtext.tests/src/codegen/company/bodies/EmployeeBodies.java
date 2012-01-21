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
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainProperty;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.AbstractProperty;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryIteration;
import org.eclipse.ocl.examples.domain.library.LibraryProperty;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

/**
 * EmployeeBodies provides the Java implementation bodies of OCL-defined Employee operations and properties.
 */
@SuppressWarnings("nls")
public class EmployeeBodies
{

	/** 
	 * Implementation of the Employee 'mustHaveName' invariant.
	 */
	public static class _invariant_mustHaveName extends AbstractUnaryOperation
	{
		public static _invariant_mustHaveName INSTANCE = new _invariant_mustHaveName();
	
		/*
		not name.oclIsUndefined() and hasNameAsAttribute and hasNameAsOperation()
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_and = OCLstdlibTables.Operations._Boolean__and;
			final ExecutorOperation O_Boolean_not = OCLstdlibTables.Operations._Boolean__not;
			final ExecutorOperation O_OclAny_oclIsUndefined = OCLstdlibTables.Operations._OclAny__oclIsUndefined;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_Employee_name = CodegencompanyTables.Properties._Employee__name;
			final LibraryProperty IP_Employee_name = P_Employee_name.getImplementation();
			final ExecutorProperty P_Employee_hasNameAsAttribute = CodegencompanyTables.Properties._Employee__hasNameAsAttribute;
			final LibraryProperty IP_Employee_hasNameAsAttribute = P_Employee_hasNameAsAttribute.getImplementation();
			final ExecutorOperation O_Employee_hasNameAsOperation = CodegencompanyTables.Operations._Employee__hasNameAsOperation;
			
			Value leftA_symbol_0;
			try {
				Value leftA_symbol_1;
				try {
					
					Value A_symbol_2 = IP_Employee_name.evaluate(evaluator, T_String, self, P_Employee_name);
					
					DomainType static_A_symbol_3 = valueFactory.typeOf(A_symbol_2);
					LibraryUnaryOperation dynamic_A_symbol_3 = (LibraryUnaryOperation)static_A_symbol_3.lookupImplementation(standardLibrary, O_OclAny_oclIsUndefined);
					Value A_symbol_3 = dynamic_A_symbol_3.evaluate(evaluator, T_Boolean, A_symbol_2);
					DomainType static_A_symbol_4 = valueFactory.typeOf(A_symbol_3);
					LibraryUnaryOperation dynamic_A_symbol_4 = (LibraryUnaryOperation)static_A_symbol_4.lookupImplementation(standardLibrary, O_Boolean_not);
					Value A_symbol_4 = dynamic_A_symbol_4.evaluate(evaluator, T_Boolean, A_symbol_3);
					leftA_symbol_1 = A_symbol_4;
				} catch (InvalidValueException e) {
					leftA_symbol_1 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_4 = leftA_symbol_1;
				Value rightA_symbol_1;
				try {
					
					Value A_symbol_5 = IP_Employee_hasNameAsAttribute.evaluate(evaluator, T_Boolean, self, P_Employee_hasNameAsAttribute);
					
					rightA_symbol_1 = A_symbol_5;
				} catch (InvalidValueException e) {
					rightA_symbol_1 = valueFactory.createInvalidValue(e);
				}
				Value A_symbol_5 = rightA_symbol_1;
				DomainType static_A_symbol_1 = valueFactory.typeOf(A_symbol_4);
				LibraryBinaryOperation dynamic_A_symbol_1 = (LibraryBinaryOperation)static_A_symbol_1.lookupImplementation(standardLibrary, O_Boolean_and);
				Value A_symbol_1 = dynamic_A_symbol_1.evaluate(evaluator, T_Boolean, A_symbol_4, A_symbol_5);
				leftA_symbol_0 = A_symbol_1;
			} catch (InvalidValueException e) {
				leftA_symbol_0 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_1 = leftA_symbol_0;
			Value rightA_symbol_0;
			try {
				
				DomainType static_A_symbol_6 = valueFactory.typeOf(self);
				LibraryUnaryOperation dynamic_A_symbol_6 = (LibraryUnaryOperation)static_A_symbol_6.lookupImplementation(standardLibrary, O_Employee_hasNameAsOperation);
				Value A_symbol_6 = dynamic_A_symbol_6.evaluate(evaluator, T_Boolean, self);
				rightA_symbol_0 = A_symbol_6;
			} catch (InvalidValueException e) {
				rightA_symbol_0 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_6 = rightA_symbol_0;
			DomainType static_A_symbol_0 = valueFactory.typeOf(A_symbol_1);
			LibraryBinaryOperation dynamic_A_symbol_0 = (LibraryBinaryOperation)static_A_symbol_0.lookupImplementation(standardLibrary, O_Boolean_and);
			Value A_symbol_0 = dynamic_A_symbol_0.evaluate(evaluator, T_Boolean, A_symbol_1, A_symbol_6);
			return A_symbol_0;
		}
	}

	/** 
	 * Implementation of the Employee 'mustHaveNonEmptyName' invariant.
	 */
	public static class _invariant_mustHaveNonEmptyName extends AbstractUnaryOperation
	{
		public static _invariant_mustHaveNonEmptyName INSTANCE = new _invariant_mustHaveNonEmptyName();
	
		/*
		name->notEmpty() implies name.size() > 0
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_Collection_notEmpty = OCLstdlibTables.Operations._Collection__notEmpty;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final DomainCollectionType T_Set_String_ = standardLibrary.getSetType(T_String);
			final ExecutorOperation O_OclAny_oclAsSet = OCLstdlibTables.Operations._OclAny__oclAsSet;
			final ExecutorProperty P_Employee_name = CodegencompanyTables.Properties._Employee__name;
			final LibraryProperty IP_Employee_name = P_Employee_name.getImplementation();
			final ExecutorOperation O_Real__gt_ = OCLstdlibTables.Operations._Real___gt_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_String_size = OCLstdlibTables.Operations._String__size;
			final IntegerValue I_0 = valueFactory.integerValueOf(0);
			
			Value leftA_symbol_7;
			try {
				
				Value A_symbol_8 = IP_Employee_name.evaluate(evaluator, T_String, self, P_Employee_name);
				
				DomainType static_A_symbol_9 = valueFactory.typeOf(A_symbol_8);
				LibraryUnaryOperation dynamic_A_symbol_9 = (LibraryUnaryOperation)static_A_symbol_9.lookupImplementation(standardLibrary, O_OclAny_oclAsSet);
				Value A_symbol_9 = dynamic_A_symbol_9.evaluate(evaluator, T_Set_String_, A_symbol_8);
				DomainType static_A_symbol_10 = valueFactory.typeOf(A_symbol_9);
				LibraryUnaryOperation dynamic_A_symbol_10 = (LibraryUnaryOperation)static_A_symbol_10.lookupImplementation(standardLibrary, O_Collection_notEmpty);
				Value A_symbol_10 = dynamic_A_symbol_10.evaluate(evaluator, T_Boolean, A_symbol_9);
				leftA_symbol_7 = A_symbol_10;
			} catch (InvalidValueException e) {
				leftA_symbol_7 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_10 = leftA_symbol_7;
			Value rightA_symbol_7;
			try {
				
				Value A_symbol_11 = IP_Employee_name.evaluate(evaluator, T_String, self, P_Employee_name);
				
				DomainType static_A_symbol_12 = valueFactory.typeOf(A_symbol_11);
				LibraryUnaryOperation dynamic_A_symbol_12 = (LibraryUnaryOperation)static_A_symbol_12.lookupImplementation(standardLibrary, O_String_size);
				Value A_symbol_12 = dynamic_A_symbol_12.evaluate(evaluator, T_Integer, A_symbol_11);
				DomainType static_A_symbol_13 = valueFactory.typeOf(A_symbol_12, I_0);
				LibraryBinaryOperation dynamic_A_symbol_13 = (LibraryBinaryOperation)static_A_symbol_13.lookupImplementation(standardLibrary, O_Real__gt_);
				Value A_symbol_13 = dynamic_A_symbol_13.evaluate(evaluator, T_Boolean, A_symbol_12, I_0);
				rightA_symbol_7 = A_symbol_13;
			} catch (InvalidValueException e) {
				rightA_symbol_7 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_13 = rightA_symbol_7;
			DomainType static_A_symbol_7 = valueFactory.typeOf(A_symbol_10);
			LibraryBinaryOperation dynamic_A_symbol_7 = (LibraryBinaryOperation)static_A_symbol_7.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_7 = dynamic_A_symbol_7.evaluate(evaluator, T_Boolean, A_symbol_10, A_symbol_13);
			return A_symbol_7;
		}
	}

	/** 
	 * Implementation of the Employee 'noManagerImpliesDirectReports' invariant.
	 */
	public static class _invariant_noManagerImpliesDirectReports extends AbstractUnaryOperation
	{
		public static _invariant_noManagerImpliesDirectReports INSTANCE = new _invariant_noManagerImpliesDirectReports();
	
		/*
		manager.oclIsUndefined() implies directReports->size() > 0
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Boolean_implies = OCLstdlibTables.Operations._Boolean__implies;
			final ExecutorOperation O_OclAny_oclIsUndefined = OCLstdlibTables.Operations._OclAny__oclIsUndefined;
			final ExecutorType T_Company_ecore__company__Employee = CodegencompanyTables.Types._Employee;
			final ExecutorProperty P_Employee_manager = CodegencompanyTables.Properties._Employee__manager;
			final LibraryProperty IP_Employee_manager = P_Employee_manager.getImplementation();
			final ExecutorOperation O_Real__gt_ = OCLstdlibTables.Operations._Real___gt_;
			final ExecutorType T_Integer = OCLstdlibTables.Types._Integer;
			final ExecutorOperation O_Collection_size = OCLstdlibTables.Operations._Collection__size;
			final DomainCollectionType T_OrderedSet_Company_ecore__company__Employee_ = standardLibrary.getOrderedSetType(T_Company_ecore__company__Employee);
			final ExecutorProperty P_Employee_directReports = CodegencompanyTables.Properties._Employee__directReports;
			final LibraryProperty IP_Employee_directReports = P_Employee_directReports.getImplementation();
			final IntegerValue I_0 = valueFactory.integerValueOf(0);
			
			Value leftA_symbol_14;
			try {
				
				Value A_symbol_15 = IP_Employee_manager.evaluate(evaluator, T_Company_ecore__company__Employee, self, P_Employee_manager);
				
				DomainType static_A_symbol_16 = valueFactory.typeOf(A_symbol_15);
				LibraryUnaryOperation dynamic_A_symbol_16 = (LibraryUnaryOperation)static_A_symbol_16.lookupImplementation(standardLibrary, O_OclAny_oclIsUndefined);
				Value A_symbol_16 = dynamic_A_symbol_16.evaluate(evaluator, T_Boolean, A_symbol_15);
				leftA_symbol_14 = A_symbol_16;
			} catch (InvalidValueException e) {
				leftA_symbol_14 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_16 = leftA_symbol_14;
			Value rightA_symbol_14;
			try {
				
				Value A_symbol_17 = IP_Employee_directReports.evaluate(evaluator, T_OrderedSet_Company_ecore__company__Employee_, self, P_Employee_directReports);
				
				DomainType static_A_symbol_18 = valueFactory.typeOf(A_symbol_17);
				LibraryUnaryOperation dynamic_A_symbol_18 = (LibraryUnaryOperation)static_A_symbol_18.lookupImplementation(standardLibrary, O_Collection_size);
				Value A_symbol_18 = dynamic_A_symbol_18.evaluate(evaluator, T_Integer, A_symbol_17);
				DomainType static_A_symbol_19 = valueFactory.typeOf(A_symbol_18, I_0);
				LibraryBinaryOperation dynamic_A_symbol_19 = (LibraryBinaryOperation)static_A_symbol_19.lookupImplementation(standardLibrary, O_Real__gt_);
				Value A_symbol_19 = dynamic_A_symbol_19.evaluate(evaluator, T_Boolean, A_symbol_18, I_0);
				rightA_symbol_14 = A_symbol_19;
			} catch (InvalidValueException e) {
				rightA_symbol_14 = valueFactory.createInvalidValue(e);
			}
			Value A_symbol_19 = rightA_symbol_14;
			DomainType static_A_symbol_14 = valueFactory.typeOf(A_symbol_16);
			LibraryBinaryOperation dynamic_A_symbol_14 = (LibraryBinaryOperation)static_A_symbol_14.lookupImplementation(standardLibrary, O_Boolean_implies);
			Value A_symbol_14 = dynamic_A_symbol_14.evaluate(evaluator, T_Boolean, A_symbol_16, A_symbol_19);
			return A_symbol_14;
		}
	}

	/** 
	 * Implementation of the Employee::hasNameAsOperation '' <body>.
	 */
	public static class _hasNameAsOperation_body_ extends AbstractUnaryOperation
	{
		public static _hasNameAsOperation_body_ INSTANCE = new _hasNameAsOperation_body_();
	
		/*
		name <> null
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_String__lt__gt_ = OCLstdlibTables.Operations._String___lt__gt_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_Employee_name = CodegencompanyTables.Properties._Employee__name;
			final LibraryProperty IP_Employee_name = P_Employee_name.getImplementation();
			final NullValue Null = valueFactory.getNull();
			
			
			Value A_symbol_20 = IP_Employee_name.evaluate(evaluator, T_String, self, P_Employee_name);
			
			DomainType static_A_symbol_21 = valueFactory.typeOf(A_symbol_20, Null);
			LibraryBinaryOperation dynamic_A_symbol_21 = (LibraryBinaryOperation)static_A_symbol_21.lookupImplementation(standardLibrary, O_String__lt__gt_);
			Value A_symbol_21 = dynamic_A_symbol_21.evaluate(evaluator, T_Boolean, A_symbol_20, Null);
			return A_symbol_21;
		}
	}

	/** 
	 * Implementation of the Employee::reportsTo '' <body>.
	 */
	public static class _reportsTo_body_ extends AbstractBinaryOperation
	{
		public static _reportsTo_body_ INSTANCE = new _reportsTo_body_();
	
		/*
		self.reportingChain->includes(manager)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value self, Value manager) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Collection_includes = OCLstdlibTables.Operations._Collection__includes;
			final ExecutorType T_Company_ecore__company__Employee = CodegencompanyTables.Types._Employee;
			final DomainCollectionType T_OrderedSet_Company_ecore__company__Employee_ = standardLibrary.getOrderedSetType(T_Company_ecore__company__Employee);
			final ExecutorProperty P_Employee_reportingChain = CodegencompanyTables.Properties._Employee__reportingChain;
			final LibraryProperty IP_Employee_reportingChain = P_Employee_reportingChain.getImplementation();
			final ExecutorProperty P_Employee_manager = CodegencompanyTables.Properties._Employee__manager;
			final LibraryProperty IP_Employee_manager = P_Employee_manager.getImplementation();
			
			
			Value A_symbol_22 = IP_Employee_reportingChain.evaluate(evaluator, T_OrderedSet_Company_ecore__company__Employee_, self, P_Employee_reportingChain);
			
			
			Value A_symbol_23 = IP_Employee_manager.evaluate(evaluator, T_Company_ecore__company__Employee, self, P_Employee_manager);
			
			DomainType static_A_symbol_24 = valueFactory.typeOf(A_symbol_22);
			LibraryBinaryOperation dynamic_A_symbol_24 = (LibraryBinaryOperation)static_A_symbol_24.lookupImplementation(standardLibrary, O_Collection_includes);
			Value A_symbol_24 = dynamic_A_symbol_24.evaluate(evaluator, T_Boolean, A_symbol_22, A_symbol_23);
			return A_symbol_24;
		}
	}


	/** 
	 * Implementation of the Employee::allReports '' <derivation>.
	 */
	public static class _allReports_derivation_ extends AbstractProperty
	{
		public static _allReports_derivation_ INSTANCE = new _allReports_derivation_();
	
		/*
		Employee.allInstances()->select(reportsTo(self))
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, DomainProperty property) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Company_ecore__company__Employee = CodegencompanyTables.Types._Employee;
			final DomainCollectionType T_Set_Company_ecore__company__Employee_ = standardLibrary.getSetType(T_Company_ecore__company__Employee);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_Set_select = OCLstdlibTables.Operations._Set__select;
			final ExecutorOperation O_OclElement_allInstances = OCLstdlibTables.Operations._OclElement__allInstances;
			final Value T_ClassClassifier_Company_ecore__company__Employee_ = valueFactory.createTypeValue(CodegencompanyTables.Types._Employee);
			final ExecutorOperation O_Employee_reportsTo = CodegencompanyTables.Operations._Employee__reportsTo;
			
			DomainType static_A_symbol_25 = valueFactory.typeOf(T_ClassClassifier_Company_ecore__company__Employee_);
			LibraryUnaryOperation dynamic_A_symbol_25 = (LibraryUnaryOperation)static_A_symbol_25.lookupImplementation(standardLibrary, O_OclElement_allInstances);
			Value A_symbol_25 = dynamic_A_symbol_25.evaluate(evaluator, T_Set_Company_ecore__company__Employee_, T_ClassClassifier_Company_ecore__company__Employee_);
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_26 = new AbstractBinaryOperation()
			{
			/*
			reportsTo(self)
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					
					DomainType static_A_symbol_27 = valueFactory.typeOf(V_1_);
					LibraryBinaryOperation dynamic_A_symbol_27 = (LibraryBinaryOperation)static_A_symbol_27.lookupImplementation(standardLibrary, O_Employee_reportsTo);
					Value A_symbol_27 = dynamic_A_symbol_27.evaluate(evaluator, T_Boolean, V_1_, self);
					return A_symbol_27;
				}
			};
			DomainType static_A_symbol_26 = A_symbol_25.getType();
			LibraryIteration dynamic_A_symbol_26 = (LibraryIteration)static_A_symbol_26.lookupImplementation(standardLibrary, O_Set_select);
			Value acc_A_symbol_26 = dynamic_A_symbol_26.createAccumulatorValue(evaluator, T_Set_Company_ecore__company__Employee_, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_26 = new ExecutorSingleIterationManager(evaluator, T_Set_Company_ecore__company__Employee_, body_A_symbol_26, (CollectionValue)A_symbol_25, acc_A_symbol_26);
			Value A_symbol_26 = dynamic_A_symbol_26.evaluateIteration(manager_A_symbol_26);
			return A_symbol_26;
		}}


	/** 
	 * Implementation of the Employee::directReports '' <derivation>.
	 */
	public static class _directReports_derivation_ extends AbstractProperty
	{
		public static _directReports_derivation_ INSTANCE = new _directReports_derivation_();
	
		/*
		company.employees->select(manager = self)
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, DomainProperty property) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Company_ecore__company__Employee = CodegencompanyTables.Types._Employee;
			final DomainCollectionType T_OrderedSet_Company_ecore__company__Employee_ = standardLibrary.getOrderedSetType(T_Company_ecore__company__Employee);
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OrderedSet_select = OCLstdlibTables.Operations._OrderedSet__select;
			final ExecutorProperty P_Company_employees = CodegencompanyTables.Properties._Company__employees;
			final LibraryProperty IP_Company_employees = P_Company_employees.getImplementation();
			final ExecutorType T_Company_ecore__company__Company = CodegencompanyTables.Types._Company;
			final ExecutorProperty P_Employee_company = CodegencompanyTables.Properties._Employee__company;
			final LibraryProperty IP_Employee_company = P_Employee_company.getImplementation();
			final ExecutorOperation O_OclAny__eq_ = OCLstdlibTables.Operations._OclAny___eq_;
			final ExecutorProperty P_Employee_manager = CodegencompanyTables.Properties._Employee__manager;
			final LibraryProperty IP_Employee_manager = P_Employee_manager.getImplementation();
			
			
			Value A_symbol_30 = IP_Employee_company.evaluate(evaluator, T_Company_ecore__company__Company, self, P_Employee_company);
			
			Value A_symbol_28 = IP_Company_employees.evaluate(evaluator, T_OrderedSet_Company_ecore__company__Employee_, A_symbol_30, P_Company_employees);
			
			
			/** 
			 * Implementation of the iterator body.
			 */
			AbstractBinaryOperation body_A_symbol_29 = new AbstractBinaryOperation()
			{
			/*
			manager = self
			*/
				public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value iterator1) throws InvalidValueException {
					final Value V_1_ = iterator1;	// iterator: 1_
					
					Value A_symbol_31 = IP_Employee_manager.evaluate(evaluator, T_Company_ecore__company__Employee, V_1_, P_Employee_manager);
					
					
					DomainType static_A_symbol_32 = valueFactory.typeOf(A_symbol_31, self);
					LibraryBinaryOperation dynamic_A_symbol_32 = (LibraryBinaryOperation)static_A_symbol_32.lookupImplementation(standardLibrary, O_OclAny__eq_);
					Value A_symbol_32 = dynamic_A_symbol_32.evaluate(evaluator, T_Boolean, A_symbol_31, self);
					return A_symbol_32;
				}
			};
			DomainType static_A_symbol_29 = A_symbol_28.getType();
			LibraryIteration dynamic_A_symbol_29 = (LibraryIteration)static_A_symbol_29.lookupImplementation(standardLibrary, O_OrderedSet_select);
			Value acc_A_symbol_29 = dynamic_A_symbol_29.createAccumulatorValue(evaluator, T_OrderedSet_Company_ecore__company__Employee_, T_Boolean);
			ExecutorSingleIterationManager manager_A_symbol_29 = new ExecutorSingleIterationManager(evaluator, T_OrderedSet_Company_ecore__company__Employee_, body_A_symbol_29, (CollectionValue)A_symbol_28, acc_A_symbol_29);
			Value A_symbol_29 = dynamic_A_symbol_29.evaluateIteration(manager_A_symbol_29);
			return A_symbol_29;
		}}

	/** 
	 * Implementation of the Employee::hasNameAsAttribute '' <derivation>.
	 */
	public static class _hasNameAsAttribute_derivation_ extends AbstractProperty
	{
		public static _hasNameAsAttribute_derivation_ INSTANCE = new _hasNameAsAttribute_derivation_();
	
		/*
		name <> null
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, DomainProperty property) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_String__lt__gt_ = OCLstdlibTables.Operations._String___lt__gt_;
			final ExecutorType T_String = OCLstdlibTables.Types._String;
			final ExecutorProperty P_Employee_name = CodegencompanyTables.Properties._Employee__name;
			final LibraryProperty IP_Employee_name = P_Employee_name.getImplementation();
			final NullValue Null = valueFactory.getNull();
			
			
			Value A_symbol_33 = IP_Employee_name.evaluate(evaluator, T_String, self, P_Employee_name);
			
			DomainType static_A_symbol_34 = valueFactory.typeOf(A_symbol_33, Null);
			LibraryBinaryOperation dynamic_A_symbol_34 = (LibraryBinaryOperation)static_A_symbol_34.lookupImplementation(standardLibrary, O_String__lt__gt_);
			Value A_symbol_34 = dynamic_A_symbol_34.evaluate(evaluator, T_Boolean, A_symbol_33, Null);
			return A_symbol_34;
		}}



	/** 
	 * Implementation of the Employee::reportingChain '' <derivation>.
	 */
	public static class _reportingChain_derivation_ extends AbstractProperty
	{
		public static _reportingChain_derivation_ INSTANCE = new _reportingChain_derivation_();
	
		/*
		if manager.oclIsUndefined()
	then OrderedSet{}
	else manager.reportingChain->prepend(manager)
	endif
		*/
		public Value evaluate(DomainEvaluator evaluator, DomainType returnType, final Value self, DomainProperty property) throws InvalidValueException {
			final ValueFactory valueFactory = evaluator.getValueFactory();
			final DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			final ExecutorType T_Boolean = OCLstdlibTables.Types._Boolean;
			final ExecutorOperation O_OclAny_oclIsUndefined = OCLstdlibTables.Operations._OclAny__oclIsUndefined;
			final ExecutorType T_Company_ecore__company__Employee = CodegencompanyTables.Types._Employee;
			final ExecutorProperty P_Employee_manager = CodegencompanyTables.Properties._Employee__manager;
			final LibraryProperty IP_Employee_manager = P_Employee_manager.getImplementation();
			final DomainCollectionType T_OrderedSet_Company_ecore__company__Employee_ = standardLibrary.getOrderedSetType(T_Company_ecore__company__Employee);
			final Value A_symbol_35 = valueFactory.createOrderedSetValue(T_OrderedSet_Company_ecore__company__Employee_);
			final ExecutorOperation O_OrderedSet_prepend = OCLstdlibTables.Operations._OrderedSet__prepend;
			final ExecutorProperty P_Employee_reportingChain = CodegencompanyTables.Properties._Employee__reportingChain;
			final LibraryProperty IP_Employee_reportingChain = P_Employee_reportingChain.getImplementation();
			
				
				Value A_symbol_36 = IP_Employee_manager.evaluate(evaluator, T_Company_ecore__company__Employee, self, P_Employee_manager);
				
				DomainType static_A_symbol_37 = valueFactory.typeOf(A_symbol_36);
				LibraryUnaryOperation dynamic_A_symbol_37 = (LibraryUnaryOperation)static_A_symbol_37.lookupImplementation(standardLibrary, O_OclAny_oclIsUndefined);
				Value A_symbol_37 = dynamic_A_symbol_37.evaluate(evaluator, T_Boolean, A_symbol_36);
			Value A_symbol_38;
			if (A_symbol_37.isTrue()) {
				A_symbol_38 = A_symbol_35;
			}
			else if (A_symbol_37.isFalse()) {
				
				Value A_symbol_39 = IP_Employee_manager.evaluate(evaluator, T_Company_ecore__company__Employee, self, P_Employee_manager);
				
				Value A_symbol_40 = IP_Employee_reportingChain.evaluate(evaluator, T_OrderedSet_Company_ecore__company__Employee_, A_symbol_39, P_Employee_reportingChain);
				
				
				Value A_symbol_41 = IP_Employee_manager.evaluate(evaluator, T_Company_ecore__company__Employee, self, P_Employee_manager);
				
				DomainType static_A_symbol_42 = valueFactory.typeOf(A_symbol_40);
				LibraryBinaryOperation dynamic_A_symbol_42 = (LibraryBinaryOperation)static_A_symbol_42.lookupImplementation(standardLibrary, O_OrderedSet_prepend);
				Value A_symbol_42 = dynamic_A_symbol_42.evaluate(evaluator, T_OrderedSet_Company_ecore__company__Employee_, A_symbol_40, A_symbol_41);
				A_symbol_38 = A_symbol_42;
			}
			else if (A_symbol_37.isNull()) {
				A_symbol_38 = valueFactory.throwInvalidValueException("null if condition");
			}
			else {
				A_symbol_38 = valueFactory.throwInvalidValueException("invalid if condition");
			}
			return A_symbol_38;
		}}
}

