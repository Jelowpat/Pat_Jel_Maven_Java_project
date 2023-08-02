package lesson11Currencies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

class CurrenciesCalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"EUR:4:25", "USD:3.5:28.57", "GBP:5:20"}, delimiter = ':')
    void shouldExchangeWithBuyingRate(Currency currency, double rate, double expected) {
        //given
        CurrencyService currencyService = Mockito.mock(CurrencyService.class);
        Mockito.when(currencyService.getBuyRate(currency)).thenReturn(rate);
        CurrenciesCalculator currenciesCalculator = new CurrenciesCalculator(currencyService);

        //when
        double result = currenciesCalculator.exchangeWithBuyingRate(currency, 100);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"EUR:4.5:22.22", "USD:4:25", "GBP:5.5:18.18"}, delimiter = ':')
    void shouldExchangeWithSellingRate(Currency currency, double rate, double expected) {
        //given
        CurrencyService currencyService = Mockito.mock(CurrencyService.class);
        Mockito.when(currencyService.getSellRate(currency)).thenReturn(rate);
        CurrenciesCalculator currenciesCalculator = new CurrenciesCalculator(currencyService);

        //when
        double result = currenciesCalculator.exchangeWithSellingRate(currency, 100);

        //then
        Assertions.assertEquals(expected, result);
    }
}