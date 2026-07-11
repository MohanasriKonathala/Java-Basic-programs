package basicprograms;

public class EvenorOdd {
    void eveodd(int x) {
        if (x % 2 == 0) {
            System.out.println("number is even :" + x);
        } else {
            System.out.println("number is odd :" + x);
        }
    }
    public static void main(String[] args) {
       EvenorOdd eo = new EvenorOdd();
       eo.eveodd(5);
        }
    }
