package command;

/**
 * @author Heper
 * @title 客户端
 * @date 2019/4/19 15:38
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //遥控器，作为命令的调用者
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        //创建请求的接受者
        Light light = new Light();
        //创建命令
        LightCommand lightCommand = new LightCommand(light);
        //命令传递给调用者
        simpleRemoteControl.setCommand(lightCommand);
        //调用者执行
        simpleRemoteControl.buttonWasPressed();
    }
}
