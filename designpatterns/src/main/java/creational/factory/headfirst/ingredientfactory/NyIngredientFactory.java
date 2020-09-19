package creational.factory.headfirst.ingredientfactory;

import creational.factory.headfirst.ingredientfactory.ingredient.cheese.Cheese;
import creational.factory.headfirst.ingredientfactory.ingredient.cheese.ReggianoCheese;
import creational.factory.headfirst.ingredientfactory.ingredient.clam.Clam;
import creational.factory.headfirst.ingredientfactory.ingredient.clam.FreshClam;
import creational.factory.headfirst.ingredientfactory.ingredient.dough.Dough;
import creational.factory.headfirst.ingredientfactory.ingredient.dough.ThinCrustDough;
import creational.factory.headfirst.ingredientfactory.ingredient.sauce.MarinaraSauce;
import creational.factory.headfirst.ingredientfactory.ingredient.sauce.Sauce;
import creational.factory.headfirst.ingredientfactory.ingredient.veggie.*;

import java.util.Arrays;
import java.util.List;

public class NyIngredientFactory extends IngredientFactory {

    @Override
    public String getName() {
        return "NYStyle";
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggie> createVeggie() {
        return Arrays.asList(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
