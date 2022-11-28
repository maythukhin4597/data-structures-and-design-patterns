package creational.factory.headfirst.franchise;

import creational.factory.headfirst.franchise.pizzas.ChicagoStyleCheesePizza;
import creational.factory.headfirst.franchise.pizzas.ChicagoStyleClamPizza;
import creational.factory.headfirst.franchise.pizzas.ChicagoStyleVeggiePizza;
import creational.factory.headfirst.franchise.pizzas.Pizza;
import creational.factory.headfirst.franchise.pizzas.PlainPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                return new PlainPizza();
        }
    }
}
