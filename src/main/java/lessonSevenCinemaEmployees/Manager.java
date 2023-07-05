package lessonSevenCinemaEmployees;

public class Manager extends BaseEmployee{

    private final int baseSalary = 5000;
    private int bonus = 500;

    public Manager(String name, String surname, int yearOfHiring){
        super(name, surname, yearOfHiring);
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary + bonus;
    }

    @Override
    public int getBaseSalary(){
        return baseSalary;
    }

    public void changeBonus(int newBonus){
        if (newBonus >= 0){
            this.bonus = newBonus;
        }
    }
}
