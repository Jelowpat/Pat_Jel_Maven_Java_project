package lesson14PhoneBook;

import java.util.Objects;

public class Entry {

    private final String name;
    private final String surname;

    public Entry(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(name, entry.name) &&
                Objects.equals(surname, entry.surname);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
