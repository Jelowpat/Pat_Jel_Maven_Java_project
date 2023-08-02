package lessonSevenCinemaEmployees;

public class BaseEmployee {

    private final String name;
    private final String surname;
    protected final int baseSalary = 3000;
    private final int yearOfHiring;

    public BaseEmployee(String name, String surname, int yearOfHiring){
        this.name = name;
        this.surname = surname;
        this.yearOfHiring = yearOfHiring;
    }

    public int calculateMonthlySalary() {
        return baseSalary;
    }

    public int getTenure() {
        return 2023 - yearOfHiring;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

}
