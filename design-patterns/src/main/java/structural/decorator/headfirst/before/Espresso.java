package structural.decorator.headfirst.before;

public class Espresso extends Beverage {
    @Override
    double cost() {
        double cost = 1.0;
        cost += hasCondiment();
        return cost;
    }

    @Override
    public void setDescription() {
        description = "Espresso";
    }
}
