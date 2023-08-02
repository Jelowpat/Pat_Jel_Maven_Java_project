package lesson11Currencies;

import java.text.DecimalFormat;

public class CurrenciesCalculator {

    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    private final CurrencyService currencyService;

    public CurrenciesCalculator(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    public double exchangeWithBuyingRate(Currency currency, double cash){
        return CurrencyFormatter.format(cash / currencyService.getBuyRate(currency));
    }

    public double exchangeWithSellingRate(Currency currency, double cash){
        return CurrencyFormatter.format(cash / currencyService.getSellRate(currency));
    }

}