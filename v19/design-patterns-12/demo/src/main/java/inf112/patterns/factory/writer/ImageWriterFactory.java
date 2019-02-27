package inf112.patterns.factory.writer;

public class ImageWriterFactory {

    public static ImageWriter makePngWriter() {
        return new PngImageWriter();
    }

    public static ImageWriter makeJpegWriter() {
        return null;
    }
}
