# Farm Class

Model one day on a farm. Each Farm instance tracks its own cow and goat counts and three flags for chores. Animals start unfed and the cows start unmilked. Constructor counts must be nonnegative.

Use feedCows as the pattern for feedGoats. A feeding or milking succeeds once for a nonempty herd. A sale succeeds whenever at least one animal of that species remains. On failure return false and preserve every field. On success update only the relevant field and return true. In this model milk applies to cows.

Run `javac Main.java Farm.java` followed by `java Main`. With one goat, predict the results of two feedings and two sales. Each pair should give true then false. A second farm should still have its original goat and feeding flag. Add a check for milking a farm with zero cows.
