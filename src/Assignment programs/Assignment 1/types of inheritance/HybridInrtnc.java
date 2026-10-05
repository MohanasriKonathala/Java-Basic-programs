// Parent class
class Animal 
{
    // Method of Animal class
    void eat() 
    {
        System.out.println("Animal eats");
    }
}

// First interface
interface Pet 
{
    // Abstract method
    void play();
}

// Second interface
interface Friendly 
{
    // Abstract method
    void friendly();
}

// Dog inherits Animal class
// and implements both Pet and Friendly interfaces
class Dog extends Animal implements Pet, Friendly 
{
    // Implementing play() method of Pet interface
    public void play() 
    {
        System.out.println("Dog plays");
    }

    // Implementing friendly() method of Friendly interface
    public void friendly() 
    {
        System.out.println("Dog is friendly");
    }
}

// Main class
class HybridInheritance 
{
    public static void main(String args[]) 
    {
        // Creating an object of Dog class
        Dog d = new Dog();

        // Calling eat() method inherited from Animal
        d.eat();

        // Calling play() method implemented from Pet
        d.play();

        // Calling friendly() method implemented from Friendly
        d.friendly();
    }
}
