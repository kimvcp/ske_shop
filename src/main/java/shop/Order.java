package shop;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for calculating tax of ordered items.
 * (Implement the strategy design pattern in this class.)
 */
public class Order {
    /**
     * Id of the order
     */
    private int id;
    /**
     * List of ordered items
     */
    private List<OrderItem> items;
    /**
     * Strategy of tax calculation
     */
    private TaxCalculator taxCalculator;

    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<OrderItem>();
        taxCalculator = new TaxThailand();
    }

    public Order() {
        this(0);
    }

    /**
     * Set the strategy of tax calculation.
     *
     * @param taxCalculator
     */
    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    /**
     * Add item to the ordered items.
     *
     * @param prod
     * @param quantity
     */
    public void addItem(Product prod, int quantity) {
        items.add(new OrderItem(prod, quantity));
    }

    /**
     * Calculating total including tax (if exist).
     *
     * @return the total price
     */
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
