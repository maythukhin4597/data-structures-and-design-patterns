package structural.flyweight.howtodoinjava;

public class PaintClient {
    public static void main(String[] args) {
        Pen redThickPen = PenFactory.getMediumPen("red");
        redThickPen.draw("Hello world");

        Pen redThickPenClone = PenFactory.getMediumPen("red");
        redThickPenClone.draw("Hello world");

        Pen blueThinPen = PenFactory.getThickPen("blue");
        blueThinPen.draw("Hello world");

        System.out.println(redThickPen.hashCode());
        System.out.println(redThickPenClone.hashCode());
        System.out.println(blueThinPen);
    }
}
