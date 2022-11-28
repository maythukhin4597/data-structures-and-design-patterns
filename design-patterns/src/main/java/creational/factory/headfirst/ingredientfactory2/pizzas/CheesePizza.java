package creational.factory.headfirst.ingredientfactory2.pizzas;

import creational.factory.headfirst.ingredientfactory2.IngredientFactory;

public class CheesePizza extends Pizza {

    public CheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = ingredientFactory.getName()+" Cheese Pizza";
    }

}
