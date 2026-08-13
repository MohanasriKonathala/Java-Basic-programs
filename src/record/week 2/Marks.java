class Marks
{
    public static void main(String args[])
    {
        String input[] = {"80", "70", "90", "85", "75"};

        int m1 = Integer.parseInt(input[0]);
        int m2 = Integer.parseInt(input[1]);
        int m3 = Integer.parseInt(input[2]);
        int m4 = Integer.parseInt(input[3]);
        int m5 = Integer.parseInt(input[4]);

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}
