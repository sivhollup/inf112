package inf112.patterns.singleton;

public class DatabaseConnection {

    private static DatabaseConnection INSTANCE;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }

    private synchronized static void createInstance() {
        if (null == INSTANCE) {
            INSTANCE = new DatabaseConnection();
        }
    }

    public boolean isActive() {
        return true;
    }
}
