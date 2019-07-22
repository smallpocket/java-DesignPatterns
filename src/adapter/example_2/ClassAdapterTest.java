package adapter.example_2;

/**
 * @Author : yangfan
 * @Date : 2019/7/16 15:06
 * @Description :
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}


