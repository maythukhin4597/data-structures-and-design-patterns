package behavioral.iterator.headfirst.before;

import behavioral.iterator.headfirst.after.MenuItem;

import java.util.ArrayList;

public class PancakeMenu {
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

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
