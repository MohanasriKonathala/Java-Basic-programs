package basicprograms;

public class leapyear {
    void leap(int x){
        if((x%4==0)||(x%400==0)&&(x%100!=0)){
            System.out.println("year is leap year"+x);
        }
        else{
            System.out.println("year is not leap year"+x);
        }
    }
    public static void main(String[] args) {
        leapyear ly = new leapyear();
        ly.leap(2024);
        ly.leap(2025);
    }
}
