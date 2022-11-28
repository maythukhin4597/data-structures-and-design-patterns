package behavioral.iterator.headfirst.after;

import java.util.Arrays;
import java.util.Iterator;

//encapsulate what varies , encapsulate object creation to another class
public class DinerIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems != null && menuItems.length > position;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        MenuItem menuItem = menuItems[position];
        menuItems = (MenuItem[]) Arrays.stream(menuItems).filter(menuItem::equals).toArray();
    }
}
