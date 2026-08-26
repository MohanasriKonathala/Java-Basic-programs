// Class representing a Cow
class Cow
{
    // Method to display where the cow stays
    void whereItStays()
    {
        System.out.println("Cow stays in a shed.");
    }

    // Method to display what the cow eats
    void whatItEats()
    {
        System.out.println("Cow eats grass and hay.");
    }

    // Method to display the sound made by the cow
    void sound()
    {
        System.out.println("Cow makes the sound: Moo");
    }
}


// Class representing a Pig
class Pig
{
    // Method to display where the pig stays
    void whereItStays()
    {
        System.out.println("Pig stays in a pigsty.");
    }

    // Method to display what the pig eats
    void whatItEats()
    {
        System.out.println("Pig eats grains and vegetables.");
    }

    // Method to display the sound made by the pig
    void sound()
    {
        System.out.println("Pig makes the sound: Oink");
    }
}


// Class representing a Horse
class Horse
{
    // Method to display where the horse stays
    void whereItStays()
    {
        System.out.println("Horse stays in a stable.");
    }

    // Method to display what the horse eats
    void whatItEats()
    {
        System.out.println("Horse eats grass and hay.");
    }

    // Method to display the sound made by the horse
    void sound()
    {
        System.out.println("Horse makes the sound: Neigh");
    }
}


// Main class
class FarmAnimals
{
    public static void main(String args[])
    {
        // Creating an object of Cow class
        Cow c = new Cow();

        // Creating an object of Pig class
        Pig p = new Pig();

        // Creating an object of Horse class
        Horse h = new Horse();


        // Displaying Cow details
        System.out.println("----- COW DETAILS -----");
        c.whereItStays();
        c.whatItEats();
        c.sound();

        System.out.println();


        // Displaying Pig details
        System.out.println("----- PIG DETAILS -----");
        p.whereItStays();
        p.whatItEats();
        p.sound();

        System.out.println();


        // Displaying Horse details
        System.out.println("----- HORSE DETAILS -----");
        h.whereItStays();
        h.whatItEats();
        h.sound();
    }
}
