import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        show(new int[] {-8, -2, -15});
        show(new int[] {9, 3, 9});
        show(new int[] {5});
        show(new int[0]);
    }

    static int[] findExtremes(ArrayList<Integer> values) {
        if (values.isEmpty()) {
            return new int[0];
        }
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for (int value : values) {
            if (value < minimum) {
                minimum = value;
            }
            if (value > maximum) {
                maximum = value;
            }
        }
        return new int[] {minimum, maximum};
    }

    static void show(int[] input) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int value : input) {
            values.add(value);
        }
        int[] result = findExtremes(values);
        if (result.length == 0) {
            System.out.println("No values");
            return;
        }
        System.out.println("Minimum: " + result[0] + ", Maximum: " + result[1]);
    }
}
