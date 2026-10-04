import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String input1 = "()";
        String input2 = "({)}";

        System.out.println("Input: " + input1);
        System.out.println("Output: " +
                (isValid(input1) ? "Valid" : "Not valid"));

        System.out.println();

        System.out.println("Input: " + input2);
        System.out.println("Output: " +
                (isValid(input2) ? "Valid" : "Not valid"));
    }
}
