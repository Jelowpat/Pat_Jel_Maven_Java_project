package lesson8Person;

import java.time.*;
import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final LocalDate birthDate;
    private double height;
    private double weight;
    public Person(String name, String surname, int yearOfBirth, Month monthOfBirth, int dayOfBirth,
                  double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth.getMonthNumber(), dayOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, height, weight);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                        Objects.equals(surname, person.surname) &&
                        Objects.equals(birthDate, person.birthDate) &&
                        Double.compare(weight, person.weight) == 0 &&
                        height == person.height;
    }

    public int getAge(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString(){
        return "Person{" +
                "name=" + name +
                ", surname=" + surname +
                ", age=" + this.getAge() +
                ", height=" + height +
                ", weight=" + weight +
                ", dateOfBirth=" + birthDate +
                "}";
    }
}