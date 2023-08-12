package lesson14PasswordValidator;

import java.util.regex.Pattern;

public class PasswordValidator {

    public boolean validate(String password){
        Pattern patternCapitalLetter = Pattern.compile("[A-Z]");
        Pattern patternDigit = Pattern.compile("\\d");
        Pattern patternLength = Pattern.compile(".{7,}");
        Pattern patternYear = Pattern.compile("(21|2021)");
        return patternCapitalLetter.matcher(password).find() && patternDigit.matcher(password).find() &&
                patternLength.matcher(password).matches() && !patternYear.matcher(password).find();
    }

}
