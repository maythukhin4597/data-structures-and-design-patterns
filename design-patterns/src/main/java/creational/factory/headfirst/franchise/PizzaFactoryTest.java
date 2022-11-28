package creational.factory.headfirst.franchise;


import creational.factory.headfirst.franchise.pizzas.Pizza;

public class PizzaFactoryTest {
    public static void main(String[] args) {
        PizzaStore store = new ChicagoPizzaStore();

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
