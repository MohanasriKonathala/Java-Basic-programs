package basicprograms;

public class RangeOfNumbers {
    void range(int x) {
        for(int i=1;i<=x;i++){
            System.out.print(i+" ");
        }
    }
    void revRange(int x){
        for(int i=x;i>=1;i--) {
            System.out.print(i+" ");
        }
    }
    void evenRange(int x){
        for(int i=1;i<=x;i++){
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
    }
    void oddRange(int x){
        for(int i=1;i<=x;i++){
            if(i%2!=0) {
                System.out.print(i + " ");
            }
        }
    }
    void sum(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum=sum+i;
        }
        System.out.println("sum of numbers is"+" "+sum);
    }
    void multiply(int x){
        for(int i=1;i<=10;i++){
            System.out.print((" "+x*i));
        }
    }
    int factorial(int x){
        if(x==1){
            return 1;
        }
        else {
            return x*factorial(x-1);
        }
    }
    public static void main(String[] args) {
        RangeOfNumbers rnge = new RangeOfNumbers();
        rnge.range(10);
        System.out.println(" ");
        rnge.revRange(10);
        System.out.println(" ");
        rnge.evenRange(10);
        System.out.println(" ");
        rnge.oddRange(10);
        System.out.println(" ");
        rnge.sum(10);
        rnge.multiply(3);
        System.out.println(" ");
        System.out.print("factorial of is "+rnge.factorial(3));
    }
}
