package lesson10Data;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class dataTxtToUpper {

    private static final Path INPUT_PATH = Path.of
            ("C:/Users/Kolorek/IdeaProjects/Pat_Jel_Maven_Java_project/src/main/java/lesson10Data/data.txt");
    private static final Path OUTPUT_PATH = Path.of
            ("C:/Users/Kolorek/IdeaProjects/Pat_Jel_Maven_Java_project/src/main/java/lesson10Data/output.txt");

    public void generateOutput() {

        try (BufferedWriter writer = Files.newBufferedWriter(OUTPUT_PATH)) {
            writer.write(changeText());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private String changeText() throws IOException {
        return Files.readString(INPUT_PATH).toUpperCase();
    }

}
