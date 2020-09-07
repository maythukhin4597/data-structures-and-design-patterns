package behavioral.state.headfirst.after;

import lombok.Getter;

@Getter
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can’t insert a quarter, the machine is sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry , You already turned crank");
    }

    @Override
    public void dispense() {
        System.out.println("Gumball giving out");
        gumballMachine.setCount(gumballMachine.getCount() - 1);
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
