package observerPattern.head.service.impl;

import observerPattern.head.service.Observer;
import observerPattern.head.service.Subject;

import java.util.ArrayList;

/**
 * 主题的实现类
 *
 * @Author : Hyper
 * @Time : 2018/10/9 11:28
 */
public class WeatherData implements Subject {
    /**
     * 主题与通知者是一对多的关系,有多个通知者
     */
    private ArrayList<Observer> observerArrayList;

    private float temperature;

    private float humidity;

    private float pressure;

    /**
     * 构造器,将注册者实例化,引用到实际的变量
     */
    public WeatherData() {
        this.observerArrayList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observerArrayList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerArrayList.remove(o);
    }


    @Override
    public void notifyObservers() {
        //通知所有的注册者
        for (int i = 0; i < observerArrayList.size(); i++) {
            Observer observer = observerArrayList.get(i);
            //更新
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当数据更新的时候,通知观察者
     */
    public void measurementsChanged() {
        this.notifyObservers();
    }

    /**
     * 从气象台获取数据更新,并进行通知
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
