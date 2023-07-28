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
//Zaimplementuj klasę, której zadaniem będzie walidacja numeru PESEL pod kątem:
//●      typu danych (załóż, że argument jest typu String)
//●      długości
//Jeżeli typ danych będzie niezgodny powinien zostać rzucony wyjątek WrongTypeOfDataException, jeżeli długość jest
// niewłaściwa wówczas rzucany jest wyjątek IllegalLengthException. Każdy wyjątek powinien zwracać odpowiedni message.