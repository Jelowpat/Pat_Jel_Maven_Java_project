package lesson16WebsiteCode;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {


    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HtmlGetter htmlGetter = new HtmlGetter();
        htmlGetter.getHtmlAndSaveAsFile("https://www.google.com", "google.txt");
    }

}
