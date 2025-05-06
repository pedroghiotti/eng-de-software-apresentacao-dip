package notifications;

import entity.User;

public enum NotificationChannel {
    EMAIL(new EmailNotificationGateway()),
    SMS(new SmsNotificationGateway());

    private final NotificationGateway notificationGateway;

    private NotificationChannel(NotificationGateway notificationGateway) {
        this.notificationGateway = notificationGateway;
    }

    public void notify(User user, String message) {
        notificationGateway.notify(user, message);
    }
}
