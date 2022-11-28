package behavioral.iterator.headfirst.after;

import java.util.Iterator;
import java.util.List;

public class PancakeIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeIterator(List<MenuItem> menuItemms) {
        this.menuItems = menuItemms;
    }

    @Override
    public boolean hasNext() {
        return !menuItems.isEmpty() && menuItems.size() > position;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        menuItems.remove(position);
    }
}
