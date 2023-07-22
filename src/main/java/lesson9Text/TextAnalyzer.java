package lesson9Text;

public class TextAnalyzer {

    public static String analyzeText(String text){
        if (text.equals("")){
            return "this is an empty string";
        }
        return String.format("length: %s\nis palindrome: %b", getTextLength(text), isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(text);
        String reversedText = stringBuilder.reverse().toString();
        return text.equals(reversedText);
    }

    public static int getTextLength(String text) {
        return text.length();
    }

}
