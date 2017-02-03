import Domain.Country;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Usuario on 18/01/2017.
 */
public class testCountry {

    @Test
    public void testCountryId(){
        Country C = new Country(01,"ARG","AR","ARG");
        assertEquals(01,C.getId_country());
    }

    @Test
    public void testCountryName(){
        Country C = new Country(01,"ARGENTINA","AR","ARG");
        assertEquals("ARGENTINA", C.getName());
    }

    @Test
    public void testCountryAlpha2(){
        Country C = new Country(01,"ARGENTINA", "AR", "ARG");
        assertEquals("AR", C.getAlpha2());
    }

    @Test
    public void testCountryAlpha3(){
        Country C = new Country(01,"ARGENTINA", "AR", "ARG");
        assertEquals("ARG", C.getAlpha3());
    }

}
