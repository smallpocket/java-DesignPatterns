package strategyPattern.example_1.test;

import strategyPattern.example_1.entity.Duck;
import strategyPattern.example_1.entity.ModuleDuck;
import strategyPattern.example_1.service.impl.FlyRocketPowered;

/**
 * 动态地改变鸭子的飞行模式
 *
 * @Author : Hyper
 * @Time : 2018/10/8 20:09
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new ModuleDuck();
        duck.performQuack();
        duck.performFly();
        //升级这鸭子,让他来点花样飞行
        duck.setFlyBehavior(new FlyRocketPowered());
        //它变强了
        duck.performFly();
    }
}
