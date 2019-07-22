package strategyPattern.example_2;

/**
 * @Author : yangfan
 * @Date : 2019/7/17 13:20
 * @Description :
 */
public class StudentDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}
