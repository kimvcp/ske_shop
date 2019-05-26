package shop;

import shop.model.Order;
import shop.model.TaxThailand;
import shop.view.ShopView;

/**
 * Main class for displaying a console and setting the strategy of calculating tax.
 */
public class Main {
    public static void main(String[] arg) {
        ShopView shopView = new ShopView();
        Order strategy = new Order();
        strategy.setTaxCalculator(new TaxThailand());
        shopView.show();
    }
}
