package tasks;

// Main class
public class LibraryManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
        // ---------------- BOOK DETAILS ----------------
        System.out.println("------ BOOK DETAILS ------");

        // Creating Book object using parameterized constructor
        Book b1 = new Book(101, "Java Programming", "James Gosling", 550);

        // Displaying book details
        b1.display();

        System.out.println();

        // ---------------- STUDENT ----------------
        System.out.println("------ STUDENT ------");

        // Creating Student object
        Student s = new Student("Mohana", 19, 101);

        // Displaying student details
        s.display();

        System.out.println();

        // ---------------- FACULTY ----------------
        System.out.println("------ FACULTY ------");

        // Creating Faculty object
        Faculty f = new Faculty("Ramesh", 40, "Java");

        // Displaying faculty details
        f.display();

        System.out.println();

        // ---------------- METHOD OVERLOADING ----------------
        System.out.println("------ METHOD OVERLOADING ------");

        // Creating Area object
        Area a = new Area();

        // Calling calculateArea() with one double argument
        // Calculates area of circle
        System.out.println("Circle Area = " + a.calculateArea(5.0));

        // Calling calculateArea() with two int arguments
        // Calculates area of rectangle
        System.out.println("Rectangle Area = " + a.calculateArea(5, 4));

        // Calling calculateArea() with two double arguments
        // Calculates area of triangle
        System.out.println("Triangle Area = " + a.calculateArea(10.0, 8.0));

        System.out.println();

        // ---------------- METHOD OVERRIDING ----------------
        System.out.println("------ METHOD OVERRIDING ------");

        // Vehicle reference referring to Car object
        Vehicle v1 = new Car();

        // Vehicle reference referring to Bike object
        Vehicle v2 = new Bike();

        // Calls display() method of Car
        v1.display();

        // Calls display() method of Bike
        v2.display();

        System.out.println();

        // ---------------- ABSTRACTION ----------------
        System.out.println("------ ABSTRACTION ------");

        // Shape reference referring to Circle object
        Shape c = new Circle();

        // Shape reference referring to Rectangle object
        Shape r = new Rectangle();

        // Calling draw() method of Circle
        c.draw();

        // Calling draw() method of Rectangle
        r.draw();

        System.out.println();

        // ---------------- INTERFACE ----------------
        System.out.println("------ INTERFACE ------");

        // Creating Report object
        Report rp = new Report();

        // Calling print() method
        rp.print();
    }
}


// ======================================================
// BOOK CLASS
// ======================================================

// Book class
class Book
{
    // Private data members
    // This is an example of encapsulation
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // Default Constructor
    public Book()
    {
        bookId = 0;
        bookName = "";
        author = "";
        price = 0;
    }

    // Parameterized Constructor
    public Book(int id, String name, String author, double price)
    {
        // Assigning values to instance variables
        this.bookId = id;
        this.bookName = name;
        this.author = author;
        this.price = price;
    }

    // Getter for bookId
    public int getBookId()
    {
        return bookId;
    }

    // Getter for bookName
    public String getBookName()
    {
        return bookName;
    }

    // Getter for author
    public String getAuthor()
    {
        return author;
    }

    // Getter for price
    public double getPrice()
    {
        return price;
    }

    // Setter for bookId
    public void setBookId(int id)
    {
        bookId = id;
    }

    // Setter for bookName
    public void setBookName(String name)
    {
        bookName = name;
    }

    // Setter for author
    public void setAuthor(String a)
    {
        author = a;
    }

    // Setter for price
    public void setPrice(double p)
    {
        price = p;
    }

    // Method to display book details
    public void display()
    {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}


// ======================================================
// PERSON CLASS
// ======================================================

// Parent class
class Person
{
    // Data members
    String name;
    int age;

    // Constructor
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


// ======================================================
// STUDENT CLASS
// ======================================================

// Student inherits Person
class Student extends Person
{
    // Additional variable of Student
    int rollNo;

    // Student constructor
    public Student(String name, int age, int rollNo)
    {
        // Calling parent class constructor
        super(name, age);

        // Assigning roll number
        this.rollNo = rollNo;
    }

    // Overriding display() method
    public void display()
    {
        // Calling display() method of Person
        super.display();

        // Displaying student-specific information
        System.out.println("Roll No : " + rollNo);
    }
}


// ======================================================
// FACULTY CLASS
// ======================================================

// Faculty inherits Person
class Faculty extends Person
{
    // Additional variable of Faculty
    String subject;

    // Faculty constructor
    public Faculty(String name, int age, String subject)
    {
        // Calling parent class constructor
        super(name, age);

        // Assigning subject
        this.subject = subject;
    }

    // Overriding display() method
    public void display()
    {
        // Calling display() method of Person
        super.display();

        // Displaying faculty-specific information
        System.out.println("Subject : " + subject);
    }
}


// ======================================================
// AREA CLASS
// ======================================================

// Class used to demonstrate method overloading
class Area
{
    // calculateArea() for circle
    public double calculateArea(double radius)
    {
        return 3.14 * radius * radius;
    }

    // calculateArea() for rectangle
    // Takes two integer arguments
    public int calculateArea(int length, int breadth)
    {
        return length * breadth;
    }

    // calculateArea() for triangle
    // Takes two double arguments
    public double calculateArea(double base, double height)
    {
        return 0.5 * base * height;
    }
}


// ======================================================
// VEHICLE CLASS
// ======================================================

// Parent class
class Vehicle
{
    // Method of Vehicle class
    public void display()
    {
        System.out.println("This is a Vehicle");
    }
}


// ======================================================
// CAR CLASS
// ======================================================

// Car inherits Vehicle
class Car extends Vehicle
{
    // Overriding display() method
    @Override
    public void display()
    {
        System.out.println("This is a Car");
    }
}


// ======================================================
// BIKE CLASS
// ======================================================

// Bike inherits Vehicle
class Bike extends Vehicle
{
    // Overriding display() method
    @Override
    public void display()
    {
        System.out.println("This is a Bike");
    }
}


// ======================================================
// SHAPE CLASS
// ======================================================

// Abstract class
abstract class Shape
{
    // Abstract method
    // It does not have a body
    abstract void draw();
}


// ======================================================
// CIRCLE CLASS
// ======================================================

// Circle inherits Shape
class Circle extends Shape
{
    // Implementing abstract draw() method
    @Override
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}


// ======================================================
// RECTANGLE CLASS
// ======================================================

// Rectangle inherits Shape
class Rectangle extends Shape
{
    // Implementing abstract draw() method
    @Override
    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}
// PRINTABLE INTERFACE
// Interface
interface Printable
{
    // Abstract method
    void print();
}
// REPORT CLASS
// Report implements Printable interface
class Report implements Printable
{
    // Implementing print() method of interface
    @Override
    public void print()
    {
        System.out.println("Printing Report...");
    }
}
