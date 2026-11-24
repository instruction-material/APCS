# Class Design Practice: Step Tracker

Track days with at least a constructor-supplied minimum number of steps. `addDailySteps` records one nonnegative daily count, `totalDaysActive` returns the qualifying day count, and `averageSteps` returns the average over all recorded days or 0.0 before any entry.

Attempt the prompt before comparing with the reference.

Use JDK 17 or later. Compile with `javac Main.java StepTracker.java`, then run `java Main`.

## Checks

With a threshold of 100, the daily values 90, 100 and 114 produce two active days and an average of 304/3. An independent tracker stays empty. Use floating division instead of truncating the average.
