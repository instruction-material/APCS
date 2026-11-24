# Class Creation Check

Complete `SupplyBin` with a positive fixed capacity and a starting quantity from zero through capacity. Put state in private fields. `add` and `take` accept positive amounts only. A request returns true if it succeeds and false if the bin would exceed capacity or fall below zero.

Compare the reference against the prompt and explain each result.

Use JDK 17 or later. Compile with `javac Main.java SupplyBin.java`, then run `java Main`.

## Checks

A capacity of five and a starting quantity of two allow adding three. Reject one more without changing quantity. Taking four leaves one. An alias to the same object sees the change. An independently constructed bin still has two.
