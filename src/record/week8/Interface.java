// Base class
class Employee
{
    // Employee ID
    String employeeId;

    // Constructor
    Employee(String employeeId)
    {
        this.employeeId = employeeId;
    }

    // Method to display salary details
    void salaryDetails()
    {
        System.out.println("Salary Details:");
    }
}


// Regular Employee class
class RegularEmployee extends Employee
{
    // Constructor
    RegularEmployee(String employeeId)
    {
        super(employeeId);
    }

    // Overriding salaryDetails() method
    @Override
    void salaryDetails()
    {
        // Salary components for regular employee
        int basicPay = 25000;
        int hra = 15000;
        int ta = 5000;

        // Calculate total salary
        int total = basicPay + hra + ta;

        // Display salary details
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}


// Contract Employee class
class ContractEmployee extends Employee
{
    // Constructor
    ContractEmployee(String employeeId)
    {
        super(employeeId);
    }

    // Overriding salaryDetails() method
    @Override
    void salaryDetails()
    {
        // Salary components for contract employee
        int basicPay = 12000;
        int hra = 0;
        int ta = 3000;

        // Calculate total salary
        int total = basicPay + hra + ta;

        // Display salary details
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}


// Main class
public class EmployeePayroll
{
    public static void main(String args[])
    {
        // Employee ID input
        String employeeId = "R101";

        // Check employee type using ID
        if(employeeId.startsWith("R"))
        {
            // Create RegularEmployee object
            Employee emp = new RegularEmployee(employeeId);

            // Calling overridden method
            emp.salaryDetails();
        }
        else if(employeeId.startsWith("C"))
        {
            // Create ContractEmployee object
            Employee emp = new ContractEmployee(employeeId);

            // Calling overridden method
            emp.salaryDetails();
        }
        else
        {
            System.out.println("Invalid Employee ID");
        }
    }
}
