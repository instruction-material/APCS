public class SupplyBin {
    private final int capacity;
    private int quantity;

    public SupplyBin(int capacity, int quantity) {
        this.capacity = capacity;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean add(int amount) {
        // TODO: Reject an invalid amount, then update the same bin.
        return false;
    }

    public boolean take(int amount) {
        // TODO: Check available quantity before subtracting.
        return false;
    }
}
