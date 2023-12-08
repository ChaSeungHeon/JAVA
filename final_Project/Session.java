package final_Project;

public class Session {
    private static String loggedInUserId;

    public static String getLoggedInUserId() {
        return loggedInUserId;
    }

    public static void setLoggedInUserId(String userId) {
        loggedInUserId = userId;
    }
}
