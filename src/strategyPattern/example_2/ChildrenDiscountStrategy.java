package strategyPattern.example_2;

/**
 * @Author : yangfan
 * @Date : 2019/7/17 13:20
 * @Description :
 */
public class ChildrenDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }
}
