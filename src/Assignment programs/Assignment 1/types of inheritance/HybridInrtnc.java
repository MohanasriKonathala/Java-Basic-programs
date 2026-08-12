class Animal
{
    void eat()
    {
        System.out.println("Animal eats");
    }
}

interface Pet
{
    void play();
}

interface Friendly
{
    void friendly();
}

class Dog extends Animal implements Pet, Friendly
{
    public void play()
    {
        System.out.println("Dog plays");
    }

    public void friendly()
    {
        System.out.println("Dog is friendly");
    }
}

class HybridInheritance
{
    public static void main(String args[])
    {
        Dog d = new Dog();

        d.eat();
        d.play();
        d.friendly();
    }
}
