/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompanyFactoryImpl.java,v 1.2 2011/03/09 14:45:49 auhl Exp $
 */
package company.impl;

import company.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompanyFactoryImpl extends EFactoryImpl implements CompanyFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static CompanyFactory init() {
		try {
			CompanyFactory theCompanyFactory = (CompanyFactory)EPackage.Registry.INSTANCE.getEFactory("http:///company.ecore"); 
			if (theCompanyFactory != null) {
				return theCompanyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompanyFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CompanyFactoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CompanyPackage.EMPLOYEE: return createEmployee();
			case CompanyPackage.DEPARTMENT: return createDepartment();
			case CompanyPackage.FREELANCE: return createFreelance();
			case CompanyPackage.DIVISION: return createDivision();
			case CompanyPackage.STUDENT: return createStudent();
			case CompanyPackage.COMPANY: return createCompany();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Freelance createFreelance() {
		FreelanceImpl freelance = new FreelanceImpl();
		return freelance;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Company createCompany() {
		CompanyImpl company = new CompanyImpl();
		return company;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CompanyPackage getCompanyPackage() {
		return (CompanyPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static CompanyPackage getPackage() {
		return CompanyPackage.eINSTANCE;
	}

} //CompanyFactoryImpl
