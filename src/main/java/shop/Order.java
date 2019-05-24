package shop;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for calculating tax of ordered items
 */
public class Order {
    private int id;
    private List<OrderItem> items;
    private TaxCalculator taxCalculator;

    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<OrderItem>();
        taxCalculator = new TaxThailand();
    }

    public Order() {
        this(0);
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void addItem(Product prod, int quantity) {
        items.add(new OrderItem(prod, quantity));
    }

    public double getTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        if (taxCalculator == null)
            return total;
        return total + taxCalculator.calculateTax(total);
    }

}
