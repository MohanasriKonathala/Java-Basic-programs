import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks;

    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name.trim();
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    double calculatePercentage() {
        double percentage = (double) calculateTotal() / (marks.length * 100) * 100;
        return Math.round(percentage * 100.0) / 100.0;
    }

    String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    String getRemark() {
        String grade = calculateGrade();

        switch (grade) {
            case "A+":
                return "Excellent Performance";
            case "A":
                return "Very Good Performance";
            case "B":
                return "Good Performance";
            case "C":
                return "Average Performance";
            case "D":
                return "Satisfactory Performance";
            default:
                return "Needs Improvement";
        }
    }

    void displayDetails() {
        double percentage = calculatePercentage();
        String grade = calculateGrade();

        System.out.println("\n----- Student Performance Report -----");
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Student Name : " + name.toUpperCase());
        System.out.println("Name Length  : " + name.length());
        System.out.println("Total Marks  : " + calculateTotal());
        System.out.println("Average      : " + calculateAverage());
        System.out.println("Highest Mark : " + findHighest());
        System.out.println("Lowest Mark  : " + findLowest());
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + (percentage >= 50 ? "PASS" : "FAIL"));
        System.out.println("Remark       : " + getRemark());
    }
}

public class StudentPerformanceAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student student = new Student(rollNo, name, marks);

        student.displayDetails();

        sc.close();
    }
}
