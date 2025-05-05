package notifications;

import entity.User;

public class SmsNotificationGateway {
    public void notify(User user, String message) {
        System.out.println(String.format("Notificando ao usuário %s por SMS... Mensagem: %s", user.name(), message));
    }

}
