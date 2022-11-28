package structural.proxy.headfirst.before;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Pleas insert Quarter first");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry , You cannot eject quarter .Please insert quarter first");
    }

    @Override
    public void dispense() {
        System.out.println("Insert first");
    }
}
