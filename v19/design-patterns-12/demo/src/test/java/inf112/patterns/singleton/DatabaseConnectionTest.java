package inf112.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseConnectionTest {


    @Test
    public void canGetConnection() {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        assertEquals(true, connection.isActive());
    }

    @Test
    public void twoConnectionsReferenceSameInstance() {
        DatabaseConnection first = DatabaseConnection.getInstance();
        DatabaseConnection second = DatabaseConnection.getInstance();
        assertSame(first, second);
    }

    @Test
    public void cannotCreateConnectionWithConstructor() {
        //new DatabaseConnection();
        //fail("Should not be able to call constructor");
    }
}
