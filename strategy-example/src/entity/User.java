package entity;

import java.util.List;

import notifications.NotificationChannel;

public record User(
    String name,
    List<NotificationChannel> preferredNotificationChannels
) {}