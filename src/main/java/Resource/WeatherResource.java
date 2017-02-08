package Resource;


import DataAccess.DAOCountry;
import DataAccess.DAOWeather;
import Domain.Country;
import Domain.Weather;
import Proxy.DaoProxys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.*;
import java.io.IOException;




@Component
@Path("/weatherResource") // url final de prueba: /weatherResource/echo/XXX
public class WeatherResource {




    //Cada endpoint es cada url variable desde la root.
    @GET
    @Path("/echo/{input}")
    @Produces("text/plain")
    public String echo(@PathParam("input") String input){    //Toma el parametro de la url que tenga por key "input"
        return input;
    }



    /*@POST
    @Path("/LoadWeather/{input}")
    @Produces("text/plain")
    @Consumes("application/json")
    public String DBStore(@RequestBody String json)throws IOException{
        DAOWeather daoWeather = new DAOWeather();
        Weather w;
        w = DP.getWeatherFromJson(json);
        daoWeather.insertWeather(w);
        return w.toString();
        //return DP.getDaoWeather(json);

    }*/

    @POST
    @Path("/LoadCountry")
    @Produces("text/plain")
    //@Consumes("application/json")
    public String countryLoader()throws IOException{
        DAOCountry daoCountry = new DAOCountry();
        Country c=null;
        // c = DP.getCountryFromJson();
        //daoCountry.insertCountry(c);
        return c.toString();

    }

}
