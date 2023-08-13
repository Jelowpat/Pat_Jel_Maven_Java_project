package lesson14PESEL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {


    public boolean validate(String pesel){
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();
    }
    public boolean validateWithRange(String pesel){
        Pattern pattern = Pattern.compile("[10000000000-99999999999]");
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();
    }


}
