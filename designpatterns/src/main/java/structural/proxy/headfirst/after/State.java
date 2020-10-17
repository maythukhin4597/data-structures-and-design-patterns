package structural.proxy.headfirst.after;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();

    void turnCrank();

    void ejectQuarter();

    void dispense();
}
