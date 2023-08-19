package lesson15Pizza;

import java.util.Comparator;
import java.util.List;
import static lesson15Pizza.Ingredient.*;

public class Main {

    public static void main(String[] args) {

        List<Pizza> pizzaList = List.of(
                new Pizza("Margherita", List.of(mozzarella, tomato), true, 1100),
                new Pizza("Capriciosa", List.of(mozzarella, tomato, mushrooms), true, 1200),
                new Pizza("Hawai", List.of(mozzarella, tomato, pineapple, salami), false, 1250),
                new Pizza("Cottage", List.of(mozzarella, tomato, salami,pepper, celery),
                        false, 1700),
                new Pizza("JavaDeveloper", List.of(), true, 500),
                new Pizza("Polish", List.of(onion), true, 700),
                new Pizza("Vegetariana", List.of(mozzarella, tomato, pepper, onion), true, 1400),
                new Pizza("Vesuvio", List.of(mozzarella, tomato, salami), false, 1300),
                new Pizza("AllInclusive",
                        List.of(mozzarella, tomato, mushrooms, salami, pepper, onion,celery, pineapple),
                        false, 2050),
                new Pizza("Classic", List.of(mozzarella, tomato, mushrooms, salami), false, 1300)
        );
        Menu menu = new Menu(pizzaList);

        System.out.println("Vegetarian:");
        menu.getPositions().stream().filter(Pizza::isVegetarian).forEach(System.out::println);
        System.out.println("Celery:");
        menu.getPositions().stream().filter(x -> x.getIngredientsList().contains(celery)).forEach(System.out::println);
        System.out.println("Does any vegetarian pizza contain both Pepper and tomato:");
        System.out.println(menu.getPositions().stream().filter(Pizza::isVegetarian)
                .anyMatch(x -> x.getIngredientsList().containsAll(List.of(tomato, pepper))));
        System.out.println("Do all pizzas contain mozarella:");
        System.out.println(menu.getPositions().stream().allMatch(x -> x.getIngredientsList().contains(mozzarella)));
        System.out.println("The least caloric Pizza:");
        System.out.println(menu.getPositions().stream().min(Comparator.comparingInt(Pizza::getCalories)));
        System.out.println("The most caloric Pizza:");
        System.out.println(menu.getPositions().stream().max(Comparator.comparingInt(Pizza::getCalories)));

    }

}
