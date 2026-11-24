# Casting reference worked reference

Run `javac Main.java && java Main`.

Integer division produces 1. Casting the numerator first produces 1.5. Casting the already-computed quotient produces 1.0 on a native JDK. Casting -2.75 to `int` gives -2 because conversion discards the fractional part toward zero. The site IDE preview can display 1.0 as 1.
