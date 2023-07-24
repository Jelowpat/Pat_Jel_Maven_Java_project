package lesson8CalculatingBillValue;

public class BillCalculator {

    private double calculateService(double billValue, float service){
        return billValue * service;
    }

    public double calculate(double billValue, float service){
        return billValue + calculateService(billValue, service);
    }
    public double calculate(double billValue, float service, double discount){
        return billValue * Math.max(1-discount, 0) + calculateService(billValue, service);
    }
    public double calculate(double billValue, float service, short takeoutBoxes){
        return billValue + calculateService(billValue, service) + takeoutBoxes;
    }
}
