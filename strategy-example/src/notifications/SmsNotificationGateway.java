package notifications;

import entity.User;

public class SmsNotificationGateway implements NotificationGateway {

    @Override
    public void notify(User user, String message) {
        System.out.println(String.format("Notificando ao usuário %s por SMS... Mensagem: %s", user.getName(), message));
    }

}
