import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] values = {2, 0, -3, 2};
        System.out.println("Squares: " + Arrays.toString(squares(10)));
        System.out.println("Ends match: " + hasSameFirstAndLast(values));
        System.out.println("Sum: " + sum(values));
        System.out.println("Characters: " + totalLetters(new String[] {"sun", "", "sky"}));
        System.out.println("Contains zero: " + containsZero(values));
        System.out.println("Random: " + Arrays.toString(getRandomArray(3)));
        System.out.println("Reversed: " + Arrays.toString(reverse(values)));
        System.out.println("Extremes swapped: " + Arrays.toString(swapArr(values)));
    }

    public static int[] squares(int count) {
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = i * i;
        }
        return result;
    }

    public static boolean hasSameFirstAndLast(int[] values) {
        return values.length > 0 && values[0] == values[values.length - 1];
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static int totalLetters(String[] words) {
        int total = 0;
        for (String word : words) {
            total += word.length();
        }
        return total;
    }

    public static boolean containsZero(int[] values) {
        for (int value : values) {
            if (value == 0) {
                return true;
            }
        }
        return false;
    }

    public static double[] getRandomArray(int count) {
        Random random = new Random(17);
        double[] result = new double[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextDouble() * 10;
        }
        return result;
    }

    public static int[] reverse(int[] values) {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[values.length - 1 - i] = values[i];
        }
        return result;
    }

    public static int[] swapArr(int[] values) {
        if (values.length == 0) {
            return values;
        }
        int min = 0;
        int max = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[min]) {
                min = i;
            }
            if (values[i] > values[max]) {
                max = i;
            }
        }
        int first = values[min];
        values[min] = values[max];
        values[max] = first;
        return values;
    }
}
