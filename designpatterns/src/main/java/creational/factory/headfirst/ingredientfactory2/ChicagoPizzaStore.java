package creational.factory.headfirst.ingredientfactory2;

import creational.factory.headfirst.ingredientfactory2.pizzas.CheesePizza;
import creational.factory.headfirst.ingredientfactory2.pizzas.ClamPizza;
import creational.factory.headfirst.ingredientfactory2.pizzas.Pizza;
import creational.factory.headfirst.ingredientfactory2.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        IngredientFactory ingredientFactory = new ChicagoIngredientFactory();
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
