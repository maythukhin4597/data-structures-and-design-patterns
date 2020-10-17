package behavioral.mediator.geeksforgeeks;

public class ATCMediator implements IATCMediator {
    Flight flight;
    Runway runway;
    public boolean land;

    @Override
    public void setRegisterFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void setRegisterRunWay(Runway runWay) {
        this.runway = runWay;
    }

    @Override
    public boolean isLandingOkay() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.land = status;
    }

}
