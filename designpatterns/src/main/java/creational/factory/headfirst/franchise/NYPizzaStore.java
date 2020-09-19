package creational.factory.headfirst.franchise;

import creational.factory.headfirst.franchise.pizzas.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                return new PlainPizza();
        }
    }
}
