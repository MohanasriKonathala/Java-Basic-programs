interface I2
{
    void show2();
}

interface I3
{
    void show3();
}

interface I1 extends I2, I3
{
    void show1();
}

class C1 implements I1
{
    public void show1()
    {
        System.out.println("I1 method");
    }

    public void show2()
    {
        System.out.println("I2 method");
    }

    public void show3()
    {
        System.out.println("I3 method");
    }

    public static void main(String args[])
    {
        C1 obj = new C1();

        obj.show1();
        obj.show2();
        obj.show3();
    }
}
