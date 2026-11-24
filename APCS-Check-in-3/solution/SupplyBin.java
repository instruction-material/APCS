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
        if (amount <= 0 || amount > capacity - quantity) {
            return false;
        }
        quantity += amount;
        return true;
    }

    public boolean take(int amount) {
        if (amount <= 0 || amount > quantity) {
            return false;
        }
        quantity -= amount;
        return true;
    }
}
