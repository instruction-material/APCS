# Insertion Sort

Keep a sorted prefix. Hold the next value, shift larger values one position right, and insert the saved value into the gap. Track how many shifts each input takes.

Complete the TODOs before comparing results with the checks. Compile with `javac Main.java`, then run `java Main` using JDK 17 or later.

`[1, 3, 2, 4]` takes one shift. `[4, 3, 2, 1]` takes six shifts. `[3, -1, 3, 0]` becomes `[-1, 0, 3, 3]` with three shifts. An already sorted, singleton, or empty array takes zero shifts.
