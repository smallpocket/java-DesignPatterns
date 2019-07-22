package command;

/**
 * @author Heper
 * @title 调用者 Invoker
 * @date 2019/4/19 15:36
 */
public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command com) {
        this.command = com;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
