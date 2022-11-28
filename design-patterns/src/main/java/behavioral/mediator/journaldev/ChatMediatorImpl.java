package behavioral.mediator.journaldev;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    List<User> users;

    public ChatMediatorImpl() {
        if (users == null) {
            this.users = new ArrayList<>();
        }
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User aUser : users) {
            if (aUser.equals(user)) {
                aUser.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
