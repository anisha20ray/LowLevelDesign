public class Main {

    public static void main(String[] args) {

        User user = new User(1, "Anisha", "anisha@example.com");

        UserRepository repository = new UserRepository();
        EmailService emailService = new EmailService();
        LoggerService logger = new LoggerService();

        UserService userService =
                new UserService(repository, emailService, logger);

        userService.registerUser(user);
    }
}