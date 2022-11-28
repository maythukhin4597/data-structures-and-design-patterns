package creational.factory.headfirst.ingredientfactory.pizzas;

import creational.factory.headfirst.ingredientfactory.IngredientFactory;

public class VeggiePizza extends Pizza {
    IngredientFactory ingredientFactory;

    public VeggiePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = ingredientFactory.getName() + " Veggie Pizza";
    }

    @Override
    public void prepare() {
        name = "Veggie Pizza";
        dough = this.ingredientFactory.createDough();
        sauce = this.ingredientFactory.createSauce();
        veggies = this.ingredientFactory.createVeggie();
    }
}
