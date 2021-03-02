package inf112.patterns.singletonWithComments;

/**
 * Klassen navngis med Singleton for å vise alle hvilke egenskaper denne klassen følger
 */
public class GameStateSingleton {

    /**
     * singletoninstansen skal være privat og statisk
     */
    private static GameStateSingleton INSTANCE;

    /**
     * Konstruktør må være privat slik at ingen andre enn denne klassen kan kalle den
     * Gjør også at klassen ikke kan subklasses
     */
    private GameStateSingleton() {}

    /**
     * Metode som gir instansen. Denne vil kalles hver eneste gang instansen skal brukes av noen og må være rask.
     *
     * @return instansen
     */
    public static GameStateSingleton getInstance() {
        if (null == INSTANCE) {
            createInstance(); // Hvis instansen opprettes her kan vi få flere instanser, denne metoden er ikke thread-safe
        }
        return INSTANCE;
    }

    /**
     * Lager den faktiske instansen og sørger for at ingen andre tråder gjør det samme samtidig
     * syncronised-metoder er dyre, så vi ønsker ikke at getInstance skal være syncronised, da blir alle som skal kalle
     * den lagt i kø. Denne metoden kalles *kun* første gangen (i verste fall et par ganger samtidig i ulike tråder) frem til
     * instansen er opprettet.
     */
    private synchronized static void createInstance() {
        if (null == INSTANCE) { // Må gjøre sjekk en gang til her i tilfelle noen andre har opprettet instansen siden forrige sjekk
            INSTANCE = new GameStateSingleton();
        }
    }
}
