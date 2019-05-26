package shop;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import shop.model.Order;
import shop.model.OrderItem;
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

    @Given("a order (.+) with quantity (.+) exists")
    public void a_product_with_quantity_exists(String name,int quantity) {
        catalog.addProduct(name, quantity);
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quantity);
    }

    @When("I cancel (.*)")
    public void i_cancel(String name) {
        Product prod = catalog.getProduct(name);
        OrderItem item = new OrderItem(prod,1);
        order.remove(item);
        }


    @Then("total order should be (.+)")
    public void total_order_should_be(int total) {
        assertEquals(total, order.getItems().size());
    }


}

