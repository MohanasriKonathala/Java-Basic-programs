// Marks class
class Marks
{
    // Main method
    public static void main(String args[])
    {
        // Creating a String array and storing marks of five subjects
        String input[] = {"80", "70", "90", "85", "75"};

        // Converting String values into integer values using parseInt()
        int m1 = Integer.parseInt(input[0]);
        int m2 = Integer.parseInt(input[1]);
        int m3 = Integer.parseInt(input[2]);
        int m4 = Integer.parseInt(input[3]);
        int m5 = Integer.parseInt(input[4]);

        // Calculating the total marks
        int total = m1 + m2 + m3 + m4 + m5;

        // Calculating the average
        // 5.0 is used so that the result is a double value
        double average = total / 5.0;

        // Displaying the total marks
        System.out.println("Total = " + total);

        // Displaying the average marks
        System.out.println("Average = " + average);
    }
}
