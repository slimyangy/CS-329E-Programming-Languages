package Yang;

/**
 * Created by temp on 3/10/2016.
 */
public class Item {

    private int quantity;
    private double price;
    private String name;
    private boolean isImported;
    private boolean isExempt;

    /**
     * Item attributes include the quantity, price, name, whether imported or not,
     * whether taxed or not of that item.
     */
    public Item(String input) {
        String[] split = input.split(" ");
        this.quantity = Integer.parseInt(split[0]);
        this.price = Double.parseDouble(split[split.length - 1]);
        this.name = generateName(split);
        this.isImported = isImported(input);
        this.isExempt = isExempt(input);
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public boolean isImported() {
        return this.isImported;
    }

    public boolean isExempt() {
        return this.isExempt;
    }

    /**
     * Generates the complete name of the item.
     */
    private static String generateName(String[] split) {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < split.length - 2; i++) {
            builder.append(split[i]).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);

        return builder.toString();
    }

    /**
     * Returns whether or not an item is exempt from sales tax.
     */
    private static boolean isExempt(String inputLine) {
        return inputLine.contains("book") || inputLine.contains("chocolate") || inputLine.contains("headache pills");
    }

    /**
     * Returns whether or not an item is imported.
     */
    private static boolean isImported(String inputLine) {
        return inputLine.contains("imported");
    }
}
