package structural.decorator.headfirst.after;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return 0.5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ," + "Mocha added";
    }
}
