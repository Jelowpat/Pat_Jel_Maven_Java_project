package lessonEightAreaAndPerimeter;

public class Circle implements AreaAndPerimeter{

    private static final double PI = Math.PI;
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
