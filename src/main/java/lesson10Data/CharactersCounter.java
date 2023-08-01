package lesson10Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharactersCounter {

    public void countCharacters() throws IOException {

        System.out.println(Files.readString(Path.of
                ("src/main/java/lesson10Data/data.txt"))
                .length());
    }
}
