package lesson10Element;

import java.lang.Math;

public class Element {

    public double getElement(double number){

        if (number < 0) {
            throw new IllegalArgumentException();
        }

        return Math.sqrt(number);
    }

}
