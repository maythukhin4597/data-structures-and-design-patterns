package structural.decorator.headfirst.before;

public class HouseBlend extends Beverage {
    @Override
    double cost() {
        double cost = 2.0;
        cost += hasCondiment();
        return cost;
    }

    @Override
    public void setDescription() {
        description = "HouseBlend";
    }
}
