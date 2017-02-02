package Proxy;

import Adapter.UnitConverter;
import Domain.Country;
import Domain.Weather;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 26/01/2017.
 */
@Resource
interface WeatherInterface{}

@Component
public class DaoProxys {
    @Autowired
    UnitConverter unitConverter;

    public List<Country> getCountryFromJson()throws IOException{
        List<Country> countryList = new ArrayList();
        Country C = new Country();
        return null;

        /*ObjectMapper mapper = new ObjectMapper();
        Country c = mapper.readValue(new URL("http://services.groupkt.com/country/get/all"), Country.class);
        return c;*/

    }

    public void getStateFromJson(){


    }

    public Weather getWeatherFromJson(String json)throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        Weather w = mapper.readValue(json, Weather.class);
        unitConverter.farenheitToCelsius(w);
        return w;
    }


}
