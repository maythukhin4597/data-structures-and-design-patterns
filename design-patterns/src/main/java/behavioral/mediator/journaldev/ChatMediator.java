package behavioral.mediator.journaldev;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
