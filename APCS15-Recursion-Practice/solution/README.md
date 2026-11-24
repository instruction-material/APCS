# Recursion practice reference

Run `javac Main.java && java Main`. The power example prints 256, the exact base-2 logarithm prints 8, and the greatest common divisor prints 114.

String length and the forward cascade do their work after the smaller call returns. The backward cascade prints before the smaller call. Exact logarithm counts divisions and rejects a remainder, and the GCD base case handles a zero second argument before taking a remainder.

The input domains and comparison cases are listed in the exercise guide.
