// Parent class
class Animal
{
    // Method of Animal class
    void eat()
    {
        System.out.println("Animal eats");
    }
}

// Child class inherits Animal class
class Dog extends Animal
{
    // Method of Dog class
    void bark()
    {
        System.out.println("Dog barks");
    }
}

// Main class
class SingleInheritance
{
    public static void main(String args[])
    {
        // Creating an object of Dog class
        Dog d = new Dog();

        // Calling eat() method inherited from Animal class
        d.eat();

        // Calling bark() method of Dog class
        d.bark();
    }
}
