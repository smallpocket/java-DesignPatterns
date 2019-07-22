package strategyPattern.example_1.test;

import strategyPattern.example_1.entity.Duck;
import strategyPattern.example_1.entity.MarrardDuck;

/**
 * @Author : Hyper
 * @Time : 2018/10/8 20:00
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Duck duck = new MarrardDuck();
        duck.performFly();
        duck.performQuack();
    }
}
