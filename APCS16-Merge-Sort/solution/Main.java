import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();
        int[] left = {-3, 4, 4};
        int[] right = {-1, 2, 8};
        System.out.println("Merged: " + Arrays.toString(sorter.merge(left, right)));
        int[] input = {12, 4, -3, 4, 0};
        System.out.println("Sorted: " + Arrays.toString(sorter.mergeSort(input)));
    }
}
