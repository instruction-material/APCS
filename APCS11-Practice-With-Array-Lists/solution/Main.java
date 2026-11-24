import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(3, 2, 5, 2, 7));
        ArrayList<String> words = new ArrayList<>(List.of("", "apple", "class", "ant"));
        ArrayList<Double> decimals = new ArrayList<>(List.of(-2.5, 0.0, 6.5));
        System.out.println("Even count: " + numEvens(numbers));
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Starts with a: " + startsWithA(words));
        replaceNums(decimals);
        System.out.println("Signs: " + decimals);
        removeLastEven(numbers);
        System.out.println("After removal: " + numbers);
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
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static ArrayList<String> startsWithA(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (!word.isEmpty() && word.charAt(0) == 'a') {
                result.add(word);
            }
        }
        return result;
    }

    public static void replaceNums(ArrayList<Double> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            double value = numbers.get(i);
            if (value < 0) {
                numbers.set(i, -1.0);
            } else if (value > 0) {
                numbers.set(i, 1.0);
            }
        }
    }

    public static void removeLastEven(ArrayList<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                return;
            }
        }
    }
}
