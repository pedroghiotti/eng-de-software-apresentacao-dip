import entity.User;
import service.NotificationService;

public class App {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        
        // Criando Usuários
        User emailAndSmsUser = new User(
            "Chatty",
            true,
            true
        );

        User emailOnlyUser = new User(
            "Mailman",
            true,
            false
        );

        User smsOnlyUser = new User(
            "Samson",
            false,
            true
        );

        // Notificando Usuários
        System.out.println();

        notificationService.notify(emailAndSmsUser, "Você foi notificado!");
        System.out.println();

        notificationService.notify(emailOnlyUser, "Você foi notificado!");
        System.out.println();

        notificationService.notify(smsOnlyUser, "Você foi notificado!");
        System.out.println();
    }
}
