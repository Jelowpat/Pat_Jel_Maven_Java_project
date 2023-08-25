package lesson15Pizza;

import java.util.List;

public class Pizza {
    private final String name;
    private final List<Ingredient> ingredientsList;
    private final boolean vegetarian;
    private final int calories;

    public Pizza(String name, List<Ingredient> ingredientsList, boolean vegetarian, int calories) {
        this.name = name;
        this.ingredientsList = ingredientsList;
        this.vegetarian = vegetarian;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredientsList() {
        return ingredientsList;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredientsList=" + ingredientsList +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                '}';
    }
}
