package structural.decorator.headfirst.afterWithSize;

public class HouseBlend extends Beverage {
    @Override
    double cost() {
        return 2.0;
    }

    public HouseBlend(Size size) {
        description = "HouseBlend";
        this.size = size;
    }
}
