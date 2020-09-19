package creational.factory.headfirst.ingredientfactory.pizzas;

import creational.factory.headfirst.ingredientfactory.IngredientFactory;

public class CheesePizza extends Pizza {
    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = ingredientFactory.getName()+" Cheese Pizza";
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggie();
    }
}
