# Tracing Recursion

For each call in Main, write the current argument, the next call, and what happens after that call returns. Predict the output before running the starter. Use the comments in the solution to check the trace.

1. Trace f1(4) down to 1 and add the saved arguments while returning.
2. Trace f2(3). Each call prints its argument. Even values halve, odd values triple and add one. Count transitions separately from the number of printed values. Use the supplied small examples 1, 2, and 3 for this exercise.
3. Trace f3("fern"). Each frame prints one character after its recursive call returns. Try the empty string.
4. Trace f4(15678). Each call reduces a nonnegative integer to its digit sum until one digit remains, then tests divisibility by three. Compare 10 and 0.

Check: the sum is 10. The second trace visits 3, 10, 5, 16, 8, 4, 2, 1 and returns 7. The third prints nref. The final call follows 15678 to 27 to 9 and returns true.
