import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(List.of(5, -1, 2, -1, 0));
        System.out.println("Before: " + values);
        selectionSort(values);
        System.out.println("After: " + values);
    }

    public static void selectionSort(ArrayList<Integer> values) {
        // Find the smallest value in the unsorted suffix and swap it into place.
    }
}
