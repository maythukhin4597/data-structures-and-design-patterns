package structural.flyweight.howtodoinjava;

import lombok.ToString;

@ToString
public class MediumPen implements Pen {
    BrushSize brushSize;
    String color;

    public MediumPen() {
        this.brushSize = BrushSize.MEDIUM;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing medium content in " + content + " in " + color + " color");
    }
}