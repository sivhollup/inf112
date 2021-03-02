package inf112.patterns.factory.reader;

import inf112.patterns.factory.DecodedImage;

public class JpegReader implements ImageReader {
    private DecodedImage decodedImage;

    public JpegReader(String filepath) {
        decodedImage = new DecodedImage(filepath);
        System.out.println("Read JPEG image from: " + filepath);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
