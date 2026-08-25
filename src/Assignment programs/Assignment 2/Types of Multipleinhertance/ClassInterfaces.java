// First interface
interface I1
{
    // Abstract method of I1
    void show1();
}

// Second interface
interface I2
{
    // Abstract method of I2
    void show2();
}

// Class C1 implements both I1 and I2 interfaces
class C1 implements I1, I2
{
    // Implementing show1() method of I1
    public void show1()
    {
        System.out.println("I1 method");
    }

    // Implementing show2() method of I2
    public void show2()
    {
        System.out.println("I2 method");
    }

    // Main method
    public static void main(String args[])
    {
        // Creating an object of C1 class
        C1 obj = new C1();

        // Calling show1() method
        obj.show1();

        // Calling show2() method
        obj.show2();
    }
}
