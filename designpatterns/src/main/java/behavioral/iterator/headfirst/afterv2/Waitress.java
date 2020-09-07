package behavioral.iterator.headfirst.afterv2;

import java.util.Iterator;

// violate open close principle , waitress class has to open again when new menu is added
public class Waitress {
    Menu dinerMenu;
    Menu pancakeMenu;
    Menu cafeMenu;

    public Waitress(Menu dinerMenu, Menu pancakeMenu, Menu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeMenu = pancakeMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nCafe");
        printMenu(cafeIterator);
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
