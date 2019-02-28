package inf112.patterns.singleton;

public class GameStateSingleton {

    private static GameStateSingleton INSTANCE;

    private GameStateSingleton() {}

    public static GameStateSingleton getInstance() {
        if (null == INSTANCE) {
            createInstance();
        }
        return INSTANCE;
    }

    private synchronized static void createInstance() {
        if (null == INSTANCE) {
            INSTANCE = new GameStateSingleton();
        }
    }

    public boolean isInitial() {
        return true;
    }
}
