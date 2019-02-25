package inf112.patterns.singleton;

public class DatabaseConnection {

    private static DatabaseConnection INSTANCE;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnection();
        }
        return INSTANCE;
    }

    public boolean isActive() {
        return true;
    }
}
