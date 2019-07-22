package iterator;

/**
 * @author Heper
 * @title
 * @date 2019/4/20 14:45
 */
public class MenuIterator implements Iterator {
    MenuItem[] items;
    //标记目前遍历到达的位置
    int position;

    public MenuIterator(MenuItem[] menuItem) {
        this.items = menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
