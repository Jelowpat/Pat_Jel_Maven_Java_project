package lesson12Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Person> peopleByAge = new TreeSet<>();
        peopleByAge.add(new Person("Jan", "Kowalski", 1993, 83, 183));
        peopleByAge.add(new Person("Adam", "Nowak", 1953, 103, 162));
        peopleByAge.add(new Person("Jan", "Kowalski", 2001, 123, 200));


        Set<Person> peopleByHeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getHeight(), o2.getHeight());
            }
        });
        peopleByHeight.addAll(peopleByAge);

        Set<Person> peopleByWeight = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.getWeight(), o1.getWeight());
            }
        });
        peopleByWeight.addAll(peopleByAge);

        System.out.println("From youngest to oldest:");
        for (Person person : peopleByAge){
            System.out.println(person);
        }

        System.out.println("From shortest to tallest:");
        for (Person person : peopleByHeight){
            System.out.println(person);
        }

        System.out.println("From heaviest to lightest:");
        for (Person person : peopleByWeight){
            System.out.println(person);
        }
    }

}
