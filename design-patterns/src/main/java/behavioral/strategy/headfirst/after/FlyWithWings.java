package behavioral.strategy.headfirst.after;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly ");
    }
}
