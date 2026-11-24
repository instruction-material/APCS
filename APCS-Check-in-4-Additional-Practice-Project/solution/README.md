# Counting Inversions

An inversion is a pair of positions where the earlier value is greater than the later value. Compare pair counting, insertion sort shifts, and merge sort. Count an entire remaining left segment when a smaller right value is selected. Keep equal values out of the count.

Run the examples and explain the result from the implementation.

Compile with `javac Main.java` on JDK 17 or later, then run `java Main`.

## Checks

All methods should return 4 for [3, 1, 2, 1] and 6 for [4, 3, 2, 1]. Empty, sorted and all-equal arrays give zero. Pair counting leaves its input alone. The sorting methods leave their arrays in ascending order.
