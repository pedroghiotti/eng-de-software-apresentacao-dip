package service;
import entity.User;
import notifications.NotificationChannel;

public class NotificationService {
    public void notify(User user, String message) {
        user.getPreferredNotificationChannels()
            .forEach((NotificationChannel notificationChannel) -> notificationChannel.notify(user, message));
    }
}
