package service;
import entity.User;
import notifications.NotificationChannel;

public class NotificationService {
    public void notify(User user, String message) {
        user.preferredNotificationChannels()
            .forEach((NotificationChannel notificationChannel) -> notificationChannel.notify(user, message));
    }
}
