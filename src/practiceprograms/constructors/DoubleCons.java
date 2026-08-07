package basicprograms;

public class DoubleCons {
    int rollno;
    String name;
    public DoubleCons() {
        this.rollno = 1234;
        this.name = "ramesh";
    }
    public DoubleCons(int r, String s) {
        this.rollno=r;
        this.name=s;
    }
    void sample() {
        System.out.println("roll number is" + this.rollno);
        System.out.println("name is" + this.name);
    }
    void samp(){
        System.out.println(rollno);
        System.out.println(name);
    }
    public static void main(String[] args) {
        DoubleCons cd = new DoubleCons(4567,"suresh");
        cd.sample();
        DoubleCons dc=new DoubleCons();
        dc.samp();
    }
}
