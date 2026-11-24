public class Main {
    public static void main(String[] args) {
        int[][] first = {{1, 3, 5, 7, 9}, {1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {5, 4, 3, 2, 1}};
        int[][] second = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 5}, {5, 5, 5, 5, 5}, {25, -25, 25, -25, 25}};
        printGrid(first);
        System.out.println("Contains 6: " + containsValue(first, 6));
        System.out.println("Contains 11: " + containsValue(first, 11));
        System.out.println("First sum: " + sumOfArray(first));
        System.out.println("First rows match: " + isRowMagic(first));
        System.out.println("Second rows match: " + isRowMagic(second));
    }

    static boolean containsValue(int[][] grid, int wanted) {
        for (int[] row : grid) {
            for (int value : row) {
                if (value == wanted) {
                    return true;
                }
            }
        }
        return false;
    }

    static int sumOfArray(int[][] grid) {
        int total = 0;
        for (int[] row : grid) {
            total += sumRow(row);
        }
        return total;
    }

    static boolean isRowMagic(int[][] grid) {
        if (grid.length <= 1) {
            return true;
        }
        int expected = sumRow(grid[0]);
        for (int index = 1; index < grid.length; index++) {
            if (sumRow(grid[index]) != expected) {
                return false;
            }
        }
        return true;
    }

    static int sumRow(int[] row) {
        int total = 0;
        for (int value : row) {
            total += value;
        }
        return total;
    }

    static void printGrid(int[][] grid) {
        if (grid == null) {
            System.out.println("Incompatible dimensions");
            return;
        }
        for (int[] row : grid) {
            String line = "";
            for (int value : row) {
                line += value + " ";
            }
            System.out.println(line.trim());
        }
    }
}
