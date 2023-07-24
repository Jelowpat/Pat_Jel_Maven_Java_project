package lesson10Data.createData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {

    private static final String PATH = "C:/Users/Kolorek/IdeaProjects/Pat_Jel_Maven_Java_project/src/main/java/lesson9Data/data.txt";

    public static void main(String[] args) throws IOException {

        String[] lines = {"Kurs", "Java", "Lekcja 6", "Pliki", "Wyjątki", "Pliki", "Koniec pliku"};

        File file = new File(PATH);
        file.createNewFile();

        BufferedWriter stream = Files.newBufferedWriter(Path.of(PATH));

        for (String line : lines){
            stream.newLine();
            stream.write(line);
        }
        stream.flush();
    }
}
