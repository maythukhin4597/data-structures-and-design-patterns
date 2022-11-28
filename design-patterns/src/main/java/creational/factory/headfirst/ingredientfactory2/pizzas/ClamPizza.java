package creational.factory.headfirst.ingredientfactory2.pizzas;

import creational.factory.headfirst.ingredientfactory2.IngredientFactory;

public class ClamPizza extends Pizza {

    public ClamPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = ingredientFactory.getName()+" Clam Pizza";
    }

}
