public class MergeSort {

    public int[] mergeSort(int[] array) {
        // Return a sorted result without modifying the input.
        throw new UnsupportedOperationException("Implement the split and sort first.");
    }

    public int[] merge(int[] left, int[] right) {

        int[] merged = new int[left.length + right.length];
        int numLeft = 0;   //number of items added from "left"
        int numRight = 0;  //number of items added from "right"
        int numMerged = 0; //number of items added to "merged"

        // compare the next items in both lists
        // add the smaller of the two
        while (numLeft < left.length && numRight < right.length) {
            if (left[numLeft] <= right[numRight]) {
                merged[numMerged] = left[numLeft];
                numLeft++;
            } else {
                merged[numMerged] = right[numRight];
                numRight++;
            }
            numMerged++;
        }

        // add the rest of "left"
        while (numLeft < left.length) {
            merged[numMerged] = left[numLeft];
            numLeft++;
            numMerged++;
        }

        // add the rest of "right"
        while (numRight < right.length) {
            merged[numMerged] = right[numRight];
            numRight++;
            numMerged++;
        }
        return merged;
    }
}
