package structural.decorator.headfirst.before;

public class StarbuckTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setWhip(true);
        beverage.setMilk(true);
        double cost = beverage.cost();
        System.out.println("Total cost of " + beverage.getDescription() + " " + cost);
    }

}
