package service;
import entity.User;
import notifications.EmailNotificationGateway;
import notifications.SmsNotificationGateway;

public class NotificationService {
    public void notify(User user, String message) {
        if (user.receivesNotificationsByEmail()) {
            this.notifyByEmail(user, message);
        }
        if (user.receivesNotificationsBySms()) {
            this.notifyBySms(user, message);
        }
    }

    private void notifyByEmail(User user, String message) { new EmailNotificationGateway().notify(user, message); }

    private void notifyBySms(User user, String message) { new SmsNotificationGateway().notify(user, message); }
}
