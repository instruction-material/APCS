public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{1, 2}, {3, 4}, {4, 5}};
        int[][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] d = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println("A times B");
        printGrid(matrixMul(a, b));
        System.out.println("C plus D");
        printGrid(matAdd(c, d));
        System.out.println("C minus D");
        printGrid(matSub(c, d));
        System.out.println("A plus B");
        printGrid(matAdd(a, b));
    }

    static int[][] matrixMul(int[][] a, int[][] b) {
        int shared = width(a);
        int outColumns = width(b);
        if (shared == 0 || outColumns == 0 || shared != b.length) {
            return null;
        }
        int[][] product = new int[a.length][outColumns];
        // Use a row of a and a column of b to fill each output cell.
        return product;
    }

    static int[][] matAdd(int[][] a, int[][] b) {
        return combine(a, b, 1);
    }

    static int[][] matSub(int[][] a, int[][] b) {
        return combine(a, b, -1);
    }

    private static int[][] combine(int[][] a, int[][] b, int sign) {
        int columns = width(a);
        if (columns == 0 || columns != width(b) || a.length != b.length) {
            return null;
        }
        int[][] result = new int[a.length][columns];
        // Combine corresponding entries using sign to add or subtract.
        return result;
    }

    private static int width(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int columns = matrix[0].length;
        for (int[] row : matrix) {
            if (row.length != columns) {
                return 0;
            }
        }
        return columns;
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
