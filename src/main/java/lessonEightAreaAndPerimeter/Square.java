package lessonEightAreaAndPerimeter;
import java.lang.Math.*;

public class Square implements AreaAndPerimeter{

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
