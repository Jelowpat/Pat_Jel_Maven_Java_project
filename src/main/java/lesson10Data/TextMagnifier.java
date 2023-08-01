package lesson10Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TextMagnifier {


    public void changeToUpperCase(String inputPath, String outputPath) throws IOException {

        String text = magnifyText(readFile(inputPath));
        generateFile(text, outputPath);

    }

    private void generateFile(String text, String outputPath){

        try  {
            Files.write(Paths.get(outputPath), text.getBytes(), StandardOpenOption.CREATE);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    private String magnifyText(String text){
        return text.toUpperCase();
    }

    private String readFile(String file) throws IOException {
        return Files.readString(Paths.get(file));
    }

}
