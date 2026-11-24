# Rounding it off starter

Run `javac Main.java && java Main`, then enter the example input in the console.

Use the supplied cast for rounding down. For rounding up, keep the cast value when it already equals the input and add one when the input has a fraction. To round to the nearest multiple, divide by the step, add 0.5, cast, then multiply by the step.

Use amounts from 0 through 999999. For `27.5`, down and up are 27 and 28, and the nearest 1, 10, and 100 are 28, 30, and 0. For `30.0`, both down and up equal 30. Test `5.0` and `50.0` at the nearest-ten and nearest-hundred ties.
