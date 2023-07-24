package lessonSevenPythagoreanTriangle;

import java.lang.Math;

public class PythagoreanTriangle {

    public static boolean isPythagorean(double sideA, double sideB, double sideC) {
        return Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2) ||
                Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2) ||
                Math.pow(sideC, 2) + Math.pow(sideB, 2) == Math.pow(sideA, 2);
    }

}
