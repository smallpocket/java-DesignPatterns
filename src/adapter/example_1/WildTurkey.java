package adapter.example_1;

/**
 * @author Heper
 * @title
 * @date 2019/4/19 17:15
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Fly short time");
    }
}
