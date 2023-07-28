package lesson10PESEL;

public class PeselValidator {

    public void validate(String pesel) throws WrongTypeOfDataException, IllegalLengthException {
        if (pesel.length() != 11){
            throw new IllegalLengthException("PESEL should have 11 characters");
        }
        try {
            Integer.parseInt(pesel);
        } catch (NumberFormatException exception){
            throw new WrongTypeOfDataException("PESEL should contain only digits");
        }
    }

}