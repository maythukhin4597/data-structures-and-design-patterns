package behavioral.mediator.geeksforgeeks;

public class MediatorTest {

    public static void main(String[] args) {
        IATCMediator atcMediator = new ATCMediator();
        Flight sparrow101 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);
        atcMediator.setRegisterFlight(sparrow101);
        atcMediator.setRegisterRunWay(mainRunway);
        sparrow101.getReady();
        mainRunway.land();
        sparrow101.land();
    }
}
