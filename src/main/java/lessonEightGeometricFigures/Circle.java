package lessonEightGeometricFigures;

public class Circle extends Shape{

    private static final double PI = Math.PI;
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * Math.pow(PI, 2);
    }

    @Override
    public double getPerimeter() {
        return radius * PI * 2;
    }
}
