public class TwoExceptionDemo
{
    public static void main(String[] args)
    {
        String value = "Java";
        int[] numbers = {10, 20, 30};

        try
        {
            int number = Integer.parseInt(value);
            System.out.println(number);

            System.out.println(numbers[5]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Exception: Invalid number format.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception: Array index is invalid.");
        }
    }
}
