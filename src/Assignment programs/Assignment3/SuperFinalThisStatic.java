class Parent
{
    // Parent class variable
    int x = 100;

    // Parent class method
    void display()
    {
        System.out.println("Parent class method");
    }

    // Parent class constructor
    Parent()
    {
        System.out.println("Parent constructor");
    }
}


class Child extends Parent
{
    // Instance variable
    int x = 200;

    // static variable
    static String company = "ABC Software";

    // final variable
    final int age = 20;

    // Child class constructor
    Child()
    {
        // Calling parent class constructor
        super();

        // this refers to the current object
        System.out.println("Child x = " + this.x);

        // super refers to the parent class
        System.out.println("Parent x = " + super.x);
    }

    // Method
    void display()
    {
        // this.x refers to Child class variable
        System.out.println("Using this: " + this.x);

        // super.x refers to Parent class variable
        System.out.println("Using super: " + super.x);

        // Calling parent class method
        super.display();

        // Accessing static variable
        System.out.println("Company: " + Child.company);

        // Accessing final variable
        System.out.println("Age: " + age);
    }
}


class KeywordsDemo
{
    public static void main(String args[])
    {
        // Creating Child object
        Child c = new Child();

        // Calling display method
        c.display();

        // Accessing static variable using class name
        System.out.println("Static variable: " + Child.company);

        // Final variable cannot be changed
        System.out.println("Final variable: " + c.age);

        // The following statement gives an error:
        // c.age = 25;
    }
}
