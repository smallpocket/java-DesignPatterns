package adapter.example_3;

import adapter.example_2.Adaptee;
import adapter.example_2.Target;

/**
 * @Author : yangfan
 * @Date : 2019/7/16 15:24
 * @Description :
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}