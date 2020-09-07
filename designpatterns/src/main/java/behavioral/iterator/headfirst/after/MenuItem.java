package behavioral.iterator.headfirst.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
}
