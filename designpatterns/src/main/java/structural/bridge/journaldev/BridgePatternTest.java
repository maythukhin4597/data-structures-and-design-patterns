package structural.bridge.journaldev;

//allows you to vary implementation and abstraction by placing the two in separate class hierarchies.
public class BridgePatternTest {
    public static void main(String[] args) {
        Color red = new Red();
        Shape redTriangle = new Triangle(red);
        redTriangle.applyColor();

        Shape redSquare = new Square(red);
        redSquare.applyColor();
    }
}
