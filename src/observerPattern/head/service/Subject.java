package observerPattern.head.service;

/**
 * 主题
 *
 * @Author : Hyper
 * @Time : 2018/10/9 10:35
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 删除观察者
     *
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 当主题改变时,调用方法,通知观察者
     * 通知是在主题当中实现的,而不是在观察者中进行获取
     */
    public void notifyObservers();
}
