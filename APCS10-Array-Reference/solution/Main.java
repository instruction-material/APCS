public class Main {
    public static void main(String[] args) {
        int[] original = new int[5];
        System.out.println("First default: " + original[0]);
        System.out.println("Length: " + original.length);
        for (int index = 0; index < original.length; index++) {
            original[index] = index;
        }
        System.out.println("Last index: " + (original.length - 1));
        System.out.println("Before: " + values(original));
        square(original);
        System.out.println("After square: " + values(original));
        replaceLocally(original);
        System.out.println("After rebinding: " + values(original));
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int total = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                total += value;
            }
        }
        System.out.println("Grid sum: " + total);
    }

    static void square(int[] input) {
        for (int index = 0; index < input.length; index++) {
            input[index] *= input[index];
        }
    }

    static void replaceLocally(int[] input) {
        input = new int[] {42};
        System.out.println("New local first: " + input[0]);
    }

    static String values(int[] sequence) {
        String line = "";
        int index = 0;
        while (index < sequence.length) {
            line += sequence[index] + " ";
            index++;
        }
        return line.trim();
    }
}
