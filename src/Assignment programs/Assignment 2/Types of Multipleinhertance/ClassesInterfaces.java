class C2
{
    void show2()
    {
        System.out.println("C2 method");
    }
}

interface I1
{
    void show1();
}

interface I2
{
    void showI2();
}

interface I3
{
    void showI3();
}

class C1 extends C2 implements I1, I2, I3
{
    public void show1()
    {
        System.out.println("I1 method");
    }

    public void showI2()
    {
        System.out.println("I2 method");
    }

    public void showI3()
    {
        System.out.println("I3 method");
    }

    public static void main(String args[])
    {
        C1 obj = new C1();

        obj.show2();
        obj.show1();
        obj.showI2();
        obj.showI3();
    }
}
