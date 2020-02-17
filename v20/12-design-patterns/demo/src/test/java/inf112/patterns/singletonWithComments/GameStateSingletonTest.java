package inf112.patterns.singletonWithComments;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameStateSingletonTest {

    @Test
    public void canGetState() {
        GameStateSingleton state = GameStateSingleton.getInstance();
        assertNotNull(state);
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
