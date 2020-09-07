package creational.prototype.refactoringguru;

import java.util.Objects;

public class Square extends Shape {

    public int side;

    public Square(int side) {
        this.side = side;
    }

    public Square(Square shape) {
        super(shape);
        this.side = shape.side;
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }

    @Override
    public Double getArea() {
        return Double.valueOf(side * side);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Square)) return false;
        Square square = (Square) object;
        return side == square.side;
    }
}
