package structural.decorator.headfirst.after;

public class HouseBlend extends Beverage {
    @Override
    double cost() {
        return 2.0;
    }

    public HouseBlend() {
        description = "HouseBlend";
    }
}
