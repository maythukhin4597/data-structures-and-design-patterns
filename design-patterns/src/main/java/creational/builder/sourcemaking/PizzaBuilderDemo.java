package creational.builder.sourcemaking;

public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        AbstractPizzaBuilder hawaiianPizzabuilder = new HawaiiPizza();
        AbstractPizzaBuilder spicyPizzaBuilder = new SpicyPizza();

        waiter.setPizzaBuilder(hawaiianPizzabuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}
