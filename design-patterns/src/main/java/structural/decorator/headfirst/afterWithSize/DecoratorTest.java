package structural.decorator.headfirst.afterWithSize;

public class DecoratorTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Size.MEDIUM);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
        Beverage beverage2 = new HouseBlend(Size.MEDIUM);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
    }

}
