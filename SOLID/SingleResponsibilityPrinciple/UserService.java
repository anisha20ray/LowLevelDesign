public class UserService {

    private UserRepository repository;
    private EmailService emailService;
    private LoggerService logger;

    public UserService(UserRepository repository,
                       EmailService emailService,
                       LoggerService logger) {
        this.repository = repository;
        this.emailService = emailService;
        this.logger = logger;
    }

    public void registerUser(User user) {
        logger.logInfo("Registering user: " + user.getName());

        repository.save(user);

        emailService.sendWelcomeEmail(user);

        logger.logInfo("User registered successfully.");
    }
}

//Contains the business logic related to users, such as user registration.
//It coordinates UserRepository, EmailService, and LoggerService without performing their individual responsibilities.