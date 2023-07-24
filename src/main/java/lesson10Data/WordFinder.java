package lesson10Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordFinder {

    public boolean findWord (String word) throws IOException {

        Path filePath = Path.of
                ("C:/Users/Kolorek/IdeaProjects/Pat_Jel_Maven_Java_project/src/main/java/lesson10Data/data.txt");

        String text = Files.readString(filePath);

        return text.contains(word);
    }

}
