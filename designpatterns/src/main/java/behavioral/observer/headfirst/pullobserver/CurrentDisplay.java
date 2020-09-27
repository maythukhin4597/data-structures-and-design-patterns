package behavioral.observer.headfirst.pullobserver;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer, DisplayElement {

    Observable observer;

    public CurrentDisplay(Observable observable) {
        this.observer = observable;
        observable.addObserver(this);
    }

    public float temp;
    public float humidity;
    public float pressure;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp
                + "F degrees and " + humidity + "% humidity");
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
        }
        display();
    }
}
