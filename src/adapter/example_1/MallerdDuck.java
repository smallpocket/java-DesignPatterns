package adapter.example_1;

/**
 * @author Heper
 * @title
 * @date 2019/4/19 17:13
 */
public class MallerdDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
