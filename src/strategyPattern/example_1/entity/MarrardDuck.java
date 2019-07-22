package strategyPattern.example_1.entity;

import strategyPattern.example_1.service.impl.FlyWithWings;
import strategyPattern.example_1.service.impl.Quack;

/**
 * 整合接口的实例变量到具体的Duck中
 *
 * @Author : Hyper
 * @Time : 2018/10/8 19:38
 */
public class MarrardDuck extends Duck {

    /**
     * 在实例化的时候更改接口的对象,使得所有的对象都是这样的一个引用对象
     * 在该类使用飞行的时候,就会调用FlyWithWings的对象
     * 因为它引用的对象是FlyWithWings的实体
     */
    public MarrardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
