package structural.proxy.headfirst.after;

import lombok.Getter;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@Getter
public class GumballMachine extends UnicastRemoteObject implements Remote {

    String location;

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;

    State currentState;
    int count;

    public GumballMachine(int count, String location) throws RemoteException {
        this.location = location;
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

    public String getLocation() {
        return location;
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
