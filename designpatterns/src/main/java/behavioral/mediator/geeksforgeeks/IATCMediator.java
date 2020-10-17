package behavioral.mediator.geeksforgeeks;

public interface IATCMediator {
    void setRegisterFlight(Flight flight);

    void setRegisterRunWay(Runway runWay);

    boolean isLandingOkay();

    void setLandingStatus(boolean status);
}
