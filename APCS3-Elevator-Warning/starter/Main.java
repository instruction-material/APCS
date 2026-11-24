public class Main {
    private static final int LIMIT = 1500;

    public static void main(String[] args) {
        printStatus(1499);
        printStatus(1500);
        printStatus(1501);
    }

    private static void printStatus(int weight) {
        System.out.println(weight + " lb: " + loadStatus(weight, LIMIT));
    }

    static String loadStatus(int weight, int limit) {
        // Compare the weight to the limit, then calculate the difference.
        return "Comparison pending";
    }
}
