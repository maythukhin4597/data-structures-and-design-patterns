package behavioral.iterator.headfirst.afterv2;

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

        if (position <= 0) {
            throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < (menuItems.length - 1); i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
