package inf112.patterns.adapter;

public class WithoutAdapter {
    public static void main(String[] args) {

        Object[] shapes = {new Line(), new Rectangle()};

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        int width = 40, height = 40;

        /**
         * Grisete og sårbart for endringer, vanskelig å sette seg inn i over tid
         */
        for (Object shape : shapes) {
            if (shape.getClass().getSimpleName().equals("Line")) {
                ((Line)shape).draw(x1, y1, x2, y2);
            } else if (shape.getClass().getSimpleName().equals("Rectangle")) {
                ((Rectangle)shape).draw(x2, y2, width, height);
            }
        }
    }
}

/**
 * Line og Rectangle kan komme fra ulike kodebaser som vi ikke har kontroll på. Se for det at det er eksterne
 * avhengigheter som kommer fra helt andre leverandører.
 */
class Line {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
}

class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}
