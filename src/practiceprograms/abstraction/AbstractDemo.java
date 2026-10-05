package basicprograms;

abstract class Demo {
    int x=100;

    void addTwoNum() {
        System.out.println("Add is " + (10 + 20));
    }

    abstract void sub();
}
public class AbstractDemo extends Demo{
    @Override
    void sub(){
        System.out.println("sub is"+(50-10));
    }
    public static void main(String[] args){
        AbstractDemo ad = new AbstractDemo();
        System.out.println(ad.x);
        ad.addTwoNum();
        ad.sub();
    }

}
