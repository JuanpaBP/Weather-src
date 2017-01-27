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
        assertEquals(20, w.getTemp());
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
        assertEquals(17, w.getSpeed());
    }

    @Test
    public void testWeatherWDirection(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals("Norte", w.getDirection());
    }

    @Test
    public void testWeatherAHumidity(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals(19, w.getaHumidity());
    }

    @Test
    public void testWeatherAPressure(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals(15, w.getPressure());
    }

    @Test
    public void testWeatherAVisibility(){
        Weather w  = new Weather(20, 23, 18, "Soleado", 17, "Norte", 19, 15, "Alta");
        assertEquals("Alta", w.getText());
    }
}
