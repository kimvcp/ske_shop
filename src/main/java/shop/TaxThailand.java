package shop;

public class TaxThailand implements TaxCalculator {
    public double calculateTax(double purchase) {
        return purchase * 0.07;
    }
}
