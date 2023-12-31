package lesson14PhoneBook;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBookLoader phoneBookLoader = new PhoneBookLoader();
        phoneBookLoader.load(phoneBook, Paths.get("src/main/java/lesson14PhoneBook/addresses"));
        System.out.println(phoneBook);
    }
}
