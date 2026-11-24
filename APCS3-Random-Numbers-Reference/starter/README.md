# Random numbers reference starter

Run `javac Main.java && java Main`.

The driver supplies two predictable draws so the limits are easy to trace. Work out why the number of possible values is high minus low plus one. Then add a call with Math.random() as the draw.

The first example produces 0 and the second produces 10. For 99 through 199 there are 101 outcomes. A draw of 0 gives 99, and 0.9999 gives 199. Never cast before scaling.
