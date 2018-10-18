package observerPattern.head.service;

/**
 * @Author : Hyper
 * @Time : 2018/10/9 10:35
 */
public interface Observer {
    /**
     * 获取主题的数据
     * 相对较为欠缺,因为将数据是锁死在里面了,如果数据域进行更新,同样还是要对这个进行更新
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
