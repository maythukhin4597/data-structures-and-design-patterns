package creational.factory.headfirst.ingredientfactory2.pizzas;

import creational.factory.headfirst.ingredientfactory2.IngredientFactory;

public class VeggiePizza extends Pizza {

    public VeggiePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = ingredientFactory.getName() + " Veggie Pizza";
    }
}
