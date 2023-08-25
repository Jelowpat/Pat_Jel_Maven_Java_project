package lesson14PhoneBook;

import java.util.List;
import java.util.Optional;

public class Contact {

    private final String name;
    private final String surname;
    private String address;
    private Optional<Integer> phoneNumber = Optional.empty();

    public Contact(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Contact(String name, String surname, String address, Integer phoneNumber){
        this(name, surname, address);
        this.phoneNumber = Optional.of(phoneNumber);
    }

    public Optional<Integer> getPhoneNumber() {
            return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        String print =  "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'';
        if (phoneNumber.isPresent()){
            print += ", phoneNumber=" + phoneNumber;
        }
        print += '}';
        return print;
    }
}
