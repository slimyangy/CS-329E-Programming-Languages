package Yang;

/**
 * Created by temp on 3/10/2016.
 */
import java.util.List;
import java.util.ArrayList;

public class Basket {

    List<Item> items;
    TaxCalculator calc;
    private int basketNumber;

    /**
     * Basket attributes include the item objects within the basket as an array of items,
     * a tax calculator object, and the basket number,
     */
    public Basket(int basketNumber) {
        this.items = new ArrayList<Item>();
        this.calc = new TaxCalculator();
        this.basketNumber = basketNumber;
    }

    /**
     * Adds a new item object to the basket from an input string.
     */
    public void appendItem(String input) {
        items.add(new Item(input));
    }

    /**
     * Generates the output for all items in a basket.
     * Starts by outputing output number.
     * Outputs each item and price with its tax included.
     * Outputs total tax for the basket.
     * Outputs total basket price.
     */
    public void generateOutput() {
        System.out.printf("Output %d:\n", this.basketNumber);

        double taxTotal = 0;
        double basketPriceTotal = 0;

        for (Item i : items) {
            double tax = calc.calculateTax(i);
            double priceTotal = tax + i.getPrice();

            taxTotal += tax;
            basketPriceTotal += priceTotal;

            System.out.printf("%d %s: %.2f\n", i.getQuantity(), i.getName(), priceTotal);
        }

        System.out.printf("Sales Taxes: %.2f\n", taxTotal);
        System.out.printf("Total: %.2f\n\n", basketPriceTotal);
    }
}
