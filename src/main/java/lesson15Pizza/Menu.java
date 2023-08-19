package lesson15Pizza;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Pizza> positions;

    public Menu(){
        positions = new ArrayList<>();
    }

    public Menu(Menu menu){
        this();
        for(int i = 0; i < menu.positions.size(); i++){
            addPosition(menu.positions.get(i));
        }
    }
    public Menu(List<Pizza> pizzaList){
        this();
        for(Pizza pizza:pizzaList){
            addPosition(pizza);
        }
    }

    public void addPosition(Pizza pizza){
        positions.add(pizza);
    }

    public List<Pizza> getPositions(){
        return positions;
    }

}
