package shop;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import shop.Order;
import shop.Product;
import shop.ProductCatalog;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefShop {

    private ProductCatalog catalog;
    private Order order;

    @Before
    public void setup() {
        catalog = ProductCatalog.getInstance();
        order = new Order();
    }

    @Given("a product (.+) with price (.+) exists")
    public void a_product_with_price_exists(String name, double price) {
        catalog.addProduct(name, price);
    }

    @When("I buy (.+) with quantity (.+)")
    public void i_buy_with_quantity(String name, int quant) {
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quant);
    }

    @Then("total should be (.+)")
    public void total_should_be(double total) {
        System.out.println(order.getTotal());
        assertEquals(total, order.getTotal());
    }
}

