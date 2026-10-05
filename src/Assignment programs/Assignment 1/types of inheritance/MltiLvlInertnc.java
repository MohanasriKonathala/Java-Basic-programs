// Parent class
class Animal
{
    // Method of Animal class
    void eat()
    {
        System.out.println("Animal eats");
    }
}

// Dog inherits Animal
class Dog extends Animal
{
    // Method of Dog class
    void bark()
    {
        System.out.println("Dog barks");
    }
}

// Puppy inherits Dog
// Dog already inherits Animal
class Puppy extends Dog
{
    // Method of Puppy class
    void play()
    {
        System.out.println("Puppy plays");
    }
}

// Main class
class MultilevelInheritance
{
    public static void main(String args[])
    {
        // Creating an object of Puppy class
        Puppy p = new Puppy();

        // Calling eat() method inherited from Animal
        p.eat();

        // Calling bark() method inherited from Dog
        p.bark();

        // Calling play() method of Puppy
        p.play();
    }
}
