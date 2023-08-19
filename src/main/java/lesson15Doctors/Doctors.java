package lesson15Doctors;

import java.util.List;
import java.util.stream.Stream;

public class Doctors {

    public static void main(String[] args) {
        List<String> doctorsList = List.of(
                "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra",
                "Przychodnia:Internista:Laryngolog:Pediatra");
        doctorsList.stream()
                .flatMap(x-> Stream.of(x.split(":")))
                .distinct()
                .filter(x -> !x.equals("Przychodnia"))
                .filter(x -> !x.equals("Szpital"))
                .forEach(System.out::println);
    }

}
