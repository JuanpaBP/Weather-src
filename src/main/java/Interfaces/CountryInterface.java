package Interfaces;

import Converter.CountryArray;
import Converter.JsonCountry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Usuario on 01/02/2017.
 */
    @Path("/")
    @Produces("application/json")
    public interface CountryInterface {

        @GET
        @Produces("application/json")
        @Path("country/get/all")
        public CountryArray getCountryFromJson();

    }

