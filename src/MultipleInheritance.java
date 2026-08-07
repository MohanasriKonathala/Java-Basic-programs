package basicprograms;
interface I1{
    int x=50;
    void name();
}
interface I2 extends I1{
    int y=40;
    void age();
}
interface I3 extends I1{
    int z=60;
    void rollno();
}
class Multi implements I1,I2,I3{
    @Override
    public void name(){
        System.out.println("my name is rahul");
    }
    @Override
    public void age(){
        System.out.println("my age is 20");
    }
    @Override
    public void rollno(){
        System.out.println("my rollno is 223");
    }
    void myMethod(){
        System.out.println("this is interface");
    }
}

public class  MultipleInheritance {
    public static void main(String[] args) {
        Multi mt=new Multi();
        System.out.println(I1.x);
        System.out.println(I2.y);
        System.out.println(I3.z);
        mt.name();
        mt.age();
        mt.rollno();
        mt.myMethod();

    }
}
