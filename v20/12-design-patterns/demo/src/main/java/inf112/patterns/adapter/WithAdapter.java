package inf112.patterns.adapter;

public class WithAdapter {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line())};

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}

/**
 * Innfører Shape-interface som definerer hvordan adapterne skal oppføre seg (hva som er felles)
 */
interface Shape {
    void draw(int x, int y, int z, int j);
}

/**
 * Alle adapter-klassene implementerer riktig interface og har ansvar for å lime samme ønsket funksjonalitet med
 * hvordan reell implementasjonsklasse virker
 */
class LineAdapter implements Shape {
    private Line adaptee;

    public LineAdapter(Line line) {
        this.adaptee = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}

class RectangleAdapter implements Shape {
    private Rectangle adaptee;

    public RectangleAdapter(Rectangle rectangle) {
        this.adaptee = rectangle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        /**
         * Kode for å tilpasse til ønsket funksjonalitet. Dette ønsker vi å samle et sted slik at resten av koden
         * ikke trenger å forholde seg til disse detaljene.
         */
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);

        adaptee.draw(x, y, width, height);
    }
}

