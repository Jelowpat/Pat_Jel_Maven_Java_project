package lesson10Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

public class ReverseReader {
    private static final Path filePath = Path.of
            ("src/main/java/lesson10Data/data.txt");

    public void readReversed() throws IOException {

        var lines = Files.readAllLines(filePath);

        Collections.reverse(lines);

        for (String line : lines){
            System.out.println(line);
        }

    }

}
