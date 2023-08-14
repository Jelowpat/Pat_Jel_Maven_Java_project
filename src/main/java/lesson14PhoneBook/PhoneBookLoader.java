package lesson14PhoneBook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PhoneBookLoader {

    public PhoneBook load(Path path) throws IOException {
        List<String> contactList = Files.readAllLines(path);
        PhoneBook phoneBook = new PhoneBook();

        contactList.stream().map((String contact) -> contact.split(","))
                .map(List::of)
                .forEach((List<String> contact) -> {
                    Contact position = (contact.size() == 3) ? new Contact(contact.get(0), contact.get(1),
                            contact.get(2)) : new Contact(contact.get(0), contact.get(1),
                            contact.get(2),Integer.valueOf(contact.get(3)));
                    phoneBook.addContact(position);
        });
        return phoneBook;
    }

}
