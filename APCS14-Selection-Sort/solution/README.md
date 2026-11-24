# Selection sort reference

Run `javac *.java && java Main`.

Sort a list in ascending order by placing the smallest remaining value at the next position. Each completed pass extends the sorted prefix.

For [5, -1, 2, -1, 0], select the first -1 at index 1 for position 0. The sorted result is [-1, -1, 0, 2, 5]. Verify an empty list, a single item, duplicates, and both sorted and reverse-sorted inputs. A list of five values takes 4 + 3 + 2 + 1 comparisons.
