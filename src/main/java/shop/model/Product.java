package shop.model;

/**
 * A class representing product object.
 */
public class Product {
    /**
     * id of each product
     */
    private int id;
    /**
     * price of each product
     */
    private double price;
    /**
     * name of each product
     */
    private String name;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Get id of product.
     *
     * @return product id
     */
    public int getId() {
        return id;
    }

    /**
     * Get name of product.
     *
     * @return product name
     */
    public String getName() {
        return name;
    }

    /**
     * Get price of product.
     *
     * @return product price
     */
    public double getPrice() {
        return price;
    }

}
