// Parent class
class Parent
{
    // Default access specifier
    int defaultVar = 10;

    // Private access specifier
    private int privateVar = 20;

    // Protected access specifier
    protected int protectedVar = 30;

    // Public access specifier
    public int publicVar = 40;

    // Method inside Parent class
    void display()
    {
        // All variables can be accessed inside the same class
        System.out.println("Default Variable  : " + defaultVar);
        System.out.println("Private Variable  : " + privateVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable   : " + publicVar);
    }
}


// Child class
class Child extends Parent
{
    void show()
    {
        // Default variable can be accessed
        System.out.println("Default Variable  : " + defaultVar);

        // Private variable cannot be accessed directly
        // System.out.println(privateVar);  // ERROR

        // Protected variable can be accessed
        System.out.println("Protected Variable: " + protectedVar);

        // Public variable can be accessed
        System.out.println("Public Variable   : " + publicVar);
    }
}


// Main class
class AccessSpecifierDemo
{
    public static void main(String args[])
    {
        // Creating object of Parent class
        Parent p = new Parent();

        System.out.println("----- ACCESS FROM SAME PACKAGE -----");

        // Default variable can be accessed
        System.out.println("Default Variable  : " + p.defaultVar);

        // Private variable cannot be accessed directly
        // System.out.println(p.privateVar);  // ERROR

        // Protected variable can be accessed
        System.out.println("Protected Variable: " + p.protectedVar);

        // Public variable can be accessed
        System.out.println("Public Variable   : " + p.publicVar);

        System.out.println();

        // Calling method of Parent class
        System.out.println("----- INSIDE PARENT CLASS -----");
        p.display();

        System.out.println();

        // Creating object of Child class
        Child c = new Child();

        System.out.println("----- INSIDE CHILD CLASS -----");
        c.show();
    }
}
