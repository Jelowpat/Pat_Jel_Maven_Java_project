package lesson12Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Person> personSetByAge = new TreeSet<>();
        personSetByAge.add(new Person("Jan", "Kowalski", 1993, 83, 183));
        personSetByAge.add(new Person("Adam", "Nowak", 1953, 103, 162));
        personSetByAge.add(new Person("Jan", "Kowalski", 2001, 123, 200));


        Set<Person> personSetByHeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });
        personSetByHeight.add(new Person("Jan", "Kowalski", 1993, 83, 183));
        personSetByHeight.add(new Person("Adam", "Nowak", 1953, 103, 162));
        personSetByHeight.add(new Person("Jan", "Kowalski", 2001, 123, 200));

        Set<Person> personSetByWeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.getWeight(), o1.getWeight());
            }
        });
        personSetByWeight.add(new Person("Jan", "Kowalski", 1993, 83, 183));
        personSetByWeight.add(new Person("Adam", "Nowak", 1953, 103, 162));
        personSetByWeight.add(new Person("Jan", "Kowalski", 2001, 123, 200));

        System.out.println("From youngest to oldest:");
        for (Person person: personSetByAge){
            System.out.println(person);
        }

        System.out.println("From shortest to tallest:");
        for (Person person: personSetByHeight){
            System.out.println(person);
        }

        System.out.println("From heaviest to lightest:");
        for (Person person: personSetByWeight){
            System.out.println(person);
        }
    }

}
