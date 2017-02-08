package Proxy;

import Adapter.UnitConverter;
import Interfaces.CountryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;

/**
 * Created by Usuario on 26/01/2017.
 */


@Component
@Path("/WeatherResource")
public class DaoProxys  {
    @Autowired
    UnitConverter unitConverter;
    /*@Resource
    CountryInterface countries;*/

    @GET
    @Path("/Test")
    @Produces("text/plain")
    public String doSomething()throws IOException{
        return "asd";
    }




    /*public CountryArray getCountryFromJson()throws IOException{
        //List<Country> countryList = new ArrayList();
        //Country C = new Country();
        CountryArray countryArray = countries.getCountryFromJson();
        return countryArray;

        /*ObjectMapper mapper = new ObjectMapper();
        Country c = mapper.readValue(new URL("http://services.groupkt.com/country/get/all"), Country.class);
        return c;

    }

    public void getStateFromJson(){


    }

    public Weather getWeatherFromJson(String json)throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        Weather w = mapper.readValue(json, Weather.class);
        unitConverter.farenheitToCelsius(w);
        return w;
    }*/


}
