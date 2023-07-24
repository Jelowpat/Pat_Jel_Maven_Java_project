package lesson10Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EverySecondLinePrinter {

    public void readText() throws IOException {

        BufferedReader stream = Files.newBufferedReader(Path.of
                ("C:/Users/Kolorek/IdeaProjects/Pat_Jel_Maven_Java_project/src/main/java/lesson10Data/data.txt"));

        String line = stream.readLine();

        while (line != null) {
            System.out.println(line);
            stream.readLine();
            line = stream.readLine();
        }
    }
}
