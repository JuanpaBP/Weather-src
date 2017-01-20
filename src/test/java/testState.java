import Domain.Country1;
import Domain.State1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Usuario on 19/01/2017.
 */
public class testState {
    @Test
    public void testStateName(){
        State1 s = new State1("Córdoba", "Cba", 165321, "Córdoba", "Córdoba");
        assertEquals("Córdoba", s.getName());
    }

    @Test
    public void testStateAbbr(){
        State1 s = new State1("Córdoba", "Cba", 165321, "Córdoba", "Córdoba");
        assertEquals("Cba", s.getName());
    }

    @Test
    public void testStateArea(){
        State1 s = new State1("Córdoba", "Cba", 165321, "Córdoba", "Córdoba");
        assertEquals("Cba", s.getArea());
    }

    @Test
    public void testStateLargestCity(){
        State1 s = new State1("Córdoba", "Cba", 165321, "Córdoba", "Córdoba");
        assertEquals("Cba", s.getLargest_city());
    }

    @Test
    public void testStateCapital(){
        State1 s = new State1("Córdoba", "Cba", 165321, "Córdoba", "Córdoba");
        assertEquals("Cba", s.getCapital());
    }
}
