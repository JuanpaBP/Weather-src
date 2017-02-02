package Converter;

import Domain.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 01/02/2017.
 */
public class JsonCountry {

    public class CountryArray{
        private List<Country> C = new ArrayList<Country>();

        public List<Country> getC() {
            return C;
        }

        public void setC(List<Country> c) {
            C = c;
        }
    }
}
