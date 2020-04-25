package homework1.observer;

public class Thermometer extends MyObservable {
    private final int id;
    private Double temperature = 0.0;

    public Thermometer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thermometer that = (Thermometer) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
