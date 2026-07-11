package basicprograms;

public class LargeSmall {
    void large(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println("largest is:"+a);
            }
            else{
                System.out.println("largest is :"+c);
            }
        }
        else{
            if(b>c){
                System.out.println("largest is:"+b);
            }
            else{
                System.out.println("largest is :"+c);
            }
        }
    }
    void small(int a,int b,int c){
        if(a<b){
            if(a<c){
                System.out.println("smallest is:"+a);
            }
            else{
                System.out.println("smallest is :"+c);
            }
        }
        else{
            if(b<c){
                System.out.println("smallest is:"+b);
            }
            else{
                System.out.println("smallest is :"+c);
            }
        }
    }
    public static void main(String[] args) {
        LargeSmall ls = new LargeSmall();
        ls.large(5,6,7);
        ls.small(5,6,7);
    }
}
