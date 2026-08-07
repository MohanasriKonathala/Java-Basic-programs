package basicprograms;

public class SwappingOfNumbers {

    void swapUsingVariable(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping using variable is: "+a+","+b);
    }
    void swapwithoutusingVariable(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping without using variable is: "+a+","+b);
    }
    public static void main(String[] args) {
        SwappingOfNumbers swap = new SwappingOfNumbers();
        swap.swapUsingVariable(5,3);
        swap.swapwithoutusingVariable(5,3);
    }
}
