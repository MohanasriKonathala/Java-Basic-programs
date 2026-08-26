import java.util.Scanner;

// Class to check whether a number is Prime Palindrome
class PrimePalindrome
{
    // Main method
    public static void main(String[] args)
    {
        // Creating Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.print("Enter a number: ");

        // Reading the number
        int n = sc.nextInt();

        // ---------------- CHECK PRIME ----------------

        // Initially assume the number is prime
        boolean prime = true;

        // Numbers less than or equal to 1 are not prime
        if (n <= 1)
        {
            prime = false;
        }
        else
        {
            // Checking whether n is divisible by any number
            // from 2 to n/2
            for (int i = 2; i <= n / 2; i++)
            {
                // If remainder is 0, n is divisible by i
                if (n % i == 0)
                {
                    // Number is not prime
                    prime = false;

                    // Stop the loop
                    break;
                }
            }
        }

        // ---------------- CHECK PALINDROME ----------------

        // Store the original number because n will be changed
        int original = n;

        // Variable to store the reversed number
        int reverse = 0;

        // Reverse the number
        while (n > 0)
        {
            // Get the last digit
            int digit = n % 10;

            // Add the digit to the reverse number
            reverse = reverse * 10 + digit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Check both conditions:
        // 1. Number should be prime
        // 2. Original number should be equal to reversed number
        if (prime && original == reverse)
        {
            System.out.println(original + " is a Prime Palindrome number.");
        }
        else
        {
            System.out.println(original + " is NOT a Prime Palindrome number.");
        }
    }
}
