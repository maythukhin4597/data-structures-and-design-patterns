package structural.decorator.headfirst.afterWithSize;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        switch (getSize()) {
            case SMALL:
                return 0.1 + beverage.cost();
            case MEDIUM:
                return 0.15 + beverage.cost();
            case LARGE:
                return 0.5 + beverage.cost();
            default:
                return 0.15 + beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ," + "Milk added";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
