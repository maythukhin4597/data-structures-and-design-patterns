package behavioral.observer.headfirst.before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    CurrentDisplay currentDisplay = new CurrentDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();

    public void measurementChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
        currentDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}
