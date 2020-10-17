package behavioral.memento.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class Design {
    public static void main(String[] args) {

        List<Memento> savedTimes = new ArrayList<Memento>();
        Life life = new Life();

        //time travel and record the eras
        life.setTime("1000 B.C.");
        savedTimes.add(life.saveToMemento());
        life.setTime("1000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.setTime("2000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.setTime("4000 A.D.");

        life.restoreFromMemento(savedTimes.get(0));

    }
}
