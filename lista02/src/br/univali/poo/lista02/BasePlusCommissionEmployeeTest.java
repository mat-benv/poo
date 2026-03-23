package br.univali.poo.lista02;

public class BasePlusCommissionEmployeeTest {
    public static void main(String args[]) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06, 300 );
        CommissionEmployee employee2 = new CommissionEmployee(
                "Ana", "Chang", "111-11-1111", 50000, .01);

        System.out.println("Employee information obtained by get methods: \n" );
        System.out.printf("%s %s\n", "First name is",employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is",employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is ",employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is",employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is",employee.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base salary is",employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("\n%s: \n\n%s\n","Updated employee information obtained by toString", employee);
        System.out.printf("\n%s: \n\n%s\n","Employee 2 information obtained by toString", employee2);
    }
} // end class BasePlusCommissionEmployeeTest
