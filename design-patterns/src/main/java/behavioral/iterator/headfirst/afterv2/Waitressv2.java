package behavioral.iterator.headfirst.afterv2;

import java.util.Iterator;

public class Waitressv2 {
    Menu[] menus;

    public Waitressv2(Menu... menus) {
        this.menus = menus;
    }

    public void printMenu() {
        System.out.println("MENU\n-------");
        for (Menu menu : menus) {
            Iterator menuIterator = menu.createIterator();
            System.out.println("\n" +menu.getClass().getSimpleName());
            printMenu(menuIterator);
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
