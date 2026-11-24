import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(-73);
        numbers.add(0);
        numbers.add(1137);
        numbers.add(1, -5);
        System.out.println("Inserted: " + numbers);
        System.out.println("At index 1: " + numbers.get(1));

        // TODO: Replace the last element with 7.
        System.out.println("Replaced: " + numbers);
        System.out.println("Size: " + numbers.size());

        removeNegatives(numbers);
        System.out.println("Kept: " + numbers);
    }

    static void removeNegatives(ArrayList<Integer> numbers) {
        // TODO: Walk backward and remove each negative element by index.
    }
}
