package shop.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A class for storing the ordered items with function of calculating tax.
 * (Implement the strategy design pattern in this class.)
 */
public class Order implements ShopIterator {
    /**
     * List of ordered items
     */
    private List<OrderItem> items;
    /**
     * Strategy of tax calculation
     */
    private TaxCalculator taxCalculator;

    public Order() {
        this.items = new ArrayList<>();
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
     * @param product
     * @param quantity
     */
    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    /**
     * Remove all items from the ordered items.
     *
     * @param
     */
    public void removeAll() {
        items.clear();
    }

    /**
     * Remove a item from the ordered items.
     *
     * @param
     */
    public void remove(int selectedIndex) {
        items.remove(selectedIndex);
    }

    /**
     * Get all the ordered items in list
     * (Mainly for testing)
     * @return list of items
     */
    public List<OrderItem> getItems(){
        return items;
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

    /**
     * Creating iterator of list items.
     *
     * @return iterator object
     */
    public Iterator createIterator() {
        return items.iterator();
    }
}
