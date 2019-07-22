package command;

/**
 * @author Heper
 * @title Command 命令接口
 * @date 2019/4/19 15:33
 */
public interface Command {
    public void execute();

    public void undo();

}
