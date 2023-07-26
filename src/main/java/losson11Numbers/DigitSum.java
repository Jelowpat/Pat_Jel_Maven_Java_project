package losson11Numbers;
import java.lang.Math;

public class DigitSum {

    public int getDigitSum(int number){
        int absoluteNumber = Math.abs(number);
        int result = 0;
        while (absoluteNumber > 0){
            result += absoluteNumber % 10;
            absoluteNumber = absoluteNumber / 10;
        }
        return result;
    }

}
