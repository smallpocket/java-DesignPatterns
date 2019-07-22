package command;

/**
 * 定义了动作与接收者之间的绑定关系
 *
 * @author Heper
 * @title
 * @date 2019/4/19 15:34
 */
public class LightCommand implements Command {

    Light light;

    //传入实体，以让命令进行控制
    public LightCommand(Light light) {
        this.light = light;
    }

    //发出请求，执行动作
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
