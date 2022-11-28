package structural.bridge.journaldev;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("applying " + getDescription() + " color!");
    }

    @Override
    public String getDescription() {
        return "BLUE";
    }
}
