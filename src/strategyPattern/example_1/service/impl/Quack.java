package strategyPattern.example_1.service.impl;

import strategyPattern.example_1.service.QuackBehavior;

/**
 * @Author : Hyper
 * @Time : 2018/10/8 19:50
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack.class");
    }
}
