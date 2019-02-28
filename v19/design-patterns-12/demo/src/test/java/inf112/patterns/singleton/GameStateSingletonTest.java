package inf112.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameStateSingletonTest {

    @Test
    public void canGetState() {
        GameStateSingleton state = GameStateSingleton.getInstance();
        assertEquals(true, state.isInitial());
    }

    @Test
    public void twoStatesReferenceSameInstance() {
        GameStateSingleton first = GameStateSingleton.getInstance();
        GameStateSingleton second = GameStateSingleton.getInstance();
        assertSame(first, second);
    }

    @Test
    public void cannotCreateStateWithConstructor() {
        //new GameStateSingleton();
        //fail("Should not be able to call constructor");
    }
}
