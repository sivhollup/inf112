package inf112.patterns.factory.writer;

import inf112.patterns.factory.DecodedImage;
import inf112.patterns.factory.reader.ImageReader;

public class PngImageWriter implements ImageWriter {

    @Override
    public void write(ImageReader in) {
        //hent bildet fra readeren
        DecodedImage decodedImage = in.getDecodedImage();
        //Lat om om det finnes mer kode her som skriver bildet
        System.out.println("Writing the image as PNG");
    }
}
