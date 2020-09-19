package creational.factory.headfirst.franchise.pizzas;

public class PlainPizza extends Pizza {
    public PlainPizza() {
        name = "Plain Pizza";
        dough = "Normal crust";
        sauce = "Tomato sauce";
        toppings.add("cheese");
    }
}
