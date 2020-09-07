package creational.prototype.refactoringguru;

import java.util.Objects;

public class PrototypeTest {
    public static void main(String[] args) {
        Shape square = new Square(4);
        Shape cloneSquare = square.clone();
        Shape rectangle = new Rectangle(3, 4);

        System.out.println(square.getArea());

        if (square == cloneSquare) {
            System.out.println("Square == clone square");
        }

        if (square.equals(cloneSquare)) {
            System.out.println("Square equals clone square");
        }

        if (Objects.equals(rectangle, cloneSquare)) {
            System.out.println("rectangle == clone square");
        }
    }
}
