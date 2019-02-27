package inf112.patterns.factory;

import inf112.patterns.factory.reader.GifReader;
import inf112.patterns.factory.reader.ImageReader;
import inf112.patterns.factory.reader.JpegReader;
import inf112.patterns.factory.writer.ImageWriter;
import inf112.patterns.factory.writer.ImageWriterFactory;

/**
 * usage: to_png <inputfile>
 *
 * Leser inputfile og skriver png-variant til standard out
 */
public class ToPNGConverter {

    /**
     *  Et program som bruker biblioteker for å lese og skrive bilder.
     *  Generelt: ofrer "kjapp" implementasjon med alle detaljer på plass for lesbarhet og riktige abstraksjonsnivå
     *
     * @param args
     */
    public static void main(String[] args) {
        String filename = args[0];

        // Vi bryr oss ikke om hvilken reader vi bruker så lenge den virker. Vi vil helst ikke vite noe om hvilke typer som finnes på dette abstraksjonsnivået
        ImageReader reader = getImageReader(filename);

        // Tradisjonell factoryklasse som gir riktig writer (gitt av bruken i dette programmet). Kunne også vært bestemt utfra brukervalg (i meny e.l.)
        // NB: Her må vi forholde oss til at det i alle fall finnes en type, selv om vi ikke må forholde oss til konkret implementasjon
        ImageWriter writer = ImageWriterFactory.makePngWriter();

        // Bruker reader og writer som strategier, converteren vet ingenting om hvilke implementasjoner den får
        Converter converter = new Converter(reader, writer);
        converter.convert(filename);
    }


    /**
     * Factory method: bruker filnavn-suffix til å gjette hvilken type fil som skal leses inn
     *
     * @param imageFileName
     * @return riktig imageReader som kan lese filen som er oppgitt
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
