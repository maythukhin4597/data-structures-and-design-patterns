package structural.flyweight.howtodoinjava;

import lombok.ToString;

@ToString
public class ThickPen implements Pen {
    BrushSize brushSize;            //intrinsic state - shareable
    private String color;    //extrinsic state - supplied by client


    public ThickPen() {
        this.brushSize = BrushSize.THICK;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing Thick " + content + " in " + color + " color");
    }
}
