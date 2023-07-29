package lesson11Currencies;

import java.text.DecimalFormat;

public class CurrencyFormatter {

    public static double format(double rate){
        DecimalFormat FORMAT = new DecimalFormat("0.00");
        return Double.parseDouble(FORMAT.format(rate));
    }

}
