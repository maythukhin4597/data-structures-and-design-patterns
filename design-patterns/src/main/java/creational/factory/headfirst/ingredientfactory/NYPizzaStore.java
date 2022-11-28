package creational.factory.headfirst.ingredientfactory;

import creational.factory.headfirst.ingredientfactory.pizzas.CheesePizza;
import creational.factory.headfirst.ingredientfactory.pizzas.ClamPizza;
import creational.factory.headfirst.ingredientfactory.pizzas.Pizza;
import creational.factory.headfirst.ingredientfactory.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        IngredientFactory ingredientFactory = new NyIngredientFactory();
        switch (type.toLowerCase()) {
            case "cheese":
                return new CheesePizza(ingredientFactory);
            case "clam":
                return new ClamPizza(ingredientFactory);
            case "veggie":
                return new VeggiePizza(ingredientFactory);
            default:
                return null;
        }
    }
}
