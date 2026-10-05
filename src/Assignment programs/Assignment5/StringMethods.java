public class StringMethodExplorer
{
    public static void main(String[] args)
    {
        String message = "Java Strings make coding interesting";
        String sameMessage = "Java Strings make coding interesting";
        String mixedCase = "JAVA STRINGS MAKE CODING INTERESTING";
        String padded = "   Learn Java Strings   ";

        System.out.println("=== STRING MESSAGE ANALYZER ===");
        System.out.println("Original Message : " + message);

        // 1. length()
        System.out.println("1. length() = " + message.length());

        // 2. charAt()
        System.out.println("2. charAt(5) = " + message.charAt(5));

        // 3. substring()
        System.out.println("3. substring(0, 4) = "
                + message.substring(0, 4));

        // 4. concat()
        System.out.println("4. concat() = "
                + message.concat(" !!!"));

        // 5. equals()
        System.out.println("5. equals() = "
                + message.equals(sameMessage));

        // 6. equalsIgnoreCase()
        System.out.println("6. equalsIgnoreCase() = "
                + message.equalsIgnoreCase(mixedCase));

        // 7. compareTo()
        System.out.println("7. compareTo() = "
                + message.compareTo(sameMessage));

        // 8. indexOf()
        System.out.println("8. indexOf(\"Java\") = "
                + message.indexOf("Java"));

        // 9. lastIndexOf()
        System.out.println("9. lastIndexOf(\"i\") = "
                + message.lastIndexOf("i"));

        // 10. contains()
        System.out.println("10. contains(\"coding\") = "
                + message.contains("coding"));

        // 11. startsWith()
        System.out.println("11. startsWith(\"Java\") = "
                + message.startsWith("Java"));

        // 12. endsWith()
        System.out.println("12. endsWith(\"interesting\") = "
                + message.endsWith("interesting"));

        // 13. replace()
        System.out.println("13. replace() = "
                + message.replace("interesting", "powerful"));

        // 14. trim()
        System.out.println("14. trim() = ["
                + padded.trim() + "]");

        // 15. toUpperCase()
        System.out.println("15. toUpperCase() = "
                + message.toUpperCase());
    }
}
