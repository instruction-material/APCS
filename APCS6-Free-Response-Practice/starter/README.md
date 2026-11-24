# Methods Practice: Calendar

Use the three supplied date helpers. `numberOfLeapYears(first, last)` counts leap years in the inclusive ordered range. `dayOfWeek(month, day, year)` returns 0 for Sunday through 6 for Saturday for a valid Gregorian date. Use years 1 through 9999. The first day of a year has ordinal 1.

Attempt the prompt before comparing with the reference.

Use JDK 17 or later. Compile with `javac Main.java APCalendar.java`, then run `java Main`.

## Checks

The range 1999 through 2004 contains two leap years, 2000 and 2004. The range 1900 through 1900 contains none. January 1 and February 29 of 2024 give 1 and 4. Verify the Saturday-to-Sunday transition as well.
