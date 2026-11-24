public class Main {
    public static void main(String[] args) {
        int[] mixed = {7, 2, 7, 1};
        int[] sorted = {-3, 0, 4, 4, 9};
        System.out.println("Front: " + linearSearch(mixed, 7));
        System.out.println("End: " + linearSearch(mixed, 1));
        System.out.println("Absent: " + linearSearch(mixed, 9));
        System.out.println("Sorted gap: " + linearSearchSorted(sorted, 2));
        System.out.println("Sorted duplicate: " + linearSearchSorted(sorted, 4));
        System.out.println("Empty: " + linearSearchSorted(new int[0], 4));
    }

    public static boolean linearSearch(int[] array, int target) {
        // TODO: Check values until the target is found or the loop ends.
        return false;
    }

    public static boolean linearSearchSorted(int[] array, int target) {
        // TODO: Find the target or stop when sorted order rules it out.
        return false;
    }
}
