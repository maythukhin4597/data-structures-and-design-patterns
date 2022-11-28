package behavioral.memento.baeldung;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MementoTest {
    public static void main(String[] args) {
        testTime();
    }

    public static void testTime() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.MONDAY, 3);
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(date_format.format(cal.getTime()));
        System.out.println();
    }

    public static void testMemento() {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();

        textEditor.write("Buy milk and eggs before coming home\n");

        textEditor.hitUndo();
        System.out.println(textEditor.print());
//        assertThat(textEditor.print()).isEqualTo("The Memento Design Pattern\nHow to implement it in Java?\n");
    }
}
