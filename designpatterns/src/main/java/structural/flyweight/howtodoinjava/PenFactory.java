package structural.flyweight.howtodoinjava;

import java.util.HashMap;

public class PenFactory {
    private static final HashMap<String, Pen> penMap = new HashMap<>();

    public static Pen getThickPen(String color) {
        String key = color + "_Thick";
        Pen pen = penMap.get(key);
        if (pen == null) {
            pen = new ThickPen();
            pen.setColor(color);
            penMap.put(key, pen);
        }
        return pen;
    }

    public static Pen getThinPen(String color) {
        String key = color + "_Thin";
        Pen pen = penMap.get(key);
        if (pen == null) {
            pen = new ThickPen();
            pen.setColor(color);
            penMap.put(key, pen);
        }
        return pen;
    }

    public static Pen getMediumPen(String color) {
        String key = color + "_Medium";
        return penMap.computeIfAbsent(key, newKey -> {
            Pen pen = new MediumPen();
            pen.setColor(color);
            return pen;
        });
    }
}
