// Importing Roman class from number package
import number.Roman;
// Main class
public class RomanDemo {
    public static void main(String[] args) {
        // Creating object of Roman class
        Roman r = new Roman();
        // Input Roman numeral
        String roman = "LVIII";
        // Calling romanToInteger() method
        int result = r.romanToInteger(roman);
        // Displaying the result
        System.out.println("Roman Number : " + roman);
        System.out.println("Integer Value : " + result);
    }
}
