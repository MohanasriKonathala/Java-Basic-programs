public class TryCatchDemo
{
    public static void main(String[] args)
    {
        int[] marks = {90, 80, 70};

        try
        {
            System.out.println("Marks = " + marks[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(
                "Exception handled using try and catch."
            );
        }
    }
}
