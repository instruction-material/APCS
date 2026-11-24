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

        numbers.set(numbers.size() - 1, 7);
        System.out.println("Replaced: " + numbers);
        System.out.println("Size: " + numbers.size());

        removeNegatives(numbers);
        System.out.println("Kept: " + numbers);
    }

    static void removeNegatives(ArrayList<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            }
        }
    }
}
