public class Counter {
    private int value;
    private final int step;

    public Counter(int initialValue) {
        value = initialValue;
        step = 1;
    }

    public Counter(int value, int step) {
        this.value = value;
        this.step = step;
    }

    public int value() {
        return value;
    }

    public void advance() {
        value += step;
    }
}
