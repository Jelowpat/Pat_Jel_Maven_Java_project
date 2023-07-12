package lessonEightGeometricFigures;

import java.lang.Math;

public class Triangle extends Shape{

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {

        double halfPerimeter = getPerimeter() / 2;

        // heron's formula

        return Math.pow((halfPerimeter * (halfPerimeter-sideA) * (halfPerimeter-sideB) * (halfPerimeter-sideC)), 0.5);

    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
