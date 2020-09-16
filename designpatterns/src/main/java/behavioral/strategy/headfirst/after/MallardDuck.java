package behavioral.strategy.headfirst.after;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.name = "MallardDuck";
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

}
