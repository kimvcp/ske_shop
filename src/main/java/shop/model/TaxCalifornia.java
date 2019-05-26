package shop.model;

import shop.model.TaxCalculator;

/**
 * A class for calculating tax of California branch.
 */
public class TaxCalifornia implements TaxCalculator {
    public double calculateTax(double purchase) {
        double tax = 0.06;
        if (purchase < 100)
            tax = 0.04;
        else if (purchase < 500)
            tax = 0.05;
        return purchase * tax;
    }
}
