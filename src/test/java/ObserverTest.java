import homework1.observer.Monitor;
import homework1.observer.Thermometer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {


    @Test
    public void testUpdate(){
        Thermometer thermometer1 = new Thermometer(1);
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
        thermometer1.addObserver(monitor1);
        thermometer1.addObserver(monitor2);
        thermometer1.setTemperature(30.0);
        assertEquals(30.0, monitor1.getTemperature(1));
        assertEquals(30.0, monitor2.getTemperature(1));
        thermometer1.setTemperature(20.0);
        assertEquals(20.0, monitor1.getTemperature(1));
        assertEquals(20.0, monitor2.getTemperature(1));
    }
}
