package lesson11CapitalLetters;

public class CapitalLetters {

    public static String capitalize(String text){
        if (text == null){
            throw new IllegalArgumentException();
        }
            return text.toUpperCase();
    }

}
