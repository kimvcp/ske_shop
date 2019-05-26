package shop;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import shop.model.Order;
import shop.model.Product;
import shop.model.ProductCatalog;
import shop.model.TaxThailand;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A class for implementing behavioral-driven development.
 */
public class StepDefShop {

    private ProductCatalog catalog;
    private List<Product> products;
    private Order order;

    @Before
    public void setup() {
        catalog = ProductCatalog.getInstance();
        products = new ArrayList<>();
        order = new Order();
    }

    // Buy feature
    @Given("a product (.+) with price (.+) exists")
    public void a_product_with_price_exists(String name, double price) {
        order.setTaxCalculator(new TaxThailand());
        catalog.addProduct(name, price);
    }

    @When("I buy (.+) with quantity (.+)")
    public void i_buy_with_quantity(String name, int quantity) {
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quantity);
    }

    @Then("total should be (.+)")
    public void total_should_be(double total) {
        assertEquals(total, order.getTotal());
    }

    // Add feature
    @Given("a catalog with (.+) size exists")
    public void a_catalog_with_size_exists(int number) {
        catalog.setSize(number);
    }

    @When("I add (.+) with size (.+)")
    public void i_add_product_with_quantity(String name, int quantity) {
        for (int i = 0; i < quantity; i++) {
            catalog.addProduct(name, i);
        }
    }

    @Then("total catalog size should be (.+)")
    public void total_catalog_size_should_be(int total) {
        assertEquals(total, catalog.getSize());
    }

    // Cancel feature
    @Given("an order number (.+) with (.+) quantity exists")
    public void a_order_number_with_quantity_exists(int orderNumber, int quantity) {
        for (int i = 0; i < quantity; i++) {
            catalog.addProduct("testing product", i);
        }
        products = catalog.getAll();
        order.addItem(products.get(orderNumber - 1), quantity);
    }

    @When("I cancel order (.*)")
    public void i_cancel_order(int orderNumber) {
        order.remove(orderNumber - 1);
    }

    @When("I cancel all orders")
    public void i_cancel_all_order() {
        order.removeAll();
    }

    @Then("total orders should be (.+)")
    public void total_orders_should_be(int total) {
        assertEquals(total, order.getItems().size());
    }


}

