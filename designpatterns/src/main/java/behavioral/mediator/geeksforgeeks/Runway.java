package behavioral.mediator.geeksforgeeks;

public class Runway implements Command {
    IATCMediator iatcMediator;

    public Runway(IATCMediator iatcMediator) {
        this.iatcMediator = iatcMediator;
        iatcMediator.setLandingStatus(true);
    }

    @Override
    public void land() {
        System.out.println("Landing");
        iatcMediator.setLandingStatus(true);
    }
}
