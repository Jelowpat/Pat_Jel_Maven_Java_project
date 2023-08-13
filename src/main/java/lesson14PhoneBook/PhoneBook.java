package lesson14PhoneBook;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class PhoneBook {

    private final Map<Entry, Contact> contacts = new HashMap<>();

    public void addContact(Contact position){
        contacts.put(new Entry(position.getName(), position.getSurname()), position);
    }

    public void addContactsFromFile(Path path) throws IOException {
        contacts.putAll(new PhoneBookLoader().load(path).getContacts());
    }

    public Contact getContactByEntry(Entry key){
        return contacts.get(key);
    }

    public Map<Entry, Contact> getContacts() {
        return contacts;
    }


}
