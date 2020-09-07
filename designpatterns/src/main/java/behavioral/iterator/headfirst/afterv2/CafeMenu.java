package behavioral.iterator.headfirst.afterv2;

import lombok.Getter;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    @Getter
    String name;

    Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new Hashtable();
        addItem("Vegetarian BLT",
                " (Fakin’)Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
