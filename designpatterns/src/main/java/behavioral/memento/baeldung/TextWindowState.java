package behavioral.memento.baeldung;
//Text editor to implement some save and undo features.
//When saving, we want our current text to be saved.
// Thus, when undoing subsequent changes, we'll have our saved text restored.

public class TextWindowState {
    private String text;

    public TextWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
