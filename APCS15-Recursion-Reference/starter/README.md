# Recursion reference starter

Run `javac Main.java && java Main`. Before running, trace the example in a table with one row per call. Include the index, current word, and when the call prints or returns.

The period stops recursion. The starter prints `fern` and then `red`. It never prints the period or later words. Check these examples by changing the word array:

- `{"."}` prints nothing.
- `{"oak", "elm"}` prints `elm` and then `oak`. An index equal to the array length also stops the calls.
- An empty array prints nothing. The length check runs before any array access.

As an optional exercise, move the print line above the recursive call, predict the new order, and run it again.
