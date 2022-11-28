package creational.prototype.refactoringguru;

public class Circle extends Shape {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Circle shape) {
        super(shape);
        this.radius = shape.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public Double getArea() {
        return Math.PI * (radius * radius);
    }
}
