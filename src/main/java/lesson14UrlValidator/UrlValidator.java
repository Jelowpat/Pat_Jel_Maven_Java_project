package lesson14UrlValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public boolean validate(String url){
        Pattern pattern = Pattern.compile("http(s)?://.+[.]\\w+");
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}

