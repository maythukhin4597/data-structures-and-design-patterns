package behavioral.strategy.headfirst.after;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacks Quacks");
    }
}
