package inf112.patterns.factory;

public class DecodedImage {

   private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "This is the decoded image: " + image;
    }
}