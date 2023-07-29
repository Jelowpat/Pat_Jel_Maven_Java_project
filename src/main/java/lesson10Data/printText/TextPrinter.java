package lesson10Data.printText;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextPrinter {

    public void readText() throws IOException {

        BufferedReader stream = Files.newBufferedReader(Path.of
                ("src/main/java/lesson10Data/data.txt"));

        String line = stream.readLine();

        while(line != null){
            System.out.println(line);
            line = stream.readLine();
        }
    }
}
