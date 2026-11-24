public class VendingMachine {
    private int peanuts;
    private int pretzels;
    private int mAndMs;

    public int getPeanuts() {
        return peanuts;
    }

    public void setPeanuts(int count) {
        if (count >= 0 && count <= 100) {
            peanuts = count;
        }
    }

    public void vendPeanuts() {
        setPeanuts(peanuts - 1);
    }

    public int getPretzels() {
        return pretzels;
    }

    public void setPretzels(int count) {
        // Assign the count only when it is between 0 and 100.
    }

    public void vendPretzels() {
        // Use the setter to attempt to vend one item.
    }

    public int getMAndMs() {
        return mAndMs;
    }

    public void setMAndMs(int count) {
        // Assign the count only when it is between 0 and 100.
    }

    public void vendMAndMs() {
        // Use the setter to attempt to vend one item.
    }
}
