# Data Collections Check

Implement `removeShortLabels` to delete strings shorter than a given length while preserving the remaining order. Implement `countPositive` to count strictly positive entries in a rectangular integer grid without modifying it.

Compare the reference against the prompt and explain each result.

Use JDK 17 or later. Compile with `javac Main.java`, then run `java Main`.

## Checks

`[desk, ox, i, shelf]` with a minimum length of three becomes `[desk, shelf]`. Adjacent matches must both be removed. The rows `[0, 3, -1]` and `[2, -3, 5]` contain three positive entries. An empty structure gives zero changes or counts.
