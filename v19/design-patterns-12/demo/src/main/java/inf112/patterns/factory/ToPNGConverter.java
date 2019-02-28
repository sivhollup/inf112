package inf112.patterns.factory;

import inf112.patterns.factory.reader.GifReader;
import inf112.patterns.factory.reader.ImageReader;
import inf112.patterns.factory.reader.JpegReader;
import inf112.patterns.factory.writer.ImageWriter;
import inf112.patterns.factory.writer.ImageWriterFactory;

/**
 * usage: to_png <inputfile>
 * <p>
 * Leser inputfil og skriver png-variant til standard out
 * Et program som bruker biblioteker for å lese og skrive bilder.
 * Generelt: ofrer "kjapp" implementasjon med alle detaljer på plass for lesbarhet og riktige abstraksjonsnivå
 */
public class ToPNGConverter {

    public static void main(String[] args) {
        String filename = args[0];

        /**
         * Vi bryr oss ikke om hvilken reader vi bruker, kun interessert i interfacet sine metoder
         * Vi vil helst ikke vite noe om hvilke typer som finnes på dette abstraksjonsnivået
         * Her bruker vi factory method
         */
        ImageReader reader = getImageReader(filename);

        /**
         * Bruker her en tradisjonell factoryklasse som gir riktig writer (gitt av bruken i dette programmet).
         * Hvilken vi bruker kunne også vært bestemt utfra brukervalg (i meny e.l.)
         * NB: Her må vi forholde oss til at det i alle fall finnes en type, selv om vi ikke må forholde oss til konkret implementasjon.
         */
        ImageWriter writer = ImageWriterFactory.makePngWriter();

        /**
         * Implisitt strategy pattern, vi bruker reader og writer som strategier her. Converter vet ikke om
         * implementasjonene, kun den generelle oppførselen disse konseptene har
         */
        Converter converter = new Converter(reader, writer);
        converter.convert();
    }


    /**
     * Factory method: bruker filnavn-suffix til å gjette hvilken type fil som skal leses inn
     *
     * @param imageFileName
     * @return imageReader som kan lese filen som er oppgitt
     */
    private static ImageReader getImageReader(String imageFileName) {
        if (imageFileName.endsWith(".gif")) {
            return new GifReader(imageFileName);
        } else if (imageFileName.endsWith(".jpeg")) {
            return new JpegReader(imageFileName);
        }
        return null;
    }
}
