package structural.bridge.pencolorexample;

public class BallPen implements Pen {

    Color color;
    Size size;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing " + content + " with " + size + " size and" + color.setColor() + " color");
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }
}
