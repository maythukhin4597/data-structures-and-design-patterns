package behavioral.iterator.headfirst.afterv2;

import java.util.Calendar;
import java.util.Iterator;

public class AlternateMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position;

    public AlternateMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        Calendar now = Calendar.getInstance();
        position = now.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position = position + 2;
        return menuItem;
    }
}
