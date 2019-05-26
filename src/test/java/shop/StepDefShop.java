package shop;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import shop.model.Order;
import shop.model.Product;
import shop.model.ProductCatalog;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefShop {

    private ProductCatalog catalog;
    private List<Product> products;
    private Order order;

    @Before
    public void setup() {
        catalog = ProductCatalog.getInstance();
        products = catalog.getAll();
        order = new Order();
    }

    @Given("a product (.+) with price (.+) exists")
    public void a_product_with_price_exists(String name, double price) {
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

    @Given("a catalog with (.+) size exists")
    public void a_catalog_with_size_exists(int number) {
        for (int i = 0; i < number; i++) {
            catalog.addProduct("testing product", i);
        }
    }

    @When("I add (.+) with size (.+)")
    public void i_add_with_quantity(String name, int quant) {
        for (int i = 0; i < quant; i++) {
            catalog.addProduct(name, i);
        }
    }

    @Then("total catalog size should be (.+)")
    public void total_catalog_size_should_be(int total) {
        assertEquals(total, catalog.getSize());
    }


    @Given("a order (.+) with (.+) quantity exists")
    public void a_product_exists(int orderNumber, int quantity) {
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

    @Then("total order should be (.+)")
    public void total_order_should_be(int total) {
        assertEquals(total, order.getItems().size());
    }


}

