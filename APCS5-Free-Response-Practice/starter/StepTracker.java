public class StepTracker {
    private final int minimum;
    private int activeDays;
    private int days;
    private long totalSteps;

    public StepTracker(int minimum) {
        this.minimum = minimum;
    }

    public void addDailySteps(int steps) {
        // TODO: Update the two day counts and the running total.
    }

    public int totalDaysActive() {
        return activeDays;
    }

    public double averageSteps() {
        // TODO: Handle the empty case and return a fractional average.
        return 0.0;
    }
}
