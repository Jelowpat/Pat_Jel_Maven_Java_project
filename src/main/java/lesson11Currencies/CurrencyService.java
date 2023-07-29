package lesson11Currencies;

public interface CurrencyService {
    double getSellRate(Currency currency);
    double getBuyRate(Currency currency);
}
