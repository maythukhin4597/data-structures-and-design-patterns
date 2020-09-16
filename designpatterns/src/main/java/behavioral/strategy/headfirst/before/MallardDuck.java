package behavioral.strategy.headfirst.before;

public class MallardDuck extends Duck implements Flyable, Quackable {

    public MallardDuck() {
        this.name = "MallardDuck";
    }


    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
