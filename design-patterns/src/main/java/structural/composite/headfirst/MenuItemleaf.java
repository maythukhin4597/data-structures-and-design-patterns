package structural.composite.headfirst;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MenuItemleaf extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print(" (v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("-- " + getDescription());
    }
}
