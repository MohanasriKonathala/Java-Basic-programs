// Second interface
interface I2
{
    // Abstract method of I2
    void show2();
}

// Third interface
interface I3
{
    // Abstract method of I3
    void show3();
}

// I1 extends both I2 and I3
// Therefore, I1 inherits methods from I2 and I3
interface I1 extends I2, I3
{
    // Abstract method of I1
    void show1();
}

// C1 implements I1
// Since I1 extends I2 and I3, C1 must implement
// methods of I1, I2 and I3
class C1 implements I1
{
    // Implementing show1() method of I1
    public void show1()
    {
        System.out.println("I1 method");
    }

    // Implementing show2() method inherited by I1 from I2
    public void show2()
    {
        System.out.println("I2 method");
    }

    // Implementing show3() method inherited by I1 from I3
    public void show3()
    {
        System.out.println("I3 method");
    }

    // Main method
    public static void main(String args[])
    {
        // Creating an object of C1 class
        C1 obj = new C1();

        // Calling show1() method
        obj.show1();

        // Calling show2() method inherited through I1 from I2
        obj.show2();

        // Calling show3() method inherited through I1 from I3
        obj.show3();
    }
}
