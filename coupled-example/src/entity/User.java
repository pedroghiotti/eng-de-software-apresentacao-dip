package entity;

import java.util.List;

import notifications.NotificationChannel;

public class User {
    private final String name;
    private final List<NotificationChannel> preferredNotificationChannels;

    public User(String name, List<NotificationChannel> preferredNotificationChannels) {
        this.name = name;
        this.preferredNotificationChannels = preferredNotificationChannels;
    }

    public String getName() {
        return this.name;
    }

    public List<NotificationChannel> getPreferredNotificationChannels() {
        return this.preferredNotificationChannels;
    }
}