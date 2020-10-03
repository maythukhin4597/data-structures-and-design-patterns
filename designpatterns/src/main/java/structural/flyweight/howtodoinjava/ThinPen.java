package structural.flyweight.howtodoinjava;

import lombok.ToString;

@ToString
public class ThinPen implements Pen {
    BrushSize brushSize;
    String color;

    public ThinPen() {
        this.brushSize = BrushSize.THIN;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing Thin content in " + content + " in " + color + " color");
    }
}
