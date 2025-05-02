package notifications;

import entity.User;

public interface NotificationGateway {
    public void notify(User user, String message);
}
