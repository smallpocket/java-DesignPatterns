package observerPattern.head.service.impl;

import observerPattern.head.service.DisplayElement;
import observerPattern.head.service.Observer;
import observerPattern.head.service.Subject;

/**
 * @Author : Hyper
 * @Time : 2018/10/9 19:07
 */
public class AnOtherDisplay implements DisplayElement, Observer {

    private float temperature;

    private float humidity;
    /**
     * 一对多的关系,有一个主题
     */
    private Subject subject;

    public AnOtherDisplay(WeatherData weatherData) {
        this.subject = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature:" + this.temperature + "humidity:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
