package entity;

public record User(
    String name,
    boolean receivesNotificationsByEmail,
    boolean receivesNotificationsBySms
) {}