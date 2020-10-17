package structural.proxy.headfirst.after;

import java.rmi.Remote;

public interface GumballMachineRemote extends Remote {
    int getCount();

    State getCurrentState();

    String getLocation();

}
