package structural.decorator.headfirst.after;

public abstract class Beverage {
    String description;

    abstract double cost();

    public String getDescription() {
        return description;
    }
}
