package structural.decorator.headfirst.after;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return 0.5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ," + "Milk added";
    }
}
