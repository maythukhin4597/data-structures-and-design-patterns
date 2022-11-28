package behavioral.iterator.headfirst.afterv2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenu implements Menu {
    @Getter
    String name;
    ArrayList<MenuItem> menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K & B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public void removeItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
