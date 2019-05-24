package shop;
/**
 * An interface for calculating tax depending on where the shop locate
 */
public interface TaxCalculator {
    double calculateTax(double total);
}
