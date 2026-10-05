package basicprograms;

public class Grading {
    void grade(int marks){
        if(marks>85){
            System.out.println(marks+"Grade A");
        }
        else if(marks>70&&marks<85){
            System.out.println(marks+"Grade B");
        }
        else{
            System.out.println(marks+"Grade C");
        }
    }
    public static void main(String[] args) {
        Grading gd = new Grading();
        gd.grade(90);
        gd.grade(75);
        gd.grade(60);
    }
}
