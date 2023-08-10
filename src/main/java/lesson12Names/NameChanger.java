package lesson12Names;

import java.util.*;

public class NameChanger {

    public static void main(String[] args) {

        List<String> names = Arrays.asList
                ("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");

        Set<String> namesSet = new HashSet<>(names);
        System.out.println("Lista bez duplikatów: " + namesSet);

        Collections.reverse(names);
        System.out.println("Elementy w odwrotnej kolejności: " + names);

        replaceElement(names,"Anna", "Joanna");
        System.out.println("Elementy po zmianie : Anna -> Joanna: " + names);

    }


    private static void replaceElement(List<String> namesList, String oldName, String newName) {
        Collections.replaceAll(namesList, oldName, newName);
    }

}
