package inf112.patterns.strategy;

import java.text.DecimalFormat;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;

class StrategyExample {
    public static void main(String[] args) {

        Order order = new Order();
        order.addLine("Chewing gum           ", .99);
        order.addLine("Unicorn               ", 3.99);
        order.addLine("Bacon                 ", 1.99);

        System.out.println(order.toString());

        //order.setDiscountStrategy(new PercentDiscountStrategy(10));
        //order.setDiscountStrategy(new FixedDiscountStrategy(2));

        order.applyDiscount();

        System.out.println(order.toString());
    }
}

class Order {
    DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

    private List<OrderLine> lines = new ArrayList<>();
    private DiscountStrategy discountStrategy = new NoDiscountStrategy();

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void addLine(String description, double total) {
        lines.add(new OrderLine(description, total));
    }

    public void applyDiscount() {
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

class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public void applyDiscount(Order order) {
        //intentionally do nothing
    }
}