package shop;

import java.util.*;

/**
 * A class for storing the products before they get ordered.
 */
public class ProductCatalog {

    private static ProductCatalog productCatalog;
    private static Map<String, Product> products;
    private int size = 0;

    private ProductCatalog(){}

    public static ProductCatalog getInstance() {
        if(productCatalog == null){
            productCatalog = new ProductCatalog();
        }
        products = new HashMap<String, Product>();
        return productCatalog;
    }

    public void addProduct(String name, double price) {
        products.put(name, new Product(++size, name, price));
    }

    public Product getProduct(String name) {
        return products.get(name);
    }

    public List<Product> getAll() {
        Collection<Product> list = products.values();
        return new ArrayList<Product>(list);
    }

    public void addProduct(List<Product> all) {
        for (Product product : all) {
            products.put(product.getName(), product);
            size++;
        }
    }
}
