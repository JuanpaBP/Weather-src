package Resource;


import DataAccess.DAOWeather;
import Domain.Weather;
import Proxy.DaoProxys;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.*;
import java.io.IOException;


@Component
@Path("/weatherResource") // url final de prueba: /weatherResource/echo/XXX
public class WeatherResource {
    DaoProxys DP = new DaoProxys();


    //Cada endpoint es cada url variable desde la root.
    @GET
    @Path("/echo/{input}")
    @Produces("text/plain")
    public String echo(@PathParam("input") String input){    //Toma el parametro de la url que tenga por key "input"
        return input;
    }
    /*@POST
    @Path("/DBStore/{input}")
    @ResponseBody
    @Produces("text/plain")
    @Consumes("application/json")
    public String DBStore(@RequestBody String json)throws IOException{
        DAOWeather daoWeather = new DAOWeather();
        DaoProxys DP = new DaoProxys();//Todo: Agregar manejo por spring
        Weather w = null;
        w = DP.getWeatherFromJson(json);
        daoWeather.insertWeather(w);
        return w.toString();
        //return DP.getDaoWeather(json);

    }*/

}
