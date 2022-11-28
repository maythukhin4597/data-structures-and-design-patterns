package structural.bridge.journaldev;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle with color :" + color.getDescription());
        color.applyColor();
    }
}
