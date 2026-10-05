package basicprograms;

public class SimpleCalculator {
    void calculate(int a,int b,char c){
        if(c=='a'){
            System.out.println("result of add is :"+""+(a+b));
        } else if (c=='s') {
            System.out.println("result of sub is :"+""+(a-b));
        } else if (c=='m') {
            System.out.println("result of mul is :"+""+(a*b));
        } else if (c=='d') {
            System.out.println("result of div is :"+""+(a/b));
        }
        else {
            System.out.println("invalid operation");
        }
    }
    public static void main(String[] args) {
        SimpleCalculator sc=new SimpleCalculator();
        sc.calculate(5,6,'a');
        sc.calculate(6,7,'s');
        sc.calculate(6,4,'m');
        sc.calculate(10,2,'d');
    }
}
