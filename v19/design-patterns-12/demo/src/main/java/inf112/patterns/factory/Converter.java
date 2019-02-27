package inf112.patterns.factory;

import inf112.patterns.factory.reader.ImageReader;
import inf112.patterns.factory.writer.ImageWriter;

public class Converter {

    private final ImageReader reader;
    private final ImageWriter writer;

    public Converter(ImageReader reader, ImageWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void convert(String filename) {

        writer.write(reader);

    }


}
