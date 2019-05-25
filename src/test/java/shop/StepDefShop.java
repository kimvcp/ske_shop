package shop;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

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
        assertEquals(total, order.getTotal());
    }

    @Given("a catalog with (.+) size exists")
    public void a_catalog_with_size_exists(int number) {
        for (int i = 0; i < number; i++) {
            catalog.addProduct("testing product", i);
        }
    }

    @When("I add product with quantity (.+)")
    public void i_add_with_quantity(int quant) {
        for (int i = 0; i < quant; i++) {
            catalog.addProduct("testing product", i);
        }
    }

    @Then("total size should be (.+)")
    public void total_size_should_be(int total) {
        assertEquals(total, catalog.getSize());
    }


}

