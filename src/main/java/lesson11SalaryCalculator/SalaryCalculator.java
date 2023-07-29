package lesson11SalaryCalculator;

public class SalaryCalculator {

    private final BasicSalary basicSalary;
    private final SaturdayRate saturdayRate;

    public SalaryCalculator(BasicSalary basicSalary, SaturdayRate saturdayRate) {
        this.basicSalary = basicSalary;
        this.saturdayRate = saturdayRate;
    }

    public double calculate(double saturdayHours, double oneTimeBonus){
        return basicSalary.getBasicSalary() + oneTimeBonus + saturdayHours * saturdayRate.getSaturdayRate();
    }

}
