/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package codegen.company;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codegen.company.Employee#getName <em>Name</em>}</li>
 *   <li>{@link codegen.company.Employee#getManager <em>Manager</em>}</li>
 *   <li>{@link codegen.company.Employee#getCompany <em>Company</em>}</li>
 *   <li>{@link codegen.company.Employee#getDirectReports <em>Direct Reports</em>}</li>
 *   <li>{@link codegen.company.Employee#getAllReports <em>All Reports</em>}</li>
 *   <li>{@link codegen.company.Employee#getReportingChain <em>Reporting Chain</em>}</li>
 *   <li>{@link codegen.company.Employee#isHasNameAsAttribute <em>Has Name As Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see codegen.company.CodegencompanyPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see codegen.company.CodegencompanyPackage#getEmployee_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link codegen.company.Employee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employee)
	 * @see codegen.company.CodegencompanyPackage#getEmployee_Manager()
	 * @model
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '{@link codegen.company.Employee#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link codegen.company.Company#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' container reference.
	 * @see #setCompany(Company)
	 * @see codegen.company.CodegencompanyPackage#getEmployee_Company()
	 * @see codegen.company.Company#getEmployees
	 * @model opposite="employees" required="true" transient="false"
	 * @generated
	 */
	Company getCompany();

	/**
	 * Sets the value of the '{@link codegen.company.Employee#getCompany <em>Company</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' container reference.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(Company value);

	/**
	 * Returns the value of the '<em><b>Direct Reports</b></em>' reference list.
	 * The list contents are of type {@link codegen.company.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Reports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Reports</em>' reference list.
	 * @see codegen.company.CodegencompanyPackage#getEmployee_DirectReports()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='company.employees->select(manager = self)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/** \n * self.company.employees->select(1_ : Company.ecore::company::Employee | 1_.manager.=(self))\n \052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>.INSTANCE;\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = valueFactory.getStandardLibrary();\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Company_ecore__company__Employee = <%codegen.company.CodegencompanyTables%>.Types._Employee;\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainCollectionType%> T_OrderedSet_Company_ecore__company__Employee_ = standardLibrary.getOrderedSetType(T_Company_ecore__company__Employee);\n\t\nfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_OrderedSet_Company_ecore__company__Employee_;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.EmployeeBodies%>._directReports_derivation_.INSTANCE.evaluate(evaluator, returnType, self, <%codegen.company.CodegencompanyTables%>.Properties._Employee__directReports);\n\treturn (EList<Employee>) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.EmployeeBodies\", e);\n}'"
	 * @generated
	 */
	EList<Employee> getDirectReports();

	/**
	 * Returns the value of the '<em><b>All Reports</b></em>' reference list.
	 * The list contents are of type {@link codegen.company.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Reports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Reports</em>' reference list.
	 * @see codegen.company.CodegencompanyPackage#getEmployee_AllReports()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Employee.allInstances()->select(reportsTo(self))'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/** \n * Company.ecore::company::Employee.allInstances()->select(1_ : Company.ecore::company::Employee | 1_.reportsTo(self))\n \052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>.INSTANCE;\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = valueFactory.getStandardLibrary();\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Company_ecore__company__Employee = <%codegen.company.CodegencompanyTables%>.Types._Employee;\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainCollectionType%> T_Set_Company_ecore__company__Employee_ = standardLibrary.getSetType(T_Company_ecore__company__Employee);\n\t\nfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Set_Company_ecore__company__Employee_;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.EmployeeBodies%>._allReports_derivation_.INSTANCE.evaluate(evaluator, returnType, self, <%codegen.company.CodegencompanyTables%>.Properties._Employee__allReports);\n\treturn (EList<Employee>) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.EmployeeBodies\", e);\n}'"
	 * @generated
	 */
	EList<Employee> getAllReports();

	/**
	 * Returns the value of the '<em><b>Reporting Chain</b></em>' reference list.
	 * The list contents are of type {@link codegen.company.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Chain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Chain</em>' reference list.
	 * @see codegen.company.CodegencompanyPackage#getEmployee_ReportingChain()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if manager.oclIsUndefined() then OrderedSet{} else manager.reportingChain->prepend(manager) endif'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/** \n * if self.manager.oclIsUndefined() then OrderedSet {} else self.manager.reportingChain->prepend(self.manager) endif\n \052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>.INSTANCE;\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = valueFactory.getStandardLibrary();\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Company_ecore__company__Employee = <%codegen.company.CodegencompanyTables%>.Types._Employee;\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainCollectionType%> T_OrderedSet_Company_ecore__company__Employee_ = standardLibrary.getOrderedSetType(T_Company_ecore__company__Employee);\n\t\nfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_OrderedSet_Company_ecore__company__Employee_;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.EmployeeBodies%>._reportingChain_derivation_.INSTANCE.evaluate(evaluator, returnType, self, <%codegen.company.CodegencompanyTables%>.Properties._Employee__reportingChain);\n\treturn (EList<Employee>) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.EmployeeBodies\", e);\n}'"
	 * @generated
	 */
	EList<Employee> getReportingChain();

	/**
	 * Returns the value of the '<em><b>Has Name As Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Name As Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Name As Attribute</em>' attribute.
	 * @see codegen.company.CodegencompanyPackage#getEmployee_HasNameAsAttribute()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='name <> null'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/** \n * self.name.<>(null)\n \052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>.INSTANCE;\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\nfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.EmployeeBodies%>._hasNameAsAttribute_derivation_.INSTANCE.evaluate(evaluator, returnType, self, <%codegen.company.CodegencompanyTables%>.Properties._Employee__hasNameAsAttribute);\n\treturn (Boolean) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.EmployeeBodies\", e);\n}'"
	 * @generated
	 */
	boolean isHasNameAsAttribute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.reportingChain->includes(manager)'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/** \n * self.reportingChain->includes(self.manager)\n \052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>.INSTANCE;\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.EmployeeBodies%>._reportsTo_body_.INSTANCE.evaluate(evaluator, returnType, self, valueFactory.valueOf(manager));\n\treturn (Boolean) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.EmployeeBodies\", e);\n}'"
	 * @generated
	 */
	boolean reportsTo(Employee manager);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='manager.oclIsUndefined() implies directReports->size() > 0'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/** \n * self.manager.oclIsUndefined().implies(self.directReports->size().>(0))\n \052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>.INSTANCE;\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.EmployeeBodies%>._invariant_noManagerImpliesDirectReports.INSTANCE.evaluate(evaluator, returnType, self);\n\tfinal boolean resultIsNull = result.isNull();\n\tif (!resultIsNull && result.asBoolean()) {\t// true => true, false/null => dropthrough, invalid => exception\n\t\treturn true;\n\t}\n\tif (diagnostics != null) {\n\t\tint severity = resultIsNull ? <%org.eclipse.emf.common.util.Diagnostic%>.ERROR : <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n\t    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%codegen.company.util.CodegencompanyValidator%>.DIAGNOSTIC_SOURCE, <%codegen.company.util.CodegencompanyValidator%>.EMPLOYEE__NO_MANAGER_IMPLIES_DIRECT_REPORTS, <%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object [] { result }));\n\t}\n\treturn false;\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.EmployeeBodies\", e);\n}'"
	 * @generated
	 */
	boolean noManagerImpliesDirectReports(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='name <> null'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/** \n * self.name.<>(null)\n \052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>.INSTANCE;\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.EmployeeBodies%>._hasNameAsOperation_body_.INSTANCE.evaluate(evaluator, returnType, self);\n\treturn (Boolean) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.EmployeeBodies\", e);\n}'"
	 * @generated
	 */
	boolean hasNameAsOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not name.oclIsUndefined() and hasNameAsAttribute and hasNameAsOperation()'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/** \n * self.name.oclIsUndefined().not().and(self.hasNameAsAttribute).and(self.hasNameAsOperation())\n \052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>.INSTANCE;\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.EmployeeBodies%>._invariant_mustHaveName.INSTANCE.evaluate(evaluator, returnType, self);\n\tfinal boolean resultIsNull = result.isNull();\n\tif (!resultIsNull && result.asBoolean()) {\t// true => true, false/null => dropthrough, invalid => exception\n\t\treturn true;\n\t}\n\tif (diagnostics != null) {\n\t\tint severity = resultIsNull ? <%org.eclipse.emf.common.util.Diagnostic%>.ERROR : <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n\t    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%codegen.company.util.CodegencompanyValidator%>.DIAGNOSTIC_SOURCE, <%codegen.company.util.CodegencompanyValidator%>.EMPLOYEE__INVARIANT_MUST_HAVE_NAME, <%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object [] { result }));\n\t}\n\treturn false;\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.EmployeeBodies\", e);\n}'"
	 * @generated
	 */
	boolean invariant_mustHaveName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='name->notEmpty() implies name.size() > 0'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/** \n * self.name.oclAsSet()->notEmpty().implies(self.name.size().>(0))\n \052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>.INSTANCE;\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.EmployeeBodies%>._invariant_mustHaveNonEmptyName.INSTANCE.evaluate(evaluator, returnType, self);\n\tfinal boolean resultIsNull = result.isNull();\n\tif (!resultIsNull && result.asBoolean()) {\t// true => true, false/null => dropthrough, invalid => exception\n\t\treturn true;\n\t}\n\tif (diagnostics != null) {\n\t\tint severity = resultIsNull ? <%org.eclipse.emf.common.util.Diagnostic%>.ERROR : <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n\t    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%codegen.company.util.CodegencompanyValidator%>.DIAGNOSTIC_SOURCE, <%codegen.company.util.CodegencompanyValidator%>.EMPLOYEE__INVARIANT_MUST_HAVE_NON_EMPTY_NAME, <%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object [] { result }));\n\t}\n\treturn false;\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.EmployeeBodies\", e);\n}'"
	 * @generated
	 */
	boolean invariant_mustHaveNonEmptyName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Employee
