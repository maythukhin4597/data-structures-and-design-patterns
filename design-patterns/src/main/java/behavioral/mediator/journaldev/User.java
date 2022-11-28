package behavioral.mediator.journaldev;

public abstract class User {
    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    protected ChatMediator mediator;
    protected String name;

    abstract void sendMessage(String msg);

    abstract void receive(String msg);

}
