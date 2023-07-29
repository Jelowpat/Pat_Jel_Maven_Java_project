package lesson10Data.createData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

public class FileCreator {

    private static final Path PATH = Paths.get("src/main/java/lesson10Data/data.txt");

    public static void main(String[] args) throws IOException {

        String[] lines = {"Kurs", "Java", "Lekcja 6", "Pliki", "Wyjątki", "Pliki", "Koniec pliku"};

        Files.write(PATH, Arrays.asList(lines), StandardOpenOption.CREATE);

    }
}
