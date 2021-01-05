package inf112.patterns.factory.writer;

import inf112.patterns.factory.reader.ImageReader;

public interface ImageWriter {

    void write(ImageReader in);
}
