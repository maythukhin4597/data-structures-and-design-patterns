package structural.proxy.headfirst.before;

import lombok.Getter;

@Getter
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can’t insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can’t eject , You havent inserted a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
