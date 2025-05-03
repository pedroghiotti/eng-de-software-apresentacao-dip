package notifications;

import entity.User;

public class EmailNotificationGateway {
    public void notify(User user, String message) {
        System.out.println(String.format("Notificando ao usuário %s por email... Mensagem: %s", user.getName(), message));
    }

}
