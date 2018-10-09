package main.principle2.entity;

import main.principle2.behave.impl.FlyWithWings;
import main.principle2.behave.impl.Quack;

/**
 * @Author : Hyper
 * @Time : 2018/10/8 20:06
 */
public class ModuleDuck extends Duck {
    public ModuleDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
