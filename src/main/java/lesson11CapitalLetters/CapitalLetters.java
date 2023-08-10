package lesson11CapitalLetters;

public class CapitalLetters {

    public static String capitalize(String text){
        if (text == null){
            throw new IllegalArgumentException("provided argument should not be null");
        }
            return text.toUpperCase();
    }

}
