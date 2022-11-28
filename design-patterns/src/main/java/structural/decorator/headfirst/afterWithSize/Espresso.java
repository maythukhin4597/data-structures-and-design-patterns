package structural.decorator.headfirst.afterWithSize;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    double cost() {
        return 1.0;
    }
}
