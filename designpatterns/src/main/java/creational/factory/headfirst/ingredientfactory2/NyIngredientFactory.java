package creational.factory.headfirst.ingredientfactory2;

import creational.factory.headfirst.ingredientfactory2.ingredient.cheese.Cheese;
import creational.factory.headfirst.ingredientfactory2.ingredient.cheese.ReggianoCheese;
import creational.factory.headfirst.ingredientfactory2.ingredient.clam.Clam;
import creational.factory.headfirst.ingredientfactory2.ingredient.clam.FreshClam;
import creational.factory.headfirst.ingredientfactory2.ingredient.dough.Dough;
import creational.factory.headfirst.ingredientfactory2.ingredient.dough.ThinCrustDough;
import creational.factory.headfirst.ingredientfactory2.ingredient.sauce.MarinaraSauce;
import creational.factory.headfirst.ingredientfactory2.ingredient.sauce.Sauce;
import creational.factory.headfirst.ingredientfactory2.ingredient.veggie.*;

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
