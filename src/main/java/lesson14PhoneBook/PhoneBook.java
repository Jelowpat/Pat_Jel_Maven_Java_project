package lesson14PhoneBook;

import java.util.*;

public class PhoneBook {

    private final Map<Entry, Contact> contacts = new HashMap<>();

    public void addContact(Contact position){
        contacts.put(new Entry(position.getName(), position.getSurname()), position);
    }

    public Contact getContactByEntry(Entry key){
        return contacts.get(key);
    }

    public Map<Entry, Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Contacts:\n");
        for (Contact contact : contacts.values()) {
            stringBuilder.append(contact);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
