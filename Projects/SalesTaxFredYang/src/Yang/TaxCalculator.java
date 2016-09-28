package Yang;

public class TaxCalculator {

    private static final double SALES_TAX = .1;
    private static final double IMPORT_TAX = .05;

    /**
     * Calculates the total tax (sales and import) for an item.
     */
    public double calculateTax(Item i) {
        double totalTax = 0;
        if (!i.isExempt()) {
            totalTax += roundTax(i.getPrice() * SALES_TAX);
        }

        if (i.isImported()) {
            totalTax += roundTax(i.getPrice() * IMPORT_TAX);
        }

        return totalTax;
    }

    /**
     * Rounds the tax up to the nearest .05, considering even the nth decimal place.
     */
    private double roundTax (double tax) {
        int roundTemp = (int) (tax * 100);
        if (roundTemp % 5 != 0) {
            tax = (roundTemp + 5 - (roundTemp % 5)) / 100.0;
        } else {
            if (roundTemp < tax) {
                tax += 5;
            } else {
                tax = roundTemp / 100.0;
            }
        }
        return tax;
    }
}

