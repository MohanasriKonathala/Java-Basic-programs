// Employee class
class Employee
{
    // Data members
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Default constructor
    Employee()
    {
        name = "Unknown";
        id = 0;
        designation = "Unknown";
        salary = 0;
        promotionStatus = "Not Available";
    }

    // Constructor with name and id
    Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
        designation = "Employee";
        salary = 0;
        promotionStatus = "Pending";
    }

    // Constructor with name, id, designation and salary
    Employee(String name, int id, String designation, double salary)
    {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        promotionStatus = "Pending";
    }

    // Constructor with all details
    Employee(String name, int id, String designation,
             double salary, String promotionStatus)
    {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    // Method to display employee details
    void display()
    {
        System.out.println("Name             : " + name);
        System.out.println("ID               : " + id);
        System.out.println("Designation      : " + designation);
        System.out.println("Salary           : " + salary);
        System.out.println("Promotion Status : " + promotionStatus);
        System.out.println();
    }
}


// Main class
class EmployeeManagement
{
    public static void main(String args[])
    {
        // Object using default constructor
        Employee e1 = new Employee();

        // Object using constructor with name and id
        Employee e2 = new Employee("Mohana", 101);

        // Object using constructor with name, id, designation and salary
        Employee e3 = new Employee(
                "Rahul", 102, "Manager", 50000);

        // Object using constructor with all details
        Employee e4 = new Employee(
                "Anjali", 103, "Senior Manager",
                75000, "Promoted");


        // Displaying employee details
        System.out.println("----- EMPLOYEE 1 -----");
        e1.display();

        System.out.println("----- EMPLOYEE 2 -----");
        e2.display();

        System.out.println("----- EMPLOYEE 3 -----");
        e3.display();

        System.out.println("----- EMPLOYEE 4 -----");
        e4.display();
    }
}
