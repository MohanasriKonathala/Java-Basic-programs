package internal;
class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }

}

class Manager extends Employee {

    Manager(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        double bonus = 0;
        double allowance = 0;

        if (basicSalary >= 50000) {
            bonus = basicSalary * 0.20;
            allowance = 10000;
        } else {
            bonus = basicSalary * 0.10;
            allowance = 5000;
        }

        return basicSalary + bonus + allowance;
    }

}

class Developer extends Employee {

    Developer(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        double bonus = 0;
        double allowance = 0;

        if (basicSalary >= 40000) {
            bonus = basicSalary * 0.15;
            allowance = 5000;
        } else {
            bonus = basicSalary * 0.10;
            allowance = 2000;
        }

        return basicSalary + bonus + allowance;
    }

}

public class EmployeeSalaryManagement {
    public static void main(String[] args) {

        Manager m = new Manager(101, "mohana", 60000);
        Developer d = new Developer(102, "sonali", 40000);

        System.out.println("----- Manager Details -----");
        m.displayDetails();

        System.out.println("\n----- Developer Details -----");
        d.displayDetails();
    }

}
