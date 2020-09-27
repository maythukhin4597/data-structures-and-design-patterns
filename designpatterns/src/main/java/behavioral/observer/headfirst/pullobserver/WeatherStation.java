package behavioral.observer.headfirst.pullobserver;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.setMeasurement(82, 70, 29.2f);
        weatherData.setMeasurement(78, 90, 29.2f);
    }
}
