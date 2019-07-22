package strategyPattern.example_1.entity;

import strategyPattern.example_1.service.impl.FlyWithWings;
import strategyPattern.example_1.service.impl.Quack;

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
