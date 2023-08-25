package lesson15Letters;

import java.util.List;
import java.util.stream.Stream;

public class Letters {

    public static void main(String[] args) {
        lettersInWords(List.of("Ala ma kota".split(" ")));
        lettersInWords(List.of("chrząszcz", "brzmi", "w", "trzcinie", "w", "Szczebrzeszynie"));
    }

    public static void lettersInWords(List<String> words){
        words
                .stream()
                .flatMap(x -> Stream.of(x.split("")))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);
    }

}
