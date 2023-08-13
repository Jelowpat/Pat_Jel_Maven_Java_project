package lesson14PasswordValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static final Pattern PATTERN = Pattern.compile("^(?=(.*[A-Z]))(?=(.*[0-9]))(?!(.*(2021|21))).{7,}$");

    public boolean validate(String password){
        Matcher matcher = PATTERN.matcher(password);
        return matcher.find();
    }

}