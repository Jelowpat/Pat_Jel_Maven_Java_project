package lesson14Numbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFilter {

    public boolean filterIntegers(String number){
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
    public boolean filterDecimalNumbers(String number){
        Pattern pattern = Pattern.compile("-?\\d+[.]\\d+");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
    public boolean filterNumberNotations(String number){
        Pattern pattern = Pattern.compile("-?\\d+[.]\\d+[eE]([+]|-)\\d+");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

}
