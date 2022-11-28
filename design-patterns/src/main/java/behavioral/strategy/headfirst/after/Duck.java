package behavioral.strategy.headfirst.after;
//enforce concrete classess constructor have some same method calls // pls check factory
public abstract class Duck {
    String name;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void swim() {
        System.out.println(name + " is swimming");
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void display() {
        System.out.println("I am " + name);
    }

    void myFacadeMethod() {
        display();
        performFly();
        performQuack();
        swim();
        System.out.println("-------------------- -");
    }
}
