package strategyPattern.example_1.service.impl;

import strategyPattern.example_1.service.FlyBehavior;

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
