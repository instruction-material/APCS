public class Main {
    public static void main(String[] args) {
        int[] sorted = {-6, -1, 2, 2, 5, 9, 14};
        checkTrace(-6, sorted);
        checkTrace(2, sorted);
        checkTrace(14, sorted);
        checkTrace(7, sorted);
        checkTrace(7, new int[0]);
    }

    private static void checkTrace(int target, int[] data) {
        boolean found = binaryRecursive(target, data, 0, data.length - 1);
        System.out.println("target " + target + " => " + found);
    }

    public static boolean binaryRecursive(int target, int[] data, int lo, int hi) {
        if (lo > hi) {
            return false;
        }
        int mid = lo + (hi - lo) / 2;
        if (data[mid] == target) {
            return true;
        }
        if (target < data[mid]) {
            return binaryRecursive(target, data, lo, mid - 1);
        }
        return binaryRecursive(target, data, mid + 1, hi);
    }

    public static boolean binaryIterative(int target, int[] data) {
        // Optional Java practice: update the inclusive bounds in a loop.
        throw new UnsupportedOperationException("Complete the optional loop first.");
    }
}
