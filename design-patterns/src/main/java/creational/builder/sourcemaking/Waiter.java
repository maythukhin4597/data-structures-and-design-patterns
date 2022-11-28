package creational.builder.sourcemaking;

public class Waiter {
    private AbstractPizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(AbstractPizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
