package inf112.patterns.factory;

public interface ImageReaderFactory {

    ImageReader makeGifReader(String filename);
    ImageReader makeJpegReader(String filename);
}
