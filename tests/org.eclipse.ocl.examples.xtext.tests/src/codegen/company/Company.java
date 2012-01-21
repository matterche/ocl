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
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codegen.company.Company#getName <em>Name</em>}</li>
 *   <li>{@link codegen.company.Company#getEmployees <em>Employees</em>}</li>
 *   <li>{@link codegen.company.Company#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see codegen.company.CodegencompanyPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject {
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
	 * @see codegen.company.CodegencompanyPackage#getCompany_Name()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/ocl/test/Pivot/Company.ecore!Company!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link codegen.company.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link codegen.company.Employee}.
	 * It is bidirectional and its opposite is '{@link codegen.company.Employee#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see codegen.company.CodegencompanyPackage#getCompany_Employees()
	 * @see codegen.company.Employee#getCompany
	 * @model opposite="company" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/ocl/test/Pivot/Company.ecore!Company!employees'"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link codegen.company.CompanySizeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see codegen.company.CompanySizeKind
	 * @see codegen.company.CodegencompanyPackage#getCompany_Size()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/*\nlet\n  table : Set(Tuple(range : Sequence(Integer), size : CompanySizeKind)) = Set{\n    Tuple{range = Sequence{0..49}, size = CompanySizeKind::small\n    }\n    , Tuple{range = Sequence{50..999}, size = CompanySizeKind::medium\n    }\n    , Tuple{range = Sequence{1000..1000000}, size = CompanySizeKind::large\n    }\n  }\nin\n  table->any(range->includes(employees->size())).size\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%codegen.company.CodegencompanyTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Company_ecore__company__CompanySizeKind = <%codegen.company.CodegencompanyTables%>.Types._CompanySizeKind;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Company_ecore__company__CompanySizeKind;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.CompanyBodies%>._size_derivation_.INSTANCE.evaluate(evaluator, returnType, self, <%codegen.company.CodegencompanyTables%>.Properties._Company__size);\n\treturn (CompanySizeKind) result.asEcoreObject();\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate codegen.company.bodies.CompanyBodies\", e);\n}\n'"
	 * @generated
	 */
	CompanySizeKind getSize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\ntrue\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%codegen.company.CodegencompanyTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%codegen.company.bodies.CompanyBodies%>._invariant_dummyInvariant.INSTANCE.evaluate(evaluator, returnType, self);\n\tfinal boolean resultIsNull = result.isNull();\n\tif (!resultIsNull && result.asBoolean()) {\t// true => true, false/null => dropthrough, invalid => exception\n\t\treturn true;\n\t}\n\tif (diagnostics != null) {\n\t\tint severity = resultIsNull ? <%org.eclipse.emf.common.util.Diagnostic%>.ERROR : <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n\t\tString message = <%org.eclipse.osgi.util.NLS%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Company\", \"dummyInvariant\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n\t    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%codegen.company.util.CodegencompanyValidator%>.DIAGNOSTIC_SOURCE, <%codegen.company.util.CodegencompanyValidator%>.COMPANY__DUMMY_INVARIANT, message, new Object [] { this }));\n\t}\n\treturn false;\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tString message = <%org.eclipse.osgi.util.NLS%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationEvaluationFailed_ERROR_, new Object[]{\"Company\", \"dummyInvariant\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(message, e);\n}\n'"
	 * @generated
	 */
	boolean dummyInvariant(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Company
