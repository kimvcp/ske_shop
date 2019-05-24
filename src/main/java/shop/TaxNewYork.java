package shop;

/**
 * A class for calculating tax of New York branch.
 */
public class TaxNewYork implements TaxCalculator {
    public double calculateTax(double purchase) {
        if (purchase > 100)
            return purchase * 0.08;
        return 0;
    }
}
