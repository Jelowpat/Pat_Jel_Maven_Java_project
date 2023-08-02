package lesson10Modulo3;

public class Modulo3 {

    public void validate(int[] values) throws IllegalArgumentException{
        for (int element : values){
            try {
                if (element % 3 != 0){
                    throw new IllegalArgumentException("Not divisible by 3");
                }
                System.out.println(element + " is divisible by 3");
            } catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
        }
    }

}
