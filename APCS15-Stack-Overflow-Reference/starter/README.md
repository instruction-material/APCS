# Tracing a Recursive Base Case

The goal is a line of dashes followed by Done for lengths from 0 through 20. Trace the first four inputs an incorrect recursive call would visit if it increased the input. The demonstration records these inputs with a loop and never runs the unbounded recursion.

Complete the marked tasks before comparing with the reference.

Compile with `javac Main.java` on JDK 17 or later, then run `java Main`.

## Checks

The incorrect trace from 3 is 3, 4, 5, 6 and moves away from zero. The repaired calls visit 3, 2, 1, 0 and produce ---Done. Length 0 prints Done. Length 21 is outside the exercise range. Explain how depth differs from failure to make progress.
