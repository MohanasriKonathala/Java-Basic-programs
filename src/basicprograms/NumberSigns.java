package basicprograms;

public class NumberSigns {
    void pnz(int x){
        if (x>0){
            System.out.println("number is positive");
        }
        else if (x<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }
    public static void main(String[] args) {
        NumberSigns ns = new NumberSigns();
        ns.pnz(6);
        ns.pnz(0);
        ns.pnz(-7);
    }
}
