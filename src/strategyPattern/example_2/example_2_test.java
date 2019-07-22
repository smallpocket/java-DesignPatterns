package strategyPattern.example_2;

/**
 * @Author : yangfan
 * @Date : 2019/7/17 13:22
 * @Description :
 */
public class example_2_test {
    public static void main(String[] args) {
        MovieTicketContext context = new MovieTicketContext();
        DiscountStrategy strategy = new StudentDiscountStrategy();
        context.setDiscount(strategy);
        context.setPrice(20);
        System.out.println(context.getPrice());
        strategy = new ChildrenDiscountStrategy();
        context.setDiscount(strategy);
        System.out.println(context.getPrice());

    }
}
