package creational.factory.headfirst.ingredientfactory;

import creational.factory.headfirst.ingredientfactory.ingredient.cheese.Cheese;
import creational.factory.headfirst.ingredientfactory.ingredient.clam.Clam;
import creational.factory.headfirst.ingredientfactory.ingredient.dough.Dough;
import creational.factory.headfirst.ingredientfactory.ingredient.sauce.Sauce;
import creational.factory.headfirst.ingredientfactory.ingredient.veggie.Veggie;

import java.util.List;

public abstract class IngredientFactory {
    public abstract String getName();

    public abstract Dough createDough();

    public abstract Sauce createSauce();

    public abstract Cheese createCheese();

    public abstract List<Veggie> createVeggie();

    public abstract Clam createClam();
}
