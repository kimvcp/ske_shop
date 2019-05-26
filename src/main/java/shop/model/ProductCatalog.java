package shop.model;

import java.util.*;

/**
 * A class for storing the products before they get ordered.
 * (Implementing singleton design pattern in this class).
 */
public class ProductCatalog implements ShopIterator {
    /**
     * A instance of the class
     */
    private static ProductCatalog productCatalog;
    /**
     * Storing all products in catalog using map.
     */
    private static Map<String, Product> products;
    /**
     * Initialize the size of catalog.
     */
    private int size = 0;

    private ProductCatalog() {
    }

    /**
     * Make sure that there will be only one instance.
     * @return instance
     */
    public static ProductCatalog getInstance() {
        if (productCatalog == null) {
            productCatalog = new ProductCatalog();
        }
        products = new HashMap<String, Product>();
        return productCatalog;
    }

    /**
     * Add the product to the catalog.
     *
     * @param name  of product
     * @param price of product
     */
    public void addProduct(String name, double price) {
        products.put(name, new Product(++size, name, price));
    }

    /**
     * Get the product by name.
     *
     * @param name of choosen product
     * @return a product
     */
    public Product getProduct(String name) {
        return products.get(name);
    }

    /**
     * Get the size of catalog.
     * @return catalog's size
     */
    public int getSize() {
        return size;
    }

    /**
     * Get all of the products in catalog.
     *
     * @return all products
     */
    public List<Product> getAll() {
        Collection<Product> list = products.values();
        return new ArrayList<Product>(list);
    }

    /**
     * Creating iterator of map products.
     * @return iterator object
     */
    public Iterator createIterator() {
        return products.values().iterator();
    }
}
