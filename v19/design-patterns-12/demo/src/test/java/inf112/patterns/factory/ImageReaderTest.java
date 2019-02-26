package inf112.patterns.factory;

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

    private ImageReader getImageReader(ImageReader reader, String imageFileName) {
        if (imageFileName.endsWith(".gif")) {
            reader = new GifReader(imageFileName);
        }
        else if (imageFileName.endsWith(".jpeg")) {
            reader = new JpegReader(imageFileName);
        }
        return reader;
    }


}
