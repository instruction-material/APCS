# Merge sort reference

Run `javac Main.java MergeSort.java && java Main`. The program prints a merge of two sorted arrays, then the original exercise array in sorted order.

The sort copies both halves before recursion. Merge reads the next value on each side, advances the index for the value it takes, then copies the remaining tail. Both copies preserve repeated values and leave the input unchanged.
