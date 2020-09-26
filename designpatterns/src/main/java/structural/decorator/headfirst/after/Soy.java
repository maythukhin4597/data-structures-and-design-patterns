package structural.decorator.headfirst.after;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return 0.5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ," + "Soy added";
    }
}
