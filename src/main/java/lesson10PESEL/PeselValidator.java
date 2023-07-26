package lesson10PESEL;

public class PeselValidator {

    public void validate(String pesel) throws WrongTypeOfDataException, IllegalLengthException {
        if (!(pesel instanceof String)){
            throw new WrongTypeOfDataException("It's not a String");
        }
        if (pesel.length() != 11){
            throw new IllegalLengthException("PESEL has 11 characters");
        }
    }

}
