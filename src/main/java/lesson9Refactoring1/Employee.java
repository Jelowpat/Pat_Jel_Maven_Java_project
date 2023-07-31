package lesson9Refactoring1;

import java.math.BigDecimal;

public class Employee {

    private static final String WHITE_SPACE = " ";
    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String name, String surname) {
        this(name, surname, 0);
    }

    public Employee(String name, String surname, int age) {
        this(name, surname, age, BigDecimal.ZERO);
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this(name, surname, age, baseSalary, BigDecimal.ZERO);
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " +  name + WHITE_SPACE + surname + " is " + age;
    }

    public BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

}
