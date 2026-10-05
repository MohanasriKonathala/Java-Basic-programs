class AgeException extends Exception
{
    AgeException(String message)
    {
        super(message);
    }
}

public class CustomCheckedDemo
{
    public static void main(String[] args)
    {
        try
        {
            int age = 15;

            if (age < 18)
            {
                throw new AgeException("Age must be 18 or above.");
            }

            System.out.println("Eligible for voting.");
        }
        catch (AgeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
