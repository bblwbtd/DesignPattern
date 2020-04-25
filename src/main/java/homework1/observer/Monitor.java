package homework1.observer;

import java.util.*;

public class Monitor implements MyObserver  {

    private final Map<Integer ,Double> temperatures = new HashMap<>();

    @Override
    public void update(Object object) {
        if (!(object instanceof Thermometer)) return;
        Thermometer thermometer = (Thermometer) object;
        temperatures.put(thermometer.getId(), thermometer.getTemperature());
    }

    public double getTemperature(int id){
        return temperatures.get(id);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "temperatures=" + temperatures +
                '}';
    }
}
