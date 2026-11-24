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
        if (weight > limit) {
            return (weight - limit) + " lb over the limit";
        }
        if (weight == limit) {
            return "At the limit";
        }
        return (limit - weight) + " lb under the limit";
    }
}
