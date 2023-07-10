package lesson8Person;

import java.time.*;
import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;

    // if I don't initialize these, I can't use the 'LocalDate.of' method, any solutions to that?
    private int yearOfBirth = 0;
    private Month monthOfBirth = Month.January;
    private int dayOfBirth = 0;

    private final LocalDate birthDate;
    private double height;
    private double weight;
    private Period age;

    public Person(String name, String surname, int yearOfBirth, Month monthOfBirth, int dayOfBirth,
                  double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.height = height;
        this.weight = weight;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth.getMonthNumber(), dayOfBirth);
        calculateAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfBirth, monthOfBirth, dayOfBirth, height, weight);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                        Objects.equals(surname, person.surname) &&
                        Double.compare(weight, person.weight) == 0 &&
                        height == person.height &&
                        yearOfBirth == person.yearOfBirth &&
                        monthOfBirth == person.monthOfBirth &&
                        dayOfBirth == person.dayOfBirth;
    }
    public void calculateAge(){
         this.age = Period.between(LocalDate.now(), birthDate);
    }

    public int getAge(){
        this.age = Period.between(birthDate,LocalDate.now());
        return age.getYears();
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nSurname: " + surname + "\nAge: " + this.getAge() + "\nHeight: " +
                height + "\nWeight: " + weight + "\nDate of birth: " + birthDate;
    }
}