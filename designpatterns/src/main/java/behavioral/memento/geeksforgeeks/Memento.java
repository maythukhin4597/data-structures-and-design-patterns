package behavioral.memento.geeksforgeeks;
//Use when you need to restore the state of the object to its previous state.
//offers a solution to implement undoable actions .
public class Memento {
    String time;

    public Memento(String time) {
        this.time = time;
    }

    public String getSavedTime() {
        return this.time;
    }
}
