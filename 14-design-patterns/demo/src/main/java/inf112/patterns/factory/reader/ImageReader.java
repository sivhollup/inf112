package inf112.patterns.factory.reader;

import inf112.patterns.factory.DecodedImage;

/**
 * Tenk at alle imagereader-klassene er i et eksternt API
 */
public interface ImageReader {

    DecodedImage getDecodedImage();
}
