package strategyPattern.example_2;

/**
 * @Author : yangfan
 * @Date : 2019/7/17 13:20
 * @Description :
 */
public class VIPDiscountStragtegy implements DiscountStrategy {
    @Override
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}
