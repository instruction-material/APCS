public class Main {
    public static void main(String[] args) {
        show(new int[] {3, 1, 2, 1});
        show(new int[] {1, 2, 3});
        show(new int[] {4, 3, 2, 1});
        show(new int[0]);
    }

    public static long pairCount(int[] values) {
        long count = 0;
        // TODO: Check every earlier/later pair once.
        return count;
    }

    public static long insertionSortInversions(int[] values) {
        long count = 0;
        for (int i = 1; i < values.length; i++) {
            int saved = values[i];
            int spot = i;
            while (spot > 0 && values[spot - 1] > saved) {
                values[spot] = values[spot - 1];
                spot--;
                count++;
            }
            values[spot] = saved;
        }
        return count;
    }

    public static long mergeSortInversions(int[] values) {
        return sort(values, new int[values.length], 0, values.length);
    }

    private static long sort(int[] values, int[] scratch, int start, int end) {
        if (end - start < 2) {
            return 0;
        }
        int mid = start + (end - start) / 2;
        long count = sort(values, scratch, start, mid);
        count += sort(values, scratch, mid, end);
        int left = start;
        int right = mid;
        for (int i = start; i < end; i++) {
            if (right == end || (left < mid && values[left] <= values[right])) {
                scratch[i] = values[left];
                left++;
            } else {
                scratch[i] = values[right];
                right++;
                // TODO: Count the remaining left values passed by this right value.
            }
        }
        for (int i = start; i < end; i++) {
            values[i] = scratch[i];
        }
        return count;
    }

    private static int[] copy(int[] values) {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i];
        }
        return result;
    }

    private static void show(int[] values) {
        int[] insertion = copy(values);
        int[] merge = copy(values);
        System.out.println("Pairs: " + pairCount(values));
        System.out.println("Shifts: " + insertionSortInversions(insertion));
        System.out.println("Merge: " + mergeSortInversions(merge));
    }
}
