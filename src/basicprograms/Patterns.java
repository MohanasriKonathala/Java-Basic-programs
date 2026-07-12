package basicprograms;

public class Patterns {
    void square(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    void rightTriangle(int x){
        for(int i=1;i<=x;i++){
          for(int j=x;j>=1;j--){
              if(i>=j){
                  System.out.print("*");
              }
              else{
                  System.out.print(" ");
              }
          }
          System.out.println(" ");
        }
    }
    void invertedTriangle(int x){
        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pyramid(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    void numberTriangle(int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    void floydsTriangle(int x){
        int n=1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n=n+1;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Patterns ptr = new Patterns();
        ptr.numberTriangle(5);
        ptr.pyramid(5);
        ptr.invertedTriangle(5);
        ptr.square(5);
        ptr.rightTriangle(5);
        ptr.floydsTriangle(5);
    }
}
