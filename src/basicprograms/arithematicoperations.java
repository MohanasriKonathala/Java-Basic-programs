package basicprograms;
class Example{
    int x = 10, y = 20;
    void addition(){
        System.out.println("addition is :"+(x+y));
    }
    void subtraction() {
        System.out.println("subtraction is :" + (x - y));
    }
    void multiplication() {
        System.out.println("multiplication is :" + (x * y));
    }
    void division() {
        System.out.println("division is :" + (x / y));
    }
}
public class arithematicoperations {
    public static void main(String[] args) {
        Example e = new Example();
        e.addition();
        e.subtraction();
        e.multiplication();
        e.division();
    }
}
