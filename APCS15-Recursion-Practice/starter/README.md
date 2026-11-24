# Recursion practice starter

Run `javac Main.java && java Main`. The supplied example prints a length of 11. Trace the call for `"cat"` through the empty string, then trace the values that return.

Implement one method at a time. Add calls in `main` to check the smallest valid input, a typical input, and a boundary.

| Method | Input and expected result |
| --- | --- |
| `factorial` | `0 → 1`, `5 → 120`. Accept integers 0 through 12 to stay within `int`. |
| `exponent` | `(2, 0) → 1`, `(2, 8) → 256`, `(-2, 3) → -8`. Use nonnegative powers and results that fit within `int`. |
| `fibonacci` | `1 → 1`, `2 → 1`, `8 → 21`. Use one-based indices from 1 through 20. |
| `lucas` | `1 → 2`, `2 → 1`, `8 → 29`. Use one-based indices from 1 through 20. |
| `cascadeForward` | For `"cat"`, print `c`, `ca`, and `cat` on successive lines. |
| `cascadeBackward` | For `"cat"`, print `cat`, `ca`, and `c` on successive lines. An empty word prints no lines in either cascade. |
| `log` | `(2, 1) → 0`, `(2, 256) → 8`, `(2, 3) → -1`. Return −1 unless the target is an exact power of an integer base of at least 2. |
| `gcd` | `(456, 342) → 114`, `(9, 0) → 9`. Use nonnegative integers and define `gcd(0, 0)` as 0 for this exercise. |

For a cascade, draw where the print runs relative to the recursive call. For the two sequences, count how often the same argument appears in the call tree before comparing with an iterative version.
