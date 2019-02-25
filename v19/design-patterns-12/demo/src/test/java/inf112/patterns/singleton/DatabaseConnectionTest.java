package inf112.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseConnectionTest {


    @Test
    public void canGetConnection() {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        assertEquals(true, connection.isActive());
    }
}
