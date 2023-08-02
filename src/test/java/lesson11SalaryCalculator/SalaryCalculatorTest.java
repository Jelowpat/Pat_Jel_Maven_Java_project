package lesson11SalaryCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.mockito.Mockito;


class SalaryCalculatorTest {

    @ParameterizedTest(name = "veryfying sallary is {2}, when saturday houers is {0} and one time bonus equals {1}")
    @CsvSource(value = {"32:500:4116.33"}, delimiter = ':')
    public void shouldCalculateSalary(double saturdayHours, double oneTimeBonus, double expected ){
        //given
        BasicSalary basicSalary = Mockito.mock(BasicSalary.class);
        Mockito.when(basicSalary.getBasicSalary()).thenReturn(2000.33);

        SaturdayRate saturdayRate = Mockito.mock(SaturdayRate.class);
        Mockito.when(saturdayRate.getSaturdayRate()).thenReturn(50.50);

        SalaryCalculator salaryCalculator = new SalaryCalculator(basicSalary, saturdayRate);

        //when
        double result = salaryCalculator.calculate(saturdayHours, oneTimeBonus);

        //then
        Assertions.assertEquals(expected, result);

    }

}