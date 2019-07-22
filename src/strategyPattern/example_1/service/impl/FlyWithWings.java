package strategyPattern.example_1.service.impl;

import strategyPattern.example_1.service.FlyBehavior;

/**
 * 实现飞行的动作
 *
 * @Author : Hyper
 * @Time : 2018/10/8 19:41
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyWithWings.class");
    }
}
