package creational.factory.headfirst.SimplePizzaFactory;

import creational.factory.headfirst.SimplePizzaFactory.pizzas.*;

public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "cheese":
                return new CheesePizza();
            case "clam":
                return new ClamPizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                return new PlainPizza();
        }
    }
}
