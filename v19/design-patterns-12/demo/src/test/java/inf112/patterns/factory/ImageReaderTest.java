package inf112.patterns.factory;

import inf112.patterns.factory.reader.GifReader;
import inf112.patterns.factory.reader.ImageReader;
import inf112.patterns.factory.reader.JpegReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImageReaderTest {

    @Test
    public void getGifImageBasedOnSuffix() {
        ImageReader reader = null;

        String imageFileName = "file.gif";

        reader = getImageReader(reader, imageFileName);

        DecodedImage result = reader.getDecodeImage();
        assertEquals("file.gif: is decoded", result.toString());
    }

    @Test
    public void getJpegImageBasedOnSuffix() {
        ImageReader reader = null;

        String imageFileName = "file.jpeg";

        reader = getImageReader(reader, imageFileName);

        DecodedImage result = reader.getDecodeImage();
        assertEquals("file.jpeg: is decoded", result.toString());

    }

    // factory method: don't care about which reader it is, as long as you get the right result and can read the file
    private ImageReader getImageReader(ImageReader reader, String imageFileName) {
        if (imageFileName.endsWith(".gif")) {
            reader = new GifReader(imageFileName);
        } else if (imageFileName.endsWith(".jpeg")) {
            reader = new JpegReader(imageFileName);
        }
        return reader;
    }


}
