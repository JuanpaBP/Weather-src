import Domain.Weather;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Usuario on 19/01/2017.
 */
public class testWeather {

    @Test
    public void testWeatherTemp(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals(20, w.getTemperature());
    }

    @Test
    public void testWeatherMaxTemp(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals(23, w.getMaxTemperature());
    }

    @Test
    public void testWeatherMinTemp(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals(18, w.getMinTemperature());
    }

    @Test
    public void testWeatherDesc(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals("Soleado", w.getDescription());
    }

    @Test
    public void testWeatherWSpeed(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals(17, w.getwSpeed());
    }

    @Test
    public void testWeatherWDirection(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals("Norte", w.getwDirection());
    }

    @Test
    public void testWeatherAHumidity(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals(19, w.getaHumidity());
    }

    @Test
    public void testWeatherAPressure(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals(15, w.getaPressure());
    }

    @Test
    public void testWeatherAVisibility(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals("Alta", w.getaVisibility());
    }
}
