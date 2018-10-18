package observerPattern.head.test;

import observerPattern.head.service.impl.AnOtherDisplay;
import observerPattern.head.service.impl.CurrentConditionsDisplay;
import observerPattern.head.service.impl.WeatherData;

/**
 * 一个测试的类
 *
 * @Author : Hyper
 * @Time : 2018/10/9 11:48
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //添加两个公告板,将他们都注册到主题上
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        AnOtherDisplay anOtherDisplay = new AnOtherDisplay(weatherData);
        //走一手更新主题,然后会发现,状态被更改到了观察者
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(60, 45, 20.4f);
        weatherData.setMeasurements(40, 25, 10.4f);
    }
}
