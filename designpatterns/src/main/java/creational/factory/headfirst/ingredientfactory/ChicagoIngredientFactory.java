package creational.factory.headfirst.ingredientfactory;

import creational.factory.headfirst.ingredientfactory.ingredient.cheese.Cheese;
import creational.factory.headfirst.ingredientfactory.ingredient.cheese.ParmesanCheese;
import creational.factory.headfirst.ingredientfactory.ingredient.clam.Clam;
import creational.factory.headfirst.ingredientfactory.ingredient.clam.FreshClam;
import creational.factory.headfirst.ingredientfactory.ingredient.dough.Dough;
import creational.factory.headfirst.ingredientfactory.ingredient.dough.NormalCrust;
import creational.factory.headfirst.ingredientfactory.ingredient.sauce.MarinaraSauce;
import creational.factory.headfirst.ingredientfactory.ingredient.sauce.Sauce;
import creational.factory.headfirst.ingredientfactory.ingredient.veggie.*;

import java.util.Arrays;
import java.util.List;

public class ChicagoIngredientFactory extends IngredientFactory {

    @Override
    public String getName() {
        return "ChicagoStyle";
    }

    @Override
    public Dough createDough() {
        return new NormalCrust();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
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
