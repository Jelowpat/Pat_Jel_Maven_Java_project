package lesson9Text;

public class TextAnalyzer {

    public static void analyzeText(String text) {
        if (text != null && !text.equals("")) {
            System.out.printf("length: %s\n", text.length());
            System.out.printf("is palindrome: %b", isPalindrome(text));
        }
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return text.equals(reverseText(text));
    }

    public static String reverseText(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }

}
