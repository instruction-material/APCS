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
        for (int i = 0; i < values.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(j) < values.get(min)) {
                    min = j;
                }
            }
            int first = values.get(i);
            values.set(i, values.get(min));
            values.set(min, first);
        }
    }
}
