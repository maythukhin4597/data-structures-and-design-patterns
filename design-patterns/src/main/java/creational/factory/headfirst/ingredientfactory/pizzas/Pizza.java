package creational.factory.headfirst.ingredientfactory.pizzas;

import creational.factory.headfirst.ingredientfactory.ingredient.cheese.Cheese;
import creational.factory.headfirst.ingredientfactory.ingredient.clam.Clam;
import creational.factory.headfirst.ingredientfactory.ingredient.dough.Dough;
import creational.factory.headfirst.ingredientfactory.ingredient.sauce.Sauce;
import creational.factory.headfirst.ingredientfactory.ingredient.veggie.Veggie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    List<Veggie> veggies = new ArrayList<>();
    Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            List<String> veggieList = veggies.stream().map(Veggie::toString).collect(Collectors.toList());
            String veggieResult = String.join(",", veggieList);
            result.append(veggieResult + "\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        return result.toString();
    }
}
