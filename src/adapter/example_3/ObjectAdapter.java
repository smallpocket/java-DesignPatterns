package adapter.example_3;

import adapter.example_2.Adaptee;
import adapter.example_2.Target;

/**
 * @Author : yangfan
 * @Date : 2019/7/16 15:22
 * @Description :
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
