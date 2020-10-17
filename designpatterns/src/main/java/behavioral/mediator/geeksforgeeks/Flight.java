package behavioral.mediator.geeksforgeeks;

public class Flight implements Command {
    IATCMediator iatcMediator;

    public Flight(IATCMediator iatcMediator) {
        this.iatcMediator = iatcMediator;
    }

    @Override
    public void land() {
        if (iatcMediator.isLandingOkay()) {
            System.out.println("Successfully landed");
            iatcMediator.setLandingStatus(true);
        } else System.out.println("Waiting to land");
    }

    public void getReady() {
        System.out.println("Ready for landing");
    }
}
