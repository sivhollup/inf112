package inf112.patterns.factory.reader;

import inf112.patterns.factory.DecodedImage;

public class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader(String filepath) {
        this.decodedImage = new DecodedImage(filepath);
        System.out.println("Read GIF image from: " + filepath);
    }

    @Override
    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}

