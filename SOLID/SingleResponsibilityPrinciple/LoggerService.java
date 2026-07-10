public class LoggerService {

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }

    public void logWarning(String message) {
        System.out.println("[WARNING] " + message);
    }

    public void logError(String message) {
        System.out.println("[ERROR] " + message);
    }
}

//Records application events, errors, and important actions for debugging and monitoring.
//It centralizes logging so other classes don't need to manage log output themselves.