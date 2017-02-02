package Resource;

import Converter.JsonCountry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Usuario on 31/01/2017.
 */

@Path("/")
@Produces("application/json")
public interface WeatherInterface {

    @GET
    @Produces("application/json")
    @Path("country/get/all")
    public JsonCountry getCountryFromJson();

}
