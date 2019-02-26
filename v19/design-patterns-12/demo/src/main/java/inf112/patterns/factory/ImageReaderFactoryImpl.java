package inf112.patterns.factory;

public class ImageReaderFactoryImpl implements ImageReaderFactory {

    @Override
    public ImageReader makeGifReader(String filename) {
        return new GifReader(filename);
    }

    @Override
    public ImageReader makeJpegReader(String filename) {
        return new JpegReader(filename);
    }
}
