package behavioral.observer.headfirst.pushobserver;

public class CurrentDisplay implements Observer, DisplayElement {

    Subject subject;

    public CurrentDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public float temp;
    public float humidity;
    public float pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

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
}
