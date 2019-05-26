package shop.model;

/**
 * An interface for calculating tax depending on where the shop's branch located.
 */
public interface TaxCalculator {
    double calculateTax(double total);
}
