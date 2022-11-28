package structural.bridge.journaldev;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("applying " + getDescription() + " color!");
    }

    @Override
    public String getDescription() {
        return "RED";
    }
}
