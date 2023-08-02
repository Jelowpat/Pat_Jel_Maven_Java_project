package lesson10Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReverseReader {
    private static final Path filePath = Path.of("src/main/java/lesson10Data/data.txt");

    public static void main(String[] args) throws IOException {
        new ReverseReader().readReversed();
    }

    public void readReversed() throws IOException {

        var lines = Files.readAllLines(filePath);

        for (int i = lines.size(); i--> 0;){
            System.out.println(lines.get(i));
        }

    }

}
