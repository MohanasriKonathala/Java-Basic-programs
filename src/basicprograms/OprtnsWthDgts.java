package basicprograms;

public class OprtnsWthDgts {
    void reverse(int x){
        int rev=0,b;
        while (x>0){
             b=x%10;
             rev=rev*10+b;
            x=x/10;
        }
        System.out.println("reverse of number is "+rev);
    }
    void counting(int x){
        int b,count =0;
        while(x>0){
            b=x%10;
            count=count+1;
            x=x/10;
        }
        System.out.println("number of digits are "+count);
    }
    void sum(int x){
        int b,sum =0;
        while(x>0){
            b=x%10;
            sum=sum+b;
            x=x/10;
        }
        System.out.println("number of digits are "+sum);
    }
    public static void main(String[] args) {
        OprtnsWthDgts od = new OprtnsWthDgts();
        od.reverse(1234);
        od.counting(1234);
        od.sum(1234);
    }
}
