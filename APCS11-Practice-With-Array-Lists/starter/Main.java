import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(3, 2, 5, 2, 7));
        System.out.println("Even count: " + numEvens(numbers));
        // Add one demonstration call after each method is complete.
    }

    public static int numEvens(ArrayList<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int sum(ArrayList<Integer> numbers) {
        throw new UnsupportedOperationException("Accumulate the list values.");
    }

    public static ArrayList<String> startsWithA(ArrayList<String> words) {
        throw new UnsupportedOperationException("Copy matching words into a separate list.");
    }

    public static void replaceNums(ArrayList<Double> numbers) {
        // Use set to replace nonzero values without changing the size.
    }

    public static void removeLastEven(ArrayList<Integer> numbers) {
        // Search backward and remove at most one element by index.
    }
}
