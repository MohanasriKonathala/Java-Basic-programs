import java.util.Scanner;

// Custom checked exception
class LengthNotSufficientException extends Exception
{
    LengthNotSufficientException(String message)
    {
        super(message);
    }
}

public class MobileNumberValidation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        try
        {
            // More than 10 digits
            if (mobile.length() > 10)
            {
                throw new ArrayIndexOutOfBoundsException(
                    "Invalid Mobile Number-ArrayIndexOutOfBounds Exception"
                );
            }

            // Less than 10 digits
            if (mobile.length() < 10)
            {
                throw new LengthNotSufficientException(
                    "Invalid Mobile Number-LengthNotSufficientException"
                );
            }

            // Checking whether all characters are digits
            for (int i = 0; i < 10; i++)
            {
                if (!Character.isDigit(mobile.charAt(i)))
                {
                    throw new NumberFormatException(
                        "Invalid Mobile Number-NumberFormatException"
                    );
                }
            }

            System.out.println("Valid number");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (LengthNotSufficientException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
