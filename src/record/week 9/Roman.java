// Defining the package named number
package number;
// Roman class contains the romanToInteger() method
public class Roman {
    // Method to convert Roman numeral into integer
    public int romanToInteger(String s) {
        int result = 0;
        // Checking each character of the Roman numeral
        for (int i = 0; i < s.length(); i++) {
            // Getting the value of the current Roman symbol
            int current = value(s.charAt(i));
            // Checking the value of the next symbol
            if (i + 1 < s.length()) {
                int next = value(s.charAt(i + 1));
                // If current value is smaller than next value,
                // subtract current value
                if (current < next) {
                    result -= current;
                }
                // Otherwise, add current value
                else {
                    result += current;
                }
            }
else {
                // Add the last Roman symbol
                result += current;
            }
        }
        return result;
    }
    // Method to return integer value of a Roman symbol
    private int value(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
