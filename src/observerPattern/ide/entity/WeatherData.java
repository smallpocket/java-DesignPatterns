package observerPattern.ide.entity;

import java.util.Observable;

/**
 * @Author : Hyper
 * @Time : 2018/10/10 23:30
 */
public class WeatherData extends Observable {
    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {

    }

    public void measurementsChanged() {
        this.setChanged();
        this.notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
