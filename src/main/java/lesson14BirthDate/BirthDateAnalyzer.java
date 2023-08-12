package lesson14BirthDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class BirthDateAnalyzer {

    public void analyze(String birthDate){
        LocalDate birthDateLocalDate = LocalDate.parse(birthDate);
        System.out.println("You are " + calculateAge(birthDateLocalDate) + " years old.");
        System.out.println("You were born on " + getBirthDayDayOfTheWeek(birthDateLocalDate) + ".");
        System.out.println("It was day number " + getBirthdayDayOfTheYear(birthDateLocalDate) + " when you were born.");

    }

    private int calculateAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    private DayOfWeek getBirthDayDayOfTheWeek(LocalDate birthDate){
        return birthDate.getDayOfWeek();
    }

    private int getBirthdayDayOfTheYear(LocalDate birthDate){
        return birthDate.getDayOfYear();
    }

}
