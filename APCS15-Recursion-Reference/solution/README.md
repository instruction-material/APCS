# Recursion reference walkthrough

Run `javac Main.java && java Main`. The first method prints `fern` and then `red` as calls return. The second prints `red` and then `fern` as calls begin.

Both methods stop when the index reaches the array length or the current word is a period. The first condition is checked before the array is read. With neither a word nor a recursive call at the base case, it prints nothing. Each earlier call still has its original index when control returns.
