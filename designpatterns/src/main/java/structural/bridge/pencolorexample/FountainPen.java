package structural.bridge.pencolorexample;

public class FountainPen extends BallPen implements Pen {

    @Override
    public void draw(String content) {
        System.out.println("Drawing calligraphy for " + content + " with " + size + " size and" + color + " color");
    }

}