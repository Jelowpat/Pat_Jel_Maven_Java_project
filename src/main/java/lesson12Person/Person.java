package lesson12Person;

public class Person implements Comparable<Person>{

    private final String name;
    private final String surname;

    private final int birthYear;
    private final int height;
    private final int weight;

    public Person(String name, String surname, int birthYear, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.weight = weight;
        this.height = height;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        int value2 = anotherPerson.getBirthYear();
        return Integer.compare(value2, birthYear);
    }

    @Override
    public String toString() {
        return "{" + "Name: " + name + ", Surname: " + surname + ", birth year: " + birthYear +
                ", weight: " + weight + ", height: " + height + "}";
    }
}
