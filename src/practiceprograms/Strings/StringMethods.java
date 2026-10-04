public class StringMethods {

    public static void main(String[] args) {

        String str = "  Java Programming Language  ";

        System.out.println("Original String: [" + str + "]");

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. trim()
        String s = str.trim();
        System.out.println("After trim: " + s);

        // 3. toUpperCase()
        System.out.println("Uppercase: " + s.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + s.toLowerCase());

        // 5. charAt()
        System.out.println("Character at index 5: " + s.charAt(5));

        // 6. substring()
        System.out.println("Substring: " + s.substring(5, 16));

        // 7. indexOf()
        System.out.println("Index of 'Programming': "
                + s.indexOf("Programming"));

        // 8. contains()
        System.out.println("Contains 'Java': "
                + s.contains("Java"));

        // 9. startsWith()
        System.out.println("Starts with 'Java': "
                + s.startsWith("Java"));

        // 10. endsWith()
        System.out.println("Ends with 'Language': "
                + s.endsWith("Language"));

        // 11. replace()
        System.out.println("After replace: "
                + s.replace("Java", "Python"));

        // 12. concat()
        System.out.println("After concat: "
                + s.concat(" is easy"));

        // 13. equals()
        System.out.println("Equals 'Java Programming Language': "
                + s.equals("Java Programming Language"));

        // 14. equalsIgnoreCase()
        System.out.println("Equals ignoring case: "
                + s.equalsIgnoreCase("JAVA PROGRAMMING LANGUAGE"));

        // 15. toCharArray()
        System.out.print("Characters: ");
        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }

        // 16. split()
        System.out.println("\nWords:");
        String[] words = s.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        // 17. isEmpty()
        System.out.println("Is String empty? " + s.isEmpty());

        // 18. Reverse using StringBuilder
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Reversed: " + sb.reverse());
    }
}
