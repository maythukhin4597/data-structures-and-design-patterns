package behavioral.observer.headfirst.before;

public class CurrentDisplay implements Display {
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
