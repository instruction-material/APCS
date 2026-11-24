# Runtime analysis

Count executions of `count++` in each method, including the increment after the inner loop in f6. Use the six calls in Main. For each call record the input, predicted count, actual count, and growth rate. Then double one input at a time and explain which counts double, which quadruple, and which rise by one.

Run the project in the Java IDE or use `javac Main.java` followed by `java Main` with JDK 17 or later. Use small, nonnegative inputs so the counters fit in an int. For f4, trace the integer values before and after division until the loop reaches zero.

| Call | Count | Reason |
| --- | --- | --- |
| f1(10) | 20 | The loop runs 2n times, linear in n. |
| f2(10) | 100 | Each of n outer passes triggers n inner passes, quadratic in n. |
| f3(3, 7) | 21 | The dimensions are independent, giving n times m. |
| f4(128) | 8 | Seven halvings reach 1 and one more reaches 0. A positive n takes floor(log2(n)) + 1 passes. Zero takes none. |
| f5(four values) | 16 | All ordered index pairs are counted, including each index paired with itself. |
| f6(four values) | 10 | The four passes contribute 1, 2, 3, and 4. For n elements the count is n(n + 1)/2, quadratic in n. |
