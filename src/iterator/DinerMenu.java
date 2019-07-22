package iterator;

/**
 * @author Heper
 * @title
 * @date 2019/4/20 14:48
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    //返回迭代器接口，客户只需要使用迭代器遍历即可
    public Iterator createIterator() {
        return new MenuIterator(menuItems);
    }
}
