package structural.decorator.headfirst.afterWithSize;

public abstract class Beverage {
    String description;
    Size size;

    abstract double cost();

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }
}
