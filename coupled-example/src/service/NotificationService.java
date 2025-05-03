package service;
import entity.User;
import notifications.EmailNotificationGateway;
import notifications.NotificationChannel;
import notifications.SmsNotificationGateway;

public class NotificationService {
    public void notify(User user, String message) {
        if (user.getPreferredNotificationChannels().contains(NotificationChannel.EMAIL)) {
            notifyByEmail(user, message);
        }

        if (user.getPreferredNotificationChannels().contains(NotificationChannel.SMS)) {
            notifyBySms(user, message);
        }
    }

    private void notifyByEmail(User user, String message) {
        EmailNotificationGateway notificationGateway = new EmailNotificationGateway();
        notificationGateway.notify(user, message);
    }

    private void notifyBySms(User user, String message) {
        SmsNotificationGateway notificationGateway = new SmsNotificationGateway();
        notificationGateway.notify(user, message);
    }
}
