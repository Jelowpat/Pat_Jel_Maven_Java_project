package lessonEightGeometricFigures;

public class Circle extends Shape{

    double radius;

    private static final double PI = Math.PI;
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
