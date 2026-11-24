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
        for (int i = labels.size() - 1; i >= 0; i--) {
            String label = labels.get(i);
            if (label.length() < minimumLength) {
                labels.remove(i);
            }
        }
    }

    public static int countPositive(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int value : row) {
                if (value > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
