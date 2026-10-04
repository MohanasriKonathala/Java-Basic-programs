import java.util.*;

public class StudentMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Mohana");
        students.put(102, "Sonali");
        students.put(103, "Sameera");

        System.out.println("Student Details:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
