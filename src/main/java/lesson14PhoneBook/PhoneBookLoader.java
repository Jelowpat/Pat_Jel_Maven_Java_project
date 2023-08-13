package lesson14PhoneBook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class PhoneBookLoader {

    public PhoneBook load(Path path) throws IOException {
        List<String> contactList = Files.readAllLines(path);
        PhoneBook phoneBook = new PhoneBook();
        for (String position : contactList){
            List<String> personData = Arrays.asList(position.split(","));
            if(personData.size() == 3){
                phoneBook.addContact(new Contact(personData.get(0), personData.get(1),
                        personData.get(2)));
            } else{
                phoneBook.addContact(new Contact(personData.get(0), personData.get(1),
                        personData.get(2),Integer.valueOf(personData.get(3))));
            }
        }
        return phoneBook;
    }

}
