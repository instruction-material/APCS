public class Counter {
    private int value;
    private final int step;

    public Counter(int initialValue) {
        value = initialValue;
        step = 1;
    }

    public Counter(int value, int step) {
        // Assign the two parameters to the corresponding fields using this.
        this.value = 0;
        this.step = 0;
    }

    public int value() {
        return value;
    }

    public void advance() {
        value += step;
    }
}
