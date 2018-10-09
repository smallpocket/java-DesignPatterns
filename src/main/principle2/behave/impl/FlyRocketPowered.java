package main.principle2.behave.impl;

import main.principle2.behave.FlyBehavior;

/**
 * 火箭动力
 *
 * @Author : Hyper
 * @Time : 2018/10/8 20:08
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered.class");
    }
}
