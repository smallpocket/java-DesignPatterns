package adapter.example_4;

/**
 * @Author : yangfan
 * @Date : 2019/7/16 18:58
 * @Description :
 */
public class TargetRealize implements TwoWayTarget {
    @Override
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
