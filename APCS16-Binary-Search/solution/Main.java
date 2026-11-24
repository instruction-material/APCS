public class Main {
    public static void main(String[] args) {
        int[] sorted = {-6, -1, 2, 2, 5, 9, 14};
        compare(-6, sorted);
        compare(2, sorted);
        compare(14, sorted);
        compare(7, sorted);
        compare(7, new int[0]);
    }

    private static void compare(int target, int[] data) {
        boolean recursive = binaryRecursive(target, data, 0, data.length - 1);
        boolean iterative = binaryIterative(target, data);
        if (recursive != iterative) {
            throw new IllegalStateException("Search versions disagree for " + target);
        }
        System.out.println("target " + target + " => " + recursive);
    }

    public static boolean binaryIterative(int target, int[] data) {
        int lo = 0;
        int hi = data.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (data[mid] == target) {
                return true;
            }
            if (target < data[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;
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
}
