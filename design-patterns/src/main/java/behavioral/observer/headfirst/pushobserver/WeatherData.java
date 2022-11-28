package behavioral.observer.headfirst.pushobserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    static List<Observer> observers = new ArrayList<>();
    float temp;
    float humidity;
    float pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(ob -> ob.update(temp, humidity, pressure));
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
