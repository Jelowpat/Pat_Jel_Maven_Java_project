package lesson12Names;

import java.util.*;

public class NameChanger {

    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList
                ("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr"));

        Set<String> namesSet = new HashSet<>(namesList);
        System.out.println("Lista bez duplikatów: " + namesSet);

        Collections.reverse(namesList);
        System.out.println("Elementy w odwrotnej kolejności: " + namesList);

        replaceElement(namesList,"Anna", "Joanna");
        System.out.println("Elementy po zmianie : Anna -> Joanna: " + namesList);

    }


    private static void replaceElement(ArrayList<String> namesList, String oldName, String newName) {
        Collections.replaceAll(namesList, oldName, newName);
    }

}
