public class Main {
    public static void main(String[] args) {
        StepTracker tracker = new StepTracker(100);
        StepTracker other = new StepTracker(100);
        System.out.println("Empty average: " + tracker.averageSteps());
        tracker.addDailySteps(90);
        tracker.addDailySteps(100);
        tracker.addDailySteps(114);
        System.out.println("Active days: " + tracker.totalDaysActive());
        System.out.println("Average: " + tracker.averageSteps());
        System.out.println("Independent average: " + other.averageSteps());
    }
}
