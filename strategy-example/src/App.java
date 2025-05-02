import java.util.List;

import entity.User;
import notifications.NotificationChannel;
import service.NotificationService;

public class App {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        
        // Criando Usuários
        User emailAndSmsUser = new User("Chatty", List.of(NotificationChannel.EMAIL, NotificationChannel.SMS));
        User emailOnlyUser = new User("Mailman", List.of(NotificationChannel.EMAIL));
        User smsOnlyUser = new User("Samson", List.of(NotificationChannel.SMS));

        // Notificando Usuários
        notificationService.notify(emailAndSmsUser, "Você foi notificado!");
        System.out.println();

        notificationService.notify(emailOnlyUser, "Você foi notificado!");
        System.out.println();

        notificationService.notify(smsOnlyUser, "Você foi notificado!");
        System.out.println();
    }
}
