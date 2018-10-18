package observerPattern.head.service.impl;

import observerPattern.head.service.DisplayElement;
import observerPattern.head.service.Observer;
import observerPattern.head.service.Subject;

/**
 * 公告板的实现
 *
 * @Author : Hyper
 * @Time : 2018/10/9 11:36
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;
    /**
     * 一对多的关系,有一个主题
     */
    private Subject subject;

    /**
     * 构造类的时候,便将其注册到主题上
     *
     * @param weatherData
     */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.subject = weatherData;
        //注册到主题上
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature+10:" + this.temperature + "humidity+20:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp + 10;
        this.humidity = humidity + 20;
        display();
    }
}
