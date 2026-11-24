# Decode Tower Messages

Model two towers exchanging a message in memory. Shift only ASCII A–Z and a–z, within their own alphabets. Copy all other characters. Return new Message objects so transmitting and receiving do not alter earlier messages. Normalize shifts modulo 26.

Complete the marked tasks before comparing with the reference.

Compile with `javac Main.java Message.java Tower.java` on JDK 17 or later, then run `java Main`.

## Checks

For key 5, Az za! 2 encodes as Fe ef! 2. A receiver with key 5 restores the original. Key 2 produces Dc cd! 2. Keys that differ by a multiple of 26 have the same effect. This letter-shift exercise does not provide security.
