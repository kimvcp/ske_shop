package shop.model;

import shop.model.TaxCalculator;

/**
 * A class for calculating tax of Thailand branch.
 */
public class TaxThailand implements TaxCalculator {
    public double calculateTax(double purchase) {
        return purchase * 0.07;
    }
}
