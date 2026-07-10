public class EmailService {

    public void sendWelcomeEmail(User user) {
        System.out.println("Welcome email sent to " + user.getEmail());
    }
}
//Responsible for sending emails like welcome emails or password reset emails.
//It keeps email functionality independent from other parts of the application.