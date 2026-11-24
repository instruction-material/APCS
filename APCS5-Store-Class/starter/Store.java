public class Store {
    private int appleAmount = 20;
    private int pearAmount = 100;
    private int hoseAmount = 15;

    public int quantity(String item) {
        if ("apple".equals(item)) {
            return appleAmount;
        }
        if ("pear".equals(item)) {
            return pearAmount;
        }
        if ("hose".equals(item)) {
            return hoseAmount;
        }
        return 0;
    }

    public int buy(String item, int amount) {
        if (amount <= 0) {
            return 0;
        }
        if ("apple".equals(item) && amount <= appleAmount) {
            appleAmount -= amount;
            return amount * 4;
        }
        // Add the stock check, quantity update, and price for pears and hoses.
        return 0;
    }
}
