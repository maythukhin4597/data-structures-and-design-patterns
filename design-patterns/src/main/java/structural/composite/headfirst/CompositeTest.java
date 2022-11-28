package structural.composite.headfirst;

public class CompositeTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new MenuComposite("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new MenuComposite("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new MenuComposite("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new MenuComposite("DESSERT MENU", "Dessert of course !");
        MenuComponent allMenus =
                new MenuComposite("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
// add menu items here
        dinerMenu.add(new MenuItemleaf(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItemleaf(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));
// add more menu items here
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
