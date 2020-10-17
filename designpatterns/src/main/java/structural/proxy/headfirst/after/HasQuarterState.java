package structural.proxy.headfirst.after;

public class HasQuarterState implements State {
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can’t insert another quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You Turned Crank");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
