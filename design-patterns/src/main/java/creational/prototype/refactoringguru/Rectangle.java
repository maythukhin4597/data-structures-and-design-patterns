package creational.prototype.refactoringguru;

public class Rectangle extends Shape {

    public int width;
    public int height;


    public Rectangle(Rectangle shape) {
        super(shape);
        this.height = shape.height;
        this.width = shape.width;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public Double getArea() {
        return Double.valueOf(width * height);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width &&
                height == rectangle.height;
    }

}
