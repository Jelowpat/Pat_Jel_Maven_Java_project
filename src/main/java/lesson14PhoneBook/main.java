package lesson14PhoneBook;

import java.io.IOException;
import java.nio.file.Paths;

public class main {

    public static void main(String[] args) throws IOException {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPositionsFromFile(Paths.get("src/main/java/lesson14PhoneBook/addresses"));
        System.out.println(phoneBook.getPhoneBook());
    }
}
