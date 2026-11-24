# Binary search trace starter

For each target, record the range, midpoint, value, and decision before running the project. Use inclusive bounds from zero to the final index. An empty range reports `false` before reading an array element.

| Sorted data | Target | Expected result after tracing |
| --- | --- | --- |
| `[-6, -1, 2, 2, 5, 9, 14]` | `-6`, `2`, `14` | `true` for each |
| `[-6, -1, 2, 2, 5, 9, 14]` | `7` | `false` |
| `[]` | `7` | `false` |

Use Run in the course Java IDE or run `javac Main.java && java Main` from this folder. The required trace runs as supplied. In the optional Java extension, complete `binaryIterative`, call it with the same inputs, and compare both methods. Trace the existing recursive version before opening the reference.
