package behavioral.observer.headfirst.pullobserver;

import java.util.Observable;

public class WeatherData extends Observable {
    float temp;
    float humidity;
    float pressure;

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
