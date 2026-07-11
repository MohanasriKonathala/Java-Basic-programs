package basicprograms;

public class SpecialOperations {
    void prime(int x){
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count=count+1;
            }
        }
        if (count==2){
            System.out.println(x+"is prime number");
        }
        else {
            System.out.println(x+"is not prime number");
        }
    }
    void sumOfPrime(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            int count=0;
         for(int j=1;j<=x;j++) {
             if (i % j == 0) {
                 count = count + 1;
             }
         }
             if(count==2){
                 sum=sum+i;
             }
        }
        System.out.println("sum of prime numbers is "+sum);
    }
    void armStrong(int x){
        int b,arm=0;
        int n=x;
        while(n>0){
            b=n%10;
            arm=arm+(b*b*b);
            n=n/10;
        }
        if(arm==x){
            System.out.println(x+" is armstrong number");
        }
        else{
            System.out.println(x+" is not armstrong number");
        }
    }
    void pallindrome(int x){
        int rev=0,b;
        int n=x;
        while (n>0){
            b=n%10;
            rev=rev*10+b;
            n=n/10;
        }
        if(rev==x){
            System.out.println(x+" is pallindrome number");
        }
        else{
            System.out.println(x+" is not pallindrome number");
        }
    }
    int fibbonacci(int n){
        if(n<=1) {
            return n;
        }
            else {
                return fibbonacci(n-1)+fibbonacci(n-2);
            }
    }
    void perfect(int x){
        int sum=1;
        for(int i=2;i*i <=x;i++){
            if(x%i==0){
                sum=sum+i;
                if(i!=(x/i)){
                    sum=sum+ (x/i);
                }
            }
        }
        if(sum==x){
          System.out.println(x+"is perfect number");
        }
        else{
            System.out.println(x+"is not perfect number");
        }
    }
    public static void main(String[] args) {
        SpecialOperations so = new SpecialOperations();
        so.prime(4);
        so.sumOfPrime(10);
        so.armStrong(153);
        so.pallindrome(121);
        int x=5;
        System.out.println("fibbonacci of"+x+" is"+so.fibbonacci(x));
        so.perfect(6);
    }
}
