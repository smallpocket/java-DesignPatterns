package main.principle2.behave.impl;

import main.principle2.behave.QuackBehavior;

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
