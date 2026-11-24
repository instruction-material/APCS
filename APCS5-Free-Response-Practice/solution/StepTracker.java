public class StepTracker {
    private final int minimum;
    private int activeDays;
    private int days;
    private long totalSteps;

    public StepTracker(int minimum) {
        this.minimum = minimum;
    }

    public void addDailySteps(int steps) {
        if (steps >= minimum) {
            activeDays++;
        }
        days++;
        totalSteps += steps;
    }

    public int totalDaysActive() {
        return activeDays;
    }

    public double averageSteps() {
        return days == 0 ? 0.0 : (double) totalSteps / days;
    }
}
