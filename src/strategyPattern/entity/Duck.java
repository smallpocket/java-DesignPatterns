package strategyPattern.entity;

import strategyPattern.service.FlyBehavior;
import strategyPattern.service.QuackBehavior;

/**
 * @Author : Hyper
 * @Time : 2018/10/8 19:17
 */
public abstract class Duck {
    /**
     * 声明两个行为为接口类型
     * 每一个鸭子都会引用实现该接口的对象
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * 这些行为不是由Duck本身进行实现的,而是转交给了对应的接口引用的对象
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 动态地设定鸭子的行为
     *
     * @param fb
     */
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    /**
     * 较差的方法:呱呱叫
     * 需要通过继承@Override重写
     */
    public void quack() {
    }

    /**
     * 游泳
     */
    public void swim() {
    }

}
