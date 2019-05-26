package shop.controller;

import shop.model.*;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ShopController {
    /**
     * Ordered items iterator
     */
    private ShopIterator order;
    /**
     * Catalog iterator
     */
    private ShopIterator catalog;
    /**
     * List of products
     */
    private List<Product> products;

    public ShopController() {
        order = new Order();
        catalog = ProductCatalog.getInstance();

    }

    /**
     * Initializing the catalog
     */
    public void initCatalog() {
        ((ProductCatalog) catalog).addProduct("Ham", 40);
        ((ProductCatalog) catalog).addProduct("Pizza", 250);
        ((ProductCatalog) catalog).addProduct("Bread", 20);
        ((ProductCatalog) catalog).addProduct("Steak", 200);
        products = ((ProductCatalog) catalog).getAll();
    }

    /**
     * Handler for printing catalog.
     */
    public void printCatalog() {
        initCatalog();
        System.out.println("__________ WELCOME TO THE SKE SHOP __________\n");
        System.out.printf("  %s%36s\n", "Product", "Price");
        Iterator products = catalog.createIterator();
        printProducts(products);
        System.out.println();
        System.out.println(" [c] Cancel order");
        System.out.println(" [e] Review order and checkout");
    }

    /**
     * Handler for printing receipt.
     */
    public void printReceipt() {
        System.out.println();
        System.out.println(" _______________ SKE RECEIPT ________________");
        System.out.println();
        System.out.println(" Facebook Page : skeskeshop");
        System.out.println(" Tel : 02-021-0200");
        System.out.println();
        System.out.printf(" %27s\n", "Bill Check");
        System.out.println();
        System.out.printf(" %s%31s%tT\n", "Time:", "", System.currentTimeMillis());
        System.out.println(" --------------------------------------------");
        System.out.printf(" %7s%32s%s\n", "Product", "", "Price");
        System.out.println(" --------------------------------------------");
        Iterator orderedItems = order.createIterator();
        printOrderedItem(orderedItems);
        System.out.println(" --------------------------------------------");
        System.out.printf(" %8s%18.2f\n", "Total Price (VAT included)", ((Order) order).getTotal());
        System.out.println(" ____________________________________________");
    }

    public void orderHandler(String choice) {
        int choiceNum = Integer.parseInt(choice);
        Scanner console = new Scanner(System.in);
        try {
            if (products.contains(products.get(choiceNum))) {
                System.out.print("Enter your quantity: ");
                int quantity = console.nextInt();
                ((Order) order).addItem(products.get(choiceNum - 1), quantity);
                System.out.println("\nOrder added: " + quantity + " " + products.get(choiceNum - 1).getName());
            }
        } catch (Exception o) {
            System.out.println("Invalid number");
        }
    }


    /**
     * Cancel a ordered ttem.
     */
    public void cancelOrder() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter cancel number: ");
        int cancelNum = console.nextInt();
        ((Order) order).remove(cancelNum - 1);
        System.out.println("\nOrder item canceled: " +products.get(cancelNum - 1).getName());
    }

    /**
     * Print products by iterating through Map.
     *
     * @param iterator object
     */
    public void printProducts(Iterator iterator) {
        int index = 1;
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.printf(" [%d] %-20s%20.2f\n", index++, product.getName(), product.getPrice());
        }
    }

    /**
     * Print ordered item by iterating through list.
     *
     * @param iterator object
     */
    public void printOrderedItem(Iterator iterator) {
        int index = 1;
        while (iterator.hasNext()) {
            OrderItem item = (OrderItem) iterator.next();
            System.out.printf(" %-20s%24.2f\n", item.getProduct().getName(), item.getProduct().getPrice());
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
