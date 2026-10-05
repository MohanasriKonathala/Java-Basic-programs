// Parent class
class Animal
{
    // Method of Animal class
    void eat()
    {
        System.out.println("Animal eats");
    }
}

// First child class inherits Animal
class Dog extends Animal
{
    // Method of Dog class
    void bark()
    {
        System.out.println("Dog barks");
    }
}

// Second child class inherits Animal
class Cat extends Animal
{
    // Method of Cat class
    void meow()
    {
        System.out.println("Cat meows");
    }
}

// Main class
class HierarchicalInheritance
{
    public static void main(String args[])
    {
        // Creating an object of Dog class
        Dog d = new Dog();

        // Creating an object of Cat class
        Cat c = new Cat();

        // Calling eat() inherited from Animal
        d.eat();

        // Calling bark() method of Dog
        d.bark();

        // Calling eat() inherited from Animal
        c.eat();

        // Calling meow() method of Cat
        c.meow();
    }
}
