package notifications;

import entity.User;

public class EmailNotificationGateway implements NotificationGateway {

    @Override
    public void notify(User user, String message) {
        System.out.println(String.format("Notificando ao usuário %s por email... Mensagem: %s", user.name(), message));
    }

}
