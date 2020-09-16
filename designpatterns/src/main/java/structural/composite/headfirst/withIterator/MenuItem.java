package structural.composite.headfirst.withIterator;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Iterator;

@AllArgsConstructor
@Getter
public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print(" (v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("-- " + getDescription());
    }

    public Iterator createIterator() {
       return new NullIteraotr();
    }
}
