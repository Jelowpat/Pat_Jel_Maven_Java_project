package lessonSevenPythagoreanTriple;

import java.lang.Math;

public class PythagoreanTriple {

    public static boolean checkIfIsPythagorean(double sideA, double sideB, double sideC) {
        return Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2) ||
                Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2) ||
                Math.pow(sideC, 2) + Math.pow(sideB, 2) == Math.pow(sideA, 2);
    }

}
