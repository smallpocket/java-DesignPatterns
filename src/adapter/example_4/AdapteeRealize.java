package adapter.example_4;

/**
 * @Author : yangfan
 * @Date : 2019/7/16 19:03
 * @Description :
 */
public class AdapteeRealize implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
