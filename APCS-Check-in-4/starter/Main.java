import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> labels = new ArrayList<>();
        labels.add("desk");
        labels.add("ox");
        labels.add("i");
        labels.add("shelf");
        removeShortLabels(labels, 3);
        System.out.println("Kept labels: " + labels);
        int[][] grid = {{0, 3, -1}, {2, -3, 5}};
        System.out.println("Positive cells: " + countPositive(grid));
        System.out.println("Empty grid: " + countPositive(new int[0][0]));
    }

    public static void removeShortLabels(ArrayList<String> labels, int minimumLength) {
        // TODO: Remove by index without skipping any shorter neighbors.
    }

    public static int countPositive(int[][] grid) {
        int count = 0;
        // TODO: Visit every row and every value in that row.
        return count;
    }
}
