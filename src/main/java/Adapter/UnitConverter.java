package Adapter;

import Domain.Weather;

/**
 * Created by Usuario on 31/01/2017.
 */
public class UnitConverter {

    public Weather farenheitToCelsius(Weather w){

        float temp = w.getTemp();
        temp = (temp - 32)*5/9;
        w.setTemp(temp);
        return w;
    }
}
