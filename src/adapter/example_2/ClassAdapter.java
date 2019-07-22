package adapter.example_2;

/**
 * @Author : yangfan
 * @Date : 2019/7/16 15:06
 * @Description :
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
