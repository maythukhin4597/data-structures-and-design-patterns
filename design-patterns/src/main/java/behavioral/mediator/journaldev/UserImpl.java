package behavioral.mediator.journaldev;

public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void sendMessage(String msg) {
        System.out.println(this.name + "Sending Message");
        mediator.sendMessage(msg, this);
    }

    @Override
    void receive(String msg) {
        System.out.println(this.name + "Receiving Message" + msg);
    }
}
