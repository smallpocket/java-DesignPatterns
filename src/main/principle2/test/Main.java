package main.principle2.test;

import main.principle2.entity.Duck;
import main.principle2.entity.MarrardDuck;

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
