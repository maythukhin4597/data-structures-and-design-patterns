package behavioral.strategy.headfirst.after;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.name = "Rubber";
        this.setFlyBehavior(new NoFly());
        this.setQuackBehavior(new NoQuack());
    }

}
