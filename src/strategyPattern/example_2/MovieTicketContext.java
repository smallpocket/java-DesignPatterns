package strategyPattern.example_2;

/**
 * @Author : yangfan
 * @Date : 2019/7/17 13:18
 * @Description :
 */
public class MovieTicketContext {
    private double price;
    private DiscountStrategy discount; //维持一个对抽象折扣类的引用

    public void setPrice(double price) {
        this.price = price;
    }

    //注入一个折扣类对象
    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public double getPrice() {
        //调用折扣类的折扣价计算方法
        return discount.calculate(this.price);
    }
}

