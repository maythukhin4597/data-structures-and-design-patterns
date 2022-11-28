package behavioral.strategy.headfirst.after;

public class StrategyTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.myFacadeMethod();
        Duck model = new RedheadDuck();
        model.myFacadeMethod();
        model.setFlyBehavior(new NoFly());
        model.myFacadeMethod();

        Duck rubber = new RubberDuck();
        rubber.myFacadeMethod();
    }
}
