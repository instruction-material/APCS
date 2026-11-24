# Binary search reference

Both methods require ascending data. The recursive method accepts inclusive bounds and checks for an empty range before indexing. Each unsuccessful comparison excludes the midpoint and selects one smaller range. Duplicate values are valid because the result asks whether the target is present.

Use Run in the course Java IDE or run `javac Main.java && java Main` from this folder. The reference checks agreement on the same first, middle, last, missing, and empty inputs as the starter.
