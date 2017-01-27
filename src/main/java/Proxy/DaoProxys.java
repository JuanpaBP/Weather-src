package Proxy;

import Domain.Weather;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by Usuario on 26/01/2017.
 */
public class DaoProxys {

    public void getCountryFromJson(){


    }

    public void getStateFromJson(){


    }

    public Weather getWeatherFromJson(String json)throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        Weather w = mapper.readValue(json, Weather.class);
        return w;
    }
}
