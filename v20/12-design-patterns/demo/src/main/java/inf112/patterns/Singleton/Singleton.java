package inf112.patterns.Singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (null == INSTANCE) {
            createInstance();
        }
        return INSTANCE;
    }

    private synchronized static void createInstance() {
        INSTANCE = new Singleton();
    }
}
