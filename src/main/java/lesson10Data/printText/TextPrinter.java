package lesson10Data.printText;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextPrinter {

    private static final String PATH = "C:/Users/Kolorek/IdeaProjects/Pat_Jel_Maven_Java_project/src/main/java/lesson10Data/data.txt";

    public void readText() throws IOException {

        BufferedReader stream = Files.newBufferedReader(Path.of(PATH));

        String line = stream.readLine();

        while(line != null){
            System.out.println(line);
            line = stream.readLine();
        }
    }
}
