import java.util.Scanner;

class LongestSubstring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Store the longest substring
        String longest = "";

        // Select the starting position
        for(int i = 0; i < str.length(); i++)
        {
            // Store the current substring
            String current = "";

            // Select characters continuously from position i
            for(int j = i; j < str.length(); j++)
            {
                char ch = str.charAt(j);

                // Check whether the character is already present
                if(current.indexOf(ch) != -1)
                {
                    // Repeated character found
                    break;
                }

                // Add the character to current substring
                current = current + ch;

                // Check whether current substring is longer
                if(current.length() > longest.length())
                {
                    longest = current;
                }
            }
        }

        // Display the longest substring and its length
        System.out.println("String = " + longest);
        System.out.println("Length = " + longest.length());

        sc.close();
    }
}
