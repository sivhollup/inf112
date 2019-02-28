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

    public static void main(String[] args) {
        String filename = args[0];

        ImageReader reader = getImageReader(filename);

        ImageWriter writer = ImageWriterFactory.makePngWriter();

        Converter converter = new Converter(reader, writer);
        converter.convert(filename);
    }

    private static ImageReader getImageReader(String imageFileName) {
        if (imageFileName.endsWith(".gif")) {
            return new GifReader(imageFileName);
        } else if (imageFileName.endsWith(".jpeg")) {
            return new JpegReader(imageFileName);
        }
        return null;
    }
}
