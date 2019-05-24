package shop;

/**
 * A class for calculating subtotal of products
 */
public class OrderItem {
    /**
     * Quantity of each item
     */
    private int quantity;
    /**
     * Item to be ordered
     */
    private Product prod;

    public OrderItem(Product prod, int quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("OrderItem quantity must be positive");

        this.prod = prod;
        this.quantity = quantity;
    }
    /**
     * Calculating the subtotal of the items.
     */
    public double getSubtotal() {
        return prod.getPrice() * quantity;
    }

}
