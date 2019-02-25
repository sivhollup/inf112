package inf112.patterns.singleton;

public class DatabaseConnection {


    public static DatabaseConnection getInstance() {
        return new DatabaseConnection();
    }

    public boolean isActive() {
        return true;
    }
}
