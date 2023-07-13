package lessonEightCapitalAndSmallLetters;

public class TextToUpper implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
