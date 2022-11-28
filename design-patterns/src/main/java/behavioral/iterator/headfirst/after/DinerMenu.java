package behavioral.iterator.headfirst.after;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 4;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                " (Fakin’)Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
// a couple of other Diner Menu items added here
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full !Can’t add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public void removeItem(MenuItem menuItem) {
        menuItems = removeFromArray(menuItems, menuItem);
    }

    private MenuItem[] removeFromArray(MenuItem[] menuItems, MenuItem menuItem) {
        return (MenuItem[]) Arrays.stream(menuItems).filter(menuItem::equals).toArray();
    }

    public Iterator createIterator() {
        return new DinerIterator(menuItems);
    }
}
