package structural.decorator.headfirst.after;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 1.0;
    }
}
