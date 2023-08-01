package lesson10Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EverySecondLinePrinter {

    public void printEverySecondLine() throws IOException {

        BufferedReader stream = Files.newBufferedReader(Paths.get
                ("src/main/java/lesson10Data/data.txt"));

        String line = stream.readLine();

        while (line != null) {
            System.out.println(line);
            stream.readLine();
            line = stream.readLine();
        }
    }
}
