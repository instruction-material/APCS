# Robust input practice

Read tokens in order for four tasks. Divide two integers, print the third character of a word, select a character from "Juni Learning" by zero-based index, and count between two integers including both endpoints.

RobustScanner skips malformed numeric tokens. Add checks in Main for a zero divisor, a word shorter than three characters, and an index outside the message. Request a replacement for the same field each time. End of input finishes the session.

Compile with JDK 17 or later using `javac Main.java RobustScanner.java` and run `java Main`.

- With `8 2 maple 0 3 1`, the results are 4, p, J, then 3, 2, 1.
- With `oops 8 0 2 x maple -1 0 3 3`, the completed program recovers and gives 4, p, J, then a single 3.
- End the input before any prompt or after a malformed token. The program prints "End of input." and exits.
