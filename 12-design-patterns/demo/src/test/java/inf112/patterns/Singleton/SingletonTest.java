package inf112.patterns.Singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void canGetInstance() {
        Singleton singleton = Singleton.getInstance();
        assertNotNull(singleton);
    }

    @Test
    public void instancesShouldBeSameReference() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertSame(singleton1, singleton2);
    }

    @Test
    public void cannotCallConstructor() {
        //Singleton singleton = new Singleton();
        //fail();
    }
}
