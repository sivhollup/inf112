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

        DecodedImage result = reader.getDecodedImage();
        assertEquals("This is the decoded image: file.gif", result.toString());
    }

    @Test
    public void getJpegImageBasedOnSuffix() {
        ImageReader reader = null;
        String imageFileName = "file.jpeg";
        reader = getImageReader(reader, imageFileName);

        DecodedImage result = reader.getDecodedImage();

        assertEquals("This is the decoded image: file.jpeg", result.toString());
    }

    // factory method: don't care about which reader it is, as long as you get the right result and can read the file
    // will typically reside in a different class, I put it in the test class for convenience to show together with the tests.
    // The same method can also be found in ImageConverter.java.
    private ImageReader getImageReader(ImageReader reader, String imageFileName) {
        if (imageFileName.endsWith(".gif")) {
            reader = new GifReader(imageFileName);
        } else if (imageFileName.endsWith(".jpeg")) {
            reader = new JpegReader(imageFileName);
        }
        return reader;
    }
}
