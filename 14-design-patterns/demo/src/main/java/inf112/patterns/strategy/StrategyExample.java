package inf112.patterns.strategy;

import java.text.DecimalFormat;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;

/**
 * Eksempelprogram hvor en ordre gis (hardkodet i dette tilfellet), og så skrives den ut.
 * Har også mulighet for å gi rabatt.
 */
class StrategyExample {
    public static void main(String[] args) {

        Order order = new Order();
        order.addLine("Chewing gum           ", .99);
        order.addLine("Unicorn               ", 3.99);
        order.addLine("Bacon                 ", 1.99);

        System.out.println("Original order: ");
        System.out.println(order.toString());

        /*
         * I virkeligheten ville strategien vi velger kommet fra brukergrensesnitt eller annen input som bestemmes runtime
         */
        //order.setDiscountStrategy(new PercentDiscountStrategy(10));
        //order.setDiscountStrategy(new FixedDiscountStrategy(2));

        /*
         * Legg på rabatt på ordre, uavhengig av om rabatten endrer totalsum. Hvis vi ikke har satt rabattstrategi brukes
         * defaultstrategien som er satt i Order-klassen
         */
        order.applyDiscount();

        System.out.println("Final prices for order: ");
        System.out.println(order.toString());
    }
}

class Order {
    DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

    private List<OrderLine> lines = new ArrayList<>();
    /**
     * En ordre har i utgangspunktet en strategi for rabatt: ingen rabatt
     */
    private DiscountStrategy discountStrategy = new NoDiscountStrategy();


    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void addLine(String description, double total) {
        lines.add(new OrderLine(description, total));
    }

    public void applyDiscount() {
        /**
         * Sender inn seg selv til rabattstrategien, slik at den kan legge på ordrelinje med rabatten den beregner
         */
        discountStrategy.applyDiscount(this);
    }

    public double getSum() {
        return lines.stream().collect(Collectors.summarizingDouble(line -> line.total)).getSum();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (OrderLine line : lines) {
            result
                    .append(line.description)
                    .append(decimalFormat.format(line.total))
                    .append("\n");
        }

        result.append("--------------------------").append("\n");
        result.append("SUM:                  ")
                .append(decimalFormat.format(getSum())).append("\n");
        result.append("==========================").append("\n");
        return result.toString();
    }
}


class OrderLine {
    public final double total;
    public final String description;

    public OrderLine(String description, double total) {
        this.description = description;
        this.total = total;
    }
}


interface DiscountStrategy {
    void applyDiscount(Order order);
}

class PercentDiscountStrategy implements DiscountStrategy {
    int percentDiscount;

    public PercentDiscountStrategy(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    @Override
    public void applyDiscount(Order order) {
        double discount = order.getSum() * percentDiscount / 100.0;
        order.addLine(percentDiscount + "% discount         ", -discount);
    }
}

class FixedDiscountStrategy implements DiscountStrategy {
    private final double discount;

    public FixedDiscountStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public void applyDiscount(Order order) {
        order.addLine("Fixed discount       ", -discount);
    }
}

/**
 * Default-tilfelle for ingen rabatt, altså ingen endring i ordre.
 * Sier eksplisitt hva som skal skje (ingenting) og tillater programmet å ikke måtte
 * spesialhåndtere dette tilfellet
 */
class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public void applyDiscount(Order order) {
        //intentionally do nothing
    }
}