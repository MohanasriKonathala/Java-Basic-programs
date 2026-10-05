import java.util.*;

public class LetterCombinations {

    static String[] keypad = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static void generate(String digits, int index,
                         String current, List<String> result) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            generate(digits, index + 1,
                    current + letters.charAt(i), result);
        }
    }

    public static void main(String[] args) {

        String digits = "23";

        List<String> result = new ArrayList<>();

        if (!digits.isEmpty()) {
            generate(digits, 0, "", result);
        }

        System.out.println(result);
    }
}
