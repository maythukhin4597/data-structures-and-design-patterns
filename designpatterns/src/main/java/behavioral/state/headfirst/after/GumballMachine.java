package behavioral.state.headfirst.after;

import lombok.Getter;

@Getter
public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;

    State currentState;
    int count;

    public GumballMachine(int count) {
        this.count = count;
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        if (count > 0) {
            currentState = new NoQuarterState(this);
        } else {
            this.currentState = new SoldOutState(this);
        }
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void dispense() {
        currentState.dispense();
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "currentState=" + currentState +
                ", count=" + count +
                '}';
    }
}
