package lesson14PhoneBook;

import java.util.Optional;

public class PhoneBookPosition {

    private final String name;
    private final String surname;
    private String address;
    private Optional phoneNumber;

    public PhoneBookPosition(String name, String surname, String address) {
        this(name, surname, address,null);
    }

    public PhoneBookPosition(String name, String surname, String address, Integer phoneNumber) {
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Optional getPhoneNumber() {
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
        return "PhoneBookPosition{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
