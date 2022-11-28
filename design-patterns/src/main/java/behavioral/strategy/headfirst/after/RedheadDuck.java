package behavioral.strategy.headfirst.after;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.name = "Redhead";
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }
}

