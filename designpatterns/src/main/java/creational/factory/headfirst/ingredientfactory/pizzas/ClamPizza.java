package creational.factory.headfirst.ingredientfactory.pizzas;

import creational.factory.headfirst.ingredientfactory.IngredientFactory;

public class ClamPizza extends Pizza {
    IngredientFactory ingredientFactory;

    public ClamPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = ingredientFactory.getName()+" Clam Pizza";
    }

    @Override
    public void prepare() {
        clam = ingredientFactory.createClam();
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggie();
    }
}
