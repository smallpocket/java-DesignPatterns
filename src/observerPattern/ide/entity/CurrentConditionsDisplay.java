package observerPattern.ide.entity;


import observerPattern.ide.service.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author : Hyper
 * @Time : 2018/10/10 23:32
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;

    private float temperature;

    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("temperature:" + this.temperature + "humidity:" + humidity);
    }
}
