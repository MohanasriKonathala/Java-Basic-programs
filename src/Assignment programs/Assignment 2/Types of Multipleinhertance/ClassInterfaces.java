interface I1
{
    void show1();
}

interface I2
{
    void show2();
}

class C1 implements I1, I2
{
    public void show1()
    {
        System.out.println("I1 method");
    }

    public void show2()
    {
        System.out.println("I2 method");
    }

    public static void main(String args[])
    {
        C1 obj = new C1();

        obj.show1();
        obj.show2();
    }
}
