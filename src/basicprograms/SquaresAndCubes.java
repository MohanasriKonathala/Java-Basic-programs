package basicprograms;

public class SquaresAndCubes {
    void sqrt(int x){
        int y=x*x;
        System.out.println("square of a number is: "+y);
    }
    void cbrt(int x){
        int y=x*x*x;
        System.out.println("cube of a number is: "+y);
    }
    public static void main(String[] args) {
        SquaresAndCubes sc = new SquaresAndCubes();
        sc.cbrt(5);
        sc.sqrt(5);
    }
}
