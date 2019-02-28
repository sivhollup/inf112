package inf112.patterns.factory.writer;

/**
 * Definerer hvilke writere som finnes, må utvides hver gang et nytt filformat legges til.
 * Tenk at denne koden er eksternt API
 */
public class ImageWriterFactory {

    /**
     * Hver metode skal være public static slik at du ikke må opprette en instans av factory-klassen for å kalle metodene
     * Denne metoden kjenner til konkret implementasjon
     * @return PngImageWriter
     */
    public static ImageWriter makePngWriter() {
        return new PngImageWriter();
    }

    public static ImageWriter makeJpegWriter() {
        return null;
    }
}
