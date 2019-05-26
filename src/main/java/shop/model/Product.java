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

    /**
     * Set id of the given product.
     *
     * @param id to be set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set name of the given product.
     *
     * @param name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set price of the given product.
     *
     * @param price to be set
     */
    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price must be positive value");
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ " +
                "\"id\": " + id + "," +
                "\"name\": \"" + name + "\"," +
                "\"price\": " + id + "," +
                "}";
    }

}
